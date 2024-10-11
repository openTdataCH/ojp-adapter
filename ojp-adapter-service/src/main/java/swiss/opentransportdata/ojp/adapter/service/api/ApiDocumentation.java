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

import java.util.List;
import java.util.Locale;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpHeaders;
import swiss.opentransportdata.ojp.adapter.service.application.configuration.SwaggerConfiguration;
import swiss.opentransportdata.ojp.adapter.service.operations.MonitoringConstants;

/**
 * Doc aspects related to visible OpenAPI 3.
 */
@UtilityClass
public class ApiDocumentation {

    public static final String SERVICE_ROOT = "/";

    public static final String TAG_OJP = "Open Journey Planner";

    /**
     * Versioning knows several options, we follow URI versioning:
     * <i>prefer URI Versioning because it is better supported by tools and infrastructure like API-Management and Proxies use URL Mappings as an important property for routing and applying policies
     * for the sake of performance (like e.g. different API subscription plans for different versions).</i>
     *
     * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#116">Zalando guidelines 'MUST use semantic versioning' in json-definition info:{version: ..}</a>
     * @see SwaggerConfiguration#ojpGroupedApi()
     */
    public static final String VERSION_URI_V0 = "v0";
    public static final String OJP_SHORTNAME = "OJP";
    public static final String OJP_TITLE = OJP_SHORTNAME + " RESTful API (Transmodel like facade App)";
    public static final String TEAM = "Peter Hirzel";

    // HttpStatus
    public static final String STATUS_200 = "Response found";
    public static final String HTTP_STATUS_4XX = "Any 4xx according to standard (like [httpstatuses.com](https://www.webfx.com/web-development/glossary/http-status-codes/)).";
    public static final String HTTP_STATUS_5XX = "Any 5xx according to standard (like [httpstatuses.com](https://www.webfx.com/web-development/glossary/http-status-codes/)).";
    public static final String STATUS_400 = "Bad request";
    /**
     * Invalid {@link HttpHeaders#AUTHORIZATION}
     */
    public static final String STATUS_401 = "Unauthorized";
    /**
     * For e.g. APIM token's ClientId not granted for API method.
     */
    public static final String STATUS_403 = "Forbidden";
    public static final String STATUS_404 = "No entity/resource found (in Backend)";

    /**
     * @see <a href="https://tools.ietf.org/html/rfc2616#section-14.14">RFC2616 section 14.14</a>
     * @see <a href="https://tools.ietf.org/html/rfc6648">Naming of HTTP header fields</a>
     * @see HttpHeaders#CONTENT_LANGUAGE
     */
    public static final String HEADER_LANGUAGE_DESCRIPTION = "Language of translatable properties.";
    // DO NOT use in @Schema(allowableValues=...) but consider ApiParametersDefault.ParamAcceptLanguage
    public static final List<Locale> HEADER_ACCEPT_LANGUAGE_VALUES = List.of(Locale.GERMAN, Locale.FRENCH, Locale.ITALIAN, Locale.ENGLISH);
    public static final String HEADER_ACCEPT_LANGUAGE_DEFAULT = "en";
    public static final String HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT = HEADER_ACCEPT_LANGUAGE_DEFAULT;
    public static final String HEADER_REQUEST_ID_REPLY = "Your '" + MonitoringConstants.HEADER_REQUEST_ID + "' value";
    public static final String HEADER_REQUEST_ID_DESCRIPTION = "The given '" + MonitoringConstants.HEADER_REQUEST_ID
        + "' will support traceability (monitoring like Instana and logging like Splunk). The given value will be returned by the appropriate response as well.";

    /**
     * Often used suffixes to property: *Name, *ShortName, *Formatted
     */
    public static final String TRANSLATED_TEXT = "<br>(Translated according to " + HttpHeaders.ACCEPT_LANGUAGE + ".)";
}
