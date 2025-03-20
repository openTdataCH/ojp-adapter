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

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.LineString;
import swiss.opentransportdata.ojp.adapter.model.schedule.response.OperatingPeriod;
import swiss.opentransportdata.ojp.adapter.model.situation.response.PTSituation;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusabletimeelements.servicecalendar.OperatingDay;

/**
 * Transmodel:
 * <ul>
 *     <li>A passenger carrying VEHICLE JOURNEY for one specified DAY TYPE.</li>
 *     <li>The pattern of working is in principle defined by a ServiceJourneyPattern.</li>
 * </ul>
 *
 * @author Peter Hirzel
 * @see <a href="https://jmaerki.github.io/OJP/generated/OJP.html#ServiceStatusGroup>OJP ServiceStatus of a DATED VEHICLE JOURNEY</a>
 */
@Schema(description = "A passenger carrying vehicle journey for one specified operation day.")
@Builder
@Value
public class ServiceJourney implements Route, swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.servicejourney.ServiceJourney,
    OperatingDay {

    @Schema(description = ModelDoc.JOURNEY_REFERENCE_DESCRIPTION +
        " Additionally check for `notices` with `Notice::type=" + NoticeType.INFO + /*`, `name= + NoteHelper.NOTE_KEY_INFO_SWISS_JOURNEY_ID*/
        "`, `text=<SwissJourneyId>` for a more standardized permanent " + ModelDoc.LINK_SJYID + " within a planning period.",
        requiredMode = RequiredMode.REQUIRED, example = ModelDoc.SAMPLE_SJYID)
    @NonNull
    String id;

    @Schema(description = "Official operating-day of the related `ServiceJourney`.", requiredMode = RequiredMode.REQUIRED, example = ModelDoc.SAMPLE_DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NonNull
    LocalDate operatingDay;

    @ArraySchema(minItems = 2, schema = @Schema(description = ModelDoc.DESCRIPTION_STOPPOINTS,
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<ScheduledStopPoint> stopPoints;

    @ArraySchema(schema = @Schema(description = ModelDoc.DESCRIPTION_SERVICEPRODUCT,
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<ServiceProduct> serviceProducts;

    @Schema(description = "Status of journey: planned, cancelled, etc.",
        requiredMode = RequiredMode.REQUIRED)
    @NonNull
    ServiceAlteration serviceAlteration;

    @ArraySchema(schema = @Schema(description = "Notice's relevant for end-user or related backends, such as ticketing or reservation systems.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<Notice> notices;

    /**
     * see {@link swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.situation.ptsituation.PTSituationConsequenceScope}
     */
    @ArraySchema(schema = @Schema(description = "An extent impacted by the PT situation-consequence (for e.g. construction sites) on the `ServiceJourney` resp. `ServiceProduct` (aka HIM)."
        + " Such messages have rather describing character and should not impact routing.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<PTSituation> situations;

    /**
     * By design we decide to implement it on ServiceJourney, though on DatedVehicleJourney might be enough.
     * This is owed to future model change prevention and alternate routers such as OJP.
     */
    @ArraySchema(schema = @Schema(description = ModelDoc.PARAM_SERVICE_DAYS + " Given typically in case `DatedVehicleJourney`.",
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<OperatingPeriod> operatingPeriods;

    /**
     * @see ScheduledStopPoint#getArrival() resp. {@link StopCall#getQuayAimed()}
     * @see ScheduledStopPoint#getDeparture() resp. {@link StopCall#getQuayAimed()}
     * @see #getQuayTypeShortName()
     */
    @Schema(type = "string", description = "Depending on a train, ship or whatever Vehicle there is a specific terminology for its appropriate quay-name. " +
        "Since all `stopPoints` are passed by the same Vehicle this translation is usable for all `ScheduledStopPoint::*Quay*` contained by this `ServiceJourney`. " +
        "See related `quayTypeShortName` for an abbreviated translation."
        + ModelDoc.TRANSLATED_TEXT,
        example = "Gleis")
    String quayTypeName;

    @Schema(type = "string", description = "Abbreviation for related `quayTypeName`." + ModelDoc.TRANSLATED_TEXT,
        example = "Gl.")
    String quayTypeShortName;

    // [0..*] by (Specialcase: de:Ringzug)
    @ArraySchema(schema = @Schema(description = ModelDoc.DIRECTION_DESCRIPTION,
        requiredMode = RequiredMode.REQUIRED))
    @NonNull
    List<Direction> directions;

    @Schema(description = "Represents a plottable polyline of a (partial) ServiceJourney track (aka LegTrack, de:Streckenverlauf). Projections are a mathematical transformation that take spherical coordinates (latitude and longitude) and transform them to an XY (planar) coordinate system. This enables you to create a map that more or less accurately shows the track of a PT journey vehicle. and relates to `includeRouteProjection`.")
    LineString spatialProjection;

    /*
     * TODO NoteKeyAttribute::CO/CI
     * List<CheckConstraint>
     */
}
