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
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Notice;

/**
 * TRM: breaking rename after TRM v6+March2022 to "CONNECTION LEG" :(
 * <p>
 * OJP: TransferLeg (de: für einen Ort, an dem ein Umsteigen erfolgt)
 *
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TransferLegStructure">OJP TransferLeg</a>
 */
@Schema(allOf = Leg.class, description = "Passenger transfer between 2 StopPlace's (typically when the underlying router does not know how to perform the interchange in detail, aka OJP TransferLeg)."
    + ModelDoc.HINT_INHERITED_LEG)
@Builder
@Value
public class ConnectionLeg implements Leg, swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip.ConnectionLeg {

    /**
     * see Transmodel UML "MODE diagramm notes"
     */
    public static final String MODE_TRANSFER = "TRANSFER";

    @Schema(type = "string", requiredMode = RequiredMode.REQUIRED,
        description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE, defaultValue = "ConnectionLeg")
    @NonNull
    String type = ConnectionLeg.class.getSimpleName();

    @Schema(description = "Transfer-mode: {" + MODE_TRANSFER + "}",
        requiredMode = RequiredMode.REQUIRED, example = MODE_TRANSFER)
    @NonNull
    String mode;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_ID,
        requiredMode = RequiredMode.REQUIRED, example = "2")
    @NonNull
    String id;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_DISTANCE)
    Integer distance;

    @Schema(description = "Transfer " + ModelDoc.DURATION + ".")
    String duration;

    @Schema(description = "Start of connection path towards `end` which correlates to a previous `PTRideLeg` end `ScheduledStopPoint` for a passenger transfer (interchange).",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    ConnectionEnd start;

    @Schema(description = "End of connection path started at `start` which correlates to a next `PTRideLeg` start `ScheduledStopPoint` for a passenger transfer (interchange).",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    ConnectionEnd end;

    /*
     * breaking change: if we ever get more ServiceJourney data -> think about replacing ::start, ::end, ::notices analog PTRideLeg::serviceJourney
     * (According to Roland Michel we have no HIM for sure)
     */
    @ArraySchema(schema = @Schema(description = "Notice's relevant for end-user or related backends, such as ticketing or reservation systems.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<Notice> notices;
}
