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

package swiss.opentransportdata.ojp.adapter.transmodel.passengerinformation.querymodel.commonquery;

import java.util.Locale;

/**
 * Transmodel: PI REQUEST POLICY
 * <p>
 * Optimisation criteria to be used when computing and decorating the results for the PI REQUEST.
 */
public interface PIRequestPolicy {

    // boolean includeAccessibility
    // boolean includeNotices
    // boolean includeFacilities

    /***
     * @return Preferred Language in which to return results.
     */
    Locale getPreferredLanguage();
}