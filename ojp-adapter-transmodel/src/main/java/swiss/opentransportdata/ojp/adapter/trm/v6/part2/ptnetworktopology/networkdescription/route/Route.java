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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.networkdescription.route;

import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericpointandlinksequence.LinkSequence;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern.JourneyPattern;

/**
 * An ordered list of located POINTs defining one single path through the road (or rail) network. A ROUTE may pass through the same POINT more than once.
 * <p>
 * The term “itinerary” ambiguous as are different types of “itineraries” or “paths” may exist, depending on the purpose to be described: for passengers? for vehicles? along roads? along the rail
 * network? a schematic view? etc.
 * <p>
 * The ROUTE entity represents a conventional way of describing a path through the network, to be used by regular PT services (i.e. vehicles). A ROUTE is defined as an ordered list of located POINTs
 * defining one single path through the road (or rail) network. A ROUTE may pass through the same POINT more than once.
 * <p>
 * ROUTE is a LINK SEQUENCE and must be built in a way that identifies a path without any ambiguity (Line & Route Model). Other specialisations of a LINK SEQUENCE are used to define the work of
 * vehicles: JOURNEY PATTERNs, SERVICE PATTERNs, TIMING PATTERNs (see Tactical Components Model). Passenger “paths” are called NAVIGATION PATHs (Navigation Path Model).
 *
 * @see JourneyPattern
 */
public interface Route extends LinkSequence {
    // List<JourneyPattern> on;

    // List<TimingPattern> defined on;

    // List<ServicePattern> defined on [0..*] -> StopPointInJourneyPattern -> ScheduledStopPoint

    // Direction for [0..1]
}
