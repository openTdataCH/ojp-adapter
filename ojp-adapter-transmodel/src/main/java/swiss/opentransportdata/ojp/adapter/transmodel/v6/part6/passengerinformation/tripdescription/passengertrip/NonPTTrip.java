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
 * Def. v6+March2022: A part of a TRIP PATTERN from one PLACE of any sort to another, made on means other than Public Transport. A NON-PT TRIP may consist of consecutive ACCESS LEGs or OTHER LEGs.
 * <p>
 * Refined definition 11.10.2023 (TRM Meeting): A part of a TRIP PATTERN consisting of a continuous sequence of PERSONAL LEGs and TRANSFER LEGs. Note: IT must not contain any PT RIDE LEGs.
 */
public interface NonPTTrip extends Trip {

}
