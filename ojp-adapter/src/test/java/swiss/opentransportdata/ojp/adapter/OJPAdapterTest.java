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

import de.vdv.ojp.release2.model.OJP;
import de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.release2.model.OJPStopEventDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripDeliveryStructure;
import de.vdv.ojp.release2.model.PlaceResultStructure;
import de.vdv.ojp.release2.model.StopEventResultStructure;
import de.vdv.ojp.release2.model.TripResultStructure;
import jakarta.xml.bind.JAXBElement;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.assertj.core.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import uk.org.siri.siri.AbstractServiceDeliveryStructure;
import uk.org.siri.siri.ServiceDelivery;

/**
 * @see <a href="https://tools.odpch.ch/ojp-demo-v2/search">Test-file creation tool</a>
 */
class OJPAdapterTest {

    private static final OJPAdapter ojpAdapter = new OJPAdapter(WebClient.builder().build(), "OJP-Adapter test");

    private String readFile(String filename) throws IOException {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("mockdata/ojp_v2_0/" + filename)) {
            final String xml = new String(is.readAllBytes());
            Assumptions.assumeThat(xml).as("test-condition").isNotBlank();
            return xml;
        }
    }

    /**
     * @param filename containing an OK response from OJP
     * @return OJP response
     * @throws IOException
     */
    private OJP unmarshalResponse(String filename) throws IOException {
        final String xmlInstance = readFile(filename);

        final OJP ojp = ojpAdapter.unmarshalResponse(ResponseEntity.ok(xmlInstance));
        assertThat(ojp).isNotNull();

        assertThat(ojp.getOJPResponse()).isNotNull();
        assertThat(ojp.getOJPResponse().getCheckStatusResponse()).isNull();
        assertThat(ojp.getOJPResponse().getCapabilitiesResponse()).isNull();
        assertThat(ojp.getOJPResponse().getTerminateSubscriptionResponse()).isNull();
        assertThat(ojp.getOJPResponse().getAbstractDiscoveryDelivery()).isNull();

        final ServiceDelivery serviceDelivery = ojp.getOJPResponse().getServiceDelivery();
        assertThat(serviceDelivery).isNotNull();
        assertThat(serviceDelivery.isStatus()).as("null defaults to ok (TRUE)").isNull();
        assertThat(serviceDelivery.getErrorCondition()).isNull();

        final List<JAXBElement<? extends AbstractServiceDeliveryStructure>> deliveryStructures = serviceDelivery.getAbstractFunctionalServiceDelivery();
        assertThat(deliveryStructures).hasSize(1);
        assertThat(deliveryStructures.getFirst()).isInstanceOf(JAXBElement.class);
        assertThat(deliveryStructures.getFirst().getValue().getDefaultLanguage()).isNotBlank();

        return ojp;
    }

    @Test
    void mapToFirstOJPLocationInformationDeliveryStructure() throws IOException {
        final OJP ojp = unmarshalResponse("OJPLocationInformationDelivery_Bern.xml");

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojp);
        assertThat(ojpLocationInformationDeliveryStructure).isNotNull();
        assertThat(ojpLocationInformationDeliveryStructure.getDefaultLanguage()).isNotBlank();
        assertThat(ojpLocationInformationDeliveryStructure.getRest()).isNotEmpty();

        int count = 0;
        for (JAXBElement<?> rest : ojpLocationInformationDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() == PlaceResultStructure.class) {
                count++;

                final PlaceResultStructure placeResultStructure = (PlaceResultStructure) rest.getValue();
                assertThat(placeResultStructure.getPlace()).isNotNull();
                assertThat(placeResultStructure.getPlace().getStopPlace()).isNotNull();
                assertThat(placeResultStructure.getPlace().getStopPlace().getStopPlaceName()).isNotNull();
                assertThat(placeResultStructure.getPlace().getStopPlace().getStopPlaceRef()).isNotNull();
            }
        }
        assertThat(count).isEqualTo(2);
    }

    @Test
    void mapToFirstOJPStopEventDeliveryStructure_ArrivalResponse() throws IOException {
        final OJP ojp = unmarshalResponse("OJPStopEventDelivery_ArrivalsAtZurichHB.xml");

        final OJPStopEventDeliveryStructure stopEventDeliveryStructure = OJPAdapter.mapToFirstOJPStopEventDeliveryStructure(ojp);
        assertThat(stopEventDeliveryStructure).isNotNull();
        assertThat(stopEventDeliveryStructure.getDefaultLanguage()).isNotBlank();
        assertThat(stopEventDeliveryStructure.getRest()).isNotEmpty();

        int count = 0;
        for (JAXBElement<?> rest : stopEventDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() == StopEventResultStructure.class) {
                count++;

                final StopEventResultStructure stopEventResultStructure = (StopEventResultStructure) rest.getValue();
                assertThat(stopEventResultStructure.getStopEvent()).isNotNull();
                assertThat(stopEventResultStructure.getStopEvent().getThisCall()).as("arrival stop").isNotNull();
                //assertThat(stopEventResultStructure.getStopEvent().getPreviousCall()).as("stops before arrival, may or may not").isEmpty();
                //assertThat(stopEventResultStructure.getStopEvent().getOnwardCall()).as("stops after arrival, may or may not").isNotEmpty();
            }
        }
        assertThat(count).isEqualTo(10);
    }

    @Test
    void mapToFirstOJPStopEventDeliveryStructure_DepartureResponse() throws IOException {
        final OJP ojp = unmarshalResponse("OJPStopEventDelivery_DeparturesFromBern.xml");

        final OJPStopEventDeliveryStructure stopEventDeliveryStructure = OJPAdapter.mapToFirstOJPStopEventDeliveryStructure(ojp);
        assertThat(stopEventDeliveryStructure).isNotNull();
        assertThat(stopEventDeliveryStructure.getDefaultLanguage()).isNotBlank();
        assertThat(stopEventDeliveryStructure.getRest()).isNotEmpty();

        int count = 0;
        for (JAXBElement<?> rest : stopEventDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() == StopEventResultStructure.class) {
                count++;
                final StopEventResultStructure stopEventResultStructure = (StopEventResultStructure) rest.getValue();
                assertThat(stopEventResultStructure.getStopEvent()).isNotNull();
                assertThat(stopEventResultStructure.getStopEvent().getThisCall()).as("arrival stop").isNotNull();
                //assertThat(stopEventResultStructure.getStopEvent().getPreviousCall()).as("stops before arrival").isEmpty();
                assertThat(stopEventResultStructure.getStopEvent().getOnwardCall()).as("stops after arrival").isNotEmpty();
            }
        }
        assertThat(count).isEqualTo(10);
    }

    @Test
    void mapToFirstOJPTripDeliveryStructure_TripResponse() throws IOException {
        final OJP ojp = unmarshalResponse("OJPTripDelivery_Bern_Paris.xml");

        final OJPTripDeliveryStructure tripDeliveryStructure = OJPAdapter.mapToFirstOJPTripDeliveryStructure(ojp);
        assertThat(tripDeliveryStructure).isNotNull();
        assertThat(tripDeliveryStructure.getDefaultLanguage()).isNotBlank();
        assertThat(tripDeliveryStructure.getRest()).isNotEmpty();

        int count = 0;
        for (JAXBElement<?> rest : tripDeliveryStructure.getRest()) {
            if (rest.getDeclaredType() == TripResultStructure.class) {
                count++;
                final TripResultStructure tripResultStructure = (TripResultStructure) rest.getValue();
                assertThat(tripResultStructure.getTrip()).isNotNull();
                assertThat(tripResultStructure.getTrip().getId()).isNotBlank();
            }
        }
        assertThat(count).isEqualTo(5);
    }
}
