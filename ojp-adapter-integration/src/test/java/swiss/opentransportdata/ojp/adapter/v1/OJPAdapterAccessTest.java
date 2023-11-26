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
import de.vdv.ojp.PlaceResultStructure;
import de.vdv.ojp.PlaceStructure;
import de.vdv.ojp.PlaceTypeEnumeration;
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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.OJPTestProfile;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAdapterServiceConfiguration;
import swiss.opentransportdata.ojp.adapter.v1.PlaceRequestFilter.Point;
import swiss.opentransportdata.ojp.adapter.v1.converter.JAXBElementContentContainer;
import swiss.opentransportdata.ojp.configuration.OJPAccessor;

/**
 * Integration-Test.
 * <p>
 * Data may differ between OJP passive and active instance.
 */
@Slf4j
@OJPTestProfile
public class OJPAdapterAccessTest {

    @Autowired
    private OJPAdapter ojpAdapter;

    @Autowired
    private OJPAdapterServiceConfiguration configuration;

    @Test
    void requestPlaces_passive_PlaceType_ALL() throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestPlaces(configuration.ojpAccessPassive(), Locale.GERMAN,
            PlaceRequestFilter.builder()
                .placeTypes(Set.of(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.POI, PlaceTypeEnumeration.ADDRESS))
                .placeName("Olten")
                .build());
        assertResponseOJP(ojpResponse);
    }

    @Test
    void requestPlaces_passive_StopPlace() throws OJPException {
        requestStopPlaces(configuration.ojpAccessPassive(), "Bern");
    }

    @Test
    void requestPlaces_active_StopPlace() throws OJPException {
        requestStopPlaces(configuration.ojpAccessActive(), "Bern");
    }

    private void requestStopPlaces(OJPAccessor ojpAccessor, String nameMatch) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor, Locale.GERMAN,
            PlaceRequestFilter.builder()
                .placeName(nameMatch)
                .build());
        assertResponseOJP(ojpResponse);

        // specific <ojp:OJPLocationInformationDelivery>
        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeGreaterThanOrEqualTo(0);
        // TODO assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeLessThanOrEqualTo(limit);
        boolean found = false;
        for (PlaceResultStructure placeResultStructure : ojpLocationInformationDeliveryStructure.getLocation()) {
            PlaceStructure placeStructure = placeResultStructure.getLocation();
            if (placeStructure.getStopPlace() == null) {
                Assertions.fail("non StopPlace found for:" + nameMatch);
            } else {
                assertThat(placeStructure.getStopPlace()).as("<ojp:StopPlaceName>").isNotNull();
                log.debug("Name={}, value={}", placeStructure.getStopPlace().getStopPlaceName(), placeStructure.getStopPlace().getStopPlaceRef().getValue());

                if (OJPAdapter.getText(placeStructure.getStopPlace().getStopPlaceName()).toUpperCase().contains(nameMatch.toUpperCase())) {
                    found = true;
                }
            }
        }
        assertThat(found).as("search-expression not found").isTrue();
    }

    @Test
    void requestPlaces_passive_PointOfInterest() throws OJPException {
        requestPointOfInterests(configuration.ojpAccessPassive(), "Museum");
    }

    @Test
    void requestPlaces_active_PointOfInterest() throws OJPException {
        requestPointOfInterests(configuration.ojpAccessActive(), "Museum");
    }

    private void requestPointOfInterests(OJPAccessor ojpAccessor, String nameMatch) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor, Locale.GERMAN,
            PlaceRequestFilter.builder()
                .placeTypes(Set.of(PlaceTypeEnumeration.POI))
                .placeName(nameMatch)
                .build());
        assertResponseOJP(ojpResponse);

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeGreaterThanOrEqualTo(0);
        //TODO assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeLessThanOrEqualTo(limit);
        ojpLocationInformationDeliveryStructure.getLocation().forEach(location -> {
            PlaceStructure placeStructure = location.getLocation();
            if (placeStructure.getPointOfInterest() == null) {
                Assertions.fail("no PointOfInterest found for:" + nameMatch);
            } else {
                assertThat(placeStructure.getPointOfInterest()).as("<ojp:..>").isNotNull();
                log.debug("Name={}, category={}", placeStructure.getPointOfInterest().getPointOfInterestName(), placeStructure.getPointOfInterest().getPointOfInterestCategory());

                assertThat(OJPAdapter.getText(placeStructure.getPointOfInterest().getPointOfInterestName())).containsIgnoringCase(nameMatch);
            }
        });
    }

    @Test
    void requestPlaces_passive_Address() throws OJPException {
        requestAddresses(configuration.ojpAccessPassive(), "Wylerringstrasse");
    }

    @Test
    void requestPlaces_active_Address() throws OJPException {
        requestAddresses(configuration.ojpAccessActive(), "Wylerringstrasse");
    }

    private void requestAddresses(OJPAccessor accessor, String nameMatch) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestPlaces(accessor, Locale.GERMAN,
            PlaceRequestFilter.builder()
                .placeTypes(Set.of(PlaceTypeEnumeration.ADDRESS))
                .placeName(nameMatch)
                .build());
        assertResponseOJP(ojpResponse);

        // specific <ojp:OJPLocationInformationDelivery>
        assertThat(ojpResponse.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery().get(0).getValue()).isInstanceOf(OJPLocationInformationDeliveryStructure.class);
        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeGreaterThanOrEqualTo(0);
        //TODO assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeLessThanOrEqualTo(limit);
        ojpLocationInformationDeliveryStructure.getLocation().forEach(location -> {
            PlaceStructure placeStructure = location.getLocation();
            if (placeStructure.getAddress() == null) {
                Assertions.fail("no Address found for:" + nameMatch);
            } else {
                assertThat(placeStructure.getAddress()).as("<ojp:Address?>").isNotNull();
                log.debug("Name={}, value={}", placeStructure.getAddress().getAddressName(), placeStructure.getAddress().getStreet());

                assertThat(OJPAdapter.getText(placeStructure.getAddress().getAddressName())).contains(nameMatch);
                assertThat(placeStructure.getAddress().getAddressCode()).isNotBlank();
                assertThat(placeStructure.getAddress().getStreet()).isNotBlank();
                if (placeStructure.getAddress().getHouseNumber() != null) {
                    assertThat(placeStructure.getAddress().getHouseNumber()).isNotBlank();
                }
                assertThat(placeStructure.getAddress().getPostCode()).isNotBlank();
                assertThat(placeStructure.getAddress().getTopographicPlaceName()).isNotBlank();
                assertThat(placeStructure.getAddress().getTopographicPlaceRef().getValue()).isNotBlank();
            }
        });
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
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor, Locale.GERMAN,
            PlaceRequestFilter.builder()
                .placeTypes(Set.of(PlaceTypeEnumeration.STOP))
                .placeName("Oerlikon")
                .centroid(new Point(8.544112, 47.411527))
                .build());
        assertResponseOJP(ojpResponse);

        // specific <ojp:OJPLocationInformationDelivery>(
        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeGreaterThanOrEqualTo(0);
        //TODO assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeLessThanOrEqualTo(limit);
        ojpLocationInformationDeliveryStructure.getLocation().forEach(location -> {
            PlaceStructure placeStructure = location.getLocation();
            if (placeStructure.getStopPlace() == null) {
                Assertions.fail("non StopPlace found for: coordinates");
            } else {
                assertThat(placeStructure.getStopPlace()).as("<ojp:StopPlaceName>").isNotNull();
                log.debug("Name={}, value={}", placeStructure.getStopPlace().getStopPlaceName(), placeStructure.getStopPlace().getStopPlaceRef().getValue());

                assertThat(placeStructure.getStopPlace().getStopPlaceName().getText().getValue()).contains("Oerlikon");
                assertThat(placeStructure.getGeoPosition().getLongitude()).isBetween(BigDecimal.valueOf(7.0), BigDecimal.valueOf(9.0));
                assertThat(placeStructure.getGeoPosition().getLatitude()).isBetween(BigDecimal.valueOf(45.0), BigDecimal.valueOf(48.0));
            }
        });
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
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor, Locale.GERMAN,
            PlaceRequestFilter.builder()
                .placeTypes(Set.of(PlaceTypeEnumeration.STOP))
                .centroid(new Point(8.544112, 47.411527))
                .radius(300)
                .build());
        assertResponseOJP(ojpResponse);

        // specific <ojp:OJPLocationInformationDelivery>(
        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeGreaterThanOrEqualTo(0);
        //TODO assertThat(ojpLocationInformationDeliveryStructure.getLocation()).as("<ojp:Location>").hasSizeLessThanOrEqualTo(limit);

        ojpLocationInformationDeliveryStructure.getLocation().forEach(location -> {
            PlaceStructure placeStructure = location.getLocation();
            if (placeStructure.getStopPlace() == null) {
                Assertions.fail("non StopPlace found for: coordinates");
            } else {
                assertThat(placeStructure.getStopPlace()).as("<ojp:StopPlaceName>").isNotNull();
                log.debug("Name={}, value={}", placeStructure.getStopPlace().getStopPlaceName(), placeStructure.getStopPlace().getStopPlaceRef().getValue());
                assertThat(placeStructure.getGeoPosition().getLongitude()).isBetween(BigDecimal.valueOf(7.0), BigDecimal.valueOf(9.0));
                assertThat(placeStructure.getGeoPosition().getLatitude()).isBetween(BigDecimal.valueOf(45.0), BigDecimal.valueOf(48.0));
            }
        });
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
        final OJP ojpResponse = ojpAdapter.requestTrips(ojpAccessor, Locale.GERMAN,
            TripRequestFilter.builder()
                .origin(origin)
                .destination(destination)
                .includeAccessibility(true)
                .includeOperatingDays(true)
                .includeIntermediateStops(true)
                .build());
        assertResponseOJP(ojpResponse);

        // specific <ojp:OJPTripDelivery>
        final OJPTripDeliveryStructure ojpTripDeliveryStructure = OJPAdapter.mapToFirstOJPTripDeliveryStructure(ojpResponse);
        assertThat(ojpTripDeliveryStructure.isStatus()).isTrue();

        // some kind of overview?
        final TripResponseContextStructure tripResponseContextStructure = ojpTripDeliveryStructure.getTripResponseContext();
        assertThat(tripResponseContextStructure).as("<ojp:TripResponseContext>").isNotNull();
        assertThat(tripResponseContextStructure.getPlaces().getLocation()).as("<siri:StopPointRef>8507000</siri:StopPointRef>").hasSizeGreaterThanOrEqualTo(2);
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
            // assertThat(tripLegStructure.getTimedLeg().getLegBoard().getServiceDeparture().getEstimatedTime()).as("rt mostly given").isNotNull();
            assertThat(contentContainer.getOperatingDays()).hasSize(1);
            assertThat(contentContainer.getOperatingDays().get(0).getValue()).isNotEmpty();
            final LocalDate operationDay = LocalDate.parse(contentContainer.getOperatingDays().get(0).getValue());

            try {
                final OJP ojpResponse = ojpAdapter
                    .requestTripLegByJourneyReference(ojpAccessor, Locale.GERMAN,
                        TripLegRequestFilter.builder()
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
            log.info("TRANSFER={}", tripLegStructure.getTransferLeg());
        } else if (tripLegStructure.getContinuousLeg() != null) {
            log.info("FOOTPATH={}", tripLegStructure.getContinuousLeg());
        } else {
            Assertions.fail("unexpected Leg-type");
        }
    }

    @Test
    void requestStopEventRequestdeparture() throws OJPException {
        // passive can deal with classic UIC only
        requestDepartures(configuration.ojpAccessPassive(), "8503424");
    }

    @Test
    void requestStopEventRequest_active_departure() throws OJPException {
        requestDepartures(configuration.ojpAccessActive(), "OJP:STOP:SBB:8503424|Schaffhausen");
    }

    private void requestDepartures(OJPAccessor ojpAccessor, String departureStopPlaceReference) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestStopEvent(ojpAccessor, Locale.GERMAN,
            StopEventRequestFilter.builder()
                .stopPlaceReference(departureStopPlaceReference)
                .limit(5)
                .build());
        assertResponseOJP(ojpResponse);

        final OJPStopEventDeliveryStructure ojpStopEventDeliveryStructure = OJPAdapter.mapToFirstOJPStopEventDeliveryStructure(ojpResponse);
        assertThat(ojpStopEventDeliveryStructure.getStopEventResult()).isNotEmpty();
        for (StopEventResultStructure stopEventResultStructure : ojpStopEventDeliveryStructure.getStopEventResult()) {
            StopEventStructure stopEventStructure = stopEventResultStructure.getStopEvent();
            assertThat(departureStopPlaceReference).as("wanted departure StopPlace").contains(stopEventStructure.getThisCall().getCallAtStop().getStopPointRef().getValue());
            log.info("routeIndex={},  quayAimed={} departure={}", stopEventStructure.getThisCall().getCallAtStop().getOrder(),
                OJPAdapter.getText(stopEventStructure.getThisCall().getCallAtStop().getPlannedQuay()),
                stopEventStructure.getThisCall().getCallAtStop().getServiceDeparture().getTimetabledTime());
            DatedJourneyStructure datedJourneyStructure = stopEventStructure.getService();

            JAXBElementContentContainer contentContainer = new JAXBElementContentContainer(datedJourneyStructure.getContent());
            assertThat(contentContainer.getJourneyRefs()).hasSize(1);
            assertThat(contentContainer.getJourneyRefs().get(0).getValue()).isNotEmpty();
            assertThat(contentContainer.getOperatingDays()).hasSize(1);
            assertThat(LocalDate.parse(contentContainer.getOperatingDays().get(0).getValue())).isNotNull();
            assertThat(contentContainer.getLines()).hasSizeGreaterThan(0);
            assertThat(contentContainer.getDirections()).hasSizeGreaterThan(0);
            assertThat(contentContainer.getModes()).hasSizeGreaterThan(0);
            assertThat(contentContainer.getOperators()).hasSizeGreaterThan(0);

            // refresh not possible by TripInfoRequest
        }
    }

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
