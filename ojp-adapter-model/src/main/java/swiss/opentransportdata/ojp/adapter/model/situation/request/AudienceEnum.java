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

import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;
import swiss.opentransportdata.ojp.adapter.trm.v6.additionalcommonconcepts.reusablecomponents.message.PublishingChannel;
import swiss.opentransportdata.ojp.adapter.trm.v6.additionalcommonconcepts.reusablecomponents.message.TypeOfAudience;

/**
 * A classification of the categories a MESSAGE is intended for,  e.g. staff or passengers.
 *
 * @see PublishingChannel
 * @see TypeOfAudience
 */
@JsonExtensibleEnum
@Schema(enumAsRef = true, defaultValue = AudienceEnum.AUDIENCE_DEFAULT, description = ModelDoc.HINT_ENUM_AS_REF_EXTENSIBLE_IN_RESPONSE)
@Deprecated
public enum AudienceEnum /*extends TypeOfAudience*/ {
    /**
     * @see AudienceEnum#AUDIENCE_DEFAULT
     */
    B2C_TEXT,
    B2C_MAP,
    /**
     * HIM messages attached to concrete journeys.
     */
    B2C_TIMETABLE,
    B2E_TEXT,
    B2E_MAP;

    /**
     * @see #B2C_TEXT
     */
    public static final String AUDIENCE_DEFAULT = "B2C_TEXT";
}
