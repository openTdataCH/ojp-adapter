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

import java.time.OffsetDateTime;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.NavigationPathAssignment;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Quay;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.StopCall;

@UtilityClass
public class ScheduledStopPointConverter {

    public static StopCall createStopCall(OffsetDateTime timeAimed, OffsetDateTime timeRt, String delayTextOrEmpty,
        Quay quayAimed, Quay quayRt, boolean platformChanged, String quayFormatted,
        NavigationPathAssignment navigationPathAssignment) {
        final String delayText = StringUtils.isBlank(delayTextOrEmpty) ? null /*J-A returns at least ""*/ : delayTextOrEmpty;
        if ((timeAimed != null) || (timeRt != null) || (delayText != null) || (quayAimed != null) || (quayRt != null)) {
            return StopCall.builder()
                .timeAimed(timeAimed)
                .timeRt(timeRt)
                .delayText(delayText)
                .quayAimed(quayAimed)
                .quayRt(quayRt)
                .quayChanged(platformChanged)
                .quayFormatted(determineQuayFormatted(quayFormatted, quayAimed, quayRt))
                .navigationPathAssignment(navigationPathAssignment)
                // .trainStopAssignment()
                .build();
        }
        return null;
    }

    static String determineQuayFormatted(String quayFormatted, Quay quayAimed, Quay quayRt) {
        if (StringUtils.isNotBlank(quayFormatted)) {
            // enforce calculated BR for wing-trains
            return quayFormatted;
        }
        if (quayRt != null) {
            return quayRt.getName();
        }
        if (quayAimed != null) {
            return quayAimed.getName();
        }
        return null;
    }
}
