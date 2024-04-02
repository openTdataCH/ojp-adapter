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

package swiss.opentransportdata.ojp.adapter.service.api.converter;

import swiss.opentransportdata.ojp.adapter.model.trip.request.PassengerAccessibilityNeed;

/**
 * According to Open Journey Planer "StopCallStatus" for scheduled Stop's.
 * <ul>
 *   <li>PLANNED: No realtime changes expected</li>
 *   <li>CANCELLED (de:Ausfall): Stop is cancelled (exclusively or within a partial Journey-Segment)</li>
 *   <li>BEGIN_PARTIAL_CANCELLATION: First stop of partial cancellation (de:Teilausfall)</li>
 *   <li>END_PARTIAL_CANCELLATION: Last stop of partial cancellation (de:Teilausfall)</li>
 *   <li>NOT_SERVICED (de:ausserordentliche Durchfahrt): The vehicle will not call at this stop despite earlier planning</li>
 *   <li>UNPLANNED (de: ausserordentlicher Halt): Additional stop which has not been planned</li>
 * </ul>
 *
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#StopCallStatusGroup">OJP StopCallStatus: RequestStop, UnplannedStop, NotServicedStop, NoBoardingAtStop, NoAlightingAtStop}</a>
 */
enum StopStatus {
    /**
     * No realtime changes expected.
     * <p>
     * Also virtual Stops are PLANNED but have {@link PassengerAccessibilityNeed#NONE} in combination. Default
     */
    PLANNED,
    /**
     * Open Journey Planer: ServiceStatus: Cancelled (de:Ausfall) Whether this DatedVehicleJourney is cancelled and will not be run.
     * <p>
     * Cases: - JourneySegment totally cancelled (impacts all stops) - Stop between BEGIN_PARTIAL_CANCELLATION and END_PARTIAL_CANCELLATION
     */
    CANCELLED,
    /**
     * First stop of partial cancellation.
     * <p>
     * Departure definitively cancelled, arrival might be possible if not very first Stop on JourneyDetail.
     */
    BEGIN_PARTIAL_CANCELLATION,
    /**
     * Last stop of partial cancellation.
     * <p>
     * Arrival definitively cancelled, departure might be possible from here on if not very last Stop on JourneySegment.
     */
    END_PARTIAL_CANCELLATION,
    /**
     * According to Open Journey Planer "NotServicedStop": The vehicle will not call at this (intermediate) stop despite earlier planning. Special case of cancellation (de:ausserordentliche
     * Durchfahrt)
     * <p>
     * Aspect of de:Tagesfahrplan
     * <p>
     * OJP for e.g. LegBoardStructure::isNotServicedStop
     */
    NOT_SERVICED,

    /**
     * Open Journey Planer: ServiceStatus::Unplanned Whether this DatedVehicleJourney is an additional one that has not been planned.
     * <p>
     * Aspect of de:Tagesfahrplan
     * <p>
     * This stop has not been planned and is additional. (de: ausserordentlicher Halt)
     */
    UNPLANNED
}
