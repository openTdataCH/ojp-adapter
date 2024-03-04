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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.passingtime;

import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern.JourneyPattern;

/**
 * Time data concerning public transport vehicles passing a particular POINT; e.g. arrival time, departure time, waiting time.
 * <p>
 * Are passing times at stops defined? Strictly speaking Transmodel differentiates space-related concepts from time-related concepts. So the PASSING TIMES are linked to vehicle journeys.
 * <p>
 * Two main types of PASSING TIMEs do exist: a set of TIMETABLED PASSING TIMEs is linked to a VEHICLE JOURNEY and a set of DATED PASSING TIMEs is linked to a DATED VEHICLE JOURNEY. Several
 * considerations have then to be undertaken, to calculate the timing of a journey, based on a reference TIMING POINT belonging to the covered JOURNEY PATTERN where a ‘departure time’ is specified for
 * the journey at this point, then run and wait times for the different TIMING LINKS (possibly depending on the TIME DEMAND TYPE) have to be considered to determine the PASSING TIMEs at TIMING POINTs.
 * The PASSING TIMEs at stops which are not TIMING POINTs may be determined by interpolation.
 *
 * @see JourneyPattern
 */
public interface PassingTime {
    // boolean isAlightAndReboard();

    // ArrivalDayOffset [0..1]
    // DepartureDayOffset [0..1]
}
