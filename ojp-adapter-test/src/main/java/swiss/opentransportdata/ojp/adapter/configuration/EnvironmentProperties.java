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

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Manage access to properties for *Configuration. Works for:
 * <ul>
 *     <li>PropertySource-file annotation</li>
 *     <li>Environment variables (cmd args), for e.g. mvn clean test -Dmyvar=x</li>
 * </ul>
 */
@Configuration
@PropertySource(value = "file:../ojp-adapter-test/src/main/resources/ojp-SAMPLE.properties")
// override sample with local settings where needed
@PropertySource(value = "file:../ojp-adapter-test/src/main/resources/ojp.properties", ignoreResourceNotFound = true)
public class EnvironmentProperties {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}