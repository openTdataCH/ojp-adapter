/*
 * Copyright 2023 Peter Hirzel
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

package swiss.opentransportdata.ojp.adapter;

import de.vdv.ojp.release2.model.ModeFilterStructure;
import de.vdv.ojp.release2.model.TripViaStructure;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Locale;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.tripquery.TripRequest;

/**
 * A filter to apply for a Trip search.
 * <p>
 * Transmodel:
 * <ul>
 *     <li>"TRIP REQUEST FILTER" Filter parameters common to "TRIP REQUESTs".</li>
 *     <li>"TRIP REQUEST POLICY" Optimisation criteria to be used to when computing and decorating trip plans.</li>
 * </ul>
 */
@Data
@Builder
public class TripRequestFilter implements TripRequest, ModeRequestFilter {

    private static int LIMIT_DEFAULT = 5;
    static final int TRANSFER_LIMIT_MAX = 11;
    static final int WALK_SPEED_DEFAULT = 100;

    Locale preferredLanguage;

    /**
     * Empty limit results into error!
     */
    @NonNull
    @Builder.Default
    Integer limit = LIMIT_DEFAULT;

    ModeFilterStructure modeFilterStructure;

    /**
     * false: depart at dateTime (default); true: arrive at dateTime
     */
    @Builder.Default
    boolean searchForArrival = false;

    /**
     * Very origin of Trip.
     * <p>
     * Passive OJP: simple Stop UIC like "8507000".
     * <p>
     * Active OJP: "OJP:STOP:SBB:8503424|Schaffhausen"
     * @see swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.tripquery.TripOriginPlace
     */
    @NonNull
    String origin;
    /**
     * Very destination of Trip.
     * <p>
     * Passive OJP: simple Stop UIC like "8507000".
     * <p>
     * Active OJP: "OJP:STOP:SBB:8503424|Schaffhausen"
     * @see swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.tripquery.TripDestinationPlace
     */
    @NonNull
    String destination;

    /**
     * Relates to {@link #isSearchForArrival()}.
     * <p>
     * Default: NOW (at builder time)
     */
    @Builder.Default
    @NonNull ZonedDateTime dateTime = ZonedDateTime.now();

    @Builder.Default
    @NonNull Integer transferLimit = TRANSFER_LIMIT_MAX;

    /**
     * 100% considered average standard speed.
     * @see swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.tripquery.TripMobilityFilter
     */
    @Builder.Default
    @NonNull Integer walkSpeed = WALK_SPEED_DEFAULT;

    /**
     * Via-Stop-points enforced to pass. May cause a Vehicle-transfer for passengers.
     */
    List<TripViaStructure> vias;

    @Builder.Default
    boolean includeAccessibility = false;
    @Builder.Default
    boolean includeBikeCarriage = false;
    @Builder.Default
    boolean includeLegProjection = false;
    @Builder.Default
    boolean includeOperatingDays = false;
    @Builder.Default
    boolean includeIntermediateStops = false;
    @Builder.Default
    boolean includeSituationsContext = true;

    /**
     * Default: false, all trips are calculated by realtime data; true: planned data only
     */
    @Builder.Default // TODO rename closer to UseRealtimeDataEnumeration
    boolean excludeRealtime = false;
}
