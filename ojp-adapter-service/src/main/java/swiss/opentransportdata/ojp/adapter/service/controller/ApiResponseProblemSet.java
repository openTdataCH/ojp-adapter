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

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Only if the HTTP status code is not in the list below or its usage requires additional information aside the well-defined semantic, the API specification must provide a clear description of the
 * HTTP status code in the response.
 */
@ApiResponseProblemV3(responseCode = "400", description = ApiDocumentation.HTTP_STATUS_4XX)
@ApiResponseProblemV3(responseCode = "500", description = ApiDocumentation.HTTP_STATUS_5XX)
/*
@ApiResponseProblemV3(responseCode = "400", description = ServiceDoc.STATUS_400)
@ApiResponseProblemV3(responseCode = "401", description = ServiceDoc.STATUS_401)
@ApiResponseProblemV3(responseCode = "403", description = ServiceDoc.STATUS_403)
@ApiResponseProblemV3(responseCode = "404", description = ServiceDoc.STATUS_404)
@ApiResponseProblemV3(responseCode = "500", description = ServiceDoc.STATUS_500)
@ApiResponseProblemV3(responseCode = "501", description = ServiceDoc.STATUS_501)
*/

/*
 * You must only use standardized HTTP status codes consistently with their intended semantics. You must not invent new HTTP status codes.
 * <p>
 * Important: As long as your HTTP status code usage is well covered by the semantic defined here, you should not describe it to avoid an overload with common sense information and the risk of
 * inconsistent definitions.
 *
 * @author Florian Hof
 * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#243">Use Standard HTTP Status Codes</a>
 * @see <a href="https://www.webfx.com/web-development/glossary/http-status-codes/">see overview on all error codes on httpstatuses.com/</a>
 * @see <a href="https://en.wikipedia.org/wiki/List_of_HTTP_status_codes">see overview on all error codes on Wikipedia</a>
 */
@Target({METHOD, TYPE, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ApiResponseProblemSet {

}
