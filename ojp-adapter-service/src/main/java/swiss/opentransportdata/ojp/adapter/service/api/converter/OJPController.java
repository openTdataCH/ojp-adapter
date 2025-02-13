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

package swiss.opentransportdata.ojp.adapter.service.api.converter;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import de.vdv.ojp.v2.model.UseRealtimeDataEnumeration;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import swiss.opentransportdata.ojp.adapter.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.PlaceRequestFilter;
import swiss.opentransportdata.ojp.adapter.StopEventRequestFilter;
import swiss.opentransportdata.ojp.adapter.TripLegRequestFilter;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAccessor;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.PublicLinks;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse;
import swiss.opentransportdata.ojp.adapter.model.common.response.Problem;
import swiss.opentransportdata.ojp.adapter.model.geojson.GeoJsonConverter;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceReference;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceTypeEnum;
import swiss.opentransportdata.ojp.adapter.model.place.response.PlaceResponse;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.datedvehiclejourney.response.DatedVehicleJourney;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.request.RealtimeModeEnum;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.stationboard.response.ArrivalResponse;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.stationboard.response.DepartureResponse;
import swiss.opentransportdata.ojp.adapter.model.trip.request.AccessibilityEnum;
import swiss.opentransportdata.ojp.adapter.model.trip.request.IntermediateStopsEnum;
import swiss.opentransportdata.ojp.adapter.model.trip.request.NoticeAttributeEnum;
import swiss.opentransportdata.ojp.adapter.model.trip.request.TransportModeEnum;
import swiss.opentransportdata.ojp.adapter.model.trip.request.TripMobilityFilter;
import swiss.opentransportdata.ojp.adapter.model.trip.request.TripsByOriginAndDestinationRequestBody;
import swiss.opentransportdata.ojp.adapter.model.trip.response.TripResponse;
import swiss.opentransportdata.ojp.adapter.service.api.ApiDocumentation;
import swiss.opentransportdata.ojp.adapter.service.api.ApiParametersDefault.ParamAcceptLanguage;
import swiss.opentransportdata.ojp.adapter.service.api.ApiParametersDefault.ParamRequestId;
import swiss.opentransportdata.ojp.adapter.service.api.ApiResponseProblemSet;
import swiss.opentransportdata.ojp.adapter.service.api.ApiStandardResponse;
import swiss.opentransportdata.ojp.adapter.service.application.configuration.OJPConfiguration;
import swiss.opentransportdata.ojp.adapter.service.controller.BaseController;
import swiss.opentransportdata.ojp.adapter.service.operations.MonitoringConstants;
import swiss.opentransportdata.ojp.adapter.service.utils.DateTimeUtils;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.stopeventquery.StopEventRequest;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.stopeventquery.StopEventRequestContentFilter;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.tripquery.TripRequest;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.functionalrequests.tripquery.TripRequestFilter;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.locationquery.LocationPlaceFilter;
import swiss.opentransportdata.ojp.adapter.trm.v6.part6.passengerinformation.locationquery.LocationRequest;

/**
 * Transmodel oriented APIs against the underlying router OJP.
 *
 * @author Peter Hirzel
 * @see <a href="https://github.com/openTdataCH">openTdataCH</a>
 */
@Slf4j
@RestController
@RequestMapping(value = ApiDocumentation.SERVICE_ROOT, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_PROBLEM_JSON_VALUE})
@Tag(name = ApiDocumentation.TAG_OJP, description = "[OJP (SKI+, CH)](https://opentransportdata.swiss/de/cookbook/open-journey-planner-ojp/) as underlying router, exposed by APIs. **Experimental, responses might be partially incomplete yet!!!**")
@RequiredArgsConstructor
public class OJPController extends BaseController implements LocationPlaceFilter, LocationRequest, TripRequestFilter, TripRequest, StopEventRequestContentFilter, StopEventRequest {

    private static final String PATH_SEGMENT_OJP = "/ojp";
    private static final String PATH_SEGMENT_PLACES = "/places";
    private static final String PATH_SEGMENT_VEHICLE_JOURNEYS = "/vehicle-journeys";
    private static final String PATH_SEGMENT_TRIPS = "/trips";

    static final String PATH = ApiDocumentation.VERSION_URI_V0 + PATH_SEGMENT_OJP;
    private static final String API_PLACES = PATH + PATH_SEGMENT_PLACES;
    //private static final String OJP_PLACES_COORDINATES_LAT_LON = PATH + PATH_SEGMENT_PLACES + "/by-coordinates";
    private static final String PLACES_PARAM_NAMEMATCH = "nameMatch";
    private static final int PLACES_DEFAULT_LIMIT = PlaceRequestFilter.LIMIT_DEFAULT;
    private static final int PLACES_MIN_LIMIT = 1;
    private static final int PLACES_MAX_LIMIT = 50;
    private static final int PLACES_DEFAULT_RADIUS = 1000;

    private static final String API_VEHICLE_JOURNEY_BY_ID = PATH + PATH_SEGMENT_VEHICLE_JOURNEYS + "/{id}";
    private static final String API_DEPARTURES = PATH + PATH_SEGMENT_VEHICLE_JOURNEYS + "/by-departure/{origin}";
    private static final String API_ARRIVALS = PATH + PATH_SEGMENT_VEHICLE_JOURNEYS + "/by-arrival/{destination}";
    private static final int STATIONBOARD_DEFAULT_LIMIT = 20;

    // see StartEndLeg -> terminology for Trip is origin/destination
    private static final String API_TRIPS_BY_ORIGIN_DESTINATION = PATH + PATH_SEGMENT_TRIPS + "/by-origin-destination";

    private static final String HEADER_ACCEPT_LANGUAGE_DEFAULT = "en";
    private static final String HEADER_CONTENT_LANGUAGE_ERROR_DETAIL_DEFAULT = "en";

    public static final String HEADER_OJP_ACTIVE_INSTANCE = "OJP-Active-Instance";
    private static final String DESCRIPTION_OJP_ACTIVE_INSTANCE = "false: **passive instance** is used (default); true: **active instance** is used.";
    public static final String HEADER_OJP_TOKEN = "OJP-Token";
    private static final String DESCRIPTION_OJP_TOKEN =
        ApiDocumentation.OJP_SHORTNAME + " instance specific secret necessary for " + HEADER_OJP_ACTIVE_INSTANCE + ", see [API-key](https://opentransportdata.swiss/de/cookbook/verwendung-der-api/)." +
            " If none is given, fallback to a restricted token for passive instance.";

    private final OJPConfiguration ojpConfiguration;
    private final OJPFacade ojpFacade;

    private static Locale detectTranslation(Locale byResponse, Locale byRequest) {
        if (byResponse == null) {
            log.info("OJP did not set a response defaultLanguage -> fallback to ACCEPT-LANGUAGE");
            return byRequest;
        }

        return byResponse;
    }

    @GetMapping(value = {API_PLACES})
    @Operation(summary = "Get places of type " + PlaceTypeEnum.TYPE_STOPPLACE + ", " + PlaceTypeEnum.TYPE_ADDRESS + "," + PlaceTypeEnum.TYPE_POINTOFINTEREST + " by its name.",
        description = "The response is a flat (non-inherited) structure of concrete places.")
    @ApiResponse(
        responseCode = "200", description = ApiDocumentation.STATUS_200,
        headers = {
            @Header(name = HttpHeaders.CONTENT_LANGUAGE, description = ApiDocumentation.HEADER_LANGUAGE_DESCRIPTION, schema = @Schema(type = "string")),
            @Header(name = MonitoringConstants.HEADER_REQUEST_ID, description = ApiDocumentation.HEADER_REQUEST_ID_REPLY, schema = @Schema(type = "string"))},
        content = @Content(mediaType = APPLICATION_JSON_VALUE, schema = @Schema(implementation = PlaceResponse.class)))
    @ApiResponseProblemSet
    public ResponseEntity<? extends JsonResponse> getOjpPlacesByName(
        @ParamRequestId @RequestHeader(value = MonitoringConstants.HEADER_REQUEST_ID, required = false) String requestId,
        @ParamAcceptLanguage @RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, defaultValue = ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT, required = false) String acceptLanguage,
        @Parameter(description = DESCRIPTION_OJP_ACTIVE_INSTANCE, schema = @Schema(type = "boolean", defaultValue = "false"))
        @RequestHeader(value = HEADER_OJP_ACTIVE_INSTANCE, required = false) Boolean ojpActiveInstance,
        @Parameter(description = DESCRIPTION_OJP_TOKEN, schema = @Schema(type = "string"))
        @RequestHeader(value = HEADER_OJP_TOKEN, required = false) String ojpToken,

        @Parameter(description = "Tolerant `Place::name` match, where `Accept-Language` accepts translated terms like (Genève, Geneva, ..) at request time, where:\n" +
            "- " + PlaceTypeEnum.TYPE_ADDRESS + " resp. street name (like 'Bollwerk 8')\n" +
            "- " + PlaceTypeEnum.TYPE_POINTOFINTEREST + " (like 'Museum')\n" +
            //TODO SLOID sample
            "- " + PlaceTypeEnum.TYPE_STOPPLACE + " name (like 'Bern' or Atlas-UIC '8507000' or DiDok-ShortName 'BN').",
            example = "Bern")
        @RequestParam(value = PLACES_PARAM_NAMEMATCH, required = false) String nameMatch,
        @Parameter(description = "Place type to be searched for.", array = @ArraySchema(schema = @Schema(allowableValues = {PlaceTypeEnum.TYPE_ALL, PlaceTypeEnum.TYPE_STOPPLACE,
            // OJP supports COORD(v1)/Location(v2) and TOPOGRAPHIC_PLACE as well
            PlaceTypeEnum.TYPE_ADDRESS,
            PlaceTypeEnum.TYPE_POINTOFINTEREST}, defaultValue = PlaceTypeEnum.TYPE_ALL)))
        @RequestParam(value = "type", required = false) Set<PlaceTypeEnum> types,
        @Parameter(description = "Number of hits to be found (max=" + PLACES_MAX_LIMIT + ").", schema = @Schema(defaultValue = ""
            + PLACES_DEFAULT_LIMIT, example = "10", minimum = "" + PLACES_MIN_LIMIT, maximum = "" + PLACES_MAX_LIMIT /*TODO OJP max > 50*/, type = "integer"))
        @RequestParam(value = "limit", required = false) Integer limit,
        @Parameter(description = ModelDoc.DESCRIPTION_POSITION + " If set, the nearby pattern matching score of `" + PLACES_PARAM_NAMEMATCH
            + "` " + /*in the specified `radius`*/ " should be increased.<br>",
            schema = @Schema(example = "\"[8.5441, 47.4115]\""))
        @RequestParam(value = "center", required = false) String centerAsGeoJsonString,
        @Parameter(description = "Radius [m] around the related `center`, if given.", schema = @Schema(type = "integer", defaultValue = "" + PLACES_DEFAULT_RADIUS))
        @RequestParam(value = "radius", required = false) Integer radius
    ) {
        monitorRequest(API_PLACES);

        if (StringUtils.isBlank(nameMatch) && StringUtils.isBlank(centerAsGeoJsonString)) {
            return responseFactory.createBadParamResponse(null, PLACES_PARAM_NAMEMATCH + "/center", "At least one of these must not be empty.");
        }

        Point center = null;
        if (StringUtils.isNotBlank(centerAsGeoJsonString)) {
            try {
                center = GeoJsonConverter.parsePoint(centerAsGeoJsonString);
            } catch (IllegalArgumentException ex) {
                return responseFactory.createBadParamResponse(ex, "center", "Invalid format");
            }
        }

        return requestPlaces(nameMatch, types, limit, center, radius);
    }

    private void validatePlaceReference(PlaceReference placeReference) {
        if (!PlaceReference.TYPE_STOP_PLACE.equals(placeReference.getType())) {
            throw new IllegalArgumentException("StopPlace only supported for OJP yet but was type=" + placeReference.getType());
        }
    }

    private ResponseEntity<? extends JsonResponse> requestPlaces(String nameMatch, Set<PlaceTypeEnum> types, Integer limit, Point center, Integer radius) {

        PlaceRequestFilter.Point centroid = null;
        Integer centroidRadius = null;
        if (center != null) {
            centroid = new PlaceRequestFilter.Point(center.getLongitude(), center.getLatitude());
            centroidRadius = radius == null ? PLACES_DEFAULT_RADIUS : radius;
        }

        try {
            final PlaceRequestFilter placeRequestFilter = PlaceRequestFilter.builder()
                .preferredLanguage(getPreferredLanguage())
                .placeTypes(OJPFacade.mapToPlaceTypes(types))
                .placeName(nameMatch)
                .centroid(centroid)
                .radius(centroidRadius)
                .limit(limit == null ? PLACES_DEFAULT_LIMIT : limit)
                .build();

            final PlaceResponse placeResponse = ojpFacade.requestPlaces(createOJPAccessor(), placeRequestFilter);
            if (placeResponse.getPlaces().isEmpty()) {
                return responseFactory.createNotFoundResponse();
            }

            return responseFactory.createOkResponse(placeResponse, detectTranslation(placeResponse.getResponseTranslation(), placeRequestFilter.getPreferredLanguage()));
        } catch (OJPException ex) {
            return handle(ex);
        } catch (Exception ex) {
            return responseFactory.createUnexpectedProblemResponse("OJP /places", ex);
        }
    }

    @GetMapping(value = {API_VEHICLE_JOURNEY_BY_ID})
    @Operation(summary = "Get complete DatedVehicleJourney by its Journey-Reference.",
        description = "This will deliver all current details of the complete vehicle-journey (of the passenger carrying `ServiceProduct` such such as train, bus,..). " +
            "It contains a list of all `ScheduledStopPoints` including departure and arrival times (with real-time data if available) and additional information like specific Notice's.")
    @ApiStandardResponse(
        content = @Content(mediaType = APPLICATION_JSON_VALUE, schema = @Schema(implementation = DatedVehicleJourney.class)))
    @ApiResponseProblemSet
    public ResponseEntity<? extends JsonResponse> getOJPDatedVehicleJourneyById(
        // headers
        @ParamRequestId @RequestHeader(value = MonitoringConstants.HEADER_REQUEST_ID, required = false) String requestId,
        @ParamAcceptLanguage @RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, defaultValue = ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT, required = false) String acceptLanguage,
        @Parameter(description = DESCRIPTION_OJP_ACTIVE_INSTANCE, schema = @Schema(type = "boolean", defaultValue = "false"))
        @RequestHeader(value = HEADER_OJP_ACTIVE_INSTANCE, required = false) Boolean ojpActiveInstance,
        @Parameter(description = DESCRIPTION_OJP_TOKEN, schema = @Schema(type = "string"))
        @RequestHeader(value = HEADER_OJP_TOKEN, required = false) String ojpToken,

        @Parameter(description = "Any `ServiceJourney::id` given by PTRideLeg or any other Vehicle-Journey response.", schema = @Schema(type = "string", example = ModelDoc.SAMPLE_SJYID))
        @PathVariable("id") String id,

        @Parameter(description = "Day of operation (null defaults to TODAY).", example = ModelDoc.SAMPLE_DATE) @DateTimeFormat(iso = ISO.DATE)
        @RequestParam(value = "date", required = false) LocalDate date,

        @Parameter(description = ModelDoc.PARAM_REALTIME_MODE, schema = @Schema(defaultValue = RealtimeModeEnum.REALTIME_AS_STRING))
        @RequestParam(value = "realtimeMode", required = false) RealtimeModeEnum realtimeMode,
        /*
        @Parameter(description = "Set true to get `ServiceJourney::operatingPeriods`.", schema = @Schema(defaultValue = "false", type = "boolean"))
        @RequestParam(value = ApiDocumentation.PARAM_INCLUDE_OPERATING_DAYS, required = false) Boolean includeOperatingDays,
         */
        @Parameter(description = ModelDoc.TRIP_POLYLINE, schema = @Schema(defaultValue = "false", type = "boolean"))
        @RequestParam(value = ModelDoc.PARAM_INCLUDE_ROUTE_PROJECTION, required = false) Boolean includeRouteProjection
        /*
        @Parameter(description = ModelDoc.DESCRIPTION_INCLUDE_INTERMEDIATE_STOPS, schema = @Schema(defaultValue = IntermediateStopsEnum.INTERMEDIATE_STOPS_ALL))
        @RequestParam(value = ModelDoc.PARAM_INCLUDE_INTERMEDIATE_STOPS, required = false) IntermediateStopsEnum includeIntermediateStops
        @Parameter(description = ApiDocumentation.DESCRIPTION_INCLUDE_TRAIN_STOP_ASSIGNMENTS)
        @RequestParam(value = ApiDocumentation.PARAM_INCLUDE_TRAIN_STOP_ASSIGNMENTS, required = false, defaultValue = TrainStopAssignmentsEnum.TRAIN_STOP_ASSIGNMENT_NONE) TrainStopAssignmentsEnum includeTrainStopAssignments
        */) {

        monitorRequest(API_VEHICLE_JOURNEY_BY_ID);

        if (Boolean.TRUE.equals(ojpActiveInstance)) {
            return responseFactory.createBadParamResponse(null, "ojpActiveInstance", "Only OJP passive instance supports refresh yet.");
        }

        if (StringUtils.isBlank(id)) {
            return responseFactory.createBadParamResponse(null, "id", "Must not be empty.");
        }
        if (OJPFacade.isTooOld(date)) {
            return responseFactory.createBadParamResponse(null, "date", OJPFacade.JOURNEY_PLANNER_DAYS_DETAIL);
        }

        try {
            final TripLegRequestFilter filter = TripLegRequestFilter.builder()
                .preferredLanguage(getPreferredLanguage())
                .journeyReference(id)
                .realtimeMode(mapToUseRealtimeDataEnumeration(realtimeMode))
                .operatingDay(date == null ? DateTimeUtils.createSwissDate() : date)
                //.vehicleReference()
                .includeProjection(Boolean.TRUE.equals(includeRouteProjection))
                .build();

            final DatedVehicleJourney datedVehicleJourney = ojpFacade.requestDatedVehicleJourneyByServiceJourneyId(createOJPAccessor(), filter);
            return responseFactory.createOkResponse(datedVehicleJourney, detectTranslation(datedVehicleJourney.getResponseTranslation(), filter.getPreferredLanguage()));
        } catch (OJPException ex) {
            return handle(ex);
        } catch (Exception ex) {
            return responseFactory.createUnexpectedProblemResponse("OJP /vehicle-journeys/{id}", ex);
        }
    }

    @GetMapping(value = {API_DEPARTURES})
    @Operation(summary = "Get departures starting at a StopPlace.",
        description = "Determines next departures from a Stop and point in time within duration (the results always contain all departures running to the last minute found even if the requested maximum limit was overrun).")
    @ApiStandardResponse(
        content = @Content(mediaType = APPLICATION_JSON_VALUE, schema = @Schema(implementation = DepartureResponse.class)))
    @ApiResponseProblemSet
    public ResponseEntity<? extends JsonResponse> getOjpVehicleJourneysByDepartureAtOrigin(
        // headers
        @ParamRequestId @RequestHeader(value = MonitoringConstants.HEADER_REQUEST_ID, required = false) String requestId,
        @ParamAcceptLanguage @RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, defaultValue = HEADER_ACCEPT_LANGUAGE_DEFAULT, required = false) String acceptLanguage,
        @Parameter(description = DESCRIPTION_OJP_ACTIVE_INSTANCE, schema = @Schema(type = "boolean", defaultValue = "false"))
        @RequestHeader(value = HEADER_OJP_ACTIVE_INSTANCE, required = false) Boolean ojpActiveInstance,
        @Parameter(description = DESCRIPTION_OJP_TOKEN, schema = @Schema(type = "string"))
        @RequestHeader(value = HEADER_OJP_TOKEN, required = false) String ojpToken,

        @Parameter(description = "Starting StopPlace of the Departure. " + OJPAdapter.STOP_REF_HINT + " See v3 **PlaceReference** in " + PublicLinks.DEV_MANUAL_HINT_COMPLEX_PARAMETER,
            schema = @Schema(type = "string", requiredMode = RequiredMode.REQUIRED, example = "8507000"))
        @PathVariable("origin") String /*PlaceReference*/ origin,
        /*
        @Parameter(description = "If only vehicles departing to a certain direction shall be returned, specify the direction StopPlace. See v3 **PlaceReference** in "
            + ApiDocumentationV3.HINT_COMPLEX_PARAMETER,
            schema = @Schema(type = "string", example = "8503000"))
        @RequestParam(value = "direction", required = false) String direction,
         */
        @Parameter(description = "(Local) date at origin, defaults to TODAY.", schema = @Schema(format = "date", example = ModelDoc.SAMPLE_DATE))
        @DateTimeFormat(iso = ISO.DATE)
        @RequestParam(value = "date", required = false) LocalDate date,
        @Parameter(description = "Local time at origin, defaults to NOW (seconds will be ignored).",
            schema = @Schema(type = "string", format = "time", example = ModelDoc.SAMPLE_TIME))
        @DateTimeFormat(iso = ISO.TIME)
        @RequestParam(value = "time", required = false) LocalTime time,
        @Parameter(description = "Maximum number of departures to be returned.",
            schema = @Schema(type = "integer", defaultValue = "" + STATIONBOARD_DEFAULT_LIMIT))
        @RequestParam(value = "limit", required = false) Integer limit,
        @Parameter(description = ModelDoc.DESCRIPTION_TRANSPORT_MODES)
        @RequestParam(value = ModelDoc.PARAM_INCLUDE_TRANSPORT_MODES, required = false) Set<TransportModeEnum> includeTransportModes
        /*
        @Parameter(description = "Restrict departures optionally from given tracks (related to origin).",
            array = @ArraySchema(schema = @Schema(type = "string", example = "7,8")))
        @RequestParam(value = "includeQuays", required = false) List<String> includeQuays,
        @Parameter(description = "Calculate StopPoint::rank, which might be used by consumers to consider relevant intermediate stops to display."
            + ServiceDoc.HINT_PERFORMANCE, schema = @Schema(type = "boolean", defaultValue = "false"))
        @RequestParam(value = "includeRank", required = false, defaultValue = "false") Boolean includeRank,
        @Parameter(description = "Exclude equivalent marked stops.", schema = @Schema(type = "boolean", defaultValue = "true"))
        @RequestParam(value = "excludeEquivalentStops", required = false) Boolean excludeEquivalentStops)
         */
    ) {
        monitorRequest(API_DEPARTURES);

        if (OJPFacade.isTooOld(date)) {
            return responseFactory.createBadParamResponse(null, "date", OJPFacade.JOURNEY_PLANNER_DAYS_DETAIL);
        }

        /*
        Integer directionId = null;
        if (StringUtils.isNotBlank(direction)) {
            directionId = PlaceReferenceHelper.extractStopPlaceId(direction, "direction");
            return responseFactory.createNotImplementedResponse("direction");
        }
        */

        final PlaceReference startPlaceRef;
        try {
            startPlaceRef = PlaceReferenceHelper.parse(origin);
            validatePlaceReference(startPlaceRef);
        } catch (IllegalArgumentException ex) {
            return responseFactory.createBadParamResponse(ex, "destination", ex.getMessage());
        }

        try {
            final StopEventRequestFilter filter = StopEventRequestFilter.builder()
                .preferredLanguage(getPreferredLanguage())
                .searchForArrival(false)
                .stopPlaceReference(startPlaceRef.getPlaceId())
                .departureArrivalDateTime(OJPFacade.mapToSwissDateTime(TripConverter.determineLocalDateTimeOrNow(date, time)))
                .limit(limit == null ? STATIONBOARD_DEFAULT_LIMIT : limit)
                .modeFilterStructure(ojpFacade.mapToPtModeFilterStructure(includeTransportModes))
                .build();

            final DepartureResponse departureResponse = ojpFacade.requestDepartures(createOJPAccessor(), filter);
            return responseFactory.createOkResponse(departureResponse, detectTranslation(departureResponse.getResponseTranslation(), filter.getPreferredLanguage()));
        } catch (OJPException ex) {
            return handle(ex);
        } catch (Exception ex) {
            return responseFactory.createUnexpectedProblemResponse("OJP /departures", ex);
        }
    }

    @GetMapping(value = {API_ARRIVALS})
    @Operation(summary = "Get arrivals at a StopPlace.",
        description = "Determines next arrivals at a given Stop and point in time within a duration (the results always contain all departures running to the last minute found even if the requested maximum limit was overrun).")
    @ApiStandardResponse(
        content = @Content(mediaType = APPLICATION_JSON_VALUE, schema = @Schema(implementation = ArrivalResponse.class)))
    @ApiResponseProblemSet
    public ResponseEntity<? extends JsonResponse> getOjpVehicleJourneysByArrivalAtDestination(
        // headers
        @ParamRequestId @RequestHeader(value = MonitoringConstants.HEADER_REQUEST_ID, required = false) String requestId,
        @ParamAcceptLanguage @RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, defaultValue = ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT, required = false) String acceptLanguage,
        @Parameter(description = DESCRIPTION_OJP_ACTIVE_INSTANCE, schema = @Schema(type = "boolean", defaultValue = "false"))
        @RequestHeader(value = HEADER_OJP_ACTIVE_INSTANCE, required = false) Boolean ojpActiveInstance,
        @Parameter(description = DESCRIPTION_OJP_TOKEN, schema = @Schema(type = "string"))
        @RequestHeader(value = HEADER_OJP_TOKEN, required = false) String ojpToken,

        @Parameter(description = "StopPlace for which arrivals shall be retrieved. " + OJPAdapter.STOP_REF_HINT + " See v3 **PlaceReference** in " + PublicLinks.DEV_MANUAL_HINT_COMPLEX_PARAMETER,
            schema = @Schema(type = "string", requiredMode = RequiredMode.REQUIRED, example = "8507000"))
        @PathVariable("destination") String /*PlaceReference*/ destination,
        /*
        @Parameter(description = "Set `" + StationboardStopEnum.DEFAULT_VALUE + "` for arrivals passing that exact destination or `" + StationboardStopEnum.EQUIVALENT_STOPS_NAME
            + "` including equivalent Stops (such as Meta StopPlace's)." + ServiceDoc.HINT_ENUM_EXTENSIBLE, schema = @Schema(defaultValue = StationboardStopEnum.DEFAULT_VALUE))
        @RequestParam(value = "restrictDestination", required = false) StationboardStopEnum restrictDestination,
        @Parameter(description = "If only vehicles departing from a certain direction shall be returned, specify the direction (StopPlace only yet). See v3 **PlaceReference** in "
            + ApiDocumentationV3.HINT_COMPLEX_PARAMETER,
            schema = @Schema(type = "integer", example = "8503000"))
        @RequestParam(value = "direction", required = false) String direction,
         */
        @Parameter(description = "(Local) date at arrival, defaults to TODAY.", schema = @Schema(format = "date", example = ModelDoc.SAMPLE_DATE))
        @DateTimeFormat(iso = ISO.DATE)
        @RequestParam(value = "date", required = false) LocalDate date,
        @Parameter(description = "Local time at arrival, defaults to NOW (seconds will be ignored).",
            schema = @Schema(type = "string", format = "time", example = ModelDoc.SAMPLE_TIME))
        @DateTimeFormat(iso = ISO.TIME)
        @RequestParam(value = "time", required = false) LocalTime time,
        @Parameter(description = "Maximum number of arrivals to be returned.",
            schema = @Schema(type = "integer", defaultValue = "" + STATIONBOARD_DEFAULT_LIMIT))
        @RequestParam(value = "limit", required = false) Integer limit,
        @Parameter(description = ModelDoc.DESCRIPTION_TRANSPORT_MODES)
        @RequestParam(value = ModelDoc.PARAM_INCLUDE_TRANSPORT_MODES, required = false) Set<TransportModeEnum> includeTransportModes
        /*
        @Parameter(description = "Restrict departures optionally from given tracks (related to origin).",
            array = @ArraySchema(schema = @Schema(type = "string", example = "7,8")))
        @RequestParam(value = "includeQuays", required = false) List<String> includeQuays,
        @Parameter(description = "Calculate StopPoint::rank, which might be used by consumers to consider relevant intermediates stops to display."
            + ServiceDoc.HINT_PERFORMANCE, schema = @Schema(type = "boolean", defaultValue = "false"))
        @RequestParam(value = "includeRank", required = false, defaultValue = "false") Boolean includeRank
        */
    ) {
        monitorRequest(API_ARRIVALS);

        if (OJPFacade.isTooOld(date)) {
            return responseFactory.createBadParamResponse(null, "date", OJPFacade.JOURNEY_PLANNER_DAYS_DETAIL);
        }

        /*
        Integer directionId = null;
        if (StringUtils.isNotBlank(direction)) {
            directionId = PlaceReferenceHelper.parse(direction);
            return responseFactory.createNotImplementedResponse("direction");
        }
         */

        final PlaceReference endPlaceRef;
        try {
            endPlaceRef = PlaceReferenceHelper.parse(destination);
            validatePlaceReference(endPlaceRef);
        } catch (IllegalArgumentException ex) {
            return responseFactory.createBadParamResponse(ex, "destination", ex.getMessage());
        }

        try {
            final StopEventRequestFilter filter = StopEventRequestFilter.builder()
                .preferredLanguage(getPreferredLanguage())
                .searchForArrival(true)
                .stopPlaceReference(endPlaceRef.getPlaceId())
                .departureArrivalDateTime(OJPFacade.mapToSwissDateTime(TripConverter.determineLocalDateTimeOrNow(date, time)))
                .limit(limit == null ? STATIONBOARD_DEFAULT_LIMIT : limit)
                .modeFilterStructure(ojpFacade.mapToPtModeFilterStructure(includeTransportModes))
                .build();

            final ArrivalResponse arrivalResponse = ojpFacade.requestArrivals(createOJPAccessor(), filter);
            return responseFactory.createOkResponse(arrivalResponse, detectTranslation(arrivalResponse.getResponseTranslation(), filter.getPreferredLanguage()));
        } catch (OJPException ex) {
            return handle(ex);
        } catch (Exception ex) {
            return responseFactory.createUnexpectedProblemResponse("OJP /arrivals", ex);
        }
    }

    @PostMapping(value = {API_TRIPS_BY_ORIGIN_DESTINATION})
    @Operation(summary = ModelDoc.HINT_GET_BY_POST
        + " Get one-way trips between given origin and destination locations. Each Leg is operated by a certain transport-product, therefore multiple legs means changing vehicles.",
        description = "The underlying public transportation planner will provide the best journey-connections according to your query-parameters, such as via, individual change time (ICT) etc.")
    @ApiStandardResponse(
        content = @Content(mediaType = APPLICATION_JSON_VALUE, schema = @Schema(implementation = TripResponse.class)))
    @ApiResponseProblemSet
    //@ApiInternalRequestTimeout
    public ResponseEntity<? extends JsonResponse> getTripsByOriginAndDestination(
        // headers
        @ParamRequestId @RequestHeader(value = MonitoringConstants.HEADER_REQUEST_ID, required = false) String requestId,
        @ParamAcceptLanguage @RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, defaultValue = ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT, required = false) String acceptLanguage,

        @Parameter(description = "Request parameters (POST body).", required = true)
        @RequestBody TripsByOriginAndDestinationRequestBody body
    ) {
        monitorRequest(API_TRIPS_BY_ORIGIN_DESTINATION);

        if (OJPFacade.isTooOld(body.getDate())) {
            return responseFactory.createBadParamResponse(null, "date", OJPFacade.JOURNEY_PLANNER_DAYS_DETAIL);
        }

        //        if (body.getOriginRadius() != null && body.getOriginRadius() != TripsByOriginAndDestinationRequestBody.DEFAULT_WALK_RADIUS) {
        //            // FPLJS-1384/FPLJS-1246
        //            return responseFactory.createNotImplementedResponse("originRadius");
        //        }
        //        if (body.getDestinationRadius() != null && body.getDestinationRadius() != TripsByOriginAndDestinationRequestBody.DEFAULT_WALK_RADIUS) {
        //            // FPLJS-1384/FPLJS-1246
        //            return responseFactory.createNotImplementedResponse("destinationRadius");
        //        }
        //        final List<NotViaStop> notViaStops = viaMapper.mapToNotViaStops(body.getViasNot());
        //        if (!CollectionUtils.isEmpty(notViaStops)) {
        //            return responseFactory.createNotImplementedResponse("viasNot");
        //        }
        //        final List<NoChangeAtStop> noChangesAtStops = viaMapper.mapToNoChangesAtStop(body.getViasNoTransfer());
        //        if (!CollectionUtils.isEmpty(noChangesAtStops)) {
        //            return responseFactory.createNotImplementedResponse("viasNoTransfer");
        //        }
        //        if ((body.getOccupancyAverage() != null) && (body.getOccupancyAverage() != TripsByOriginAndDestinationRequestBody.DEFAULT_OCCUPANCY_AVERAGE)) {
        //            // FPLJS-1246
        //            return responseFactory.createNotImplementedResponse("occupancyAverage");
        //        }
        //        if (Boolean.TRUE.equals(body.getExcludeUnnecessaryTransfers())) {
        //            // FPLJS-1478
        //            return responseFactory.createBadParamResponse(null, ApiDocumentationV3.PARAM_EXCLUDE_UNNECESSARY_TRANSFERS, "true: not supported for OJP Trip's.");
        //        }

        final PlaceReference startPlaceReference;
        try {
            // straight routing params
            startPlaceReference = PlaceReferenceHelper.parse(body.getOrigin());
            validatePlaceReference(startPlaceReference);
        } catch (IllegalArgumentException ex) {
            return responseFactory.createBadParamResponse(ex, "origin", ex.getMessage());
        }
        final PlaceReference endPlaceRef;
        try {
            endPlaceRef = PlaceReferenceHelper.parse(body.getDestination());
            validatePlaceReference(endPlaceRef);
        } catch (IllegalArgumentException ex) {
            return responseFactory.createBadParamResponse(ex, "destination", ex.getMessage());
        }

        //        if (body.getPagingCursor() != null) {
        //            return responseFactory.createBadParamResponse(null, "pagingCursor", "not supported by OJP yet");
        //        }
        //        if (StringUtils.isNotBlank(body.getIncludeGroupReservation()) /*|| TripControllerV3.enforceRegionNumber(accessibilityEnum)*/) {
        //            //infos = TripControllerV3.createRegionNumberSet();
        //            return responseFactory.createBadParamResponse(null, ApiDocumentationV3.PARAM_INCLUDE_GROUP_RESERVATION, "not supported for OJP yet");
        //        }
        //        if (Boolean.TRUE.equals(body.getIncludeSummary())) {
        //            // FPLJS-1246
        //            return responseFactory.createNotImplementedResponse(ApiDocumentationV3.PARAM_INCLUDE_SUMMARY);
        //        }
        //        if (Boolean.TRUE.equals(body.getIncludeEconomic())) {
        //            return responseFactory.createNotImplementedResponse("includeEconomic");
        //        }
        //        if (Boolean.TRUE.equals(body.getIncludeUnsharp())) {
        //            return responseFactory.createNotImplementedResponse("includeUnsharp");
        //        }
        //        if (Boolean.TRUE.equals(body.getIncludeEarlier())) {
        //            return responseFactory.createNotImplementedResponse("includeEarlier");
        //        }
        //        if (body.getIncludeEcologyComparison() != null && !"NONE".equals(body.getIncludeEcologyComparison())) {
        //            return responseFactory.createNotImplementedResponse(ApiDocumentationV3.PARAM_INCLUDE_ECOLOGY_COMPARISON);
        //        }
        //        if (body.getIncludeRequestArguments() != null && !TripsByOriginAndDestinationRequestBody.DEFAULT_INCLUDE_REQUEST_ARGUMENTS.equals(body.getIncludeRequestArguments())) {
        //            return responseFactory.createNotImplementedResponse(ApiDocumentationV3.PARAM_INCLUDE_REQUEST_ARGUMENTS);
        //        }
        //        if (body.getIncludeAlternateMatch() != null && TripsByOriginAndDestinationRequestBody.DEFAULT_INCLUDE_ALTERNATE_MATCH != body.getIncludeAlternateMatch()) {
        //            return responseFactory.createBadParamResponse(null, ApiDocumentationV3.PARAM_INCLUDE_ALTERNATE_MATCH, "Only " + AlternateMatchEnum.IRRELEVANT_AS_STRING + " is supported for OJP yet");
        //        }
        //        if (!((body.getIncludeNonPublicTransportationTrips() == null) || (body.getIncludeNonPublicTransportationTrips() == TripsByOriginAndDestinationRequestBody.DEFAULT_INCLUDE_NON_PT_TRIP))) {
        //            // FPLJS-1479
        //            return responseFactory.createNotImplementedResponse(ApiDocumentationV3.PARAM_INCLUDE_NON_PT_TRIPS);
        //        }
        //        // exclude params
        //        if (!CollectionUtils.isEmpty(body.getExcludeDatedVehicleJourneys())) {
        //            return responseFactory.createBadParamResponse(null, "excludeDatedVehicleJourneys", "not supported for OJP yet");
        //        }
        //        if (Boolean.TRUE.equals(body.getExcludeFootpathAtOriginAndDestination())) {
        //            return responseFactory.createBadParamResponse(null, "excludeFootpathAtOriginAndDestination", "not supported for OJP yet");
        //        }
        //
        //        Integer limit = null;
        //        if (body.getOptimisationMethod() != null) {
        //            // OJP concept differs from Hafas! Leave the default to OJP and do not override by TripSearchAlgorithmConfig.DEFAULT_NUMF
        //            if (body.getOptimisationMethod().getNumberOfResultsBefore() != null) {
        //                log.debug("PATCH: OptimisationMethod::numberOfResultsBefore={} is ignored -> not supported by OJP", body.getOptimisationMethod().getNumberOfResultsBefore());
        //            }
        //            if (body.getOptimisationMethod().getNumberOfResultsAfter() != null) {
        //                if (body.getOptimisationMethod().getNumberOfResultsAfter() <= 0) {
        //                    return responseFactory.createBadParamResponse(null, "optimisationMethod::numberOfResultsAfter", "must be > 0");
        //                }
        //                limit = body.getOptimisationMethod().getNumberOfResultsAfter();
        //            }
        //        }

        final AccessibilityEnum accessibilityEnum = ObjectUtils.defaultIfNull(body.getIncludeAccessibility(), TripsByOriginAndDestinationRequestBody.DEFAULT_INCLUDE_ACCESSIBILITY);
        if (!((accessibilityEnum == AccessibilityEnum.NONE) || (accessibilityEnum == AccessibilityEnum.ALL))) {
            return responseFactory.createBadParamResponse(null, "includeAccessibility",
                "only '" + AccessibilityEnum.ALL_AS_STRING + "' or '" + AccessibilityEnum.NONE_AS_STRING + "' supported by OJP yet");
        }

        swiss.opentransportdata.ojp.adapter.TripRequestFilter.TripRequestFilterBuilder tripRequestFilterBuilder = swiss.opentransportdata.ojp.adapter.TripRequestFilter.builder()
            .preferredLanguage(getRequestContext().getAcceptLocale())
            .searchForArrival(ObjectUtils.defaultIfNull(body.getForArrival(), TripsByOriginAndDestinationRequestBody.DEFAULT_FOR_ARRIVAL))
            .origin(startPlaceReference.getPlaceId())
            .destination(endPlaceRef.getPlaceId())
            .dateTime(OJPFacade.mapToSwissDateTime(TripConverter.determineLocalDateTimeOrNow(body.getDate(), body.getTime())))
            .vias(ojpFacade.mapToViaStops(body.getVias(), getRequestContext().getAcceptLocale()))
            //.limit(limit)
            .includeAccessibility(accessibilityEnum == AccessibilityEnum.ALL)
            .includeIntermediateStops(body.getIncludeIntermediateStops() == null || body.getIncludeIntermediateStops() == IntermediateStopsEnum.ALL)
            .includeOperatingDays(Boolean.TRUE.equals(body.getIncludeOperatingDays()))
            .modeFilterStructure(ojpFacade.mapToPtModeFilterStructure(body.getIncludeTransportModes()))
            .includeSituationsContext(true /*TODO make configurable*/)
            .includeProjection(Boolean.TRUE.equals(body.getIncludeRouteProjection()))
            .realtimeMode(mapToUseRealtimeDataEnumeration(body.getRealtimeMode()));

        if (body.getMobilityFilter() == null) {
            tripRequestFilterBuilder.transferLimit(TripMobilityFilter.DEFAULT_MAX_TRANSFERS)
                .walkSpeed(TripMobilityFilter.DEFAULT_WALKSPEED);
        } else {
            /*
            if (body.getMobilityFilter().getAdditionalTransferTime() != null ||
                body.getMobilityFilter().getMaxTransferTime() != null ||
                body.getMobilityFilter().getMinTransferTime() != null) {
                return responseFactory.createBadParamResponse(null, "mobilityFilter", "only 'maxTransfers' and 'walkSpeed' supported for OJP yet");
            }
            */
            tripRequestFilterBuilder.transferLimit(body.getMobilityFilter().getMaxTransfers() == null ? TripMobilityFilter.DEFAULT_MAX_TRANSFERS : body.getMobilityFilter().getMaxTransfers())
                .walkSpeed(body.getMobilityFilter().getWalkSpeed() == null ? TripMobilityFilter.DEFAULT_WALKSPEED : body.getMobilityFilter().getWalkSpeed());
        }

        if (body.getIncludeNoticeAttributes() != null) {
            if (body.getIncludeNoticeAttributes().size() == 1 && body.getIncludeNoticeAttributes().contains(NoticeAttributeEnum.BIKE_TRANSPORT)) {
                tripRequestFilterBuilder.includeBikeCarriage(true);
            } else {
                return responseFactory.createBadParamResponse(null, "includeNoticeAttributes", "only 'BIKE_TRANSPORT' supported for OJP yet");
            }
        }

        try {
            final TripResponse tripResponse = ojpFacade.requestTrips(createOJPAccessor(), tripRequestFilterBuilder.build());
            if (tripResponse.getTrips().isEmpty()) {
                return responseFactory.createNotFoundResponse();
            }
            // TODO FPLJS-1247 CONTENT-Language must be extracted from OJP::ojpResponse.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery().get() -> defaultLanguage
            return responseFactory.createOkResponse(tripResponse, getRequestContext().getAcceptLocale());
        } catch (OJPException ex) {
            return handle(ex);
        } catch (Exception ex) {
            return responseFactory.createUnexpectedProblemResponse("OJP /trips", ex);
        }
    }

    private UseRealtimeDataEnumeration mapToUseRealtimeDataEnumeration(RealtimeModeEnum realtimeModeEnum) {
        if (realtimeModeEnum == RealtimeModeEnum.OFF) {
            return UseRealtimeDataEnumeration.NONE;
        }

        // Be aware OJP knows UseRealtimeDataEnumeration#FULL as well, but EXPLANATORY is probably better.
        return UseRealtimeDataEnumeration.EXPLANATORY;
    }

    /**
     * Consumer is free to use OJP active or passive instance with its specific OJP token, the default configuration may be overwritten hereby.
     *
     * @return OJP access configuration
     */
    private OJPAccessor createOJPAccessor() {
        final String instance = getRequestContext().getRequest().getHeader(HEADER_OJP_ACTIVE_INSTANCE);
        final String token = getRequestContext().getRequest().getHeader(HEADER_OJP_TOKEN);
        return OJPAccessor.builder()
            .endpoint(StringUtils.isBlank(instance) || "false".equals(instance) ? ojpConfiguration.getEndpointPassive() : ojpConfiguration.getEndpointActive())
            .token(StringUtils.isBlank(token) ? ojpConfiguration.getAuthorization() : token)
            .requestId(getRequestContext().getRequestId())
            .build();
    }

    private ResponseEntity<Problem> handle(OJPException exception) {
        if ((exception.getCause() != null) && (exception.getCause() instanceof WebClientResponseException webClientResponseException)) {
            if (webClientResponseException.getStatusCode() == HttpStatus.BAD_REQUEST) {
                return responseFactory.createBadParamResponse(webClientResponseException, ApiDocumentation.OJP_SHORTNAME + " *", webClientResponseException.getMessage());
            }
            if (webClientResponseException.getStatusCode() == HttpStatus.FORBIDDEN) {
                return responseFactory.createForbiddenResponse(ApiDocumentation.OJP_SHORTNAME + ": " + webClientResponseException.getMessage());
            }
        }
        return responseFactory.createUnexpectedProblemResponse(ApiDocumentation.OJP_SHORTNAME + " request fault: " + exception.getMessage(), exception);
    }

    private Locale getPreferredLanguage() {
        return getRequestContext().getAcceptLocale() == null ? Locale.forLanguageTag(ApiDocumentation.HEADER_ACCEPT_LANGUAGE_DEFAULT) : getRequestContext().getAcceptLocale();
    }
}