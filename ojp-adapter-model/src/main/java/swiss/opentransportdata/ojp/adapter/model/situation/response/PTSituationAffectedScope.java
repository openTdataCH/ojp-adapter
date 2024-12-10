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

package swiss.opentransportdata.ojp.adapter.model.situation.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ScheduledStopPoint;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.VehicleMode;

@Schema(description = "An extent directly involved in the PT situation such as a set of `ServiceJourney` or `StopPlace`.")
@Builder
@Value
public class PTSituationAffectedScope implements swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.situation.ptsituation.PTSituationAffectedScope {

    // List<Operator> operators; -> not given

    @ArraySchema(schema = @Schema(description = "Vehicle modes affected, if available.", requiredMode = RequiredMode.REQUIRED))
    @NonNull
    @Builder.Default
    List<VehicleMode> vehicleModes = new ArrayList<>();

    @Schema(description = "`PTSituationMessage` is valid from this `ScheduledStopPoint` until `stopPointTo` on same `ServiceJourney` (de:Streckenmeldung).")
    @JsonProperty
    ScheduledStopPoint stopPointFrom;

    @Schema(description = "`PTSituationMessage` is valid until this `ScheduledStopPoint` from related `stopPointFrom`.")
    @JsonProperty
    ScheduledStopPoint stopPointTo;

    @ArraySchema(schema = @Schema(description = "Service-days where `PTSituation` is relevant, relates to `PTSituationMessage::distributionPeriod`.", requiredMode = RequiredMode.REQUIRED))
    @JsonProperty
    @NonNull
    @Builder.Default
    List<LocalDate> operatingDays = Collections.emptyList();

    @ArraySchema(schema = @Schema(description = "Edges (routes) affected by this message.", requiredMode = RequiredMode.REQUIRED))
    @JsonProperty(required = true)
    @NonNull
    @Builder.Default
    List<AffectedEdge> edges = Collections.emptyList();

    @ArraySchema(schema = @Schema(description = "Regions (geofences) affected by this message.", requiredMode = RequiredMode.REQUIRED))
    @JsonProperty(required = true)
    @NonNull
    @Builder.Default
    List<AffectedRegion> regions = Collections.emptyList();
}
