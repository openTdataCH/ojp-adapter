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

package swiss.opentransportdata.ojp.adapter.service.opentransportdata.transportmode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import swiss.opentransportdata.ojp.adapter.model.standards.CorporateIdentity;

/**
 * BE AWARE: J-A proprietary values (historical weakness!), but related to:
 * <ul>
 *   <li>v580 Categories (de:Verkehrsmittelkategorien (VM-Kat), Gattungen).</li>
 *   <li>TAP-TSI/UIC contains a sensible subset of SIRI Transport Modes</li>
 *   <li>siri:VehicleModesOfTransportEnumeration</li>
 * </ul>
 * <p>
 * see {@link swiss.opentransportdata.ojp.adapter.model.servicejourney.response.VehicleMode}
 * <p>
 * de: Die Datenhoheit auch bezüglich Gattungen liegt alleine bei der TU. Die V580 ist eine Empfehlung ab Fahrplanwechsel 2020 und keine Pflicht, wenn die Pilatus Bahn entscheiden sollte ihre Züge
 * weiter als R Züge statt als Zahnradbahn zu liefern, müssen wir es so abbilden. Wir dürfen diese Info nicht aus Eigeninitiative mittels Mapping Tabelle umdefinieren.
 * <p>
 *
 * @see <a href="https://www.allianceswisspass.ch/de/tarife-vorschriften/uebersicht/V580/Produkte-der-V580-FIScommun-1">V580 - FIScommun 06 Harmonisierung Verkehrsmittel</a>
 * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste">list Transportmodes</a>
 */
@Slf4j
@Deprecated
public enum VehicleType implements CorporateIdentity {
    /**
     * Transmodel VehicleMode::train/rail
     * <p>
     * see ProductCategory
     * <p>
     * V580 Angebotskategorien: Innerhalb der Verkehrsmittelkategorie 'Zug' sind folgende Angebotskategorien erlaubt:
     * <ul>
     *  <li>EC EuroCity</li
     *  <li>EN EuroNight</li>
     *  <li>IC InterCity</li>
     *  <li>IR InterRegio</li>
     *  <li>RE RegioExpress</li>
     *  <li>R Regio</li>
     *  <li>S S-Bahn</li>
     *  <li>SN Nacht-S-Bahn</li>
     *  <li>PE PanoramaExpress</li>
     *  <li>ATZ Autotunnelzug Zug mit Autobeförderung. Beispiel Lötschberg, Vereina oder Brig-Iselle</li>
     *  <li>XT Extrazug Züge die für einen speziellen Anlass verkehren. Evtl. mit Beförderungshinweis = Spezialbillett</li>
     * </ul>
     * <p>
     * Weiter sind Marketingnamen möglich, bspw. PE PanoramaExpress
     * <p>
     * Bei den europäischen Transportunternehmen, insbesondere bei den Bahnen, existieren eine Vielzahl
     * von weiteren Angebotskategorien. Diese werden für den ÖV Schweiz direkt so übernommen. Die
     * folgende Tabelle zeigt solche Angebotskategorien der Nachbarstaaten:
     * <ul>
     * <li>ICE InterCityExpress</li>
     * <li>TGV Train à grande vit.</li>
     * <li>RJ Railjet</li>
     * <li>TE2 TER200</li>
     * <li>TER TER</li>
     * <li>RB Regionalbahn</li>
     * <li>IRE InterRegioExpress</li>
     * <li>...</li>
     * </ul>
     */
    TRAIN,
    /**
     * Transmodel VehicleMode::bus
     * <p>
     * V580 Bus
     * <ul>
     *     <li>CAX Fernbus international Angebotskategorie für Fernbusse, welche die Landesgrenzen überschreiten. Firmen-Namen wie Flixbus können als Marketingname übertragen werden.</li>
     * <li>CAR Fernbus national Angebotskategorie für nationale Fernbusse.
     * Firmen-Namen können als Marketingname übertragen
     * werden.</li>
     * <li>EXB Expressbus Schnellbus = Expressbus</li>
     * <li>B Bus</li>
     * <li>BN Nachtbus Daneben Marketingname möglich, z.B. Nachtbus «Moonliner», Liniennr. M5</li>
     * <li>RUB Rufbus Verkehrt nicht nach Fahrplan, sondern bei Bedarf nach
     * telefonischer Voranmeldung. Es gibt dabei verschiedene
     * Ausprägungen von völliger Flexibilität bis hin zu definierten Abfahrtszeiten, aber freier Routenwahl.</li>
     * <li>BP PanoramaBus Längere Fahrten in touristisch interessantem Gebiet,
     * siehe Kapitel 4.1.1. Abkürzung BP = bus panoramique</li>
     * </ul>
     */
    BUS,
    /**
     * V580 T (de:Tram, en:Tramway british), TN (Nachttram)
     * <p>
     * Opentransportdata: Tramway
     */
    TRAMWAY,
    /**
     * Transmodel VehicleMode::ferry/ship
     * <p>
     * V580 BAT Schiff (Linienbetrieb), FAE Fähre (Pendelbetrieb)
     */
    BOAT,
    /**
     * V580: FUN de:Standseilbahn (for e.g. Gurtenbahn), en:Funicular
     * <p>
     * Opentransportdata transportmode "Cableway"
     */
    FUNICULAR /*breaking change CABLEWAY*/,
    /**
     * Cableway (PB Pendelbahn, GB Gondelbahn)
     * <p>
     * V580: de:Kabinenbahn (Das Piktogramm «Kabinenbahn» wird durch Alliance SwissPass und nicht in der Signaletik SBB geführt.), en: Gondola
     * <ul>
     *     <li>PB Pendelbahn</li>
     *     <li>GB Gondelbahn</li>
     * </ul>
     * Die Verkehrsmittelkategorie Kabinenbahn umfasst die beiden Angebotskategorien Pendelbahn sowie
     * Gondelbahn (Kapitel 5.2) und wurde aus folgenden Gründen geschaffen:
     * <ul>
     *     <li>Abgrenzung Kabinenbahn zur Standseilbahn: Die Unterscheidung zwischen Standseilbahn (Seil unten, Schienen) und Kabinenbahn (Seil oben, Trageseil) ist ein wichtiges Orientierungsmerkmal für den Fahrgast, welches durchgängig über die Reisekette angegeben werden soll.</li>
     * <li>Abgrenzung Kabinenbahn zur Sesselbahn: Unterscheidung wettergeschützt zu potenziell nicht wettergeschützt.</li>
     * </ul>
     */
    CABLEWAY /*breaking change GONDOLA*/,
    /**
     * V580: SL de:Sesselbahn, en:Chairlift
     */
    CHAIRLIFT,
    /**
     * Transmodel VehicleMode::metro
     * <p>
     * V580 M (Metro)
     * <p>
     * Be aware: P-Data-Mgmt given as TRAMWAY
     */
    METRO,
    /**
     * v580 CC fr:Chemin de fer à crémaillère, de: Zahnradbahn, en: Cogwheel Railway
     */
    COG_RAILWAY,
    /**
     * v580:
     * <ul>
     *     <li>Buslinien, welche teilweise oder abends durch Taxifahrzeuge gefahren werden, werden ebenfalls als Angebotskategorie Bus angeben. Die Spezialitäten («Taxi», «Abendtaxi», «spezieller Abfahrtsort» sind auf der Fahrtebene durch Informationen resp. Angebotshinweise anzugeben.</li>
     *     <li>Die Bedeutung des offiziellen Piktogrammes «Taxi» steht einzig für Privatfahrten und wird im öffentlichen Verkehr nicht verwendet.</li>
     *     <li>Abk. INFO+ "TX"</li>
     * </ul>
     * <p>
     * Remark: trainsearch found hits by Hafas.
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/verkehrsmittellisten/resource/88959f54-b8be-488d-887b-4b4b00cb2573>Not in OpentransportData.swiss or UNKNOWN</a>
     */
    TAXI,
    /**
     * Elevator de:Aufzug, en:Elevator
     * <p>
     * V580: ASC Aufzug
     * <p>
     * Opentransportdata: Elevator
     */
    LIFT /*breaking change ELEVATOR*/,
    /**
     * V580 de:Flugzeug, en:Airplane
     * <p>
     * TAP TSI "Plane"
     */
    AIRPLANE;

    /**
     * V580 transport sub-modes (aka de:Gattung, Zugart)
     *
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/cf87d908-0f4c-4bd6-badf-7ca14de82f04>Opendata.ch Transport Submodes</a>
     */
    private static final Set<String> SUB_MODES_OF_TRAIN = Set.of(
        "ARC", "ARZ", "AT", "ATZ", "AVE", // obsolete: "ATR",
        "CAT", // obsolete: "CNL",
        "D",
        "E", "EC", "EM", "EN", "EST", "EXT", // obsolete:  "ES",
        "FA", "FB", "FLX", "FR",
        "IC", "ICE", "ICN", "IN", "IR", "IRE", "IT",
        // obsolete: "L",
        "NJ", "NZ",
        "OGV",
        "P", "PE",
        "R", "RB", "RE", "RER", "RJ", "RJX",
        "S", "SN", // obsolete: "STB",
        "TAL", "TER", "TGV", "THA", "TLK", // obsolete: "TE2",
        "UEX", "UUU",
        // obsolete: "VAE",
        "WB",
        "X2",
        // generic fallback
        "ZUG"
    );
    private static final Set<String> SUB_MODES_OF_BUS = Set.of(
        "B", "BN", "BP",
        "CAR", "CAX",
        "EV", "EXB", // obsolete:  "EB",
        "ICB",
        "KB",
        // obsolete: "NFB", "NFO",
        "RUB",
        // obsolete:  "X"
        // generic fallback
        "BUS"
    );
    private static final Set<String> SUB_MODES_OF_TRAMWAY = Set.of(
        // obsolete: "NFT",
        "STB",
        "T", "TN"
    );
    private static final Set<String> SUB_MODES_OF_BOAT = Set.of(
        "BAT", // obsolete: "BAV",
        "FAE",
        "KAT"
    );
    private static final Set<String> SUB_MODES_OF_METRO = Set.of("M");
    private static final Set<String> SUB_MODES_OF_FUNICULAR = Set.of("FUN");
    private static final Set<String> SUB_MODES_OF_CABLEWAY = Set.of("GB", "LB", "PB");
    private static final Set<String> SUB_MODES_OF_CHAIRLIFT = Set.of("SL");
    private static final Set<String> SUB_MODES_OF_COG_RAILWAY = Set.of("CC");
    private static final Set<String> SUB_MODES_OF_TAXI = Set.of("TX");
    private static final Set<String> SUB_MODES_OF_LIFT = Set.of("ASC");
    private static final Set<String> SUB_MODES_OF_AIRPLANE = Set.of("AIR");

    /**
     * Relevant for SBB Mobile until migrated to J-S!
     *
     * @deprecated strategically do not manage hardcoded business data in VehicleModeConverter or VehicleTypeHelper should treat such data in a better way
     */
    @Deprecated
    private static final Map<String, VehicleType> vehicleSubModeToType = new HashMap<>();

    static {
        addVehicleSubModes(TRAIN, SUB_MODES_OF_TRAIN);
        addVehicleSubModes(BUS, SUB_MODES_OF_BUS);
        addVehicleSubModes(TRAMWAY, SUB_MODES_OF_TRAMWAY);
        addVehicleSubModes(BOAT, SUB_MODES_OF_BOAT);
        addVehicleSubModes(METRO, SUB_MODES_OF_METRO);
        addVehicleSubModes(FUNICULAR, SUB_MODES_OF_FUNICULAR);
        addVehicleSubModes(CABLEWAY, SUB_MODES_OF_CABLEWAY);
        addVehicleSubModes(CHAIRLIFT, SUB_MODES_OF_CHAIRLIFT);
        addVehicleSubModes(COG_RAILWAY, SUB_MODES_OF_COG_RAILWAY);
        addVehicleSubModes(TAXI, SUB_MODES_OF_TAXI);
        addVehicleSubModes(LIFT, SUB_MODES_OF_LIFT);
        addVehicleSubModes(AIRPLANE, SUB_MODES_OF_AIRPLANE);
    }

    private static void addVehicleSubModes(VehicleType vehicleType, Set<String> vehicleSubModes) {
        for (String vehicleSubMode : vehicleSubModes) {
            vehicleSubModeToType.put(vehicleSubMode, vehicleType);
        }
    }

    /**
     * @param productSubCategoryShortName short sub-category name of ProductType:getSubCategoryShort() (Hafas field catOutS) for e.g. "IC"
     * @return defaults to TRAIN if not found
     */
    @NonNull
    public static VehicleType findByProductCategoryShortName(@NonNull String productSubCategoryShortName) {
        final VehicleType matchingVehicleType = vehicleSubModeToType.get(productSubCategoryShortName);

        if (matchingVehicleType == null) {
            // perhaps change by Data-Mgmt or v580 namings, or not requested by PO yet
            log.warn("productCategoryShorName={} not mapped yet -> assume: {}", productSubCategoryShortName, TRAIN);
            return TRAIN;
        }
        return matchingVehicleType;
    }

    /**
     * @param productSubCategoryShortName short sub-category name of ProductType:getSubCategoryShort() (Hafas field catOutS) for e.g. "IC"
     * @return defaults to null if not found
     */
    public static VehicleType findByProductSubCategoryShortName(@NonNull String productSubCategoryShortName) {
        return vehicleSubModeToType.get(productSubCategoryShortName);
    }

    private static final String TRAIN_ICON_SUFFIX = "t02";
    private static final String BUS_ICON_SUFFIX = "t06";
    private static final String TRAMWAY_ICON_SUFFIX = "t04";
    private static final String BOAT_ICON_SUFFIX = "t12";
    private static final String METRO_ICON_SUFFIX = "r";
    private static final String CABLEWAY_ICON_SUFFIX = "t22";
    private static final String CHAIRLIFT_ICON_SUFFIX = "t25";
    private static final String FUNICULAR_ICON_SUFFIX = "t21";
    private static final String COG_RAILWAY_ICON_SUFFIX = "r";
    private static final String TAXI_ICON_SUFFIX = "t29";
    private static final String LIFT_ICON_SUFFIX = "lift";
    private static final String AIRPLANE_ICON_SUFFIX = "t10";

    /**
     * @deprecated use TransportModeData.getCorporateIdentityIcon(VehicleModeEnum)
     */
    @Deprecated(since = "4.4.4")
    @NonNull
    @Override
    public String getCorporateIdentityIcon() {
        switch (this) {
            case TRAIN:
                return "SBB_oev_b_" + TRAIN_ICON_SUFFIX;
            case BUS:
                return "SBB_oev_b_" + BUS_ICON_SUFFIX;
            case TRAMWAY:
                return "SBB_oev_b_" + TRAMWAY_ICON_SUFFIX;
            case BOAT:
                return "SBB_oev_b_" + BOAT_ICON_SUFFIX;
            case METRO:
                return "SBB_oev_metro_" + METRO_ICON_SUFFIX;
            case CABLEWAY:
                return "SBB_oev_b_" + CABLEWAY_ICON_SUFFIX;
            case CHAIRLIFT:
                return "SBB_oev_b_" + CHAIRLIFT_ICON_SUFFIX;
            case FUNICULAR:
                return "SBB_oev_b_" + FUNICULAR_ICON_SUFFIX;
            case COG_RAILWAY:
                return "SBB_oev_zahnradbahn_" + COG_RAILWAY_ICON_SUFFIX;
            case TAXI:
                return "SBB_oev_b_" + TAXI_ICON_SUFFIX;
            case LIFT:
                return "SBB_oev_" + LIFT_ICON_SUFFIX;
            case AIRPLANE:
                return "SBB_oev_b_" + AIRPLANE_ICON_SUFFIX;
            default:
                // should not happen
                log.warn("developer fault: not mapped icon: {}", this);
                return "SBB_oev_b_" + TRAIN_ICON_SUFFIX;
        }
    }
}
