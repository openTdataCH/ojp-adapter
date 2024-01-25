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
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;

/**
 * OpenAPI 3 specific inheritance parent discriminator type specificer.
 */
public interface InheritanceDiscriminable {

    /**
     * See {@link Schema#discriminatorProperty()} = "type" to declare subtype by convention as {@link Class#getSimpleName()} of concrete child.
     * <p>
     * (A 'discriminator' is needed as a technical property for OpenApi inheritance!)
     *
     * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.1.0.md#discriminatorObject">Inheritance</a>
     * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.0.md#models-with-polymorphism-support">v3 Pet Polymorphism</a>
     */
    @Schema(type = "string", requiredMode = RequiredMode.REQUIRED, description = ModelDoc.DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE)
    @NonNull
    String getType();
}
