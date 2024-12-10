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

import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.Connection;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.interchange.Interchange;

/**
 * A part of a TRIP PATTERN corresponding to the movement of a user (passenger, driver) on one and only one public transport vehicle, from one SCHEDULED STOP POINT to another, on one JOURNEY PATTERN.
 * <p>
 * PUBLIC-TRANSPORTATION Leg
 * <p>
 * OJP RideLeg ?
 *
 * @see Connection
 * @see Interchange
 */
public interface PTRideLeg extends RideLeg {

    // see linked PTConnectionLeg::connectionFrom
    // PTConnectionLeg getBoardingOn();

    // see linked PTConnectionLeg::connectionTo
    // PTConnectionLeg getAlightingFrom();

    // StopAssignment for: [0..1]

    // ServiceJourney usedBy; [0..1]

    // Line on; [0..1]

    // List<Situation> affecting;

    // Direction in; [0..1]
}
