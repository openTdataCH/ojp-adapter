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

import de.vdv.ojp.CallAtStopStructure;
import de.vdv.ojp.ContinuousLegStructure;
import de.vdv.ojp.LegAlightStructure;
import de.vdv.ojp.LegBoardStructure;
import de.vdv.ojp.LegIntermediateStructure;
import de.vdv.ojp.OJPTripDeliveryStructure;
import de.vdv.ojp.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.TimedLegStructure;
import de.vdv.ojp.TransferLegStructure;
import de.vdv.ojp.TripInfoResponseContextStructure;
import de.vdv.ojp.TripInfoResultStructure;
import de.vdv.ojp.TripLegStructure;
import de.vdv.ojp.TripResultStructure;
import de.vdv.ojp.TripSummaryStructure;
import de.vdv.ojp.model.OJP;
import de.vdv.ojp.release2.model.PlaceRefStructure;
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
import swiss.opentransportdata.ojp.adapter.v1.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.v1.converter.JAXBElementContentContainer;

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
        for (TripResultStructure resultStructure : ojpTripDeliveryStructure.getTripResult()) {
            final List<Leg> legs = new ArrayList<>();
            for (TripLegStructure tripLegStructure : resultStructure.getTrip().getTripLeg()) {
                if (tripLegStructure.getTimedLeg() != null) {
                    legs.add(mapToPTRideLeg(tripLegStructure));
                } else if (tripLegStructure.getContinuousLeg() != null) {
                    legs.add(mapToAccessLeg(tripLegStructure));
                } else if (tripLegStructure.getTransferLeg() != null) {
                    legs.add(mapToPTConnectionLeg(tripLegStructure));
                } else {
                    throw new DeveloperException("Unexpected OJP Leg=" + tripLegStructure);
                }
            }
            log.info("Trip::distance={}, TripSummary::distance={}", resultStructure.getTrip().getDistance(),
                resultStructure.getTripSummary() == null ? null : resultStructure.getTripSummary().getDistance());
            final List<OperatingPeriod> operatingPeriods = new ArrayList<>();
            if (resultStructure.getTrip().getOperatingDays() != null) {
                //TODO make dependent on TripsByOriginAndDestinationBody::includeOperatingDays
                operatingPeriods.add(OperatingPeriod.builder()
                    .name(OperatingPeriod.PERIOD_TRIP)
                    .operatingDays(List.of(resultStructure.getTrip().getOperatingDays().getFrom().toLocalDate(),
                        resultStructure.getTrip().getOperatingDays().getTo().toLocalDate()))
                    // TODO .binary (resultStructure.getTrip().getOperatingDays().getPattern())
                    .build());
            }
            trips.add(Trip.builder()
                .id(resultStructure.getResultId())
                .legs(legs)
                //.alternative(tripV2.isAlternative())
                //.valid(tripV2.isValid())
                .fastTransfer(false)
                .transfers(resultStructure.getTrip().getTransfers().intValue())
                .duration(resultStructure.getTrip().getDuration().toString())
                //.pagingChecksum(tripV2.getScrollCheckSum())
                //.searchHint(tripV2.getSearchHint())
                .operatingPeriods(operatingPeriods)
                //.ecoBalance(tripV2.getEcoBalance())
                //.archiveReliability(tripV2.getArchivedConnectionReliability() == null ? null : tripV2.getArchivedConnectionReliability().toString())
                .status(OJPFacade.createTripStatus())
                .summary(mapToTripSummary(resultStructure.getTripSummary()))
                // resultStructure.getTripFare() -> probably no Data yet

                .build());
        }

        return TripResponse.builder()
            //.paginationCursor() //TODO is there any by OJP?
            .trips(trips)
            .build();
    }

    private PTRideLeg mapToPTRideLeg(TripLegStructure tripLegStructure) {
        final TimedLegStructure timedLegStructure = tripLegStructure.getTimedLeg();

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

        for (LegIntermediateStructure legIntermediateStructure : timedLegStructure.getLegIntermediates()) {
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

        final JAXBElementContentContainer serviceContentContainer = new JAXBElementContentContainer(timedLegStructure.getService().getContent());
        final ModeOJP mode = ServiceJourneyConverter.mapToMode(serviceContentContainer.getModes());

        return PTRideLeg.builder()
            .mode(mode.getMode())
            .id(tripLegStructure.getLegId())
            //.distance()
            .duration(null /*"TODO DurationHelper.toDuration(analog LegV2::duration) calculate cause not given toDurationString()"*/)
            // irrelevant resp. implicite by dateTime: <ojp:OperatingDayRef>2022-11-19</ojp:OperatingDayRef>
            .serviceJourney(OJPFacade.createServiceJourney(serviceContentContainer.getJourneyRefs(),
                scheduledStopPoints /*PlaceReferenceHelper.mapToScheduledStopPoints(stops)*/,
                ServiceJourneyConverter.mapToServiceProducts(serviceContentContainer, mode, (Element) timedLegStructure.getExtension()),
                ServiceJourneyConverter.mapToDirections(serviceContentContainer),
                ServiceJourneyConverter.mapToNotices(serviceContentContainer /*NoteConverter.mapNotices(attributes, infos)*/),
                ServiceJourneyConverter.mapToSituations(null),
                ServiceJourneyConverter.mapToServiceAlteration(serviceContentContainer),
                Collections.emptyList() // Hafas set on Trip but never on PTRideLeg
            ))
            .build();
    }

    private AccessLeg mapToAccessLeg(TripLegStructure tripLegStructure) {
        final ContinuousLegStructure continuousLegStructure = tripLegStructure.getContinuousLeg();
        return AccessLeg.builder()
            .mode(AccessLeg.ACCESS_MODE_FOOT /*or AccessLeg.ACCESS_MODE_ROAD*/)
            .id(tripLegStructure.getLegId())
            //.distance(legV2.getDistance())
            .duration(toDurationString(continuousLegStructure.getDuration()))
            .start(createAccessEnd(continuousLegStructure.getLegStart(), continuousLegStructure.getTimeWindowStart()))
            .end(createAccessEnd(continuousLegStructure.getLegEnd(), continuousLegStructure.getTimeWindowEnd()))
            .build();
    }

    private ConnectionLeg mapToPTConnectionLeg(TripLegStructure tripLegStructure) {
        final TransferLegStructure transferLegStructure = tripLegStructure.getTransferLeg();
        return ConnectionLeg.builder()
            .mode(ConnectionLeg.MODE_TRANSFER)
            .id(tripLegStructure.getLegId())
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

    private ConnectionEnd createConnectionEnd(de.vdv.ojp.release2.model.PlaceRefStructure placeRefStructure, ZonedDateTime dateTime) {
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

        final TripInfoResponseContextStructure ojpTripInfoResponseStructure = ojpTripInfoDeliveryStructure.getTripInfoResponseContext();
        final TripInfoResultStructure tripInfoResultStructure = ojpTripInfoDeliveryStructure.getTripInfoResult();
        final JAXBElementContentContainer serviceContentContainer = new JAXBElementContentContainer(tripInfoResultStructure.getService().getContent());
        final ModeOJP mode = ServiceJourneyConverter.mapToMode(serviceContentContainer.getModes());

        final List<ScheduledStopPoint> scheduledStopPoints = new ArrayList<>();
        for (CallAtStopStructure callAtStopStructure : tripInfoResultStructure.getPreviousCall() /*.PlaceStructure placeStructure : places.getLocation()*/) {
            scheduledStopPoints.add(ServiceJourneyConverter.mapToScheduledStopPoint(callAtStopStructure));
        }
        for (CallAtStopStructure callAtStopStructure : tripInfoResultStructure.getOnwardCall() /*.PlaceStructure placeStructure : places.getLocation()*/) {
            scheduledStopPoints.add(ServiceJourneyConverter.mapToScheduledStopPoint(callAtStopStructure));
        }

        return DatedVehicleJourney.builder()
            .serviceJourney(OJPFacade.createServiceJourney(
                serviceContentContainer.getJourneyRefs(),
                scheduledStopPoints,
                ServiceJourneyConverter.mapToServiceProducts(serviceContentContainer, mode, (Element) tripInfoResultStructure.getExtension()),
                ServiceJourneyConverter.mapToDirections(serviceContentContainer),
                ServiceJourneyConverter.mapToNotices(serviceContentContainer),
                ServiceJourneyConverter.mapToSituations(ojpTripInfoResponseStructure.getSituations()),
                ServiceJourneyConverter.mapToServiceAlteration(serviceContentContainer),
                Collections.emptyList() /*irrelevant for PTRideLeg*/))
            .build();
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
