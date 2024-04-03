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

import static org.assertj.core.api.Assertions.assertThat;

import de.vdv.ojp.PlaceTypeEnumeration;
import java.util.Set;
import org.junit.jupiter.api.Test;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceTypeEnum;

class OJPFacadeTest {

    @Test
    void mapToPlaceTypes_ALL() {
        assertThat(OJPFacade.mapToPlaceTypes(null))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.ADDRESS, PlaceTypeEnumeration.POI);
        assertThat(OJPFacade.mapToPlaceTypes(Set.of()))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.ADDRESS, PlaceTypeEnumeration.POI);
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.ALL)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.ADDRESS, PlaceTypeEnumeration.POI);
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.StopPlace, PlaceTypeEnum.PointOfInterest, PlaceTypeEnum.Address)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.ADDRESS, PlaceTypeEnumeration.POI);
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.ALL, PlaceTypeEnum.StopPlace, PlaceTypeEnum.PointOfInterest, PlaceTypeEnum.Address)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.ADDRESS, PlaceTypeEnumeration.POI);
    }

    @Test
    void mapToPlaceTypes_SingleEntry() {
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.StopPlace)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.STOP);
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.Address)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.ADDRESS);
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.PointOfInterest)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.POI);
    }

    @Test
    void mapToPlaceTypes_DoubleEntry() {
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.StopPlace, PlaceTypeEnum.Address)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.ADDRESS);
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.StopPlace, PlaceTypeEnum.PointOfInterest)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.POI);
        assertThat(OJPFacade.mapToPlaceTypes(Set.of(PlaceTypeEnum.Address, PlaceTypeEnum.PointOfInterest)))
            .containsExactlyInAnyOrder(PlaceTypeEnumeration.ADDRESS, PlaceTypeEnumeration.POI);
    }
}
