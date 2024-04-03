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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.standards.SwissLocationId;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.stopassignment.PassengerStopAssignment;

/**
 * @see PassengerStopAssignment may contain Quay info, opts for StopCall yet.
 */
@Schema(description = "A `Quay` is the **place to board or alight a concrete vehicle by passengers**, " +
    "aka **passenger-platform** for **train (de:Gleis)**, or **bus stand (de:Kante)** or **ship pier (de:Steg)**, " +
    "related to a `ServiceProduct::vehicleMode`.")
@Builder
@Value
public class Quay implements SwissLocationId, /* Positionable (future use), */ swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.fixedobject.stopplace.Quay {

    // could represent future SLOID
    @Schema(description = "Non-formal id provided, see `swissLocationId`.", example = "8507000_12")
    @JsonProperty
    String id;

    @Schema(description = "Quay SLOID, if known (within Switzerland), related to `name`." + ModelDoc.DESCRIPTION_SLOID +
        " Depending on the context of the response, it might be an SLOID of the Quay itself or its departure/arrival track or even a section of a track.",
        example = "ch:1:sloid:7000:55:49")
    @JsonProperty
    String swissLocationId;

    @Schema(description = "Quay name as displayed at a `StopPlace`, " +
        "therefore special case like '12/13' is possible if decided dynamically at arrival or departure of the vehicle.",
        requiredMode = RequiredMode.REQUIRED, example = "12")
    @JsonProperty(required = true)
    @NonNull
    String name;

    /**
     * Transmodel relation "subzone of": Quay -- in --> [1] Quay / Quay [0..*] <-- Quay.
     * <p>
     * Perhaps a parentSwissLocationId in the future.
     */
    @Schema(description = "Id of the parent `Quay` (aka Transmodel `ZONE` or `STOP PLACE COMPONENT`), if any, modelling subzone / superzone relation. "
        + "Useful to determine if 2 quays are on the same physical platform. "
        + "Use it only for comparison, not for display, and not on long term comparison (may change over time). "
        + "Only given for `StopPlaceDetailed`.",
        example = "8507000_12/13")
    String parentId;

    /* ? FUTURE use in case we get more specific data, such as Car-door.
    List<BoardingPosition> boardingPositions;
     */
}
