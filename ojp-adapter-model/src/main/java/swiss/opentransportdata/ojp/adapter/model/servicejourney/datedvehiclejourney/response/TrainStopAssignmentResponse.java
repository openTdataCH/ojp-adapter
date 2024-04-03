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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.datedvehiclejourney.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.Map;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.PublicLinks;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceReference;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.TrainStopAssignment;

/**
 * @author Peter Hirzel
 */
@Schema(description = "Contains a list of `TrainStopAssignment's`, matching the given stops, if known.")
@Builder
@Value
public class TrainStopAssignmentResponse implements JsonResponse {

    @Schema(requiredMode = RequiredMode.REQUIRED,
        description = "Map<String (PlaceReference), `TrainStopAssignment`> each containing a `CompoundTrain` per requested stop-point. " +
            "See `PlaceReference` in " + PublicLinks.DEV_MANUAL_HINT_COMPLEX_PARAMETER + ".")
    @NonNull
    Map<PlaceReference, TrainStopAssignment> trainStopAssignments;
}
