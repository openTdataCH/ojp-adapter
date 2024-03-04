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

/**
 * An aggregate of SIMPLE FEATUREs and/or other COMPLEX FEATUREs.
 * <p>
 * It is often necessary to define a group of objects of different types in a simpler representation, omitting the details. For instance, a train station composed of tracks, platforms, vending
 * machines, etc., or a depot composed of halls, parking areas, lanes, maintenance facilities, etc., are viewed in some layers as single POINTs. This is described by the entity COMPLEX FEATURE (named
 * by analogy with the GDF standard and usual GIS wording). A COMPLEX FEATURE is composed of one or more SIMPLE FEATUREs. A SIMPLE FEATURE is identical to an instance of either a POINT, a LINK, or a
 * ZONE. A COMPLEX FEATURE usually combines elements of different kinds such as POINTs, LINKs, ZONEs (each of them not necessarily of the same type), and even other COMPLEX FEATUREs. It should not be
 * mixed up with a group of elements (e.g. GROUP OF POINTS), combining elements of one single type only, for example one GROUP OF LINKs may be all LINKs in a tunnel, which is not a COMPLEX FEATURE
 * (Generic Feature Model).
 */
public interface ComplexFeature {
    // List<SimpleFeature> contained in;

    // Point representationFor; [0..1]

    // List<ComplexFeature> containing; [0..*]
}
