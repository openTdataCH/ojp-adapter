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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part5.faremanagement.farestructuredescription.farezone;

import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.timingpattern.TimingPoint;

/**
 * A POINT on the network marking a boundary for the fare calculation. May or may not be a SCHEDULED STOP POINT.
 */
public interface BorderPoint extends TimingPoint {

}
