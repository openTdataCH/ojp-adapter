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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.trainstopassignment.response;

import com.fasterxml.jackson.annotation.JsonValue;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;

@JsonExtensibleEnum
public enum TrainElementAttribute {

    COMPARTMENT_FAMILYZONE("FZ"),
    COMPARTMENT_BUSINESS("AbteilBusiness"),
    COMPARTMENT_BIKE_RESERVATION_PFLICHT("AbteilVeloRes"),
    COMPARTMENT_BIKE("AbteilVeloPl"),
    COMPARTMENT_BABY_STROLLER("AbteilKinderwagen"),
    COMPARTMENT_WHEELCHAIR("AbteilRollstuhl"),
    LOW_FLOOR_ACCESS("NiederflurEinstieg"),
    GROUP_RESERVATION("Reisegruppe"),
    LOCOMOTIVE_HAFAS("LK"),
    COACH("HFS_WG_NUM"),
    CLOSED_CAR("-"),
    NO_PASSAGE("KD"),
    LOCOMOTIVE_CUS("LOK");

    private final String name;

    TrainElementAttribute(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
