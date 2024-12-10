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

package swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.passingtime;

import java.time.OffsetDateTime;

/**
 * Time data about when a public transport vehicle should pass a particular POINT IN JOURNEY PATTERN on a particular DATED VEHICLE JOURNEY, in order to match the latest valid plan.
 */
public interface TargetPassingTime extends DatedPassingTime {

    /**
     * Intended Arrival time at TIMING POINT IN  JOURNEY PATTERN.
     * <p>
     * role: aimedArrivalTime
     */
    OffsetDateTime getArrivalTimeAimed();

    /**
     * Intended Departure time at TIMING POINT IN  JOURNEY PATTERN
     * <p>
     * role: +aimedDepartureTime
     */
    OffsetDateTime getDepartureTimeAimed();

    //aimedNonstopPassingTime;
    //aimedWaitingTime;

    // TimingPointInJourneyPattern passedAt; [1]
}
