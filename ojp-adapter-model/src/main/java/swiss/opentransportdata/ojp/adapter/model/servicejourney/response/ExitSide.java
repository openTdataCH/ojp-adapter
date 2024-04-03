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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.response;

import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;

/**
 * Provided by CUSM.
 */
@Schema(description = "Exit side within a vehicle at a Stop (for e.g. car of train-formation) in relation to driving/forward direction.")
@JsonExtensibleEnum
enum ExitSide {
    LEFT,
    RIGHT

    /*
     * We should distinguish between really UNKNOWN or IRRELEVANT, therefore never use this value.
     *
    UNKNOWN*/;

    // nasty hardcoded SwaggerUI values
    static final String LEFT_VALUE = "LEFT";
    static final String RIGHT_VALUE = "RIGHT";
}
