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

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

@Schema(description = "Provide matching legend-entry related to `TrainElement::attributes`.")
@Builder
@Value
public class LegendItem {

    @Schema(description = "Reference to related `LegendItem::text` assigned by aggregated `TrainElement::attributes` for the whole `CompoundTrain`.",
        requiredMode = RequiredMode.REQUIRED, example = "FA")
    @NonNull
    String id;

    @Schema(description = "Detailed description of related `id`." + ModelDoc.TRANSLATED_TEXT,
        requiredMode = RequiredMode.REQUIRED, example = "Familienabteil")
    @NonNull
    String text;
}
