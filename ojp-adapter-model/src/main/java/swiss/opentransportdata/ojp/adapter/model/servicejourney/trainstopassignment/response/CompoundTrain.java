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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.trainstopassignment.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.train.TrainInCompoundTrain;

/**
 * OJP 1.0 hat keine Formationen.
 * <p>
 * OJP 2.0 verwendet die SIRI-Formation, die analog zur NeTEx-Formation ist und damit auch zur Transmodel-Formation.
 * <p>
 * Wichtig: VDV 454 verwendet die Formation auch für Busse und ähnliches, indem sie das, was früher in den ServiceAttribute'n war, jetzt in die Formation packen. Matthias Günther hat mit Stefan
 * Buckmann abgemacht, dass die ServiceAttribute {@link TrainElement#getAttributes()} erhalten bleiben. Es macht keinen Sinn, eine Formation zu parsen, nur um herauszufinden, dass es sich um einen
 * Niederflurbus handelt.
 */
@Schema(description = "A vehicle-type composed (aka composition/-formation) of a sequence of **one or more vehicle-type `Train`**. A `CompoundTrain` is always self-propelled (even if a Locomotive is not explicitely distinguishable).")
@Builder
@Value
public class CompoundTrain implements swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.train.CompoundTrain {

    private static final String OPERATIONAL_DIRECTION_LEFT = "LEFT";

    /**
     * @see TrainInCompoundTrain
     */
    @Schema(description = "Type of operating direction." + ModelDoc.HINT_ENUM_EXTENSIBLE + "[" + OPERATIONAL_DIRECTION_LEFT
        + ", RIGHT]", requiredMode = RequiredMode.REQUIRED, example = OPERATIONAL_DIRECTION_LEFT)
    @JsonProperty(required = true)
    @NonNull
    String operationalOrientation;

    @ArraySchema(schema = @Schema(description = "Consists of [0..*] hints about realtime formation-changes if any.",
        requiredMode = RequiredMode.REQUIRED, example = "Dieser Zug verkehrt ohne Familienwagen."))
    @JsonProperty(required = true)
    @NonNull
    @Builder.Default
    List<String> trainChanges = new ArrayList<>();

    @ArraySchema(schema = @Schema(description = "A `CompoundTrain` consists of [1..*] `Train's` in a certain order. For e.g. in case of a wing-train (de:Flügelzug) multiple `Train's` may be splitted at a specific `ScheduledStopPoint`.",
        requiredMode = RequiredMode.REQUIRED))
    @JsonProperty(required = true)
    @NonNull
    @Builder.Default
    List<Train> trains = new ArrayList<>();

    /*
    @ArraySchema(schema = @Schema(description = "Attributes of the `TrainComponent`.", required = true))
    @JsonProperty(required = true)
    @NonNull
    @Builder.Default
    List<TrainComponentLabelAssignment> attributes = new ArrayList<>();
    *
     */

    @ArraySchema(schema = @Schema(description = "`TrainElement::attributes` are described by a legend-item describing each attribute in a sorted order.",
        requiredMode = RequiredMode.REQUIRED))
    @JsonProperty(required = true)
    @NonNull
    @Builder.Default
    List<LegendItem> legendItems = new ArrayList<>();

    @Schema(description = "Based on `TrainElement::deckplan` the 'lowest overall quality' assumed over the whole composition, therefore check each `TrainElement::deckplan` for more accurate data if available.")
    @JsonProperty
    DeckPlan deckPlanAssumed;
}
