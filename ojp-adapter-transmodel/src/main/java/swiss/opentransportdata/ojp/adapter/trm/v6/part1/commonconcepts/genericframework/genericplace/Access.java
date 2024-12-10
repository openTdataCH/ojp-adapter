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

/**
 * The physical (spatial) possibility for a passenger to access or leave the public transport system. This link may be used during a trip for:- the walking movement of a passenger from a PLACE (origin
 * of the trip) to a SCHEDULED STOP POINT (origin of the PT TRIP), or- the walking movement from a SCHEDULED STOP POINT (destination of the PT TRIP) to a PLACE (destination of the trip).
 */
public interface Access extends Transfer {
    // AccessEnd start of [0..1]

    // AccessEnd end of [1]
}
