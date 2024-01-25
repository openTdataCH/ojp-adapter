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
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import swiss.opentransportdata.ojp.adapter.model.ObjectMapperFactory;

/**
 * WebClient strategies
 */
public class HttpGetExchangeStrategies implements ExchangeStrategies {

    private static final Integer DEFAULT_MAX_IN_MEMORY_SIZE = 16 * 1024 * 1024; // 16MB

    private final List<HttpMessageReader<?>> messageReaders;
    private final List<HttpMessageWriter<?>> messageWriters;

    public HttpGetExchangeStrategies(boolean strict) {
        this(strict, DEFAULT_MAX_IN_MEMORY_SIZE);
    }

    /**
     * @param strict ObjectMapper strict JSON deserialization
     * @param maxInMemorySize exceeded limit on max bytes to buffer for e.g. 16*1024*1024 (16MB) (increase for webflux error in spring-boot-starter-webflux context)
     */
    public HttpGetExchangeStrategies(boolean strict, Integer maxInMemorySize) {
        final ObjectMapper mapper = ObjectMapperFactory.createMapper(strict);
        ExchangeStrategies exchangeStrategies = ExchangeStrategies.builder()
            .codecs(configurer -> {
                configurer
                    .defaultCodecs()
                    .jackson2JsonEncoder(
                        // standard Spring
                        new Jackson2JsonEncoder(mapper, MediaType.APPLICATION_JSON));
                configurer
                    .defaultCodecs()
                    .jackson2JsonDecoder(new JsonResponseDecoder(mapper));
                if (maxInMemorySize != null) {
                    configurer.defaultCodecs()
                        .maxInMemorySize(maxInMemorySize);
                }
            })
            .build();
        messageReaders = exchangeStrategies.messageReaders();
        messageWriters = exchangeStrategies.messageWriters();
    }

    @Override
    public List<HttpMessageReader<?>> messageReaders() {
        return messageReaders;
    }

    @Override
    public List<HttpMessageWriter<?>> messageWriters() {
        return messageWriters;
    }
}
