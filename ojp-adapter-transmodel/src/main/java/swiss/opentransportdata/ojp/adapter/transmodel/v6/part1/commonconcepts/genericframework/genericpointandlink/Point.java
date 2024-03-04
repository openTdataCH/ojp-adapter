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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericpointandlink;

/**
 * A 0-dimensional node of the network used for the spatial description of the network. POINTs may be located by a LOCATION in a given LOCATING SYSTEM.
 * <p>
 * A TYPE OF POINT is defined as an entity to describe common roles played by a number of POINTs. Each POINT is functionally classified as being of one or more types, according to the specific
 * information needs of a particular functional domain. Certain TYPEs of POINTs are regarded as important enough to be additionally represented by a separate concept. The most important of these are:
 * the SCHEDULED STOP POINT, TIMING POINT, ROUTE POINT. Other explicitly defined types are specialisations of the TIMING POINT: RELIEF POINT, PARKING POINT, GARAGE POINT (Vehicle & Crew Point Model)
 * or points specifically dedicated to operations control: TRAFFIC CONTROL POINT, ACTIVATION POINT, BEACON POINT (Activation Model).
 */
public interface Point {

    /*
     * [0..1]
     *
     * @return Name of TYPE OF POINT.
     */
    // String getName();

    // Zone representedBy/functionalCentroidFor ... but better avoid circular references and abstract meaningless words

    // List<Location> locatings

    // List<PassingTime> at;
}
