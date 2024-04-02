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

package swiss.opentransportdata.ojp.adapter.model.situation.request;

import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;

@JsonExtensibleEnum
@Schema(enumAsRef = true)
public enum SituationCauseEnum {
    /**
     * de: Information Category=0
     */
    INFORMATION,
    /**
     * de: Baustelle Category=1
     */
    CONSTRUCTION_SITE,

    /**
     * de: Störung Category=2
     */
    DISTURBANCE,

    /**
     * de: Verspätung Category=3
     */
    DELAY,

    /**
     * de: Bahnersatzbus Category=4
     */
    TRAIN_REPLACEMENT_BY_BUS,

    /**
     * de: Z.B. wenn eine Störung vorüber ist, wird eine Endmeldung gemacht wie "Die Störung im Bahnhof ist behoben, die Züge fahren wieder normal."
     * <p>
     * de: Endmeldung Category=5
     */

    END_MESSAGE,

    /**
     * "Vocal messages by operating staff as text (source VIA-Speaker), for e.g. updates update delays, disruptions and the like, relates to `includeVehicleSpeakerMessage`."
     */
    VOCAL_ANNOUNCEMENT_ON_VEHICLE;

    /**
     * @see #DISTURBANCE
     */
    public static final String SITUATION_CAUSE_DISTURBANCE = "DISTURBANCE";
}
