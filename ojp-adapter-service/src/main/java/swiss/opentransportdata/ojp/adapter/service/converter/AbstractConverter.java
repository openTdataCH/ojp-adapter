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
import java.util.function.Function;
import lombok.NonNull;

/**
 * Abstract converter already handling collection of objects, but letting conversion of singular object to be implemented in the subclasses.
 * <p>
 * This old pattern (without {@link Function}) also doesn't tend to big anonymous class and avoid the boilerplate code for a Function with apply-Method.
 *
 * @param <T> Raw model (Domain-entity) representation's type
 * @param <R> DTO representation's type
 * @author Florian Hof
 * @see <a href="https://www.baeldung.com/spring-type-conversions>Perhaps use Spring GenericConverter</a>
 */
public interface AbstractConverter<T, R> {

    /**
     * @param internalObjects collection of domain or raw model objects
     * @return List of DTO's (beautified/converted internalObjects)
     */
    default List<R> convertToDTOs(@NonNull Collection<T> internalObjects) {
        return internalObjects.stream().map(this::convertToDTO).toList();
    }

    /**
     * Convert raw to beauty model.
     *
     * @param internalObject (for e.g. raw model)
     * @return DTO (beautified model)
     */
    R convertToDTO(T internalObject);

    //    /**
    //     * Provided DTO's retrieved by mapping each of them with the conversion function.
    //     *
    //     * @param dtos beautified models
    //     * @return entities (for e.g. raw model or internal object)
    //     */
    //    default List<T> convertToEntities(@NonNull Collection<R> dtos) {
    //        return dtos.stream().map(this::convertToEntity).toList();
    //    }
    //
    //    /**
    //     * Convert beauty to raw model.
    //     *
    //     * @param dto beauty model
    //     * @return entity (for e.g. raw model or internal object)
    //     */
    //    default T convertToEntity(R dto) {
    //        throw new NotImplementedException(this.getClass().getSimpleName() + " must override");
    //    }
}
