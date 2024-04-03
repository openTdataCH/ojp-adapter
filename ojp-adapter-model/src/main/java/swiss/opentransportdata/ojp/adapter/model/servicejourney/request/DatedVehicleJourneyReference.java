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
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import swiss.opentransportdata.ojp.adapter.model.PublicLinks;

/**
 * Request JSON structure.
 *
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#DatedJourneyRefGroup>OJP DatedJourneyRef</a>
 */
@Schema(description = "Reference to a `DatedVehicleJourney` (aka OJP DatedJourneyRef). See [complex JSON parameter **DatedVehicleJourneyReference**]("
    + PublicLinks.DEV_MANUAL_DATED_VEHICLE_JOURNEY_REFERENCE + ")")
@Data
@NoArgsConstructor
@ToString
@JsonPropertyOrder({"name", "start", "end"})
public class DatedVehicleJourneyReference {

    @Schema(description = "Set the complete name as returned by `ServiceProduct`, see [ServiceProductReference](https://github.com/SchweizerischeBundesbahnen/journey-service/blob/master/JSON-Objects.md#serviceproductreference) for proper format.",
        requiredMode = RequiredMode.REQUIRED, example = "IC 1 753")
    @NonNull
    String name;

    @Schema(description = "Very first StopPlace (PlaceReference) on JourneyDetail, concerning **departure dateTime**.")
    ScheduledStopPointReference start;

    @Schema(description = "The `ServiceProduct::operator::id` for e.g. '000011'.", example = "000011")
    String operatorNumber;

    @Schema(description = "Operating-day of the `ServiceJourney`.")
    LocalDate operatingDay;
}
