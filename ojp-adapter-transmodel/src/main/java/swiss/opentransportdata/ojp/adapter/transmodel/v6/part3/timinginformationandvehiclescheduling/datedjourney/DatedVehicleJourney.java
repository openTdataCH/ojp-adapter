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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part3.timinginformationandvehiclescheduling.datedjourney;

/**
 * A particular journey of a vehicle on a particular OPERATING DAY including all modifications possibly decided by the control staff.
 * <p>
 * Many reasons lead to modification of the operational plan in the short term: special events; changes in the road infrastructure; incidents; etc. Some VEHICLE JOURNEYs may be added or deleted, may
 * use alternative or shortened ROUTEs and JOURNEY PATTERNs, occasional services may be added, etc. If these changes are only valid for one or a few days, the reference schedule for a DAY TYPE is not
 * modified, but the changes are only stored for the appropriate OPERATING DAYs.
 * <p>
 * DATED VEHICLE JOURNEY describes a vehicle journey planned for one specific OPERATING DAY.
 */
public interface DatedVehicleJourney {
    // List<DatedPassingTime> for [0..*]

    // OperatingDay date of [1]

    // List<DatedJourneyPart> used to compose [0..*]
}
