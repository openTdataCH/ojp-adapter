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

import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import swiss.opentransportdata.ojp.adapter.model.geojson.GeoJsonConverter;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceReference;
import swiss.opentransportdata.ojp.adapter.model.standards.SwissLocationId;
import swiss.opentransportdata.ojp.adapter.v1.OJPAdapter;

@UtilityClass
public final class PlaceReferenceHelper {

    /**
     * Convience method to valide that a {@link PlaceReference} might point to a concrete {@link swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace}.
     *
     * @param placeReference of a StopPlace
     * @param argument service-contract parameter (for caller reference if validation fails)
     * @return StopPlace::id (potentially resolvable)
     */
    @NonNull
    public static String extractStopPlaceId(@NonNull String placeReference, @NonNull String argument) {
        if (StringUtils.isBlank(placeReference)) {
            throw new IllegalArgumentException("PlaceReference for: " + argument + " (must not be empty)");
        } else {
            final PlaceReference stopPlaceReference = parsePlaceReference(placeReference, argument);
            if (!PlaceReference.TYPE_STOP_PLACE.equals(stopPlaceReference.getType())) {
                throw new IllegalArgumentException("StopPlace reference expected for: " + argument + "=" + placeReference);
            }
            return stopPlaceReference.getPlaceId();
        }
    }

    /**
     * The caller is responsible to further validate whether the Place::type is useful in its scenario.
     *
     * @param placeReferenceVariousFormat for {@link swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace}, {@link swiss.opentransportdata.ojp.adapter.model.place.response.Address},
     *     {@link swiss.opentransportdata.ojp.adapter.model.place.response.PointOfInterest}, coordinates
     * @param argument service-contract parameter (for caller reference if validation fails)
     * @return extracted {@link swiss.opentransportdata.ojp.adapter.model.place.response.Place} reference
     * @see <a href="https://github.com/SchweizerischeBundesbahnen/journey-service/blob/f552328fc15898e7462f7a583971acae73fb5eeb/JSON-Objects.md#placereference">PlaceReference variants</a>
     */
    @NonNull
    public static PlaceReference parsePlaceReference(@NonNull String placeReferenceVariousFormat, @NonNull String argument) {
        if (StringUtils.isBlank(placeReferenceVariousFormat)) {
            throw new IllegalArgumentException("PlaceReference for: " + argument + " (must not be empty)");
        }

        final String trimedReference = placeReferenceVariousFormat.trim();
        final PlaceReference placeReference = new PlaceReference();
        if (trimedReference.startsWith("[")) {
            try {
                GeoJsonConverter.parsePoint(placeReferenceVariousFormat);
            } catch (IllegalArgumentException ex) {
                throw new IllegalArgumentException("PlaceReference for: " + argument + "=" + placeReferenceVariousFormat + " (coordinates must represent a GeoJson POINT)", ex);
            }
            placeReference.setType(PlaceReference.COORDINATES);
        } else if (StringUtils.isNumeric(placeReferenceVariousFormat) ||
            // if this reference is to be used by Hafas, further extraction of classic numeric UIC may be done by caller
            SwissLocationId.isSwissLocationId(placeReferenceVariousFormat) || placeReferenceVariousFormat.startsWith(OJPAdapter.OJP_STOPPLACE_ID_PREFIX)) {
            placeReference.setType(PlaceReference.TYPE_STOP_PLACE);
        }

        // router specific (for e.g. Hafas generates its own Address::id values)
        placeReference.setPlaceId(placeReferenceVariousFormat);

        return placeReference;
    }
}
