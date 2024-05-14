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

@Schema(allOf = Leg.class, description =
    "Movement of a user from one `Place` to another, where the `Trip` is made entirely by personal means (for e.g. private car), and neither of the endpoints is a `ScheduledStopPoint` or vehicle meeting point."
        + ModelDoc.HINT_INHERITED_LEG)
@Builder
@Value
public class PersonalLeg implements Leg, swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip.PersonalLeg {

    @Schema(type = "string", requiredMode = RequiredMode.REQUIRED,
        description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE, defaultValue = "PersonalLeg")
    @NonNull
    String type = PersonalLeg.class.getSimpleName();

    /**
     * "ROAD"
     *
     * @see swiss.opentransportdata.ojp.adapter.model.servicejourney.response.VehicleMode#getId()
     */
    @Schema(description = "Mode values: {" + AccessLeg.ACCESS_MODE_FOOT + "," + AccessLeg.ACCESS_MODE_ROAD + "}" + ModelDoc.HINT_ENUM_EXTENSIBLE,
        requiredMode = RequiredMode.REQUIRED, example = AccessLeg.ACCESS_MODE_ROAD)
    @NonNull
    String /*JsonExtensibleEnum*/ mode;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_ID + " (Aka JourneyReference, OJP JourneyRef)",
        requiredMode = RequiredMode.REQUIRED, example = "1")
    @NonNull
    String id;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_DISTANCE)
    Integer distance;

    @Schema(description = "Public transport " + ModelDoc.DURATION + " in realtime, if available otherwise planned. The value may be null, if a `PTRideLeg` is not rideable (for e.g. cancelled).")
    String duration;
}
