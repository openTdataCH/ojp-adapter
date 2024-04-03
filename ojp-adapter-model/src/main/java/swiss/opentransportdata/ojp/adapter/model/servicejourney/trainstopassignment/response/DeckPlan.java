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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.trainstopassignment.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

/**
 * @see <a
 *     href="https://sbb.sharepoint.com/:x:/r/sites/fps/_layouts/15/Doc.aspx?sourcedoc=%7B37A3810C-B53B-44A2-ACE6-A6FF3DD6ABB6%7D&file=Matching%20Fahrzeugtyp_Zugtyp_2023_02_16.xlsx&action=default&mobileredirect=true&cid=94d4b21a-de77-4ffa-a862-08a67dc78928">Sharepoint
 *     Daten</a>
 */
@Schema(description = "Plan of the build plan of vehicle-type such as a car (data quality might not be guaranted properly for all `TrainElement's`).")
@Builder
@Value
public class DeckPlan {

    /**
     * FAHRZEUG_ZBP
     */
    @Schema(description = "Vehicle-type resp. technical expression of a physical `TrainElement` (car, wagon) within a `CompoundTrain` (aka de:FahrzeugType gemäss Zugbildungsplan (ZBP)), source CERES."
        +
        "(On `TrainElement` always given, but not guaranteed on `CompoundTrain`.)", example = "RABe533_SBB")
    @JsonProperty
    String typeTechnical;

    /**
     * Fahrzeug / Zugtyp
     */
    @Schema(description = "Popular train-model like 'Dosto', 'Domino', 'ICN', .. Relates to `typeTechnical`.", example = "Flirt")
    @JsonProperty
    String typeAdvertised;

    @Schema(description = "Related to `typeAdvertised`. Specialized sub-site of [unsere Züge](https://www.sbb.ch/de/bahnhof-services/waehrend-der-reise/unsere-zuege.html), " +
        "[über uns - Flotte](https://www.bls.ch/de/unternehmen/ueber-uns/flotte#/), " +
        "[Fahrzeuge - Flotte](https://www.sob.ch/dienstleistungen/fahrzeuge/flotte).",
        example = "https://www.sbb.ch/de/bahnhof-services/waehrend-der-reise/unsere-zuege/flirt.html")
    @JsonProperty
    String typeAdvertisedLink;

    /**
     * Zugkategorie
     */
    @Schema(description = "May contain a concrete descrpition of about how many decks (aka floors) a car may provide." /*TODO ? +ServiceDoc.TRANSLATED_TEXT*/,
        example = "Regionalverkehrszug, einstöckig")
    @JsonProperty
    String buildCategory;
}
