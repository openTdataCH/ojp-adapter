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
import de.vdv.ojp.release2.model.ModeFilterStructure;
import java.util.Locale;
import java.util.Set;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.locationquery.LocationRequest;

/**
 * A filter to apply for a Place request (Location is still an ambiguous OJP 1.x noun, though Transmodel delivers PLACE).
 * @see swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.locationquery.LocationPlaceFilter
 * @see swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.locationquery.LocationRequestPolicy
 */
@Data
@Builder
public class PlaceRequestFilter implements LocationRequest, ModeRequestFilter {

    public static final int LIMIT_DEFAULT = 10;

    Locale preferredLanguage;

    @Builder.Default
    @NonNull
    Integer limit = LIMIT_DEFAULT;

    ModeFilterStructure modeFilterStructure2;

    /**
     * Default: {@link PlaceTypeEnumeration#STOP} only
     */
    @NonNull
    @Builder.Default
    Set<de.vdv.ojp.release2.model.PlaceTypeEnumeration> placeTypes = Set.of(de.vdv.ojp.release2.model.PlaceTypeEnumeration.STOP);

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
