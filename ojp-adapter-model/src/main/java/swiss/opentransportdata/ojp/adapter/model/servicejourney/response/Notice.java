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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

@Schema(description = "Additional information on operating Vehicle. The information may be usable for passenger. Relates to `includeNoticeAttributes`.")
@Builder
@Value
public class Notice implements RouteIndexInterval, swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.notice.Notice {

    public static final Integer DEFAULT_PRIORITY = 100;

    /*
     * @see Note#getKey()
     */
    @Schema(description = "2 letter key. **Derived from MERITS codes** for e.g. UIC Code 916-1 'reservation system code', though they are specified by SBB Data-Mgmt.<br>" +
        "Be aware if **`type`=" + NoticeType.INFO + ", `advertised`=true** do not display the (rather confusing) `name`: " + ModelDoc.HINT_NON_ENDUSER,
        requiredMode = RequiredMode.REQUIRED, example = "RM")
    @JsonProperty(required = true)
    @NonNull
    String name;

    /*
     * @see Note#getValue()
     */
    @Schema(description = "Textual details related to `name`, if any.")
    @JsonProperty
    LinkedText text;

    /**
     * @return classification like ATTRIBUTE, INFO see eu.cen.transmodel.v6x56.part1.commonconcepts.reusablecomponents.notice.TypeOfNotice
     */
    @Schema(description = "Type of Notice. " + ModelDoc.HINT_ENUM_EXTENSIBLE + "[" + NoticeType.ATTRIBUTE + "," + NoticeType.INFO + "]",
        requiredMode = RequiredMode.REQUIRED, example = NoticeType.ATTRIBUTE)
    @JsonProperty(required = true)
    @NonNull
    String /*JsonExtensibleEnum: NoticeType*/ type;

    /**
     * see {@link swiss.opentransportdata.ojp.adapter.trm.v6.additionalcommonconcepts.reusablecomponents.message.MessagePriority}
     */
    @Schema(description = "A lower priority value means a higher importance (default=100).", requiredMode = RequiredMode.REQUIRED)
    @JsonProperty(required = true)
    @NonNull
    Integer priority;

    @Schema(description = "Relates to `ScheduledStop::routeIndex` where this note is valid from.")
    @JsonProperty
    Integer routeIndexFrom;

    @Schema(description = "Relates to `ScheduledStop::routeIndex` where this note is valid to.")
    @JsonProperty
    Integer routeIndexTo;

    /**
     * Remark about channel handling: some like sbb.ch might look for matching Corporate Identity icons for {@link #name} or display non-visible symbol (for e.g. in case of new
     * {@link NoticeType#ATTRIBUTE}).
     *
     * @see <a href="https://www.merriam-webster.com/dictionary/advertised">to make something known to</a>
     */
    @Schema(description = "Hint whether a passenger should see such a `Notice` being advertised (aka Transmodel NOTICE::canBeAdvertised).<br>" +
        "Be aware if **false**: " + ModelDoc.HINT_NON_ENDUSER, requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    @JsonProperty(required = true)
    boolean advertised;
}
