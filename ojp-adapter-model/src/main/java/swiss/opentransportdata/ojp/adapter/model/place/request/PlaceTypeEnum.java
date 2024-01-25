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

package swiss.opentransportdata.ojp.adapter.model.place.request;

import io.swagger.v3.oas.annotations.media.Schema;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;

/**
 * @see de.vdv.ojp.PlaceTypeEnumeration
 */
@JsonExtensibleEnum
@Schema(enumAsRef = true)
public enum PlaceTypeEnum {
    ALL,
    StopPlace,
    Address,
    PointOfInterest;

    public static final String TYPE_ALL = "ALL";
    // same as the class name
    public static final String TYPE_STOPPLACE = "StopPlace";
    // same as the class name
    public static final String TYPE_ADDRESS = "Address";
    // same as the class name
    public static final String TYPE_POINTOFINTEREST = "PointOfInterest";
}
