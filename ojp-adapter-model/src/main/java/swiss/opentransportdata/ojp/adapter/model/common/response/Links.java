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

package swiss.opentransportdata.ojp.adapter.model.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

/**
 * @see <a href="https://en.wikipedia.org/wiki/HATEOAS">HATEOAS @ Wikipedia</a>
 * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#164">Hypertext links @ Zalando</a>
 */
@Schema(description = ModelDoc.DESCRIPTION_LINKS)
@Builder
@Value
public class Links {

    // as long as there is only one property -> consider it mandatory, but for future use, at least ONE property must contain a value
    @Schema(description = "Link to further details.")
    @JsonProperty
    String detail;
}
