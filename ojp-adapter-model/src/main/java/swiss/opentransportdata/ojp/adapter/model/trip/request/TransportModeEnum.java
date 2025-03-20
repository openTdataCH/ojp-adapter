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

package swiss.opentransportdata.ojp.adapter.model.trip.request;

import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusablevehicletype.vehicletype.VehicleType;

/**
 * TODO Provide better Standard terms, which are the concrete modes. They do
 * not match exactly to TransportModeData "TransportMode" values which relate to more generic  {@link VehicleType} and they map to {@link swiss.opentransportdata.ojp.adapter.model.servicejourney.response.VehicleMode}!!!
 * <p>
 * P-Data-Mgmt is not quiet conform to OpenTransportData TransportMode's and TransportSubmode's, therefore this is a mixture possible to query for {@link swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourney}.
 * <p>
 * TODO By convention sticks to 1) Opentransportdata definition, 2) TAP-TSI, 3) creates an own filter-expression
 *
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#PtModeFilterStructure">OJP PTMode resp. siri:VehicleModesOfTransportEnumeration</a>
 * @see <a href="https://app.swaggerhub.com/apis-docs/schlpbch/uic-90918_10_osdm">OSDM TripParam.TripDataFilter.ptModeFilter ModeFilter::transportModes</a>
 * @see <a href="https://unioninternationalcheminsdefer.github.io/OSDM/spec/catalog-of-code-lists/">Transport Mode TAP-TSI Code B.2.3 (MERITS)</a>
 * @see <a href="https://www.allianceswisspass.ch/de/tarife-vorschriften/uebersicht/V580/Produkte-der-V580-FIScommun-1>06 Harmonisierung Verkehrsmittel, Angebotskategorien</a>
 */
@JsonExtensibleEnum
@Schema(enumAsRef = true)
public enum TransportModeEnum {

    /**
     * TAP-TSI/UIC: "HIGH_SPEED_TRAIN"
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>transportsubmodes: InterCityExpress, ..</a>
     * @see <a href="https://www.sbb.ch/en/buying/pages/fahrplan/fahrplan.xhtml">sbb.ch 'Advanced Search': ICE/TGV/RJX</a>
     */
    HIGH_SPEED_TRAIN,
    /**
     * TAP-TSI/UIC: "INTERCITY"
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>transportsubmodes: InterCity (IC))</a>
     * @see <a href="https://www.sbb.ch/en/buying/pages/fahrplan/fahrplan.xhtml">sbb.ch 'Advanced Search': EC/IC</a>
     */
    INTERCITY,
    /**
     * TAP-TSI/UIC: "INTERREGIONAL"
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>transportsubmodes: InterRegio (IR))</a>
     * @see <a href="https://www.sbb.ch/en/buying/pages/fahrplan/fahrplan.xhtml">sbb.ch 'Advanced Search': "IR/PE</a>
     */
    INTERREGIO,
    /**
     * TAP-TSI/UIC: "REGIONAL"
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>transportsubmodes: Regio (R)</a>
     * @see <a href="https://www.sbb.ch/en/buying/pages/fahrplan/fahrplan.xhtml">sbb.ch 'Advanced Search': "RE"</a>
     */
    REGIO,
    /**
     * TAP-TSI/UIC: "URBAN"
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>transportsubmodes: Urban-train (S)</a>
     * @see <a href="https://www.sbb.ch/en/buying/pages/fahrplan/fahrplan.xhtml">sbb.ch 'Advanced Search': "S/SN/R"</a>
     */
    URBAN_TRAIN,
    /**
     * TAP-TSI/UIC: "MOTOR_RAIL", "MOUNTAIN_TRAIN", "HISTORIC_TRAIN", "NIGHT_TRAIN" ?
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>transportsubmodes: ???</a>
     * @see <a href="https://www.sbb.ch/en/buying/pages/fahrplan/fahrplan.xhtml">sbb.ch 'Advanced Search': "ARZ/ECT"</a>
     */
    SPECIAL_TRAIN /*non-standard name*/,
    /**
     * Transport mode: "SHIP"
     */
    SHIP,
    /**
     * Transport mode: "BUS"
     */
    BUS,
    /**
     * Transport mode: "TRAMWAY" or "METRO"
     */
    TRAMWAY,
    /**
     * TAP-TSI/UIC: ?
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>transportsubmodes: Cableway(LB), Gondola(GB), Chairlift(SL), Funicular(FL)</a>
     * @see <a href="https://www.sbb.ch/en/buying/pages/fahrplan/fahrplan.xhtml">sbb.ch 'Advanced Search': "S/SN/R"</a>
     */
    CABLEWAY_GONDOLA_CHAIRLIFT_FUNICULAR
}
