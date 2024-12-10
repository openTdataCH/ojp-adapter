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

package swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.tripquery;

/**
 * A routing location used to constrain the journeys returned. Only VEHICLE JOURNEYs whose JOURNEY PATTERNs do or do not pass through the specified points will be returned.
 */
public interface TripViaPlace extends TripRequestPlace {
    // id (of Place)

    // canChangeAt (use for interchange or not)

    // goVia (avoid or not)
}
