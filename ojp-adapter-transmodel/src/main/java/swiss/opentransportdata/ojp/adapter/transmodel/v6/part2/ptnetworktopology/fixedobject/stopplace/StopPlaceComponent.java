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

import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.fixedobject.site.SiteComponent;

/**
 * An element of a STOP PLACE describing part of its structure. STOP PLACE COMPONENTs share common properties for data management, accessibility and other features.
 */
public interface StopPlaceComponent extends SiteComponent {

    /*
     * Label given to SITE COMPONENT.
    String label;
     */

    /*
     * Other MODEs associated with STOP PLACE COMPONENT.
    List<AccessModeEnum> otherModes;
     */

    // @NonNull StopPlace composedBy;

    /*
     * role-name: "primaryFor"
    VehicleMode getVehicleMode();
     */

    // @NonNull StopPlace composedBy;
}
