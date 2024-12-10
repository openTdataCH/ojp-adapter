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

package swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.tripdescription.passengertrip;

/**
 * A part of a TRIP PATTERN corresponding to the movement of a user in a single vehicle, or a pedestrian mode such as walking.
 *
 * @see <a href="http://www.transmodel-cen.eu/model/index.htm">Leg: Transmodel Part6 - Passenger Information(PI)</a>
 */
public interface Leg {

    /**
     * @return Identifier of LEG
     */
    String getId();

    /**
     * @return Total distance for LEG.
     */
    Integer getDistance();

    /**
     * @return Duration of LEG
     */
    String getDuration();

    // Place startOf;

    // Place endOf;

    // Mode usedBy; [0..1]

    // List<LegTrack> depicted by [0..*]
}
