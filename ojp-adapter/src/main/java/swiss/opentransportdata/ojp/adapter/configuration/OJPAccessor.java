/*
 * Copyright 2023 Peter Hirzel
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
package swiss.opentransportdata.ojp.adapter.configuration;

import lombok.Builder;
import lombok.Value;

/**
 * Allow specific OJP instance and rights configuration.
 *
 * @author Peter Hirzel
 * @see <a href="https://github.com/VDVde/OJP">OJP.xsd 1.0.x specifying the JAXB POJO model</a>
 */
@Builder
@Value
public class OJPAccessor {

    /**
     * Instance URL of OJP server.
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/ojp2020">Swiss passive instance (default)</a>
     * @see <a href="https://api.opentransportdata.swiss/ojp-la-aktiv">Swiss active instance (capable to interact with other international OJP instances)</a>
     */
    String endpoint;

    /**
     * Access key related to {@link #endpoint}
     *
     * @see <a href="https://opentransportdata.swiss/de/register/">Register your OJP access key</a>
     * @see <a href="https://opentransportdata.swiss/de/dev-dashboard/">Login Opentransportdata.swiss (choose "VDV 431 Default")</a>
     */
    String token;

    // TODO should not be part of accessor
    @Deprecated
    String requestId;
}
