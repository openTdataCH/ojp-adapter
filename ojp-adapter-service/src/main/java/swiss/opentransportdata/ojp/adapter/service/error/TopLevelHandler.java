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

package swiss.opentransportdata.ojp.adapter.service.error;

import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.model.common.response.Problem;
import swiss.opentransportdata.ojp.adapter.service.controller.ResponseFactory;

/**
 * Global error handler.
 * <p>
 * This is just introduced for rare cases, when API/Controller try-block does not catch the appropriate error.
 *
 * @author Peter Hirzel
 * @see <a href="http://www.baeldung.com/exception-handling-for-rest-with-spring">Baeldung tutorial</a>
 * @see ResponseEntityExceptionHandler#handleException(Exception, WebRequest) Spring's extension handlers
 */
@ControllerAdvice
@RequiredArgsConstructor
public class TopLevelHandler extends ResponseEntityExceptionHandler {

    private static final String TOP_LEVEL_ERROR_INSTANCE = "Toplevel-error";
    private final ResponseFactory responseFactory;

    private static String getMaskedDetailMessage(String about, Exception ex) {
        final String exceptionName = (ex == null) ? StringUtils.EMPTY : ": " + ex.getClass().getSimpleName();
        return TOP_LEVEL_ERROR_INSTANCE + " about '" + about + exceptionName + "' ";
    }

    // 400 Bad Request
    @ExceptionHandler(value = {IllegalArgumentException.class})
    ResponseEntity<Problem> handleBadArguments(IllegalArgumentException ex) {
        logger.info("bad argument", ex);
        return responseFactory.createBadParamResponse(ex, HttpStatus.BAD_REQUEST.getReasonPhrase(), TOP_LEVEL_ERROR_INSTANCE + ", Check your arguments");
    }

    // 400
    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        /*
        if (ex.getCause() instanceof JsonConversionFailedException cause) {
            ResponseEntity<Problem> response = responseFactory.createBadParamResponse(cause, ex.getPropertyName(), "");
            return new ResponseEntity<>(response.getBody(), response.getHeaders(), response.getStatusCode());
        }
         */
        return super.handleTypeMismatch(ex, headers, status, request);
    }

    // 500
    @ExceptionHandler(value = {OJPException.class})
    ResponseEntity<Problem> handleDeveloperFault(OJPException ex) {
        return responseFactory.createDeveloperFaultResponse(getMaskedDetailMessage("OJP fault", ex), ex);
    }

    // 500
    @ExceptionHandler(value = {IOException.class})
    ResponseEntity<Problem> handleIOError(Exception ex) {
        return responseFactory.createUnexpectedProblemResponse(getMaskedDetailMessage("I/O", ex), ex);
    }

    // 500
    @ExceptionHandler(value = {Exception.class})
    ResponseEntity<Problem> handleUnexpectedError(Exception ex) {

        if ((ex instanceof NullPointerException) || (ex.getCause() instanceof NullPointerException)) {
            return responseFactory.createDeveloperFaultResponse(getMaskedDetailMessage("NP", ex), ex);
        }

        if (ex instanceof HttpMessageConversionException) {
            // like no JSON constructor -> check @Builder vs @Data
            return responseFactory.createDeveloperFaultResponse(getMaskedDetailMessage("internal mapping problem", ex), ex);
        }
        return responseFactory.createUnexpectedProblemResponse(getMaskedDetailMessage("no explanation yet", ex), ex);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
        HttpStatusCode statusCode, WebRequest request) {
        ResponseEntity<Object> response = super.handleExceptionInternal(ex, body, headers, statusCode, request);
        if (response != null && response.getBody() instanceof ProblemDetail responseProblem) {
            responseProblem.setProperty(Problem.TRACE_ID_FIELD_NAME, responseFactory.getTraceId());
        }
        return response;
    }
}
