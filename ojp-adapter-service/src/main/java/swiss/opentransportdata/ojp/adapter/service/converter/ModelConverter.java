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

package swiss.opentransportdata.ojp.adapter.service.converter;

import java.util.Collection;
import java.util.List;

/**
 * A common problem of converting pairs of similar objects one to another.
 * <p>
 * Goals: - domain/entity classes (for e.g. Hafas raw model) to DTOs, which are then sent to frontend as JSON objects in this VERY DIRECTION only. - DTO classes shouldn’t know about domain/entity
 * classes and the other way round. - No coupling between the two kinds of objects
 *
 * @author Peter Hirzel
 * @see <a href="https://xsolve.software/blog/converter-pattern-in-java-8/">Converter in Java8</a>
 * @see <a href="https://github.com/iluwatar/java-design-patterns/blob/master/converter/src/main/java/com/iluwatar/converter/Converter.java">Sample Converter</a>
 */
public interface ModelConverter<T, R> {

    /**
     * Convert raw to beauty model.
     *
     * @param entity (for e.g. Hafas raw model)
     * @return DTO (beautified model)
     */
    R convertToDTO(T entity);

    /**
     * Provided entities retrieved by mapping each of them with the conversion function.
     *
     * @param entities collection of entities (domain or raw model)
     * @return List of DTO's (beautified model-elements)
     */
    List<R> convertToDTOs(Collection<T> entities);

    /**
     * Convert beauty to raw model.
     *
     * @param dto beauty model
     * @return entity (for e.g. Hafas raw model)
     */
    T convertToEntity(R dto);

    /**
     * Provided DTO's retrieved by mapping each of them with the conversion function.
     *
     * @param dtos beautified models
     * @return entities (for e.g. Hafas raw model)
     */
    List<T> convertToEntities(Collection<R> dtos);
}
