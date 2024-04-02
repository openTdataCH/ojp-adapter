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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.request;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.OffsetDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

/**
 * Request JSON structure.
 */
@Schema(description = "ScheduledStopPoint reference to a StopPlace (PlaceReference) with a departure or arrival dateTime, see [ScheduledStopPointReference](https://github.com/SchweizerischeBundesbahnen/journey-service/blob/master/JSON-Objects.md#scheduledstoppointreference).")
@Data
@NoArgsConstructor
@ToString
@JsonPropertyOrder({"stopPlaceId", "dateTime"})
public class ScheduledStopPointReference implements StopPlaceReference {

    /**
     * Concrete ID of a location in relation to type. For e.g. "8507000"
     */
    @Schema(description = "`StopPlace::id` value related to `dateTime`.",
        requiredMode = RequiredMode.REQUIRED, example = "8507000")
    @NonNull
    String /*StopPlace::id*/ stopPlaceId;

    @Schema(description = "Departure or arrival date/time (" + ModelDoc.ISO8601 + ") at `stopPlaceId`.",
        requiredMode = RequiredMode.REQUIRED, example = ModelDoc.SAMPLE_OFFSETDATETIME)
    @NonNull
    OffsetDateTime dateTime;
}
