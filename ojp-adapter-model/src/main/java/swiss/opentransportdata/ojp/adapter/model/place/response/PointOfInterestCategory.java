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

package swiss.opentransportdata.ojp.adapter.model.place.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

/**
 * @author Peter Hirzel
 */
@Schema(description = "Category of a Point of Interest (POI).")
@Builder
@Value
public class PointOfInterestCategory {

    @Schema(description = "Type of `PointOfInterest` category (list of values)." + ModelDoc.HINT_ENUM_EXTENSIBLE,
        requiredMode = RequiredMode.REQUIRED, example = "shopping")
    @NonNull
    String type;

    @Schema(description = "Sub-category of `PointOfInterest`, related to `type` resp. main-category.", example = "bakery")
    String subtype;

    @Schema(description = "Speaking name of `subtype` (or when unset of `type`)." + ModelDoc.TRANSLATED_TEXT,
        requiredMode = RequiredMode.REQUIRED, example = "Bakery")
    @NonNull
    String name;
}
