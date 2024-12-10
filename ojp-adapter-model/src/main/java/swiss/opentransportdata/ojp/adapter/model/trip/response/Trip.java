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

package swiss.opentransportdata.ojp.adapter.model.trip.response;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.schedule.response.OperatingPeriod;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.tripdescription.passengertrip.PTTrip;

/**
 * We think the Transmodel subtypes "PT TRIP", "NON-PT TRIP" and "MIXED TRIP" of "TRIP" with a strong conceptual focus on PLANNING (at creation time) are more confusing than helping with realtime
 * impacts to the originally planned route which might violate the definitions!
 * <p>
 * By decision "Trip" may contain any types of LEGs and therefore understood more generically. (If needed planned TRM type might be added to TripSummary.)
 *
 * @author Peter Hirzel
 * @see <a href="http://www.transmodel-cen.eu/model/index.htm">Trip: Transmodel Part6 - Passenger Information(PI)</a>
 * @see swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.tripdescription.passengertrip.Trip
 * @see PTTrip
 */
@Schema(description = "A customer journey describing the movement of a passenger from one Place of any sort to another. A Trip may consist of one or more consecutive Leg's having some common characteristics.")
@Builder
@Value
public class Trip implements swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.tripdescription.passengertrip.Trip {

    /* Transmodel does inherit -> we ignore this yet (future use, if other Non-PT scenarios are being implemented?)
    @Schema(type = "string", requiredMode = RequiredMode.REQUIRED, description = "Aka (Transmodel PTTrip).")
    @NonNull
    String type = "PTTrip";
     */

    @Schema(description = "TripContext to reconstruct this Trip.",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    String id;

    /**
     * OJP: Trip contains [1..*] TripLeg's where subtypes are: TimedLeg, TransferLeg, ContinuousLeg
     */
    @ArraySchema(minItems = 1, schema = @Schema(/*allOf = {PTRideLeg.class, FootpathLeg.class, TransferLeg.class, RoadLeg.class},*/
        requiredMode = RequiredMode.REQUIRED, description = "List of [1..*] {ordered} legs in specific modes."))
    @NonNull
    List<Leg> legs;

    @Schema(description = "Realtime specific overall status about the `Trip`. Each `PTRideLeg::serviceJourney` will have more detailed infos in its `ServiceAlteration`.",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    TripStatus status;

    @Schema(description = "Relates to `TripMobilityFilter::walkSpeed`, if transfers below 100% were enforced, such Trip's are marked as `fastTransfer` by means passenger needs to hurry to get next vehicle because transfer time is lower than recommended at a StopPlace.",
        requiredMode = RequiredMode.REQUIRED)
    boolean fastTransfer;

    @Schema(description = "Number of interchanges (de:Umstiege) [greater or equal 0].",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    Integer /*prevent -1 defaults*/ transfers;

    /**
     * @see java.time.Duration#parse(CharSequence)
     */
    @Schema(description = "The " + ModelDoc.DURATION + " of the whole trip. The value may be null, if `Trip` is not rideable (for e.g. cancelled).",
        example = ModelDoc.SAMPLE_DURATION)
    String duration;

    // TODO ? Transmodel/OJP  String distance; -> see Trip::distance -> sum(Leg::distance) if all legs have a distance?

    @Schema(description = "Checksum of the trip to filter same results on client side after scroll requests. Relates to `TripResponse::paginationCursor`.",
        example = "fa02b99f_3")
    String pagingChecksum;

    @Schema(description = "A hint/explanation is given if Trip was not found by a direct (first) search. In such a case origin/destination might not match exactly to request parameters."
        + ModelDoc.TRANSLATED_TEXT, example = "Unfortunately, a connection for the desired origin and/or destination could not be found. We recommend the following alternative connections (please note origin/destination).")
    String searchHint;

    @Schema(description = ModelDoc.PARAM_SERVICE_DAYS + " Given for `Trip's` containing `PTRideLeg's`. Set " + ModelDoc.PARAM_INCLUDE_OPERATING_DAYS
        + " for concrete `OperatingPeriod::operatingDays` if needed.",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    List<OperatingPeriod> operatingPeriods;

    // see TripSummaryV2
    @Schema(description = "Overview of most relevant aspects (like rt) of the trip, related to `includeSummary`.")
    TripSummary summary;
}
