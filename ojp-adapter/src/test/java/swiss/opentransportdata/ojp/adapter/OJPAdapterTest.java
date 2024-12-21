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
import java.io.IOException;
import java.io.InputStream;
import org.assertj.core.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

class OJPAdapterTest {

    private static final OJPAdapter ojpAdapter = new OJPAdapter(WebClient.builder().build(), "OJP-Adapter test");

    private String readFile(String filename) throws IOException {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("mockdata/ojp_v1_0/" + filename)) {
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

        final OJP ojp = ojpAdapter.unmarshalResponse2(ResponseEntity.ok(xmlInstance));
        assertThat(ojp).isNotNull();

        assertThat(ojp.getOJPResponse()).isNotNull();
        assertThat(ojp.getOJPResponse().getServiceDelivery()).isNotNull();
        assertThat(ojp.getOJPResponse().getServiceDelivery().isStatus()).isTrue();
        assertThat(ojp.getOJPResponse().getServiceDelivery().getErrorCondition()).isNull();
        assertThat(ojp.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery()).as("JAXBElement").hasSize(1);

        return ojp;
    }

    //TODO OJP 2.0 replace v1 files with v2
    @Disabled
    @Test
    void mapToFirstOJPLocationInformationDeliveryStructure() throws IOException {
        final OJP ojp = unmarshalResponse("OJPLocationInformationDelivery_Bern.xml");

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojp);
        assertThat(ojpLocationInformationDeliveryStructure).isNotNull();
        /* TODO OJP v2.0
        assertThat(ojpLocationInformationDeliveryStructure.getLocation()).hasSize(26);
        for (PlaceResultStructure placeResultStructure : ojpLocationInformationDeliveryStructure.getLocation()) {
            assertThat(placeResultStructure.getLocation()).isNotNull();
            assertThat(placeResultStructure.getLocation().getStopPlace()).isNotNull();
            assertThat(placeResultStructure.getLocation().getStopPlace().getStopPlaceName()).isNotNull();
            assertThat(placeResultStructure.getLocation().getStopPlace().getStopPlaceRef()).isNotNull();
        }
         */
    }

    //TODO OJP 2.0 replace v1 files with v2
    @Disabled
    @Test
    void mapToFirstOJPStopEventDeliveryStructure_ArrivalResponse() throws IOException {
        final OJP ojp = unmarshalResponse("OJPStopEventDelivery_ArrivalsAtZurichHB.xml");

        final OJPStopEventDeliveryStructure stopEventDeliveryStructure = OJPAdapter.mapToFirstOJPStopEventDeliveryStructure(ojp);
        assertThat(stopEventDeliveryStructure).isNotNull();
        /*TODO OJP 2.0
        assertThat(stopEventDeliveryStructure.getStopEventResponseContext()).isNotNull();
        assertThat(stopEventDeliveryStructure.getStopEventResult()).hasSize(5);
        for (StopEventResultStructure stopEventResultStructure : stopEventDeliveryStructure.getStopEventResult()) {
            assertThat(stopEventResultStructure.getStopEvent()).isNotNull();
            assertThat(stopEventResultStructure.getStopEvent().getThisCall()).as("arrival stop").isNotNull();
            assertThat(stopEventResultStructure.getStopEvent().getPreviousCall()).as("stops before arrival").isNotEmpty();
            assertThat(stopEventResultStructure.getStopEvent().getOnwardCall()).as("stops after arrival").isEmpty();
        }

         */
    }

    //TODO OJP 2.0 replace v1 files with v2
    @Disabled
    @Test
    void mapToFirstOJPStopEventDeliveryStructure_DepartureResponse() throws IOException {
        final OJP ojp = unmarshalResponse("OJPStopEventDelivery_DeparturesFromBern.xml");

        final OJPStopEventDeliveryStructure stopEventDeliveryStructure = OJPAdapter.mapToFirstOJPStopEventDeliveryStructure(ojp);
        assertThat(stopEventDeliveryStructure).isNotNull();
        /*TODO OJP 2.0
        assertThat(stopEventDeliveryStructure.getStopEventResponseContext()).isNotNull();
        assertThat(stopEventDeliveryStructure.getStopEventResult()).hasSize(3);
        for (StopEventResultStructure stopEventResultStructure : stopEventDeliveryStructure.getStopEventResult()) {
            assertThat(stopEventResultStructure.getStopEvent()).isNotNull();
            assertThat(stopEventResultStructure.getStopEvent().getThisCall()).as("arrival stop").isNotNull();
            assertThat(stopEventResultStructure.getStopEvent().getPreviousCall()).as("stops before arrival").isEmpty();
            assertThat(stopEventResultStructure.getStopEvent().getOnwardCall()).as("stops after arrival").isNotEmpty();
        }

         */
    }

    //TODO OJP 2.0 replace v1 files with v2
    @Disabled
    @Test
    void mapToFirstOJPTripDeliveryStructure_TripResponse() throws IOException {
        final OJP ojp = unmarshalResponse("OJPTripDelivery_Bern_Paris.xml");

        final OJPTripDeliveryStructure ojpTripDeliveryStructure = OJPAdapter.mapToFirstOJPTripDeliveryStructure(ojp);
        assertThat(ojpTripDeliveryStructure).isNotNull();
        /* TODO OJP 2.0
        assertThat(ojpTripDeliveryStructure.getTripResponseContext()).isNotNull();
        assertThat(ojpTripDeliveryStructure.getTripResult()).hasSize(3);
        for (TripResultStructure tripResultStructure : ojpTripDeliveryStructure.getTripResult()) {
            assertThat(tripResultStructure.getTrip()).isNotNull();
            assertThat(tripResultStructure.getTrip().getTripId()).isNotBlank();
        }

         */
    }
}
