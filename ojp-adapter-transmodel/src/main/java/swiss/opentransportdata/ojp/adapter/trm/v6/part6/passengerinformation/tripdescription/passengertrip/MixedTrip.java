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
 * Def. v6+March2022: A part of a TRIP PATTERN from one PLACE of any sort to another. A MIXED TRIP may consist of two or more consecutive LEGs of both PT and non PT modes, having some common
 * characteristics.
 * <p>
 * Refined definition 11.10.2023 (TRM Meeting): A part of a TRIP PATTERN that mixes both PT RIDE LEGs and PERSONAL LEGs.
 */
public interface MixedTrip extends Trip {

}
