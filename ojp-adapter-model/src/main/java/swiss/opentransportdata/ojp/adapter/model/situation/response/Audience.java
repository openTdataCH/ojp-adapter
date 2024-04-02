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
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.situation.request.AudienceEnum;

@Schema(description = "Audience (like enduser channels, operator-employees, ..) to be informed (aka: de:Publikationskanäle).")
@Builder
@Value
public class Audience {

    @Schema(description = ModelDoc.HINT_ENUM_EXTENSIBLE + " see `AudienceEnum`.",
        requiredMode = RequiredMode.REQUIRED,
        example = AudienceEnum.AUDIENCE_DEFAULT)
    @NonNull
    String /*AudienceEnum*/ type;

    @ArraySchema(schema = @Schema(description = "Named links.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<AudienceLink> urls;

    @Schema(description = "Valid-from date, to be combined with time.", example = "2022-08-30")
    LocalDate validFromDate;

    @Schema(description = "Valid-from time, to be combined with date.",
        type = "string", format = "time-local", example = "08:45")
    @DateTimeFormat(iso = ISO.TIME)
    LocalTime validFromTime;

    @Schema(description = "Valid-to date, to be combined with time.", example = "2022-09-06")
    LocalDate validToDate;

    @Schema(description = "Valid-to time, to be combined with date.",
        type = "string", format = "time-local", example = "17:15")
    @DateTimeFormat(iso = ISO.TIME)
    LocalTime validToTime;
}
