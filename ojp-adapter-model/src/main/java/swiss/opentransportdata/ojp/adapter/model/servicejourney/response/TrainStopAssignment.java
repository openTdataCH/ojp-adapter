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

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.trainstopassignment.response.CompoundTrain;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.stopassignment.StopAssignment;

/**
 * Transmodel specialisation of {@link StopAssignment}
 */
@Schema(description = "The association of a `TrainComponent` at a `ScheduledStopPoint` with a specific `StopPlace` and also possibly a `Quay` and `BoardingPosition`.")
@Builder
@Value
public class TrainStopAssignment implements swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.TrainStopAssignment {

    /**
     * KIB and Journey-Planner relevant.
     * <p>
     * How the formation is presented to passengers.
     */
    @Schema(description = "The complete `CompoundTrain` (kind of composition/formation snapshot).",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    CompoundTrain compoundTrain;
}
