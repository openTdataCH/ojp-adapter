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

package swiss.opentransportdata.ojp.adapter.model.trip.request;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.request.StopPlaceReference;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.tripquery.TripViaPlace;

/**
 * Request JSON structure.
 * <p>
 * OJP: TripVia
 *
 * @since 2.21.3
 */
@Schema(description = "Specification and behaviour of via StopPlace (aka OJP TripViaStructure).\n" +
    // OpenApi hack -> this description wins over local redefinition at usage!
    "- TripsByOriginAndDestinationPostBody: all filters supported\n" +
    "- ServiceCalendarByOriginAndDestinationRequestBody: only `stopPlaceId` and `transportModes` supported yet")
@Data
@NoArgsConstructor
@ToString
public class PTViaReference implements StopPlaceReference, TripViaPlace {

    public static final String STATUS_BOARDING_ALIGHTING_NECESSARY = "BOARDING_ALIGHTING_NECESSARY";

    @Schema(description = "`StopPlace::id` to be passed as via.",
        type = "string", requiredMode = RequiredMode.REQUIRED,
        example = "8507000")
    @NonNull
    String stopPlaceId;

    @Schema(description = "Boarding/alighting-status at via `StopPlace`." + ModelDoc.HINT_ENUM_EXTENSIBLE,
        type = "string",
        defaultValue = STATUS_BOARDING_ALIGHTING_NECESSARY,
        // unique use of enum's
        allowableValues = {STATUS_BOARDING_ALIGHTING_NECESSARY, "BOARDING_NOT_NECESSARY", "ALIGHTING_NOT_NECESSARY", "BOARDING_ALIGHTING_NOT_NECESSARY"})
    String status;

    @Schema(description = "The modes are relevant until the next Via. " + ModelDoc.DESCRIPTION_TRANSPORT_MODES)
    Set<TransportModeEnum> transportModes;

    @Schema(description = "Minimum waiting time to be spent at via StopPlace [min.]. Some additional minutes might be added by underlying router (aka OJP dwellTime).",
        minimum = "0",
        type = "integer")
    Integer waittime;

    /*TODO check OJP
    @Schema(description = "true: Via section has to be direct (relates to ChangeBehaviour::maxChanges); false: might be direct or not.", 
        type = "boolean", defaultValue = "false")
    Boolean direct;

    @Schema(description = "true: Via section should include couchette Car.", 
        type = "boolean", defaultValue = "false")
    Boolean couchette;

    @Schema(description = "true: Via section should include sleeping car.", 
        type = "boolean", defaultValue = "false")
    Boolean sleepingCar;
     */
}
