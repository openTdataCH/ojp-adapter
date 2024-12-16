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

package swiss.opentransportdata.ojp.adapter.v1;

import static org.assertj.core.api.Assertions.assertThat;

import de.vdv.ojp.DatedJourneyStructure;
import de.vdv.ojp.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.OJPStopEventDeliveryStructure;
import de.vdv.ojp.OJPTripDeliveryStructure;
import de.vdv.ojp.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.SituationsStructure;
import de.vdv.ojp.StopEventResultStructure;
import de.vdv.ojp.StopEventStructure;
import de.vdv.ojp.TripInfoResultStructure;
import de.vdv.ojp.TripLegStructure;
import de.vdv.ojp.TripResponseContextStructure;
import de.vdv.ojp.TripResultStructure;
import de.vdv.ojp.TripStructure;
import de.vdv.ojp.model.OJP;
import de.vdv.ojp.model.ServiceDeliveryErrorConditionStructure;
import de.vdv.ojp.release2.model.AddressStructure;
import de.vdv.ojp.release2.model.PlaceResultStructure;
import de.vdv.ojp.release2.model.PlaceStructure;
import de.vdv.ojp.release2.model.PlaceTypeEnumeration;
import de.vdv.ojp.release2.model.PointOfInterestStructure;
import de.vdv.ojp.release2.model.StopPlaceStructure;
import jakarta.xml.bind.JAXBElement;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.OJPTestProfile;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAccessor;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAdapterServiceConfiguration;
import swiss.opentransportdata.ojp.adapter.v1.PlaceRequestFilter.Point;
import swiss.opentransportdata.ojp.adapter.v1.converter.JAXBElementContentContainer;
import uk.org.siri.siri.LocationStructure;

/**
 * Integration-Test.
 * <p>
 * Data may differ between OJP passive and active instance.
 */
@Slf4j
@OJPTestProfile
class OJPAdapterAccessTest {

    @Autowired
    private OJPAdapterServiceConfiguration configuration;
    @Autowired
    private OJPAdapter ojpAdapter;

    @Test
    void requestPlaces_passive_PlaceType_ALL() throws OJPException {
        final de.vdv.ojp.release2.model.OJP ojpResponse = ojpAdapter.requestPlaces(configuration.ojpAccessPassive(),
            PlaceRequestFilter.builder()
                .preferredLanguage(Locale.GERMAN)
                .placeTypes(Set.of(de.vdv.ojp.release2.model.PlaceTypeEnumeration.STOP, de.vdv.ojp.release2.model.PlaceTypeEnumeration.POI, de.vdv.ojp.release2.model.PlaceTypeEnumeration.ADDRESS))
                .placeName("Olten")
                .build());
        assertResponseOJP2(ojpResponse);
    }

    @Test
    void requestPlaces_passive_StopPlace() throws OJPException {
        requestStopPlaces(configuration.ojpAccessPassive(), "Bern");
    }

    @Test
    void requestPlaces_active_StopPlace() throws OJPException {
        requestStopPlaces(configuration.ojpAccessActive(), "Zürich HB");
    }

    private void requestStopPlaces(OJPAccessor ojpAccessor, String nameMatch) throws OJPException {
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.STOP);
        final de.vdv.ojp.release2.model.OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(Locale.FRENCH)
                .placeTypes(types)
                .placeName(nameMatch)
                .build());
        assertResponseOJP2(ojpResponse);

        // specific <ojp:OJPLocationInformationDelivery>
        final de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
    }

    @Test
    void requestPlaces_passive_PointOfInterest() throws OJPException {
        requestPointOfInterests(configuration.ojpAccessPassive(), "Museum");
    }

    @Test
    void requestPlaces_active_PointOfInterest() throws OJPException {
        requestPointOfInterests(configuration.ojpAccessActive(), "Musée");
    }

    private void requestPointOfInterests(OJPAccessor ojpAccessor, String nameMatch) throws OJPException {
        final Set<PlaceTypeEnumeration> types = Set.of(de.vdv.ojp.release2.model.PlaceTypeEnumeration.POI);
        final de.vdv.ojp.release2.model.OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(Locale.ITALIAN)
                .placeTypes(types)
                .placeName(nameMatch)
                .build());
        assertResponseOJP2(ojpResponse);

        final de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
    }

    @Test
    void requestPlaces_passive_Address() throws OJPException {
        requestAddresses(configuration.ojpAccessPassive(), "Wylerringstrasse");
    }

    @Test
    void requestPlaces_active_Address() throws OJPException {
        requestAddresses(configuration.ojpAccessActive(), "Schwarztorstrasse");
    }

    private void requestAddresses(OJPAccessor accessor, String nameMatch) throws OJPException {
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.ADDRESS);
        final de.vdv.ojp.release2.model.OJP ojpResponse = ojpAdapter.requestPlaces(accessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(Locale.ENGLISH)
                .placeTypes(types)
                .placeName(nameMatch)
                .build());
        assertResponseOJP2(ojpResponse);

        final de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
    }

    @Test
    void requestPlaces_passive_StopPlace_name_coordinates() throws OJPException {
        requestStopPlacesByNameAndCoordinate(configuration.ojpAccessPassive());
    }

    @Test
    void requestPlaces_active_StopPlace_name_coordinates() throws OJPException {
        requestStopPlacesByNameAndCoordinate(configuration.ojpAccessActive());
    }

    private void requestStopPlacesByNameAndCoordinate(OJPAccessor ojpAccessor) throws OJPException {
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.STOP);
        final String nameMatch = "Oerlikon";
        final de.vdv.ojp.release2.model.OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(Locale.GERMAN)
                .placeTypes(types)
                .placeName(nameMatch)
                .centroid(new Point(8.544112, 47.411527))
                .build());
        assertResponseOJP2(ojpResponse);

        final de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        final List<PlaceResultStructure> placeResultStructures = assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
        /* TODO OJP v2.0
        for (PlaceResultStructure placeResultStructure : placeResultStructures) {
            final LocationStructure locationStructure = placeResultStructure.getPlace().getGeoPosition();
            if  (locationStructure.getLongitude().isBetween(BigDecimal.valueOf(7.0), BigDecimal.valueOf(9.0)) &&
            locationStructure.getLatitude().isBetween(BigDecimal.valueOf(45.0), BigDecimal.valueOf(48.0)) &&
            placeResultStructure.getPlace().getName().equals(nameMatch)) {
                return;
            }
        }
        Assertions.fail("Coordinates not found");
         */
    }

    @Test
    void requestPlaces_passive_StopPlace_coordinates_radius() throws OJPException {
        requestStopPlacesByCoordinatesAndRadius(configuration.ojpAccessPassive());
    }

    @Test
    void requestPlaces_active_StopPlace_coordinates_radius() throws OJPException {
        requestStopPlacesByCoordinatesAndRadius(configuration.ojpAccessActive());
    }

    private void requestStopPlacesByCoordinatesAndRadius(OJPAccessor ojpAccessor) throws OJPException {
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.STOP);
        final String nameMatch = null;
        final de.vdv.ojp.release2.model.OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(Locale.GERMAN)
                .placeTypes(types)
                .centroid(new Point(8.544112, 47.411527))
                .radius(300)
                .build());
        assertResponseOJP2(ojpResponse);

        final de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        final List<PlaceResultStructure> placeResultStructures = assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
        /* TODO OJP v2.0
        for (PlaceResultStructure placeResultStructure : placeResultStructures) {
            final LocationStructure locationStructure = placeResultStructure.getPlace().getGeoPosition();
            if  (locationStructure.getLongitude().isBetween(BigDecimal.valueOf(7.0), BigDecimal.valueOf(9.0)) &&
            locationStructure.getLatitude().isBetween(BigDecimal.valueOf(45.0), BigDecimal.valueOf(48.0)) &&
            placeResultStructure.getPlace().getName().equals(nameMatch)) {
                return;
            }
            assert radius
        }
        Assertions.fail("Coordinates not found");
         */
    }

    @Test
    void requestTrips_passive() throws OJPException {
        // passive OJP allows classic UIC's
        requestTrips(configuration.ojpAccessPassive(), "8503308", "8503424");
    }

    @Test
    void requestTrips_active() throws OJPException {
        // active OJP needs qualified OJP-Stop-References (due to cascading OJP instances)
        requestTrips(configuration.ojpAccessActive(), "OJP:STOP:SBB:8503308|Kloten", "OJP:STOP:SBB:8503424|Schaffhausen");
    }

    private void requestTrips(OJPAccessor ojpAccessor, String origin, String destination) throws OJPException {
        // request trips
        final OJP ojpResponse = ojpAdapter.requestTrips(ojpAccessor,
            TripRequestFilter.builder()
                .preferredLanguage(Locale.GERMAN)
                .origin(origin)
                .destination(destination)
                .includeAccessibility(true)
                .includeOperatingDays(true)
                .includeIntermediateStops(true)
                .includeSituationsContext(true)
                .build());
        assertResponseOJP(ojpResponse);

        // specific <ojp:OJPTripDelivery>
        final OJPTripDeliveryStructure ojpTripDeliveryStructure = OJPAdapter.mapToFirstOJPTripDeliveryStructure(ojpResponse);
        assertThat(ojpTripDeliveryStructure.isStatus()).isTrue();

        // some kind of overview?
        final TripResponseContextStructure tripResponseContextStructure = ojpTripDeliveryStructure.getTripResponseContext();
        assertThat(tripResponseContextStructure).as("<ojp:TripResponseContext>").isNotNull();
        assertThat(tripResponseContextStructure.getPlaces().getLocation()).as("<siri:StopPointRef>").hasSizeGreaterThanOrEqualTo(2);
        tripResponseContextStructure.getPlaces().getLocation().forEach(location -> {
            if (tripResponseContextStructure.getSituations() != null) {
                SituationsStructure situationsStructure = tripResponseContextStructure.getSituations();
                log.debug("situations={}", situationsStructure);
            }
            if (location.getStopPoint() != null) {
                log.debug("StopPoint::id={}, ::name={}", location.getStopPoint().getStopPointRef().getValue(), OJPAdapter.getText(location.getStopPoint().getStopPointName()));
            } else {
                // Topographic..
                log.debug("other location: {}", location);
            }
        });
        log.info("/trips and ist TripDeliveyStructure OK - going to refresh each TimedLeg...");

        Assumptions.assumeThat(ojpAccessor.getEndpoint().endsWith("ojp-la-aktiv")).as("OJP(active): TripLeg refresh not supported").isFalse();
        // check Trip and its Leg's
        final List<TripResultStructure> tripResults = ojpTripDeliveryStructure.getTripResult();
        // [0..*]
        assertThat(tripResults).as("more than 1 hit probable").hasSizeGreaterThan(1);
        tripResults.forEach(tripResultStructure -> {
            log.debug("id={}", tripResultStructure.getResultId());
            if (tripResultStructure.getTripSummary() != null) {
                log.debug("TripSummary={}", tripResultStructure.getTripSummary());
            }
            TripStructure tripStructure = tripResultStructure.getTrip();
            assertThat(tripStructure.getTripLeg()).hasSizeGreaterThan(0);
            log.debug("{}", tripStructure);

            for (TripLegStructure tripLegStructure : tripStructure.getTripLeg()) {
                refreshPublicTransportLeg(ojpAccessor, tripLegStructure);
            }

            // NOT SUPPORTED: refresh the whole Trip (as by Hafas Trip::reconstructionContext)
        });
    }

    private void refreshPublicTransportLeg(OJPAccessor ojpAccessor, TripLegStructure tripLegStructure) {
        log.debug("TripLegStructure={}", tripLegStructure);
        if (tripLegStructure.getTimedLeg() != null) {
            // refresh each PTRideLeg within the Trip (OJP TripLeg)
            final JAXBElementContentContainer contentContainer = new JAXBElementContentContainer(tripLegStructure.getTimedLeg().getService().getContent());
            assertThat(contentContainer.getJourneyRefs()).hasSize(1);
            assertThat(contentContainer.getJourneyRefs().get(0).getValue()).isNotEmpty();

            // reconstruct Public Transport leg
            final String journeyRefTimedLeg = contentContainer.getJourneyRefs().get(0).getValue();
            if (isSwissJourneyId(journeyRefTimedLeg)) {
                log.debug("OJP JourneyReference as SJYID={}", journeyRefTimedLeg);
            } else {
                log.info("OJP JourneyReference as <proprietary>={}", journeyRefTimedLeg);
            }
            // assertThat(tripLegStructure.getTimedLeg().getLegBoard().getServiceDeparture().getEstimatedTime()).as("rt mostly given").isNotNull();
            assertThat(contentContainer.getOperatingDays()).hasSize(1);
            assertThat(contentContainer.getOperatingDays().get(0).getValue()).isNotEmpty();
            final LocalDate operationDay = LocalDate.parse(contentContainer.getOperatingDays().get(0).getValue());

            try {
                final OJP ojpResponse = ojpAdapter
                    .requestTripLegByJourneyReference(ojpAccessor,
                        TripLegRequestFilter.builder()
                            .preferredLanguage(Locale.GERMAN)
                            .journeyReference(journeyRefTimedLeg)
                            .operatingDay(operationDay)
                            .build());
                assertResponseOJP(ojpResponse);

                // specific <ojp:OJPTripInfoDelivery>
                final OJPTripInfoDeliveryStructure ojpTripDeliveryStructure = OJPAdapter.mapToFirstOJPTripInfoDeliveryStructure(ojpResponse);
                assertThat(ojpTripDeliveryStructure.isStatus()).isTrue();
                assertTripInfoDeliveryStructure(ojpTripDeliveryStructure);
                log.info("Refresh OK for PTRideLeg::id={}, operatingDay={}", journeyRefTimedLeg, operationDay);
            } catch (Exception ex) {
                // TODO OJP active seems to fail always -> do we need to adapt its TimedLeg::id
                Assertions.fail("TripLeg reconstruction failed for: " + ojpAccessor.getEndpoint() + ", TimedLeg to refresh=" + tripLegStructure.getTimedLeg(), ex);
            }
        } else if (tripLegStructure.getTransferLeg() != null) {
            // Transmodel ConnectionLeg
            log.info("TransferLeg={}", tripLegStructure.getTransferLeg());
        } else if (tripLegStructure.getContinuousLeg() != null) {
            // Transmodel AccessLeg
            log.info("ContinuousLeg={}", tripLegStructure.getContinuousLeg());
        }
    }

    @Test
    void requestStopEventRequest_passive_departure() throws OJPException {
        // passive can deal with classic UIC or SBOID
        requestDepartures(configuration.ojpAccessPassive(), "8503424" /*Schaffhausen*/);
        requestDepartures(configuration.ojpAccessPassive(), "ch:1:sloid:3424:3:4");
    }

    @Test
    void requestStopEventRequest_active_departure() throws OJPException {
        requestDepartures(configuration.ojpAccessActive(), "OJP:STOP:SBB:8503424|Schaffhausen");
        // FAILS with SBOID: requestDepartures(configuration.ojpAccessActive(), "ch:1:sloid:3424:3:4");
    }

    private void requestDepartures(OJPAccessor ojpAccessor, String departureStopPlaceReference) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestStopEvent(ojpAccessor,
            StopEventRequestFilter.builder()
                .preferredLanguage(Locale.GERMAN)
                .stopPlaceReference(departureStopPlaceReference)
                .limit(5)
                .build());
        assertResponseOJP(ojpResponse);

        final OJPStopEventDeliveryStructure ojpStopEventDeliveryStructure = OJPAdapter.mapToFirstOJPStopEventDeliveryStructure(ojpResponse);
        assertThat(ojpStopEventDeliveryStructure.getStopEventResult()).isNotEmpty();
        for (StopEventResultStructure stopEventResultStructure : ojpStopEventDeliveryStructure.getStopEventResult()) {
            StopEventStructure stopEventStructure = stopEventResultStructure.getStopEvent();
            final String stopPlaceId = stopEventStructure.getThisCall().getCallAtStop().getStopPointRef().getValue();
            if (stopPlaceId.startsWith("ch:") && stopPlaceId.contains(":sloid:")) {
                //TODO assert 85 -> "ch:"; last 4 UIC numbers -> :xxxx:
                log.info("OJP SLOID={} for requested StopPlace::id={}", stopPlaceId, departureStopPlaceReference);
            } else {
                assertThat(departureStopPlaceReference).as("wanted departure StopPlace").contains(stopPlaceId);
            }
            log.info("routeIndex={},  quayAimed={} departure={}", stopEventStructure.getThisCall().getCallAtStop().getOrder(),
                OJPAdapter.getText(stopEventStructure.getThisCall().getCallAtStop().getPlannedQuay()),
                stopEventStructure.getThisCall().getCallAtStop().getServiceDeparture().getTimetabledTime());
            final DatedJourneyStructure datedJourneyStructure = stopEventStructure.getService();

            JAXBElementContentContainer contentContainer = new JAXBElementContentContainer(datedJourneyStructure.getContent());
            assertThat(contentContainer.getJourneyRefs()).hasSize(1);
            assertThat(contentContainer.getJourneyRefs().get(0).getValue()).isNotBlank();
            if (isSwissJourneyId(contentContainer.getJourneyRefs().get(0).getValue())) {
                log.debug("OJP JourneyReference as SJYID={}", contentContainer.getJourneyRefs().get(0).getValue());
            } else {
                log.info("OJP JourneyReference as <proprietary>={}", contentContainer.getJourneyRefs().get(0).getValue());
            }
            assertThat(contentContainer.getOperatingDays()).hasSize(1);
            assertThat(LocalDate.parse(contentContainer.getOperatingDays().get(0).getValue())).isNotNull();
            assertThat(contentContainer.getLines()).hasSizeGreaterThan(0);
            assertThat(contentContainer.getDirections()).hasSizeGreaterThan(0);
            assertThat(contentContainer.getModes()).hasSizeGreaterThan(0);
            assertThat(contentContainer.getOperators()).hasSizeGreaterThan(0);
        }
    }

    private static boolean isSwissJourneyId(String ojpJourneyReference) {
        return ojpJourneyReference.contains("sjyid");
    }

    @Deprecated(since = "OJP v2.0")
    private void assertResponseOJP(OJP ojp) {
        // generic part
        assertThat(ojp).isNotNull();
        assertThat(ojp.getOJPRequest()).isNull();
        assertThat(ojp.getOJPResponse()).as("<siri:OJPResponse>").isNotNull();
        assertThat(ojp.getOJPResponse().getServiceDelivery()).as("JAXBElement with wanted data").isNotNull();
        if (ojp.getOJPResponse().getServiceDelivery().isStatus()) {
            assertThat(ojp.getOJPResponse().getServiceDelivery().getErrorCondition()).isNull();
        } else {
            log.error("ServiceDelivery errorCondition={}", ojp.getOJPResponse().getServiceDelivery().getErrorCondition());
        }
    }

    private void assertResponseOJP2(de.vdv.ojp.release2.model.OJP ojp) {
        // generic part
        assertThat(ojp).isNotNull();
        assertThat(ojp.getOJPRequest()).isNull();
        assertThat(ojp.getOJPResponse()).as("<siri:OJPResponse>").isNotNull();
        assertThat(ojp.getOJPResponse().getServiceDelivery()).as("JAXBElement with wanted data").isNotNull();
        if (ojp.getOJPResponse().getServiceDelivery().isStatus() != null) {
            if (ojp.getOJPResponse().getServiceDelivery().isStatus()) {
                assertThat(ojp.getOJPResponse().getServiceDelivery().getErrorCondition()).isNull();
            } else {
                log.error("ServiceDelivery errorCondition={}", ojp.getOJPResponse().getServiceDelivery().getErrorCondition());
            }
        }
    }

    private List<PlaceResultStructure> assertPlaceResults(de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure, Set<PlaceTypeEnumeration> types,
        String nameMatch) {
        assertThat(ojpLocationInformationDeliveryStructure).isNotNull();
        // TODO check requested language (though for Stop's irrelevant)
        assertThat(ojpLocationInformationDeliveryStructure.getDefaultLanguage()).isNotBlank();

        final List<PlaceResultStructure> placeResultStructures = new ArrayList<>();
        boolean matchesFound = false;
        for (JAXBElement<?> rest : ojpLocationInformationDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() == PlaceResultStructure.class) {
                final PlaceResultStructure placeResultStructure = ((PlaceResultStructure) rest.getValue());
                placeResultStructures.add(placeResultStructure);

                de.vdv.ojp.release2.model.PlaceStructure placeStructure = placeResultStructure.getPlace();
                if (placeStructure.getStopPlace() != null) {
                    assertThat(types).as("Stop found but unwanted").contains(PlaceTypeEnumeration.STOP);
                    final StopPlaceStructure stopPlaceStructure = placeStructure.getStopPlace();
                    assertThat(stopPlaceStructure.getStopPlaceName()).as("<ojp:StopPlaceName>").isNotNull();
                    log.debug("Name={}, value={}", stopPlaceStructure.getStopPlaceName(), stopPlaceStructure.getStopPlaceRef().getValue());

                    if ((nameMatch == null) || OJPAdapter.getText2(stopPlaceStructure.getStopPlaceName()).toUpperCase().contains(nameMatch.toUpperCase())) {
                        matchesFound = true;
                    }
                } else if (placeStructure.getPointOfInterest() != null) {
                    assertThat(types).as("POI found but unwanted").contains(PlaceTypeEnumeration.POI);
                    final PointOfInterestStructure pointOfInterestStructure = placeStructure.getPointOfInterest();
                    log.debug("Name={}, category={}", pointOfInterestStructure.getName(), pointOfInterestStructure.getPointOfInterestCategory());

                    if ((nameMatch == null) || OJPAdapter.getText2(placeStructure.getName()).toUpperCase().contains(nameMatch.toUpperCase())) {
                        matchesFound = true;
                    }
                    assertThat(pointOfInterestStructure.getPointOfInterestCategory()).hasSizeGreaterThan(0);
                } else if (placeStructure.getAddress() != null) {
                    final AddressStructure addressStructure = placeStructure.getAddress();
                    log.debug("Name={}, value={}", addressStructure.getName(), addressStructure.getStreet());

                    if ((nameMatch == null) || OJPAdapter.getText2(addressStructure.getName()).toUpperCase().contains(nameMatch.toUpperCase())) {
                        matchesFound = true;
                    }
                    assertThat(addressStructure.getStreet()).isNotBlank();
                    if (addressStructure.getHouseNumber() != null) {
                        assertThat(addressStructure.getHouseNumber()).isNotBlank();
                    }
                    assertThat(addressStructure.getPostCode()).isNotBlank();
                    assertThat(addressStructure.getTopographicPlaceName()).isNotBlank();
                    assertThat(addressStructure.getTopographicPlaceRef().getValue()).isNotBlank();
                }
            }
        }
        assertThat(placeResultStructures).as("Place hits").hasSizeGreaterThan(0);
        assertThat(matchesFound).as("search-expression not found").isTrue();

        return placeResultStructures;
    }

    private void assertTripInfoDeliveryStructure(OJPTripInfoDeliveryStructure ojpTripInfoDeliveryStructure) throws OJPException {
        assertThat(ojpTripInfoDeliveryStructure).isNotNull();
        if (ojpTripInfoDeliveryStructure.getErrorCondition() != null) {
            ServiceDeliveryErrorConditionStructure serviceDeliveryErrorConditionStructure = ojpTripInfoDeliveryStructure.getErrorCondition();
            log.warn("{}", serviceDeliveryErrorConditionStructure);
            throw new OJPException(ojpTripInfoDeliveryStructure.getErrorCondition().toString());
        }

        TripInfoResultStructure tripInfoResultStructure = ojpTripInfoDeliveryStructure.getTripInfoResult();
        log.info("{}", tripInfoResultStructure);
    }
}
