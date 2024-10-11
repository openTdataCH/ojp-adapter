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

import java.util.Arrays;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

/**
 * UIC codes are maintained by Atlas (SBB Infrastruktur) and relate to ENEE UIC Database (Paris, EOF 1.6.2019!).
 * <p>
 * They contain:
 * <ul>
 *   <li>CH Train-stations - CH Bus/Tramway-stations (speciality, other countries usually manage only train-stations)</li>
 *   <li>foreign UIC train stations, though they are often self defined by Atlas and must not be equivalent to other country definitions (unless they are in the ENEE DB)</li>
 * </ul
 * <p>
 * Atlas manages all UIC codes.
 */
@UtilityClass
public class StopPlaceHelper {

    /**
     * de:Doppelgleis for e.g. "12/13", where typically short before arrival/departure concrete track is decided.
     * <p>
     * Planned: "12/13" to Rt "13" is not a platform change but a concretisation.
     */
    private static final String MULTI_TRACK_DELIMITER = "/";

    /**
     * Business rule implementation for platform change.
     *
     * @param track Station::track planned
     * @param trackRt Station::trackRt
     * @return true: signal platform change to customer
     */
    public static boolean hasPlatformChanged(String track, String trackRt) {
        if (StringUtils.isBlank(trackRt)) {
            return false;
        }

        String trackNumber = "";
        if (StringUtils.isNotBlank(track)) {

            String[] tracks = track.split(MULTI_TRACK_DELIMITER);
            boolean anyPlatformMatch = Arrays.asList(tracks).contains(trackRt);
            if (anyPlatformMatch) {
                return false;
            }

            // case: track="3"; trackRt="3ABC" -> is not a platform change but a concretisation
            trackNumber = containsTrackAnyDigit(track) ? removeNonDigitsOf(track) : track;
        }

        String trackNumberRt = containsTrackAnyDigit(trackRt) ? removeNonDigitsOf(trackRt) : trackRt;

        return !trackNumberRt.equals(trackNumber);
    }

    private static boolean containsTrackAnyDigit(String trackRt) {
        return trackRt.matches(".*\\d+.*");
    }

    private static String removeNonDigitsOf(String track) {
        return track.replaceAll("\\D+", "");
    }
}
