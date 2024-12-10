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
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.Collections;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.situation.request.SituationCauseEnum;
import swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.situation.basesituation.SituationReason;
import swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.situation.ptsituation.PTSituationConsequenceScope;

@Schema(description = "A disruption (fort e.g. an incident or a deviation (aka de:Störungs-, Ereignismeldung)) affecting planned PT `ServiceProduct's` in certain edges and/or regions.")
@Builder
@Value
public class PTSituation implements swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.situation.ptsituation.PTSituation {

    /**
     * @see SituationCauseEnum
     * @see SituationReason
     */
    @Schema(description = "A classification of what caused the situation, values see `SituationCauseEnum`." + ModelDoc.HINT_ENUM_EXTENSIBLE,
        example = SituationCauseEnum.SITUATION_CAUSE_DISTURBANCE)
    @JsonProperty    // @NonNull
        String /*SituationCauseEnum*/ cause;

    @Schema(description = "Scope affected by this situation-message.")
    PTSituationAffectedScope affectedScope;

    /**
     * @see PTSituationConsequenceScope
     */
    @ArraySchema(schema = @Schema(description = "An extent impacted by the PT situation-consequence on the `ServiceJourney` resp. `ServiceProduct`." +
        "<br>Be aware: HIM does not group `PTSituationMessage's` into a single Situation, therefore there is only ONE element per `PTSituation`.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    @Builder.Default
    List<PTSituationMessage> broadcastMessages = Collections.emptyList();
}
