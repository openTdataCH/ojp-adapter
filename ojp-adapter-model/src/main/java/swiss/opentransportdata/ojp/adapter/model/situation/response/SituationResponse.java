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

package swiss.opentransportdata.ojp.adapter.model.situation.response;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.situationquery.SituationDelivery;

@Schema(description = "Contains a list of situation-messages (source HIM, aka Siri::SituationsStructure).")
@Builder
@Value
public class SituationResponse implements JsonResponse, SituationDelivery {

    @ArraySchema(minItems = 1, schema = @Schema(requiredMode = RequiredMode.REQUIRED,
        description = "Various situations [1..*]."))
    @NonNull
    List<PTSituation> situations;
}
