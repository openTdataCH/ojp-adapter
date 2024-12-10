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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern;

import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericplace.Transfer;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.interchange.Interchange;

/**
 * The physical (spatial) possibility for a passenger to change from one public transport vehicle to another to continue the trip, determined by two SCHEDULED STOP POINTs (Service Connection Model).
 * Different times may be necessary to cover the link between these points, depending on the kind of passenger.
 * <p>
 * CONNECTION is a passenger view of a transfer.
 * <p>
 * INTERCHANGE is an operational constraint for a transfer: it is defined as the scheduled possibility for transfer of passengers between two SERVICE JOURNEYs at the same or different SCHEDULED STOP
 * POINTs (Interchange Model).
 *
 * @see Interchange
 */
public interface Connection extends Transfer {
    // List<Interchange> for; [0..*]

    // List<NavigationPathAssignment> for [0..*]
}
