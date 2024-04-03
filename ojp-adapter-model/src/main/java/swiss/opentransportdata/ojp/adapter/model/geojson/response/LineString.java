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

/**
 * GeoJSON Object for a LineString:
 * <code>
 * { "type": "LineString", "coordinates": [[7.4385, 46.9488], [7.9363, 46.915], [7.936, 46.802]] }
 * </code>
 */
@Schema(description = "LineString in [GeoJSON](https://datatracker.ietf.org/doc/html/rfc7946) format.")
@Value
@Builder
@JsonDeserialize(builder = LineString.LineStringBuilder.class)
public class LineString {

    public static final String GEOJSON_TYPE_NAME = "LineString";

    @Schema(name = "type", description = "Type as per GeoJSON, always constant _" + GEOJSON_TYPE_NAME + "_.",
        requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY, defaultValue = GEOJSON_TYPE_NAME)
    @NonNull
    String type = GEOJSON_TYPE_NAME;

    @ArraySchema(arraySchema = @Schema(
        name = "coordinates",
        description = "List of coordinates as [longitude, latitude] resp. easting/northing.",
        example = "[[7.4385, 46.9488], [7.9363, 46.915], [7.936, 46.802]]",
        requiredMode = RequiredMode.REQUIRED),
        minItems = 2)
    @NonNull
    Double[][] coordinates;

    public LineString(@NonNull Double[][] coordinates) {
        if (coordinates.length < 2) {
            throw new IllegalArgumentException(
                "Bad format of GeoJson LineString, coordinates list must have at least 2 pairs but was " + Point.arrayToJson(coordinates));
        }
        for (Double[] coord : coordinates) {
            Point.checkValidCoordinates(coord);
        }
        this.coordinates = coordinates;
    }

    @JsonIgnore
    public Point getPointAt(int position) {
        return new Point(coordinates[position]);
    }

    public static class LineStringBuilder {

        public LineStringBuilder withCoordinates(@NonNull Double[][] coordinates) {
            return coordinates(coordinates);
        }
    }
}
