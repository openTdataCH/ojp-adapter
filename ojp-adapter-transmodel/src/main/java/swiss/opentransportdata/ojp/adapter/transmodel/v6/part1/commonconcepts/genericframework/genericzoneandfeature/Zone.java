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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericzoneandfeature;

import lombok.NonNull;

/**
 * A two-dimensional PLACE within the service area of a public transport operator (administrative zone, TARIFF ZONE, ACCESS ZONE, etc.).
 * <p>
 * A ZONE may be defined by a GROUP OF POINTS belonging to the ZONE. For instance, a TARIFF ZONE used to define a zonal fare structure in a zone-counting or zone-matrix system may be composed of a set
 * of stop points. A ZONE may also be defined as a geometric area, bordered by a LINK SEQUENCE (a polygon). In such a case, this LINK SEQUENCE has to be a closed one (i.e. the first and last POINTs IN
 * LINK SEQUENCE must be a view of the same POINT). A ZONE may be recursive, and include other smaller ZONEs (Generic Zone Model).
 * <p>
 * Zone based constraints are define by a ROUTING CONSTRAINT ZONE. The ZONE may be defined by its contained SCHEDULED STOP POINTS or by its boundary points. ZONEs are usually used to express
 * constraints like "If you board in this ZONE, you can't alight in the same ZONE", or "only alighting is permitted in this ZONE". The constraint applies to all the POINTs IN JOURNEY PATTERN of
 * specific LINEs included in the ZONE.
 */
public interface Zone {

    /**
     * ZoneIdType -> redefined in Place::id PlaceIdType, ..
     *
     * @return Unique ID
     */
    @NonNull
    String getId();

    /**
     * @return Name of ZONE.
     */
    String getName();

    // description

    // List<Zone> subZones -> included

    /*
     * Transmodel: Point representedBy [0..1]
     *
     * @return GeoJson Point representing the location of its Place roughly
     */
    //GeometryObjectPoint getRepresentedBy(); // avoid dependency to ch.sbb.ki.*

    // List<Feature> views
    // List<LinkSequence>
}
