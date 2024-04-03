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

package swiss.opentransportdata.ojp.adapter.model.trip.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.PaginationCursor;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourney;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourneyPattern;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.TrainStopAssignmentHint;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.VehicleMode;
import swiss.opentransportdata.ojp.adapter.model.trip.request.TrainStopAssignmentsEnum;

/**
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TimedLegStructure>OJP: TimedLeg (de: gemäss einem Fahrplan)</a>
 */
@Schema(allOf = Leg.class, description = "Public-Transportation Leg (aka OJP TimedLeg)." + ModelDoc.HINT_INHERITED_LEG)
@Builder
@Value
public class PTRideLeg implements Leg, ServiceJourneyPattern, swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.tripdescription.passengertrip.PTRideLeg {

    @Schema(type = "string", requiredMode = RequiredMode.REQUIRED,
        description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE, defaultValue = "PTRideLeg")
    @NonNull
    String type;

    /**
     * Depends on search parameter {@link swiss.opentransportdata.ojp.adapter.model.trip.request.TransportModeEnum}
     *
     * @see swiss.opentransportdata.ojp.adapter.model.servicejourney.response.VehicleMode#getId()
     */
    @Schema(description = "Value according to `VehicleMode::id`, see more details in `ServiceProduct::vehicleMode`. "
        + ModelDoc.VEHICLEMODE_ID, requiredMode = RequiredMode.REQUIRED,
        example = VehicleMode.VEHICLEMODEENUM_TRAIN)
    @NonNull
    String /*JsonExtensibleEnum*/ mode;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_ID + " (Aka JourneyReference, OJP JourneyRef)",
        requiredMode = RequiredMode.REQUIRED, example = "1")
    @NonNull
    String id;

    @Schema(description = ModelDoc.DESCRIPTION_LEG_DISTANCE)
    Integer distance;

    @Schema(description = "Public transport " + ModelDoc.DURATION + " in realtime, if available otherwise planned. The value may be null, if a `PTRideLeg` is not rideable (for e.g. cancelled).")
    String duration;

    @Schema(description = ModelDoc.DESCRIPTION_SERVICEJOURNEY,
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    ServiceJourney serviceJourney;

    @Schema(description = "Denotes if reservations are possible for groups on this specific `Trip`. Only given if parameter 'includeGroupReservation' is requested." +
        ModelDoc.HINT_ENUM_EXTENSIBLE
        + "[see [CAPRE ReservationDemandResponse::status](https://developer.sbb.ch/apis/capre/documentation),UNKNOWN] where `UNKNOWN` is an additional state, if requests to CAPRE fail.")
    @Getter
    String /*CAPRE GroupReservationStatus*/ groupReservationStatus;

    @Schema(description = "Provides an earlier/later search-context that may be used to impact the time for interchange at a certain via-stop. The cursor contains the following values:\n" +
        "- `previous`: referring to `PTRideLeg` last stop if you want to **arrive earlier at this leg-destination**\n" +
        "- `next`: referring to `PTRideLeg` first stop if you want to **depart later at this leg-origin**")
    PaginationCursor paginationCursor;

    @Schema(description =
        "If given, acts like a quick overview of potential `CompoundTrain` info for first `StopCall::departure` or last `StopCall::arrival` or if formation-changes occured on the departure `CompoundTrain::trainChanges`. Needs &"
            +
            ModelDoc.PARAM_INCLUDE_TRAIN_STOP_ASSIGNMENTS + "=" + TrainStopAssignmentsEnum.TRAIN_STOP_ASSIGNMENT_NONE
            + ".<br>(Useful in `v0/trips/by-origin-destination` as a forcecast for UI drill-down.)")
    TrainStopAssignmentHint trainStopAssignmentHint;
}