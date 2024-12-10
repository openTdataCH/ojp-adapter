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

package swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.vehiclejourney;

/**
 * The planned movement of a public transport vehicle on a DAY TYPE from the start point to the end point of a JOURNEY PATTERN on a specified ROUTE.
 * <p>
 * Transmodel considers a journey as a purely time-related concept: its attributes are times (Departure Time, Journey Duration). A VEHICLE JOURNEY is only linked to the topological object JOURNEY
 * PATTERN.
 * <p>
 * The work of the vehicles necessary to provide the service offer advertised to the public consists of SERVICE JOURNEYs. DEAD RUNs are unproductive VEHICLE JOURNEYs necessary to transfer vehicles
 * where they are needed, mainly from the depot into service and vice versa (Service Journey Model).
 * <p>
 * In most transport networks the scheduled journeys follow the same patterns of movement and the Tactical Planning Components Model allows these to be described as reusable components in their own
 * right. The elements defined in the Tactical Planning Components Model are subsequently used in the Journey Timing Model & Vehicle Journey Times Model to specify actual VEHICLE JOURNEYs at
 * particular times (Vehicle Journey Model).
 * <p>
 * Transmodel considers all elements available to design a timetable. These are represented in the Timetable Frame Model, the main concept being the VEHICLE JOURNEY and its timing.
 */
public interface VehicleJourney extends Journey {

    // departureTime
    // JourneyPattern for; [1]

    // List<TimetabledPassingTime> for; [*]

    // List<TrainNumber> identifying [0..*]

    // List<JourneyPart> part of [*]

    // Submode characterizing [0..1]
}
