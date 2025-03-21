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

import de.vdv.ojp.v2.model.ModeFilterStructure;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusablemode.transportmode.Mode;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.querymodel.commonquery.PIRequestFilter;

/**
 * OJP v2.x filter.
 */
public interface ModeRequestFilter extends PIRequestFilter {

    /**
     * Included or excluded public-transport modes.
     * @see Mode
     */
    ModeFilterStructure getModeFilterStructure();

    /**
     * Greater than 0, if set.
     */
    Integer getLimit();
}
