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

package swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.datedproductioncomponents.vehicleworkproductioncomponents;

/**
 * A JOURNEY PART taking place on a particular OPERATING DAY.
 * <p>
 * de:Flügelzug
 * <p>
 * DATED JOURNEY PARTs are useful, for example, for the description of the coupling and uncoupling of trains. Two trains T1001 and T2002 may operate on the same or different OPERATING DAYs and serve
 * some common stations. Coupling and uncoupling may occur, so there may be
 * <ul>
 *    <li>VEHICLE JOURNEYs operated by train T1001 serving stations A – B – C</li>
 *    <li>VEHICLE JOURNEYs operated by Train N°2002 serving stations A – B – D coupled with T1001 between A and B and then uncoupled in B.</li>
 * </ul>
 *
 * @see <a href="https://www.transmodel-cen.eu/wp-content/uploads/2015/01/TUTORIAL_Part4_v2.1-1.pdf">Part 4 Figure 1.3</a>
 */
public interface DatedJourneyPart {
    // OperatingDay date of [1]
}
