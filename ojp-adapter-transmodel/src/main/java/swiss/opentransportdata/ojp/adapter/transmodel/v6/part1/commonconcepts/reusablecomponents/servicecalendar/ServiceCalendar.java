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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.reusablecomponents.servicecalendar;

/**
 * A collection of DAY TYPE ASSIGNMENTs.
 * <p>
 * The day of operation, considered from the point of view of the transportation process control, is described by the entity OPERATING DAY.The time limits of an OPERATING DAY will often deviate from
 * the official date. One day of operation covers for instance the period from 2.00 a.m. to 1.59 a.m. the day after, the period from 0.00 to 1.59 on the second day being assigned to the operational
 * day which started the day before. The production planning requires that a DAY TYPE is assigned to each OPERATING DAY, which is frequently referred as a “transportation calendar” or – in The
 * Conceptual Model – as a SERVICE CALENDAR.
 * <p>
 * One of the main principles of Transmodel is to clearly distinguish the space–related concepts from the time-related concepts. The Reference Data model covers on one hand the topological aspects of
 * the Public Transport Network, on the other hand, time-related aspects.
 * <p>
 * The time-related concepts are presented in the Service Calendar model (Part 1 – Common Concepts), Time Demand Type Model (Part 2 – Tactical Planning Components) and in the Timing Information Model
 * (Part 3 – Timing Information and Vehicle Scheduling).
 */
public interface ServiceCalendar {

    // Name of SERVICE CALENDAR.
    String getName();

    // Short Name of SERVICE CALENDAR.
    //String getShortName();

    // description

    // LocalDate from;
    // LocalData to;

    // id

    /*
     * Role: "for"
     */
    //@NonNull
    //List<OperatingPeriod> getPeriods();
}
