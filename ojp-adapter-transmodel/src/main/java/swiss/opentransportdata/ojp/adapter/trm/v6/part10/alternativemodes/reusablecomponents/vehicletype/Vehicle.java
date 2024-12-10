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

package swiss.opentransportdata.ojp.adapter.trm.v6.part10.alternativemodes.reusablecomponents.vehicletype;

/**
 * A public transport vehicle used for carrying passengers.
 * <p>
 * The VEHICLE entity is used to describe the physical public transport vehicles available for short-term planning of operations and daily assignment (in contrast to logical vehicles considered for
 * resource planning). Each VEHICLE must be classified as of a particular VEHICLE TYPE.
 * <p>
 * Vehicle equipment is defined through the entity ACTUAL VEHICLE EQUIPMENT. Two types are particulary important for accessibility VEHICLE ACCESS EQUIPMENT and WHEELCHAIR VEHICLE EQUIPMENT.
 * Specialisations of (on(board) PASSENGER EQUIPMENT are described: ticketing equipment (e.g. TICKET VALIDATOR EQUIPMENT, TICKETING EQUIPMENT) and passenger service equipment (e.g. RUBBISH DISPOSAL,
 * PASSENGER SAFETY EQUIPMENT, SANITARY EQUIPMENT or PASSENGER INFORMATION EQUIPMENT).
 */
public interface Vehicle {
    // id
    // name
    // shortname

    // VehicleType classificationFor;

    // VehicleModel classifying;

    // List<Equipment> in;

    // Fleet comprising;

    // ModelEquipmentProfle in;
}
