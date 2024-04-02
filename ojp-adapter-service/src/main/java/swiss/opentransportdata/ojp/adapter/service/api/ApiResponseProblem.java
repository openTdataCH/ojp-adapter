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

package swiss.opentransportdata.ojp.adapter.service.api;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON_VALUE;

import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpHeaders;
import swiss.opentransportdata.ojp.adapter.model.common.response.Problem;
import swiss.opentransportdata.ojp.adapter.service.api.ApiResponseProblem.ApiResponsesProblem;
import swiss.opentransportdata.ojp.adapter.service.operations.MonitoringConstants;

/**
 * @author Florian Hof
 */
@ApiResponse(
    headers = {
        @Header(name = HttpHeaders.CONTENT_LANGUAGE, description = ApiDocumentation.HEADER_LANGUAGE_DESCRIPTION, schema = @Schema(type = "string")),
        @Header(name = MonitoringConstants.HEADER_REQUEST_ID, description = ApiDocumentation.HEADER_REQUEST_ID_REPLY, schema = @Schema(type = "string"))},
    content = @Content(mediaType = APPLICATION_PROBLEM_JSON_VALUE, schema = @Schema(implementation = Problem.class)))

@Target({METHOD, TYPE, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ApiResponsesProblem.class)
@Inherited
public @interface ApiResponseProblem {
    // inspired by io.swagger.v3.oas.annotations.responses.ApiResponse

    /**
     * A short description of the response.
     *
     * @return description of the response
     **/
    @AliasFor(annotation = ApiResponse.class, attribute = "description")
    String description() default "";

    /**
     * The HTTP response code, or 'default', for the supplied response. May only have 1 default entry.
     *
     * @return response code
     **/
    @AliasFor(annotation = ApiResponse.class, attribute = "responseCode")
    String responseCode() default "default";

    @Target({METHOD, TYPE, ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @interface ApiResponsesProblem {
        // inspired by io.swagger.v3.oas.annotations.responses.ApiResponses

        ApiResponseProblem[] value() default {};
    }
}
