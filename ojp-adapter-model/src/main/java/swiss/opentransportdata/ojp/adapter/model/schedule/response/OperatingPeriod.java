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
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourney;
import swiss.opentransportdata.ojp.adapter.model.trip.response.Trip;

@Schema(description = "A **continuous interval of time** making up a timetable frame **of 1 year**, typically starting around 2nd Sunday of December.")
@Builder
@Value
public class OperatingPeriod implements swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusabletimeelements.servicecalendar.OperatingPeriod {

    /**
     * Periods where a Trip is ridable, given at each /trips request.
     * <p>
     * Related to {@link Trip}
     */
    public static final String PERIOD_TRIP = Trip.class.getSimpleName();

    public static final String PERIOD_SERVICEJOURNEY = ServiceJourney.class.getSimpleName();

    /**
     * Periods of an overall timetable request. Related to {@link StopPlace}
     */
    public static final String PERIOD_STOPPLACE = StopPlace.class.getSimpleName();

    @Schema(description = ModelDoc.DESCRIPTION_OPERATINGPERIOD_ON_SERVICEJOURNEY
        + " **Regular service-days a `ServiceProduct` operates** by scheduled plan within the same `OperatingPeriod`." + ModelDoc.TRANSLATED_TEXT,
        example = "täglich")
    String daysRegularFormatted;

    @Schema(description = ModelDoc.DESCRIPTION_OPERATINGPERIOD_ON_SERVICEJOURNEY
        + " **Irregular service-days (or excpetions to regular days) a `ServiceProduct` operates** by scheduled plan within the same `OperatingPeriod`."
        + ModelDoc.TRANSLATED_TEXT, example = "nicht 24., 25. Mär, 7., 8. Apr")
    String daysIrregularFormatted;

    @ArraySchema(schema = @Schema(description = "Concrete operating-days within this yearly `OperatingPeriod` depending on the following use cases:\n" +
        "- `name=Trip` in the context of `Trip::operatingPeriods`: all service-days of the `Trip`.\n" +
        "- `name=ServiceJourney` in the context of `ServiceJourney::operatingPeriods`: all service-days of the related `ServiceProduct`.\n" +
        "- `name=StopPlace` in the context of `ServiceCalendar::operatingPeriods` the planning-interval within this yearly `OperatingPeriod`.",
        requiredMode = RequiredMode.REQUIRED,
        example = "[2022-12-12,2023-12-11]"))
    @NonNull
    @Builder.Default
    List<LocalDate> operatingDays = Collections.emptyList();

    @Schema(description = "Name of attached type having this operating period, like `Trip`, `StopPlace` or `ServiceJourney` (just an informational value).",
        requiredMode = RequiredMode.REQUIRED,
        example = "Trip")
    @NonNull
    String name;

    /*
    @Schema(description = "Related to `name=StopPlace` for corresponding data-poolId.", 
        example = "gabo")
    String shortName;
    */

    @Schema(description = "In the context of `ServiceJourney` relates to the first `ScheduledStop::routeIndex` where given `operatingDays` are valid, null if unknown.",
        example = "3")
    Integer routeIndexFrom;

    @Schema(description = "In the context of `ServiceJourney` relates to the last `ScheduledStop::routeIndex` where `operatingDays` are valid, null if unknown.",
        example = "7")
    Integer routeIndexTo;
}
