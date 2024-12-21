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

package swiss.opentransportdata.ojp.adapter.model.place.request;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import swiss.opentransportdata.ojp.adapter.model.common.response.InheritanceDiscriminable;
import swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace;

/**
 * Generic AbstractPlace reference as a result of String parsing. Actually not a JsonObject at all.
 *
 * @see <a href="https://github.com/SchweizerischeBundesbahnen/journey-service/blob/master/v3/JSON-Objects.md#placereference">Corresponds to developer manual for PlaceReference as
 *     Request-Parameter</a>
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class PlaceReference implements InheritanceDiscriminable {

    public static final String TYPE_COORDINATES = "COORDINATES";
    public static final String TYPE_STOP_PLACE = StopPlace.class.getSimpleName();
    /**
     * Hard to distinguish between {@link swiss.opentransportdata.ojp.adapter.model.place.response.Address} and {@link swiss.opentransportdata.ojp.adapter.model.place.response.PointOfInterest}
     */
    public static final String TYPE_ADDRESS_POI = "ADDRESS_POI";

    @Schema(description = "`AbstractPlace` concrete sub-type.", allowableValues = {"StopPlace", "PointOfInterest", "Address",
        TYPE_COORDINATES /*TODO TYPE_ADDRESS_POI is non-documented for J-S internal use*/}, defaultValue = "StopPlace", example = "StopPlace")

    private final String type;

    @Override
    @NonNull
    public String getType() {
        if (StringUtils.isBlank(type)) {
            return TYPE_STOP_PLACE;
        }
        return type;
    }

    /**
     * Concrete ID of a location in relation to type. For e.g. "8507000"
     */
    @Schema(description = "`AbstractPlace::id` value related to type.", requiredMode = RequiredMode.REQUIRED, example = "8507000")
    @NonNull
    private final String placeId;

    /*
     * Radius for walk distance around the given place.
     */
    /*@Schema(description = "Walk-radius [m] acceptable for passenger at `Place` referenced. Default is " + ApiDocumentationV3.DEFAULT_WALK_RADIUS,
        defaultValue= "" + ApiDocumentationV3.DEFAULT_WALK_RADIUS, example = "200")
    Integer radius;*/
}