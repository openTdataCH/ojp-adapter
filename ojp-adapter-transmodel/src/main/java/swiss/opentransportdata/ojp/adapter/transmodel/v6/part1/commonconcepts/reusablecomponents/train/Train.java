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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.reusablecomponents.train;

import swiss.opentransportdata.ojp.adapter.transmodel.v6.part10.alternativemodes.reusablecomponents.vehicletype.TransportType;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part10.alternativemodes.reusablecomponents.vehicletype.VehicleType;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.coupledjourney.JourneyPartCoupled;

/**
 * A VEHICLE TYPE composed of TRAIN ELEMENTs in a certain order, i.e. of wagons assembled together and propelled by a locomotive or one of the wagons.
 *
 * @see JourneyPartCoupled
 */
public interface Train extends VehicleType, TransportType {

    //rolename: usedFor
    //List<TrainComponent> getComponents();
}
