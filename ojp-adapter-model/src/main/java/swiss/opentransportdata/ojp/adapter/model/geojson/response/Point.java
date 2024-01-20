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

package swiss.opentransportdata.ojp.adapter.model.geojson.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * GeoJSON Object for a Point:
 * <code>
 * { "type": "Point", "coordinates": [7.4385, 46.9488] }
 * </code>
 *
 * @author Florian Hof
 */
@Schema(description = "Point in [GeoJSON](https://datatracker.ietf.org/doc/html/rfc7946) format.")
@Value
@Builder
@JsonDeserialize(builder = Point.PointBuilder.class)
public class Point {

    public static final String GEOJSON_TYPE_NAME = "Point";

    private static final ToStringStyle JSON_STYLE = new ToStringStyleJsonArray().init();

    @Schema(description = "Type as per GeoJSON, always constant _" + GEOJSON_TYPE_NAME + "_.",
        requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY, defaultValue = GEOJSON_TYPE_NAME)
    @NonNull
    String type = GEOJSON_TYPE_NAME;

    @ArraySchema(minItems = 2,
        arraySchema = @Schema(description = "Coordinates as [longitude, latitude] resp. easting/northing.", requiredMode = RequiredMode.REQUIRED, example = "[7.4385, 46.9488]"))
    @NonNull
    Double[] coordinates;

    public Point(@NonNull Double[] coordinates) {
        checkValidCoordinates(coordinates);
        this.coordinates = coordinates;
    }

    public Point(@NonNull Double longitude, @NonNull Double latitude) {
        coordinates = new Double[]{longitude, latitude};
    }

    /**
     * get the longitude or easting = 1st axis
     */
    @JsonIgnore
    public @NonNull
    Double getLongitude() {
        return coordinates[0];
    }

    /**
     * get the latitude or northing = 2nd axis
     */
    @JsonIgnore
    public @NonNull
    Double getLatitude() {
        return coordinates[1];
    }

    static void checkValidCoordinates(@NonNull Double[] coordinates) {
        if (coordinates.length < 2 || coordinates[0] == null || coordinates[1] == null) {
            throw new IllegalArgumentException(
                "Bad format of GeoJson Point, coordinates must have at least 2 non-null numbers but was " + arrayToJson(coordinates));
        }
    }

    public static String arrayToJson(Object[] array) {
        if (array == null) {
            return "null";
        }
        return new ToStringBuilder(array, JSON_STYLE).append(array).toString();
    }

    public static class PointBuilder {

        public PointBuilder withCoordinates(@NonNull Double[] coordinates) {
            return coordinates(coordinates);
        }
    }

    private static class ToStringStyleJsonArray extends ToStringStyle {

        private static final long serialVersionUID = -6208651772994178161L;

        ToStringStyleJsonArray() {
        }

        ToStringStyleJsonArray init() {
            setArrayStart("[");
            setArrayEnd("]");
            setUseClassName(false);
            setUseIdentityHashCode(false);
            setUseFieldNames(false);
            setContentStart(StringUtils.EMPTY);
            setContentEnd(StringUtils.EMPTY);
            return this;
        }
    }
}
