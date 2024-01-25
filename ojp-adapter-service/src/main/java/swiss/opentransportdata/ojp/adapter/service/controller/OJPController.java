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

package swiss.opentransportdata.ojp.adapter.service.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Locale;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAccessor;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonResponse;
import swiss.opentransportdata.ojp.adapter.model.common.response.Problem;
import swiss.opentransportdata.ojp.adapter.model.geojson.GeoJsonConverter;
import swiss.opentransportdata.ojp.adapter.model.geojson.response.Point;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceTypeEnum;
import swiss.opentransportdata.ojp.adapter.model.place.response.PlaceResponse;
import swiss.opentransportdata.ojp.adapter.service.controller.ApiParametersDefault.ParamAcceptLanguage;
import swiss.opentransportdata.ojp.adapter.service.controller.ApiParametersDefault.ParamRequestId;
import swiss.opentransportdata.ojp.adapter.service.operations.MonitoringConstants;
import swiss.opentransportdata.ojp.adapter.v1.PlaceRequestFilter;

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
public class OJPController extends BaseController /*TODO implements LocationPlaceFilter, LocationRequest, TripRequestFilter, TripRequest, StopEventRequestContentFilter, StopEventRequest*/ {

    private static final String PATH_SEGMENT_OJP = "/ojp";
    private static final String PATH_SEGMENT_PLACES = "/places";
    //private static final String PATH_SEGMENT_VEHICLE_JOURNEYS = "/vehicle-journeys";
    //private static final String PATH_SEGMENT_TRIPS = "/trips";

    static final String PATH = ApiDocumentation.VERSION_URI_V0 + PATH_SEGMENT_OJP;
    private static final String OJP_PLACES = PATH + PATH_SEGMENT_PLACES;
    /*
    private static final String OJP_PLACES_COORDINATES_LAT_LON = PATH + PATH_SEGMENT_PLACES + "/by-coordinates";

    private static final String API_TRIPS_BY_ORIGIN_DESTINATION = PATH + PATH_SEGMENT_TRIPS + "/by-origin-destination";
    private static final String API_VEHICLE_JOURNEY_BY_ID = PATH + PATH_SEGMENT_VEHICLE_JOURNEYS + "/{id}";
    private static final String API_DEPARTURES = PATH + PATH_SEGMENT_VEHICLE_JOURNEYS + "/by-departure/{origin}";
    private static final String API_ARRIVALS = PATH + PATH_SEGMENT_VEHICLE_JOURNEYS + "/by-arrival/{destination}";
    */
    private static final String PLACES_PARAM_NAMEMATCH = "nameMatch";
    private static final int PLACES_DEFAULT_LIMIT = PlaceRequestFilter.LIMIT_DEFAULT;
    private static final int PLACES_MIN_LIMIT = 1;
    private static final int PLACES_MAX_LIMIT = 50;
    private static final int PLACES_DEFAULT_RADIUS = 1000;

    public static final String HEADER_OJP_ACTIVE_INSTANCE = "OJP-Active-Instance";
    private static final String DESCRIPTION_OJP_ACTIVE_INSTANCE = "false: **passive instance** is used (default); true: **active instance** is used.";
    public static final String HEADER_OJP_TOKEN = "OJP-Token";
    private static final String DESCRIPTION_OJP_TOKEN =
        ApiDocumentation.OJP_SHORTNAME + " instance specific secret necessary for " + HEADER_OJP_ACTIVE_INSTANCE + ", see [API-key](https://opentransportdata.swiss/de/cookbook/verwendung-der-api/)." +
            " If none is given, fallback to a restricted token for passive instance.";

    private final OJPConfiguration ojpConfiguration;
    private final OJPFacade ojpFacade;

    @GetMapping(value = {OJP_PLACES})
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
            "- " + PlaceTypeEnum.TYPE_STOPPLACE + " name (like 'Bern' or DiDok-UIC '8507000' or DiDok-ShortName 'BN').",
            example = "Bern")
        @RequestParam(value = PLACES_PARAM_NAMEMATCH, required = false) String nameMatch,
        @Parameter(description = "Place type to be searched for.", array = @ArraySchema(schema = @Schema(allowableValues = {PlaceTypeEnum.TYPE_ALL, PlaceTypeEnum.TYPE_STOPPLACE,
            // OJP supports COORD and TOPOGRAPHIC_PLACE as well
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
        monitorRequest(OJP_PLACES);

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
            // TODO CONTENT-Language must be extracted from OJP::ojpResponse.getOJPResponse().getServiceDelivery().getAbstractFunctionalServiceDelivery().get() -> defaultLanguage
            return responseFactory.createOkResponse(placeResponse, placeRequestFilter.getPreferredLanguage() /*TODO verify with OJP response*/);
        } catch (OJPException ex) {
            return handle(ex);
        } catch (Exception ex) {
            return responseFactory.createUnexpectedProblemResponse("OJP /places", ex);
        }
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
            .endpoint(StringUtils.isBlank(instance) || "false" .equals(instance) ? ojpConfiguration.getEndpointPassive() : ojpConfiguration.getEndpointActive())
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