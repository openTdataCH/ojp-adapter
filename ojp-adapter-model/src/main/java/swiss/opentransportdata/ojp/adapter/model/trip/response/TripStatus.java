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
import lombok.Builder;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

/**
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TripStatusGroup">OJP TripStatus</a>
 * @see swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourney
 * @see swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceAlteration for more detailed information
 */
@Schema(description = "Realtime overall status of a `Trip` (depends on `PTRideLeg::serviceJourney` status).")
@Builder
@Value
public class TripStatus {

    @Schema(description = "false: Planned connection; true: Realtime alternative",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean alternative;

    @Schema(description = "Text intended for passengers about an alternative Trip, relates to `alternative`."
        + ModelDoc.TRANSLATED_TEXT, example = "Alternative Verbindung aufgrund der aktuellen Betriebslage. Bitte prüfen Sie diese kurz vor Reisebeginn nochmals auf Änderungen.")
    String alternativeFormatted;

    /**
     * OJP: TripStatus::infeasible Whether this trip cannot be used, due to operational delays and impossible transfers. Default is false.
     * <p>
     * OSDM: TripStatus::invalid (CR)
     *
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TripStatusGroup>OJP TripStatus::infeasible</a>
     */
    @Schema(description = "true: Trip is possible to ride based on the current realtime situation (related to `Trip::serviceCalendar`, `PTRideLeg::reachable`, etc); false: **Fatal resp. not rideable as a 'whole' Trip' anymore** (aka OJP infeasible, OSDM invalid). Important: if this valid toggles from true to false, the passenger might not be able to perform his Trip, by means individual re-planning might be necessary.",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "true")
    boolean valid;

    @Schema(description = "`PTRideLeg` cancelled (de:Ausfall), relates to `cancelledFormatted`.",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean cancelled;

    // same text according or cancelled and partiallyCancelled on Trip -> for a passenger both cases means same cancellation problem for the Trip
    @Schema(description = "If `cancelled` or `partiallyCancelled` is true, enduser info about `Trip`." + ModelDoc.TRANSLATED_TEXT, example = "Diese Verbindung fällt aus.")
    String cancelledFormatted;

    @Schema(description = "`PTRideLeg` partially cancelled (de:Teilausfall), relates to `cancelledFormatted`.",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean partiallyCancelled;

    @Schema(description = "Contains at least one platform change (de:Gleis-/Kante-/Steg-Änderung) on any `PTRideLeg`.",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean quayChanged;

    @Schema(description = "Contains at least one delay (de:Verspätung) on any `PTRideLeg`.",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean delayed;

    @Schema(description = "Contains at least one unknown delay (de:Unbestimmte Verspätung) on any `PTRideLeg`.",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean delayedUnknown;

    /**
     * CUS mechanism VDV-756 standard.
     */
    @Schema(description = "If not true, changing `PTRideLeg's` is not guaranteed (de:Anschluss gehalten).",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "true")
    boolean reachable;

    // redirected (OJP::deviation, OSDM::deviated)

    @Schema(description = "Contains at least one `StopPlace` which is not serviced (de:ausserordentliche Durchfahrt) on any `PTRideLeg`. Releates to `ScheduledStopPoint::stopStatus==NOT_SERVICED`.",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean notServicedStopPoints;

    @Schema(description = "true: contains additional `StopPlace` resp. `ScheduledStopPoint` (de:ausserordentlicher Halt). Releates to `ScheduledStopPoint::stopStatus==UNPLANNED` and `ServiceAlteration::unplannedStopPointsFormatted` (aka OJP Unplanned).",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean unplannedStopPoints;

    @Schema(description = "Hint whether at least one vehicle transfer is critical for passengers with a handicap, " +
        "related to `includeAccessibility` other than `ALL` and `PTRideLeg::navigationPathAssignment` (otherwise null).")
    Boolean mobilityRestrictedTransferCritical;
}
