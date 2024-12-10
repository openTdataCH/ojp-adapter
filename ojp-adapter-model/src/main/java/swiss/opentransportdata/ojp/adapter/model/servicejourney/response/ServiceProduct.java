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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.PublicLinks;
import swiss.opentransportdata.ojp.adapter.model.standards.CorporateIdentity;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.networkdescription.route.Line;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.servicejourney.ServiceJourney;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.vehiclejourney.TrainNumber;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.vehiclejourney.TypeOfProductCategory;

/**
 * A concrete {@link ServiceJourney} may have n concrete ServiceProduct's.
 * <p>
 * Conventions:
 * <ul>
 *     <li>Such a class is not 1:1 to be found in Transmodel (the model is pretty conceptual here), therefore we introduce our own Structure and its data.</li>
 *     <li>A {@link Line} is more like a planning/commercial thing but its name is reused here.</li>
 * </ul>
 * <p>
 * Good to know: on a ride the ServiceProduct may change for certain {@link RouteIndexInterval}:
 * <ul>
 *     <li>Operator: for e.g. at a borderpoint</li>
 *     <li>ProductCategory/Name is rare but in case of LEX CH/France possible</li>
 * </ul>
 */
@Schema(description = "A passenger carrying Service (phyisical public transport vehicle) provided and operated by a certain Operator allocated to a concrete ServiceJourney on an `OperatingDay`.<br>" +
    "See SBB specific transport-modes: " + PublicLinks.DEV_MANUAL_V580_SBB_PRODUCT_CATEGORY + ".")
@Builder
@Value
public class ServiceProduct implements RouteIndexInterval, CorporateIdentity, Line, TrainNumber, TypeOfProductCategory {

    /**
     * Transmodel "LINE::name": A group of ROUTEs which is generally known to the public by a similar name or number. Entur "publicCode";
     *
     * @see Line#getName()
     * @see #getLine()
     */
    @Schema(description = "Complete product name and may consist of {`vehicleSubModeShortName`, `line`, `number`}. (Refers to Transmodel `Line::name/::id`.)",
        requiredMode = RequiredMode.REQUIRED, example = "IC 1 753")
    @JsonProperty(required = true)
    @NonNull
    String name;

    @Schema(description = "Principally same as related `name` but adapted by SBB Business Rules to display for passengers.",
        requiredMode = RequiredMode.REQUIRED, example = "IC 1 753")
    @JsonProperty(required = true)
    @NonNull
    String nameFormatted;

    /**
     * @see Line getId()
     * @see #getName()
     */
    @Schema(description = "Usually referring to a specific commercial PT route (where direction might be either way), shown on vehicle displays. "
        + ModelDoc.JOURNEY_SINGLE_RIDE + " (Refers to Transmodel `Line::id`.)", example = "1")
    @JsonProperty String line;

    /**
     * @see #getLine()
     */
    @Schema(description = "External line-reference like SLNID (source INFO+) or TU specific value (for e.g. provided by Postauto AG), relates to `line`.",
        example = "R_547_000801_0883")
    @JsonProperty String lineId;

    /**
     * Depends on search parameter {@link swiss.opentransportdata.ojp.adapter.model.trip.request.TransportModeEnum}
     *
     * @see swiss.opentransportdata.ojp.adapter.model.trip.response.PTRideLeg#getMode()
     */
    @Schema(description = ModelDoc.VEHICLEMODE_ID, requiredMode = RequiredMode.REQUIRED)
    @JsonProperty(required = true)
    @NonNull
    VehicleMode vehicleMode;

    /**
     * @see TrainNumber
     */
    @Schema(description = "Unique per `OperatingDay` (CH day-change at 04:00 !) and name (where 'IC 1' can run several times per day in either of opposite directions). " +
        "For passenger display use `numberFormatted` instead! (Aka Transmodel: `TrainNumber`)", example = "753")
    @JsonProperty String number;

    // might be null in rare cased, for e.g. for ICE 2902
    @Schema(description = "Operator operating between routeIndexFrom until routeIndexTo." /*, required = true*/)
    @JsonProperty
    Operator operator;

    @Schema(description = "Defines the first ScheduledStop::routeIndex where this product is valid on a Line, null if unknown.", example = "3")
    @JsonProperty Integer routeIndexFrom;

    @Schema(description = "Defines the last ScheduledStop::routeIndex where this product is valid on a Line, null if unknown", example = "7")
    @JsonProperty Integer routeIndexTo;

    /**
     * @see VehicleMode#getCorporateIdentityIcon()
     */
    @Schema(description = "Icon-identifier to represent the `ServiceProduct` specific submode (for e.g. the symbol for an 'EC 1'). See " + PublicLinks.CDN_ICON_LINK, example = "ic-1")
    String corporateIdentityIcon;
}
