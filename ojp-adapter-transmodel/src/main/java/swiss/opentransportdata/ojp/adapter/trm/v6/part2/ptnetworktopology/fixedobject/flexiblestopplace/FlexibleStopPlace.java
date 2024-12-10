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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.flexiblestopplace;

import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.stopplace.StopPlace;

/**
 * A specialisation of the STOP PLACE describing a stop of a FLEXIBLE SERVICE. It may be composed of FLEXIBLE AREAs or HAIL AND RIDE AREAs identifying the catchment areas for flexible services (when
 * they use areas or flexible quays). Some FLEXIBLE SERVICE also use regular STOP PLACEs for their stops. When assigned to a SCHEDULED STOP POINT the corresponding SCHEDULED STOP POINT is supposed to
 * be a ZONE (the centroid point of the ZONE being the SCHEDULED STOP POINT).
 */
public interface FlexibleStopPlace extends StopPlace {
    // List<FlexibleQuay>
}
