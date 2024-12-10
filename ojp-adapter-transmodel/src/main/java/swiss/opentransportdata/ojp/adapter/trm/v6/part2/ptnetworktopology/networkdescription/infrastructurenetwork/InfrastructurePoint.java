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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.networkdescription.infrastructurenetwork;

import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericpointandlink.Point;

/**
 * A super-type including all POINTs of the physical network (e.g. RAILWAY JUNCTION).
 * <p>
 * The model of the infrastructure network is very basic and simple in Transmodel, made of INFRASTRUCTURE POINTs and LINKs. It is used to represent specific operational constraints (restrictions) for
 * public transport operation resulting from the characteristics of the INFRASTRUCTURE POINTs and LINKs and of VEHICLE TYPEs.The spatial detailed organisation of the infrastructure itself is described
 * by other models and the data is usually provided by GIS data sets.
 * <p>
 * Restrictions, i.e. constraints resulting from the physical characteristics of the network are represented in Transmodel by a range of concepts: OVERTAKING POSSIBILITY, IMPOSSIBLE MANOEVRE, MEETING
 * RESTRICTION, VEHICLE TYPE AT POINT. They may be relevant for the scheduling process, because vehicle journeys must be scheduled in a way to avoid such conflicting events.
 */
public interface InfrastructurePoint extends Point {

}
