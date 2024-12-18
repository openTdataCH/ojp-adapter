/*
 * Copyright 2024 Peter Hirzel
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

package swiss.opentransportdata.ojp.adapter.service.api.converter;

import de.vdv.ojp.JourneyRefStructure;
import de.vdv.ojp.PlaceRefStructure;
import de.vdv.ojp.PlaceTypeEnumeration;
import de.vdv.ojp.PtModeFilterStructure;
import de.vdv.ojp.TripViaStructure;
import de.vdv.ojp.model.OJP;
import de.vdv.ojp.model.VehicleModesOfTransportEnumeration;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import jdk.jfr.Experimental;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAccessor;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceTypeEnum;
import swiss.opentransportdata.ojp.adapter.model.place.response.PlaceResponse;
import swiss.opentransportdata.ojp.adapter.model.schedule.response.OperatingPeriod;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.datedvehiclejourney.response.DatedVehicleJourney;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Direction;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Notice;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ScheduledStopPoint;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceAlteration;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourney;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceProduct;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.stationboard.response.Arrival;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.stationboard.response.ArrivalResponse;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.stationboard.response.Departure;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.stationboard.response.DepartureResponse;
import swiss.opentransportdata.ojp.adapter.model.situation.response.PTSituation;
import swiss.opentransportdata.ojp.adapter.model.trip.request.PTViaReference;
import swiss.opentransportdata.ojp.adapter.model.trip.request.TransportModeEnum;
import swiss.opentransportdata.ojp.adapter.model.trip.response.TripResponse;
import swiss.opentransportdata.ojp.adapter.model.trip.response.TripStatus;
import swiss.opentransportdata.ojp.adapter.service.error.DeveloperException;
import swiss.opentransportdata.ojp.adapter.service.utils.DateTimeUtils;
import swiss.opentransportdata.ojp.adapter.v1.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.v1.PlaceRequestFilter;
import swiss.opentransportdata.ojp.adapter.v1.StopEventRequestFilter;
import swiss.opentransportdata.ojp.adapter.v1.TripLegRequestFilter;
import swiss.opentransportdata.ojp.adapter.v1.TripRequestFilter;
import swiss.opentransportdata.ojp.adapter.v1.converter.OJPFactory;

/**
 * Facade to interact with OJP using J-S v3 Transmodel (TRM6) like models, therefore this is a kind of OJP overlay by J-S POJOs.
 * <p>
 * Requests against OJP by {@link OJPAdapter} and maps native OJP XML responses to J-S v3 models.
 *
 * @author Peter Hirzel
 * @since 3.1.3
 */
@Slf4j
@Component
public class OJPFacade {

    /**
     * According to SKI+ Andreas Glauser, data available 2 weeks back only.
     */
    @Experimental
    private static final int JOURNEY_PLANNER_PAST_DAYS_TO_SUPPORT = 21;
    static final String JOURNEY_PLANNER_DAYS_DETAIL = "Too old, no more Journey-Planner data available.";

    private final PlaceConverter placeConverter;
    private final TripConverter tripConverter;
    private final ServiceJourneyConverter serviceJourneyConverter;
    private final OJPAdapter ojpAdapter;

    @Autowired
    public OJPFacade(
        @Qualifier("OJPPlaceConverter") PlaceConverter placeConverter,
        @Qualifier("OJPTripConverter") TripConverter tripConverter,
        @Qualifier("OJPDepartureConverter") ServiceJourneyConverter serviceJourneyConverter,
        @Qualifier("OJPAdapter") OJPAdapter ojpAdapter) {

        this.placeConverter = placeConverter;
        this.tripConverter = tripConverter;
        this.serviceJourneyConverter = serviceJourneyConverter;
        this.ojpAdapter = ojpAdapter;
    }

    static boolean isTooOld(LocalDate date) {
        if (date == null) {
            // NOW
            return false;
        }
        return !date.isAfter(LocalDate.now().minusDays(JOURNEY_PLANNER_PAST_DAYS_TO_SUPPORT));
    }

    @Deprecated(since = "OJP v2.0")
    static Set<PlaceTypeEnumeration> mapToPlaceTypes(Set<PlaceTypeEnum> types) {
        if (CollectionUtils.isEmpty(types) || types.contains(PlaceTypeEnum.ALL) || (types.size() >= PlaceTypeEnum.values().length - 1)) {
            // not supported yet: PlaceTypeEnumeration.COORD, PlaceTypeEnumeration.TOPOGRAPHIC_PLACE
            return Set.of(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.ADDRESS, PlaceTypeEnumeration.POI);
        }

        return types.stream()
            .map(type -> switch (type) {
                case StopPlace -> PlaceTypeEnumeration.STOP;
                case PointOfInterest -> PlaceTypeEnumeration.POI;
                case Address -> PlaceTypeEnumeration.ADDRESS;
                case ALL -> throw new IllegalStateException("developer fault: ALL should not remain any more");
            })
            .collect(Collectors.toSet());
    }

    static Set<de.vdv.ojp.release2.model.PlaceTypeEnumeration> mapToPlaceTypes2(Set<PlaceTypeEnum> types) {
        if (CollectionUtils.isEmpty(types) || types.contains(PlaceTypeEnum.ALL) || (types.size() >= PlaceTypeEnum.values().length - 1)) {
            // not supported yet: PlaceTypeEnumeration.COORD, PlaceTypeEnumeration.TOPOGRAPHIC_PLACE
            return Set.of(de.vdv.ojp.release2.model.PlaceTypeEnumeration.STOP, de.vdv.ojp.release2.model.PlaceTypeEnumeration.ADDRESS, de.vdv.ojp.release2.model.PlaceTypeEnumeration.POI);
        }

        return types.stream()
            .map(type -> switch (type) {
                case StopPlace -> de.vdv.ojp.release2.model.PlaceTypeEnumeration.STOP;
                case PointOfInterest -> de.vdv.ojp.release2.model.PlaceTypeEnumeration.POI;
                case Address -> de.vdv.ojp.release2.model.PlaceTypeEnumeration.ADDRESS;
                case ALL -> throw new IllegalStateException("developer fault: ALL should not remain any more");
            })
            .collect(Collectors.toSet());
    }

    /**
     * Find Place's by OJP.
     *
     * @param ojpAccessor OJP instance and token
     * @param filter search filter
     * @return response containing a list of {@link swiss.opentransportdata.ojp.adapter.model.place.response.Place}
     * @throws OJPException
     */
    @NonNull
    public PlaceResponse requestPlaces(@NonNull OJPAccessor ojpAccessor, @NonNull PlaceRequestFilter filter) throws OJPException {
        final de.vdv.ojp.release2.model.OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor, filter);
        return placeConverter.convertToDTO(ojpResponse);
    }

    @NonNull
    public TripResponse requestTrips(@NonNull OJPAccessor ojpAccessor, @NonNull TripRequestFilter tripRequestFilter)
        throws OJPException {

        final OJP ojpResponse = ojpAdapter.requestTrips(ojpAccessor, tripRequestFilter);
        return tripConverter.convertToDTO(ojpResponse);
    }

    /**
     * @param ojpAccessor OJP instance and token
     * @param filter search filter
     * @throws OJPException
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojptripinforequest/">OJP TripInfoRequest</a>
     */
    @NonNull
    public DatedVehicleJourney requestDatedVehicleJourneyByServiceJourneyId(@NonNull OJPAccessor ojpAccessor, @NonNull TripLegRequestFilter filter) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestTripLegByJourneyReference(ojpAccessor, filter);
        return TripConverter.mapToDatedVehicleJourney(ojpResponse);
    }

    /**
     * @param ojpAccessor OJP instance and token
     * @param filter search filter
     * @throws OJPException
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojptripinforequest/">OJP TripInfoRequest</a>
     */
    @NonNull
    public DepartureResponse requestDepartures(@NonNull OJPAccessor ojpAccessor, @NonNull StopEventRequestFilter filter) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestStopEvent(ojpAccessor, filter);

        return DepartureResponse.builder()
            .departures(serviceJourneyConverter.convertToDTO(ojpResponse).stream()
                .map(serviceJourney -> Departure.builder()
                    .serviceJourney(serviceJourney)
                    .build())
                .collect(Collectors.toList()))
            .build();
    }

    /**
     * @param ojpAccessor OJP instance and token
     * @param filter search filter
     * @throws OJPException
     * @see <a href="https://opentransportdata.swiss/de/cookbook/ojptripinforequest/">OJP TripInfoRequest</a>
     */
    @NonNull
    public ArrivalResponse requestArrivals(@NonNull OJPAccessor ojpAccessor, @NonNull StopEventRequestFilter filter) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestStopEvent(ojpAccessor, filter);

        return ArrivalResponse.builder()
            .arrivals(serviceJourneyConverter.convertToDTO(ojpResponse).stream()
                .map(serviceJourney -> Arrival.builder()
                    .serviceJourney(serviceJourney)
                    .build())
                .collect(Collectors.toList()))
            .build();
    }

    // TODO refactor to stricter Builder usage (current goal: just make sure all OJP "XML structures of the same" result into same data)
    static ServiceJourney createServiceJourney(@NonNull List<JourneyRefStructure> journeyRefStructures, @NonNull List<ScheduledStopPoint> scheduledStopPoints,
        @NonNull List<ServiceProduct> serviceProducts,
        @NonNull List<Direction> directions, @NonNull List<Notice> notices, @NonNull List<PTSituation> situations, @NonNull ServiceAlteration serviceAlteration,
        List<OperatingPeriod> operatingPeriods) {

        if (journeyRefStructures.isEmpty()) {
            throw new DeveloperException("OJP PTRideLeg has no journeyReference");
        } else if (journeyRefStructures.size() > 1) {
            log.info("unexpected > 1 PTRideLeg::id -> {}", journeyRefStructures);
        }
        return ServiceJourney.builder()
            .id(journeyRefStructures.get(0).getValue())
            // TODO might not be the exact operatingDay!
            .operatingDay(scheduledStopPoints.get(0).getDeparture().getTimeAimed().toLocalDate())
            .stopPoints(scheduledStopPoints)
            .serviceProducts(serviceProducts)
            .directions(directions)
            .notices(notices)
            //.checkConstraints()
            .situations(situations)
            .serviceAlteration(serviceAlteration)
            .operatingPeriods(operatingPeriods == null ? Collections.emptyList() : operatingPeriods)
            //TODO J-A ProductCategory::getTranslation(locale)
            .quayTypeName("Gleis")
            .quayTypeShortName("GL.")
            // TODO .spatialProjection(GeoJsonConverter.toLineString(polylineFormatted))
            .build();
    }

    static TripStatus createTripStatus() {
        return TripStatus.builder()
            /*TODO .valid()
            .cancelled()
            .partiallyCancelled()
            ...
             */
            .build();
    }

    static List<TripViaStructure> mapToViaStops(List<PTViaReference> ptViaReferences) {
        if (CollectionUtils.isEmpty(ptViaReferences)) {
            return null;
        }
        return ptViaReferences.stream()
            .map(ptViaReference -> {
                final TripViaStructure tripViaStructure = new TripViaStructure();
                final PlaceRefStructure placeRefStructure = OJPFactory.createPlaceReferenceStructure(ptViaReference.getStopPlaceId());
                tripViaStructure.setViaPoint(placeRefStructure);
                tripViaStructure.setDwellTime(ptViaReference.getWaittime() == null ? null : Duration.ofMinutes(ptViaReference.getWaittime()));
                if ((ptViaReference.getStatus() != null) && (!PTViaReference.STATUS_BOARDING_ALIGHTING_NECESSARY.equals(ptViaReference.getStatus())) ||
                    (!CollectionUtils.isEmpty(ptViaReference.getTransportModes())) /*||
                    Boolean.TRUE.equals(ptViaReference.getDirect()) ||
                    Boolean.TRUE.equals(ptViaReference.getCouchette()) ||
                    Boolean.TRUE.equals(ptViaReference.getSleepingCar())*/
                ) {
                    throw new NotImplementedException("PTViaReference::stopPlaceId, ::waittime only supported yet");
                }

                return tripViaStructure;
            })
            .toList();
    }

    /**
     * @param transportModes
     * @return including enforced
     */
    static PtModeFilterStructure mapToPtModeFilterStructure(Set<TransportModeEnum> transportModes) {
        if (CollectionUtils.isEmpty(transportModes)) {
            // EnumSet.of(VehicleModesOfTransportEnumeration.ALL, VehicleModesOfTransportEnumeration.ALL_SERVICES);
            return null;
        }

        final EnumSet<VehicleModesOfTransportEnumeration> vehicleModesOfTransportEnumerations = EnumSet.noneOf(VehicleModesOfTransportEnumeration.class);
        for (TransportModeEnum transportModeEnum : transportModes) {
            // TODO mapping needs to be reviewed with Matthias Günter and Andreas Glauser
            switch (transportModeEnum) {
                case REGIO -> {
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.URBAN_RAIL);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.URBAN_RAILWAY_SERVICE);
                }
                case URBAN_TRAIN -> {
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.SUBURBAN_RAIL);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.SUBURBAN_RAILWAY_SERVICE);
                }
                case SHIP -> {
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.WATER);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.FERRY_SERVICE);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.WATER_TRANSPORT_SERVICE);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.WATER_TRANSPORT);
                }
                case BUS -> {
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.BUS);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.BUS_SERVICE);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.TROLLEY_BUS);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.TROLLEY_BUS_SERVICE);
                }
                case TRAMWAY -> {
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.TRAM);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.TRAM_SERVICE);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.METRO);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.METRO_SERVICE);
                }
                case CABLEWAY_GONDOLA_CHAIRLIFT_FUNICULAR -> {
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.FUNICULAR);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.FUNICULAR_SERVICE);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.TELECABIN);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.TELECABIN_SERVICE);
                }
                case HIGH_SPEED_TRAIN, INTERCITY, INTERREGIO -> {
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.RAIL);
                    vehicleModesOfTransportEnumerations.add(VehicleModesOfTransportEnumeration.RAILWAY_SERVICE);
                }
                default ->
                    /* not explicitely searchable yet:
                    VehicleModesOfTransportEnumeration.AIR:
                    VehicleModesOfTransportEnumeration.SELF_DRIVE:
                    VehicleModesOfTransportEnumeration.TAXI:
                    */

                    // case SPECIAL_TRAIN
                    throw new IllegalArgumentException("OJP does not support " + transportModeEnum.name());
            }
        }

        final PtModeFilterStructure ptModeFilterStructure = new PtModeFilterStructure();
        ptModeFilterStructure.withPtMode(vehicleModesOfTransportEnumerations);
        ptModeFilterStructure.setExclude(false);
        return ptModeFilterStructure;
    }

    /**
     * OJP needs ZoneDateTime at request-time unfortunately, where Hafas uses LocalDateTime relativ to requested Place.
     *
     * @param dateTime
     * @return assumed Switzerland for corresponding ZonedDateTime
     */
    static ZonedDateTime mapToSwissDateTime(LocalDateTime dateTime) {
        // TODO find TZ for StopPlace or assume Z(ulu) as returned by OJP?
        return dateTime == null ? DateTimeUtils.createSwissDateTime() : ZonedDateTime.of(dateTime, DateTimeUtils.ZONE_ID_CH);
    }
}