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

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

//@SecurityRequirement(name = "BearerAuth")
@Slf4j
public abstract class BaseController {

    @Autowired
    protected ResponseFactory responseFactory;

    /*
    @Autowired
    protected ApimMeter apimMeter;
     */

    @Autowired
    protected RequestContextHolder requestContextHolder;

    protected void monitorRequest(String api) {
        RequestContext requestContext = requestContextHolder.getRequestContext();

        log.trace("api={} called", api);

        // apimMeter.increaseApiRequestPerConsumerCounter(api, requestContext.getClientId(), requestContext.getRequestId());
    }

    protected void logQueryString(@NonNull String extraInfo) {
        RequestContext requestContext = requestContextHolder.getRequestContext();
        String apiPathPattern = requestContext.getApiPathPattern();
        apiPathPattern = (apiPathPattern != null) ? apiPathPattern : requestContext.getApiPath();
        String queryForLog = requestContext.getQueryString();
        queryForLog = (queryForLog == null) ? "" : queryForLog.replace("&", " ");
        log.info("Call {} {} {}", apiPathPattern, queryForLog, extraInfo);
    }

    protected RequestContext getRequestContext() {
        return requestContextHolder.getRequestContext();
    }
}
