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

package swiss.opentransportdata.ojp.adapter.service.application.configuration;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.util.List;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.util.CollectionUtils;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import swiss.opentransportdata.ojp.adapter.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.service.api.ApiDocumentation;
import swiss.opentransportdata.ojp.adapter.service.api.converter.OJPController;
import swiss.opentransportdata.ojp.adapter.service.exchange.webclient.HttpGetExchangeStrategies;

/**
 * Configuration to access OJP SKI+ Switzerland.
 */
@Slf4j
@Configuration
public class OJPConfiguration {

    /**
     * Passive URL of OJP.
     * <p>
     * Instance for Switzerland.
     */
    @Getter
    private final String endpointPassive;
    /**
     * Active URL of OJP.
     * <p>
     * Active forwarding instance to other OJP instnces (for e.g. Austria).
     */
    @Getter
    private final String endpointActive;

    /**
     * OJP access key, registerable by any public OJP user.
     *
     * @see <a href="https://opentransportdata.swiss/de/register/">Register your OJP access key</a>
     * @see <a href="https://opentransportdata.swiss/de/dev-dashboard/">Login Opentransportdata.swiss (choose "VDV 431 Default")</a>
     */
    @Getter
    private final String authorization;

    /**
     * Related to endpoints {@link ApiDocumentation#SERVICE_ROOT} specific header settings.
     *
     * @param endpointPassive default OJP passive instance URL
     * @param endpointActive optional OJP active instance URL, used when {@link OJPController#HEADER_OJP_ACTIVE_INSTANCE} is true
     * @param authorization OJP passive instance default token (can be overriden per request by {@link OJPController#HEADER_OJP_TOKEN}
     */
    public OJPConfiguration(
        @Value("${ojp.endpoint:https://api.opentransportdata.swiss/ojp2020}") String endpointPassive,
        @Value("${ojp.endpointActive:https://api.opentransportdata.swiss/ojp-la-aktiv}") String endpointActive,
        @Value("${ojp.authorization:}") String authorization) {
        this.endpointPassive = endpointPassive;
        this.endpointActive = endpointActive;
        this.authorization = authorization;
        if (StringUtils.isBlank(authorization)) {
            // NASTY: for build reasons with add ":" here
            log.warn("OJP requests will run into FORBIDDEN without authorization");
        }
    }

    @Value("${ojp.timeoutConnect:15000}")
    Integer timeoutConnect;
    @Value("${ojp.timeoutRead:25000}")
    Integer timeoutRead;

    /**
     * Hint for SKI+ OJP Support-Team about use case usage of OJP active/passive instance.
     * <p>
     * Replace if downloaded and operated for your own context.
     */
    @Value("${ojp.callerReference:OJP-Adapter_OSS}")
    String callerReference;

    @Bean(name = "OJPAdapter")
    public OJPAdapter ojpAdapter() {
        // simple WebClient setup for tests
        return new OJPAdapter(createWebClient(), callerReference);
    }

    /**
     * true: gzip compression is enabled (default is false)
     */
    private final boolean compress = false;

    /**
     * Whether to follow links when retrieving redirect-url.
     * <p>
     * Mostly this feature is used, when redirecting from http to https connections.
     * <p>
     * Default is true, which means requests will follow the redirects.
     */
    private final boolean followRedirects = true;

    /**
     * Declare specific exchange-strategies.
     * <p>
     * null defaults to {@link HttpGetExchangeStrategies}
     */
    private final ExchangeStrategies exchangeStrategies = null;

    /**
     * Declare additional exchange-filter-functions if needed
     * <p>
     * Configure your exchange-filters to be adapted for each query by WebClient, for e.g. for authentication or error-handling.
     */
    private final List<ExchangeFilterFunction> exchangeFilterFunctions = null;

    private WebClient createWebClient() {
        final HttpClient httpClient = HttpClient.create()
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, timeoutConnect)
            .doOnConnected(conn -> conn.addHandlerLast(new ReadTimeoutHandler(timeoutRead))
                /*.addHandlerLast(new WriteTimeoutHandler(writeTimeOut))*/)
            //.wiretap(enableWireTap)
            .followRedirect(followRedirects)
            .compress(compress);

        final WebClient.Builder webClientBuilder = WebClient.builder()
            .exchangeStrategies(exchangeStrategies == null ? new HttpGetExchangeStrategies(false) : exchangeStrategies)
            .clientConnector(new ReactorClientHttpConnector(httpClient));

        // check if additional FilterFunctions should be applied.
        // e.g. RepsonseErrorHandler or AuthorizationFilter are set with this feature
        if (CollectionUtils.isEmpty(exchangeFilterFunctions)) {
            log.debug("No custom exchange-filters applied");
        } else {
            webClientBuilder.filters(funcs -> funcs.addAll(exchangeFilterFunctions));
            log.debug("Exchange-filters applied: {}", exchangeFilterFunctions);
        }

        return webClientBuilder.build();
    }
}