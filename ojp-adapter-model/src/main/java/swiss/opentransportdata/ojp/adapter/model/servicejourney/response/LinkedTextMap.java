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

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;

/**
 * Won't be generated for ApiClient, but necessary for openapi.yml file see "ref: LinkedTextMap"
 */
@Schema(description = "Map(key=linkable types {" + LinkedText.KEY_EMAIL + "," + LinkedText.KEY_PHONE + "," + LinkedText.KEY_URL
    + "}, value=list of corresponding linkable values in `LinkedText::template` in ascending order of occurance).")
public class LinkedTextMap extends HashMap<String, List<String>> {

    private static final long serialVersionUID = -7013647777483221582L;

    @JsonIgnore
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
