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

import io.micrometer.tracing.Tracer;
import java.util.Locale;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import swiss.opentransportdata.ojp.adapter.model.common.response.Problem;
import swiss.opentransportdata.ojp.adapter.service.api.ApiDocumentation;
import swiss.opentransportdata.ojp.adapter.service.error.TopLevelHandler;

/**
 * Reusable REST response utilities.
 *
 * @author Peter Hirzel
 * @see TopLevelHandler
 * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#150">MUST use standard HTTP status codes [150]</a>
 */
@Slf4j
@Component
public final class ResponseFactory extends RequestContextAwareFactory {

    public static final String TITLE_NOT_FOUND = "Object not found";

    public static final int BAD_REQUEST = HttpStatus.BAD_REQUEST.value();
    public static final int UNAUTHORIZED = HttpStatus.UNAUTHORIZED.value();
    public static final int FORBIDDEN = HttpStatus.FORBIDDEN.value();
    public static final int BAD_GATEWAY = HttpStatus.BAD_GATEWAY.value();
    public static final int NOT_IMPLEMENTED = HttpStatus.NOT_IMPLEMENTED.value();
    public static final int SERVICE_UNAVAILABLE = HttpStatus.SERVICE_UNAVAILABLE.value();
    public static final int GATEWAY_TIMEOUT = HttpStatus.GATEWAY_TIMEOUT.value();

    private final Tracer tracer;

    @Autowired
    public ResponseFactory(RequestContextHolder requestContextHolder, Tracer tracer) {
        super(requestContextHolder);
        this.tracer = tracer;
    }

    /* strategic APIs: ---------------------------------------------------------------------- */
    // 404
    public ResponseEntity<Problem> createNotFoundResponse() {
        return createProblemResponse(HttpStatus.NOT_FOUND, TITLE_NOT_FOUND, "Refine your query parameters.");
    }

    public ResponseEntity<Problem> createNotFoundResponse(@NonNull String title, @NonNull String detail) {
        return createProblemResponse(HttpStatus.NOT_FOUND, title, detail);
    }

    // 400 IllegalArgumentException, NumberFormatException,..
    public ResponseEntity<Problem> createBadParamResponse(Exception ex, @NonNull String param, @NonNull String fault) {
        Throwable rootCause = ExceptionUtils.getRootCause(ex);
        String detail = (ex == null) ? "" : ": " + ex.getMessage() + ((ex == rootCause) ? "" : ": " + rootCause.getMessage());
        return createProblemResponse(HttpStatus.BAD_REQUEST, param, fault + detail);
    }

    /**
     * Like ApimExposure
     *
     * @param detail of access prevention
     * @return proper 403 problem object
     */
    public ResponseEntity<Problem> createForbiddenResponse(@NonNull String detail) {
        return createProblemResponse(HttpStatus.FORBIDDEN, "Forbidden ClientId or its roles assigned", detail);
    }

    public ResponseEntity<Problem> createMethodNotAllowed(@NonNull String detail) {
        return createProblemResponse(HttpStatus.METHOD_NOT_ALLOWED, "Consumer fault", detail);
    }

    public ResponseEntity<Problem> createUnexpectedProblemResponse(@NonNull String detail, @NonNull Throwable exceptionForLog) {
        return createProblemResponse(HttpStatus.INTERNAL_SERVER_ERROR, ResponseEntityFactory.UNEXPECTED_ERROR, detail, exceptionForLog);
    }

    public ResponseEntity<Problem> createTimeoutResponse(@NonNull String detail, @NonNull Throwable exceptionForLog) {
        return createProblemResponse(HttpStatus.GATEWAY_TIMEOUT, "Timeout", detail, exceptionForLog);
    }

    public ResponseEntity<Problem> createDeveloperFaultResponse(@NonNull String detail) {
        return createDeveloperFaultResponse(detail, null);
    }

    // 500
    public ResponseEntity<Problem> createDeveloperFaultResponse(@NonNull String detail, Throwable exceptionForLog) {
        return createProblemResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Developer error", detail, exceptionForLog);
    }

    // 501
    public ResponseEntity<Problem> createNotImplementedResponse(@NonNull String detail) {
        return createProblemResponse(HttpStatus.NOT_IMPLEMENTED, "Developer error", detail);
    }

    // not caused by an Exception
    private ResponseEntity<Problem> createProblemResponse(HttpStatus status, String title, String detail) {
        return createProblemResponse(status, title, detail, null);
    }

    // caused by an Exception
    private ResponseEntity<Problem> createProblemResponse(HttpStatus status, String title, String detail, Throwable internalExceptionForLog) {
        // StackTraces are given only a few times, then let empty, to optimize performance and logs!
        // see https://stackoverflow.com/questions/2411487/nullpointerexception-in-java-with-no-stacktrace
        final String apiPath = getApiPath();
        final String traceId = getTraceId();
        if (status.is4xxClientError()) {
            log.info("{} title={}, detail={}, path={}", status, title, detail, apiPath, internalExceptionForLog);
        } else {
            log.error("{} title={}, detail={}, path={}", status, title, detail, apiPath, internalExceptionForLog);
        }
        return new ResponseEntity<>(
            ResponseEntityFactory.createProblem(status, title, detail, apiPath, traceId),
            ResponseEntityFactory.createProblemHeader(ApiDocumentation.HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT, getRequestId()), status);
    }

    /**
     * 200
     *
     * @param hit
     * @param locale
     * @param <R>
     */
    public <R> ResponseEntity<R> createOkResponse(@NonNull R hit, Locale locale) {
        String requestId = getRequestId();
        log.debug("Object found in {}", getApiPath());
        return ResponseEntityFactory.createOkResponse(hit, locale, requestId);
    }

    private String getApiPath() {
        if (getRequestContext() != null) {
            return getRequestContext().getApiPath();
        }
        return null;
    }

    private String getRequestId() {
        if (getRequestContext() != null) {
            return getRequestContext().getRequestId();
        }
        return null;
    }

    public String getTraceId() {
        return tracer.currentTraceContext().context().traceId();
    }

    private static String extractContentLanguage(@NonNull HttpHeaders headers) {
        String language = headers.getFirst(HttpHeaders.CONTENT_LANGUAGE);
        if (StringUtils.isBlank(language)) {
            // should not happen
            log.warn("developer fault: OJP response contains no {}", HttpHeaders.CONTENT_LANGUAGE);
            return ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT;
        }
        return language;
    }
}
