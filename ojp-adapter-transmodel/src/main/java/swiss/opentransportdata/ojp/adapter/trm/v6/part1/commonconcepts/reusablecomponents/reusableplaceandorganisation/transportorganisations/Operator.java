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

package swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusableplaceandorganisation.transportorganisations;

import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.responsibility.genericorganisation.Organisation;

/**
 * A company providing public transport services.
 */
public interface Operator extends /*TODO TRM6+2022 extends from TransportOrganisation*/ Organisation {

    /**
     * @return Identifier of  OPERATOR.
     */
    String getId();

    /*
     * Primary TRANSPORT MODE of ORGANISATION.
     *
    primaryMode
     */

    // List<Department> ownedBy;

    // List<Authority> orderingPtServicesFrom;
}
