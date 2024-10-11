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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.response;

import java.util.List;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern.JourneyPattern;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip.PTRideLeg;

/**
 * An ordered list of located POINTs defining one single path through the road (or rail) network. A ROUTE may pass through the same POINT more than once.
 * <p>
 * Conventions made (tricky one!!!):
 * <ul>
 *     <li>eu.cen.transmodel.v6x56.part2.ptnetworktopology.networkdescription.route.Route and eu.cen.transmodel.v6x56.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern.JourneyPattern are similar, where JourneyPattern's ordered list of SCHEDULED STOP POINTs and TIMING POINTs is on a single ROUTE.</li>
 *     <li>Route (road & rail) is more generic than JourneyPattern (PT), therefore we use a list of {@link ScheduledStopPoint} instead of Transmodel {@link swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ScheduledStopPoint} for all Leg types and  JourneyDetail here in a generic manner as well (corresponds to OJP::StopPoint).</li>
 * </ul>
 */
public interface Route extends PlottableProjection, swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.networkdescription.route.Route {

    /**
     * Transmodel JourneyPattern-->[1..*]PointInJourneyPattern:
     * <ul>
     *     <li>An ordered list of SCHEDULED STOP POINTs and TIMING POINTs on a single ROUTE, describing the pattern of working for public transport vehicles.A JOURNEY PATTERN may pass through the same POINT more than once. The first point of a JOURNEY PATTERN is the origin. The last point is the destination.</li>
     *     <li>ServiceJourneyPattern inherits from JourneyPattern and is implemented by PTRideLeg by convention</li>
     * </ul>
     * <p>
     * PTRideLeg::servedBy[1]
     * PTRideLeg::usedBy List<ServiceJourney extends VehicleJourney> [0..*] having List<TimetabledPassingTime>
     *
     * @return Start, intermediate and end Point's.
     * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ScheduledStopPoint
     * @see PTRideLeg ::startOf, ::endOf
     * @see JourneyPattern
     */
    @NonNull
    List<ScheduledStopPoint> getStopPoints();
}
