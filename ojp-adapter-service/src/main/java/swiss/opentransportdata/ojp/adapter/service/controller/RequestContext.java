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

package swiss.opentransportdata.ojp.adapter.service.controller;

import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.servlet.HandlerMapping;
import swiss.opentransportdata.ojp.adapter.model.common.response.Problem;
import swiss.opentransportdata.ojp.adapter.service.operations.MonitoringConstants;

/**
 * Request-Context
 * <p>
 * Headers of Requests are stored in this RequestContext. The Context is initialized on every Request {@see {@link ResponseEntityFactory }}
 *
 * @author Florian Hof
 */
@Getter
@Builder
@ToString
public class RequestContext implements swiss.opentransportdata.ojp.adapter.service.exchange.RequestContext {

    private final HttpServletRequest request;

    /**
     * Consumer-Context
     *
     * @see MonitoringConstants#HEADER_REQUEST_ID
     */
    private final String requestId;

    private final LocalDateTime requestTime;

    /**
     * Relative API path from base-path like "/v0/places". Relevant for {@link Problem#getInstance()}.
     */
    private final String apiPath;

    /**
     * Relative API path from base-path like "/v0/places. Useful for monitoring".
     */
    public String getApiPathPattern() {
        return (String) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
    }

    /**
     * @see HttpServletRequest#getQueryString()
     */
    public String getQueryString() {
        return request.getQueryString();
    }

    /**
     * @see org.springframework.http.HttpHeaders#ACCEPT_LANGUAGE
     */
    private final Locale acceptLocale;

    /*
     * APIM ClientId (developer.sbb.ch)
     *
    private final String clientId;
    /**
     * APIM Azure Roles  (https://portal.azure.com)
     *
    private final Set<String> roles;
     */

    @Override
    public MultiValueMap<String, String> getContent() {
        MultiValueMap<String, String> content = new LinkedMultiValueMap<>();
        if (StringUtils.isNotBlank(requestId)) {
            content.put(MonitoringConstants.HEADER_REQUEST_ID, List.of(requestId));
        }
        return content;
    }
}

