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

package swiss.opentransportdata.ojp.adapter.model.standards;

/**
 * UX "single source of truth" for Icons:
 * <ul>
 *     <li>sbb.ch uses the official Icon-CDN.</li>
 *     <li>SBB Mobile uses Icons from Figma (base of Icon CDN) and downloads (and distributes by App).</li>
 *     <li>Other channels may decide on their own whether they want to use CDN direcly download the catalog and distribute.</li>
 * </ul>
 */
public interface CorporateIdentity {

    /**
     * @return name of icon-name within SBB Corporate-Identity catalog
     * @see <a href="https://www.figma.com/file/UQBd7cHKav0hr9oXYp7opJ/SBB-Icons?node-id=395%3A2952&t=ad26LgREBbTANSK5-1">FIGMA Icons for e.g. Train SBB_oev_b_t02</a>
     * @see <a href="https://digital.sbb.ch/de/brand_elemente/fahrplan-icons">Fahrplan-Icons (für die App&Web, u.a. die Linensymbolen)</a>
     * @see <a href="https://digital.sbb.ch/de/brand_elemente/piktogramme">Piktogramme (physisch am Bahnhof und im Zug, oft blau)</a>
     */
    String getCorporateIdentityIcon();
}
