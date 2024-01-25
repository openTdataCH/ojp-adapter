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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.reactive.function.client.WebClient;
import swiss.opentransportdata.ojp.adapter.v1.OJPAdapter;

/**
 * OJP router instance access configuration.
 */
@Profile({"ojp-adapter"})
@Configuration
@ComponentScan(basePackageClasses = {EnvironmentProperties.class})
public class OJPAdapterServiceConfiguration {

    /**
     * Useful to tag requests for Logging/Monitoring dashboards or consumer interaction (for e.g. to filter any false-positives or other statistics).
     *
     * @see <a href="https://stackoverflow.com/questions/25433258/what-is-the-x-request-id-http-header">Usage of Request-ID</a>
     */
    public static final String REQUEST_ID_VALUE_TEST = "OJPAdapter_TEST";

    // OJP->OJPAdapterTest relevant: passive instance
    @Value("${ojp.endpoint.passive:https://api.opentransportdata.swiss/ojp2020}")
    private String ojpEndpointPassive;
    @Value("${ojp.authorization.passive:}")
    private String ojpAuthorizationPassive;
    @Value("${ojp.endpoint.active:https://api.opentransportdata.swiss/ojp-la-aktiv}")
    private String ojpEndpointActive;
    @Value("${ojp.authorization.active:}")
    private String ojpAuthorizationActive;

    @Bean
    public OJPAdapter ojpAdapter() {
        // simple WebClient setup for tests
        return new OJPAdapter(WebClient.builder().build(), REQUEST_ID_VALUE_TEST);
    }

    @Bean
    public OJPAccessor ojpAccessPassive() {
        return OJPAccessor.builder()
            .endpoint(ojpEndpointPassive)
            .token(ojpAuthorizationPassive)
            .build();
    }

    @Bean
    public OJPAccessor ojpAccessActive() {
        return OJPAccessor.builder()
            .endpoint(ojpEndpointActive)
            .token(ojpAuthorizationActive)
            .build();
    }
}
