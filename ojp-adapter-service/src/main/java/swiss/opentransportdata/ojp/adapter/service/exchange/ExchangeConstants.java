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

package swiss.opentransportdata.ojp.adapter.service.exchange;

import lombok.NonNull;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@UtilityClass
public final class ExchangeConstants {

    /**
     * Timeout setting [ms] is critical for a correct interaction with middleware and Hafas::REST. It has a great impact in load-scenarios and end-user experience!
     * <p>
     * Hafas::REST and related middleware
     * <ul>
     *     <li>Connect-Timeout is set to max 30s</li>
     *     <li>Read-Timeout is set to max 30s. However a min. of 10s is recommened, there are some time
     *     consuming requests, like complex international routes or Him-Messages that provide a lot of data.</li>
     * </ul>
     */
    public static final Integer DEFAULT_TIMEOUT_IN_MS = 30000;

    /**
     * Choose your timeouts wisely. Impact on cross system behaviour and end-consumer experience!
     *
     * @param timeout value greater 0 and limited by configured systems in chain
     * @param connectTimeout true: connect; false: read
     * @return timout value if acceptable
     */
    public static Integer restrictTimeout(@NonNull Integer timeout, boolean connectTimeout) {
        if (timeout < 1) {
            throw new IllegalArgumentException("timeout (must be >0)");
        }
        if (timeout > DEFAULT_TIMEOUT_IN_MS) {
            throw new IllegalArgumentException("timeout (> " + DEFAULT_TIMEOUT_IN_MS + "ms exceeds max timeout of Hafas/middleware!)");
        }

        log.debug("{}-timeout configured to: {}[ms]", getExpression(connectTimeout), timeout);
        return timeout;
    }

    private static String getExpression(boolean connectTimeout) {
        return connectTimeout ? "Connect" : "Read";
    }
}
