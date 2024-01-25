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

package swiss.opentransportdata.ojp.adapter.service.exchange.webclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.core.ResolvableType;
import org.springframework.core.codec.CodecException;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.MediaType;
import org.springframework.http.codec.json.AbstractJackson2Decoder;
import org.springframework.lang.Nullable;
import org.springframework.util.MimeType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import swiss.opentransportdata.ojp.adapter.OJPException;

/**
 * Decode/map a successful JSON-response from a preceeding HTTP-request for real asynchroneous callers (like VIA).
 *
 * @see <a href="https://kalpads.medium.com/error-handling-with-reactive-streams-77b6ec7231ff">error-handling with reactive streams</a>
 */
@Slf4j
class JsonResponseDecoder extends AbstractJackson2Decoder {

    JsonResponseDecoder(ObjectMapper mapper) {
        super(mapper, MediaType.APPLICATION_JSON);
    }

    @Override
    public Flux<Object> decode(
        Publisher<DataBuffer> input,
        ResolvableType elementType,
        @Nullable MimeType mimeType,
        @Nullable Map<String, Object> hints) {
        return super.decode(input, elementType, mimeType, hints)
            .onErrorMap(e -> wrapException(elementType, e));
    }

    /**
     * This is not involved by {@link } !
     *
     * @param input
     * @param elementType
     * @param mimeType
     * @param hints
     * @return JSON decoded Mono
     */
    @Override
    public Mono<Object> decodeToMono(
        Publisher<DataBuffer> input,
        ResolvableType elementType,
        @Nullable MimeType mimeType,
        @Nullable Map<String, Object> hints) {
        return super.decode(input, elementType, mimeType, hints)
            // if not mapped DecodingException (cause: JsonMappingException) results otherwise
            .onErrorMap(e -> wrapException(elementType, e))
            .singleOrEmpty();
    }

    private Throwable wrapException(ResolvableType elementType, Throwable throwable) {
        if (throwable instanceof CodecException) {
            String message = String.format("REST-API JSON to raw Model (POJO): %s", elementType);
            return new OJPException(message, throwable);
        } else {
            // should not happen
            log.warn("Unexpected exception remains unwrapped: {}", elementType, throwable);
            return throwable;
        }
    }
}
