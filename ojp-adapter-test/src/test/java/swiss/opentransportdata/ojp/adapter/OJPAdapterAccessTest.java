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

import static org.assertj.core.api.Assertions.assertThat;

import de.vdv.ojp.release2.model.AddressStructure;
import de.vdv.ojp.release2.model.DatedJourneyStructure;
import de.vdv.ojp.release2.model.LegStructure;
import de.vdv.ojp.release2.model.ModeFilterStructure;
import de.vdv.ojp.release2.model.OJP;
import de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.release2.model.OJPStopEventDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.release2.model.PlaceResultStructure;
import de.vdv.ojp.release2.model.PlaceStructure;
import de.vdv.ojp.release2.model.PlaceTypeEnumeration;
import de.vdv.ojp.release2.model.PointOfInterestStructure;
import de.vdv.ojp.release2.model.ResponseContextStructure;
import de.vdv.ojp.release2.model.SituationsStructure;
import de.vdv.ojp.release2.model.StopEventResultStructure;
import de.vdv.ojp.release2.model.StopEventStructure;
import de.vdv.ojp.release2.model.StopPlaceStructure;
import de.vdv.ojp.release2.model.TripResultStructure;
import de.vdv.ojp.release2.model.TripStructure;
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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import swiss.opentransportdata.ojp.adapter.PlaceRequestFilter.Point;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAccessor;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAdapterServiceConfiguration;
import uk.org.siri.siri.AbstractServiceDeliveryStructure;
import uk.org.siri.siri.LocationStructure;
import uk.org.siri.siri.ServiceDelivery;
import uk.org.siri.siri.VehicleModesOfTransportEnumeration;

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
        final Locale language = Locale.GERMAN;
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.POI,
            PlaceTypeEnumeration.ADDRESS);
        final String nameMatch = "Olten";
        final OJP ojpResponse = ojpAdapter.requestPlaces(configuration.ojpAccessPassive(),
            PlaceRequestFilter.builder()
                .preferredLanguage(language)
                .placeTypes(types)
                .placeName(nameMatch)
                .build());
        assertResponseOJP(ojpResponse);

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertResponse(ojpLocationInformationDeliveryStructure, language);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
    }

    @Test
    void requestPlaces_passive_StopPlace() throws OJPException {
        requestStopPlaces(configuration.ojpAccessPassive(), "Bern");
    }

    @Disabled //TODO OJP 2.0 configure URL
    @Test
    void requestPlaces_active_StopPlace() throws OJPException {
        requestStopPlaces(configuration.ojpAccessActive(), "Zürich HB");
    }

    private void requestStopPlaces(OJPAccessor ojpAccessor, String nameMatch) throws OJPException {
        final Locale language = Locale.FRENCH;
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.STOP);
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(language)
                .placeTypes(types)
                .placeName(nameMatch)
                .build());
        assertResponseOJP(ojpResponse);
        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertResponse(ojpLocationInformationDeliveryStructure, language);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
    }

    @Test
    void requestPlaces_passive_PointOfInterest() throws OJPException {
        requestPointOfInterests(configuration.ojpAccessPassive(), "Museum");
    }

    @Disabled //TODO OJP 2.0 configure URL
    @Test
    void requestPlaces_active_PointOfInterest() throws OJPException {
        requestPointOfInterests(configuration.ojpAccessActive(), "Musée");
    }

    private void requestPointOfInterests(OJPAccessor ojpAccessor, String nameMatch) throws OJPException {
        final Locale language = Locale.ITALIAN;
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.POI);
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(language)
                .placeTypes(types)
                .placeName(nameMatch)
                .build());
        assertResponseOJP(ojpResponse);

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertResponse(ojpLocationInformationDeliveryStructure, language);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
    }

    @Test
    void requestPlaces_passive_Address() throws OJPException {
        requestAddresses(configuration.ojpAccessPassive(), "Wylerringstrasse");
    }

    @Disabled //TODO OJP 2.0 configure URL
    @Test
    void requestPlaces_active_Address() throws OJPException {
        requestAddresses(configuration.ojpAccessActive(), "Schwarztorstrasse");
    }

    private void requestAddresses(OJPAccessor accessor, String nameMatch) throws OJPException {
        final Locale language = Locale.ENGLISH;
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.ADDRESS);
        final OJP ojpResponse = ojpAdapter.requestPlaces(accessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(language)
                .placeTypes(types)
                .placeName(nameMatch)
                .build());
        assertResponseOJP(ojpResponse);

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertResponse(ojpLocationInformationDeliveryStructure, language);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch);
    }

    @Test
    void requestPlaces_passive_StopPlace_name_coordinates() throws OJPException {
        requestStopPlacesByNameAndCoordinate(configuration.ojpAccessPassive());
    }

    @Disabled //TODO OJP 2.0 configure URL
    @Test
    void requestPlaces_active_StopPlace_name_coordinates() throws OJPException {
        requestStopPlacesByNameAndCoordinate(configuration.ojpAccessActive());
    }

    private void requestStopPlacesByNameAndCoordinate(OJPAccessor ojpAccessor) throws OJPException {
        final Locale language = Locale.GERMAN;
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.STOP);
        final String nameMatch = "Oerlikon";
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(language)
                .placeTypes(types)
                .placeName(nameMatch)
                .centroid(new Point(8.544112, 47.411527))
                .build());
        assertResponseOJP(ojpResponse);

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertResponse(ojpLocationInformationDeliveryStructure, language);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch, true, null);
    }

    @Test
    void requestPlaces_passive_StopPlace_coordinates_radius() throws OJPException {
        requestStopPlacesByCoordinatesAndRadius(configuration.ojpAccessPassive());
    }

    @Disabled //TODO OJP 2.0 configure URL
    @Test
    void requestPlaces_active_StopPlace_coordinates_radius() throws OJPException {
        requestStopPlacesByCoordinatesAndRadius(configuration.ojpAccessActive());
    }

    private void requestStopPlacesByCoordinatesAndRadius(OJPAccessor ojpAccessor) throws OJPException {
        final Locale language = Locale.GERMAN;
        final Set<PlaceTypeEnumeration> types = Set.of(PlaceTypeEnumeration.STOP);
        final String nameMatch = null;
        final int radius = 300;
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor,
            PlaceRequestFilter.builder()
                .preferredLanguage(language)
                .placeTypes(types)
                .placeName(nameMatch)
                .centroid(new Point(8.544112, 47.411527))
                .radius(radius)
                .build());
        assertResponseOJP(ojpResponse);

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);
        assertResponse(ojpLocationInformationDeliveryStructure, language);
        assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch, true, radius);
    }

    @Test
    void requestTrips_passive() throws OJPException {
        // passive OJP allows classic UIC's
        requestTrips(configuration.ojpAccessPassive(), "8503308", "8503424");
    }

    @Disabled //TODO OJP 2.0 configure URL
    @Test
    void requestTrips_active() throws OJPException {
        // active OJP needs qualified OJP-Stop-References (due to cascading OJP instances)
        requestTrips(configuration.ojpAccessActive(), "OJP:STOP:SBB:8503308|Kloten", "OJP:STOP:SBB:8503424|Schaffhausen");
    }

    private void requestTrips(OJPAccessor ojpAccessor, String origin, String destination) throws OJPException {
        final Locale language = Locale.GERMAN;
        final ModeFilterStructure modeFilterStructure = new ModeFilterStructure();
        modeFilterStructure.withPtMode(VehicleModesOfTransportEnumeration.ALL);
        final OJP ojpResponse = ojpAdapter.requestTrips(ojpAccessor,
            TripRequestFilter.builder()
                .preferredLanguage(language)
                .limit(5)
                .modeFilterStructure(modeFilterStructure)
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
        assertResponse(ojpTripDeliveryStructure, language);

        assertThat(ojpTripDeliveryStructure.getRest()).hasSizeGreaterThanOrEqualTo(1);

        final List<TripResultStructure> tripResults = new ArrayList<>();
        for (JAXBElement<?> rest : ojpTripDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() == ResponseContextStructure.class) {
                // some kind of overview?
                final ResponseContextStructure responseContextStructure = (ResponseContextStructure) rest.getValue();
                assertThat(responseContextStructure).isNotNull();
                assertThat(responseContextStructure.getPlaces().getPlace()).as("<siri:StopPointRef>").hasSizeGreaterThanOrEqualTo(2);
                responseContextStructure.getPlaces().getPlace().forEach(placeStructure -> {
                    if (responseContextStructure.getSituations() != null) {
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
                Assumptions.assumeThat(ojpAccessor.getEndpoint().endsWith("ojp-la-aktiv")).as("OJP(active): TripLeg refresh not supported").isFalse();
                // check Trip and its Leg's
                tripResults.add((TripResultStructure) rest.getValue());
            } else {
                log.debug("skip non-Trip: {}", rest.getDeclaredType());
            }
        }

        assertThat(tripResults).as("more than 1 hit probable").hasSizeGreaterThan(1);
        tripResults.forEach(tripResultStructure -> {
            log.debug("id={}", tripResultStructure.getTrip().getId());
            if (tripResultStructure.getTripSummary() != null) {
                log.debug("TripSummary={}", tripResultStructure.getTripSummary());
            }
            final TripStructure tripStructure = tripResultStructure.getTrip();
            assertThat(tripStructure.getLeg()).as("Trip::legs").hasSizeGreaterThan(0);
            log.debug("{}", tripStructure);

            log.info("/trips and TripDeliveryStructure OK - going to refresh each TimedLeg...");
            for (LegStructure tripLegStructure : tripStructure.getLeg()) {
                refreshPublicTransportLeg(ojpAccessor, tripLegStructure);
            }
        });

        // NOT SUPPORTED: refresh the whole Trip (as by Hafas Trip::reconstructionContext)
    }

    private void refreshPublicTransportLeg(OJPAccessor ojpAccessor, LegStructure legStructure) {
        log.debug("LegStructure={}", legStructure);
        if (legStructure.getTimedLeg() != null) {
            // refresh each PTRideLeg within the Trip (OJP Leg)
            final DatedJourneyStructure datedJourneyStructure = legStructure.getTimedLeg().getService();

            assertThat(datedJourneyStructure.getJourneyRef()).isNotNull();
            final String journeyRefTimedLeg = datedJourneyStructure.getJourneyRef().getValue();
            assertThat(journeyRefTimedLeg).isNotEmpty();

            // reconstruct Public Transport leg
            if (isSwissJourneyId(journeyRefTimedLeg)) {
                log.debug("OJP JourneyReference as SJYID={}", journeyRefTimedLeg);
            } else {
                log.info("OJP JourneyReference as <proprietary>={}", journeyRefTimedLeg);
            }
            // assertThat(tripLegStructure.getTimedLeg().getLegBoard().getServiceDeparture().getEstimatedTime()).as("rt mostly given").isNotNull();
            assertThat(datedJourneyStructure.getOperatingDayRef()).isNotNull();
            assertThat(datedJourneyStructure.getOperatingDayRef().getValue()).isNotEmpty();
            final LocalDate operationDay = LocalDate.parse(datedJourneyStructure.getOperatingDayRef().getValue());

            try {
                final Locale language = Locale.GERMAN;
                final OJP ojpResponse = ojpAdapter.requestTripLegByJourneyReference(ojpAccessor,
                    TripLegRequestFilter.builder()
                        .preferredLanguage(language)
                        .journeyReference(journeyRefTimedLeg)
                        .operatingDay(operationDay)
                        .build());
                assertResponseOJP(ojpResponse);

                final OJPTripInfoDeliveryStructure ojpTripInfoDeliveryStructure = OJPAdapter.mapToFirstOJPTripInfoDeliveryStructure(ojpResponse);
                assertResponse(ojpTripInfoDeliveryStructure, language);
                for (JAXBElement<?> rest : ojpTripInfoDeliveryStructure.getRest()) {
                    //TODO OJP 2.0 assert ::rest
                    log.debug("OJPTripInfoDeliveryStructure::rest value: {}", rest.getDeclaredType());
                }
                log.info("Refresh OK for PTRideLeg::id={}, operatingDay={}", journeyRefTimedLeg, operationDay);
            } catch (Exception ex) {
                // TODO OJP active seems to fail always -> do we need to adapt its TimedLeg::id
                Assertions.fail("Trip::leg reconstruction failed for: " + ojpAccessor.getEndpoint() + ", TimedLeg to refresh=" + legStructure.getTimedLeg(), ex);
            }
        } else if (legStructure.getTransferLeg() != null) {
            // Transmodel ConnectionLeg
            log.info("TransferLeg={}", legStructure.getTransferLeg());
        } else if (legStructure.getContinuousLeg() != null) {
            // Transmodel AccessLeg
            log.info("ContinuousLeg={}", legStructure.getContinuousLeg());
        }
    }

    @Test
    void requestStopEventRequest_passive_departure() throws OJPException {
        // passive can deal with classic UIC or SBOID
        requestDepartures(configuration.ojpAccessPassive(), "8503424" /*Schaffhausen*/);
        requestDepartures(configuration.ojpAccessPassive(), "ch:1:sloid:3424:3:4");
    }

    @Disabled //TODO OJP 2.0 configure URL
    @Test
    void requestStopEventRequest_active_departure() throws OJPException {
        requestDepartures(configuration.ojpAccessActive(), "OJP:STOP:SBB:8503424|Schaffhausen");
        // FAILS with SBOID: requestDepartures(configuration.ojpAccessActive(), "ch:1:sloid:3424:3:4");
    }

    private void requestDepartures(OJPAccessor ojpAccessor, String departureStopPlaceReference) throws OJPException {
        final Locale language = Locale.GERMAN;
        final OJP ojpResponse = ojpAdapter.requestStopEvent(ojpAccessor,
            StopEventRequestFilter.builder()
                .preferredLanguage(language)
                .stopPlaceReference(departureStopPlaceReference)
                .limit(5)
                .build());
        assertResponseOJP(ojpResponse);

        final OJPStopEventDeliveryStructure ojpStopEventDeliveryStructure = OJPAdapter.mapToFirstOJPStopEventDeliveryStructure(ojpResponse);
        assertResponse(ojpStopEventDeliveryStructure, language);

        assertThat(ojpStopEventDeliveryStructure.getRest()).hasSizeGreaterThanOrEqualTo(1);
        for (JAXBElement<?> rest : ojpStopEventDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() != StopEventResultStructure.class) {
                log.debug("skip non-Departure: {}", rest.getDeclaredType());
                continue;
            }

            final StopEventStructure stopEventStructure = ((StopEventResultStructure) rest.getValue()).getStopEvent();
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
            final String journeyRef = datedJourneyStructure.getJourneyRef().getValue();

            assertThat(journeyRef).isNotBlank();
            if (isSwissJourneyId(journeyRef)) {
                log.debug("OJP JourneyReference as SJYID={}", journeyRef);
            } else {
                log.info("OJP JourneyReference as <proprietary>={}", journeyRef);
            }
            assertThat(datedJourneyStructure.getOperatingDayRef()).isNotNull();
            assertThat(LocalDate.parse(datedJourneyStructure.getOperatingDayRef().getValue())).isNotNull();
            assertThat(datedJourneyStructure.getLineRef()).isNotNull();
            assertThat(datedJourneyStructure.getDirectionRef()).isNotNull();
            assertThat(datedJourneyStructure.getMode()).isNotNull();
            assertThat(datedJourneyStructure.getOperatorRef()).isNotNull();
        }
    }

    private static boolean isSwissJourneyId(String ojpJourneyReference) {
        return ojpJourneyReference.contains("sjyid");
    }

    private void assertResponseOJP(OJP ojp) {
        // generic part
        assertThat(ojp).isNotNull();
        assertThat(ojp.getOJPRequest()).isNull();
        assertThat(ojp.getOJPResponse()).as("<siri:OJPResponse>").isNotNull();

        final ServiceDelivery serviceDelivery = ojp.getOJPResponse().getServiceDelivery();
        assertThat(serviceDelivery).as("JAXBElement with wanted data").isNotNull();
        if (serviceDelivery.isStatus() != null) {
            // global, generic OJP::serviceDelivery level
            if (serviceDelivery.isStatus()) {
                assertThat(serviceDelivery.getErrorCondition()).as("global OJP::serviceDelivery level").isNull();
            } else {
                log.error("Global ServiceDelivery errorCondition={}", serviceDelivery.getErrorCondition());
                assertThat(serviceDelivery.getErrorCondition()).as("global OJP::serviceDelivery level").isNotNull();
                assertThat(serviceDelivery.getErrorCondition().toString()).as("global OJP::serviceDelivery level").isNotBlank();
            }
        }
    }

    private void assertResponse(AbstractServiceDeliveryStructure abstractServiceDeliveryStructure, Locale preferredLanguage) {
        assertThat(abstractServiceDeliveryStructure).isNotNull();

        // check requested language (though for Stop's irrelevant)
        assertThat(abstractServiceDeliveryStructure.getDefaultLanguage()).isNotBlank();
        if (!preferredLanguage.getLanguage().equals(abstractServiceDeliveryStructure.getDefaultLanguage())) {
            log.error("Developer fault? preferredLanguage={} does not match response defaultLanguage={}", preferredLanguage, abstractServiceDeliveryStructure.getDefaultLanguage());
        }

        if (abstractServiceDeliveryStructure.isStatus() != null) {
            // call specific delivery-Object level
            if (abstractServiceDeliveryStructure.isStatus()) {
                assertThat(abstractServiceDeliveryStructure.getErrorCondition()).as("global OJP::serviceDelivery level").isNull();
            } else {
                log.error("Global ServiceDelivery errorCondition={}", abstractServiceDeliveryStructure.getErrorCondition());
                assertThat(abstractServiceDeliveryStructure.getErrorCondition()).as("global OJP::serviceDelivery level").isNotNull();
                assertThat(abstractServiceDeliveryStructure.getErrorCondition().toString()).as("global OJP::serviceDelivery level").isNotBlank();
                throw new OJPException(abstractServiceDeliveryStructure.getErrorCondition().toString());
            }
        }
    }

    private List<PlaceResultStructure> assertPlaceResults(OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure, Set<PlaceTypeEnumeration> types, String nameMatch) {
        return assertPlaceResults(ojpLocationInformationDeliveryStructure, types, nameMatch, false, null);
    }

    private List<PlaceResultStructure> assertPlaceResults(OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure, Set<PlaceTypeEnumeration> types, String nameMatch,
        boolean validateCoordinates, Integer radius) {

        assertThat(ojpLocationInformationDeliveryStructure.getRest()).hasSizeGreaterThanOrEqualTo(1);
        final List<PlaceResultStructure> placeResultStructures = new ArrayList<>();
        boolean matchesFound = false;
        for (JAXBElement<?> rest : ojpLocationInformationDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() != PlaceResultStructure.class) {
                log.debug("skip non-Place: {}", rest.getDeclaredType());
                continue;
            }
            final PlaceResultStructure placeResultStructure = ((PlaceResultStructure) rest.getValue());
            placeResultStructures.add(placeResultStructure);

            PlaceStructure placeStructure = placeResultStructure.getPlace();
            if (placeStructure.getStopPlace() != null) {
                assertThat(types).as("Stop found but unwanted").contains(PlaceTypeEnumeration.STOP);
                final StopPlaceStructure stopPlaceStructure = placeStructure.getStopPlace();
                assertThat(stopPlaceStructure.getStopPlaceName()).as("<ojp:StopPlaceName>").isNotNull();
                log.debug("Name={}, value={}", stopPlaceStructure.getStopPlaceName(), stopPlaceStructure.getStopPlaceRef().getValue());

                if ((nameMatch == null) || OJPAdapter.getText(stopPlaceStructure.getStopPlaceName()).toUpperCase().contains(nameMatch.toUpperCase())) {
                    matchesFound = true;
                }
            } else if (placeStructure.getPointOfInterest() != null) {
                assertThat(types).as("POI found but unwanted").contains(PlaceTypeEnumeration.POI);
                final PointOfInterestStructure pointOfInterestStructure = placeStructure.getPointOfInterest();
                log.debug("Name={}, category={}", pointOfInterestStructure.getName(), pointOfInterestStructure.getPointOfInterestCategory());

                if ((nameMatch == null) || OJPAdapter.getText(placeStructure.getName()).toUpperCase().contains(nameMatch.toUpperCase())) {
                    matchesFound = true;
                }
                assertThat(pointOfInterestStructure.getPointOfInterestCategory()).hasSizeGreaterThan(0);
            } else if (placeStructure.getAddress() != null) {
                final AddressStructure addressStructure = placeStructure.getAddress();
                log.debug("Name={}, value={}", addressStructure.getName(), addressStructure.getStreet());

                if ((nameMatch == null) || OJPAdapter.getText(addressStructure.getName()).toUpperCase().contains(nameMatch.toUpperCase())) {
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
        assertThat(placeResultStructures).as("Place hits").hasSizeGreaterThan(0);
        assertThat(matchesFound).as("search-expression not found").isTrue();

        if (validateCoordinates) {
            for (PlaceResultStructure placeResultStructure : placeResultStructures) {
                final LocationStructure locationStructure = placeResultStructure.getPlace().getGeoPosition();
                if ((nameMatch == null) || OJPAdapter.getText(placeResultStructure.getPlace().getName()).contains(nameMatch)) {
                    assertThat(locationStructure.getLongitude()).isBetween(BigDecimal.valueOf(7.0), BigDecimal.valueOf(9.0));
                    assertThat(locationStructure.getLatitude()).isBetween(BigDecimal.valueOf(45.0), BigDecimal.valueOf(48.0));
                    return placeResultStructures;
                }
            }
            Assertions.fail("Coordinates not found");

            if (radius != null) {
                //TODO validate
            }
        }

        return placeResultStructures;
    }
}
