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

package swiss.opentransportdata.ojp.adapter.model.trip.request;

import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;

@JsonExtensibleEnum
@Schema(description = "Searchable `Notice's` values for type=ATTRIBUTE. Relates to `ServiceJourney::notices`." + ModelDoc.HINT_ENUM_EXTENSIBLE + "\n" +
    "- `TripsByOriginAndDestinationPostBody::includeNoticeAttributes`: all values supported and also applied in related `vias` except COUCHETTE/SLEEPING_CAR\n" +
    "- `ServiceCalendarByOriginAndDestinationRequestBody::includeNoticeAttributes`: only 'BIKE_TRANSPORT' supported yet",
    enumAsRef = true)
public enum NoticeAttributeEnum {

    //    GROUPS_ADMITTED("GROUPS_ADMITTED"),
    /**
     * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#TripMobilityFilterGroup>OJP TripMobilityFilter::bikeTransport</a>
     */
    BIKE_TRANSPORT("BIKE_TRANSPORT"),
    //    /**
    //     * see PTViaReference#couchette
    //     */
    //    COUCHETTE("COUCHETTE"),
    //    /**
    //     * see PTViaReference#sleepingCar
    //     */
    //    SLEEPING_CAR("SLEEPING_CAR"),
    //    EXCLUDE_TILTING_TRAIN("EXCLUDE_TILTING_TRAIN")
    ;

    private final String value;

    NoticeAttributeEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }
}
