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
import java.util.stream.Collectors;
import lombok.NonNull;
import org.apache.commons.lang3.NotImplementedException;

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
public abstract class AbstractConverter<T, R> implements ModelConverter<T, R> {

    @Override
    public List<R> convertToDTOs(@NonNull Collection<T> entities) {
        return entities.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<T> convertToEntities(@NonNull Collection<R> dtos) {
        return dtos.stream().map(this::convertToEntity).collect(Collectors.toList());
    }

    @Override
    public R convertToDTO(T entity) {
        throw new NotImplementedException(this.getClass().getSimpleName() + " does not implement convertToDTO");
    }

    @Override
    public T convertToEntity(R dto) {
        throw new NotImplementedException(this.getClass().getSimpleName() + " does not implement convertToEntity");
    }
}
