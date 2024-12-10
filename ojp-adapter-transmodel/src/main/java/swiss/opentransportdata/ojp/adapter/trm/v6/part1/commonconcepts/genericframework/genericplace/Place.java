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

package swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericplace;

import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericzoneandfeature.Zone;

/**
 * A geographic place of any type which may be specified as the origin or destination of a trip. A PLACE may be represented as a POINT (dimension 0) , a road section (dimension 1) or a ZONE (dimension
 * 2).
 * <p>
 * A PLACE is defined as a geographic place of any type which may be specified as the origin or destination of a trip. A PLACE may be of dimension 0 (a POINT), 1 (a road section) or 2 (a ZONE). The
 * PLACE model defines topographically significant places that a transport model may wish to describe. It also allows the description of the possibility of connecting between them. ACCESS indicates
 * the physical (spatial) possibility for a passenger to access or leave the public transport system. This link may be used during a trip for:
 * <ul>
 *   <li>the walking movement of a passenger from a PLACE (origin of the trip) to a SCHEDULED STOP POINT (origin of the PT TRIP), or</li>
 *   <li>the walking movement from a SCHEDULED STOP POINT (destination of the PT TRIP) to a PLACE (destination of the trip) (Generic Place Model).</li>
 * </ul>
 */
public interface Place extends Zone {

    // List<StopAssignment> for [0..*]
}
