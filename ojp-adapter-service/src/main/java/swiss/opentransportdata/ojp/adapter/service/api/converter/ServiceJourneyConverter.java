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

import de.vdv.ojp.release2.model.CallAtNearStopStructure;
import de.vdv.ojp.release2.model.CallAtStopStructure;
import de.vdv.ojp.release2.model.DatedJourneyStructure;
import de.vdv.ojp.release2.model.GeneralAttributeStructure;
import de.vdv.ojp.release2.model.InternationalTextStructure;
import de.vdv.ojp.release2.model.ModeStructure;
import de.vdv.ojp.release2.model.OJP;
import de.vdv.ojp.release2.model.OJPStopEventDeliveryStructure;
import de.vdv.ojp.release2.model.SituationFullRefStructure;
import de.vdv.ojp.release2.model.SituationRefList;
import de.vdv.ojp.release2.model.StopEventResultStructure;
import de.vdv.ojp.release2.model.StopEventStructure;
import jakarta.xml.bind.JAXBElement;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import swiss.opentransportdata.ojp.adapter.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Direction;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.LinkedText;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.LinkedTextMap;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Notice;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.NoticeType;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Operator;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Quay;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ScheduledStopPoint;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceAlteration;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourney;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceProduct;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.StopCall;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.VehicleMode;
import swiss.opentransportdata.ojp.adapter.model.situation.response.PTSituation;
import swiss.opentransportdata.ojp.adapter.service.converter.AbstractConverter;
import swiss.opentransportdata.ojp.adapter.service.error.DeveloperException;
import swiss.opentransportdata.ojp.adapter.service.opentransportdata.transportmode.TransportModeData;
import uk.org.ifopt.ifopt.Extensions;
import uk.org.siri.siri.StopPointRefStructure;

/**
 * @author Peter Hirzel
 */
@Slf4j
@Component("OJPDepartureConverter")
class ServiceJourneyConverter implements AbstractConverter<OJP, List<ServiceJourney>> {

    @Override
    public List<ServiceJourney> convertToDTO(OJP ojpResponseWithStopEvent) {
        if ((ojpResponseWithStopEvent == null) || (ojpResponseWithStopEvent.getOJPResponse() == null)) {
            throw new DeveloperException("ojpResponse not complete: " + ojpResponseWithStopEvent);
        }
        return mapToServiceJourneys(ojpResponseWithStopEvent);
    }

    private List<ServiceJourney> mapToServiceJourneys(OJP ojpResponse) throws OJPException {
        final OJPStopEventDeliveryStructure ojpStopEventDeliveryStructure = OJPAdapter.mapToFirstOJPStopEventDeliveryStructure(ojpResponse);

        final List<ServiceJourney> serviceJourneys = new ArrayList<>();
        for (JAXBElement<?> rest : ojpStopEventDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() != StopEventResultStructure.class) {
                log.debug("skip non-StopEventResultStructure: {}", rest.getDeclaredType());
                continue;
            }

            final StopEventStructure stopEventStructure = ((StopEventResultStructure) rest.getValue()).getStopEvent();
            final List<ScheduledStopPoint> scheduledStopPoints = new ArrayList<>();
            // StopPoint's before requested StopPlace::id (case arrival)
            for (CallAtNearStopStructure callAtNearStopStructure : stopEventStructure.getPreviousCall()) {
                scheduledStopPoints.add(mapToScheduledStopPoint(callAtNearStopStructure.getCallAtStop()));
            }
            // requested StopPlace::id
            final CallAtStopStructure callAtStopStructure = stopEventStructure.getThisCall().getCallAtStop();
            scheduledStopPoints.add(mapToScheduledStopPoint(callAtStopStructure));
            // StopPoint's after requested StopPlace::id (case departure)
            for (CallAtNearStopStructure callAtNearStopStructure : stopEventStructure.getOnwardCall()) {
                scheduledStopPoints.add(mapToScheduledStopPoint(callAtNearStopStructure.getCallAtStop()));
            }

            serviceJourneys.add(OJPFacade.createServiceJourney(stopEventStructure.getService(),
                scheduledStopPoints,
                (Element) stopEventStructure.getExtension()));
        }

        return serviceJourneys;
    }

    static ScheduledStopPoint mapToScheduledStopPoint(CallAtStopStructure callAtStopStructure) {
        return createScheduledStopPoint(callAtStopStructure.getStopPointName(), callAtStopStructure.getStopPointRef(),
            //TODO OJP 2.0 seems not to distinguish between departure/arrival quay
            callAtStopStructure.getPlannedQuay(), callAtStopStructure.getEstimatedQuay(), callAtStopStructure.getPlannedQuay(), callAtStopStructure.getEstimatedQuay(),
            // TODO OJP 2.0 not foreseen yet: callAtStopStructure.getServiceDeparture/Arrival().getEstimatedTimeHigh/Low()
            callAtStopStructure.getServiceDeparture() == null ? null : callAtStopStructure.getServiceDeparture().getTimetabledTime(),
            callAtStopStructure.getServiceDeparture() == null ? null : callAtStopStructure.getServiceDeparture().getEstimatedTime(),
            callAtStopStructure.getServiceArrival() == null ? null : callAtStopStructure.getServiceArrival().getTimetabledTime(),
            callAtStopStructure.getServiceArrival() == null ? null : callAtStopStructure.getServiceArrival().getEstimatedTime(),
            callAtStopStructure.getOrder(),
            // TODO OJP 2.0 seems not given -> correct? also map Quay::swissLocationId
            callAtStopStructure.getServiceDeparture() != null,
            callAtStopStructure.getServiceArrival() != null,
            callAtStopStructure.isRequestStop(), callAtStopStructure.isUnplannedStop(), callAtStopStructure.isNotServicedStop());
    }

    static ScheduledStopPoint createScheduledStopPoint(
        InternationalTextStructure stopPointName,
        StopPointRefStructure stopPointRef,
        InternationalTextStructure departurePlannedQuay,
        InternationalTextStructure departureEstimatedQuay,
        InternationalTextStructure arrivalPlannedQuay,
        InternationalTextStructure arrivalEstimatedQuay,
        ZonedDateTime departureTimeAimed,
        ZonedDateTime departureTimeRt,
        ZonedDateTime arrivalTimeAimed,
        ZonedDateTime arrivalTimeRt,
        BigInteger routeIndex,
        Boolean isBoarding,
        Boolean isAlighting,
        Boolean isRequestStop,
        Boolean isUnplannedStop,
        Boolean isNotServicedStop
    ) {
        StopStatus stopStatus = StopStatus.PLANNED;
        if (Boolean.TRUE.equals(isUnplannedStop)) {
            stopStatus = StopStatus.UNPLANNED;
        } else if (Boolean.TRUE.equals(isNotServicedStop)) {
            stopStatus = StopStatus.NOT_SERVICED;
        }

        // TODO OJP 2.0 if times are estimated there are further attributes
        final String uic = stopPointRef.getValue();
        final Quay arrivalQuayAimed = mapToQuay(uic, arrivalPlannedQuay);
        final Quay arrivalQuayRt = mapToQuay(uic, arrivalEstimatedQuay);
        final StopCall arrival = ScheduledStopPointConverter.createStopCall(toOffsetDateTime(arrivalTimeAimed), toDateTimeRt(arrivalTimeAimed, arrivalTimeRt),
            /*TODO OJP 2.0 DelayHelper.displayableDelayToText(boolean effectively, @NonNull JourneySegment segment, int stopIndex, boolean arrival, Locale locale)*/ null,
            arrivalQuayAimed, arrivalQuayRt,
            StopPlaceHelper.hasPlatformChanged(arrivalQuayAimed == null ? null : arrivalQuayAimed.getName(), arrivalQuayRt == null ? null : arrivalQuayRt.getName()),
            null, null);
        final Quay departureQuayAimed = mapToQuay(uic, departurePlannedQuay);
        final Quay departureQuayRt = mapToQuay(uic, departureEstimatedQuay);
        final StopCall departure = ScheduledStopPointConverter.createStopCall(toOffsetDateTime(departureTimeAimed), toDateTimeRt(departureTimeAimed, departureTimeRt),
            /*TODO OJP 2.0 DelayHelper.displayableDelayToText(boolean effectively, @NonNull JourneySegment segment, int stopIndex, boolean arrival, Locale locale)*/ null,
            departureQuayAimed, departureQuayRt,
            StopPlaceHelper.hasPlatformChanged(departureQuayAimed == null ? null : departureQuayAimed.getName(), departureQuayRt == null ? null : departureQuayRt.getName()),
            null, null);
        return ScheduledStopPoint.builder()
            .place(StopPlace.builder()
                .id(uic)
                .name(OJPAdapter.getText(stopPointName))
                //.province(stop.getCantonCH())
                //.centroid(GeoJsonConverter.toPoint(stop))
                //.tariffBorder(false)
                //.distanceToSearchPosition(null)
                //.weighting(null)
                //.links(PlaceConverter.createStopPlaceLinks(uic))
                .build())
            .arrival(arrival)
            .departure(departure)
            .routeIndex(routeIndex == null ? -1 /*should not happen*/ : routeIndex.intValue())
            .stopStatus(stopStatus.name())
            //.stopStatusFormatted(BusinessTextTranslator.getStopstatusFormattedText(stopStatus, null /*TODO response Locale*/))
            .forBoarding(isBoarding)
            .forAlighting(isAlighting)
            //.accessibilityBoardingAlighting(stopV2.getAccessibilityMostRelevant() == null ? null : stopV2.getAccessibilityMostRelevant().name())

            .occupancyFirstClass(Occupancy.UNKNOWN.name() /*TODO if given*/)
            .occupancySecondClass(Occupancy.UNKNOWN.name() /*TODO if given*/)
            // if (!isStopPlace) -> empty-set
            // /routes -> .exitSide(
            //.rank(stopV2.getRank())
            .requestStop(Boolean.TRUE.equals(isRequestStop))
            .build();
    }

    /**
     * Number is never shown in ::nameFormatted
     *
     * @return BR adapted ServiceProduct::nameFormatted for certain {@link VehicleMode#getVehicleSubModeShortName()}.
     */
    @NonNull
    public static String adaptServiceProductNameFormatted(@NonNull String subModeShortName, String line) {
        return subModeShortName + " " + (line == null ? StringUtils.EMPTY : line);
    }

    static List<Notice> mapToNotices(DatedJourneyStructure datedJourneyStructure) {
        final List<Notice> notices = new ArrayList<>(datedJourneyStructure.getAttribute().size());
        for (GeneralAttributeStructure attributeStructure : datedJourneyStructure.getAttribute()) {
            if (attributeStructure.getCode().startsWith(OJPAdapter.NOTICE_ATTRIBUTE_PREFIX)) {
                String key = attributeStructure.getCode().substring(OJPAdapter.NOTICE_ATTRIBUTE_PREFIX.length());
                if (key.startsWith("_")) {
                    // Hafas sends space as 2nd char where OJP sends "_?"
                    key = key.substring(1) + " ";
                }
                notices.add(Notice.builder()
                    .type(NoticeType.ATTRIBUTE)
                    .name(key)
                    .text(LinkedText.builder()
                        .template(OJPAdapter.getText(attributeStructure.getUserText()))
                        .arguments(new LinkedTextMap())
                        .build())
                    .priority(Notice.DEFAULT_PRIORITY)
                    //.routeIndexFrom()
                    //.routeIndexTo()
                    .build());
            } else if (attributeStructure.getCode().contains("InfoCall")) {
                if (attributeStructure.getUserText().getText().getFirst().getValue().contains("Aussteigeseite")) {
                /*TODO OJP 2.0 set on each ScheduledStopPoint::exitSide:
                   "[code=ojp91006HR_InfoCall450_106514_1,text=[text=[lang=de,value=Aussteigeseite: Rechts]]]"
                   "[code=ojp91006HR_InfoCall450_111055_1,text=[text=[lang=de,value=Aussteigeseite: Links]]]"
                 */
                } else {
                    log.info("not mapped yet: InfoCall {}", attributeStructure);
                }
            } else {
                log.info("not mapped yet: {}", attributeStructure);
            }
        }
        return notices;
    }

    static Quay mapToQuay(String stopPlaceId, InternationalTextStructure quay) {
        final String translation = OJPAdapter.getText(quay);
        if (translation == null) {
            return null;
        }
        return QuayConverter.mapToQuay(stopPlaceId, translation, null /*TODO OJP 2.0 swissLocationId*/);
    }

    static List<ServiceProduct> mapToServiceProducts(DatedJourneyStructure datedJourneyStructure, ModeOJP mode, Element extension) {
        String transportTypeName = null;
        String publishedJourneyNumber = null;
        String operatorName = null;
        if (extension != null) {
            // TripLeg::extension -> not ojpResponseWithTripResponse.getExtensions()
            final Extensions extensions = (new Extensions()).withAny(extension);
            transportTypeName = extractExtensionTextContext(extensions, "TransportTypeName");
            publishedJourneyNumber = extractExtensionTextContext(extensions, "PublishedJourneyNumber");
            operatorName = extractExtensionTextContext(extensions, "OperatorName");
        }

        final List<ServiceProduct> serviceProducts = new ArrayList<>();

        final String line = OJPAdapter.removeOjpPrefix(datedJourneyStructure.getLineRef().getValue());
        final String name = mode.getShortName()/* BR: ignore serviceContentContainer.getPublishedLineNames() like "IC61", because has not spaces*/ + " " + line +
            (publishedJourneyNumber == null ? "" : " " + publishedJourneyNumber);
        final String nameFormatted = adaptServiceProductNameFormatted(mode.getShortName(), line);
        serviceProducts.add(ServiceProduct.builder()
            // TODO test handling multi products
            .name(name)
            .nameFormatted(nameFormatted)
            .line(line)
            //.lineId(?)
            .number(publishedJourneyNumber)
            .operator(Operator.builder()
                .id(OperatorHelper.padLeadingZerosIfNumeric(OJPAdapter.removeOjpPrefix(datedJourneyStructure.getOperatorRef().getValue())))
                .name(operatorName)
                .build())
            .vehicleMode(VehicleMode.builder()
                .id(mode.getMode())
                .name(mode.getNameTranslated())
                .corporateIdentityIcon(mode.getCorporateIdentityIcon())
                .vehicleSubModeName(transportTypeName)
                .vehicleSubModeShortName(mode.getShortName())
                .build())
            //.routeIndexFrom(?)
            //.routeIndexTo(?)
            .corporateIdentityIcon(toSubModeIcon(nameFormatted))
            .build());

        return serviceProducts;
    }

    /**
     * @return BR adapted ServiceProduct::corporateIdentityIcon for certain {@link VehicleMode#getVehicleSubModeShortName()}.
     */
    static String toSubModeIcon(String nameFormatted) {
        return null;

        /*
        final String tmp = nameFormatted.replace(' ', '-');
        if (tmp.equals(TRAIN_SUBMODE_PE) || tmp.startsWith(TRAIN_SUBMODE_PE + "-")) {
            return tmp.replace(TRAIN_SUBMODE_PE, "Frame 4, pe");
        }
        if (tmp.equals(TRAIN_SUBMODE_EVT) || tmp.startsWith(TRAIN_SUBMODE_EVT + "-")) {
            return tmp.replace(TRAIN_SUBMODE_EVT, "ev");
        }
        return tmp.toLowerCase();
         */
    }

    /**
     * Matthias Günter: Die Richtung ist in die JourneyRef reinkodiert (eines der :H] H=Hin R=Rück. Aber soll man nicht interpretieren.
     * <code>
     * <ojp:JourneyRef>ojp:91036:Y:H:j22:1:9206</ojp:JourneyRef> <siri:LineRef>ojp:91036:Y</siri:LineRef> <siri:DirectionRef>H</siri:DirectionRef>
     * </code>
     *
     * @see de.vdv.ojp.model.DirectionRefStructure
     */
    static List<Direction> mapToDirections(DatedJourneyStructure datedJourneyStructure) {
        if (datedJourneyStructure.getDestinationText() == null) {
            throw new OJPException("Unexpected DatedJourneyStructure::destinationText empty: " + datedJourneyStructure);
        }
        return List.of(Direction.builder()
            .name(OJPAdapter.getText(datedJourneyStructure.getDestinationText()))
            //.routeIndexFrom()
            //.routeIndexTo()
            .build());
    }

    static ServiceAlteration mapToServiceAlteration(DatedJourneyStructure datedJourneyStructure) {
        return ServiceAlteration.builder()
            .cancelled(Boolean.TRUE.equals(datedJourneyStructure.isCancelled()))
            .redirected(Boolean.TRUE.equals(datedJourneyStructure.isDeviation()))
            .delayFormatted(Boolean.TRUE.equals(datedJourneyStructure.isUndefinedDelay()) ? "Undefined delay" : null)
            .unplannedStopPointsFormatted(Boolean.TRUE.equals(datedJourneyStructure.isUnplanned()) ? ModelDoc.UNPLANNED_STOPS_FORMATTED_SAMPLE : null)
            //TODO OJP 2.0 others ::partiallyCancelled ::isRestricted,..
            .build();
    }

    static List<PTSituation> mapToSituations(SituationRefList situationRefList) {
        if (situationRefList != null) {
            for (SituationFullRefStructure situationFullRefStructure : situationRefList.getSituationFullRef()) {
                //TODO OJP 2.0, see TripConverter::mapToTripResponse
                log.info("not mapped yet: PTSituation's: {}", situationFullRefStructure);
            }
        }
        return new ArrayList<>();
    }

    private static String extractExtensionTextContext(Extensions extensions, String localTagName) {
        final NodeList nodes = extensions.getAny().getFirst().getElementsByTagName(OJPAdapter.OJP_NAMESPACE + localTagName);
        if (nodes.getLength() == 0) {
            return null;
        }
        if (nodes.getLength() > 1) {
            log.info("ifopt Extensions for localTagName={} > 1, fallback to first of {}", localTagName, nodes);
        }

        final Node node = nodes.item(0);
        if ("http://www.vdv.de/ojp".equals(node.getNamespaceURI()) && localTagName.equals(node.getLocalName())) {
            final NodeList textNodes = ((Element) node).getElementsByTagName(OJPAdapter.OJP_NAMESPACE + "Text");
            if (textNodes.getLength() == 0) {
                log.info("localTagName={} Node given, but no data in {}", localTagName, node);
                return null;
            }
            if (textNodes.getLength() > 1) {
                log.warn("localTagName={} > 1 TextContent, fallback to first of {}", localTagName, textNodes);
            }
            return StringUtils.trim(textNodes.item(0).getFirstChild().getTextContent());
        }

        log.info("developer fault: extracting localTagName={} from {}", localTagName, node);
        return null;
    }

    static OffsetDateTime toDateTimeRt(ZonedDateTime dateTimePlanned, ZonedDateTime dateTimeRt) {
        if (dateTimeRt == null) {
            return null;
        }
        if (dateTimeRt.equals(dateTimePlanned)) {
            // OJP seems to set Rt equal to planned if no delta
            return null;
        }
        return toOffsetDateTime(dateTimeRt);
    }

    static OffsetDateTime toOffsetDateTime(ZonedDateTime zonedDateTime) {
        // TODO is "Zulu=0" NOK for Switzerland
        return zonedDateTime == null ? null : zonedDateTime.toOffsetDateTime();
    }

    static ModeOJP mapToMode(ModeStructure modeNeTex) {
        final String mode = TransportModeData.mapToTransportMode(modeNeTex.getPtMode().name());
        return ModeOJP.builder()
            .mode(mode)
            .subMode(TransportModeData.NETEX_VEHICLE_MODE_RAIL.equals(mode) ? modeNeTex.getRailSubmode().name() : "TODO")
            .shortName(OJPAdapter.getText(modeNeTex.getShortName()))
            .nameTranslated(OJPAdapter.getText(modeNeTex.getName()))
            .corporateIdentityIcon(/*TODO hardcoded*/ "SBB_oev_b_t02")
            .build();
    }

    @Builder
    @Value
    static class ModeOJP {

        String mode;
        String subMode;
        String shortName;
        String nameTranslated;
        // String description
        String corporateIdentityIcon;
    }
}
