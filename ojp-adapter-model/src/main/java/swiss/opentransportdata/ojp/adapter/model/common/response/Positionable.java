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

package swiss.opentransportdata.ojp.adapter.model.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;

public interface Positionable {

    /**
     * Transmodel: §2.4.9 "Zone::functional centroid" (vice versa rolename: "represented by").
     * <p>
     * In NeTex, just "centroid".
     *
     * @return GeoJSON POINT implementation see eu.cen.transmodel.v6x56.part1.commonconcepts.genericframework.genericzoneandfeature.Zone
     */
    @Schema(description = ModelDoc.DESCRIPTION_POSITION)
    @JsonProperty
    Point getCentroid();
}
