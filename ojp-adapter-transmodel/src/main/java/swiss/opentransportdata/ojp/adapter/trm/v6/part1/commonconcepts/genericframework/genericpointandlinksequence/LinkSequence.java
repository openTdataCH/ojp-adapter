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

package swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericpointandlinksequence;

/**
 * An ordered sequence either of POINTs or of LINKs, defining a path through the network.
 * <p>
 * The LINK SEQUENCE Model defines a set of POINTs and/or LINKs making up a path through a network.
 * <p>
 * It allows a path to be described as a sequence of points, a sequence of links, or both; both views are relevant for different use cases. Specialisations of LINK SEQUENCEs are for example ROUTE,
 * JOURNEY PATTERN, TIMING PATTERN etc. and represent concrete Public Transport paths (Point and Link Sequenece Model).
 */
public interface LinkSequence {

    // distance

    // StringTranslateable name;

    // StringTranslateable shortName;

    // List<PointInLinkSequence> in [1..*]
}
