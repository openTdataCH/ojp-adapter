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

import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericpointandlinksequence.LinkSequence;

/**
 * Abstract class in TRM! Very conceptual approach with a focus on planning and therefore no realtime aspects (rather confusing).
 * <p>
 * A part of a TRIP PATTERN describing the movement of a passenger from one PLACE of any sort to another. A TRIP may consist of one or more consecutive LEGs having some common characteristics.
 *
 * @see <a href="http://www.transmodel-cen.eu/model/index.htm">Trip: Transmodel Part6 - Passenger Information(PI)</a>
 */
public interface Trip extends LinkSequence {

    /**
     * @return Identifier of PT TRIP.
     */
    @NonNull
    String getId();

    /*
     * {ordered} [1..*]
    @NonNull
    List<Leg> setpIn();
     */

    //TripPattern composedOf; [0..1]
}
