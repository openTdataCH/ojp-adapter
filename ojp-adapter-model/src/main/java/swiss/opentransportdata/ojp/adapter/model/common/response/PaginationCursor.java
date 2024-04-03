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

/**
 * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#248">SHOULD use pagination response page object</a>
 */
@Schema(description = "Pagination-cursor for next/previous of the same (by means in a `Trip` context earlier/later).")
@Builder
@Value
public class PaginationCursor {

    /**
     * SHOULD by Zalando: the prev-link or -cursor in a pagination response or object pointing to the previous collection object or page.
     *
     * @return the cursor in a pagination response pointing to the previous items.
     * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#161>SHOULD use pagination links where applicable</a>
     * @see #getNext()
     */
    @Schema(description = "Previous-context.")
    @JsonProperty
    String previous;

    /**
     * SHOULD by Zalando: the prev-link or -cursor in a pagination response or object pointing to the previous collection object or page.
     *
     * @return the cursor in a pagination response pointing to the next items.
     * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#161>SHOULD use pagination links where applicable</a>
     * @see #getPrevious()
     */
    @Schema(description = "Next-context.")
    @JsonProperty
    String next;

    /*
     * By Design: We do not offer the rest of Zalando SHOULD proposal yet on this object:
     * - self
     * - last
     * - items for e.g. see TripResponse::trips
     */
}
