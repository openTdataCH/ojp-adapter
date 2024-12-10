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
 * A couple of POINTs located sufficiently near that it may represent for a passenger a possibility to reach one of these POINTs when starting at the other one  in a timescale which is realistic when
 * carrying out a trip, e.g.  ACCESS.
 */
public interface Transfer {

    //type ==v2.LegType

    /**
     * Distance of TRANSFER link.
     */

    // Integer getDistance();

    // TransferEnd start of;

    // TransferEnd end of;

    // List<NavigationPath> for [0..*]

    // Duration mobilityRestrictedTravellerDuration [0..1]
}
