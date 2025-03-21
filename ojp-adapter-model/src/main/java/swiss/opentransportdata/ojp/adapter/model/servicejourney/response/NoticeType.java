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

import lombok.experimental.UtilityClass;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusablemessage.notice.TypeOfNotice;

@UtilityClass
@JsonExtensibleEnum
public final class NoticeType implements TypeOfNotice {

    /**
     * Nasty hardcoded SwaggerUI value!
     */
    public static final String ATTRIBUTE = "ATTRIBUTE";

    /**
     * Nasty hardcoded SwaggerUI value!
     */
    public static final String INFO = "INFO";
}
