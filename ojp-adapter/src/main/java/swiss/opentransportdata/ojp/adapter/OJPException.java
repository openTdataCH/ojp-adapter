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
package swiss.opentransportdata.ojp.adapter;

import de.vdv.ojp.model.ServiceDelivery;
import lombok.Getter;
import lombok.NonNull;

/**
 * J-S OJP-Adapter Exception if any OJP Backend fault happens or OJP returned an ErrorCondition.
 *
 * @author Peter Hirzel
 * @see <a href="https://opentransportdata.swiss/de/wichtiges/">OJP Website</a>
 */
public class OJPException extends RuntimeException {

    /**
     * OJP responded properly with some kind of error.
     */
    @Getter
    private final ServiceDelivery serviceDelivery;

    public OJPException(@NonNull String message) {
        super(message);
        serviceDelivery = null;
    }

    public OJPException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
        serviceDelivery = null;
    }

    /**
     * General fault in OJP response about the request.
     *
     * @param serviceDelivery with {@link ServiceDelivery#getErrorCondition()}
     */
    public OJPException(@NonNull ServiceDelivery serviceDelivery) {
        super("ServiceDelivery::errorCondition=" + serviceDelivery.getErrorCondition().toString());
        this.serviceDelivery = serviceDelivery;
    }
}
