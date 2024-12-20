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

package swiss.opentransportdata.ojp.adapter.service.api.converter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import swiss.opentransportdata.ojp.adapter.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.model.geojson.GeoJsonConverter;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceReference;
import swiss.opentransportdata.ojp.adapter.model.standards.SwissLocationId;

@UtilityClass
public final class PlaceReferenceHelper {

    private static final int MAX_LENGTH_INTEGER = 9;

    /**
     * The caller is responsible to further validate whether the Place::type is useful in its scenario.
     *
     * @param placeReferenceVariousFormat for {@link swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace}, {@link swiss.opentransportdata.ojp.adapter.model.place.response.Address},
     *     {@link swiss.opentransportdata.ojp.adapter.model.place.response.PointOfInterest}, coordinates
     * @return extracted {@link swiss.opentransportdata.ojp.adapter.model.place.response.Place} reference
     * @see <a href="https://github.com/SchweizerischeBundesbahnen/journey-service/blob/f552328fc15898e7462f7a583971acae73fb5eeb/JSON-Objects.md#placereference">PlaceReference variants</a>
     */
    @NonNull
    public static PlaceReference parse(String placeReferenceVariousFormat) {
        if (StringUtils.isBlank(placeReferenceVariousFormat)) {
            throw new IllegalArgumentException("PlaceReference must not be empty");
        }
        final String trimedReference = placeReferenceVariousFormat.trim();
        if (trimedReference.startsWith("[")) {
            try {
                Point point = GeoJsonConverter.parsePoint(placeReferenceVariousFormat);
                return buildCoordinatesLonLat(point.getLongitude(), point.getLatitude(), placeReferenceVariousFormat);
            } catch (IllegalArgumentException ex) {
                throw new IllegalArgumentException("PlaceReference coordinates must represent a GeoJson POINT", ex);
            }
        } else if (StringUtils.isNumeric(placeReferenceVariousFormat) && trimedReference.length() <= MAX_LENGTH_INTEGER) {
            return buildStopPlaceUic(Integer.valueOf(trimedReference), placeReferenceVariousFormat);
        } else if (SwissLocationId.isSwissLocationId(trimedReference)) {
            // if this reference is to be used for further extraction of classic numeric UIC may be done by caller
            return buildStopPlaceSloid(placeReferenceVariousFormat);
        } else if (trimedReference.startsWith(OJPAdapter.OJP_STOPPLACE_ID_PREFIX)) {
            return buildStopPlaceExternalId(placeReferenceVariousFormat, RouterEnum.OJP_ACTIVE);
        } else {
            // assumption: address or point-of-interest
            // router specific (for e.g. Hafas generates its own Address::id values)
            return buildAddressOrPoiExternalId(trimedReference);
        }
    }

    public static StopPlaceByUic buildStopPlaceUic(@NonNull Integer uic) {
        return new StopPlaceByUic(uic, null);
    }

    public static StopPlaceByUic buildStopPlaceUic(@NonNull Integer uic, String placeId) {
        return new StopPlaceByUic(uic, placeId);
    }

    public static StopPlaceBySloid buildStopPlaceSloid(@NonNull String sloid) {
        return new StopPlaceBySloid(sloid);
    }

    public static StopPlaceByExternalId buildStopPlaceExternalId(@NonNull String externalId, RouterEnum routerEnum) {
        return new StopPlaceByExternalId(externalId, routerEnum);
    }

    /**
     * Builder with order like in GeoJson.
     */
    public static PlaceByCoordinates buildCoordinatesLonLat(double longitude, double latitude, String placeId) {
        return new PlaceByCoordinates(longitude, latitude, placeId);
    }

    public static AddressOrPoiByExternalId buildAddressOrPoiExternalId(@NonNull String externalId) {
        return new AddressOrPoiByExternalId(externalId);
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static final class StopPlaceByUic extends PlaceReference {

        private final Integer uic;

        private StopPlaceByUic(Integer uic, String placeId) {
            super(TYPE_STOP_PLACE,
                (placeId != null) ? placeId : uic.toString());
            this.uic = uic;
        }
    }

    public static final class StopPlaceBySloid extends PlaceReference {

        private StopPlaceBySloid(String sloid) {
            super(TYPE_STOP_PLACE, sloid);
        }
    }

    @Getter
    public static final class StopPlaceByExternalId extends PlaceReference {

        private final RouterEnum routerEnum;

        private StopPlaceByExternalId(String externalId, RouterEnum routerEnum) {
            super(TYPE_STOP_PLACE, externalId);
            this.routerEnum = routerEnum;
        }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static final class PlaceByCoordinates extends PlaceReference {

        private final double longitude;
        private final double latitude;

        private PlaceByCoordinates(double longitude, double latitude, String placeId) {
            super(TYPE_COORDINATES,
                (placeId != null) ? placeId : "[" + longitude + "," + latitude + "]");
            this.longitude = longitude;
            this.latitude = latitude;
        }
    }

    /**
     * Address or Point-of-Interest with an external id from an underlying system (typically Hafas), not yet disambiguated.
     */
    public static final class AddressOrPoiByExternalId extends PlaceReference {

        private AddressOrPoiByExternalId(@NonNull String externalId) {
            super(TYPE_ADDRESS_POI, externalId);
        }
    }
}
