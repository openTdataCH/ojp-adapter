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
package swiss.opentransportdata.ojp.adapter.v1;

import de.vdv.ojp.PtModeFilterStructure;
import java.time.ZonedDateTime;
import java.util.Locale;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.stopeventquery.StopEventRequest;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.querymodel.commonquery.PIRequestPolicy;

/**
 * A filter to apply for a StopEventRequest.
 * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.stopeventquery.StopEventRequestContentFilter
 * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.stopeventquery.StopEventRequestPolicy
 */
@Data
@Builder
public class StopEventRequestFilter implements StopEventRequest, PTModeRequestFilter {

    private static int LIMIT_DEFAULT = 20;

    Locale preferredLanguage;

    @Builder.Default
    @NonNull
    Integer limit = LIMIT_DEFAULT;

    PtModeFilterStructure ptModeFilterStructure;

    /**
     * false: depart at dateTime (default); true: arrive at dateTime
     */
    @Builder.Default
    boolean searchForArrival = false;

    /**
     * Passive OJP: simple Stop UIC like "8507000".
     * <p>
     * Active OJP: "OJP:STOP:SBB:8503424|Schaffhausen"
     */
    @NonNull
    String stopPlaceReference;

    /**
     * Relates to departureArrivalDateTime value.
     * <p>
     * Default: NOW (at builder time)
     */
    @Builder.Default
    ZonedDateTime departureArrivalDateTime = ZonedDateTime.now();
}
