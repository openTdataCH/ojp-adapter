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

/**
 * @author Peter Hirzel
 */
@Schema(description = "Direction of Vehicle (typically shown on Vehicle-display or Display at Quay).")
@Builder
@Value
public class Direction implements swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.networkdescription.route.Direction, RouteIndexInterval {

    @Schema(description = "StopPlace::name or any direction-name.",
        requiredMode = RequiredMode.REQUIRED, example = "Basel SBB")
    @NonNull
    String name;

    @Schema(description = "From relevant StopPoint::routeIndex (might be given for JourneyDetail::directions).")
    Integer routeIndexFrom;

    @Schema(description = "To relevant StopPoint::routeIndex (might be given for JourneyDetail::directions).")
    Integer routeIndexTo;
}
