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

import de.vdv.ojp.release2.model.ContinuousLegStructure;
import de.vdv.ojp.release2.model.DatedJourneyStructure;
import de.vdv.ojp.release2.model.LegAlightStructure;
import de.vdv.ojp.release2.model.LegBoardStructure;
import de.vdv.ojp.release2.model.LegIntermediateStructure;
import de.vdv.ojp.release2.model.LegStructure;
import de.vdv.ojp.release2.model.OJP;
import de.vdv.ojp.release2.model.OJPTripDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.release2.model.PlaceRefStructure;
import de.vdv.ojp.release2.model.ResponseContextStructure;
import de.vdv.ojp.release2.model.SituationsStructure;
import de.vdv.ojp.release2.model.TimedLegStructure;
import de.vdv.ojp.release2.model.TransferLegStructure;
import de.vdv.ojp.release2.model.TripResultStructure;
import de.vdv.ojp.release2.model.TripSummaryStructure;
import jakarta.xml.bind.JAXBElement;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import swiss.opentransportdata.ojp.adapter.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.model.place.response.Place;
import swiss.opentransportdata.ojp.adapter.model.schedule.response.OperatingPeriod;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.datedvehiclejourney.response.DatedVehicleJourney;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ScheduledStopPoint;
import swiss.opentransportdata.ojp.adapter.model.trip.response.AccessEnd;
import swiss.opentransportdata.ojp.adapter.model.trip.response.AccessLeg;
import swiss.opentransportdata.ojp.adapter.model.trip.response.ConnectionEnd;
import swiss.opentransportdata.ojp.adapter.model.trip.response.ConnectionLeg;
import swiss.opentransportdata.ojp.adapter.model.trip.response.Leg;
import swiss.opentransportdata.ojp.adapter.model.trip.response.PTRideLeg;
import swiss.opentransportdata.ojp.adapter.model.trip.response.Trip;
import swiss.opentransportdata.ojp.adapter.model.trip.response.TripResponse;
import swiss.opentransportdata.ojp.adapter.model.trip.response.TripSummary;
import swiss.opentransportdata.ojp.adapter.service.api.converter.ServiceJourneyConverter.ModeOJP;
import swiss.opentransportdata.ojp.adapter.service.converter.AbstractConverter;
import swiss.opentransportdata.ojp.adapter.service.error.DeveloperException;

/**
 * Converts OJP {@link TripResponse}.
 *
 * @author Peter Hirzel
 */
@Slf4j
@Component("OJPTripConverter")
class TripConverter extends AbstractConverter<OJP, TripResponse> {

    /**
     * Converter Function (may deal with a single TripV2 or a List of TripV2).
     */

    @Override
    public TripResponse convertToDTO(OJP ojpResponse) {
        if ((ojpResponse == null) || (ojpResponse.getOJPResponse() == null)) {
            throw new DeveloperException("ojpResponse must not be null");
        }

        return mapToTripResponse(ojpResponse);
    }

    /**
     * @param ojpResponseWithTrips containing multiple Trip's
     * @return TripResponse
     */
    private TripResponse mapToTripResponse(OJP ojpResponseWithTrips) throws OJPException {
        log.debug("Converting a response with OJP::version={}", ojpResponseWithTrips.getVersion());

        final OJPTripDeliveryStructure ojpTripDeliveryStructure = OJPAdapter.mapToFirstOJPTripDeliveryStructure(ojpResponseWithTrips);

        final List<Trip> trips = new ArrayList<>();
        // assumption: given for PTRideLeg::origin::departure and destination::arrival (as by Hafas) -> calculate for ConnectionLeg and AccessLeg by their Duration
        for (JAXBElement<?> rest : ojpTripDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() == ResponseContextStructure.class) {
                // some kind of overview?
                final ResponseContextStructure responseContextStructure = (ResponseContextStructure) rest.getValue();
                responseContextStructure.getPlaces().getPlace().forEach(placeStructure -> {
                    if (responseContextStructure.getSituations() != null) {
                        //TODO add situations? See ServiceJourneyConverter::mapToSituations
                        SituationsStructure situationsStructure = responseContextStructure.getSituations();
                        log.debug("situations={}", situationsStructure);
                    }
                    if (placeStructure.getStopPoint() != null) {
                        log.debug("StopPoint::id={}, ::name={}", placeStructure.getStopPoint().getStopPointRef().getValue(), OJPAdapter.getText(placeStructure.getStopPoint().getStopPointName()));
                    } else {
                        // Topographic..
                        log.debug("other location: {}", placeStructure);
                    }
                });
            } else if (rest.getDeclaredType() == TripResultStructure.class) {
                final TripResultStructure tripResultStructure = (TripResultStructure) rest.getValue();
                final List<Leg> legs = new ArrayList<>();
                for (LegStructure legStructure : tripResultStructure.getTrip().getLeg()) {
                    if (legStructure.getTimedLeg() != null) {
                        legs.add(mapToPTRideLeg(legStructure));
                    } else if (legStructure.getContinuousLeg() != null) {
                        legs.add(mapToAccessLeg(legStructure));
                    } else if (legStructure.getTransferLeg() != null) {
                        legs.add(mapToPTConnectionLeg(legStructure));
                    } else {
                        throw new DeveloperException("Unexpected OJP Leg=" + legStructure);
                    }
                }
                log.info("Trip::distance={}, TripSummary::distance={}", tripResultStructure.getTrip().getDistance(),
                    tripResultStructure.getTripSummary() == null ? null : tripResultStructure.getTripSummary().getDistance());
                final List<OperatingPeriod> operatingPeriods = new ArrayList<>();
                if (tripResultStructure.getTrip().getOperatingDays() != null) {
                    //TODO make dependent on TripsByOriginAndDestinationBody::includeOperatingDays
                    operatingPeriods.add(OperatingPeriod.builder()
                        .name(OperatingPeriod.PERIOD_TRIP)
                        .operatingDays(List.of(tripResultStructure.getTrip().getOperatingDays().getFrom().toLocalDate(),
                            tripResultStructure.getTrip().getOperatingDays().getTo().toLocalDate()))
                        // TODO .binary (resultStructure.getTrip().getOperatingDays().getPattern())
                        .build());
                }
                trips.add(Trip.builder()
                    .id(tripResultStructure.getId())
                    .legs(legs)
                    //.alternative(tripV2.isAlternative())
                    //.valid(tripV2.isValid())
                    .fastTransfer(false)
                    .transfers(tripResultStructure.getTrip().getTransfers().intValue())
                    .duration(tripResultStructure.getTrip().getDuration().toString())
                    //.pagingChecksum(tripV2.getScrollCheckSum())
                    //.searchHint(tripV2.getSearchHint())
                    .operatingPeriods(operatingPeriods)
                    //.ecoBalance(tripV2.getEcoBalance())
                    //.archiveReliability(tripV2.getArchivedConnectionReliability() == null ? null : tripV2.getArchivedConnectionReliability().toString())
                    .status(OJPFacade.createTripStatus())
                    .summary(mapToTripSummary(tripResultStructure.getTripSummary()))
                    // resultStructure.getTripFare() -> probably no Data yet

                    .build());
            } else {
                log.debug("skip non-Trip: {}", rest.getDeclaredType());
            }
        }

        return TripResponse.builder()
            //.paginationCursor() //TODO is there any by OJP?
            .trips(trips)
            .build();
    }

    private PTRideLeg mapToPTRideLeg(LegStructure legStructure) {
        final TimedLegStructure timedLegStructure = legStructure.getTimedLeg();

        final List<ScheduledStopPoint> scheduledStopPoints = new ArrayList<>();
        final LegBoardStructure origin = timedLegStructure.getLegBoard();
        scheduledStopPoints.add(ServiceJourneyConverter.createScheduledStopPoint(
            origin.getStopPointName(),
            origin.getStopPointRef(),
            origin.getPlannedQuay(),
            origin.getEstimatedQuay(),
            null,
            null,
            origin.getServiceDeparture() == null ? null : origin.getServiceDeparture().getTimetabledTime(),
            origin.getServiceDeparture() == null ? null : origin.getServiceDeparture().getEstimatedTime(),
            origin.getServiceArrival() == null ? null : origin.getServiceArrival().getTimetabledTime(),
            origin.getServiceArrival() == null ? null : origin.getServiceArrival().getEstimatedTime(),
            origin.getOrder(),
            true,
            false,
            origin.isRequestStop(),
            origin.isUnplannedStop(),
            origin.isNotServicedStop()));

        for (LegIntermediateStructure legIntermediateStructure : timedLegStructure.getLegIntermediate()) {
            scheduledStopPoints.add(
                ServiceJourneyConverter.createScheduledStopPoint(
                    legIntermediateStructure.getStopPointName(),
                    legIntermediateStructure.getStopPointRef(),
                    legIntermediateStructure.getPlannedQuay(),
                    legIntermediateStructure.getEstimatedQuay(),
                    //TODO is departure and arrial same Quay?
                    legIntermediateStructure.getPlannedQuay(),
                    legIntermediateStructure.getEstimatedQuay(),
                    legIntermediateStructure.getServiceDeparture() == null ? null : legIntermediateStructure.getServiceDeparture().getTimetabledTime(),
                    legIntermediateStructure.getServiceDeparture() == null ? null : legIntermediateStructure.getServiceDeparture().getEstimatedTime(),
                    legIntermediateStructure.getServiceArrival() == null ? null : legIntermediateStructure.getServiceArrival().getTimetabledTime(),
                    legIntermediateStructure.getServiceArrival() == null ? null : legIntermediateStructure.getServiceArrival().getEstimatedTime(),
                    legIntermediateStructure.getOrder(),
                    //TODO verify by OJP data
                    true,
                    true,
                    legIntermediateStructure.isRequestStop(),
                    legIntermediateStructure.isUnplannedStop(),
                    legIntermediateStructure.isNotServicedStop()));
        }
        final LegAlightStructure destination = timedLegStructure.getLegAlight();
        scheduledStopPoints.add(ServiceJourneyConverter.createScheduledStopPoint(
            destination.getStopPointName(),
            destination.getStopPointRef(),
            null,
            null,
            destination.getPlannedQuay(),
            destination.getEstimatedQuay(),
            destination.getServiceDeparture() == null ? null : destination.getServiceDeparture().getTimetabledTime(),
            destination.getServiceDeparture() == null ? null : destination.getServiceDeparture().getEstimatedTime(),
            destination.getServiceArrival() == null ? null : destination.getServiceArrival().getTimetabledTime(),
            destination.getServiceArrival() == null ? null : destination.getServiceArrival().getEstimatedTime(),
            destination.getOrder(),
            false,
            true,
            destination.isRequestStop(),
            destination.isUnplannedStop(),
            destination.isNotServicedStop()));

                    /*
                    timedLegStructure.getLegAttribute();
                    timedLegStructure.getOperatingDays();
                    timedLegStructure.getOperatingDaysDescription();
                     */

        final DatedJourneyStructure datedJourneyStructure = timedLegStructure.getService();
        final ModeOJP mode = ServiceJourneyConverter.mapToMode(datedJourneyStructure.getMode());

        return PTRideLeg.builder()
            .mode(mode.getMode())
            .id(legStructure.getId())
            //.distance()
            .duration(null /*"TODO DurationHelper.toDuration(analog LegV2::duration) calculate cause not given toDurationString()"*/)
            // irrelevant resp. implicite by dateTime: <ojp:OperatingDayRef>2022-11-19</ojp:OperatingDayRef>
            .serviceJourney(OJPFacade.createServiceJourney(datedJourneyStructure.getJourneyRef(),
                scheduledStopPoints /*PlaceReferenceHelper.mapToScheduledStopPoints(stops)*/,
                ServiceJourneyConverter.mapToServiceProducts(datedJourneyStructure, mode, (Element) timedLegStructure.getExtension()),
                ServiceJourneyConverter.mapToDirections(datedJourneyStructure),
                ServiceJourneyConverter.mapToNotices(datedJourneyStructure /*NoteConverter.mapNotices(attributes, infos)*/),
                ServiceJourneyConverter.mapToSituations(null),
                ServiceJourneyConverter.mapToServiceAlteration(datedJourneyStructure),
                Collections.emptyList() // Hafas set on Trip but never on PTRideLeg
            ))
            .build();
    }

    private AccessLeg mapToAccessLeg(LegStructure legStructure) {
        final ContinuousLegStructure continuousLegStructure = legStructure.getContinuousLeg();
        return AccessLeg.builder()
            .mode(AccessLeg.ACCESS_MODE_FOOT /*or AccessLeg.ACCESS_MODE_ROAD*/)
            .id(legStructure.getId())
            //.distance(legV2.getDistance())
            .duration(toDurationString(continuousLegStructure.getDuration()))
            .start(createAccessEnd(continuousLegStructure.getLegStart(), continuousLegStructure.getTimeWindowStart()))
            .end(createAccessEnd(continuousLegStructure.getLegEnd(), continuousLegStructure.getTimeWindowEnd()))
            .build();
    }

    private ConnectionLeg mapToPTConnectionLeg(LegStructure legStructure) {
        final TransferLegStructure transferLegStructure = legStructure.getTransferLeg();
        return ConnectionLeg.builder()
            .mode(ConnectionLeg.MODE_TRANSFER)
            .id(legStructure.getId())
            //.distance(legV2.getDistance())
            .duration(toDurationString(transferLegStructure.getDuration()))
            /*TODO
                <ojp:WalkDuration>PT5M</ojp:WalkDuration>
                <ojp:BufferTime>PT28M</ojp:BufferTime>
             */
            .start(createConnectionEnd(transferLegStructure.getLegStart(), transferLegStructure.getTimeWindowStart()))
            .end(createConnectionEnd(transferLegStructure.getLegEnd(), transferLegStructure.getTimeWindowEnd()))
            .notices(List.of(/*TODO <ojp:TransferMode>walk</ojp:TransferMode>*/))
            .build();
    }

    private ConnectionEnd createConnectionEnd(PlaceRefStructure placeRefStructure, ZonedDateTime dateTime) {
        return ConnectionEnd.builder()
            .place(PlaceConverter.createStopPlace(placeRefStructure.getStopPointRef().getValue(),
                placeRefStructure.getName(),
                placeRefStructure.getGeoPosition()))
            .timeAimed(ServiceJourneyConverter.toOffsetDateTime(dateTime))
            .build();
    }

    private AccessEnd createAccessEnd(PlaceRefStructure placeRefStructure, ZonedDateTime dateTime) {
        final Place place;
        if (placeRefStructure.getStopPointRef() != null) {
            place = PlaceConverter.createStopPlace(placeRefStructure.getStopPointRef().getValue(),
                placeRefStructure.getName(),
                placeRefStructure.getGeoPosition());
        } else if (placeRefStructure.getAddressRef() != null) {
            // TODO PlaceConverter.createAddress()
            throw new NotImplementedException("OJP: Address mapping");
        } else if (placeRefStructure.getPointOfInterestRef() != null) {
            // TODO PlaceConverter.createPointOfInterest(placeRefStructure.getPointOfInterestRef().getValue())
            throw new NotImplementedException("OJP: PointOfInterest mapping");
        } else if (placeRefStructure.getTopographicPlaceRef() != null) {
            // TODO ?
            throw new NotImplementedException("OJP: TopographicPlace mapping");
        } else {
            throw new DeveloperException("OJP: Unexpected Place type: " + placeRefStructure);
        }
        return AccessEnd.builder()
            .place(place)
            .timeAimed(ServiceJourneyConverter.toOffsetDateTime(dateTime))
            .build();
    }

    private TripSummary mapToTripSummary(TripSummaryStructure tripSummaryStructure) {
        if (tripSummaryStructure != null) {
            /*TODO return TripSummary.builder()
                //.firstStopPlace(tripSummaryStructure.getOrigin())
                //.lastStopPlace(tripSummaryStructure.getDestination())
                //.duration(tripSummaryStructure.getDuration()) -> on Trip::duration
                //.distance(tripSummaryStructure.getDistance())
                //.operatingDays(tripSummaryStructure.getOperatingDays()) -> on Trip::operatingDays
                .situations(tripSummaryStructure.getSituationFullRef())
                tripSummaryStructure.getExtensions() -> ???
                .build();
             */
        }
        return null;
    }

    /**
     * A refreshed/reconstruction OJP {@link TimedLegStructure} with all stops like a {@link DatedVehicleJourney}.
     *
     * @param ojpResponseWithTripInfo
     * @return complete, refreshed DatedVehicleJourney
     * @throws OJPException
     */
    static DatedVehicleJourney mapToDatedVehicleJourney(OJP ojpResponseWithTripInfo) throws OJPException {
        final OJPTripInfoDeliveryStructure ojpTripInfoDeliveryStructure = OJPAdapter.mapToFirstOJPTripInfoDeliveryStructure(ojpResponseWithTripInfo);

        for (JAXBElement<?> rest : ojpTripInfoDeliveryStructure.getRest()) {
            log.info("OJPTripInfoDeliveryStructure::rest element: {}", rest.getDeclaredType());
            // TODO OJP 2.0
            //            if (rest.getDeclaredType() == ??){
            //                final TripInfoResponseContextStructure ojpTripInfoResponseStructure = ojpTripInfoDeliveryStructure.getTripInfoResponseContext();
            //                final TripInfoResultStructure tripInfoResultStructure = ojpTripInfoDeliveryStructure.getTripInfoResult();
            //                final DatedJourneyStructure datedJourneyStructure = tripInfoResultStructure.getService();
            //                final ModeOJP mode = ServiceJourneyConverter.mapToMode(datedJourneyStructure.getMode());
            //
            //                final List<ScheduledStopPoint> scheduledStopPoints = new ArrayList<>();
            //                for (CallAtStopStructure callAtStopStructure : tripInfoResultStructure.getPreviousCall() /*.PlaceStructure placeStructure : places.getLocation()*/) {
            //                    scheduledStopPoints.add(ServiceJourneyConverter.mapToScheduledStopPoint(callAtStopStructure));
            //                }
            //                for (CallAtStopStructure callAtStopStructure : tripInfoResultStructure.getOnwardCall() /*.PlaceStructure placeStructure : places.getLocation()*/) {
            //                    scheduledStopPoints.add(ServiceJourneyConverter.mapToScheduledStopPoint(callAtStopStructure));
            //                }
            //
            //                return DatedVehicleJourney.builder()
            //                    .serviceJourney(OJPFacade.createServiceJourney(
            //                        datedJourneyStructure.getJourneyRef(),
            //                        scheduledStopPoints,
            //                        ServiceJourneyConverter.mapToServiceProducts(datedJourneyStructure, mode, (Element) tripInfoResultStructure.getExtension()),
            //                        ServiceJourneyConverter.mapToDirections(datedJourneyStructure),
            //                        ServiceJourneyConverter.mapToNotices(datedJourneyStructure),
            //                        ServiceJourneyConverter.mapToSituations(ojpTripInfoResponseStructure.getSituations()),
            //                        ServiceJourneyConverter.mapToServiceAlteration(datedJourneyStructure),
            //                        Collections.emptyList() /*irrelevant for PTRideLeg*/))
            //                    .build();
            //            }
        }
        throw new NotImplementedException("TripInfo");
    }

    /**
     * @param date
     * @param time seconds irrelevant for passenger display
     * @return
     */
    @NonNull
    public static LocalDateTime determineLocalDateTimeOrNow(LocalDate date, LocalTime time) {
        if ((date != null) && (time != null)) {
            return LocalDateTime.of(date, time);
        } else if (date != null) {
            return LocalDateTime.of(date, LocalTime.now());
        } else if (time != null) {
            return LocalDateTime.of(LocalDate.now(), time);
        } else {
            return LocalDateTime.now();
        }
    }

    private static String toDurationString(Duration duration) {
        if (duration == null) {
            return null;
        }
        return duration.toString();
    }
}
