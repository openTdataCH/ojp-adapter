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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.fixedobject.vehiclestopping;

import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.fixedobject.stopplace.StopPlaceComponent;

/**
 * The stopping position of a vehicle or one of its components as a location. May be specified as a ZONE corresponding to the bounding polygon of the vehicle, or one or more POINTs corresponding to
 * parts of the vehicle such as a door.
 * <p>
 * If given as a single point, indicates the position for the door relative to an indicated side of the vehicle.
 */
public interface VehicleStoppingPosition extends StopPlaceComponent {

}
