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

package swiss.opentransportdata.ojp.adapter.model.situation.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.LineString;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.PlottableProjection;

// Either iconCoordinates and/or spatialProjection must be set
@Schema(description = "Geometrical polyline related to a `PTSituation::affectedScope`.")
@Builder
@Value
public class AffectedEdge implements PlottableProjection {

    public static final String ENUM_AFFECTED_EDGE_DIRECTION_UNKNWON = "UNKNOWN";
    public static final String ENUM_AFFECTED_EDGE_DIRECTION_STRAIGHT = "STRAIGHT";
    public static final String ENUM_AFFECTED_EDGE_DIRECTION_OPPOSITE = "OPPOSITE";
    public static final String ENUM_AFFECTED_EDGE_DIRECTION_BIDIRECTIONAL = "BIDIRECTIONAL";

    @Schema(description = "Coordinates of icon to display.")
    Point iconPosition;

    @Schema(description = "Represents a plottable polyline (by point(s)) and relates to `includeProjection`.")
    LineString spatialProjection;

    @Schema(description = "Direction a vehicle is going to on the affected edge where `PTSituationMessage` applies, relates to `spatialProjection`." +
        ModelDoc.HINT_ENUM_EXTENSIBLE + "[" + ENUM_AFFECTED_EDGE_DIRECTION_UNKNWON + "," + ENUM_AFFECTED_EDGE_DIRECTION_STRAIGHT + "," + ENUM_AFFECTED_EDGE_DIRECTION_OPPOSITE + ","
        + ENUM_AFFECTED_EDGE_DIRECTION_BIDIRECTIONAL + "]",
        requiredMode = RequiredMode.REQUIRED,
        example = ENUM_AFFECTED_EDGE_DIRECTION_BIDIRECTIONAL)
    @NonNull
    String direction;
}
