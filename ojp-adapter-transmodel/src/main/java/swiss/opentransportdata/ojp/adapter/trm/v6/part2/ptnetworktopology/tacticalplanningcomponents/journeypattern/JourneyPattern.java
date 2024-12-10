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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern;

import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericpointandlinksequence.LinkSequence;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.networkdescription.route.Route;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ServicePattern;

/**
 * An ordered list of SCHEDULED STOP POINTs and TIMING POINTs on a single ROUTE, describing the pattern of working for public transport vehicles.A JOURNEY PATTERN may pass through the same POINT more
 * than once. The first point of a JOURNEY PATTERN is the origin. The last point is the destination.
 * <p>
 * Other specialisations of a LINK SEQUENCE are used to define the work of vehicles: JOURNEY PATTERN, (SERVICE PATTERNs, TIMING PATTERNs).
 * <p>
 * What is the passenger view of a {@link JourneyPattern}?
 * <ul>
 *   <li>In the domain of Passenger Information SERVICE PATTERNs are of particular importance, i.e. the specialisation of a JOURNEY PATTERN made up only of (scheduled) STOP POINTs IN JOURNEY PATTERN.</li>
 *   <li>Another concept in this context is also relevant: the SERVICE JOURNEY PATTERN, defined as the JOURNEY PATTERN for a (passenger carrying) SERVICE JOURNEY (Service Pattern Model).</li>
 * </ul>
 * <p>
 * Reusable journey patterns and service patterns are independent of actual operating times in scheduled journeys.
 * <p>
 * A SERVICE EXCLUSION constraint expresses the fact that the service on a specific JOURNEY PATTERN (usually a flexible JOURNEY PATTERN) cannot operate when another (regular) service operates.
 * <p>
 * How is journey timing considered in Transmodel? Basically the following situations are possible:
 * <ul>
 *   <li>Representation of journey timing as PASSING TIMEs (at specific points) derived from the run times (times taken to traverse TIMING LINKs within the JOURNEY PATTERN related to the VEHICLE JOURNEY)</li>
 *   <li>Consideration of DEFAULT run time : the default time taken by a vehicle to traverse a TIMING LINK for a specified TIME DEMAND TYPE (Time Demand Times Model)</li>
 *   <li>Consideration of JOURNEY PATTERN RUN TIME: the time taken to traverse a TIMING LINK in a particular JOURNEY PATTERN, for a specified TIME DEMAND TYPE. (Journey Pattern Times Model)</li>
 *   <li>Consideration of specific run times for each particular VEHICLE JOURNEY (Vehicle Journey Times Model)</li>
 * </ul>
 * Representation of a special behaviour of journeys
 * <ul>
 *   </li>frequency based services (services runing with a regular interval (every 10 mn, for example)</li>
 *   </li>rhythmical services (runs all xxh10, xxh25 and xxh45, for example)</li>
 * </ul>
 *
 * @see ServicePattern
 * @see Route
 */
public interface JourneyPattern extends LinkSequence {
    // List<PointInJourneyPattern> on;

    // List<DatedVehicleJourney> altered to use; [0..*]

    // Route covered by

    // ServicePattern contributing to

    // List<OperationalContext> characterising [0..*]
}
