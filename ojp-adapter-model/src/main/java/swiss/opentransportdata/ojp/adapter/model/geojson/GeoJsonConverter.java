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

package swiss.opentransportdata.ojp.adapter.model.geojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import swiss.opentransportdata.ojp.adapter.model.ObjectMapperFactory;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.LineString;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;

/**
 * Converter to GeoJson, a json format for geographic elements. A GeoJSON object may represent:
 * <ul>
 *     <li>a region of space (a Geometry)</li>
 *     <li>a spatially bounded entity (a Feature)</li>
 *     <li>a list of Features (a FeatureCollection)</li>
 * </ul>
 * <p>
 * GeoJSON supports the following geometry types: Point, LineString, Polygon, MultiPoint, MultiLineString, MultiPolygon, and GeometryCollection.
 * <p>
 * Features in GeoJSON contain a Geometry object and additional properties, and a FeatureCollection contains a list of Features.
 * <p>
 * GeoJSON comprises the seven concrete geometry types defined in the
 *    OpenGIS Simple Features Implementation Specification for SQL [SFSQL]:
 *    0-dimensional Point and MultiPoint; 1-dimensional curve LineString
 *    and MultiLineString; 2-dimensional surface Polygon and MultiPolygon; and the heterogeneous GeometryCollection.
 * <p>
 *    A GeoJSON object represents a Geometry, Feature, or collection of
 *    Features.
 * <ul>
 *     <li>A GeoJSON object is a JSON object.</li>
 *     <li>A GeoJSON object has a member with the name "type".  The value of the member MUST be one of the GeoJSON types.</li>
 *  <li>...</li>
 * </ul>>
 *
 * @author Florian Hof
 * @see <a href="https://datatracker.ietf.org/doc/html/rfc7946">RFC7946, the standard definition of GeoJSON</a>
 * @see <a href="https://en.wikipedia.org/wiki/GeoJSON">GeoJSON explanation and samples on Wikipedia</a>
 */
@UtilityClass
public final class GeoJsonConverter {

    // WGS-84 bounds (longitude/latitude absolute in degree)
    private static final double LONGITUDE_MIN = -180.0;
    private static final double LONGITUDE_MAX = 180.0;
    private static final double LATITUDE_MIN = -90.0;
    private static final double LATITUDE_MAX = 90.0;

    private static final ObjectMapper MAPPER = ObjectMapperFactory.createMapper(false);

    @NonNull
    public static Point toPoint(@NonNull Double longitude, @NonNull Double latitude) {
        return new Point(longitude, latitude);
    }

    /**
     * @param geoJsonPoint [lon,lat] in WGS84 decimal-degree, for e.g. "[7.435194,46.945679]"
     * @return GeoJson Point
     */
    @NonNull
    public static Point parsePoint(@NonNull String geoJsonPoint) {
        if (StringUtils.isBlank(geoJsonPoint)) {
            throw new IllegalArgumentException("GeoJson Point must not be empty.");
        }

        final Point point;
        try {
            Double[] coords = MAPPER.readerFor(Double[].class).readValue(geoJsonPoint);
            point = new Point(coords);
        } catch (IOException e) {
            throw new IllegalArgumentException("Bad format of GeoJson Point: " + geoJsonPoint, e);
        }
        if ((point.getLongitude() < LONGITUDE_MIN) || (point.getLongitude() > LONGITUDE_MAX)) {
            throw new IllegalArgumentException("longitude should be in range [" + LONGITUDE_MIN + "°, " + LONGITUDE_MAX + "°] but was: " + point.getLongitude());
        }
        if ((point.getLatitude() < LATITUDE_MIN) || (point.getLatitude() > LATITUDE_MAX)) {
            throw new IllegalArgumentException("latitude should be in range [" + LATITUDE_MIN + "°, " + LATITUDE_MAX + "°] but was: " + point.getLatitude());
        }
        return point;
    }

    public static LineString toLineString(String polylineFormattedWithCommaAndVerticalBar) {
        if (StringUtils.isBlank(polylineFormattedWithCommaAndVerticalBar)) {
            return null;
        } else {
            String[] coordinates = polylineFormattedWithCommaAndVerticalBar.split("\\|");
            Double[][] positions = new Double[coordinates.length][];
            for (int i = 0; i < coordinates.length; i++) {
                positions[i] = toCoordAsArray(coordinates[i]);
            }
            return new LineString(positions);
        }
    }

    private static Double[] toCoordAsArray(@NonNull String coordinatesSeparatedByComma) {
        String[] coordArrayOfString = coordinatesSeparatedByComma.split(",");
        Double[] coordArrayOfDouble = new Double[coordArrayOfString.length];
        for (int i = 0; i < coordArrayOfString.length; i++) {
            coordArrayOfDouble[i] = Double.valueOf(coordArrayOfString[i]);
        }
        // same lon/lat convention between J-A v2 and GeoJson => do NOT swap
        return coordArrayOfDouble;
    }

    //    public static org.geolatte.geom.Point<G2D> toGeolatte2DPoint(Point point) {
    //        if (point == null) {
    //            return null;
    //        } else {
    //            return DSL.point(CoordinateReferenceSystems.WGS84, DSL.g(point.getLongitude(), point.getLatitude()));
    //        }
    //    }
    //
    //    public static Point toJsonPoint(org.geolatte.geom.Point<G2D> point) {
    //        if (point == null) {
    //            return null;
    //        } else {
    //            return new Point(point.getPosition().getLon(), point.getPosition().getLat());
    //        }
    //     }
    //
    //    public static org.locationtech.spatial4j.shape.Point toJtsPoint(Point point) {
    //        if (point == null) {
    //            return null;
    //        } else {
    //            return SpatialContext.GEO.getShapeFactory().pointXY(point.getLongitude(), point.getLatitude());
    //        }
    //     }
}
