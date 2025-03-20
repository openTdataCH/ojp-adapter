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

/**
 * A characterisation of the public transport operation according to the means of transport (bus, tram, metro, train, ferry, ship). Or (air, rail, bus, coach, metro, ..)
 * <p>
 * v580 categories (de:Verkehrsmittelkategorien (VM-Kat))
 * <p>
 * de:Im ÖV Schweiz gilt der Grundsatz, dass nationale Vorgaben und Normen immer im internationalen Kontext abgestimmt werden müssen. So ist auch die Einteilung von Verkehrsmitteln nicht nur in der
 * Schweiz ein Thema, sondern auch international. In Europa sind die zwei hier vorgestellten Normenwerke relevant. Um einen problemlosen internationalen und interoperablen Datenaustausch gewährleisten
 * zu können, lohnt es sich die vorgeschlagene Struktur den beiden bestehenden internationalen Normen NeTEx (Network Exchange - CEN-TS 16441) und TAF TAP (technical specifications for interoperability
 * telematics applications for passenger services) gegenüber zu stellen. Des Weiteren referenziert NeTEx auf TPEG (Transport Protocol Experts Group) und somit indirekt auf SIRI (Service interface for
 * real‐time information - CEN/TS 15531), das ebenfalls auf TPEG referenziert.
 */
public interface VehicleMode extends Mode {
    // VehicleType belongingTo;

    // List<StopPlaceComponent/StopPlace> characterizedBy;
}