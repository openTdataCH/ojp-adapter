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

package swiss.opentransportdata.ojp.adapter.service.utils;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * ZonedDateTime and OffsetDateTime utilities, especially dealing with Swiss Timezone Journey-Planners.
 *
 * @author Peter Hirzel
 */
@Slf4j
@UtilityClass
public final class DateTimeUtils {

    /**
     * Timezone Switzerland.
     */
    public static final String TIMEZONE_CH = "Europe/Zurich";
    /**
     * Hafas returns all DateTime values in local time Switzerland. Assume the given region based ZoneId for all (date, time [,timezone]) values transmitted by Hafas::REST.
     */
    public static final ZoneId ZONE_ID_CH = ZoneId.of(TIMEZONE_CH);

    /**
     * 04:00 in the morning
     */
    private static final int PREVIOUS_NEXT_DAY_TIMELINE = 4;

    /**
     * Switzerland specific Journey-Planner definition. The Timeline for Journeys between previous and next day is 04:00 (24:00 Format) in the morning.
     *
     * @param date to determine the timeline
     * @return timeline for previous or next day
     */
    @NonNull
    public static ZonedDateTime toSwissFirstLastTripDateTime(@NonNull LocalDate date) {
        return createSwissDateTime(date, PREVIOUS_NEXT_DAY_TIMELINE, 0);
    }

    public static OffsetDateTime parseOffsetDateTime(String offsetDateTimeFormatted) {
        if (StringUtils.isBlank(offsetDateTimeFormatted)) {
            return null;
        } else {
            return OffsetDateTime.parse(offsetDateTimeFormatted);
        }
    }

    /**
     * @return current Swiss date
     */
    @NonNull
    public static LocalDate createSwissDate() {
        return LocalDate.now(ZONE_ID_CH);
    }

    /**
     * @param month in year
     * @param day in month
     * @return Date localized for Switzerland in current year
     */
    @NonNull
    public static LocalDate createSwissDate(int month, int day) {
        return LocalDate.of(createSwissDate().getYear(), month, day);
    }

    /**
     * @return hours and minutes for CH (seconds are truncated)
     */
    @NonNull
    public static LocalTime createSwissTime() {
        return LocalTime.now(ZONE_ID_CH).truncatedTo(ChronoUnit.MINUTES);
    }

    @NonNull
    public static ZonedDateTime createSwissDateTime(int hour, int minute) {
        return createSwissDateTime(createSwissDate(), hour, minute);
    }

    @NonNull
    public static ZonedDateTime createSwissDateTimeWeekday() {
        ZonedDateTime now = createSwissDateTime();
        return createSwissDateTimeWeekday(now.getHour(), now.getMinute());
    }

    /**
     * Mo-Fr only.
     *
     * @param hour like 13
     * @param minute like 51
     * @return current date shifted 2 days in the future if current is weekend
     */
    @NonNull
    public static ZonedDateTime createSwissDateTimeWeekday(int hour, int minute) {
        ZonedDateTime dateTime = createSwissDateTime(createSwissDate(), hour, minute);
        if (DayOfWeek.SATURDAY.equals(dateTime.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(dateTime.getDayOfWeek())) {
            dateTime = dateTime.plusDays(2);
        }
        return dateTime;
    }

    /**
     * @param dayOfWeek next possible day from now at given dayOfWeek
     * @return current date shifted 2 days in the future if current is weekend
     */
    @NonNull
    public static ZonedDateTime createSwissDateTimeDay(DayOfWeek dayOfWeek) {
        ZonedDateTime dateTime = createSwissDateTime(createSwissDate(), createSwissTime());
        while (!dayOfWeek.equals(dateTime.getDayOfWeek())) {
            dateTime = dateTime.plusDays(1);
        }
        return dateTime;
    }

    @NonNull
    public static ZonedDateTime createSwissDateTime(LocalDate date, int hour, int minute) {
        return createSwissDateTime(date, LocalTime.of(hour, minute));
    }

    /**
     * Hafas typical: No seconds or nanos supported!
     *
     * @param date to set (today if null)
     * @param time to set (now if null)
     * @return dateTime instance in Swiss zone
     */
    @NonNull
    public static ZonedDateTime createSwissDateTime(LocalDate date, LocalTime time) {
        return ZonedDateTime.of(date == null ? LocalDate.now() : date, time == null ? LocalTime.now() : time, ZONE_ID_CH).truncatedTo(ChronoUnit.MINUTES);
    }

    /**
     * Hafas typical: No seconds or nanos supported!
     *
     * @return current Swiss date/time instance adjusted for Hafas timetable queries
     */
    @NonNull
    public static ZonedDateTime createSwissDateTime() {
        return ZonedDateTime.now(ZONE_ID_CH).truncatedTo(ChronoUnit.MINUTES);
    }

    /**
     * @param dateTime instant
     * @return dateTime Swiss-zone ID
     */
    public static ZonedDateTime toSwissDateTime(ZonedDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }

        return dateTime.withZoneSameInstant(ZONE_ID_CH);
    }

    /**
     * The first letter indicates if the duration is as planned (P) or if it is based on the realtime situation (R). The remainder of the string contains the duration in format ##DT##H##M. The number
     * before the character 'D' shows the number of days, the number before 'H' the number of hours and the number before 'M' the number of minutes. Each number might be one or two digits. If days or
     * hours don't apply, the number together with the characters 'D' and/or 'H' will be missing.
     *
     * @param duration Trip::Duration, Leg::Duration
     * @return Duration instance formatted XSD to Duration
     * @see <a href="https://www.w3.org/TR/xmlschema11-2/#duration">duration</a>
     * @see <a href="http://www.datypic.com/sc/xsd/t-xsd_duration.html">Duration XSD</a>
     */
    @NonNull
    public static Duration toDuration(String duration) {
        if (StringUtils.isBlank(duration)) {
            log.debug("PATCH: Duration defaults to Duration.ZERO");
            return Duration.ZERO;
        }

        log.trace("Duration={}", duration);
        try {
            return Duration.parse(duration);
        } catch (java.time.format.DateTimeParseException pe) {
            log.error("Error parsing Duration String={} Message={} -> fallback: ZERO", duration, pe.getMessage());
            return Duration.ZERO;
        }
    }

    /**
     * Convert the OffsetDateTime to String.
     *
     * @param dateTime to convert
     * @return string representing the ISO OffsetDateTime
     */
    public static String formatOffsetDateTime(OffsetDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public static String formatLocalDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    /**
     * @param date
     * @return ISO local date format
     */
    public static String formatDate(LocalDate date) {
        if (date == null) {
            return null;
        } else {
            return date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }

    /**
     * @param start null for open-range
     * @param end null for open-range
     * @param target given date
     * @return wether target is between start and end
     * @see <a href="https://stackoverflow.com/questions/13583944/inclusive-date-range-check-in-joda-time/13584000#13584000">Stackoverflow</a>
     */
    public static boolean isBetweenInclusive(LocalDate start, LocalDate end, @NonNull LocalDate target) {
        return ((start == null) || !target.isBefore(start))
            && ((end == null) || !target.isAfter(end));
    }
}
