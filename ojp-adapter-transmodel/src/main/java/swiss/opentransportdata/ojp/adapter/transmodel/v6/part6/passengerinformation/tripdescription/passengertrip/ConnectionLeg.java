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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip;

/**
 * A part of a TRIP PATTERN corresponding to the movement of a passenger transferring from one SERVICE JOURNEY to another,  made over a CONNECTION from one SCHEDULED  STOP POINT to another, and
 * possibly following a specific NAVIGATION PATH.
 * <p>
 * Breaking change: Renamed after TRM v6+March2022 from "PT CONNECTION LEG" to "CONNECTION LEG" and inherited from new "TRANSFER LEG" :(
 */
public interface ConnectionLeg extends TransferLeg {

    /*
     * see linked PTRideLeg#getBoardingOn()
     *
     * @return

    @NonNull
    PTRideLeg getConnectingFrom();
     */

    /*
     * see linked PTRideLeg#getAlightingFrom()
     *
     * @return

    @NonNull
    PTRideLeg getConnectingTo();
     */

    // NavigationPath used by [0..1]
}
