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

package swiss.opentransportdata.ojp.adapter.model.situation.request;

import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part4.operationsmonitoringandcontrol.situation.ptsituation.PTSituationAffectedScope;

/**
 * The size/heaviness of the situation.
 *
 * @see PTSituationAffectedScope
 */
@JsonExtensibleEnum
public enum PTSituationAffectedScopeEnum {
    /**
     * de:Grossstörung
     */
    MAJOR_AREA_DISRUPTION;

    public static final String TYPE_MAJOR_AREA_DISRUPTION = "MAJOR_AREA_DISRUPTION";
}
