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
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.AccessibilityBoardingAlighting;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ScheduledStopPoint;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip.TripPattern;

/**
 * Transmodel TripPattern:
 * <ul>
 *     <li>For e.g. de:Anforderung auch der Verkehrsplaner Beispiel -	Trip Reason: Weg zur Arbeit -	Trip Pattern: Muri – Wankdorf -	Trip_1: Bus (B 40)  Muri – Wankdorf
 *     <li>Trip_2: Bus  (B 19) Muri – Bern, Zug (S2) Bern -	Trip_n</li>
 * </ul>
 * <p>
 * OJP: TripSummaryStructure
 */
@Schema(description = "Summary of most relevant aspects of the given Trip and its PTRideLeg's. (Aka OJP TripSummaryStructure.)")
@Builder
@Value
public class TripSummary implements TripPattern {

    /* ? wait for consumer complaints
        // Transmodel: OffsetDateTime startTime
        @Schema(description = "Very origin of the `Trip` independent of its place-type.", requiredMode = RequiredMode.REQUIRED)
        @NonNull
        ScheduledStopPoint|AccessEnd origin;

        // Transmodel: OffsetDateTime endTime;
        @Schema(description = "Very destination of the `Trip` independent of its place-type.", requiredMode = RequiredMode.REQUIRED)
        @NonNull
        ScheduledStopPoint|AccessEnd destination;
    */

    @Schema(description = "First ScheduledStopPoint of a PTRideLeg which points to a `StopPlace` of the trip. Only given if the Trip contains any PTRideLeg.")
    ScheduledStopPoint firstStopPlace;

    @Schema(description = "Last ScheduledStopPoint of a PTRideLeg which points to a `StopPlace` of the trip. Only given if the Trip contains any PTRideLeg.")
    ScheduledStopPoint lastStopPlace;

    /**
     * Though in v2 Non-Null, we leave it nullable yet -> if AlternateModeLeg occupancy might be irrelevant?
     */
    @Schema(description = "Highest occupancyAverage on any PTRideLeg::origin in 1st class." + ModelDoc.HINT_ENUM_EXTENSIBLE + ModelDoc.OCCUPANCY_ENUM_LIST)
    String occupancyFirstClassMax;

    @Schema(description = "Highest occupancy on any PTRideLeg::origin in 2nd class." + ModelDoc.HINT_ENUM_EXTENSIBLE + ModelDoc.OCCUPANCY_ENUM_LIST)
    String occupancySecondClassMax;

    @Schema(description = "The most relevant boarding/alighting accessibility restriction over all `PTRideLeg` boarding/alighting `ScheduledStopPoint::place's` for handicaped people. " +
        "Relates to `ScheduledStopPoint::forBoarding, ::forAlighting` and needs `includeAccessibility` to be set.")
    AccessibilityBoardingAlighting accessibilityBoardingAlighting;

    /**
     * @see TripPattern ::singleOperator
     */
    @ArraySchema(schema = @Schema(description = "`ServiceProduct::name's` as displayable strings.",
        requiredMode = RequiredMode.REQUIRED, example = "[IC 1 756]"))
    @NonNull
    List<String> serviceProducts;
}