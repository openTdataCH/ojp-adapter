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
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.reusablecomponents.transportmode.AccessMode;

/**
 * An AccessLeg represents typically a footpath (dependencies to ROKAS routing).
 * <p>
 * OJP: ContinuousLeg (de: nicht an einen Fahrplan gebunden)
 *
 * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip.AccessLeg
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#ContinuousLegStructure">OJP ContinuousLeg</a>
 */
@Schema(allOf = Leg.class, description =
    "Footpath or road access to/from a StopPlace at one end:\n" +
        "- and typically an Address/PointOfInterest on the other end. May occur at the beginning or end of a Trip (aka OJP ContinuousLeg)" +
        "- or in rare cases StopPlace as well (for Meta-Station footpath like main-station to any of its bus edges)."
        + ModelDoc.HINT_INHERITED_LEG)
@Builder
@Value
public class AccessLeg implements Leg, swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip.AccessLeg {

    /**
     * If used in a PT Trip Context: AccessLeg::mode
     * <p>
     * If used in a private/user related Trip without knowing the means of transportation and therefore not in a PT context: PersonalLeg::mode
     */
    public static final String ACCESS_MODE_ROAD = "ROAD";
    /**
     * foot, bicycle, taxi, boat, .. {@link AccessLeg#getMode()}
     *
     * @see AccessMode
     */
    public static final String ACCESS_MODE_FOOT = "FOOT";

    @Schema(type = "string", requiredMode = RequiredMode.REQUIRED,
        description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE,
        defaultValue = "AccessLeg")
    @NonNull
    String type;

    /**
     * @see AccessMode
     */
    @Schema(description = "Mode values: {" + ACCESS_MODE_FOOT + "," + ACCESS_MODE_ROAD + "}",
        requiredMode = RequiredMode.REQUIRED,
        example = ACCESS_MODE_FOOT)
    @NonNull
    String mode;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_ID,
        requiredMode = RequiredMode.REQUIRED,
        example = "0")
    @NonNull
    String id;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_DISTANCE)
    Integer distance;

    @Schema(description = "Access " + ModelDoc.DURATION + ".")
    String duration;

    @Schema(description = "Start of access path towards `end` (one of them must be a StopPlace and one of them must be an Address or PointOfInterest).",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    AccessEnd start;

    @Schema(description = "End of access path started at `start` (one of them must be a StopPlace and one of them must be an Address or PointOfInterest).",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    AccessEnd end;
}
