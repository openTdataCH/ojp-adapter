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

package swiss.opentransportdata.ojp.adapter.model.trip.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.PublicLinks;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse;
import swiss.opentransportdata.ojp.adapter.model.utils.LocalTimeToHourMinuteSerializer;
import swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.tripquery.TripRequestFilter;

/**
 * Request-filter v3.
 *
 * @author u210875 (Peter Hirzel)
 * @since 2.26.0
 */
@Schema(description = ModelDoc.HINT_GET_BY_POST + "RequestBody containing search filter params.")
@Data
@NoArgsConstructor
@ToString
public class TripsByOriginAndDestinationRequestBody implements JsonResponse, /*RequestBody,*/ TripRequestFilter {

    public static final String ECO_DEFAULT = "DEFAULT";
    public static final String ECO_NONE = "NONE";

    /**
     * Default length in [m] for a footpath to/after a stop-place.
     */
    public static final int DEFAULT_WALK_RADIUS = 1500;

    /*-------------------------------------------------------------------------
     * Routing relevant parameters!
     */

    /**
     * The first point of a {@link swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern.JourneyPattern} is the origin.
     *
     * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.tripquery.TripOriginPlace
     */
    @Schema(description = "Starting point of the trip at origin (departure). See v3 **PlaceReference** in " + PublicLinks.DEV_MANUAL_HINT_COMPLEX_PARAMETER,
        type = "string",
        requiredMode = RequiredMode.REQUIRED,
        example = "8503000")
    @NonNull
    String origin;

    /**
     * The last point of a {@link swiss.opentransportdata.ojp.adapter.transmodel.v6.part2.ptnetworktopology.tacticalplanningcomponents.journeypattern.JourneyPattern} is the destination.
     *
     * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.tripquery.TripDestinationPlace
     */
    @Schema(description = "Ending point of the trip at destination (arrival). See **PlaceReference** in " + PublicLinks.DEV_MANUAL_HINT_COMPLEX_PARAMETER,
        type = "string",
        requiredMode = RequiredMode.REQUIRED,
        example = "[7.435194,46.945679]")
    @NonNull
    String destination;

    @Schema(description = "Tolerated walk distance (radius [m]) at `Place` origin (departure). Default is " + DEFAULT_WALK_RADIUS,
        example = "800")
    Integer originRadius;

    @Schema(description = "Tolerated walk distance (radius [m]) at `Place` destination (arrival). Default is " + DEFAULT_WALK_RADIUS,
        example = "1500")
    Integer destinationRadius;

    public static final Boolean DEFAULT_FOR_ARRIVAL = Boolean.FALSE;
    @Schema(description = "Search for arriving (true) or departing (false) trips.",
        defaultValue = "false", type = "boolean")
    Boolean forArrival;

    public static final Supplier<LocalDate> DEFAULT_DATE = LocalDate::now;
    @Schema(description = "(Local) date at either origin (`forArrival`=false) or destination (`forArrival`=true) related to `time`, " +
        ModelDoc.DEFAULT_DATE_TODAY + ".",
        format = "date", example = ModelDoc.SAMPLE_DATE)
    @DateTimeFormat(iso = ISO.DATE)
    LocalDate date;

    public static final Supplier<LocalTime> DEFAULT_TIME = LocalTime::now;
    @Schema(description = "Local time at either origin (`forArrival`=false) or destination (`forArrival`=true) related to `date`, " +
        ModelDoc.DEFAULT_TIME_NOW + " (seconds will be ignored).",
        type = "string", format = "time", example = ModelDoc.SAMPLE_TIME)
    @DateTimeFormat(iso = ISO.TIME)
    @JsonSerialize(using = LocalTimeToHourMinuteSerializer.class)
    LocalTime time;

    //    public static final OccupancyAverageEnum DEFAULT_OCCUPANCY_AVERAGE = OccupancyAverageEnum.ALL;
    //    @Schema(description = "Find trips with average occupancy (or better, by means emptier) per passenger-class in Public Transportation vehicle." + ServiceDoc.HINT_ENUM_EXTENSIBLE,
    //        defaultValue = OccupancyAverageEnum.ALL_AS_STRING)
    //    OccupancyAverageEnum occupancyAverage;

    @Schema(description = "Aka OJP TripMobilityFilter.")
    TripMobilityFilter mobilityFilter;

    // https://github.com/swagger-api/swagger-codegen/issues/9433
    @ArraySchema(schema = @Schema(description = "Enforce Via routing over a specific StopPlace (might involve additional transfers), see [PTViaReference JSON param](" + PublicLinks.DEV_MANUAL_ROOT
        + "JSON-Objects.md#ptviareference)." + " Relates to `includeTransportModes`."))
    List<PTViaReference> vias;

    //    @ArraySchema(schema = @Schema(description = ApiDocumentationV3.PT_VIA_NOT_DESCRIPTION))
    //    List<PTViaNotReference> viasNot;

    //    @ArraySchema(schema = @Schema(description = "Enforce routing without a transfer at via `StopPlace?, see [PTViaReference JSON param](" + PublicLinks.DEV_MANUAL_ROOT
    //        + "JSON-Objects.md#ptvianochangeatreference)."))
    //    List<PTViaNoChangeAtReference> viasNoTransfer;

    //    public static final RealtimeModeEnum DEFAULT_REALTIME_MODE = RealtimeModeEnum.REALTIME;
    //    /**
    //     * Transmodel {@link TripRequestPolicy} ::useRealTime
    //     */
    //    @Schema(description = ApiDocumentationV3.DESCRIPTION_REALTIME_MODES, defaultValue = RealtimeModeEnum.REALTIME_AS_STRING)
    //    RealtimeModeEnum realtimeMode;

    /**
     * FPLJS-897
     *
     * @see swiss.opentransportdata.ojp.adapter.model.trip.response.TripResponse#getPaginationCursor()
     * @see TripsByOriginAndDestinationRequestBody#getPagingCursor()
     */
    @Schema(description = ModelDoc.DESCRIPTION_PAGING_CURSOR)
    String pagingCursor;

    //    @Schema(description = "Configure the search algorithm influencing Trip search results.")
    //    OptimisationMethod optimisationMethod;

    /*-------------------------------------------------------------------------
     * Optional, additional data includes in response!
     */

    //    public static final AccessibilityEnum DEFAULT_INCLUDE_ACCESSIBILITY = AccessibilityEnum.ALL;
    //    /**
    //     * Depends on {@link ch.sbb.ki.journeyservice.base.exchange.Grant#DENY_ACCESSIBILITY}
    //     *
    //     * @see TripRequestPolicy ::includeAccessibility
    //     * @see ApiDocumentationV3#PARAM_INCLUDE_ACCESSIBILITY
    //     */
    //    @Schema(description = ApiDocumentationV3.DESCRIPTION_ACCESSIBILITY + "<br>" + ApiDocumentationV3.HINT_REGION_NUMBER,
    //        defaultValue = AccessibilityEnum.ALL_AS_STRING /*TODO breaking change: bad default should be NONE, since not all clients have GRANT-rights*/)
    //    AccessibilityEnum includeAccessibility;

    //    public static final AlternateMatchEnum DEFAULT_INCLUDE_ALTERNATE_MATCH = AlternateMatchEnum.IRRELEVANT;
    //    @Schema(description = ApiDocumentationV3.TRIP_ALTERNATEMATCH_DESCRIPTION,
    //        defaultValue = AlternateMatchEnum.IRRELEVANT_AS_STRING)
    //    AlternateMatchEnum includeAlternateMatch;

    //    /**
    //     * See OJP TripMobilityFilter::bikeTransport
    //     */
    //    @ArraySchema(schema = @Schema(description = ApiDocumentationV3.DESCRIPTION_NOTICE_ATTRIBUTES))
    //    Set<NoticeAttributeEnum> includeNoticeAttributes;

    public static final Boolean DEFAULT_INCLUDE_ECONOMIC = Boolean.FALSE;
    @Schema(description = "Consider additional connections by Bus or S-Bahn leading to destination as well (de:'Zusätzliche Alternativverbindungen', 'Mehrdimensionale Suche', 'Preiswerte Suche')."
        + ModelDoc.HINT_PERFORMANCE,
        type = "boolean", defaultValue = "false")
    Boolean includeEconomic;

    //    public static final Boolean DEFAULT_INCLUDE_UNSHARP = Boolean.FALSE;
    //    @Schema(description = "Consider alternative stations origin/destination (de: Erweiterte Anzeige).",
    //        type = "boolean", defaultValue = "false")
    //    Boolean includeUnsharp;

    //    public static final Boolean DEFAULT_INCLUDE_EARLIER = Boolean.FALSE;
    //    @Schema(description = "Consider earlier leaving connections, even if arrival is later.",
    //        type = "boolean", defaultValue = "false")
    //    Boolean includeEarlier;

    //    public static final String DEFAULT_INCLUDE_ECOLOGY_COMPARISON = ECO_NONE;
    //    /**
    //     * @see <a href="https://github.com/UnionInternationalCheminsdeFer/OSDM/wiki/I-32-Inform-passengers-of-CO2-emissions-saved">OSDM CO2 emissions saved</a>
    //     * @see <a href="https://github.com/OpendataCH/Transport/blob/master/hafasXMLInterface.xsd#L2058>Hafas XML Interface</a>
    //     */
    //    @Schema(description = "Create Trip::EcoBalance (C02, ..) per Trip. DEFAULT is based on SBB default car eco-params." + ServiceDoc.HINT_ENUM_EXTENSIBLE,
    //        // unique use of enum's
    //        allowableValues = {ECO_NONE, ECO_DEFAULT}, defaultValue = DEFAULT_INCLUDE_ECOLOGY_COMPARISON)
    //    String includeEcologyComparison;

    @ArraySchema(schema = @Schema(description = "If any `vias` are set, thes tranportMode-values will be considered until the first via. " + ModelDoc.DESCRIPTION_TRANSPORT_MODES))
    Set<TransportModeEnum> includeTransportModes;

    public static final Boolean DEFAULT_INCLUDE_OPERATING_DATE = Boolean.FALSE;
    @Schema(description =
        "`Trip::operatingPeriods` will always be returned if it is a **repeatable planned Trip over the period**. To enforce concrete planned dates in `OperatingPeriod::operatingDays`set `includeOperatingDays=true` (PTRideLeg::serviceJourney::operationPeriods will remain empty, because whole Trip is of interest)."
            + ModelDoc.HINT_PERFORMANCE,
        type = "boolean", defaultValue = "false")
    Boolean includeOperatingDays;

    public static final Boolean DEFAULT_INCLUDE_ROUTE_PROJECTION = Boolean.FALSE;
    /**
     * Hafas can only deliver Polylines per Leg.
     *
     * @see swiss.opentransportdata.ojp.adapter.transmodel.v6.part6.passengerinformation.functionalrequests.tripquery.TripRequestPolicy ::inlcludeRouteProjection, ::includeLegProjection
     */
    @Schema(description = "With or without a plottable polyline for each vehicle-journey (if available)." + ModelDoc.HINT_PERFORMANCE,
        type = "boolean", defaultValue = "false")
    Boolean includeRouteProjection;

    //    /**
    //     * Depends on {@link ch.sbb.ki.journeyservice.base.exchange.Grant#ALLOW_GROUP_RESERVATION}.
    //     * <p>
    //     * Only used by sbb.ch allowing a simple way to end-user for querying whether they may make a reservation for a small group.
    //     * <p>
    //     * The reservation process itself is not maintained by J-S, but delegated interaction between sbb.ch and CAPRE.
    //     * <p>
    //     * FPLJS-910 {@link NoticeAttributeEnum#GROUPS_ADMITTED}
    //     *
    //     * @see ApiDocumentationV3#PARAM_INCLUDE_GROUP_RESERVATION
    //     */
    //    @Schema(description = "Relates to `PTRideLeg::groupReservationStatus`. " + ApiDocumentationV3.DESCRIPTION_INCLUDE_GROUPRESERVATION + " "
    //        + ApiDocumentationV3.HINT_REGION_NUMBER,
    //        type = "string", example = "5:7")
    //    String includeGroupReservation;

    // TODO ? TripRequestPolicy::includeSituations=true (perhaps make requestable, defaultValue = true)

    public static final Boolean DEFAULT_INCLUDE_SUMMARY = Boolean.FALSE;
    @Schema(description = "Create some summary facts about each Trip (useful for UI overviews)." + ModelDoc.HINT_PERFORMANCE,
        type = "boolean", defaultValue = "false")
    Boolean includeSummary;

    /**
     * @see ModelDoc#PARAM_INCLUDE_INTERMEDIATE_STOPS
     */
    public static final IntermediateStopsEnum DEFAULT_INCLUDE_INTERMEDIATE_STOPS = IntermediateStopsEnum.ALL;
    @Schema(description = ModelDoc.DESCRIPTION_INCLUDE_INTERMEDIATE_STOPS, defaultValue = IntermediateStopsEnum.ALL_AS_STRING)
    IntermediateStopsEnum includeIntermediateStops;

    //    /**
    //     * @see ApiDocumentationV3#PARAM_INCLUDE_TRAIN_STOP_ASSIGNMENTS
    //     */
    //    public static final TrainStopAssignmentsEnum DEFAULT_INCLUDE_TRAIN_STOP_ASSIGNMENTS = TrainStopAssignmentsEnum.NONE;
    //    @Schema(description = ApiDocumentationV3.DESCRIPTION_INCLUDE_TRAIN_STOP_ASSIGNMENTS,
    //        defaultValue = TrainStopAssignmentsEnum.TRAIN_STOP_ASSIGNMENT_NONE)
    //    TrainStopAssignmentsEnum includeTrainStopAssignments;

    //    /**
    //     * FPLJS-1529
    //     *
    //     * @see ApiDocumentationV3#PARAM_INCLUDE_REQUEST_ARGUMENTS
    //     */
    //    public static final Boolean DEFAULT_INCLUDE_REQUEST_ARGUMENTS = Boolean.FALSE;
    //    @Schema(description = "If set pack this object (more or less) into `Trip::id` to recover search-parameters in post." + ServiceDoc.HINT_PERFORMANCE,
    //        defaultValue = "false")
    //    Boolean includeRequestArguments;

    //    public static final NonPTTripEnum DEFAULT_INCLUDE_NON_PT_TRIP = NonPTTripEnum.NONE;
    //    /**
    //     * Depends on {@link ch.sbb.ki.journeyservice.base.exchange.Grant#DENY_NON_PT_TRIPS}
    //     * <p>
    //     * FPLJS-1479
    //     *
    //     * @see ApiDocumentationV3#PARAM_INCLUDE_NON_PT_TRIPS
    //     */
    //    @Schema(description = "Include non-_Public Transportation_ `Trip` if a short footpath makes sense between two `StopPlace's`:\n" +
    //        "- " + NonPTTripEnum.NON_PT_TRIP_NONE + ": avoid non-_Public Transportation_ `Trip's` at all" +
    //        //"- "+NonPTTripEnum.NON_PT_TRIP_ROAD +": a single `Trip` with one `"+ PersonalLeg.LEG_TYPE_NAME +"` is returned"+
    //        "- " + NonPTTripEnum.NON_PT_TRIP_STOPPLACE_FOOTPATH + ": an additional very first `Trip` with one `" + PersonalLeg.LEG_TYPE_NAME
    //        + " might be added if a `Trip` connects two near `StopPlace's`"
    //        + ServiceDoc.HINT_GRANT + ServiceDoc.HINT_PERFORMANCE,
    //        defaultValue = NonPTTripEnum.NON_PT_TRIP_NONE)
    //    NonPTTripEnum includeNonPublicTransportationTrips;

    /*-------------------------------------------------------------------------
     * Optional excludes resp. reduction of trips!
     */
    //    @ArraySchema(schema = @Schema(description =
    //        "Exclude a non-wanted set of `DatedVehicleJourney`s (each representing a ServiceProduct on a Line) including precise `name` and `start/end`) in the response (aka de:Sperrliste). " +
    //            "See [**DatedVehicleJourneyReference**](" + PublicLinks.DEV_MANUAL_DATED_VEHICLE_JOURNEY_REFERENCE + ") case 1."))
    //    List<DatedVehicleJourneyReference> excludeDatedVehicleJourneys;

    //    public static final Boolean DEFAULT_EXCLUDE_FOOTPATH_AT_ORIGIN_AND_DESTINATION = Boolean.FALSE;
    //    @Schema(description = "In case of `StopPlace` to `StopPlace` at origin and/or destination set true to prevent `AccessLeg's` at beginning or end.",
    //        type = "boolean", defaultValue = "false")
    //    Boolean excludeFootpathAtOriginAndDestination;

    //    public static final Boolean DEFAULT_EXCLUDE_UNNECESSARY_TRANSFERS = Boolean.FALSE;
    //    /**
    //     * FPLJS-1478 Due to Hafas and Railkit router combination for national/internal Trips.
    //     */
    //    @Schema(description = ApiDocumentationV3.DESCRIPTION_EXCLUDE_UNNECESSARY_TRANSFERS, type = "boolean", defaultValue = "false")
    //    Boolean excludeUnnecessaryTransfers;
}
