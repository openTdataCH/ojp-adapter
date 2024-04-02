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

package swiss.opentransportdata.ojp.adapter.service.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import swiss.opentransportdata.ojp.adapter.service.api.ApiDocumentation;
import swiss.opentransportdata.ojp.adapter.service.application.configuration.ServiceConfiguration;

@Slf4j
@SpringBootApplication
@Import({ServiceConfiguration.class})
public class OJPWebApplication {

    public static void main(String[] args) {
        // see ServiceDoc::formatVersion
        log.info("Going to run version {}", Version.getCurrent(ApiDocumentation.OJP_TITLE));

        SpringApplication.run(OJPWebApplication.class, args);
    }
}
