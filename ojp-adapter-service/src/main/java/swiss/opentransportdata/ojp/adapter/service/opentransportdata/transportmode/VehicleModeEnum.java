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

package swiss.opentransportdata.ojp.adapter.service.opentransportdata.transportmode;

import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;

@JsonExtensibleEnum
@Schema(enumAsRef = true, description = ModelDoc.HINT_ENUM_AS_REF_EXTENSIBLE_IN_RESPONSE)
public enum VehicleModeEnum {
    TRAIN,
    BUS,
    CHAIRLIFT,
    COG_RAILWAY,
    GONDOLA,
    METRO,
    SHIP,
    CABLEWAY,
    TRAMWAY,
    /**
     * Routable Elevators (not to be missunderstood with a StopPlace indoor elevator).
     */
    ELEVATOR,

    // non PT-mode: not well defined by v580 or OpenTransportData resp. "Unknown"
    /**
     * v580:
     * <ul>
     *     <li>Der Verkehrsträger Luft wird im Rahmen des vorliegenden Dokuments nicht weiter untersucht.</li>
     *     <li>Verkehrsmittelkategorie "Flugzeug"</li>
     * </ul>
     * <p>
     * Since there is no clear definition, opts for TAP/TSI such as OSDM:
     *
     * @see <a href="https://www.era.europa.eu/sites/default/files/filesystem/tap/baseline_1.4.0_archive/era_tap_passenger_code_list_1.4.0.pdf">TAP TSI service mode "Plane"</a>
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/59d4cf59-800e-4c8d-ae0f-b8e9936afe9e>Opentransportdata transportmodes, NeTEx "air"</a>
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>Opentransportdata transportsubmodes "aircraft"</a>
     * @see <a href="https://app.swaggerhub.com/apis-docs/schlpbch/uic-90918_10_osdm/1.4.2-rc1#/Trips/postTrips>OSDM TripDataFilter::transportModes "PLANE"</a>
     */
    PLANE,
    /**
     * v580:
     * <ul>
     *     <li>Buslinien, welche teilweise oder abends durch Taxifahrzeuge gefahren werden, werden ebenfalls als Angebotskategorie Bus angeben. Die Spezialitäten («Taxi», «Abendtaxi», «spezieller Abfahrtsort» sind auf der Fahrtebene durch Informationen resp. Angebotshinweise anzugeben.</li>
     *     <li>Die Bedeutung des offiziellen Piktogrammes «Taxi» steht einzig für Privatfahrten und wird im öffentlichen Verkehr nicht verwendet.</li>
     *     <li>Abk. INFO+ "TX"</li>
     * </ul>
     */
    TAXI
}
