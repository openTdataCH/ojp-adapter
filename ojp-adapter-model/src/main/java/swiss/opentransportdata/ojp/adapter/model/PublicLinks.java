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

package swiss.opentransportdata.ojp.adapter.model;

import lombok.experimental.UtilityClass;
import swiss.opentransportdata.ojp.adapter.model.common.response.Problem;

/**
 * Public links.
 * <p>
 * Since this ojp-adapter-service is contributed by SBB, their public documentation may be reused for very same explanations.
 *
 * @see <a href="https://developer.sbb.ch/apis/journey-service/documentation">SBB Journey-Service (full implementation)</a>
 */
@UtilityClass
public class PublicLinks {

    /**
     * Public Client documentation.
     */
    public static final String DEV_MANUAL_ROOT = "https://github.com/SchweizerischeBundesbahnen/journey-service/blob/master/";
    //    public static final String DEV_MANUAL_JSON_OBJECTS = DEV_MANUAL_ROOT + "v3/JSON-Objects.md";
    //    public static final String DEV_MANUAL_DATED_VEHICLE_JOURNEY_REFERENCE = DEV_MANUAL_JSON_OBJECTS + "#datedvehiclejourneyreference";
    //    public static final String DEV_MANUAL_ROUTING_BASICS = DEV_MANUAL_ROOT + "business/RoutingBasics.md";
    //    public static final String DEV_MANUAL_TECHNICAL_ASPECTS = DEV_MANUAL_ROOT + "technial/TechnicalAspects.md";
    /**
     * @see Problem#getType()
     */
    public static final String DEV_MANUAL_PROBLEM = DEV_MANUAL_ROOT + "Problem-Manual.md";

    /**
     * Main entry page for J-S devMan.(Open Journey Planner (SKI+ Switzerland)).
     */
    public static final String DEV_MANUAL_ENTRY_PAGE = DEV_MANUAL_ROOT + "Developer-Manual.md";
    //    public static final String DEV_MANUAL_HINT_COMPLEX_PARAMETER = "[complex parameter](" + PublicLinks.DEV_MANUAL_JSON_OBJECTS + ")";
    //    public static final String DEV_MANUAL_V580_SBB_PRODUCT_CATEGORY = "[v580 de:Verkehrsmittelkategorien (aka Transmodel or OJP/Siri `VehicleMode`)](" + DEV_MANUAL_ROOT + "business/TransportMode.md)";
}
