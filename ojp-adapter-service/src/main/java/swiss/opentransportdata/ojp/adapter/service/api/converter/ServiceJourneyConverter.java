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

import de.vdv.ojp.CallAtNearStopStructure;
import de.vdv.ojp.CallAtStopStructure;
import de.vdv.ojp.GeneralAttributeStructure;
import de.vdv.ojp.InternationalTextStructure;
import de.vdv.ojp.ModeStructure;
import de.vdv.ojp.OJPStopEventDeliveryStructure;
import de.vdv.ojp.SituationsStructure;
import de.vdv.ojp.StopEventResultStructure;
import de.vdv.ojp.StopEventStructure;
import de.vdv.ojp.model.OJP;
import de.vdv.ojp.model.StopPointRefStructure;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import swiss.opentransportdata.ojp.adapter.OJPException;
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
import swiss.opentransportdata.ojp.adapter.v1.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.v1.converter.JAXBElementContentContainer;
import uk.org.ifopt.ifopt.Extensions;

/**
 * @author Peter Hirzel
 */
@Slf4j
@Component("OJPDepartureConverter")
class ServiceJourneyConverter extends AbstractConverter<OJP, List<ServiceJourney>> {

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
        for (StopEventResultStructure stopEventResultStructure : ojpStopEventDeliveryStructure.getStopEventResult()) {
            final List<ScheduledStopPoint> scheduledStopPoints = new ArrayList<>();
            final StopEventStructure stopEventStructure = stopEventResultStructure.getStopEvent();
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

            final JAXBElementContentContainer serviceContentContainer = new JAXBElementContentContainer(stopEventStructure.getService().getContent());
            final ModeOJP mode = mapToMode(serviceContentContainer.getModes());
            serviceJourneys.add(OJPFacade.createServiceJourney(
                serviceContentContainer.getJourneyRefs(),
                scheduledStopPoints,
                mapToServiceProducts(serviceContentContainer, mode, (Element) stopEventStructure.getExtension()),
                mapToDirections(serviceContentContainer),
                mapToNotices(serviceContentContainer),
                mapToSituations(null /*TODO seems not contained*/),
                mapToServiceAlteration(serviceContentContainer),
                Collections.emptyList() /*TODO operatingDays*/));
        }

        return serviceJourneys;
    }

    static ScheduledStopPoint mapToScheduledStopPoint(CallAtStopStructure callAtStopStructure) {
        return createScheduledStopPoint(callAtStopStructure.getStopPointName(), callAtStopStructure.getStopPointRef(),
            //TODO OJP seems not to distinguish between departure/arrival quay
            callAtStopStructure.getPlannedQuay(), callAtStopStructure.getEstimatedQuay(), callAtStopStructure.getPlannedQuay(), callAtStopStructure.getEstimatedQuay(),
            // TODO not foreseen yet: callAtStopStructure.getServiceDeparture/Arrival().getEstimatedTimeHigh/Low()
            callAtStopStructure.getServiceDeparture() == null ? null : callAtStopStructure.getServiceDeparture().getTimetabledTime(),
            callAtStopStructure.getServiceDeparture() == null ? null : callAtStopStructure.getServiceDeparture().getEstimatedTime(),
            callAtStopStructure.getServiceArrival() == null ? null : callAtStopStructure.getServiceArrival().getTimetabledTime(),
            callAtStopStructure.getServiceArrival() == null ? null : callAtStopStructure.getServiceArrival().getEstimatedTime(),
            callAtStopStructure.getOrder(),
            // TODO seems not given -> correct? also map Quay::swissLocationId
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

        // TODO if times are estimated there is further attributes in OJP
        final String uic = stopPointRef.getValue();
        final Quay arrivalQuayAimed = mapToQuay(uic, arrivalPlannedQuay);
        final Quay arrivalQuayRt = mapToQuay(uic, arrivalEstimatedQuay);
        final StopCall arrival = ScheduledStopPointConverter.createStopCall(toOffsetDateTime(arrivalTimeAimed), toDateTimeRt(arrivalTimeAimed, arrivalTimeRt),
            /*TODO DelayHelper.displayableDelayToText(boolean effectively, @NonNull JourneySegment segment, int stopIndex, boolean arrival, Locale locale)*/ null,
            arrivalQuayAimed, arrivalQuayRt,
            StopPlaceHelper.hasPlatformChanged(arrivalQuayAimed == null ? null : arrivalQuayAimed.getName(), arrivalQuayRt == null ? null : arrivalQuayRt.getName()),
            null, null);
        final Quay departureQuayAimed = mapToQuay(uic, departurePlannedQuay);
        final Quay departureQuayRt = mapToQuay(uic, departureEstimatedQuay);
        final StopCall departure = ScheduledStopPointConverter.createStopCall(toOffsetDateTime(departureTimeAimed), toDateTimeRt(departureTimeAimed, departureTimeRt),
            /*TODO DelayHelper.displayableDelayToText(boolean effectively, @NonNull JourneySegment segment, int stopIndex, boolean arrival, Locale locale)*/ null,
            departureQuayAimed, departureQuayRt,
            StopPlaceHelper.hasPlatformChanged(departureQuayAimed == null ? null : departureQuayAimed.getName(), departureQuayRt == null ? null : departureQuayRt.getName()),
            null, null);
        return ScheduledStopPoint.builder()
            .place(StopPlace.builder()
                .id(uic)
                .name(OJPAdapter.getText(stopPointName))
                //.province(stopV2.getCantonCH())
                //.centroid(GeoJsonConverter.toPoint(stopV2))
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

    static List<Notice> mapToNotices(JAXBElementContentContainer contentContainer) {
        final List<Notice> notices = new ArrayList<>(contentContainer.getGeneralAttributes().size());
        for (GeneralAttributeStructure attributeStructure : contentContainer.getGeneralAttributes()) {
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
                        .template(OJPAdapter.getText(attributeStructure.getText()))
                        .arguments(new LinkedTextMap())
                        .build())
                    .priority(Notice.DEFAULT_PRIORITY)
                    //.routeIndexFrom()
                    //.routeIndexTo()
                    .build());
            } else if (attributeStructure.getCode().contains("InfoCall")) {
                if (attributeStructure.getText().getText().getValue().contains("Aussteigeseite")) {
                /*TODO set on each ScheduledStopPoint::exitSide:
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
        return QuayConverter.mapToQuay(stopPlaceId, translation, null /*TODO swissLocationId*/);
    }

    static List<ServiceProduct> mapToServiceProducts(JAXBElementContentContainer serviceContentContainer, ModeOJP mode, Element extension) {
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
        for (int i = 0; i < serviceContentContainer.getOperators().size(); i++) {
            final String line = OJPAdapter.removeOjpPrefix(serviceContentContainer.getLines().get(i).getValue());
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
                    .id(OperatorHelper.padLeadingZerosIfNumeric(OJPAdapter.removeOjpPrefix(serviceContentContainer.getOperators().get(i).getValue())))
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
        }
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
    static List<Direction> mapToDirections(JAXBElementContentContainer serviceContentContainer) {
        return serviceContentContainer.getDestinationTexts().stream()
            .map(directionText -> Direction.builder()
                .name(directionText)
                //.routeIndexFrom()
                //.routeIndexTo()
                .build())
            .collect(Collectors.toList());

        /* TODO ? data makes no sense yet ?
        final List<Direction> directions = new ArrayList<>();
        for (DirectionRefStructure directionRefStructure : serviceContentContainer.getDirections()) {
            directions.add(Direction.builder()
            .name(directionRefStructure.getValue())
                //.routeIndexFrom()
                //.routeIndexTo()
            .build());
        }
        return directions;
         */
    }

    static ServiceAlteration mapToServiceAlteration(JAXBElementContentContainer serviceContentContainer) {
        return ServiceAlteration.builder()
            .redirected(Boolean.TRUE.equals(serviceContentContainer.getDeviation()))
            //TODO others
            .build();
    }

    static List<PTSituation> mapToSituations(SituationsStructure situations) {
        if (situations != null) {
            //TODO OJP might not have something like HIM
            log.info("not mapped yet: PTSituation's: {}", situations);
        }
        return new ArrayList<>();
    }

    private static String extractExtensionTextContext(Extensions extensions, String localTagName) {
        final NodeList nodes = extensions.getAny().get(0).getElementsByTagName(OJPAdapter.OJP_NAMESPACE + localTagName);
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

    static ModeOJP mapToMode(List<ModeStructure> modesNeTex) {
        if (modesNeTex.isEmpty()) {
            throw new DeveloperException("Unexpected no NeTex MODE");
        } else if (modesNeTex.size() > 1) {
            log.info("NeTex modes::size > 1");
        }
        //modesNeTex.get(0).get*Submode();

        final String ptMode = TransportModeData.mapToTransportMode(modesNeTex.get(0).getPtMode().name());
        return ModeOJP.builder()
            .mode(ptMode)
            .subMode(TransportModeData.NETEX_VEHICLE_MODE_RAIL.equals(ptMode) ? modesNeTex.get(0).getRailSubmode().name() : "TODO")
            .shortName(OJPAdapter.getText(modesNeTex.get(0).getShortName()))
            .nameTranslated(OJPAdapter.getText(modesNeTex.get(0).getName()))
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
