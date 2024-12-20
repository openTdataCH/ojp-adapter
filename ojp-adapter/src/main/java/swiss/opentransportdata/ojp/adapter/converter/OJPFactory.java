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

package swiss.opentransportdata.ojp.adapter.converter;

import de.vdv.ojp.ObjectFactory;
import de.vdv.ojp.model.OJP;
import de.vdv.ojp.model.OJPRequestStructure;
import de.vdv.ojp.model.ParticipantRefStructure;
import de.vdv.ojp.model.ServiceRequest;
import de.vdv.ojp.model.ServiceRequestContextStructure;
import de.vdv.ojp.release2.model.AbstractOJPServiceRequestStructure;
import de.vdv.ojp.release2.model.InitialLocationInputStructure;
import de.vdv.ojp.release2.model.InternationalTextStructure;
import de.vdv.ojp.release2.model.JourneyRefStructure;
import de.vdv.ojp.release2.model.OJPLocationInformationRequestStructure;
import de.vdv.ojp.release2.model.OJPStopEventRequestStructure;
import de.vdv.ojp.release2.model.OJPTripInfoRequestStructure;
import de.vdv.ojp.release2.model.OJPTripRequestStructure;
import de.vdv.ojp.release2.model.OperatingDayRefStructure;
import de.vdv.ojp.release2.model.PlaceContextStructure;
import de.vdv.ojp.release2.model.PlaceParamStructure;
import de.vdv.ojp.release2.model.PlaceRefStructure;
import de.vdv.ojp.release2.model.StopEventParamStructure;
import de.vdv.ojp.release2.model.StopEventTypeEnumeration;
import de.vdv.ojp.release2.model.StopPlaceRefStructure;
import de.vdv.ojp.release2.model.TripInfoParamStructure;
import de.vdv.ojp.release2.model.TripParamStructure;
import de.vdv.ojp.release2.model.UseRealtimeDataEnumeration;
import jakarta.xml.bind.JAXBElement;
import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lombok.NonNull;
import org.springframework.util.CollectionUtils;
import swiss.opentransportdata.ojp.adapter.PlaceRequestFilter;
import swiss.opentransportdata.ojp.adapter.StopEventRequestFilter;
import swiss.opentransportdata.ojp.adapter.TripLegRequestFilter;
import swiss.opentransportdata.ojp.adapter.TripRequestFilter;
import uk.org.siri.siri.NaturalLanguageStringStructure;

/**
 * Helper to create some OJP specific structures declared by ojp.xsd.
 *
 * @author Peter Hirzel
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html">OJP doc</a>
 */
public class OJPFactory {

    // JAXB Element factory
    @Deprecated(since = "OJP v2")
    private final ObjectFactory objectFactory;
    private final de.vdv.ojp.release2.model.ObjectFactory objectFactory2;
    private final String participantReference;

    /**
     * Just to please XML validation by OJP.
     * <p>
     * According to Günter Matthias this can be anything and does not need to match to StopPlaceRef UIC.
     */
    private static final String DUMMY_LOCATION_NAME = "dummy";

    /**
     * Whether the result should include TrackSection elements to describe the geographic route of each journey leg.
     * <p>
     * acc. to OJPDemo: The value is currently ignored and always set to 'true' by the system. Otherwise, it would indicate if the stops should be shown as well.
     */
    private static final boolean INCLUDE_TRACK_SECTIONS = true;

    public OJPFactory(@NonNull String participantReference) {
        this.objectFactory = new ObjectFactory();
        this.objectFactory2 = new de.vdv.ojp.release2.model.ObjectFactory();
        this.participantReference = participantReference;
    }

    public static de.vdv.ojp.release2.model.PlaceRefStructure createPlaceReferenceStructure(@NonNull String stopPlaceId) {
        // stopName seems redundant, but OJP needs it probably (given in samples)
        final uk.org.siri.siri.NaturalLanguageStringStructure naturalLanguageStringStructure = new NaturalLanguageStringStructure();
        //TODO ? naturalLanguageStringStructure.setLang(locale.getLanguage());
        naturalLanguageStringStructure.setValue(DUMMY_LOCATION_NAME);
        final de.vdv.ojp.release2.model.InternationalTextStructure textStructure = new InternationalTextStructure();
        textStructure.withText(naturalLanguageStringStructure);

        final de.vdv.ojp.release2.model.StopPlaceRefStructure stopPointRefStructure = new StopPlaceRefStructure();
        stopPointRefStructure.setValue(stopPlaceId);

        final de.vdv.ojp.release2.model.PlaceRefStructure placeRefStructure = new PlaceRefStructure();
        placeRefStructure.setStopPlaceRef(stopPointRefStructure);
        placeRefStructure.setName(textStructure);

        return placeRefStructure;
    }

    /**
     * @param initialLocationInputStructure for e.g. by-name or by-coordinates
     * @param filter search arguments
     * @return OJP object to request places
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojplocationinformationrequest/">OJP LocationInformationRequest</a>
     */
    @NonNull
    public de.vdv.ojp.release2.model.OJP createOjpWithLocationInformationRequest(@NonNull InitialLocationInputStructure initialLocationInputStructure, @NonNull PlaceRequestFilter filter) {
        final ZonedDateTime dateTime = createTimestamp();

        final OJPLocationInformationRequestStructure ojpLocationInformationRequestStructure = new OJPLocationInformationRequestStructure();
        ojpLocationInformationRequestStructure.setRequestTimestamp(dateTime);

        ojpLocationInformationRequestStructure.setInitialInput(initialLocationInputStructure);

        // Restrictions
        final PlaceParamStructure placeParamStructure = new PlaceParamStructure();
        if (!CollectionUtils.isEmpty(filter.getPlaceTypes())) {
            // restrict <ojp:Type>
            placeParamStructure.getType().addAll(filter.getPlaceTypes());
            /*
            if (placeTypes.contains(PlaceTypeEnumeration.POI)) {
                PointOfInterestFilterStructure pointOfInterestFilterStructure = new PointOfInterestFilterStructure();
                pointOfInterestFilterStructure.setExclude(false);
                Set<PointOfInterestCategoryStructure> pointOfInterestCategoryStructures = new HashSet<>();
                // add any Categories
                pointOfInterestFilterStructure.withPointOfInterestCategory(pointOfInterestCategoryStructures);
                placeParamStructure.setPointOfInterestFilter(pointOfInterestFilterStructure);
            }
             */
        }
        placeParamStructure.setNumberOfResults(java.math.BigInteger.valueOf(filter.getLimit()));
        placeParamStructure.setModes(filter.getModeFilterStructure());
        // placeParamStructure.setUsage(PlaceUsageEnumeration.VIA);
        // placeParamStructure.setContinueAt();
        ojpLocationInformationRequestStructure.setRestrictions(placeParamStructure);

        return createSingleRequest2(dateTime, filter.getPreferredLanguage(), objectFactory2.createOJPLocationInformationRequest(ojpLocationInformationRequestStructure));
    }

    @NonNull
    public de.vdv.ojp.release2.model.OJP createOjpWithTripRequest(@NonNull TripRequestFilter filter) {
        final ZonedDateTime timestamp = createTimestamp();

        final de.vdv.ojp.release2.model.OJPTripRequestStructure ojpTripRequestStructure = new OJPTripRequestStructure();
        ojpTripRequestStructure.setRequestTimestamp(timestamp);
        ojpTripRequestStructure.withOrigin(createPlaceContextStructure(filter.getOrigin(), filter.isSearchForArrival() ? null : filter.getDateTime()));
        ojpTripRequestStructure.withDestination(createPlaceContextStructure(filter.getDestination(), filter.isSearchForArrival() ? filter.getDateTime() : null));

        final de.vdv.ojp.release2.model.TripParamStructure tripParamStructure = new TripParamStructure();
        // tripParamStructure.setAcceptDeferredDelivery();
        tripParamStructure.setBikeTransport(filter.isIncludeBikeCarriage());
        // tripParamStructure.setImmediateTripStart();
        // tripParamStructure.setExtension();

        /* not supported by OJP yet -> Glauser Andreas: ausschließlich NumberOfResults
        tripParamStructure.setNumberOfResultsBefore();
        tripParamStructure.setNumberOfResultsAfter();
         */
        if (filter.getLimit() != null) {
            tripParamStructure.setNumberOfResults(BigInteger.valueOf(filter.getLimit()));
        }

        //TODO OJP 2.0 tripParamStructure.setModeFilter(filter.getModeFilterStructure());
        // tripParamStructure.setPrivateModeFilter(PrivateModeFilterStructure);
        tripParamStructure.setUseRealtimeData(filter.isExcludeRealtime() ? UseRealtimeDataEnumeration.NONE : UseRealtimeDataEnumeration.EXPLANATORY);
        // Whether the result should include accessibility information. Further specifyable: ..noRamp, noElevator, ..
        tripParamStructure.setIncludeAllRestrictedLines(true /*like OJP sample*/);
        //tripParamStructure.setIncludeAccessibility(filter.isIncludeAccessibility());
        tripParamStructure.setIncludeIntermediateStops(filter.isIncludeIntermediateStops());
        tripParamStructure.setIncludeFare(false /*NOVA post-pricing approach for CH*/);
        tripParamStructure.setIncludeLegProjection(filter.isIncludeLegProjection());
        // tripParamStructure.setLineFilter();
        // tripParamStructure.setOperatorFilter();
        tripParamStructure.setIncludeOperatingDays(filter.isIncludeOperatingDays());
        tripParamStructure.setIncludeTrackSections(INCLUDE_TRACK_SECTIONS);
        // Whether the result should include turn-by-turn instructions for each journey leg.
        tripParamStructure.setIncludeTurnDescription(false);

        tripParamStructure.setTransferLimit(BigInteger.valueOf(filter.getTransferLimit()));
        // Deviation from average walk speed in percent. 100% percent is average speed. Less than 100 % slower, Greater than 150% faster.
        tripParamStructure.setWalkSpeed(BigInteger.valueOf(filter.getWalkSpeed()));
        ojpTripRequestStructure.withVia(filter.getVias());
        // TODO ojpTripRequestStructure.withNoChangeAt(); ojpTripRequestStructure.withNotVia();

        ojpTripRequestStructure.setParams(tripParamStructure);

        return createSingleRequest2(timestamp, filter.getPreferredLanguage(), objectFactory2.createOJPTripRequest(ojpTripRequestStructure));
    }

    static de.vdv.ojp.release2.model.PlaceContextStructure createPlaceContextStructure(String stopPlaceUic, ZonedDateTime departureArrivalDateTime) {
        final de.vdv.ojp.release2.model.PlaceContextStructure placeContextStructure = new PlaceContextStructure();
        placeContextStructure.setPlaceRef(createPlaceReferenceStructure(stopPlaceUic));

        if (departureArrivalDateTime != null) {
            placeContextStructure.setDepArrTime(departureArrivalDateTime);
        }
        // placeContextStructure.setTimeAllowance();
        // placeContextStructure.setTripLocation();
        return placeContextStructure;
    }

    /**
     * @param requestTimestamp
     * @param preferredLanguage
     * @param jaxbElement specific query params
     * @return complete OJP request
     */
    @Deprecated(since = "OJP v2")
    OJP createSingleRequest(ZonedDateTime requestTimestamp, Locale preferredLanguage, JAXBElement<? extends de.vdv.ojp.AbstractOJPServiceRequestStructure> jaxbElement) {
        final OJP ojp = new OJP();
        ojp.setOJPRequest(new OJPRequestStructure());
        ojp.getOJPRequest().setServiceRequest(createServiceRequest(requestTimestamp, preferredLanguage));

        // singleton or collection possible
        ojp.getOJPRequest().getServiceRequest().withAbstractFunctionalServiceRequest(jaxbElement);
        return ojp;
    }

    de.vdv.ojp.release2.model.OJP createSingleRequest2(ZonedDateTime requestTimestamp, Locale preferredLanguage, JAXBElement<? extends AbstractOJPServiceRequestStructure> jaxbElement) {
        final de.vdv.ojp.release2.model.OJP ojp = new de.vdv.ojp.release2.model.OJP();
        ojp.setOJPRequest(new de.vdv.ojp.release2.model.OJPRequestStructure());
        ojp.getOJPRequest().setServiceRequest(createServiceRequest2(requestTimestamp, preferredLanguage));

        // singleton or collection possible
        ojp.getOJPRequest().getServiceRequest().withAbstractFunctionalServiceRequest(jaxbElement);
        return ojp;
    }

    /**
     * @param requestTimestamp timestamp for request
     * @param preferredLanguage Accept-Language
     * @return General Service container for an OJP request
     */
    @Deprecated(since = "OJP v2.0")
    ServiceRequest createServiceRequest(ZonedDateTime requestTimestamp, Locale preferredLanguage) {
        final ServiceRequest serviceRequest = new ServiceRequest();
        serviceRequest.setRequestTimestamp(requestTimestamp);
        final ParticipantRefStructure participantRefStructure = new ParticipantRefStructure();
        participantRefStructure.setValue(participantReference);
        serviceRequest.setRequestorRef(participantRefStructure);
        /*
        final MessageQualifierStructure messageQualifierStructure = new MessageQualifierStructure();
        messageQualifierStructure.setValue("4711");
        serviceRequest.setMessageIdentifier(messageQualifierStructure);
         */

        final ServiceRequestContextStructure serviceRequestContextStructure = new ServiceRequestContextStructure();
        serviceRequestContextStructure.setLanguage(preferredLanguage.getLanguage());
        serviceRequestContextStructure.setRequestTimeout(Duration.ofMillis(29000));
        serviceRequestContextStructure.setDistanceUnits("m");
        // serviceRequestContextStructure.setGmlCoordinateFormat(???);
        // serviceRequestContextStructure.setWgsDecimalDegrees(???);
        serviceRequest.setServiceRequestContext(serviceRequestContextStructure);

        return serviceRequest;
    }

    /**
     * @param requestTimestamp timestamp for request
     * @param preferredLanguage Accept-Language
     * @return General Service container for an OJP request
     */
    uk.org.siri.siri.ServiceRequest createServiceRequest2(ZonedDateTime requestTimestamp, Locale preferredLanguage) {
        final uk.org.siri.siri.ServiceRequest serviceRequest = new uk.org.siri.siri.ServiceRequest();
        serviceRequest.setRequestTimestamp(requestTimestamp);
        final uk.org.siri.siri.ParticipantRefStructure participantRefStructure = new uk.org.siri.siri.ParticipantRefStructure();
        participantRefStructure.setValue(participantReference);
        serviceRequest.setRequestorRef(participantRefStructure);
        /*
        final MessageQualifierStructure messageQualifierStructure = new MessageQualifierStructure();
        messageQualifierStructure.setValue("4711");
        serviceRequest.setMessageIdentifier(messageQualifierStructure);
         */

        final uk.org.siri.siri.ServiceRequestContextStructure serviceRequestContextStructure = new uk.org.siri.siri.ServiceRequestContextStructure();
        serviceRequestContextStructure.withLanguage(preferredLanguage.getLanguage());
        serviceRequestContextStructure.setRequestTimeout(Duration.ofMillis(29000));
        serviceRequestContextStructure.setDistanceUnits("m");
        // serviceRequestContextStructure.setGmlCoordinateFormat(???);
        // serviceRequestContextStructure.setWgsDecimalDegrees(???);
        serviceRequest.setServiceRequestContext(serviceRequestContextStructure);

        return serviceRequest;
    }

    @NonNull
    public de.vdv.ojp.release2.model.OJP createOjpWithTripInfoRequest(@NonNull TripLegRequestFilter filter) {
        final ZonedDateTime dateTime = createTimestamp();

        final de.vdv.ojp.release2.model.TripInfoParamStructure tripInfoParamStructure = new TripInfoParamStructure();
        tripInfoParamStructure.setIncludeCalls(true);
        tripInfoParamStructure.setIncludeTrackSections(INCLUDE_TRACK_SECTIONS);
        // 'service' information be added to the results!
        tripInfoParamStructure.setIncludeService(true);
        // Whether the result should include the geographic projection (coordinates) of each journey leg.
        tripInfoParamStructure.setIncludeTrackProjection(filter.isProjection());
        /*
        tripInfoParamStructure.setIncludePosition();
        tripInfoParamStructure.setExtension();
        // rtMode#OFF ?
        tripInfoParamStructure.setUseTimetabledDataOnly();
        */

        final de.vdv.ojp.release2.model.JourneyRefStructure journeyRefStructure = new JourneyRefStructure();
        journeyRefStructure.setValue(filter.getJourneyReference());

        final de.vdv.ojp.release2.model.OperatingDayRefStructure operatingDayRefStructure = new OperatingDayRefStructure();
        operatingDayRefStructure.setValue(formatDate(filter.getOperatingDay()));

        final List<JAXBElement<?>> rest = new ArrayList<>();
        rest.add(objectFactory2.createOJPTripInfoRequestStructureParams(tripInfoParamStructure));
        rest.add(objectFactory2.createJourneyRef(journeyRefStructure));
        rest.add(objectFactory2.createOperatingDayRef(operatingDayRefStructure));
        // ojpTripInfoRequestStructure.setTimeOfOperation();
        // ojpTripInfoRequestStructure.setVehicleRef();

        final de.vdv.ojp.release2.model.OJPTripInfoRequestStructure ojpTripInfoRequestStructure = new OJPTripInfoRequestStructure();
        ojpTripInfoRequestStructure.setRequestTimestamp(dateTime);
        ojpTripInfoRequestStructure.withRest(rest);

        return createSingleRequest2(dateTime, filter.getPreferredLanguage(), objectFactory2.createOJPTripInfoRequest(ojpTripInfoRequestStructure));
    }

    /**
     * OJP cannot deal with "[Europe/Zurich]" daylight saving timeones.
     *
     * @return now with numeric offset.
     */
    static ZonedDateTime createTimestamp() {
        return OffsetDateTime.now().toZonedDateTime();
    }

    private static String formatDate(LocalDate date) {
        return date == null ? null : date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @NonNull
    public de.vdv.ojp.release2.model.OJP createOjpWithStopEventRequest(@NonNull StopEventRequestFilter filter) {
        final ZonedDateTime dateTime = createTimestamp();
        final de.vdv.ojp.release2.model.StopEventParamStructure stopEventParamStructure = new StopEventParamStructure();

        if (filter.isSearchForArrival()) {
            stopEventParamStructure.setStopEventType(de.vdv.ojp.release2.model.StopEventTypeEnumeration.ARRIVAL);
            stopEventParamStructure.setIncludePreviousCalls(true);
            stopEventParamStructure.setIncludeOnwardCalls(false);
        } else {
            stopEventParamStructure.setStopEventType(StopEventTypeEnumeration.DEPARTURE);
            // Hafas shows only stop at Departure until end
            stopEventParamStructure.setIncludePreviousCalls(false /*'true' means the previous stops of each line are shown as well -> not possible with Hafas /departures*/);
            stopEventParamStructure.setIncludeOnwardCalls(true /*'true' means the future stops of each line are shown as well*/);
        } // or BOTH -> not possible by Hafas
        stopEventParamStructure.setIncludeOperatingDays(true);
        //v1 only ? stopEventParamStructure.setIncludeRealtimeData(true);
        stopEventParamStructure.setNumberOfResults(BigInteger.valueOf(filter.getLimit()));
        stopEventParamStructure.setModeFilter(filter.getModeFilterStructure());

        /*
        stopEventParamStructure.setLineFilter();
        stopEventParamStructure.setOperatorFilter();
        stopEventParamStructure.setTimeWindow();

        LocationStructure locationStructure = new LocationStructure();
        locationStructure.set
        OperatingDayRefStructure operatingDayRefStructure = new OperatingDayRefStructure();
        TODO ? operatingDayRefStructure.setValue(DateTimeUtils.formatDate(operatingDay));
        */

        final de.vdv.ojp.release2.model.OJPStopEventRequestStructure ojpStopEventRequestStructure = new OJPStopEventRequestStructure();
        ojpStopEventRequestStructure.setRequestTimestamp(dateTime);
        ojpStopEventRequestStructure.setParams(stopEventParamStructure);
        ojpStopEventRequestStructure.setLocation(createPlaceContextStructure(filter.getStopPlaceReference(), filter.getDepartureArrivalDateTime()));

        return createSingleRequest2(dateTime, filter.getPreferredLanguage(), objectFactory2.createOJPStopEventRequest(ojpStopEventRequestStructure));
    }
}