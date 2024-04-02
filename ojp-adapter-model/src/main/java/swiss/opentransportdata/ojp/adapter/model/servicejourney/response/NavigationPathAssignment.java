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
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.trip.response.Connection;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.stopassignment.StopAssignment;

/**
 * Transmodel specialisation of {@link StopAssignment}
 */
@Schema(description = "The allocation of a **navigation path** to a specific `ScheduledStopPoint` assignment, for example to indicate the path to be taken to make a connection.<br>" +
    "Currently a **transfer-hint is given for handicaped people** at alighting at `PTRideLeg`s` last/alighting `ScheduledStopPoint` when transfering to next vehicle for boarding.")
@Builder
@Value
public class NavigationPathAssignment implements swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.pathassignment.NavigationPathAssignment {

    // in TRM [0..1] currently @NonNull as long as it is the only info, future use ?
    @Schema(description = "Relevant hints about the path connecting towards next vehicle to board.")
    @JsonProperty
    Connection connectionTo;

    // StopAssignmentType = "PT_VEHICLE_PASSENGER_TRANSFER"
}