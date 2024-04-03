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
import java.util.HashSet;
import java.util.Set;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

@Schema(description = "An elementary component of a `Train` as an instance of a correspondent `TrainElement` on a concrete `ServiceJourney`, where specific values at each `ScheduledStopPoint` for this unique formation on an operation-day, may have its dynamic state (like section or exitSide).")
@Builder
@Value
public class TrainComponent implements swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.reusablecomponents.train.TrainComponent {

    /**
     * Agreed on by Andreas Schlappbach and ÖBB.
     */
    public static final String ENUM_RESERVED_BY_GROUP = "RESERVED_BY_GROUP";
    @Schema(description = "Label on the `TrainElement`, typically a number visible by passenger close to the boarding door.", example = "7")
    String label;

/*
    // Name of TRAIN COMPONENT.
    String name;

    @Schema(description = "Order of  TrainComponent in Train.", example = "3")
    Integer order;
*/

    @Schema(description = "Occupancy prognosed on a daily basis (not a realtime fact, overall 1st and/or 2nd class)."
        + ModelDoc.HINT_ENUM_EXTENSIBLE + "[LOW,MEDIUM,HIGH,UNKNOWN]",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "UNKNOWN", example = "MEDIUM")
    @NonNull
    String occupancy;

    @Schema(description = "Determines if a passenger may pass (de: Durchgang) to the previous car within formation.",
        requiredMode = RequiredMode.REQUIRED)
    boolean previousPassage;

    @Schema(description = "Determines if a passenger may pass (de: Durchgang) to the next car within the formation.",
        requiredMode = RequiredMode.REQUIRED)
    boolean nextPassage;

    @Schema(description = "true: icon for no passage should be displayed between this car and the next one (from left to right).",
        requiredMode = RequiredMode.REQUIRED)
    boolean displayNoPassageIcon;

    @Schema(description = "true: For unknown reasons the car is not usable for passengers: false: Open or unknown.",
        requiredMode = RequiredMode.REQUIRED)
    boolean closed;

    @Schema(description = "true: the restaurant is attended, false: the restaurant is not attended, null: no restaurant on this car")
    Boolean restaurantAttended;

    @Schema(description = "Physical `TrainElement` (like car, locomotive).",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    TrainElement element;

    @Schema(description = "Area at the `Quay` where a concrete car stops for boarding/alighting at a specific `ScheduledStopPoint`, if known.")
    BoardingPosition boardingPosition;

    @ArraySchema(schema = @Schema(description = "Attributes advertised on this particular `TrainComponent`.",
        requiredMode = RequiredMode.REQUIRED, example = "[" + ENUM_RESERVED_BY_GROUP + "]"))
    @NonNull
    @Builder.Default
    Set<String> attributesAdvertised = new HashSet<>();
}
