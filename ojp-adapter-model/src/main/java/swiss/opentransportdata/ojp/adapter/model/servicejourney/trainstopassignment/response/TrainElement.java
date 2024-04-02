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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.HashSet;
import java.util.Set;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

@Schema(description = "An elementary component of a `Train` (for e.g. a wagon/car/locomotive or in general 'carriage') with rather permanent properties, see `TrainComponent` for its instance on a concrete journey.")
@Builder
@Value
public class TrainElement implements swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.reusablecomponents.train.TrainElement {

    @Schema(description = "Aka car-UIC, which is potentially mapped to beacons installed. " +
        "`/v3/vehicles/by-vehicle/{vehicleId}` may detect a `Train` composing a `TrainElement` (mainly for SBB operated `VehicleMode` TRAIN) is on its way within a certain `ServiceJourney` (null means not present).",
        example = "938525010246")
    @JsonProperty
    String id;

    /**
     * see TypeOfTrainElement
     */
    @Schema(description = "Type of car (where a 'CAR' may be self-propelled in case of a combined passenger-car/locomotive (de:Triebwagen)): " +
        ModelDoc.HINT_ENUM_EXTENSIBLE + " ['FA','WR','CC','WL','CAR','LOC','UNKNOWN']")
    @JsonProperty
    String type;

    // KIB/Display-Services may distinguish combined '12' as well!
    @Schema(description = "Passenger-class ('1' or '2') of the car, if known." + ModelDoc.HINT_ENUM_EXTENSIBLE)
    @JsonProperty
    String passengerClass;

    @ArraySchema(schema = @Schema(description = "Attributes of the car (see `LegendItemV3` for description).", requiredMode = RequiredMode.REQUIRED, example = "[BZ]"))
    @JsonProperty(required = true)
    @NonNull
    @Builder.Default
    Set<String> attributes = new HashSet<>();

    @Schema(description = "Build description of this `TrainElement`.")
    DeckPlan deckPlan;
}
