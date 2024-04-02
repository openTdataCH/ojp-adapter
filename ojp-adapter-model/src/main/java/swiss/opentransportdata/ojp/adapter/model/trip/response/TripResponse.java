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

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse;
import swiss.opentransportdata.ojp.adapter.model.common.response.PaginationCursor;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.tripquery.TripDelivery;

/**
 * We do not use Transmodel TripPattern, therefore we don't use TripDelivery - TripPattern[0..3] - Trip[1..*] as well.
 *
 * @author Peter Hirzel
 */
@Schema(description = "Contains a list of Trip's matching the search-criteria.")
@Builder
@Value
public class TripResponse implements JsonResponse, TripDelivery {

    @ArraySchema(minItems = 1, schema = @Schema(requiredMode = RequiredMode.REQUIRED,
        description = "Various Trip options [1..*] {ordered}."))
    @NonNull
    List<Trip> trips;

    /**
     * @see Trip#getPagingChecksum()
     * @see <a href="see https://opensource.zalando.com/restful-api-guidelines/#159 pagination by cursor>Zalando pagination by cursor</a>
     */
    @Schema(description = "Cursor based pagination scroll-forward/back pointer for the next elements with the given query params for this response. Relates to `Trip::pagingChecksum`.")
    PaginationCursor paginationCursor;
}
