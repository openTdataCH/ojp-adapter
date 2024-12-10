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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.vehiclestopping;

import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.stopplace.StopPlaceComponent;

/**
 * A place on the vehicle track where vehicles stop in order for passengers to board or alight from a vehicle.
 * <p>
 * A vehicle track is located on the respective INFRASTUCTURE LINK for the MODE (RAILWAY ELEMENT of rail network, ROAD ELEMENT of road network, etc). A VEHICLE STOPPING PLACE may be served by one or
 * more QUAYs.
 */
public interface VehicleStoppingPlace extends StopPlaceComponent {

    //List<VehicleStoppingPosition> partOf;

    // StopPlace containing;
}
