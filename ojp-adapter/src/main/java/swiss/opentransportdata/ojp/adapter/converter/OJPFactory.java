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

import de.vdv.ojp.release2.model.AbstractOJPServiceRequestStructure;
import de.vdv.ojp.release2.model.InitialLocationInputStructure;
import de.vdv.ojp.release2.model.InternationalTextStructure;
import de.vdv.ojp.release2.model.JourneyRefStructure;
import de.vdv.ojp.release2.model.ModeFilterStructure;
import de.vdv.ojp.release2.model.OJP;
import de.vdv.ojp.release2.model.OJPLocationInformationRequestStructure;
import de.vdv.ojp.release2.model.OJPRequestStructure;
import de.vdv.ojp.release2.model.OJPStopEventRequestStructure;
import de.vdv.ojp.release2.model.OJPTripInfoRequestStructure;
import de.vdv.ojp.release2.model.OJPTripRequestStructure;
import de.vdv.ojp.release2.model.ObjectFactory;
import de.vdv.ojp.release2.model.OperatingDayRefStructure;
import de.vdv.ojp.release2.model.PlaceContextStructure;
import de.vdv.ojp.release2.model.PlaceParamStructure;
import de.vdv.ojp.release2.model.PlaceRefStructure;
import de.vdv.ojp.release2.model.StopEventParamStructure;
import de.vdv.ojp.release2.model.StopEventTypeEnumeration;
import de.vdv.ojp.release2.model.StopPlaceRefStructure;
import de.vdv.ojp.release2.model.TripInfoParamStructure;
import de.vdv.ojp.release2.model.TripParamStructure;
import de.vdv.ojp.release2.model.TripViaStructure;
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
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import swiss.opentransportdata.ojp.adapter.PlaceRequestFilter;
import swiss.opentransportdata.ojp.adapter.StopEventRequestFilter;
import swiss.opentransportdata.ojp.adapter.TripLegRequestFilter;
import swiss.opentransportdata.ojp.adapter.TripRequestFilter;
import uk.org.siri.siri.NaturalLanguageStringStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.ServiceRequest;
import uk.org.siri.siri.ServiceRequestContextStructure;

/**
 * Helper to create some OJP specific structures declared by ojp.xsd.
 *
 * @author Peter Hirzel
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html">OJP doc</a>
 */
public class OJPFactory {

    // JAXB Element factory
    private final ObjectFactory objectFactoryOjp;
    private final uk.org.siri.siri.ObjectFactory objectFactorySiri;
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
        this.objectFactoryOjp = new ObjectFactory();
        this.objectFactorySiri = new uk.org.siri.siri.ObjectFactory();
        this.participantReference = participantReference;
    }

    public PlaceRefStructure createPlaceReferenceStructure(@NonNull String stopPlaceId, Locale preferredLanguage) {
        // stopName seems redundant, but OJP needs it probably (given in samples)
        final NaturalLanguageStringStructure naturalLanguageStringStructure = objectFactorySiri.createNaturalLanguageStringStructure();
        if (preferredLanguage != null) {
            naturalLanguageStringStructure.setLang(preferredLanguage.getLanguage());
        }
        naturalLanguageStringStructure.setValue(DUMMY_LOCATION_NAME);
        final InternationalTextStructure textStructure = objectFactoryOjp.createInternationalTextStructure();
        textStructure.withText(naturalLanguageStringStructure);

        final StopPlaceRefStructure stopPointRefStructure = objectFactoryOjp.createStopPlaceRefStructure();
        stopPointRefStructure.setValue(stopPlaceId);

        final PlaceRefStructure placeRefStructure = objectFactoryOjp.createPlaceRefStructure();
        placeRefStructure.setStopPlaceRef(stopPointRefStructure);
        placeRefStructure.setName(textStructure);

        return placeRefStructure;
    }

    public TripViaStructure createTripViaStructure() {
        return objectFactoryOjp.createTripViaStructure();
    }

    public ModeFilterStructure createModeFilterStructure() {
        return objectFactoryOjp.createModeFilterStructure();
    }

    /**
     * @param initialLocationInputStructure for e.g. by-name or by-coordinates
     * @param filter search arguments
     * @return OJP object to request places
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojplocationinformationrequest/">OJP LocationInformationRequest</a>
     */
    @NonNull
    public OJP createOjpWithLocationInformationRequest(@NonNull InitialLocationInputStructure initialLocationInputStructure, @NonNull PlaceRequestFilter filter) {
        final ZonedDateTime dateTime = createTimestamp();

        final OJPLocationInformationRequestStructure ojpLocationInformationRequestStructure = objectFactoryOjp.createOJPLocationInformationRequestStructure();
        ojpLocationInformationRequestStructure.setRequestTimestamp(dateTime);

        ojpLocationInformationRequestStructure.setInitialInput(initialLocationInputStructure);

        // Restrictions
        final PlaceParamStructure placeParamStructure = objectFactoryOjp.createPlaceParamStructure();
        if (!CollectionUtils.isEmpty(filter.getPlaceTypes())) {
            // restrict <ojp:Type>
            placeParamStructure.getType().addAll(filter.getPlaceTypes());
            /* TODO OJP 2.0 filter POI category
            if (placeTypes.contains(PlaceTypeEnumeration.POI)) {
                PointOfInterestFilterStructure pointOfInterestFilterStructure = objectFactoryOjp.createPointOfInterestFilterStructure();
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

        return createSingleRequest(dateTime, filter.getPreferredLanguage(), objectFactoryOjp.createOJPLocationInformationRequest(ojpLocationInformationRequestStructure));
    }

    @NonNull
    public OJP createOjpWithTripRequest(@NonNull TripRequestFilter filter) {
        final ZonedDateTime timestamp = createTimestamp();

        final OJPTripRequestStructure ojpTripRequestStructure = objectFactoryOjp.createOJPTripRequestStructure();
        ojpTripRequestStructure.setRequestTimestamp(timestamp);
        ojpTripRequestStructure.withOrigin(createPlaceContextStructure(filter.getOrigin(), filter.isSearchForArrival() ? null : filter.getDateTime(), filter.getPreferredLanguage()));
        ojpTripRequestStructure.withDestination(createPlaceContextStructure(filter.getDestination(), filter.isSearchForArrival() ? filter.getDateTime() : null, filter.getPreferredLanguage()));

        final TripParamStructure tripParamStructure = objectFactoryOjp.createTripParamStructure();
        // tripParamStructure.setAcceptDeferredDelivery();
        tripParamStructure.setBikeTransport(filter.isIncludeBikeCarriage());
        // tripParamStructure.setImmediateTripStart();
        // tripParamStructure.setExtension();

        /* not supported by OJP yet -> Glauser Andreas: ausschließlich NumberOfResults
        tripParamStructure.setNumberOfResultsBefore();
        tripParamStructure.setNumberOfResultsAfter();
         */
            tripParamStructure.setNumberOfResults(BigInteger.valueOf(filter.getLimit()));

        //TODO OJP 2.0 tripParamStructure.setModeFilter(filter.getModeFilterStructure());
        // tripParamStructure.setPrivateModeFilter(PrivateModeFilterStructure);
        tripParamStructure.setUseRealtimeData(filter.getRealtimeMode());
        // Whether the result should include accessibility information. Further specifyable: ..noRamp, noElevator, ..
        tripParamStructure.setIncludeAllRestrictedLines(true /*like OJP sample*/);
        //tripParamStructure.setIncludeAccessibility(filter.isIncludeAccessibility());
        tripParamStructure.setIncludeIntermediateStops(filter.isIncludeIntermediateStops());
        tripParamStructure.setIncludeFare(false /*NOVA post-pricing approach for CH*/);
        tripParamStructure.setIncludeLegProjection(filter.isIncludeProjection());
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
        // TODO OJP 2.0 ojpTripRequestStructure.withNoChangeAt(); ojpTripRequestStructure.withNotVia();

        ojpTripRequestStructure.setParams(tripParamStructure);

        return createSingleRequest(timestamp, filter.getPreferredLanguage(), objectFactoryOjp.createOJPTripRequest(ojpTripRequestStructure));
    }

    private PlaceContextStructure createPlaceContextStructure(String stopPlaceUic, ZonedDateTime departureArrivalDateTime, Locale preferredLanguage) {
        final PlaceContextStructure placeContextStructure = objectFactoryOjp.createPlaceContextStructure();
        placeContextStructure.setPlaceRef(createPlaceReferenceStructure(stopPlaceUic, preferredLanguage));

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
    OJP createSingleRequest(ZonedDateTime requestTimestamp, Locale preferredLanguage, JAXBElement<? extends AbstractOJPServiceRequestStructure> jaxbElement) {
        final OJPRequestStructure ojpRequestStructure = objectFactoryOjp.createOJPRequestStructure();
        ojpRequestStructure.setServiceRequest(createServiceRequest(requestTimestamp, preferredLanguage));
        // singleton or collection possible
        ojpRequestStructure.getServiceRequest().withAbstractFunctionalServiceRequest(jaxbElement);

        final OJP ojp = objectFactoryOjp.createOJP();
        ojp.setOJPRequest(ojpRequestStructure);

        return ojp;
    }

    /**
     * @param requestTimestamp timestamp for request
     * @param preferredLanguage Accept-Language
     * @return General Service container for an OJP request
     */
    ServiceRequest createServiceRequest(ZonedDateTime requestTimestamp, Locale preferredLanguage) {
        final ParticipantRefStructure participantRefStructure = objectFactorySiri.createParticipantRefStructure();
        participantRefStructure.setValue(participantReference);

        final ServiceRequestContextStructure serviceRequestContextStructure = objectFactorySiri.createServiceRequestContextStructure();
        serviceRequestContextStructure.withLanguage(preferredLanguage.getLanguage());
        serviceRequestContextStructure.setRequestTimeout(Duration.ofMillis(29000));
        serviceRequestContextStructure.setDistanceUnits("m");
        // serviceRequestContextStructure.setGmlCoordinateFormat(???);
        // serviceRequestContextStructure.setWgsDecimalDegrees(???);

        final ServiceRequest serviceRequest = objectFactorySiri.createServiceRequest();
        serviceRequest.setRequestTimestamp(requestTimestamp);
        serviceRequest.setRequestorRef(participantRefStructure);
        /*
        final MessageQualifierStructure messageQualifierStructure = new MessageQualifierStructure();
        messageQualifierStructure.setValue("4711");
        serviceRequest.setMessageIdentifier(messageQualifierStructure);
         */

        serviceRequest.setServiceRequestContext(serviceRequestContextStructure);

        return serviceRequest;
    }

    @NonNull
    public OJP createOjpWithTripInfoRequest(@NonNull TripLegRequestFilter filter) {
        final ZonedDateTime dateTime = createTimestamp();

        final TripInfoParamStructure tripInfoParamStructure = objectFactoryOjp.createTripInfoParamStructure();
        tripInfoParamStructure.setIncludeCalls(true);
        tripInfoParamStructure.setIncludeTrackSections(INCLUDE_TRACK_SECTIONS);
        // 'service' information to be added to the results!
        tripInfoParamStructure.setIncludeService(true);
        // Whether the result should include the geographic projection (coordinates) of each journey leg.
        tripInfoParamStructure.setIncludeTrackProjection(filter.isIncludeProjection());
        //tripInfoParamStructure.setIncludePosition();
        tripInfoParamStructure.setUseRealTimeData(filter.getRealtimeMode());

        final JourneyRefStructure journeyRefStructure = objectFactoryOjp.createJourneyRefStructure();
        journeyRefStructure.setValue(filter.getJourneyReference());

        final OperatingDayRefStructure operatingDayRefStructure = objectFactoryOjp.createOperatingDayRefStructure();
        operatingDayRefStructure.setValue(formatDate(filter.getOperatingDay()));

        final List<JAXBElement<?>> rest = new ArrayList<>();
        //TODO OJP 2.0 leads to 500! rest.add(objectFactory.createOJPTripInfoRequestStructureParams(tripInfoParamStructure));
        rest.add(objectFactoryOjp.createJourneyRef(journeyRefStructure));
        rest.add(objectFactoryOjp.createOperatingDayRef(operatingDayRefStructure));
        if (filter.getVehicleReference() != null) {
            rest.add(objectFactorySiri.createVehicleRef(filter.getVehicleReference()));
        }

        final OJPTripInfoRequestStructure ojpTripInfoRequestStructure = objectFactoryOjp.createOJPTripInfoRequestStructure();
        ojpTripInfoRequestStructure.setRequestTimestamp(dateTime);
        ojpTripInfoRequestStructure.withRest(rest);

        return createSingleRequest(dateTime, filter.getPreferredLanguage(), objectFactoryOjp.createOJPTripInfoRequest(ojpTripInfoRequestStructure));
    }

    /**
     * OJP cannot deal with "[Europe/Zurich]" daylight saving timezones.
     *
     * @return now with numeric offset.
     */
    static ZonedDateTime createTimestamp() {
        return OffsetDateTime.now().toZonedDateTime();
    }

    private static String formatDate(LocalDate date) {
        return date == null ? null : date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalDate parseOperatingDayRef(OperatingDayRefStructure operatingDayRefStructure) {
        if ((operatingDayRefStructure != null) && StringUtils.isNotBlank(operatingDayRefStructure.getValue())) {
            return LocalDate.parse(operatingDayRefStructure.getValue());
        }
        return null;
    }


    @NonNull
    public OJP createOjpWithStopEventRequest(@NonNull StopEventRequestFilter filter) {
        final ZonedDateTime dateTime = createTimestamp();
        final StopEventParamStructure stopEventParamStructure = objectFactoryOjp.createStopEventParamStructure();

        if (filter.isSearchForArrival()) {
            stopEventParamStructure.setStopEventType(StopEventTypeEnumeration.ARRIVAL);
            stopEventParamStructure.setIncludePreviousCalls(true);
            stopEventParamStructure.setIncludeOnwardCalls(false);
        } else {
            stopEventParamStructure.setStopEventType(StopEventTypeEnumeration.DEPARTURE);
            // Hafas shows only stop at Departure until end
            stopEventParamStructure.setIncludePreviousCalls(false /*'true' means the previous stops of each line are shown as well -> not possible with Hafas /departures*/);
            stopEventParamStructure.setIncludeOnwardCalls(true /*'true' means the future stops of each line are shown as well*/);
        } // or BOTH -> not possible by Hafas
        stopEventParamStructure.setIncludeOperatingDays(true);
        stopEventParamStructure.setNumberOfResults(BigInteger.valueOf(filter.getLimit()));
        stopEventParamStructure.setModeFilter(filter.getModeFilterStructure());
        stopEventParamStructure.setUseRealtimeData(filter.getRealtimeMode());

        /*
        stopEventParamStructure.setLineFilter();
        stopEventParamStructure.setOperatorFilter();
        stopEventParamStructure.setTimeWindow();

        OperatingDayRefStructure operatingDayRefStructure = objectFactoryOjp.createOperatingDayRefStructure();
        TODO OJP 2.0  operatingDayRefStructure.setValue(DateTimeUtils.formatDate(operatingDay));
        */

        final OJPStopEventRequestStructure ojpStopEventRequestStructure = objectFactoryOjp.createOJPStopEventRequestStructure();
        ojpStopEventRequestStructure.setRequestTimestamp(dateTime);
        ojpStopEventRequestStructure.setParams(stopEventParamStructure);
        ojpStopEventRequestStructure.setLocation(createPlaceContextStructure(filter.getStopPlaceReference(), filter.getDepartureArrivalDateTime(), filter.getPreferredLanguage()));

        return createSingleRequest(dateTime, filter.getPreferredLanguage(), objectFactoryOjp.createOJPStopEventRequest(ojpStopEventRequestStructure));
    }
}
