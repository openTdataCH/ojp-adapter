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

package swiss.opentransportdata.ojp.adapter.model.place.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.model.common.response.InheritanceDiscriminable;
import swiss.opentransportdata.ojp.adapter.model.common.response.Positionable;

/**
 * @author Peter Hirzel
 */
@Schema(description = "**Abstract Superclass** of concrete inherited sub-classes such as **`StopPlace`, `Address`, `PointOfInterest`**.",
    type = "object", discriminatorProperty = "type", subTypes = {StopPlace.class, Address.class, PointOfInterest.class})
public interface Place extends InheritanceDiscriminable, Positionable /*TODO, eu.cen.transmodel.v6x56.part1.commonconcepts.genericframework.genericplace.Place, AddressablePlace */ {

    /**
     * Transmodel Zone::id
     */
    @Schema(description = "Unique id referable by underlying system(s).", requiredMode = RequiredMode.REQUIRED)
    @NonNull
    //@Override
    String getId();

    @Schema(description = "Unique non-translated name of Place.", requiredMode = RequiredMode.REQUIRED)
    @NonNull
        //@Override
    String getName();

    //    /*
    //     * Swiss canton
    //     *
    //     * @return for e.g. "BE"
    //     */
    //    @Schema(description = "In CH this represents the 'canton' abbreviation.", example = "BE")
    //    String getCanton();

    /**
     * Two character ISO 3166 = ~ IANA identifier
     * <p>
     * DiDok v3 GeoContext (not Organisation)
     */
    @Schema(description = "The two uppercase character of ISO 3166 code, mostly similar to lowercase IANA identifier (source: DiDok geographic-based _isoCountryCode_).", example = "CH")
    String getCountryCode();

    //    /**
    //     * Hafas specific bound to /location.nearby
    //     *
    //     * @return distance
    //     */
    //    @Schema(description = "Specifies the distance in [m] to the given coordinates in request." + " (Only set for `v3/places/by-coordinates*`).")
    //    Integer getDistanceToSearchPosition();
}
