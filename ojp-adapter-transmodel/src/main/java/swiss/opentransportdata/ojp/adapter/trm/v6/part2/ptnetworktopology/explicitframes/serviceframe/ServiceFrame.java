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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.explicitframes.serviceframe;

import java.util.List;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.versionsandvalidity.genericversionframe.VersionFrame;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern.JourneyPattern;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.routingconstraint.TransferRestriction;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.Connection;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ScheduledStopPoint;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ServicePattern;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.StopArea;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.stopassignment.PassengerStopAssignment;

/**
 * A set of network service data (and other data logically related to these) to which the same VALIDITY CONDITIONs has been assigned.
 */
public interface ServiceFrame extends VersionFrame {

    List<TransferRestriction> getTransferRestrictions();

    List<ScheduledStopPoint> getStopPoints();

    List<StopArea> getStopAreas();

    List<Connection> getConnections();

    List<JourneyPattern> getJourneyPatterns();

    List<ServicePattern> getServicePatterns();

    List<PassengerStopAssignment> getPassengerStopAssignments();
}
