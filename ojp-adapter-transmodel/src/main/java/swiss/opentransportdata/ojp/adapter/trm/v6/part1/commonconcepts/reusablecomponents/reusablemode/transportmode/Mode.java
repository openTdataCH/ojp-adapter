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

package swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusablemode.transportmode;

import lombok.NonNull;

/**
 * Any means of transport.
 * <p>
 * Transmodel takes into account a variety of Public Transport MODEs (characterisation of the public transport operation according to the means of transport (bus, tram, metro, train, ferry, ship)). A
 * distinction is made between VEHICLE MODE and ACCESS MODE. The concept of MODE is refined into SUBMODE, a variant of a MODE, as for instance international or domestic rail (rail being the MODE).
 */
public interface Mode {

    /**
     * Identifier of TRANSPORT MODE.
     */
    @NonNull
    String getId();

    /*
     * Name of MODE.
     *
     * [0..1]
     *
     MultilingualString name;
     */

    /*
     * role: classified as
     *
     * List<Submode> getSubmodes();
     */
}