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

package swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.interchange;

import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.Connection;

/**
 * The scheduled possibility for transfer of passengers at the same or different SCHEDULED STOP POINTs.
 * <p>
 * INTERCHANGE is the scheduled possibility for transfer of passengers between two SERVICE JOURNEYs at the same or different SCHEDULED STOP POINTs (Interchange Model). INTERCHANGE RULES describe
 * conditions for considering JOURNEYs to meet or not to meet, specified indirectly: by a particular MODE, DIRECTION or LINE. Such conditions may alternatively be specified directly, indicating the
 * corresponding services. In this case they are either a SERVICE JOURNEY PATTERN INTERCHANGE or a SERVICE JOURNEY INTERCHANGE.
 * <p>
 * INTERCHANGE has to be differentiated from the concept of CONNECTION. Scheduled INTERCHANGEs represent operational time constraints for journeys to meet. CONNECTION represents the spatial
 * possibility for a passenger to change from one public transport vehicle to another to continue the trip.
 *
 * @see Connection
 */
public interface Interchange {

}
