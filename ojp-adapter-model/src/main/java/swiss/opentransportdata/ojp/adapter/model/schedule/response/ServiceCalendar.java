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

package swiss.opentransportdata.ojp.adapter.model.schedule.response;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.schedulequery.ScheduleDelivery;

/**
 * Bi-temporal routing data.
 * <p>
 * In Switzerland journey-planning is within a yearly interval, changing around ~10.12.20?? +/- a few days.
 */
@Schema(description = "Available planned journey calendar to span the whole time range covered by underlying systems for various Journey-Planner data.")
@Builder
@Value
public class ServiceCalendar implements JsonResponse, swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusabletimeelements.servicecalendar.ServiceCalendar,
    ScheduleDelivery {

    @Schema(description = "Informational reference name." + ModelDoc.TRANSLATED_TEXT,
        requiredMode = RequiredMode.REQUIRED,
        example = "CH Fahrplan")
    @NonNull
    String name;

    /**
     * Transmodel role: "for" List of service-days
     * <p>
     * For Trip current period only.
     */
    @ArraySchema(schema = @Schema(description = "A `ServiceCalendar` contains 1 (current) or 2 (overlapping around 2nd Sunday of December at de:Fahrplanwechsel) **yearly `operatingPeriods`**.\n" +
        "In this context each `operatingPeriods` entry contains a start and end operating-day specifying the valid interval covering the whole year. The end value represents the main year like 2022 of the period.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<OperatingPeriod> operatingPeriods;
}
