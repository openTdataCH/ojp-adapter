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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part10.alternativemodes.reusablecomponents.vehicletype;

/**
 * A classification of public transport vehicles according to the vehicle scheduling requirements in mode and capacity (e.g. standard bus, double-deck, ...).
 */
public interface VehicleType extends TransportType {

    /*
     Whether VEHICLE TYPE has lift or ramp for wheelchair access.
     boolean hasLiftOrRamp
     */

    /*
    Whether VEHICLE TYPE is low floor
    boolean lowFloor
     */

    /*
    Whether  VEHICLE TYPE has a reversing direction.
    boolean reversingDirection
     */

    /*
    Maximum number of  passengers needing special places  that can be carried by a Vehicle of this type
    specialPlaceCapacity
     */

    /*
    Maximum number of  passengers needing special places  that can be carried by a Vehicle of this type
    wheelchairPlaceCapacity
     */

    /*
    PassengerCarryingRequirement for;
     */

}
