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

import static java.lang.annotation.ElementType.PARAMETER;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.http.HttpHeaders;
import swiss.opentransportdata.ojp.adapter.service.operations.MonitoringConstants;

/**
 * @author Florian Hof
 */
public class ApiParametersDefault {

    private ApiParametersDefault() {
    }

    @Parameter(
        in = ParameterIn.HEADER,
        name = MonitoringConstants.HEADER_REQUEST_ID,
        description = ApiDocumentation.HEADER_REQUEST_ID_DESCRIPTION,
        schema = @Schema(type = "string")
    )
    // @RequestHeader(value = MonitoringConstants.HEADER_REQUEST_ID, required = false)
    // @RequestHeader as meta-annotation in Spring 6 --> https://github.com/spring-projects/spring-framework/issues/21829
    @Target({PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ParamRequestId {

    }

    @Parameter(
        in = ParameterIn.HEADER,
        name = HttpHeaders.ACCEPT_LANGUAGE,
        description = ApiDocumentation.HEADER_LANGUAGE_DESCRIPTION,
        example = ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT,
        schema = @Schema(
            type = "string",
            // see ApiDocumentation::HEADER_ACCEPT_LANGUAGE_VALUES
            allowableValues = {"de", "fr", "it", "en"},
            defaultValue = ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT)
    )
    //@RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, defaultValue = ServiceDoc.HEADER_ACCEPT_LANGUAGE_DEFAULT, required = false)
    // @RequestHeader as meta-annotation in Spring 6 --> https://github.com/spring-projects/spring-framework/issues/21829
    @Target({PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ParamAcceptLanguage {

    }
}
