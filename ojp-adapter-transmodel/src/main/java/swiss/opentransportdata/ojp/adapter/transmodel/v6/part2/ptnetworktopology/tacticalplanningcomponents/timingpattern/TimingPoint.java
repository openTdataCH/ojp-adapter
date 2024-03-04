package swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.timingpattern;

import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericpointandlink.Point;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ScheduledStopPoint;

/**
 * A POINT against which the timing information necessary to build schedules may be recorded.
 *
 * @see ScheduledStopPoint
 */
public interface TimingPoint extends Point {
    // boolean isFlexible();

    /* Timing status of POINT; principle, secondary, other.
    TimingPointType
     */

    // List<TimingLink> to; [0..*]
    // List<TimingLink> from; [0..*]
}
