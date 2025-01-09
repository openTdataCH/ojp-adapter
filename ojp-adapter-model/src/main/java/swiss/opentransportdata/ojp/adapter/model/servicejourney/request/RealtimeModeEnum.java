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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.request;

import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;

/**
 * Planned versus realtime impacted journeys.
 *
 * Aka OJP UseRealtimeDataEnumeration
 */
@JsonExtensibleEnum
@Schema(enumAsRef = true)
public enum RealtimeModeEnum {
    /**
     * Realtime impacted if any.
     *
     * Might be router-specific, for e.g.:
     * <ul>
     *     <li>Hafas knows REALTIME_RIDEABLE (Rt without cancelled).</li>
     *     <li>OJP distinguishes between FULL and EXPLANATORY.</li>
     * </ul>
     */
    REALTIME,

    /**
     * Planned without realtime.
     *
     * Aka OJP UseRealtimeDataEnumeration#NONE
     */
    OFF;

    /**
     * First entry becomes defaultValue by OpenApi if not further restricted!
     */
    public static final String REALTIME_AS_STRING = "REALTIME";
}
