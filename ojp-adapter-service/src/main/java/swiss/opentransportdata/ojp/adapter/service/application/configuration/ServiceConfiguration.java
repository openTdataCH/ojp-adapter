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

package swiss.opentransportdata.ojp.adapter.service.application.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import swiss.opentransportdata.ojp.adapter.service.application.OJPWebApplication;

/**
 * Configuration that finds the required components for the {@link OJPWebApplication}.
 *
 * @see <a href="http://localhost:8082/swagger-ui/index.html">Swagger-UI (localhost)</a>
 */
@Configuration
@ComponentScan(basePackages = {"swiss.opentransportdata.ojp"})
@EnableScheduling // allows @Scheduled runs
public class ServiceConfiguration {

    /*
    @Bean(name = "instanaTracer")
    public InstanaHelper instanaTracer() {
        return new InstanaHelper();
    }

    @Bean
    public RestRequestBodyMonitoringObserver RestRequestBodyMonitoringObserver(InstanaHelper instanaTracer) {
        return new RestRequestBodyMonitoringObserver(instanaTracer);
    }
     */
}
