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

import java.time.LocalDate;
import java.util.Locale;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.transmodel.passengerinformation.querymodel.commonquery.PIRequestFilter;
import swiss.opentransportdata.ojp.adapter.transmodel.passengerinformation.querymodel.commonquery.PIRequestPolicy;

@Data
@Builder
public class TripLegRequestFilter implements PIRequestPolicy, PIRequestFilter {

    Locale preferredLanguage;

    /**
     * PTRideLeg::id, for e.g. "ojp:91037::R:j22:527:3183".
     */
    @NonNull String journeyReference;

    /**
     * Day of operation.
     */
    @NonNull LocalDate operatingDay;

    @Builder.Default
    boolean projection = false;
}
