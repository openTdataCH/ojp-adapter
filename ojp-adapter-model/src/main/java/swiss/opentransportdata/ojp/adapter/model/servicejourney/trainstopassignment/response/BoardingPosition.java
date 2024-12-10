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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.trainstopassignment.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

// in OJP BordingPositition is rather a door position in the TrainElement
@Schema(description = "A location within a `Quay` from which passengers may directly board, or onto which passengers may directly alight from a vehicle.")
@Builder
@Value
public class BoardingPosition implements swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.stopplace.BoardingPosition {

    /**
     * Coming from inheritance to Zone (could be id of Edge, like SLOID within StopPlace)
     *
     * @see swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Quay#getId()
     */
    @Schema(description = "Non-formal id provided.",
        requiredMode = RequiredMode.REQUIRED, example = "8507000_12_C")
    @NonNull
    String id;

    // ?? Perhaps implement SwissLocationId if it is an addition to Quay::swissLocationId (for e.g. a specific section)??

    @Schema(description = "Boarding/alighting position which could be a concrete track (boardable/alightable by attached `Quay`), a section name (aka de:Sektor) or both.",
        requiredMode = RequiredMode.REQUIRED, example = "C")
    @NonNull
    String name;

    //    @Schema(description = "Informational usage of `BoardingPosuition`.",
    //        requiredMode = RequiredMode.REQUIRED)
    //    @NonNull
    //    BoardingPositionType type;

    //    public enum BoardingPositionType {
    //        /**
    //         * If boarding/altighting of a concrete vehicle is known (data quality may still be not 100% complete for e.g. to form an SLOID), for e.g. "12", "A", "12A-D", "12/13".
    //         * @see TrainComponent#getBoardingPosition()
    //         */
    //        BOARDING_ALIGHTING,
    //        /**
    //         * General information of physical plan like "12".
    //         * @see ch.sbb.ki.journeyservice.model.v3.place.response.StopPlaceDetailed
    //         */
    //        INFRASTRUCTURE
    //    }
}
