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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents;

import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.stopassignment.StopAssignment;

/**
 * The association of a TRAIN COMPONENT at a SCHEDULED STOP POINT with a specific STOP PLACE and also possibly a QUAY and BOARDING POSITION.
 */
public interface TrainStopAssignment extends StopAssignment {

    // entranceToVehicle: MultilingualString

    // positionOfTrainElement: positiveInteger

    // TrainComponent subjectTo [1]
}