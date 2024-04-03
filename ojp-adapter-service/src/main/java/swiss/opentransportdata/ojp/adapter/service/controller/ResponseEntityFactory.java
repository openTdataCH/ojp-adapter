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

import java.util.Locale;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import swiss.opentransportdata.ojp.adapter.model.common.response.Problem;
import swiss.opentransportdata.ojp.adapter.service.api.ApiDocumentation;
import swiss.opentransportdata.ojp.adapter.service.operations.MonitoringConstants;

/**
 * Reusable REST response utilities.
 * <p>
 * see any TopLevelHandler
 *
 * @author Peter Hirzel
 */
@UtilityClass
public final class ResponseEntityFactory {

    /**
     * 400 Bad Parameter: header-field
     */
    public static final String PARAM_HEADER = "header*";

    public static final String UNEXPECTED_ERROR = "Unexpected error";

    /**
     * Any response should set Content-Language and Request-Id.
     *
     * @param hit
     * @param locale
     * @param requestId
     * @param <R> (should be a {@link swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse)}
     * @return 200 OK with ONE response object
     * @see MonitoringConstants#HEADER_REQUEST_ID
     */
    public static <R> ResponseEntity<R> createOkResponse(@NonNull R hit, Locale locale, String requestId) {
        return new ResponseEntity<>(hit, createOkHeaders(locale, requestId), HttpStatus.OK);
    }

    // 404
    public static ResponseEntity<Problem> createNotFoundResponse(@NonNull String title, @NonNull String detail, Locale locale, String requestId, String apiPath) {
        return createProblemResponse(HttpStatus.NOT_FOUND, title, detail, locale == null ? ApiDocumentation.HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT : locale.getLanguage(), requestId, apiPath);
    }

    // 400
    public static ResponseEntity<Problem> createBadParamResponse(IllegalArgumentException ex, @NonNull String param, @NonNull String fault, String requestId, String apiPath) {
        return createProblemResponse(HttpStatus.BAD_REQUEST, param, fault + (ex == null ? "" : " (" + ExceptionUtils.getRootCauseMessage(ex) + ")"),
            ApiDocumentation.HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT, requestId, apiPath);
    }

    // 403
    public static ResponseEntity<Problem> createForbiddenResponse(@NonNull String detail, String requestId, String apiPath) {
        return createProblemResponse(HttpStatus.FORBIDDEN, "Forbidden", detail, ApiDocumentation.HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT, requestId, apiPath);
    }

    // 500
    public static ResponseEntity<Problem> createDeveloperFaultResponse(@NonNull String detail, String requestId, String apiPath) {
        return createProblemResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Developer Error", detail, ApiDocumentation.HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT, requestId, apiPath);
    }

    // 501
    public static ResponseEntity<Problem> createNotImplementedResponse(@NonNull String detail, String requestId, String apiPath) {
        return createProblemResponse(HttpStatus.NOT_IMPLEMENTED, "Coming soon", detail, ApiDocumentation.HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT, requestId, apiPath);
    }

    private static ResponseEntity<Problem> createProblemResponse(HttpStatus status, String title, String detail, String language, String requestId, String apiPath) {
        // generic construct for traceId & apiPath (& language)
        return new ResponseEntity<>(
            createProblem(status, title, detail, apiPath, null),
            createProblemHeader(StringUtils.isBlank(language) ? ApiDocumentation.HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT : language, requestId),
            status);
    }

    public static HttpHeaders createHeaders(String requestId) {
        final HttpHeaders headers = new HttpHeaders();
        // no MediaType & Content-Language yet (no body)
        if (StringUtils.isNotBlank(requestId)) {
            headers.add(MonitoringConstants.HEADER_REQUEST_ID, requestId);
        }
        return headers;
    }

    public static HttpHeaders createOkHeaders(Locale locale, String requestId) {
        return createOkHeaders(locale == null ? null : locale.getLanguage(), requestId);
    }

    public static HttpHeaders createOkHeaders(String language, String requestId) {
        final HttpHeaders headers = createHeaders(requestId);
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        if (StringUtils.isNotBlank(language)) {
            headers.add(HttpHeaders.CONTENT_LANGUAGE, language);
        }
        return headers;
    }

    /**
     * rfc7807 says: Header: HttpStatus resp. high-level error class - section 3.1 declares members of a Problem Details (problem+json) Object: status
     *
     * @param language for e.g. "de" according to {@link ApiDocumentation#HEADER_ACCEPT_LANGUAGE_VALUES}
     * @return error header
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-6">RFC7231 status codes</a>
     * @see <a href="https://tools.ietf.org/html/rfc7807">RFC7807 error description</a>
     * @see #createProblem(HttpStatusCode, String, String, String, String)
     */
    public static HttpHeaders createProblemHeader(String language, String requestId) {
        final HttpHeaders headers = createHeaders(requestId);
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_PROBLEM_JSON_VALUE);
        headers.add(HttpHeaders.CONTENT_LANGUAGE, StringUtils.isEmpty(language) ? ApiDocumentation.HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT : language);
        return headers;
    }

    /**
     * Create a RFC7807 / Zalando like error-description.
     *
     * @param status to send to consumer
     * @param title speaking for consumer
     * @param detail detail for consumer
     * @param instance (relative) api-path
     * @return standardized Problem object to serialize in a JSON response-body
     * @see Problem
     * @see #createProblemHeader(String, String)
     */
    public static Problem createProblem(HttpStatusCode status, String title, String detail, String instance, String traceId) {
        return Problem.builder()
            // let's hope consumers will read the doc and find the ServiceDoc#CONTACT_EMAIL
            .type(StringUtils.EMPTY/*TODO PublicLinks.DEV_MANUAL_PROBLEM*/)
            .title(title)
            .status(status.value())
            .detail(detail)
            .instance(instance)
            .traceId(traceId)
            .build();
    }
}
