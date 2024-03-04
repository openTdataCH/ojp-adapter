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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericlayer;

import java.util.List;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericgrouping.GroupOfEntities;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericlocation.LocatingSystem;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.versionsandvalidity.genericversionframe.VersionFrame;

/**
 * A user-defined GROUP OF ENTITies, specified for a particular functional purpose, associating data referring to a particular LOCATING SYSTEM.
 * <p>
 * Topological ENTITIES used for describing a transport network can be grouped into different LAYERs. Each LAYER is associated with a one and only one LOCATING SYSTEM, and the entities belonging to
 * the LAYER have a position within this LOCATING SYSTEM. Examples of layers include:
 * <ul>
 *   <li>Infrastructure layer: describes road or rail network.</li>
 *   <li>Route layer: describes route topology.</li>
 *   <li>Service layer: describes network of stops served by routes.</li>
 *   <li>Timing layer: describes location of timing points and times between them.</li>
 * </ul>
 * <p>
 * The mechanism for relating ENTITIES of one LAYER to ENTITIES of another LAYER is called
 * projection. Projection can happen implicitly by transforming the entity position from the source
 * LOCATION SYSTEM to the destination LOCATION SYSTEM. However, there are cases where such
 * automatic transformation is not possible or practical, e.g. if a route needs to be displayed on a schematic
 * map, there is no way of calculating the positions from the spatial coordinates. Transmodel therefore
 * contains a mechanism for explicitly projecting (spatial) entities of one layer to another layer (Generic
 * Projection Model).
 */
public interface Layer extends GroupOfEntities {

    List<VersionFrame> getCorrespondingTo();

    @NonNull
    LocatingSystem getReferencing();
}
