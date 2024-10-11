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

package swiss.opentransportdata.ojp.adapter.service.api.converter;

import java.util.Arrays;
import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.service.error.DeveloperException;

/**
 * Test input/output may differ widely among different routers.
 * <p>
 * Abbreviation is used by TripContextV3ProtoConverter for J-S internal usage explicitely.
 */
public enum RouterEnum {
    /**
     * Offical SBB P Public Transport router.
     */
    HAFAS("HA"),
    /**
     * FPLJS-1543
     */
    RAILKIT("RK"),
    /**
     * SKI+ OJP passive instance (rather Swiss national)
     */
    OJP_PASSIVE("OP"),
    /**
     * SKI+ OJP active instance (cascaded internationally with other OJP routers).
     */
    OJP_ACTIVE("OA"),

    //ROUTERANK("RR")
    ;

    public static final RouterEnum DEFAULT_ROUTER = RouterEnum.HAFAS;

    public static final int ABBREVIATION_LENGTH = 2;

    private final String abbreviation;

    //@InternalFriend
    public static RouterEnum valueOfAbbreviation(@NonNull String abbreviation) {
        return Arrays.stream(RouterEnum.values())
            .filter(v -> v.abbreviation.equals(abbreviation))
            .findAny()
            .orElse(null);
    }

    /**
     * FPLJS-1522 Trip::id format relevant!
     *
     * @param abbreviation 2 digits by definition
     */
    RouterEnum(String abbreviation) {
        if (abbreviation.length() != ABBREVIATION_LENGTH) {
            throw new DeveloperException("illegal abbreviation length for " + abbreviation);
        }
        this.abbreviation = abbreviation;
    }

    //@InternalFriend
    public String toAbbreviation() {
        return abbreviation;
    }
}
