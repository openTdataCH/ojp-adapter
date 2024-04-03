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

package swiss.opentransportdata.ojp.adapter.model.trip.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(enumAsRef = true)
public enum TrainStopAssignmentsEnum {

    NONE,
    ORIGIN,
    ORIGIN_DESTINATION;

    // ALL -> future use

    public static final String TRAIN_STOP_ASSIGNMENT_NONE = "NONE";
    public static final String TRAIN_STOP_ASSIGNMENT_ORIGIN = "ORIGIN";
    public static final String TRAIN_STOP_ASSIGNMENT_ORIGIN_DESTINATION = "ORIGIN_DESTINATION";
}
