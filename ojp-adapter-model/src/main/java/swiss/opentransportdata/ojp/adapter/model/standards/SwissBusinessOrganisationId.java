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

package swiss.opentransportdata.ojp.adapter.model.standards;

import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

public interface SwissBusinessOrganisationId {

    /**
     * de:Die Swiss Business Organisation ID (SBOID) entsprechen in der Regel einem Transportunternehmen (TU). Allerdings gibt es auch Transportunternehmen welche mehrere Geschäftsorganisationen
     * umfassen. Z.B. wenn das Unternehmen sowohl ein Bahn- als auch Busleistungen anbietet.
     *
     * @return like "ch:1:sboid:100118"
     * @see <a href="https://www.xn--v-info-vxa.ch/de/swiss-identification-public-transport-sid4pt">SID4PT ÖV-Standard</a>
     * @see <a href="https://opentransportdata.swiss/en/cookbook/business-organisations/">Cookbook Business Organisations</a>
     */
    String getSwissBusinessOrganisationId();

    static boolean isSwissBusinessOrganisationId(@NonNull String value) {
        return StringUtils.contains(value, ":sboid:");
    }
}
