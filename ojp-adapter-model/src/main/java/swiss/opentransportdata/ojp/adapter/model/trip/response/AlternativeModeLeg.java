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

package swiss.opentransportdata.ojp.adapter.model.trip.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

/**
 * TRM 6+2022 (March)
 */
@Schema(allOf = Leg.class, description =
    "Movement of a user (passenger, driver) using an ALTERNATIVE MODE OF OPERATION from one PLACE to another and that is not an `AccessLeg` nor a `PTConnectionLeg`."
        + ModelDoc.HINT_INHERITED_LEG)
@Builder
@Value
public class AlternativeModeLeg implements Leg,
    swiss.opentransportdata.ojp.adapter.transmodel.v6.part10.alternativemodes.reusablecomponents.transportmode.AlternativeModeLeg {

    @Schema(type = "string", requiredMode = RequiredMode.REQUIRED,
        description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE, defaultValue = "AlternativeModeLeg")
    @NonNull
    String type;

    @Schema(description = "Alternative mode",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String mode;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_ID,
        requiredMode = RequiredMode.REQUIRED, example = "3")
    @NonNull
    String id;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_DISTANCE)
    Integer distance;

    @Schema(description = "Leg " + ModelDoc.DURATION + ".")
    String duration;
/*
    @Schema(description = "The spatial projection of the leg as set of coordinate points for a specific purpose, such as displaying it on a map.")
    LineString spatialProjection;
 */
}
