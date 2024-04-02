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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ProblemDetail;
import org.springframework.http.converter.json.ProblemDetailJacksonMixin;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import swiss.opentransportdata.ojp.adapter.model.ObjectMapperFactory;
import swiss.opentransportdata.ojp.adapter.model.PublicLinks;
import swiss.opentransportdata.ojp.adapter.service.api.ApiDocumentation;
import swiss.opentransportdata.ojp.adapter.service.application.Version;

/**
 * Will be presented as Service-Information in OpenApi 3 Swagger-UI.
 *
 * @see <a href="https://www.baeldung.com/spring-rest-openapi-documentation">Baeldung setup</a>
 */
@Slf4j
@Configuration
public class SwaggerConfiguration {

    /**
     * Deployment and Client generation relevant!
     */
    public static final String SERVICE_NAME = "open-journey-planner";

    public static final String JSON_DEFINITION = SERVICE_NAME + "-api";

    // do not use <br> here!
    private static final String SERVICE_DESCRIPTION = "## " + ApiDocumentation.OJP_TITLE + "\n" +
        // see description.md
        "Using Open Journey Planner provided by [SKI+ OJP](https://opentransportdata.swiss/de/cookbook/open-journey-planner-ojp/).\n\n" +
        "This is a stateless RESTful web-service for **timetable based public transportation routing**.\n"
        +
        "Anyone who registers for OJP may use the public Open Journey Planner.\n\n" +
        "Provided by: " + ApiDocumentation.TEAM + "\n\n" +
        "[Developer-Manual](" + PublicLinks.DEV_MANUAL_ENTRY_PAGE + ")";

    /**
     * Choose "Select a definition" in SwaggerUI
     *
     * @return Group for all APIs
     */
    @Bean
    public GroupedOpenApi ojpGroupedApi() {
        return GroupedOpenApi.builder()
            /*.addOperationCustomizer((operation, handlerMethod) -> {
                operation.addSecurityItem(new SecurityRequirement().addList("basicScheme"));
                return operation;
            })*/
            .group(JSON_DEFINITION)
            .pathsToMatch(ApiDocumentation.SERVICE_ROOT + ApiDocumentation.VERSION_URI_V0 + "/" + "/**")
            //.packagesToScan("swiss.opentransportdata")
            .addOpenApiCustomizer(this::customizeOpenApi)
            .build();
    }

    @Component
    @Deprecated
    static class BeanFactoryPostProcessorSelectingPrimaryRequestMappingHandler implements BeanFactoryPostProcessor {

        @Override
        public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
            // RequestMappingHandlerMapping can be: requestMappingHandlerMapping, controllerEndpointHandlerMapping
            BeanDefinition beanDef = beanFactory.getBeanDefinition("requestMappingHandlerMapping");
            // because ApimGenerator.generateConfiguration does not have a @Qualifier
            beanDef.setPrimary(true);
        }
    }

    private void customizeOpenApi(OpenAPI openApi) {
        // 3rd party consumer need not too much internal infos, see #getApiInfo

        // Fixing hardcoded http url problem in swagger (see https://github.com/springdoc/springdoc-openapi/issues/118) , change generated url -> "/"
        if (!CollectionUtils.isEmpty(openApi.getServers())) {
            openApi.getServers().get(0).url("/");
        }
        // see
        openApi.setInfo(createInfo(SERVICE_DESCRIPTION, Version.getCurrent(ApiDocumentation.OJP_SHORTNAME)));
    }

    /**
     * @param description of service
     * @param version relates to pom.xml version
     * @return JSON definition {..,info{},..}
     * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#116">Zalando guidelines 'MUST use semantic versioning' in json-definition info:{version: ..}</a>
     */
    private Info createInfo(String description, String version) {
        return new Info()
            .title(ApiDocumentation.OJP_SHORTNAME)
            .version(version)
            .description(description)
            .termsOfService("This App is provided as.")
            .license(new License()
                    .name("Apache License, Version 2.0")
                    .url("http://www.apache.org/licenses/LICENSE-2.0")
                /* .extensions() might not validate! */)
            .contact(new Contact()
                //.name("Consumer-Registration")
                //.url(PublicLinks.DEV_MANUAL_CONSUMER_REGISTRATION)
                .email("https://github.com/openTdataCH/ojp-adapter"));
    }

    /**
     * Relevant for response object serialization!
     *
     * @return mapper for Controller serialization (and deserialization)
     * @see <a href="https://www.baeldung.com/jackson-ignore-null-fields">ignore null fields</a>
     * @see <a href="https://www.baeldung.com/spring-boot-customize-jackson-objectmapper">override the default configuration</a>
     * @see <a href="http://www.baeldung.com/jackson-inheritance>Baeldung inheritance tutorial</a>
     */
    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        final ObjectMapper mapper = ObjectMapperFactory.createMapper(false);
        // suppress null-value properties from serialization -> reduce transfer volume
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.addMixIn(ProblemDetail.class, ProblemDetailJacksonMixin.class);
        // eventually more from Spring's Jackson2ObjectMapperBuilder.configure
        return mapper;
    }
}
