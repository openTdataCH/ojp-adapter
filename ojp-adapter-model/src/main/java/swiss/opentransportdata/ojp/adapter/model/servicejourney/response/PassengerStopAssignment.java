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

import io.swagger.v3.oas.annotations.media.Schema;
import jdk.jfr.Experimental;
import lombok.Builder;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.fixedobject.flexiblestopplace.FlexibleStopAssignment;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.stopassignment.StopAssignment;

/**
 * Transmodel specialisation of {@link StopAssignment}
 */
@Schema(description = "The allocation of a `ScheduledStopPoint` to a specific `StopPlace` for a `ServiceJourney`, and also possibly a `Quay` and a `BoardingPosition`.")
@Builder
@Value
@Experimental(/*Future use: StopAssignment*/)
public class PassengerStopAssignment implements FlexibleStopAssignment {

}
