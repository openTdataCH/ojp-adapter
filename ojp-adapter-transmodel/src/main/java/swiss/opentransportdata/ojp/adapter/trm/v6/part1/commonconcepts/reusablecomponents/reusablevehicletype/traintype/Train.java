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

package swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusablevehicletype.traintype;

import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusablevehicletype.vehicletype.TransportType;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusablevehicletype.vehicletype.VehicleType;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.coupledjourney.JourneyPartCoupled;

/**
 * A VEHICLE TYPE composed of TRAIN COMPONENTs in a certain order that cannot be split during operational use.
 *
 * @see JourneyPartCoupled
 */
public interface Train extends VehicleType, TransportType {

    //rolename: usedFor
    //List<TrainComponent> getComponents();
}
