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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.datedvehiclejourney.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourney;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.ServiceJourneyPattern;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.networkdescription.route.Route;

/**
 * @author Peter Hirzel
 */
@Schema(description = "A particular journey of a vehicle on a particular operatingday including all modifications possibly decided by the control staff. Complete route of public transport service (de:Zuglauf).")
@Builder
@Value
public class DatedVehicleJourney implements JsonResponse, ServiceJourneyPattern, Route {

    @Schema(description = ModelDoc.DESCRIPTION_SERVICEJOURNEY,
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    ServiceJourney serviceJourney;
}
