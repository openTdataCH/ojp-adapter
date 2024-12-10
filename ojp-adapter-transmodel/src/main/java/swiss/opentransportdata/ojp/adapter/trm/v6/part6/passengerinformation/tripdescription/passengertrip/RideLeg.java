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
 * Abstract.
 * <p>
 * Breaking change: renamed after TRM v6+March2022 from "OTHER LEG" to "RIDE LEG"!
 * <p>
 * (OTHER LEG definition: A part of a TRIP PATTERN corresponding to the movement of a user (passenger, driver) on a non-PT mode from one PLACE  to another and  that is not an ACCESS LEG or a PT
 * CONNECTION LEG.)
 */
public interface RideLeg extends Leg {

    // ConnectionLeg boarding;
    // ConnectionLeg alighting;
}
