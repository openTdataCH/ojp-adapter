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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

@Schema(description = "The physical (spatial) possibility for a passenger to change from one public transport vehicle to another to continue the `Trip`, determined by two `ScheduledStopPoint's`." +
    " Different times may be necessary to cover the link between these points, depending on the kind of passenger.")
@Builder
@Value
public class Connection implements swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.Connection {
    // boolean transferOnly = false;

    @Schema(description = "Minimal transfer " + ModelDoc.DURATION + " for a mobility impaired traveller to make transfer. Relates to `includeAccessibility` other than `ALL`." +
        " See `mobilityRestrictedTravellerTransferRule` for the rules applied to determine the time needed.")
    @JsonProperty
    String mobilityRestrictedTravellerDuration;

    // Sets it as @NonNull (but for future use unknownable perhaps?)
    @Schema(description = "Hint whether the vehicle transfer is critical for handicaped people, related to `mobilityRestrictedTravellerDuration`.")
    @JsonProperty
    Boolean mobilityRestrictedTravellerTransferCritical;

    /**
     * @see <a href="https://code.sbb.ch/projects/KI_FAHRPLAN/repos/journey-service/browse/journey-service-persistence/src/main/resources/db/data/transfertime_accessibility_initial.sql">Fallback rules
     *     in TABLE transfer_time_accessibility_rule_per_track</a>
     */
    @Schema(description = "Hint for handicaped experts (such as AMO) about which duration rule was applied to determine minimal transfer time.", example = "Fallback")
    @JsonProperty
    String mobilityRestrictedTravellerTransferRule;
}
