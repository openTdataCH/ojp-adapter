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

package swiss.opentransportdata.ojp.adapter.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import swiss.opentransportdata.ojp.adapter.model.ObjectMapperFactory;
import swiss.opentransportdata.ojp.adapter.service.application.SwaggerConfiguration;
import swiss.opentransportdata.ojp.adapter.service.application.WebApplication;

/**
 * UNIT-TEST  booting Journey-Service and generating OpenApi 3 specific JSON definition files out of Springdoc annotations.
 * <p>
 * DO NOT disable or skip this Test!!!
 * <p>
 * In general, to consider all "*Test.java" files not being critical for a successful build, SHOULD be a valid assumption.
 * <p>
 * The generatad JSON-definition files are needed to build <b>journey-service-client:
 * <ul>
 *     <li>from version 2.20.0 OpenAPI3/Springdoc</li>
 * </ul>
 * <p>
 * The simplest way to fire a spingcontainer during a mvn build is to use the SpringBootTest/SpringRunner
 * <p>
 * Any better approach to solve this is welcome..?
 * <p>
 * see
 * <ul>
 *     <li>journey-service-client/openapi3/*.json (where "openapi3" folder must be added once)</li>
 *     <li>journey-service-client/pom.xml openapi-generator-maven-plugin</li>
 *     <li>JenkinsFile (build sequence important)</li>
 * </ul>
 * <p>
 */
@Deprecated
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WebApplication.class)
@ActiveProfiles({"unit"})
class OpenApiJsonDefinitionTest {

    // const by Springdoc/OpenAPI 3 (OAS)
    private static final String SWAGGER_VERSION = "v3";
    // journey-service-client/<CLIENT_PATH> for OpenApi 3 JSON-definition files
    private static final String CLIENT_PATH = "openapi3";
    private final ObjectMapper objectMapper = ObjectMapperFactory.createMapper(false);

    @LocalServerPort
    private int port;

    /**
     * Generates journey-service-client/openapi3/journey-service-definition.json specification containing all versions.
     * <p>
     * See <b>journey-service-client/pom.xml</b> which generates ApiClient out of this definition.
     *
     * @throws IOException with json file generation
     */
    @Test
    void downloadSwaggerDefinitionFile() throws IOException {
        createSwaggerApiDoc(SwaggerConfiguration.SERVICE_NAME + "-api",
            /*
             * see Jenkins build:
             * [INFO] --- openapi-generator-maven-plugin:5.2.1:generate (journey-service-client-v1) @ journey-service-client ---
             * [WARNING] Exception while reading:
             * io.swagger.v3.parser.exception.ReadContentException: Unable to read location `/var/data/jenkins/workspace/y-service_feature_spring_upgrade/journey-service-client/openapi3/journey-service-definition.json`
             */
            /*"../ojp-adapter-service-client/"*/ "./" + CLIENT_PATH + "/journey-service-definition.json");
    }

    private void createSwaggerApiDoc(String group, String path) throws IOException {
        final URL jsonDef = new URL(String.format("http://localhost:%d/" + SWAGGER_VERSION + "/api-docs?group=%s", port, group));
        log.info("jsonDef={}", jsonDef);
        final JsonNode spec = objectMapper.readTree(jsonDef);
        log.info("path={}", path);
        final Path destinationFile = Path.of(path);
        String formattedSpec = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(spec);
        Files.writeString(destinationFile, formattedSpec, StandardCharsets.UTF_8);
    }
}