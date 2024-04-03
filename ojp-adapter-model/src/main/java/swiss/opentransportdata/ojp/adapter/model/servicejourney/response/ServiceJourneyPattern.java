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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.response;

import lombok.NonNull;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern.JourneyPattern;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part3.timinginformationandvehiclescheduling.datedjourney.DatedVehicleJourney;

/**
 * Essential pattern for a (partial) Public Transport (PT) journey by a specific vehicle.
 * <p>
 * Conventions (tricky!!!):
 * <ul>
 *     <li>We consider {@link JourneyPattern} a core element in PT routing!</li>
 *     <li>We design our own pragmatic specialisation of {@link swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ServiceJourneyPattern} which inherits from {@link JourneyPattern}.</li>
 *     <li>A {@link JourneyPattern} relates to {@link DatedVehicleJourney} which is essential in OJP DatedJourney.</li>
 * </ul>
 *
 * @author Peter Hirzel
 * @see JourneyPattern
 * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ServiceJourneyPattern
 * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.servicejourney.ServiceJourney
 * @see DatedVehicleJourney
 */
public interface ServiceJourneyPattern extends swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.servicepattern.ServiceJourneyPattern {

    @NonNull
    ServiceJourney getServiceJourney();
}
