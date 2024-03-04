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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.servicejourney;

import swiss.opentransportdata.ojp.adapter.transmodel.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.vehiclejourney.VehicleJourney;

/**
 * A passenger carrying VEHILE JOURNEY for one specified DAY TYPE. The pattern of working is in principle defined by a SERVICE JOURNEY PATTERN.
 * <p>
 * The work of the vehicles necessary to provide the service offer advertised to the public consists of SERVICE JOURNEYs. DEAD RUNs are unproductive VEHICLE JOURNEYs necessary to transfer vehicles
 * where they are needed, mainly from the depot into service and vice versa (Service Journey Model).
 */
public interface ServiceJourney extends VehicleJourney {

    // DirectionTypeEnum directionType;

    /*
     * Status to journey - planned, cancelled, etc.
     *
    ServiceAlterationEnum serviceAlteration;
     */

    // When this journey should be visible to public in Dynamic channels.
    // Dynamic

    // Print
}
