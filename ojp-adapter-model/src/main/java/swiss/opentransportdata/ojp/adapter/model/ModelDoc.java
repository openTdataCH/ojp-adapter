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

package swiss.opentransportdata.ojp.adapter.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpHeaders;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;
import swiss.opentransportdata.ojp.adapter.model.trip.request.IntermediateStopsEnum;
import swiss.opentransportdata.ojp.adapter.model.trip.request.TransportModeEnum;

@UtilityClass
public class ModelDoc {

    // standard see SAMPLE_DURATION
    public static final String DURATION = "[duration](https://www.w3.org/TR/xmlschema11-2/#duration)";

    public static final String RFC7807 = "[RFC-7807](https://tools.ietf.org/html/rfc7807)";
    /**
     * OffsetDateTime fields.
     * <p>
     * For a Journey-Planner the local offset is very important to know.
     */
    public static final String ISO8601 = "[ISO-8601](https://datatracker.ietf.org/doc/html/rfc3339#section-5.6) UTC with time-numoffset (like '+02:00')";

    /**
     * Reuse in @Schema description like: HINT_ENUM_EXTENSIBLE + or any other description.
     * <p>
     * In Request @Schema(allowableValues=..) leads to a enum type resp. drop-down-list in Swagger.
     * <p>
     * In Response DO NOT return @Schema(allowableValues=..) ever if x-tensible, but add "[..,..] after this HINT.
     *
     * @see JsonExtensibleEnum
     * @see <a href="https://app.swaggerhub.com/apis-docs/schlpbch/uic-90918_10_osdm>OSDM sample 'ptModes'</a>
     */
    public static final String HINT_ENUM_EXTENSIBLE = "<br>x-extensible-enum: ";
    /**
     * TODO values SBB specific yet
     *
     * @see TransportModeEnum
     */
    public static final String DESCRIPTION_TRANSPORT_MODES =
        "Optionally restrict to a requestable set of SBB specific TransportMode's (aka OJP PTMode). The set is relevant for any vehicle-journey (`DatedVehicleJourney`, `PTRideLeg`, ..). "
            + "Relates to `ServiceProduct::vehicleMode` and `::vehicleSubModes`.\n"
            + "- Default: non-restricted (null or empty-list), by means all TransportMode's are searched.\n"
            + "- If some choice is made, other TransportMode's are excluded implicitely.\n"
            + "- To get TRAIN (VehicleMode::id) only, add: [HIGH_SPEED_TRAIN,INTERCITY,INTERREGIO,REGIO,URBAN_TRAIN,SPECIAL_TRAIN]\n>"
            + "- Be aware that TRAMWAY also searches for METRO (not distinguished it here further!)\n"
            + "- Also there is no exact possibility to distinguish more precisely between CABLEWAY_GONDOLA_CHAIRLIFT_FUNICULAR at search time<br>"
            + HINT_ENUM_EXTENSIBLE;
    /**
     * Developer hint: Add to any params which are performance critical.
     */
    public static final String HINT_PERFORMANCE = "<br>This parameter has an impact on performance and/or response volume, set wisely!";
    /**
     * Description that can be reused across extendible enums defined with {@code @Schema(enumAsRef = true)} in responses (in request, extending an enum is backward-compatible).
     *
     * @see Schema#enumAsRef()
     */
    public static final String HINT_ENUM_AS_REF_EXTENSIBLE_IN_RESPONSE =
        "Enum whose values can be extended, thus default case should be foreseen wenn parsing the response (in Java, avoid `valueOf`, prefer `switch` with the value's name and define a default). " +
            "You may become unexpected values if your client is out-of-sync. ";

    /**
     * Generally: {POST} should be used for scenarios that cannot be covered by the other methods sufficiently. In such cases, make sure to document the fact that {POST} is used as a workaround (see
     * {GET-with-Body}).
     *
     * @see <a href="https://schweizerischebundesbahnen.github.io/api-principles/restful/principles/#get-with-body">SBB Principles, RESTful Best Practices</a>
     * @see <a href="https://schweizerischebundesbahnen.github.io/api-principles/restful/best-practices/#consider-to-design-post-and-patch-idempotent">POST idempotent</a>
     * @see <a href="https://opensource.zalando.com/restful-api-guidelines/#get-with-body">Zalando rules</a>
     * @see <a href="https://app.swaggerhub.com/apis-docs/schlpbch/uic-90918_10_osdm">OSDM declares an `Idempotency key`, but we think does not change state by such an
     *     API and therefore over-engineered.</a>
     */
    public static final String HINT_GET_BY_POST = "{Idempotent: GET with body payload}";

    public static final String HINT_GZIP = "{To compress large responses, set header `accept-encoding` as `gzip`.}";

    public static final String DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE = "**Inheritance discriminator to proper Subclass** " +
        "(technical field required by [OpenApi 3 Discriminator](https://swagger.io/docs/specification/data-models/inheritance-and-polymorphism/)) makes deserialization at consumer side easier.";

    public static final String DESCRIPTION_OPERATINGPERIOD_ON_SERVICEJOURNEY = "Only set in context of a `ServiceJourney::operatingPeriods`.";
    /**
     * Often used suffixes to property: *Name, *ShortName, *Formatted
     */
    public static final String TRANSLATED_TEXT = "<br>(Translated according to " + HttpHeaders.ACCEPT_LANGUAGE + ".)";

    /**
     * Developer hint: Add to any params to mark non-enduser information, by means Backend-to-Backend only.
     */
    public static final String HINT_NON_ENDUSER = "Data resulting out of this MUST NOT be presented to enduser (for e.g. SBB channels), set wisely!";

    public static final String HINT_INHERITED_PLACE = "<br>Inherited from `Place`.";

    /**
     * Relevant mapping link for VehicleMode requests.
     */
    public static final String LINK_OPENTRANSPORTDATA_SERVICEPRODUCT = "[opentransportdata.swiss Transportmodes (de:Verkehrsmittel)](https://opentransportdata.swiss/de/dataset/vm-liste)";

    public static final String VEHICLEMODE_ID =
        "Mode of public transportation according to **v580 TransportMode** (see [de:Verkehrsmittelkategorie](https://www.allianceswisspass.ch/de/tarife-vorschriften/uebersicht/V580/Produkte-der-V580-FIScommun-1)) given  by "
            + LINK_OPENTRANSPORTDATA_SERVICEPRODUCT + " column `EN` as uppercase." +
            HINT_ENUM_EXTENSIBLE + "values see `VehicleModeEnum`.";

    public static final String CANCELLED = "true: Journey is `cancelled` (de:Ausfall), default=false.";
    public static final String CANCELLED_FORMATTED = "If `cancelled`, enduser cancellation info." + TRANSLATED_TEXT;
    public static final String CANCELLED_FORMATTED_SAMPLE = "Ausfall";
    public static final String PARTIALLY_CANCELLED = "true: Journey is partially cancelled (de:Teilausfall) at beginning or end, default=false.";
    public static final String PARTIALLY_CANCELLED_FORMATTED = "If `partiallyCancelled`, enduser info." + TRANSLATED_TEXT;
    public static final String REDIRECTED_FORMATTED = "Text intended for passengers about a planned stop being skipped, relates to `redirected`." + TRANSLATED_TEXT;
    public static final String REDIRECTED_FORMATTED_SAMPLE = "This vehicle is not stopping at all stations.";
    public static final String UNPLANNED_STOPS_FORMATTED = "Text intended for passengers about an additional non-planned stop at a station." + TRANSLATED_TEXT;
    public static final String UNPLANNED_STOPS_FORMATTED_SAMPLE = "This vehicle is making exceptional stops. This can lead to increased travel time.";

    public static final String PLACES_DISTANCE = "Specifies the distance in [m] to the given coordinates in request.";
    /**
     * @see <a href="https://unioninternationalcheminsdefer.github.io/OSDM/spec/catalog-of-code-lists">station prefix urn:uic.stn</a>
     */
    public static final String DESCRIPTION_STOP_PLACE_ID = "UIC of a StopPlace (according to Atlas format).";
    public static final String SAMPLE_STOPPLACE_ID = "8507000";
    public static final String DESCRIPTION_CANTON = "In CH this represents the 'canton' abbreviation.";
    public static final String EXAMPLE_CANTON = "BE";
    public static final String DESCRIPTION_SLOID = "Swiss location id (SLOID) from Atlas. More on [Service Points (DiDok) API](https://developer.sbb.ch/apis/servicepoints/documentation).";
    public static final String EXAMPLE_SLOID_STOP_PLACE = "ch:1:sloid:16161";
    public static final String DESCRIPTION_COUNTRY_CODE = "The two uppercase character of ISO 3166 code, mostly similar to lowercase IANA identifier (source: Atlas geographic-based _isoCountryCode_).";
    public static final String EXAMPLE_COUNTRY_CODE = "CH";
    public static final String DESCRIPTION_POSITION = "A representative geographic position of the `Place` by a [GeoJSON Point](https://datatracker.ietf.org/doc/html/rfc794).";
    public static final String DESCRIPTION_WEIGHT = "The higher the traffic load/importance the higher the value, null if unknown.";
    public static final String DESCRIPTION_REQUEST_STOP = "Passenger needs to call for a vehicle stop (aka OJP `RequestStop`, resp. de:Halt auf Verlangen).";
    public static final String DIRECTION_DESCRIPTION = "Direction information correlating to Vehicle or Perron display. Typically the last stop-point of the associated line, though for operational or commercial reasons, the direction can also be a stop-over if the passengers are to be published a destination that makes sense in relation to their place of departure.";
    public static final String JOURNEY_REFERENCE_DESCRIPTION = "Underlying system specific unique identifier representing a concrete (partial) route for a specific vehicle and time. Be aware this is just a temporary id and may change daily!";

    /**
     * @see <a href="https://app.swaggerhub.com/apis-docs/schlpbch/uic-90918_10_osdm">OSDM TripSearchCriteria ::carrierFilter by RICS company code</a>
     */
    public static final String DESCRIPTION_OPERATORS =
        "Operators involved on Line. Three variants are supported, see **OperatorReference** in " + PublicLinks.DEV_MANUAL_HINT_COMPLEX_PARAMETER + "\n" +
            "1) OperatorReference-Object with type='TEXT' as given in [OpenTransportData.swiss 'Business organisation' in 'GO-Liste.csv' field 'BEZEICHNUNG_DE'](https://opentransportdata.swiss/de/dataset/goch) or in returned Operator::name\n"
            +
            "2) OperatorReference-Object with type='NUMBER' as given in [OpenTransportData.swiss 'Business organisation' in 'GO-Liste.csv' field 'NUMMER'](https://opentransportdata.swiss/de/dataset/goch)\n"
            +
            "3) as 1) but just Operator::name String (without JSON Object)";
    public static final String DESCRIPTION_PAGING_CURSOR = "Based on a returned `TripResponse::pagingCursor`, `previous` or `next` connections **reusing the very same search-parameters** can be retrieved by scrolling pagination mechanisme, see `Trip::pagingChecksum`).";
    public static final String DESCRIPTION_STOPPOINTS = "First stop represents origin (start), last stop represents destination (end) [2..*].";
    public static final String DESCRIPTION_SERVICEJOURNEY = "A concrete passenger carrying Vehicle-Journey, relates to `stoppoints`.";
    public static final String LINK_SJYID =
        "[Swiss Journey-ID (SJYID)](https://transportdatamanagement.ch/content/uploads/2021/05/SwissJourneyID_DE_1_2.pdf)";
    public static final String DESCRIPTION_SERVICEPRODUCT = "ServiceProduct(s) operated by operator(s). If more than one it is usually an operator or name change.";
    public static final String PARAM_SERVICE_DAYS = "Operating days of 'same journey' within planned yearly operating-period though multiple entries are possible (for e.g. `Operator` change or different daysRegular/daysIrregular).";
    public static final String DESCRIPTION_LINKS = "List of links as per [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) principle.";

    public static final String HINT_QUAY_CHANGE = "**false** even if the related `StopCall::quayRt` is set, this is not considered a realtime change (acc. to SBB busines rules); **true** real `*QuayRt` change, also see `ServiceAlteration::quayChangedFormatted`.";

    public static final String OCCUPANCY_ENUM_LIST = "[UNKNOWN,LOW,MEDIUM,HIGH]";
    public static final String JOURNEY_SINGLE_RIDE = "If this value is missing, it is probably a _single-journey (de:Einzelfahrt)_.";

    public static final String PARAM_REALTIME_MODE = ModelDoc.HINT_ENUM_EXTENSIBLE
        + "\n- `REALTIME` potentially planned and RT **including non-rideable** (like cancelled)"
        + "\n- `OFF` **planned only**";
    public static final String TRIP_POLYLINE = "With or without a plottable polyline for each vehicle-journey (if available)." + HINT_PERFORMANCE;
    public static final String PARAM_INCLUDE_ROUTE_PROJECTION = "includeRouteProjection";
    public static final String PARAM_INCLUDE_OPERATING_DAYS = "includeOperatingDays";
    public static final String PARAM_INCLUDE_INTERMEDIATE_STOPS = "includeIntermediateStops";
    public static final String PARAM_INCLUDE_TRAIN_STOP_ASSIGNMENTS = "includeTrainStopAssignments";
    public static final String PARAM_INCLUDE_TRANSPORT_MODES = "includeTransportModes";
    public static final String DESCRIPTION_INCLUDE_TRIP_OPERATING_DAYS =
        "`Trip::operatingPeriods` will always be returned if it is a **repeatable planned Trip over the period**. To enforce concrete planned dates in `OperatingPeriod::operatingDays`set `includeOperatingDays=true` (PTRideLeg::serviceJourney::operationPeriods will remain empty, because whole Trip is of interest)."
            + HINT_PERFORMANCE;
    public static final String DESCRIPTION_INCLUDE_INTERMEDIATE_STOPS =
        "Whether the `PTRideLeg's` should include intermediate stops (between the passenger's board and alight in `ServiceJourney::stopPoints`)." + ModelDoc.HINT_ENUM_EXTENSIBLE + " ["
            + IntermediateStopsEnum.ALL_AS_STRING + "," + IntermediateStopsEnum.NONE_AS_STRING + "," + IntermediateStopsEnum.BOARDING_ALIGHTING_AS_STRING + "] where "
            + IntermediateStopsEnum.ALL_AS_STRING + " is " + IntermediateStopsEnum.BOARDING_ALIGHTING_AS_STRING + " plus virtual stops.";

    public static final String DESCRIPTION_LEG_DISTANCE = "Total distance for Leg (in meter).";
    public static final String DESCRIPTION_LEG_ID = "Unique Index ordered within Trip (may be casted to Integer for local indexing).";
    public static final String HINT_INHERITED_LEG = "<br>Inherited from `Leg`.";

    //    public static final String DESCRIPTION_INCLUDE_TRAIN_STOP_ASSIGNMENTS =
    //        "Whether `PTRideLeg's` should include `CompoundTrain's`(aka formation, composition). However, `CompoundTrain's` at any `ScheduledStopPoint` on the `ServiceJourney` may be loaded separately by `/v0/vehicle-journeys/by-stoppoints`.\n" /*DatedVehicleJourneyController.API_VEHICLE_JOURNEYS_BY_STOPPOINTS*/
    //            +
    //            "Possible values:\n" +
    //            "- " + TrainStopAssignmentsEnum.TRAIN_STOP_ASSIGNMENT_NONE + " none at all, though a `PTRideLeg::trainStopAssignmentHint` is always given.\n" +
    //            "- " + TrainStopAssignmentsEnum.TRAIN_STOP_ASSIGNMENT_ORIGIN + "  `TrainStopAssignment's` are added to first (departure) `ScheduledStopPoint` of each `PTRideLeg` \n" +
    //            "- " + TrainStopAssignmentsEnum.TRAIN_STOP_ASSIGNMENT_ORIGIN_DESTINATION
    //            + " `TrainStopAssignment's` are added to first (departure) and last (arrival) `ScheduledStopPoint` of each `PTRideLeg` having a `TrainStopAssignment` resp. a `CompoundTrain`.";

    public static final String DEFAULT_DATE_TODAY = "defaults to TODAY";
    public static final String DEFAULT_TIME_NOW = "defaults to NOW";

    public static final String SAMPLE_WEIGHT = "30170";

    public static final String SAMPLE_SJYID = "ch:1:sjyid:100001:702-001";
    // see DURATION
    public static final String SAMPLE_DURATION = "P1DT2H4M";
    /**
     * UTC format: in CH for e.g. summer +2h, winter +1h
     *
     * @see #ISO8601
     */
    public static final String SAMPLE_OFFSETDATETIME = "2024-12-18T14:55:00+01:00";
    public static final String SAMPLE_DATE = "2024-12-18";
    public static final String SAMPLE_TIME = "13:07";
}
