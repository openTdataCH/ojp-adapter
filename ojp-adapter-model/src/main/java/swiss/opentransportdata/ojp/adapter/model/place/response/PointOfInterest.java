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

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.HashSet;
import java.util.Set;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;

/**
 * In Transmodel "POINT OF INTEREST" is a subtype of "SITE" analog "STOP PLACE". though more like an Address with additional POI specific properties.
 *
 * @author Peter Hirzel
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#PointOfInterestStructure">OJP PointOfInterest</a>
 */
@Schema(allOf = Place.class,
    description = "Point of Interest (POI), such as a Museum (source: [ROKAS POI-Service `Poi`](https://developer.sbb.ch/apis/journey-pois/information)." + ModelDoc.HINT_INHERITED_PLACE)
@Builder
@Value
public class PointOfInterest implements Place, swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.pointofinterest.PointOfInterest {

    @Schema(type = "string",
        requiredMode = RequiredMode.REQUIRED,
        description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE,
        defaultValue = "PointOfInterest")
    @NonNull
    String type = PointOfInterest.class.getSimpleName();

    @Schema(description = "Id of a POI (given by underlaying system).",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String id;

    @Schema(description = "Name of PointOfInterest (formatted field: `zip-code city, street`).",
        requiredMode = RequiredMode.REQUIRED, example = "Musem Kunst, Bern")
    @NonNull
    String name;

    //    @Schema(description = ModelDoc.DESCRIPTION_CANTON, example = ModelDoc.EXAMPLE_CANTON)
    //    String canton;

    @Schema(description = ModelDoc.DESCRIPTION_COUNTRY_CODE, example = ModelDoc.EXAMPLE_COUNTRY_CODE)
    String countryCode;

    @Schema(description = ModelDoc.DESCRIPTION_POSITION)
    Point centroid;

    //    @Schema(description = ModelDoc.PLACES_DISTANCE)
    //    Integer distanceToSearchPosition;

    @ArraySchema(schema = @Schema(description = "Supplies the categories of a PointOfInterest (each POI should have 1 category), if any.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    @Builder.Default
    Set<PointOfInterestCategory> categories = new HashSet<>();
}
