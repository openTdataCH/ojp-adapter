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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import swiss.opentransportdata.ojp.adapter.model.common.response.InheritanceDiscriminable;
import swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace;

/**
 * Request JSON structure.
 *
 * @see <a href="https://github.com/SchweizerischeBundesbahnen/journey-service/blob/master/JSON-Objects.md">Corresponds to developer manual for JSON-Objects as Request-Parameter</a>
 */
@Schema(description = "Generic AbstractPlace reference.")
@Data
@NoArgsConstructor
@ToString
@JsonPropertyOrder({"type", "placeId"})
public class PlaceReference implements InheritanceDiscriminable /* make package private*/ {

    public static final String COORDINATES = "COORDINATES";
    public static final String TYPE_STOP_PLACE = StopPlace.class.getSimpleName();

    @Schema(description = "`AbstractPlace` concrete sub-type.", allowableValues = {"StopPlace", "PointOfInterest", "Address",
        "COORDINATES"}, defaultValue = "StopPlace", example = "StopPlace")
    String type;

    @Override
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
    String placeId;

    /*
     * Radius for walk distance around the given place.
     */
    /*@Schema(description = "Walk-radius [m] acceptable for passenger at `Place` referenced. Default is " + ApiDocumentation.DEFAULT_WALK_RADIUS,
        defaultValue= "" + ApiDocumentation.DEFAULT_WALK_RADIUS, example = "200")
    Integer radius;*/
}
