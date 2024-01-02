/*
 * Copyright 2023 Peter Hirzel
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
package swiss.opentransportdata.ojp.adapter.v1;

import de.vdv.ojp.PlaceTypeEnumeration;
import de.vdv.ojp.PtModeFilterStructure;
import java.util.Locale;
import java.util.Set;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.transmodel.passengerinformation.querymodel.commonquery.PIRequestPolicy;

/**
 * A filter to apply for a Place request (Location is still an ambiguous OJP 1.x noun, though Transmodel delivers PLACE).
 * <p>
 * Transmodel:
 * <ul>
 *     <li>"LOCATION PLACE FILTER" Filter parameters used to limit the PLACE related results of the LOCATION REQUEST.</li>
 *     <li>"LOCATION REQUEST POLICY" Optimisation criteria to be used to when finding and decorating trip stops.</li>
 * </ul>
 */
@Data
@Builder
public class PlaceRequestFilter implements PIRequestPolicy, PTModeRequestFilter {

    public static final int LIMIT_DEFAULT = 10;

    Locale preferredLanguage;

    @Builder.Default
    @NonNull
    Integer limit = LIMIT_DEFAULT;

    PtModeFilterStructure ptModeFilterStructure;

    /**
     * Default: {@link PlaceTypeEnumeration#STOP} only
     */
    @NonNull
    @Builder.Default
    Set<PlaceTypeEnumeration> placeTypes = Set.of(PlaceTypeEnumeration.STOP);

    String placeName;

    /**
     * Center-coordinate. Relates to radius.
     */
    Point centroid;
    /**
     * Relates to centroid (if given the desired circle-radius to search in around center).
     * <p>
     * If given, must be greated than 0.
     */
    Integer radius;

    // TODO replace by GeoJSON Point
    public static class Point {

        private final Double[] coordinates;

        public Point(@NonNull Double longitude, @NonNull Double latitude) {
            coordinates = new Double[]{longitude, latitude};
        }

        Double getLongitude() {
            return coordinates[0];
        }

        Double getLatitude() {
            return coordinates[1];
        }
    }
}
