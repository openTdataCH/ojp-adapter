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

import de.vdv.ojp.release2.model.AddressStructure;
import de.vdv.ojp.release2.model.InternationalTextStructure;
import de.vdv.ojp.release2.model.OJP;
import de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.release2.model.PlaceResultStructure;
import de.vdv.ojp.release2.model.PlaceStructure;
import de.vdv.ojp.release2.model.PointOfInterestCategoryStructure;
import de.vdv.ojp.release2.model.StopPlaceStructure;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import swiss.opentransportdata.ojp.adapter.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;
import swiss.opentransportdata.ojp.adapter.model.place.response.Address;
import swiss.opentransportdata.ojp.adapter.model.place.response.Place;
import swiss.opentransportdata.ojp.adapter.model.place.response.PlaceResponse;
import swiss.opentransportdata.ojp.adapter.model.place.response.PointOfInterest;
import swiss.opentransportdata.ojp.adapter.model.place.response.PointOfInterestCategory;
import swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace;
import swiss.opentransportdata.ojp.adapter.service.converter.AbstractConverter;
import uk.org.siri.siri.LocationStructure;

/**
 * @author Peter Hirzel
 */
@Slf4j
@Component("OJPPlaceConverter")
public class PlaceConverter extends AbstractConverter<de.vdv.ojp.release2.model.OJP, PlaceResponse> {

    PlaceConverter() {
        super();
    }

    /**
     * Converter Function
     */
    @Override
    public PlaceResponse convertToDTO(de.vdv.ojp.release2.model.OJP ojpResponse) {
        if ((ojpResponse == null) || (ojpResponse.getOJPResponse() == null)) {
            throw new OJPException("ojpResponse must not be null");
        }
        return mapToPlaceResponse(ojpResponse);
    }

    /**
     * @param ojpResponse
     * @return
     */
    private PlaceResponse mapToPlaceResponse(OJP ojpResponse) throws OJPException {
        log.debug("Converting a response with OJP::version={}", ojpResponse.getVersion());

        final OJPLocationInformationDeliveryStructure ojpLocationInformationDeliveryStructure = OJPAdapter.mapToFirstOJPLocationInformationDeliveryStructure(ojpResponse);

        final List<Place> places = new ArrayList<>();
        // v1 "<ojp:Location>"
        ojpLocationInformationDeliveryStructure.getRest().stream()
            .filter(rest -> rest.getDeclaredType() == PlaceResultStructure.class)
            .forEach(rest -> {
            final PlaceResultStructure placeResultStructure = ((PlaceResultStructure) rest.getValue());
            if (placeResultStructure.getPlace() != null) {
                final PlaceStructure placeStructure = placeResultStructure.getPlace();
                if (placeStructure.getStopPlace() != null) {
                    final StopPlaceStructure stopPlaceStructure = placeStructure.getStopPlace();
                    log.debug("non StopPlace: {}", stopPlaceStructure);
                    places.add(createStopPlace(stopPlaceStructure.getStopPlaceRef().getValue(),
                        stopPlaceStructure.getStopPlaceName(),
                        placeStructure.getGeoPosition()));
                } else if (placeStructure.getPointOfInterest() != null) {
                    log.debug("value={}", placeStructure.getPointOfInterest());
                    places.add(createPointOfInterest(placeStructure.getPointOfInterest().getPublicCode(),
                        OJPAdapter.getText(placeStructure.getPointOfInterest().getName()),
                        placeStructure.getPointOfInterest().getPointOfInterestCategory(),
                        placeStructure.getGeoPosition()));
                } else if (placeStructure.getAddress() != null) {
                    log.debug("value={}", placeStructure.getAddress());
                    places.add(mapToAddress(placeStructure.getAddress(), placeStructure.getGeoPosition()));
                } else {
                    // for e.g. TopographicPlace
                    throw new OJPException("untreated PlaceRef: " + placeResultStructure);
                }
            } else {
                throw new OJPException("PlaceResultStructure::place==null: " + placeResultStructure);
            }
        });

        return PlaceResponse.builder()
            .places(places)
            .build();
    }

    static StopPlace createStopPlace(String id, InternationalTextStructure internationalTextStructure, uk.org.siri.siri.LocationStructure geoPosition) {
        return createStopPlace(id,
            OJPAdapter.getText(internationalTextStructure),
            geoPosition);
    }

    private static StopPlace createStopPlace(String id, String name, uk.org.siri.siri.LocationStructure geoPosition) {
        return StopPlace.builder()
            .id(id)
            .name(name)
            //.province(locationV2.getCantonCH())
            .centroid(toPoint(geoPosition))
            /*
                .distanceToSearchPosition(locationV2.getDistance())
                .weighting(locationV2.getWeight())
             */
            /*TODO other like:
             TopographicPlaceRefStructure,
             wheelchairAccessible
             address
             */
            .build();
    }

    static PointOfInterest createPointOfInterest(String poiCode, String name, List<PointOfInterestCategoryStructure> pointOfInterestCategoryStructures, LocationStructure locationStructure) {
        final Set<PointOfInterestCategory> categories = pointOfInterestCategoryStructures.stream()
            // categories: depends on whether OJP uses ROKAS journey-poi service (current PoC), OSM or other
            .map(pointOfInterestCategoryStructure -> PointOfInterestCategory.builder()
                .type(pointOfInterestCategoryStructure.getOsmTag().get(0).getTag())
                .name(pointOfInterestCategoryStructure.getOsmTag().get(0).getValue())
                .build())
            .collect(Collectors.toSet());
        return PointOfInterest.builder()
            .id(poiCode)
            .name(name)
            .centroid(toPoint(locationStructure))
            .categories(categories)
            .build();
    }

    static Address mapToAddress(AddressStructure addressStructure,  LocationStructure locationStructure) {
        return Address.builder()
            .id(OJPAdapter.getText(addressStructure.getName()))
            // TODO check not blank
            .name(addressStructure.getPostCode() + " " /*TODO + addressStructure.getCity()*/ + ", " + addressStructure.getStreet() + " " + addressStructure.getHouseNumber())
            .centroid(toPoint(locationStructure))
            /*
            .getTopographicPlaceName()
            .getTopographicPlaceRef()
             */
            .build();
    }

    static Point toPoint(uk.org.siri.siri.LocationStructure locationStructure) {
        if (locationStructure == null) {
            return null;
        }

        return new Point(locationStructure.getLongitude().doubleValue(),
            locationStructure.getLatitude().doubleValue());
    }
}
