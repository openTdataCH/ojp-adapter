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
 * de:Haltestelle
 *
 * @author Peter Hirzel
 */
@Schema(allOf = Place.class, description = StopPlace.DESCRIPTION)
@Builder
@Value
public class StopPlace implements Place /*TODO, eu.cen.transmodel.v6x56.part2.ptnetworktopology.fixedobject.stopplace.StopPlace*/ {

    public static final String DESCRIPTION =
        "A place (de:Haltestelle) comprising one or more areas where vehicles may stop and where passengers may board or leave vehicles or prepare their trip. " +
            "The name is given in regional language only." + ModelDoc.HINT_INHERITED_PLACE;

    @Schema(description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE, requiredMode = RequiredMode.REQUIRED, defaultValue = "StopPlace")
    @NonNull
    String type;

    /**
     * Be aware: relates to DB stopplace::uic and not the internal stopplace::id (technical id)!
     */
    @Schema(description = ModelDoc.DESCRIPTION_STOP_PLACE_ID, requiredMode = RequiredMode.REQUIRED, example = ModelDoc.SAMPLE_STOPPLACE_ID)
    @NonNull
    String id;

    @Schema(description = "Unique non-translated resp. local name of StopPlace.", requiredMode = RequiredMode.REQUIRED, example = "Genève")
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

    //    @Schema(description = ModelDoc.DESCRIPTION_STOP_PLACE_TARIFFBORDER, requiredMode = RequiredMode.REQUIRED)
    //    @NonNull
    //    Boolean tariffBorder;

    @Schema(description = ModelDoc.DESCRIPTION_WEIGHT, example = ModelDoc.EXAMPLE_WEIGHT)
    Integer weighting;

    //    /**
    //     * OJP: PTMode
    //     * <p>
    //     * siri:VehicleModesOfTransportEnumeration
    //     * <p>
    //     * OSDM: ModeFilter
    //     */
    //    @ArraySchema(schema = @Schema(description = "Primary `VehicleMode's` known to be available at a `StopPlace`, depends on `includeVehicleModes` (otherwise empty). " +
    //        "Data quality cannot be guaranteed precisely and never given on `ServiceJourney::stopPoints`).",
    //        requiredMode = RequiredMode.REQUIRED))
    //    @NonNull
    //    @Builder.Default
    //    Set<VehicleMode> vehicleModes = new HashSet<>();

    // List<Quay> quays -> not given here, see StopPlaceDetailed

    // String classification;
}
