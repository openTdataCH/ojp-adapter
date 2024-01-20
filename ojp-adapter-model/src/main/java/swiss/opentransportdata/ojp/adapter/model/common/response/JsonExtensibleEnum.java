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

package swiss.opentransportdata.ojp.adapter.model.common.response;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Zalando x-extensible-enum return parameter may deliver new values; either be agnostic or provide default behavior for unknown values.
 * <p>
 * Do NOT declare OpenApi3 @{@link Schema#allowableValues()} for such response model properties!
 *
 * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#112">SHOULD used open-ended list of values (x-extensible-enum) for enumerations [112]</a>
 * @see swiss.opentransportdata.ojp.adapter.model.ModelDoc#HINT_ENUM_EXTENSIBLE
 */
public @interface JsonExtensibleEnum {

}
