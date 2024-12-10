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

package swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.coupledjourney;

import swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.oc_call.om_call.Call;

/**
 * A part of a VEHICLE JOURNEY created according to a specific functional purpose, for instance in situations when vehicle coupling or separating occurrs.
 *
 * @see Call which is dependent on {@link JourneyPart}
 */
public interface JourneyPart {

    // id

    // description

    // VehicleOrientation

    // OperationalOrientation

    // startTime
    // endTime
}
