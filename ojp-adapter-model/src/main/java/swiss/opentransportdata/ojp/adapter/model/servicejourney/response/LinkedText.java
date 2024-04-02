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

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

@Schema(description = "Text template with optional formattable parameters. Useful to represent in UIs as clickable features like an e-Mail, phone or URL."
    + "<br>Usage see for e.g. [`Notice::text`](https://github.com/SchweizerischeBundesbahnen/journey-service/blob/master/JSON-Objects.md#linkedtext).")
@Builder
@Value
public class LinkedText {

    // @see NoteValue.LinkableType
    public static final String KEY_EMAIL = "EMAIL";
    public static final String KEY_PHONE = "PHONE";
    public static final String KEY_URL = "URL";

    @Schema(type = "string", description = "End-user text." + ModelDoc.TRANSLATED_TEXT
        + "<br>If `arguments` are not empty the template must be formatted for end-user readability, by means arguments will be filled in or an UI may make them interactable (for e.g. clickable)."
        , requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String template;

    @Schema(description = "Optional 'linkable' arguments to be filled in related `template`." + ModelDoc.HINT_ENUM_EXTENSIBLE + "where key={" + KEY_EMAIL + "," + KEY_PHONE + "," + KEY_URL + "}.",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    LinkedTextMap arguments;
}
