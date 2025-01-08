/*
 * Copyright 2023 Peter Hirzel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package swiss.opentransportdata.ojp.adapter;

import static org.springframework.http.MediaType.APPLICATION_XML;
import static org.springframework.web.reactive.function.BodyInserters.fromValue;

import de.vdv.ojp.release2.model.GeoCircleStructure;
import de.vdv.ojp.release2.model.GeoRestrictionsStructure;
import de.vdv.ojp.release2.model.InitialLocationInputStructure;
import de.vdv.ojp.release2.model.InternationalTextStructure;
import de.vdv.ojp.release2.model.OJP;
import de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.release2.model.OJPStopEventDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripInfoDeliveryStructure;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAccessor;
import swiss.opentransportdata.ojp.adapter.converter.OJPFactory;
import uk.org.siri.siri.AbstractServiceDeliveryStructure;
import uk.org.siri.siri.LocationStructure;

/**
 * Making access to OJP v1.x XML API easier.
 * <p>
 * Design pattern "Adapter": This is a special object that converts the interface of one object so that another object can understand it.
 * <p>
 * Raw support of OJP JAXB POJOs.
 * <p>
 * SKI+ provided 2 instances of OJP:
 * <ul>
 *     <li>passive instance: rather Swiss national</li>
 *     <li>active instance: extended version with international OJP delegation, therefore more strictly validated than passive instance</li>
 * </ul>
 *
 * @author Peter Hirzel
 * @see <a href="https://opentransportdata.swiss/de/cookbook/verwendung-der-api/">Verwenden der OJP API</a>
 * @see <a href="https://opentransportdata.swiss/de/cookbook/open-journey-planner-ojp/#Wichtige_Konzepte">OJP Cookbook</a>
 * @see <a href="https://github.com/skinkie/ojp-example">Stefan de Konink repos (part of SBB OJP consultants)</a>
 */
@Slf4j
@Component
public class OJPAdapter {

    public static final String NOTICE_ATTRIBUTE_PREFIX = "A__";
    public static final String OJP_IDENTIFIER = "ojp";
    public static final String OJP_NAMESPACE = OJP_IDENTIFIER + ":";
    public static final String STOP_REF_HINT = "OJP passive instance requires Stop UIC like '850700' whereas active instance enforces 'OJP:STOP:SBB:8507000|Bern'.";
    /**
     * OJP active instance relevant, like "OJP:STOP:SBB:8503308|Kloten" (where classic UIC could be extracted).
     */
    public static final String OJP_STOPPLACE_ID_PREFIX = "OJP:STOP:";

    /**
     * Standard header.
     */
    private static final String HEADER_REQUEST_ID = "Request-ID";

    private final WebClient webClient;
    // internal friend
    @Getter
    private final OJPFactory ojpFactory;
    private final JAXBContext ojpJaxbContext;
    private final String callerReference;

    /**
     * Some OJP Strings have a Router-System specific prefix, which might be unwanted for end-user or better readability.
     *
     * @param prefixedValue
     * @return given value without {@link #OJP_NAMESPACE}
     */
    public static String removeOjpPrefix(String prefixedValue) {
        return prefixedValue == null ? null : prefixedValue.replace(OJP_NAMESPACE, StringUtils.EMPTY);
    }

    /**
     * Since this assistant focuses one query per HTTP-request, there is always 1 matching response object.
     * <p>
     * (OJP could also treat multi-queries in one HTTP-request.)
     *
     * @param abstractServiceDeliveryStructures
     * @return specific delivery structure related to request-query (might still contain specific error)
     * @throws OJPException
     */
    private static AbstractServiceDeliveryStructure extractFirstDeliveryStructure(
        List<JAXBElement<? extends AbstractServiceDeliveryStructure>> abstractServiceDeliveryStructures) throws OJPException {

        final AbstractServiceDeliveryStructure firstDeliveryStructure = abstractServiceDeliveryStructures.getFirst().getValue();
        if (firstDeliveryStructure == null) {
            // unexpected
            throw new OJPException("AbstractServiceDeliveryStructure is null");
        }

        return firstDeliveryStructure;
    }

    /**
     * @param ojpResponse returned properly by an OJP request
     * @return first data-object of interest
     * @see #requestPlaces(OJPAccessor, PlaceRequestFilter)
     */
    public static OJPLocationInformationDeliveryStructure mapToFirstOJPLocationInformationDeliveryStructure(OJP ojpResponse) {
        final AbstractServiceDeliveryStructure deliveryStructure = extractFirstDeliveryStructure(
            ojpResponse.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery());

        if (hasFailure(deliveryStructure)) {
            if ((deliveryStructure.getErrorCondition() != null) && "LOCATION_NORESULTS".equals(deliveryStructure.getErrorCondition().getDescription().getValue())) {
                log.debug("no hits");
            } else {
                // TODO examine further Error-Conditions for 400, 404, .. with this specific query resp. OJP specific error codes
                throw new OJPException("Specific AbstractServiceDeliveryStructure::status=false " + deliveryStructure);
            }
        }

        return (OJPLocationInformationDeliveryStructure) deliveryStructure;
    }

    /**
     * @param ojpResponse returned properly by an OJP request
     * @return first data-object of interest
     * @see #requestTripLegByJourneyReference(OJPAccessor, TripLegRequestFilter)
     */
    public static OJPTripInfoDeliveryStructure mapToFirstOJPTripInfoDeliveryStructure(OJP ojpResponse) {
        final AbstractServiceDeliveryStructure deliveryStructure = extractFirstDeliveryStructure(
            ojpResponse.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery());

        if (hasFailure(deliveryStructure)) {
            // TODO examine further Error-Conditions for 400, 404, .. with this specific query resp. OJP specific error codes
            throw new OJPException("Specific AbstractServiceDeliveryStructure::status=false " + deliveryStructure);
        }

        return (OJPTripInfoDeliveryStructure) deliveryStructure;
    }

    /**
     * @param ojpResponse returned properly by an OJP request
     * @return first data-object of interest
     * @see #requestTrips(OJPAccessor, TripRequestFilter)
     */
    public static OJPTripDeliveryStructure mapToFirstOJPTripDeliveryStructure(OJP ojpResponse) {
        final AbstractServiceDeliveryStructure deliveryStructure = extractFirstDeliveryStructure(
            ojpResponse.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery());

        if (hasFailure(deliveryStructure)) {
            if ((deliveryStructure.getErrorCondition() != null) && (deliveryStructure.getErrorCondition().getDescription() != null)
                && "TRIP_NOTRIPFOUND".equals(deliveryStructure.getErrorCondition().getDescription().getValue())) {
                log.debug("no hits");
            } else {
                // TODO examine further Error-Conditions for 400, 404, .. with this specific query resp. OJP specific error codes
                throw new OJPException("Specific AbstractServiceDeliveryStructure::status=false " + deliveryStructure);
            }
        }

        return (OJPTripDeliveryStructure) deliveryStructure;
    }

    /**
     * @param ojpResponse returned properly by an OJP request
     * @return first data-object of interest
     * @see #requestStopEvent(OJPAccessor, StopEventRequestFilter)
     */
    public static OJPStopEventDeliveryStructure mapToFirstOJPStopEventDeliveryStructure(OJP ojpResponse) {
        final AbstractServiceDeliveryStructure deliveryStructure = extractFirstDeliveryStructure(
            ojpResponse.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery());

        if (hasFailure(deliveryStructure)) {
            if ((deliveryStructure.getErrorCondition() != null) && (deliveryStructure.getErrorCondition().getDescription() != null)
                && "STOPEVENT_LOCATIONUNSERVED".equals(deliveryStructure.getErrorCondition().getDescription().getValue())) {
                throw new OJPException(STOP_REF_HINT + " -> " + deliveryStructure.getErrorCondition().getDescription().getValue());
            } else {
                // TODO examine further Error-Conditions for 400, 404, .. with this specific query resp. OJP specific error codes
                throw new OJPException("Specific AbstractServiceDeliveryStructure::status=false " + deliveryStructure);
            }
        }

        return (OJPStopEventDeliveryStructure) deliveryStructure;
    }

    /**
     * OJP signals potential errors by status and/or errorCondition.
     *
     * @param deliveryStructure part of OJP response
     * @return deliveryStructure::isStatus is not ok (if false further examination by caller needs to be done!)
     */
    private static boolean hasFailure(AbstractServiceDeliveryStructure deliveryStructure) {
        if (Boolean.TRUE.equals(deliveryStructure.isStatus())) {
            if (deliveryStructure.getErrorCondition() != null) {
                // by experience: like a 400 Bad Parameter (by means a value does not please OJP and passive/active instance may behave differently)
                throw new OJPException("Specific AbstractServiceDeliveryStructure::status=true, ::errorCondition BAD: " + deliveryStructure);
            }

            // proper delivery object is given, but may still contain "errors" to deal with
            return !deliveryStructure.isStatus();
        }

        return false;
    }

    public static String getText(InternationalTextStructure internationalTextStructure) {
        if ((internationalTextStructure == null) || CollectionUtils.isEmpty(internationalTextStructure.getText())) {
            return null;
        }
        if (internationalTextStructure.getText().size() > 1) {
            //TODO what is the expected one?
            log.warn("InternationalTextStructure::text has multiple entries -> fallback first={}", internationalTextStructure.getText());
        }
        if (StringUtils.isBlank(internationalTextStructure.getText().getFirst().getValue())) {
            log.warn("InternationalTextStructure::text[0] empty: {}", internationalTextStructure.getText().getFirst());
            return null;
        }

        return internationalTextStructure.getText().getFirst().getValue().trim();
    }

    /**
     * Instantiate an OJPAdapter.
     *
     * @param webClient to perform XML requests against configured OJP instance.
     * @param callerReference just a "Request-ID" prefix (monitoring hint)
     */
    public OJPAdapter(@NonNull WebClient webClient, @NonNull String callerReference) {
        this.webClient = webClient;
        this.ojpFactory = new OJPFactory(callerReference);
        this.callerReference = callerReference;

        try {
            ojpJaxbContext = JAXBContext.newInstance(OJP.class);
        } catch (JAXBException ex) {
            throw new OJPException("JAXBContext could not be initialized", ex);
        }
    }

    /**
     * Perform an OJP "LocationInformationRequest" with a single query. Extract response by {@link #mapToFirstOJPLocationInformationDeliveryStructure(OJP)}.
     *
     * @param ojpAccessor configuration to access OJP
     * @param filter request/search parameters
     * @return OJP response (might still contain specific error)
     * @throws OJPException
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojplocationinformationrequest/>OJP LocationInformationRequest
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#StopPlaceRef>OJP StopPlaceRef</a>
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#AddressRefStructure">OJP AddressRefStructure</a>
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#PointOfInterestRefStructure">OJP PointOfInterestStructure</a>
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TopographicPlaceStructure">OJP TopographicPlaceStructure</a>
     */
    @NonNull
    public OJP requestPlaces(@NonNull OJPAccessor ojpAccessor, @NonNull PlaceRequestFilter filter) throws OJPException {
        if (StringUtils.isBlank(filter.getPlaceName()) && (filter.getCentroid() == null)) {
            throw new IllegalArgumentException("Either placeName and/or centroid must be set.");
        }

        try {
            final InitialLocationInputStructure initialLocationInputStructure = new InitialLocationInputStructure();
            initialLocationInputStructure.setName(filter.getPlaceName());
            if (filter.getCentroid() != null) {
                final LocationStructure locationStructure = new LocationStructure();
                locationStructure.setLongitude(BigDecimal.valueOf(filter.getCentroid().getLongitude()));
                locationStructure.setLatitude(BigDecimal.valueOf(filter.getCentroid().getLatitude()));
                initialLocationInputStructure.setGeoPosition(locationStructure);
                if (filter.getRadius() != null) {
                    if (filter.getRadius() < 1) {
                        throw new IllegalArgumentException("radius must be > 0");
                    }
                    final GeoCircleStructure geoCircleStructure = new GeoCircleStructure();
                    geoCircleStructure.setCenter(locationStructure);
                    geoCircleStructure.setRadius(BigInteger.valueOf(filter.getRadius()));
                    final GeoRestrictionsStructure geoRestrictionsStructure = new GeoRestrictionsStructure();
                    // alternatively possible: Area or Rectangle
                    geoRestrictionsStructure.setCircle(geoCircleStructure);
                    initialLocationInputStructure.setGeoRestriction(geoRestrictionsStructure);
                }
            }
            final OJP ojpRequest = ojpFactory.createOjpWithLocationInformationRequest(initialLocationInputStructure, filter);
            return request2(ojpAccessor, ojpRequest);
        } catch (WebClientResponseException ex) {
            throw new OJPException("OJP(" + ojpAccessor.getEndpoint() + ") LocationInformation request failed" + ex.getMessage(), ex);
        } catch (Exception ex) {
            throw new OJPException("OJP(" + ojpAccessor.getEndpoint() + ") LocationInformation mapping failed", ex);
        }
    }

    /**
     * Perform OJP "TripRequest" with a single query. Extract response by {@link #mapToFirstOJPTripDeliveryStructure(OJP)}.
     *
     * @param ojpAccessor configuration to access OJP
     * @param filter request/search parameters
     * @return OJP response (might still contain specific error)
     * @throws OJPException
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojptriprequest/>OJP TripRequest</a>
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#OJPTripInfoRequest">OJP TripInforRequest</a>
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#OJPTripInfoDeliveryStructure">OJP TripInforDeliveryStructure</a>
     */
    @NonNull
    public OJP requestTrips(@NonNull OJPAccessor ojpAccessor, @NonNull TripRequestFilter filter) throws OJPException {
        try {
            final OJP ojpRequest = ojpFactory.createOjpWithTripRequest(filter);
            return request2(ojpAccessor, ojpRequest);
        } catch (WebClientResponseException ex) {
            throw new OJPException("OJP(" + ojpAccessor.getEndpoint() + ") Trip request failed", ex);
        } catch (Exception ex) {
            throw new OJPException("OJP(" + ojpAccessor.getEndpoint() + ") Trip mapping failed", ex);
        }
    }

    /**
     * Perform OJP "TripInfoRequest" with a single query. Extract response by {@link #mapToFirstOJPTripInfoDeliveryStructure(OJP)}.
     *
     * @param ojpAccessor configuration to access OJP
     * @param filter request/search parameters
     * @return OJP response (might still contain specific error)
     * @throws OJPException
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojptripinforequest/>OJP TripInfoRequest</a>
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TripInfoRequestGroup">OJP TripInfoRequest</a>
     */
    @NonNull
    public OJP requestTripLegByJourneyReference(@NonNull OJPAccessor ojpAccessor, @NonNull TripLegRequestFilter filter) throws OJPException {
        try {
            final OJP ojpRequest = ojpFactory.createOjpWithTripInfoRequest(filter);
            return request2(ojpAccessor, ojpRequest);
        } catch (WebClientResponseException ex) {
            throw new OJPException("OJP(" + ojpAccessor.getEndpoint() + ", journeyReference=" + filter.getJourneyReference() + ") TripInfo request failed", ex);
        } catch (Exception ex) {
            throw new OJPException("OJP(" + ojpAccessor.getEndpoint() + ", journeyReference=" + filter.getJourneyReference() + ") TripInfo mapping failed", ex);
        }
    }

    /**
     * Perform OJP "StopEventRequest" with a single query. Extract response by {@link #mapToFirstOJPStopEventDeliveryStructure(OJP)}.
     * <p>
     * StopEvent de:Service dient dazu, einen Abfahrts- oder Ankunftsmonitor zu konstruieren.
     *
     * @param ojpAccessor configuration to access OJP
     * @param filter request/search parameters
     * @return OJP response (might still contain specific error)
     * @throws OJPException
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojpstopeventrequest/">StopEventRequest</a>
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#OJPStopEventRequest>OJP StopEventRequest</a>
     */
    @NonNull
    public OJP requestStopEvent(@NonNull OJPAccessor ojpAccessor, @NonNull StopEventRequestFilter filter) throws OJPException {
        try {
            final OJP ojpRequest = ojpFactory.createOjpWithStopEventRequest(filter);
            return request2(ojpAccessor, ojpRequest);
        } catch (WebClientResponseException ex) {
            throw new OJPException("OJP(" + ojpAccessor.getEndpoint() + ") StopEvent request failed" + ex.getMessage(), ex);
        } catch (Exception ex) {
            throw new OJPException("OJP(" + ojpAccessor.getEndpoint() + ") StopEvent mapping failed", ex);
        }
    }

    /**
     * Perform a concrete OJP call.
     *
     * @param ojpAccessor configuration to access OJP
     * @param ojpRequest OJP body
     * @return OJP response (might still contain specific error)
     */
    private OJP request2(OJPAccessor ojpAccessor, OJP ojpRequest) {
        final String body = marshalRequest(ojpRequest);

        log.debug("POST {}, body={}", ojpAccessor.getEndpoint(), body);
        final String response = webClient.post()
            .uri(ojpAccessor.getEndpoint())
            .contentType(APPLICATION_XML)
            .body(fromValue(marshalRequest(ojpRequest)))
            .headers(headers -> headers.addAll(createOjpHeaders(ojpAccessor)))
            .retrieve()
            .bodyToMono(String.class)
            .blockOptional()
            .orElseThrow();

        return unmarshalBody(response);
    }

    private HttpHeaders createOjpHeaders(OJPAccessor ojpAccessor) {
        final HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_XML_VALUE);
        headers.add(HttpHeaders.AUTHORIZATION, ojpAccessor.getToken());
        headers.add(HEADER_REQUEST_ID, callerReference + (StringUtils.isBlank(ojpAccessor.getRequestId()) ? StringUtils.EMPTY : "_" + ojpAccessor.getRequestId()));
        return headers;
    }

    // by JAXB serialization
    private String marshalRequest(Object ojpRequest) {
        try {
            final StringWriter writer = new StringWriter();
            ojpJaxbContext.createMarshaller().marshal(ojpRequest, writer);
            patchXml(writer);
            return writer.toString();
        } catch (JAXBException ex) {
            throw new OJPException("Unexpected error while marshalling OJP request-object: " + ex.getMessage(), ex);
        }
    }

    /**
     * Patch anything causing HTML error "expires"
     *
     * @param xmlInstance
     */
    private void patchXml(StringWriter xmlInstance) {
        xmlInstance.getBuffer().insert(xmlInstance.toString().indexOf("OJP xmlns") + "OJP".length(), " version=\"1.0\"");
    }

    /**
     * @param responseEntity
     * @return Generic OJP container with a delivery part
     */
    public OJP unmarshalResponse(ResponseEntity<String> responseEntity) throws OJPException {
        if (HttpStatus.OK.isSameCodeAs(responseEntity.getStatusCode())) {
            log.debug("OJP response: {}", responseEntity);
            if (responseEntity.getBody() == null) {
                throw new OJPException("Unexpected OJP response-body is null");
            }

            return unmarshalBody(responseEntity.getBody());
        } else {
            throw new OJPException("Unexpected error: " + responseEntity.getStatusCode() + " " + responseEntity.getBody());
        }
    }

    /**
     * @param responseBody OJP 2.0 xml-instance
     * @return OJP response structure
     */
    private OJP unmarshalBody(String responseBody) {
        final OJP ojpResponse;
        try {
            ojpResponse = (OJP) ojpJaxbContext.createUnmarshaller().unmarshal(new StringReader(responseBody));
        } catch (JAXBException ex) {
            throw new OJPException("Response mapping failed", ex);
        }
        if (ojpResponse.getOJPResponse() == null) {
            throw new OJPException("Expected response element is expected: " + ojpResponse);
        }
        if (ojpResponse.getOJPResponse().getServiceDelivery() == null) {
            throw new OJPException("Expected ServiceDelivery content is expected: " + ojpResponse.getOJPResponse());
        }
        if (ojpResponse.getOJPResponse().getServiceDelivery().getErrorCondition() != null) {
            // general fault: OJP failed to treat request (whether single- or multi-query)
            throw new OJPException(ojpResponse.getOJPResponse().getServiceDelivery());
        }
        if (CollectionUtils.isEmpty(ojpResponse.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery())) {
            // unexpected
            throw new OJPException("ServiceDelivery::abstractFunctionalServiceDelivery is empty for: " + ojpResponse.getOJPResponse().getServiceDelivery());
        }
        return ojpResponse;
    }
}