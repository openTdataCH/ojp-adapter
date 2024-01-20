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

package swiss.opentransportdata.ojp.adapter.service.exchange;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Locale;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import swiss.opentransportdata.ojp.adapter.service.controller.ApiDocumentation;
import swiss.opentransportdata.ojp.adapter.service.controller.RequestContext;
import swiss.opentransportdata.ojp.adapter.service.controller.RequestContextHolder;
import swiss.opentransportdata.ojp.adapter.service.operations.MonitoringConstants;

/**
 * @author Florian Hof
 */
@Slf4j
@Component("OjpRequestContextFilter")
@Order(11)
public class RequestContextFilter extends OncePerRequestFilter {

    private final swiss.opentransportdata.ojp.adapter.service.controller.RequestContextHolder requestContextHolder;
    private final AcceptHeaderLocaleResolver acceptHeaderLocaleResolver;

    public RequestContextFilter(RequestContextHolder requestContextHolder) {
        this.requestContextHolder = requestContextHolder;
        acceptHeaderLocaleResolver = new AcceptHeaderLocaleResolver();
        acceptHeaderLocaleResolver.setSupportedLocales(ApiDocumentation.HEADER_ACCEPT_LANGUAGE_VALUES);
        acceptHeaderLocaleResolver.setDefaultLocale(new Locale(ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT));
    }

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) throws ServletException, IOException {
        try {
            prepareContext(request);

            filterChain.doFilter(request, response);
        } finally {
            cleanUpContext();
        }
    }

    void prepareContext(@NonNull HttpServletRequest request) {
        String requestId = getRequestId(request);
        /*TODO logging config
        MDC.put(LoggingConstants.LOG_MDC_CONTEXT_KEY_REQUEST_ID, requestId);
        SSOTokenUtils token = new SSOTokenUtils(request);
        String clientId = token.isEmpty() ? null : token.extractClientId();
        Set<String> roles = token.isEmpty() ? null : token.extractClientRoles();
        if (StringUtils.isBlank(clientId)) {
            log.debug("access without clientId to {} from {}@{}:{}", request.getRequestURL(), request.getRemoteUser(), request.getRemoteHost(), request.getRemotePort());
        } else {
            MDC.put(LoggingConstants.LOG_MDC_CONTEXT_KEY_CLIENT_ID, clientId);
        }
         */
        Locale acceptLocale = acceptHeaderLocaleResolver.resolveLocale(request);
        RequestContext requestContext = RequestContext.builder()
            .request(request)
            .requestTime(LocalDateTime.now())
            .apiPath(request.getServletPath())
            .requestId(requestId)
            .acceptLocale(acceptLocale)
            /*
            .clientId(clientId)
            .roles(roles)
             */
            .build();
        registerNewContext(requestContext);
    }

    void cleanUpContext() {
        /*
        MDC.remove(LoggingConstants.LOG_MDC_CONTEXT_KEY_CLIENT_ID);
        MDC.remove(LoggingConstants.LOG_MDC_CONTEXT_KEY_REQUEST_ID);
         */
    }

    private String getRequestId(@NonNull HttpServletRequest request) {
        return request.getHeader(MonitoringConstants.HEADER_REQUEST_ID);
    }

    private void registerNewContext(RequestContext requestContext) {
        this.requestContextHolder.setRequestContext(requestContext);
    }
}
