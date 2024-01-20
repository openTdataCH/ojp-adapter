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

package swiss.opentransportdata.ojp.adapter.model.place.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;

/**
 * Transmodel "ADDRESSABLE PLACE".
 *
 * @author Peter Hirzel
 * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#address-fields">Zalando types: Address fields</a>
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#AddressStructure">OJP AddressStructure</a>
 */
@Schema(allOf = Place.class, description = "Address (source POST.ch directory, aka OJP AddressStructure)." + ModelDoc.HINT_INHERITED_PLACE)
@Builder
@Value
public class Address implements Place /*TODO , PostalAddress future perhaps eu.cen.transmodel.v6x56.part1.commonconcepts.reusablecomponents.topographicplace.RoadAddress too */ {

    @Schema(description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE, requiredMode = RequiredMode.REQUIRED, defaultValue = "Address")
    @NonNull
    String type;

    @Schema(description = "Id of a postal address (given by underlaying system).", requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String id;

    /**
     * Corresponds to PostalAddress.
     */
    @Schema(description = "Name of Address (formatted field: `zip-code city, street`).", requiredMode = RequiredMode.REQUIRED, example = "3007 Bern, Schwarztorstrasse 1")
    @NonNull
    String name;

    //  @Schema(description = ModelDoc.DESCRIPTION_CANTON, example = ModelDoc.EXAMPLE_CANTON)
    //  String canton;

    @Schema(description = ModelDoc.DESCRIPTION_COUNTRY_CODE, example = ModelDoc.EXAMPLE_COUNTRY_CODE)
    String countryCode;

    @Schema(description = ModelDoc.DESCRIPTION_POSITION)
    Point centroid;

    //  @Schema(description = ModelDoc.PLACES_DISTANCE)
    //  Integer distanceToSearchPosition;
}
