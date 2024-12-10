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

package swiss.opentransportdata.ojp.adapter.model.trip.request;

import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericaccessibility.PassengerAccessibilityNeed;

/**
 * This enum contains request enums to enforce accessibility hints.
 * <p>
 * Be aware: there are different values for accessibility in response!
 *
 * @see swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ScheduledStopPoint#getAccessibilityBoardingAlighting()
 */
@JsonExtensibleEnum
@Schema(enumAsRef = true)
public enum AccessibilityEnum /*breaking change ApiClient: rename PassengerAccessibilityNeed -> rethink really breaking: param &includeAccessibility for other scenarios!*/ implements
    PassengerAccessibilityNeed {

    /**
     * Request only.
     */
    ALL,
    //    /**
    //     * Request only.
    //     * <p>
    //     * Will query for any Accessibility info, as {@link #ALL}, but fill in {@code Connection::mobilityRestrictedTravellerTransferCritical}.
    //     * <p>
    //     * de:Hinweis ohne routing Anpassung, geroutete Umsteigezeit liegt unter dem Minimum für Behinderte (also bspw. im Normalfall ok z.B. 6min, aber für Leute die mind. 10min. benötigen knapp)
    //     */
    //    ALL_TRANSFER_CRITICAL_HINT,
    //    /**
    //     * Request & response.
    //     */
    //    BOARDING_ALIGHTING_SELF,
    //    /**
    //     * Request & response.
    //     */
    //    BOARDING_ALIGHTING_BY_CREW,
    //    /**
    //     * Request & response.
    //     */
    //    BOARDING_ALIGHTING_BY_NOTIFICATION,
    //    /**
    //     * Request & response.
    //     */
    //    BOARDING_ALIGHTING_SHUTTLE_TRANSPORT,
    /**
     * Request only.
     * <p>
     * No restriction about accessibility.
     * <p>
     * (Performance optimization if no hints at all about accessibility are relevant.)
     */
    NONE;

    public static final String ALL_AS_STRING = "ALL";
    public static final String NONE_AS_STRING = "NONE";
}
