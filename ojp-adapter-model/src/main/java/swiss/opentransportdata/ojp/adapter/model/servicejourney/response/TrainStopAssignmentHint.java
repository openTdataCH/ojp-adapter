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
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.trip.request.TrainStopAssignmentsEnum;

@Schema(description = "Hints which `TrainStopAssignment's` of `PTRideLeg` are potentially available for first `StopCall::departure` or last `StopCall::arrival`. Needs &"
    + ModelDoc.PARAM_INCLUDE_TRAIN_STOP_ASSIGNMENTS + "=" + TrainStopAssignmentsEnum.TRAIN_STOP_ASSIGNMENT_NONE)
@Builder
@Value
public class TrainStopAssignmentHint {

    @Schema(description = "`CompoundTrain` is currently available at the `PTRideLeg` origin stop.")
    boolean departureAvailable;

    @Schema(description = "`CompoundTrain` is currently available at the `PTRideLeg` destination stop.")
    boolean arrivalAvailable;

    @Schema(description = "Related to `compoundTrainChanges`, and given only if any at all. Useful for sub-grouping by UIs." + ModelDoc.TRANSLATED_TEXT)
    String compoundTrainChangesTitle;

    @Schema(description =
        "Known realtime changes as given by `CompoundTrain::trainChanges` (aka formation- or composition-changes), if any at **boarding stop** (changes at alighting are not contained)."
            + ModelDoc.TRANSLATED_TEXT,
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    @Builder.Default
    List<String> compoundTrainChanges = new ArrayList<>();
}
