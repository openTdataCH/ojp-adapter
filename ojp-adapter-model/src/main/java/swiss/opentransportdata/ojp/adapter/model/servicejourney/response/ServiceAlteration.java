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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.servicejourney.ServiceJourney;

/**
 * @see swiss.opentransportdata.ojp.adapter.model.trip.response.TripStatus per whole Trip
 * @see ServiceJourney ::ServiceAlteration
 */
@Schema(description = "Status (realtime changes) to a `ServiceJourney` and might impact planned routing.")
@Builder
@Value
public class ServiceAlteration {

    @Schema(description = ModelDoc.CANCELLED,
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean cancelled;

    @Schema(description = ModelDoc.CANCELLED_FORMATTED,
        example = ModelDoc.CANCELLED_FORMATTED_SAMPLE)
    String cancelledFormatted;

    @Schema(description = ModelDoc.PARTIALLY_CANCELLED,
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean partiallyCancelled;

    // actually same text as ::cancelledFormatted -> for future changes we clone it here (as in V2)
    @Schema(description = ModelDoc.PARTIALLY_CANCELLED_FORMATTED,
        example = ModelDoc.CANCELLED_FORMATTED_SAMPLE)
    String partiallyCancelledFormatted;

    @Schema(description = "true: vehicle (`ServiceProduct`) change connection from `PTRideLeg` to `PTRideLeg` is possible (de: Anschluss kann gehalten werden, see `Trip::status::valid`); false: de:nicht mehr erreichbare Fahrt",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "true")
    boolean reachable;

    @Schema(description = "Transport-product change from Leg to Leg info according to SBB business rules. Relates to reachable.",
        example = "Your connecting train will be waiting, please change trains immediately.")
    String reachableFormatted;

    /**
     * Transmodel defines a LINE as a grouping of ROUTEs that is generally known to the public by a similar name or number. These ROUTEs are usually very similar to each other from the topological
     * point of view, being variants of a core route with some deviations only on certain parts.
     * <p>
     * OJP TripStatus::deviation (by definition we keep name because "deviation" is not a good state name, once Transmodel/OJP changes to deviated we might consider renaming)
     * <p>
     * OSDM will call it deviated
     *
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TripStatusGroup>OJP TripStatus::deviation</a>
     */
    @Schema(description = "true: journey is redirected (aka OJP deviation).",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    boolean redirected;

    @Schema(description = ModelDoc.REDIRECTED_FORMATTED, example = ModelDoc.REDIRECTED_FORMATTED_SAMPLE)
    String redirectedFormatted;

    @Schema(description = ModelDoc.UNPLANNED_STOPS_FORMATTED, example = ModelDoc.UNPLANNED_STOPS_FORMATTED_SAMPLE)
    String unplannedStopPointsFormatted;

    @Schema(description = "Enduser text, saying whether there is a delay on PTRideLeg (referring to first/last Stop)." + ModelDoc.TRANSLATED_TEXT,
        example = "Delay")
    String delayFormatted;

    @Schema(description =
        "Enduser text, saying whether there is a `Quay` change on `ServiceJourney` (typically referring to first and/or last `ScheduledStopPoint` on a `PTRideLeg`), which indicates the passengers to be careful at boarding/alighting."
            + ModelDoc.TRANSLATED_TEXT,
        example = "Gleisänderung")
    String quayChangedFormatted;
}
