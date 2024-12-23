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
import java.time.OffsetDateTime;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.place.response.Place;

/**
 * @see swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ScheduledStopPoint
 * @see ConnectionEnd
 */
@Schema(description = "Stop point on an `AccessLeg`.")
@Builder
@Value
public class AccessEnd implements swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericplace.AccessEnd {

    @Schema(description = "Place of this stop point, where one end of the `AccessLeg::start/::end` role must be a `StopPlace`.",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    Place place;

    @Schema(description = "Date/time (" + ModelDoc.ISO8601
        + ") planned, relates to `AccessLeg::start/::end` whether departure or arrival time.",
        example = ModelDoc.SAMPLE_OFFSETDATETIME)
    OffsetDateTime timeAimed;
}
