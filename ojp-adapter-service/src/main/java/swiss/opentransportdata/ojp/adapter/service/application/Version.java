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

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

/**
 * Determine version of this jar.
 */
@Slf4j
@UtilityClass
public final class Version {

    private static final String PROPERTIES = "/META-INF/build-info.properties";
    private static final String PROPERTY_VERSION_KEY = "build.version";

    private static volatile String current;

    /**
     * The current version is read from META-INF/build-info.properties which is built by spring-boot-maven-plugin during maven compile.
     * <p>
     * Singleton
     *
     * @param instance like "this application"
     * @return current version
     */
    public static synchronized String getCurrent(@NonNull String instance) {
        if (current != null) {
            return current;
        }

        try {
            current = tryFindVersion(instance);
            log.info("{} Version={}", instance, current);
        } catch (Exception ex) {
            log.warn("{} Version build-info.properties not available or accessible for Module", instance, ex);
            current = getBadVersion(instance);
        }

        return current;
    }

    private static String tryFindVersion(String instance) throws IOException {
        try (InputStream resourceAsStream = Version.class.getResourceAsStream(PROPERTIES)) {
            if (resourceAsStream == null) {
                // started from IntelliJ without previous MVN install
                log.warn("{} Version not found: {} (run <mvn install> to fix!)", instance, PROPERTIES);
                return getBadVersion(instance);
            }
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            if (!properties.containsKey(PROPERTY_VERSION_KEY)) {
                log.warn("{} Version build-info.properties does not contain the version or is malformed", instance);
                return getBadVersion(instance);
            }

            return properties.getProperty(PROPERTY_VERSION_KEY);
        }
    }

    private static String getBadVersion(String instance) {
        return instance + "-UNKNOWN";
    }
}
