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

package swiss.opentransportdata.ojp.adapter.model.servicejourney.response;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.PublicLinks;
import swiss.opentransportdata.ojp.adapter.model.standards.CorporateIdentity;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.vehiclejourney.TypeOfProductCategory;

/**
 * Aka TransportMode, and be aware TAP-TSI/UIC contains a sensible subset of SIRI Transport Modes.
 *
 * @see <a href="https://www.allianceswisspass.ch/de/asp/Downloadsindex.php?section=downloads&download=14462">V580 - FIScommun 06 Harmonisierung Verkehrsmittel</a>
 * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste">list Transportmodes</a>
 * @see swiss.opentransportdata.ojp.adapter.model.trip.request.TransportModeEnum
 */
@Schema(description = "A characterisation of the public transport operation according to the means of transport (aka OJP PtMode; Siri::VehicleMode; v580 TransportMode or de:Verkehrsmittelkategorie). "
    + "Whether only `id` is given or submode as well depends on available data.")
@Builder
@Value
public class VehicleMode implements swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusablemode.transportmode.VehicleMode, CorporateIdentity {

    public static final String VEHICLEMODEENUM_TRAIN = "TRAIN";

    /**
     * Id according to v580 Transport-Mode (de:Verkehrsmittelkategorie), which is provided by OpentransportData transportmodes.csv in column 'EN' converted as UPPERCASE.
     *
     * @see <a href="https://www.allianceswisspass.ch/de/tarife-vorschriften/uebersicht/V580/Produkte-der-V580-FIScommun-1">06 Harmonisierung Verkehrsmittel</a>
     * @see <a href="https://opentransportdata.swiss/de/dataset/vm-liste/resource/4c2b3347-5254-4c42-bcee-07704acfac79>transportmodes.csv column en ~UPPERCASE</a>
     */
    @Schema(type = "string", description = ModelDoc.VEHICLEMODE_ID,
        requiredMode = RequiredMode.REQUIRED, example = VEHICLEMODEENUM_TRAIN)
    @NonNull
    String /*JsonExtensibleEnum*/ id;

    // oversteering: Translatable#getTranslation(Locale) by Trandmodel property-name
    @Schema(type = "string", description = "Translation of related `id` (according to Accept-Language and " + ModelDoc.LINK_OPENTRANSPORTDATA_SERVICEPRODUCT + " language column)."
        + ModelDoc.TRANSLATED_TEXT,
        requiredMode = RequiredMode.REQUIRED, example = "Zug")
    @NonNull
    String name;

    /**
     * @see ServiceProduct#getCorporateIdentityIcon()
     */
    @Schema(description = "Icon-identifier to represent the related `id` (rough main mode like TRAIN, BUS, ..). See " + PublicLinks.CDN_ICON_LINK,
        requiredMode = RequiredMode.REQUIRED, example = "SBB_oev_b_t02" /* TODO new pictogram*/)
    @NonNull
    String corporateIdentityIcon;

    /**
     * @see #getName() main Mode
     * @see #getVehicleSubModeShortName()
     */
    @Schema(description = "Long, displayable submode (aka de:Gattung) related to (main) mode `id`. See " + PublicLinks.DEV_MANUAL_V580_SBB_PRODUCT_CATEGORY,
        type = "string", example = "InterCity")
    String vehicleSubModeName;

    /**
     * EFZ and P-Data-Mgmt specific.
     * <p>
     * OJP: ProductCategory, ProductCategoryRef (NeTEx)
     * <p>
     * Depends on search parameter {@link swiss.opentransportdata.ojp.adapter.model.trip.request.TransportModeEnum}
     *
     * @see TypeOfProductCategory
     * @see #getVehicleSubModeName()
     */
    @Schema(description = "Short version of related `vehicleSubModeName`.",
        type = "string", example = "IC")
    String vehicleSubModeShortName;
}
