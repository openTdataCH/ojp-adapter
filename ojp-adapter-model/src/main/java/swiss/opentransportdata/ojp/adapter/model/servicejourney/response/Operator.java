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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

/**
 * The Generic ORGANISATION Model defines abstract ORGANISATION elements that can be used wherever there is a need to describe an organisation. It is extended with AUTHORITY, OPERATOR and other
 * concrete organisation definitions specifically relevant for the transport domain. An ORGANISATION PART of an ORGANISATION acts as an ORGANISATIONAL UNIT responsible for the determination of the PT
 * Services, that need to be delivered in an OPERATIONAL CONTEXT often defined or limited to one TRANSPORT MODE or even to one VEHICLE MODE or SUBMODE of one of its DEPARTMENTs.
 * <p>
 * This defines the actual involved OPERATING DEPARTMENT that will act as the serving OPERATOR directly in charge of operations, and, when a contractual link to an AUTHORITY exists, for the ordered
 * services by the public transport AUTHORITY. The serving OPERATORs can be combined for executing this service in a GROUP OF OPERATORS (Generic Organisation Model, Transport Organisations Model).
 *
 * @see <a href="https://app.swaggerhub.com/apis-docs/schlpbch/uic-90918_10_osdm">OSDM TripSearchCriteria ::carrierFilter by RICS company code</a>
 * @see <a href="https://unioninternationalcheminsdefer.github.io/OSDM/spec/catalog-of-code-lists/">CarrierCode</a>
 */
@Schema(description = "A company providing public transport services (aka Carrier).")
@Builder
@Value
public class Operator implements swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.reusablecomponents.transportorganisations.Operator {

    @Schema(description =
        //TODO Ceres-Nr ? PLABE is dead
        "Atlas/INFO+/Plabe related operator-number (typically Integer for CH managed codes, however some TU's like in foreign countries might return String expressions like '80___'), relates to operatorName.\n"
            + "NOVA does not accept trimmed numbers!", example = "000011")
    @JsonProperty(required = true)
    @NonNull
    String id;

    //TODO perhaps add externalId->OpentransportData::id ?

    @Schema(description =
        "Fullname of responsible operator, relates to operatorNumber. This value matches with [OpenTransportData.swiss GoList field 'BEZEICHNUNG_DE'](https://opentransportdata.swiss/de/dataset/goch)."
            + ModelDoc.TRANSLATED_TEXT, example = "Schweizerische Bundesbahnen SBB")
    @JsonProperty String name;

    @Schema(description =
        "Abbreviation of operator, relates to operatorName. This value might differ from OpenTransportData.swiss abbreviation (there are 3 different versions)."
            + ModelDoc.TRANSLATED_TEXT, example = "SBB")
    @JsonProperty String shortName;
}
