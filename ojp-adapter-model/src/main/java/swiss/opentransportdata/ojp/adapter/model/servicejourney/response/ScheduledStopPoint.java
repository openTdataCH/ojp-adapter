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
import swiss.opentransportdata.ojp.adapter.model.place.response.StopPlace;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericplace.AccessEnd;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.fixedobject.stopplace.StopPlaceSpace;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.coupledjourney.JourneyPart;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part4.operationsmonitoringandcontrol.oc_call.om_call.Arrival;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part4.operationsmonitoringandcontrol.oc_call.om_call.Call;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part4.operationsmonitoringandcontrol.oc_call.om_call.Departure;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part8.managementinformationandstatistics.recordedobjects.BoardingAndAlighting;

/**
 * Transmodel TRM6-v56: ScheduledStoPoint NeTEx: Call OJP: StopPoint
 * <p>
 * Relates to {@link BoardingAndAlighting}
 *
 * @author Peter Hirzel
 * @see AccessEnd
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#StopPointGroup>OJP StopPoint</a>
 */
@Schema(description = "Passenger relevant stop-point on a `ServiceJourney`. Some properties may further by distinguished on either `arrival` and/or `departure StopCall` aspects.")
@Builder
@Value
public class ScheduledStopPoint implements swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ScheduledStopPoint, Call {

    @Schema(description = "Concrete `StopPlace` at stop point on the journey.", requiredMode = RequiredMode.REQUIRED)
    @JsonProperty(required = true)
    @NonNull
    StopPlace place;

    /**
     * Relates to Transmodel {@link StopPlaceSpace} ::alghtingUse, ::boardingUse
     */
    @Schema(description = "Boarding (de:einsteigen) at a StopPlace on a PTRide;. Relates to **`departure`**, `stopStatus` and `accessibilityBoardingAlighting`, " +
        "see [Routing-Basics](" + PublicLinks.DEV_MANUAL_ROUTING_BASICS + ").", requiredMode = RequiredMode.REQUIRED)
    @JsonProperty(required = true)
    boolean forBoarding;

    /**
     * Relates to Transmodel {@link StopPlaceSpace} ::alightingUse, ::boardingUse
     */
    @Schema(description = "Alighting (de:aussteigen) at a StopPlace on a PTRide. Relates to **`arrival`**, `stopStatus` and `accessibilityBoardingAlighting`, " +
        "see [Routing-Basics](" + PublicLinks.DEV_MANUAL_ROUTING_BASICS + ").", requiredMode = RequiredMode.REQUIRED)
    @JsonProperty(required = true)
    boolean forAlighting;

    @Schema(description = "The most relevant boarding/alighting accessibility restriction for handicaped people at a StopPlace on a PTRideLeg. " +
        "Relates to `forBoarding` and `forAlighting` (though not given on intermediate stops) and needs `includeAccessibility` to be set not in [ALL, NONE].")
    @JsonProperty
    AccessibilityBoardingAlighting accessibilityBoardingAlighting;

    /**
     * OJP LegBoardStructure/LegAlightStructure/LegIntermediateStructure::isRequestStop, ::isUnplannedStop
     *
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#StopCallStatusGroup">OJP StopCallStatus</a>
     */
    @Schema(description = "Status at ScheduledStopPlace on a PTRide." +
        "This is is useful when iterating from stop to stop getting appropriate state symbols (de:Perlenschnur), see [Routing-Basics](" + PublicLinks.DEV_MANUAL_ROUTING_BASICS + ")."
        + ModelDoc.HINT_ENUM_EXTENSIBLE + "[PLANNED,CANCELLED,BEGIN_PARTIAL_CANCELLATION,END_PARTIAL_CANCELLATION,NOT_SERVICED,UNPLANNED]")
    @JsonProperty
    String /*StopStatus:JsonExtensibleEnum @NonNull currently, but future use unclear?*/ stopStatus;

    @Schema(description = "Speakable description about related `stopStatus` enum, if any.")
    @JsonProperty
    String stopStatusFormatted;

    @Schema(description = ModelDoc.DESCRIPTION_REQUEST_STOP, requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    @JsonProperty(required = true)
    boolean requestStop;

    /**
     * NeTeX VIEW on ScheduledStopPoint
     *
     * @see Call
     * @see Arrival
     * @see JourneyPart where some vehicle coupling or separating may occur
     */
    @Schema(description = "Arrival aspects planned, if any. Between `arrival` and `departure` some vehicle coupling or separating may occur.")
    @JsonProperty
    StopCall arrival;

    /**
     * NeTeX VIEW on ScheduledStopPoint
     *
     * @see Call
     * @see Departure
     */
    @Schema(description = "Departure aspects planned, if any. Between `arrival` and `departure` some vehicle coupling or separating may occur.")
    @JsonProperty
    StopCall departure;

    /**
     * Useful for channels to present the appropriate UI symbol.
     */
    @Schema(description = "true: After a very long delay at either `arrival` or `departure` (also see related `StopCall::delayText`), according to SBB business rules." +
        " Typically blocks the whole journey or at least the ending part of a journey (like locomotive break at 3rd stop until the very last stop).",
        requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    @JsonProperty(required = true)
    boolean delayUndefined;

    @Schema(description = "Route index on this `ServiceJourney` (aka OJP order). Usually starting from 0 or 1 and incrementing by 1. However if the route index value jumps:\n" +
        " - it is most likely that the journey was rerouted\n" +
        " - or being a virtual Stop")
    @JsonProperty
    Integer routeIndex;

    @Schema(description = "Occupancy in 1st class (average) at StopPlace on a PTRideLeg." + ModelDoc.HINT_ENUM_EXTENSIBLE
        + ModelDoc.OCCUPANCY_ENUM_LIST, requiredMode = RequiredMode.REQUIRED)
    @JsonProperty(required = true)
    @NonNull
    String /*Occupancy:JsonExtensibleEnum*/ occupancyFirstClass;

    @Schema(description = "Occupancy in 2nd class (average) at StopPlace on a PTRideLeg." + ModelDoc.HINT_ENUM_EXTENSIBLE
        + ModelDoc.OCCUPANCY_ENUM_LIST, requiredMode = RequiredMode.REQUIRED)
    @JsonProperty(required = true)
    @NonNull
    String /*Occupancy:JsonExtensibleEnum*/ occupancySecondClass;

    // according to RouteControllerV2::includeExitSide and StopV2::exitSide -> breaking change? might be on PTRideLeg ONCE instead of repeatingly on each stop
    @Schema(description = "Exit side at this stop in direction of journey (null if unknown or irrelevant for e.g. in a Bus or on a Bicycle)."
        + ModelDoc.HINT_ENUM_EXTENSIBLE + "[" + ExitSide.LEFT_VALUE + "," + ExitSide.RIGHT_VALUE + "]", example = ExitSide.LEFT_VALUE)
    @JsonProperty
    String /*ExitSide:JsonExtensibleEnum*/ exitSide;

    @Schema(description =
        "Rank of importance based on intermediate ScheduledStopPoint priority and distance within a (partial) ServiceJourney. " +
            "SBB KI rule based on display-info to find relevant intermediate stops to present on a visual stationboard (de:Perronanzeiger)." +
            "Origin and destination of departure/arrival have always rank=null. Depends on /v3/departures or /v3/arrivals includeRank=true")
    @JsonProperty
    Integer rank;
}
