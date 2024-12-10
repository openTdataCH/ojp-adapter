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
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.InheritanceDiscriminable;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.transportmode.Mode;

/**
 * @author Peter Hirzel
 * @see <a href="http://www.transmodel-cen.eu/model/index.htm">Leg: Transmodel Part6 - Passenger Information(PI)</a>
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TripLegStructure">OJP TripLeg</a>
 */
@Schema(description = "**Abstract Superclass** of concrete inherited sub-classes such as **`PTRideLeg`, `AccessLeg`, `PTConnectionLeg`, `AlternateModeLeg`** (aka OJP TripLeg)**, `PersonalLeg`**.",
    type = "object",
    discriminatorProperty = "type",
    subTypes = {AccessLeg.class, PTRideLeg.class, ConnectionLeg.class, AlternativeModeLeg.class, PersonalLeg.class})
public interface Leg extends InheritanceDiscriminable, swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.tripdescription.passengertrip.Leg {

    @Schema(description = ModelDoc.DESCRIPTION_LEG_ID,
        requiredMode = RequiredMode.REQUIRED, example = "1")
    @NonNull
    @Override
    String getId();

    /**
     * @return Any means of transport.
     * @see Mode
     */
    @Schema(description = "Mode of the Leg",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String getMode();

    @Schema(description = ModelDoc.DESCRIPTION_LEG_DISTANCE)
    @Override
    Integer getDistance();

    @Schema(description = ModelDoc.DURATION)
    @Override
    String getDuration();
}
