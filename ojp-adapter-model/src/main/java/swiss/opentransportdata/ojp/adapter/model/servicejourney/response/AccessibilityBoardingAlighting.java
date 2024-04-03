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
import swiss.opentransportdata.ojp.adapter.model.trip.request.PassengerAccessibilityNeed;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericaccessibility.AccessibilityAssessment;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericaccessibility.AccessibilityLimitation;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.fixedobject.equipmentdescription.localserviceequipment.AssistanceService;

/**
 * Many scenarios for handicaped people on their Journey might be relevant. This part is just about Boarding/Alighting of a Vehicle.
 *
 * @see AccessibilityAssessment
 */
@Builder
@Value
@Schema(description = "Hint for handicaped people at a StopPlace to board or alight a Vehicle on a PTRideLeg. Relates to `forBoarding` and `forAlighting`.")
public class AccessibilityBoardingAlighting implements AssistanceService, AccessibilityLimitation, CorporateIdentity {

    @Schema(description = "The most relevant boarding/alighting accessibility restriction."
        + ModelDoc.HINT_ENUM_EXTENSIBLE + PassengerAccessibilityNeed.ACCESSIBILITY_ENUM_RESPONSE_LIST,
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String limitation;

    @Schema(description = "Textual value for `limitation`." + ModelDoc.TRANSLATED_TEXT,
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String name;

    @Schema(description = "Further description about `limitation` consequences." + ModelDoc.TRANSLATED_TEXT,
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String description;

    @Schema(description = "Contact-details for local assistance service.",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    LinkedText assistanceService;

    @Schema(description = "Icon-identifier to represent the related `limitation`. See " + PublicLinks.CDN_ICON_LINK,
        requiredMode = RequiredMode.REQUIRED /*, example = SBBCorporateIdentityReference.CI_ICON_WHEELCHAIR*/)
    @NonNull
    String corporateIdentityIcon;
}
