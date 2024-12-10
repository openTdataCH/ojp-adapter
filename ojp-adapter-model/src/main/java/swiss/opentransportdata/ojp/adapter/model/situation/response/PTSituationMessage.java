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
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.Links;
import swiss.opentransportdata.ojp.adapter.trm.v6.additionalcommonconcepts.reusablecomponents.message.MessagePart;
import swiss.opentransportdata.ojp.adapter.trm.v6.additionalcommonconcepts.reusablecomponents.message.MessagePriority;
import swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.situation.basesituation.Situation;
import swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.situation.ptsituation.PTSituationConsequence;

/**
 * SIRI PtSituationsElementStructure
 * <p>
 * OJP TripResult/Trip/SituationFullRef
 *
 * @see Situation
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#SituationFullRefStructure">SIRI SX Situation Exchange Service; OJP SituationFullRefStructure</a>
 */
@Schema(description = "A public transportation situation broadcast message affecting the planned PT operation (source HIM, aki Siri::PtSituation).<br>" +
    "Situations might be caused by a disruption (like an incident, construction site, deviation etc) and typically relate to some area (geofence) and passing `ServiceProduct` resp. concrete `ServiceJourney's`.")
@Builder
@Value
public class PTSituationMessage implements swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.situation.ptsituation.PTSituationMessage, MessagePriority {

    @Schema(description = "Identity of message (aka HIM ID).", requiredMode = RequiredMode.REQUIRED, example = "x944292")
    @JsonProperty(required = true)
    @NonNull
    String id;

    @Schema(description = "Alternate identity of message. This may contain values set by 'Via' service and therefore relate to RCS-ALEA ID useful for Liveticker, if given.",
        example = "2195004195693")
    @JsonProperty
    String alternateId;

    /**
     * @see PTSituationConsequence severity
     * @see MessagePriority
     */
    @Schema(description = "Priority rank.", requiredMode = RequiredMode.REQUIRED, example = "80")
    @JsonProperty(required = true)
    @NonNull
    Integer priority;

    /**
     * @see #detail
     * @see #detailShort
     * @see MessagePart
     */
    @Schema(description = "Heading of message formatted according to SBB business rule (aka HIM head)",
        requiredMode = RequiredMode.REQUIRED, example = "Einschränkungen im Bahnverkehr: Bern")
    @JsonProperty(required = true)
    @NonNull
    String title;

    /**
     * @see #title
     * @see MessagePart
     */
    @Schema(description = "Complete Footer/text of message formatted according to SBB business rule (HTML tags like BR(eak) are possible). Scoped for browser based UIs (aka HIM text).",
        requiredMode = RequiredMode.REQUIRED, example = "Grund: Ausserordentliche Bauarbeiten.<br>Dauer der Einschränkung: unbestimmt.<br>Die SBB wird so schnell wie möglich weiter informieren.")
    @JsonProperty(required = true)
    @NonNull
    String detail;

    /**
     * @see #title
     * @see MessagePart
     */
    @Schema(description = "Abbreviated Footer/text of message formatted according to SBB business rule (HTML tags like BR(eak) are possible). Scoped for App UIs.",
        requiredMode = RequiredMode.REQUIRED, example = "Der Bahnverkehr im Bahnhof Bern ist beeinträchtigt.")
    @JsonProperty(required = true)
    @NonNull
    String detailShort;

    @Schema(description = "Limiting period during which the situation-message should be published.")
    @JsonProperty
    PublicationWindow distributionPeriod;

    @ArraySchema(minItems = 1,
        schema = @Schema(description = "Audience-groups (like enduser channels, operator-employees, ..) to be informed (aka: de:Publikationskanäle). Make sure to inform the proper target-users.", requiredMode = RequiredMode.REQUIRED))
    @JsonProperty(required = true)
    @NonNull
    List<Audience> audiences;

    @Schema(description = "Refers to further public traffic-context ." + ModelDoc.DESCRIPTION_LINKS)
    @JsonProperty
    @EqualsAndHashCode.Exclude
    Links links;
}
