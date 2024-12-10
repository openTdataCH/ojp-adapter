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
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @see <a href="https://app.swaggerhub.com/apis-docs/schlpbch/uic-90918_10_osdm">OSDM TripSearchCriteria ::ptModeFilter</a>
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TripMobilityFilterGroup>OJP TripMobilityFilter</a>
 * @see swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.Connection
 * @see swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.interchange.Interchange
 * @see swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.routingconstraint.TransferRestriction
 */
@Schema(description = "Parameters to restrict the transfer options - particularly for interchanging `PTRideLeg's` by passenger (de: Individuelles Umsteigeverhalten).\n" +
    // OpenApi hack -> this description wins over local redefinition at usage!
    "- TripsByOriginAndDestinationPostBody: all filters supported\n" +
    "- ServiceCalendarByOriginAndDestinationRequestBody: only `maxTransfers` supported yet")
@Data
@NoArgsConstructor
@ToString
public class TripMobilityFilter implements swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.tripquery.TripMobilityFilter {

    public static final int DEFAULT_MAX_TRANSFERS = 11 /*TODO verify OJP possibilites*/;
    public static final int DEFAULT_ADDITIONAL_TRANSFER_TIME = 0;
    public static final int DEFAULT_WALKSPEED = 100;

    /**
     * Relates to Transmodel TripMobilityFilter::maximumNumberOfChanges
     *
     * @see swiss.opentransportdata.ojp.adapter.model.trip.response.Trip#getTransfers()
     */
    @Schema(description = "Max. number of Vehicle changes. The parameter is relevant between origin and destination or between origin and ptVias[0] if any among all `PTRideLeg's`.",
        defaultValue = "" + DEFAULT_MAX_TRANSFERS, minimum = "0", maximum = "" + DEFAULT_MAX_TRANSFERS, type = "integer")
    Integer maxTransfers;

    @Schema(description = "Walking speed when changing Vehicles: 100% means default speed, 200% doubles it and below 100% will reduce changing time below SBB recommendation.\n" +
        "- If the calculation does not result in full minutes, it is rounded using 'round half up' method.\n" +
        "- See `Trip::fastTransfer` for time risky changes.", defaultValue = "" + DEFAULT_WALKSPEED, type = "integer")
    Integer walkSpeed;

    //    /**
    //     * OJP/OSDM TripMobilityFilter::additionalTransferTime
    //     */
    //    @Schema(description = "Additional time [in min.] on top of default transfer time when changing Vehicle's.", type = "integer", defaultValue = "" + DEFAULT_ADDITIONAL_TRANSFER_TIME)
    //    Integer additionalTransferTime;

    //    @Schema(description = "Minimum change time [in min.] when changing transport-products. There is no constant default, depends on SBB defined changing time at specific STATION.",
    //        type = "integer", minimum = "0")
    //    Integer minTransferTime;

    //    @Schema(description = "Maximum change time at stop in minutes. In realtimeMode=FULL only planned time is considered (by means not guaranteed if dateTimeRt is given).",
    //        type = "integer", minimum = "0")
    //    Integer maxTransferTime;
}
