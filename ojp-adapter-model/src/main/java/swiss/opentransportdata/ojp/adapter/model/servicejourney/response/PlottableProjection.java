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

import swiss.opentransportdata.ojp.adapter.model.geojson.response.LineString;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip.LegTrack;

public interface PlottableProjection {

    /**
     * Definition: Projections are a mathematical transformation that take spherical coordinates (latitude and longitude) and transform them to an XY (planar) coordinate system. This enables you to
     * create a map that accurately shows distances, areas, or directions.
     *
     * @return The spatial projection of the leg as set of coordinate points for a specific purpose, such as displaying it on a map.
     * @see LegTrack in the role depictedBy
     */
    LineString getSpatialProjection();
}
