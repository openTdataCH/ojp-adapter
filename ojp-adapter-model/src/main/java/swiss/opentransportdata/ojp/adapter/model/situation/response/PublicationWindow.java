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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Builder;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

@Schema(description = "A period during which the situation should be published.")
@Builder
@Value
public class PublicationWindow implements swiss.opentransportdata.ojp.adapter.transmodel.v6.additionalcommonconcepts.reusablecomponents.message.PublicationWindow {

    @Schema(description = "Local start date of situation (related to `startTime`).", example = ModelDoc.SAMPLE_DATE)
    @JsonProperty
    LocalDate startDate;

    @Schema(description = "Local start time of situation (related to `startDate`).",
        type = "string", format = "time-local", example = "14:27")
    @DateTimeFormat(iso = ISO.TIME)
    @JsonProperty
    LocalTime startTime;

    @Schema(description = "Local end date of situation (related to `endTime`).")
    @JsonProperty
    LocalDate endDate;

    @Schema(description = "Local end time of situation (related to `endDate`).",
        type = "string", format = "time-local")
    @DateTimeFormat(iso = ISO.TIME)
    @JsonProperty
    LocalTime endTime;

    @Schema(description = "Situation starting daily at time within this publication window.",
        type = "string", format = "time-local")
    @DateTimeFormat(iso = ISO.TIME)
    @JsonProperty
    LocalTime dailyStartingAt;

    @Schema(description = "Situation " + ModelDoc.DURATION + " within this publication window.", example = "PT23H59M0S")
    @JsonProperty
    String dailyDuration;
}
