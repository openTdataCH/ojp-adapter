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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.stopplace;

import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.site.Site;

/**
 * A place comprising one or more locations where vehicles may stop and where passengers may board or leave vehicles or prepare their trip. A STOP PLACE will usually have one or more wellknown names.
 *
 * @see ch.sbb.ki.journeyservice.b2c.v3.api.place.model.response.StopPlaceDetailed
 */
public interface StopPlace extends Site {

    /*
     * @return Whether STOP PLACE is a border crossing.
     */
    //boolean isBorderCrossingPoint();

    /**
     * Default relative weighting to be used for STOP PLACE.
     */
    Integer getWeighting();

    // from StopPlaceSpace // not used on Station yet, see BoardingAlightingStatus
    // boolean alghtingUse;
    // boolean boardingUse;

    /*
     * A classification for STOP PLACEs (e.g. complex, simple, multimodal, etc).
     */
    // TypeOfStopPlace classification; [0..1]

    /*
     * @return StopPlaceComponent's
     *
    List<StopPlaceComponent> partOf;
     */

    // VehicleMode primaryFor;

    // List<VehicleStoppingPlace> partOf;

    // List<Quay> in; [0..*]

    // List<StopAssignment> for; [0..*]
}
