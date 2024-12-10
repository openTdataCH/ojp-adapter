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

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Schema(description = "A vehicle-type composed of physical `TrainElement's` in a certain order, i.e. of wagons (aka car, coach) assembled together. " +
    "Multiple `Train's` (aka wing-train or de:Flügelzug) may be coupled or decoupled in separate self-propelled units within a `CompoundTrain` on its journey.")
@Builder
@Value
public class Train implements swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.train.Train {

    /**
     * In v3 always return destination if given (v2.Car::destination suppressed direction for non-wing-trains)
     */
    @Schema(description = "Direction label, relates to `CompoundTrain::operationalOrientation`, if known. SBB UIs usually suppress the direction if only ONE `Train` is given in `CompoundTrain`.",
        example = "Burgdorf")
    String label;

    @ArraySchema(schema = @Schema(description =
        "A `Train` consists of [1..*] `TrainComponent's` in a certain order where each component contains dynamic aspects on a certain `ServiceJourney` and `ScheduledStopPoint`. " +
            "The contained `TrainElement` is rather a statical view of the physical car (as defined by carUIC or Beacon MajorId) and won't change easily among different `ServiceJourney's`.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    @Builder.Default
    List<TrainComponent> components = new ArrayList<>();
}
