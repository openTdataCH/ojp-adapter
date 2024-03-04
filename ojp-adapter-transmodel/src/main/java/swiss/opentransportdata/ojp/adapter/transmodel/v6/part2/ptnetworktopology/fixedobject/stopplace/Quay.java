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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.fixedobject.stopplace;

/**
 * A place such as platform, stance, or quayside where  passengers have access to PT vehicles, Taxi, cars or other means of transportation. A QUAY may serve one or more VEHICLE STOPPING PLACEs and be
 * associated with one or more SCHEDULED STOP POINTS. A QUAY  may contain other sub QUAYs. A child QUAY must be physically contained within its parent QUAY.
 */
public interface Quay extends StopPlaceSpace {

    // TranslatedString destinationDisplay;

    /**
     * Transmodel relation "subzone of": Quay -- in --> [1] Quay / Quay [0..*] <-- Quay
     */
    // List<Quay> subzoneOf; [0..*]
}
