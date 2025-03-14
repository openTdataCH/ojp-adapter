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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.time.OffsetDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import swiss.opentransportdata.ojp.adapter.model.ModelDoc;
import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.reusabletimeelements.servicecalendar.OperatingDay;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.stopassignment.PassengerStopAssignment;
import swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.tacticalplanningcomponents.stopassignment.StopAssignment;
import swiss.opentransportdata.ojp.adapter.trm.v6.part3.timinginformationandvehiclescheduling.journeyandjourneytimes.passingtime.TimetabledPassingTime;
import swiss.opentransportdata.ojp.adapter.trm.v6.part4.operationsmonitoringandcontrol.oc_call.om_call.Call;

/**
 * Class is scoped due to conventions, Transmodel, OJP, OSDM all have their own interpretations of this original NeTeX {@link Call} VIEW.
 * <p>
 * {@link swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.stopplace.Quay} for e.g. is also known to be given on {@link PassengerStopAssignment}
 * <p>
 * aka OSDM TimedLeg::start (Board), ::end (Alight)
 */
@Schema(description = "Passing a `ScheduledStopPoint` on a `ServiceJourney` may have two 'views': one for arrival and one for departure aspects (aka OJP LegAlight::StopPoint, LegBoard::StopPoint; NeTeX Call (which is a VIEW on a `ScheduledStopPoint`).")
@Builder
@Getter
public class StopCall implements Call, TimetabledPassingTime {

    /**
     * Like TimetabledPassingTime::arrivalTime or ::departureTime
     * <p>
     * Nullable in cases like: virtual Stop with dateTimeRt only, redefined Trips, HCCS Trips (incomplete)
     *
     * @see OperatingDay
     */
    @Schema(description = "Date/time (" + ModelDoc.ISO8601 + ") **planned**, relates to `timeRt` (might be null for e.g. in virtual stops).", example = ModelDoc.SAMPLE_OFFSETDATETIME)
    @JsonProperty
    OffsetDateTime timeAimed;

    // like TimetabledPassingTime at[1]
    @Schema(description = "Date/time (" + ModelDoc.ISO8601 + ") in **realtime** (oversteers related `timeAimed`!).")
    @JsonProperty
    OffsetDateTime timeRt;

    @Schema(description = "Formatted passenger message about the delay (may also relate to `ScheduledStopPoint::delayUndefined`) in the role of this call according to SBB business rules.", example = "ca. +5'")
    @JsonProperty
    String delayText;

    /**
     * @see ServiceJourney#getQuayTypeName()
     * @see #getQuayFormatted()
     */
    @Schema(description = "Platform planned.", example = "12ABCD")
    @JsonProperty
    Quay quayAimed;

    @Schema(description = "Platform realtime, null if as planned `quayAimed`.", example = "13")
    @JsonProperty
    Quay quayRt;

    /**
     * @see ServiceJourney#getQuayTypeName()
     */
    @Schema(description = "Related to `quayAimed` and `quayRt`." + ModelDoc.HINT_QUAY_CHANGE, requiredMode = RequiredMode.REQUIRED, defaultValue = "false")
    @JsonProperty(required = true)
    boolean quayChanged;

    /**
     * Considered as rt related data, for planned only use {@link #getQuayAimed()}
     */
    @Schema(description = "Principally same as related `Quay::name` (where rt wins over aimed), but in case of wing-trains (de:Flügelzüge) specified with **direction specific boarding-sections**.<br>"
        + "(For e.g. 'Bern to Zweisimmen' with a split of train-composition at Spiez where customers might reach the wrong destination if they board the wrong car!)", example = "12CD")
    @JsonProperty
    String quayFormatted;

    /**
     * {@link ScheduledStopPoint} has n {@link StopAssignment} inheriting further specialisations.
     */
    @Schema(description = "Related to `quay*`. **Currently given for `ScheduledStopPoint::departure StopCall`**, by means after vehicle coupling or separating.")
    @JsonProperty
    @Setter
    TrainStopAssignment trainStopAssignment;

    /**
     * By convention: last arrival before Via transfer may have such a hint.
     * <p>
     * {@link ScheduledStopPoint} has n {@link StopAssignment} inheriting further specialisations.
     */
    @Schema(description =
        "**Currently given on `arrival StopCall`** and contains transfer hints when alighting at `ScheduledStopPoint::stopPlace` about the **transfer to the next `ScheduledStopPoint::departure` " +
            "for boarding** the connecting vehicle, if any. Relates to parameter `includeAccessibility` not in [ALL, NONE].")
    @JsonProperty
    NavigationPathAssignment navigationPathAssignment;
}