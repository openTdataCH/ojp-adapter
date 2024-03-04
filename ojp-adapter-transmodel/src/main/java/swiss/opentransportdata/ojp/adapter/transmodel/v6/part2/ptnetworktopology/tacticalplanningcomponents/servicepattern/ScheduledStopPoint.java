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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern;

import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericpointandlink.Point;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.timingpattern.TimingPoint;

/**
 * A POINT where passengers can board or alight from vehicles.
 * <p>
 * A TIMING POINT is a POINT against which the timing information necessary to build schedules may be recorded. Some operators may want to define run times between any pair of SCHEDULED STOP POINTs
 * (related by a SERVICE LINK). In such a case, probably all SCHEDULED STOP POINTs of the network will also be classified as TIMING POINTs. Other companies will define run times only for a selection
 * of SCHEDULED STOP POINTs: only these will be at the same time TIMING POINTs and SCHEDULED STOP POINTs. The times related to the rest of the stops would then be derived by processing (e.g.
 * interpolation). Some POINTs, such as garage entry or exit points that are TIMING POINTs only.
 *
 * @see TimingPoint
 */
public interface ScheduledStopPoint extends Point {

    // String shortName; [0..1]

    // url;

    /**
     * @return Default for whether stop may be used for boarding . May be overridden on specific services.
     */
    boolean isForBoarding();

    /**
     * @return Default for whether stop may be used for alighting. May be overridden on specific services.
     */
    boolean isForAlighting();

    // requestStop;

    // List<ServiceLink> to; [0..*]
    // List<ServiceLink> from; [0..*]

    // StopArea composedOf; [0..1]

    // List<PassingTime> at; [0..*]

    /*
    List<TransferRestriction> from;
    List<TransferRestriction> to;
     */

    /*
    List<ServiceExclusion> from;
    List<ServiceExclusion> to;
     */
}
