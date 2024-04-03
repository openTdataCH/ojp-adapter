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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.LineString;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.PlottableProjection;

// At least one property must be set
@Schema(description = "Region-Information related to a `PTSituation::affectedScope`.")
@Builder
@Value
public class AffectedRegion implements PlottableProjection {

    @Schema(description = "Id of region (by underlying system HIM).")
    @JsonProperty
    String id;

    @Schema(description = "Name of region in underlying system (HIM) terminology, see related `nameFormatted` for a more speaking value, like:<br>" +
        "- BVI1: CH_WEST\n" +
        "- BVI2: CH_MID\n" +
        "- BVI3: CH_TICINO\n" +
        "- BVI4: CH_ZURICH\n" +
        "- BVI5: CH_EAST\n" +
        "- CSTRI1: GERMANY\n" +
        "- CSTRI2: AUSTRIA\n" +
        "- CSTRI3: ITALY\n" +
        "- CSTRI4: FRANCE\n"
        , example = "BVI2")
    @JsonProperty
    String name;

    @Schema(description = "Speaking equivalent value if known for related `name` of the region, like:<br>" +
        "- CH_WEST: BVI1\n" +
        "- CH_MID: BVI2\n" +
        "- CH_TICINO: BVI3\n" +
        "- CH_ZURICH: BVI4\n" +
        "- CH_EAST: BVI5\n" +
        "- GERMANY: CSTRI1\n" +
        "- AUSTRIA: CSTRI2\n" +
        "- ITALY: CSTRI3\n" +
        "- FRANCE: CSTRI4\n"
        , example = "CH_ZURICH")
    @JsonProperty
    String nameFormatted;

    @Schema(description = "Coordinates of icon to display.")
    @JsonProperty
    Point iconPosition;

    @Schema(description = "Represents a plottable polyline of a (partial) `ServiceJourney` track (aka OJP LegTrack, de:Streckenverlauf) and relates to `includeProjection`.")
    @JsonProperty
    LineString spatialProjection;

    @Schema(description = "A ring describing the geo region affected by this message.")
    @JsonProperty
    GeofenceCircle geofence;
}
