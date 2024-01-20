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

import lombok.experimental.UtilityClass;
import org.springframework.http.HttpHeaders;
import swiss.opentransportdata.ojp.adapter.model.common.response.JsonExtensibleEnum;

@UtilityClass
public class ModelDoc {

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

    public static final String DESCRIPTION_INHERITANCEDISCRIMINATOR_TYPE = "**Inheritance discriminator to proper Subclass** " +
        "(technical field required by [OpenApi 3 Discriminator](https://swagger.io/docs/specification/data-models/inheritance-and-polymorphism/)) makes deserialization at consumer side easier.";

    /**
     * Often used suffixes to property: *Name, *ShortName, *Formatted
     */
    public static final String TRANSLATED_TEXT = "<br>(Translated according to " + HttpHeaders.ACCEPT_LANGUAGE + ".)";

    public static final String HINT_INHERITED_PLACE = "<br>Inherited from `Place`.";
    public static final String PLACES_DISTANCE = "Specifies the distance in [m] to the given coordinates in request.";
    /**
     * @see <a href="https://unioninternationalcheminsdefer.github.io/OSDM/spec/catalog-of-code-lists">station prefix urn:uic.stn</a>
     */
    public static final String DESCRIPTION_STOP_PLACE_ID = "UIC of a StopPlace (according to DiDok format).";
    public static final String SAMPLE_STOPPLACE_ID = "8507000";
    public static final String DESCRIPTION_CANTON = "In CH this represents the 'canton' abbreviation.";
    public static final String EXAMPLE_CANTON = "BE";
    public static final String DESCRIPTION_SLOID = "Swiss location id (SLOID) from DiDok. More on [Service Points (DiDok) API](https://developer.sbb.ch/apis/servicepoints/documentation).";
    public static final String EXAMPLE_SLOID_STOP_PLACE = "ch:1:sloid:16161";
    public static final String DESCRIPTION_COUNTRY_CODE = "The two uppercase character of ISO 3166 code, mostly similar to lowercase IANA identifier (source: DiDok geographic-based _isoCountryCode_).";
    public static final String EXAMPLE_COUNTRY_CODE = "CH";
    public static final String DESCRIPTION_POSITION = "A representative geographic position of the `Place` by a [GeoJSON Point](https://datatracker.ietf.org/doc/html/rfc794).";
    public static final String DESCRIPTION_WEIGHT = "The higher the traffic load/importance the higher the value, null if unknown.";
    public static final String EXAMPLE_WEIGHT = "30170";
    public static final String SAMPLE_SJYID = "ch:1:sjyid:100001:702-001";
    // see DURATION
    public static final String SAMPLE_DURATION = "P1DT2H4M";
    /**
     * UTC format: in CH for e.g. summer +2h, winter +1h
     *
     * @see #ISO8601
     */
    public static final String SAMPLE_OFFSETDATETIME = "2024-04-18T14:55:00+01:00";
    public static final String SAMPLE_STRETCHMINUTES = "5";
    public static final String SAMPLE_DATE = "2024-04-18";
    public static final String SAMPLE_TIME = "13:07";
}
