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

import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import swiss.opentransportdata.ojp.adapter.model.servicejourney.response.Quay;

/**
 * @author Florian Hof
 */
@UtilityClass
public class QuayConverter {

    //    public static List<Quay> mapToQuays(@NonNull Integer stopPlaceUic, Collection<Track> tracks) {
    //        return tracks.stream()
    //            .map(track -> mapToQuay(stopPlaceUic, track))
    //            .filter(Objects::nonNull)
    //            .collect(Collectors.toList());
    //    }
    //
    //    public static Quay mapToQuay(@NonNull Integer stopPlaceUic, Track track) {
    //        if ((track == null) || StringUtils.isBlank(track.getTrackId().getTrack())) {
    //            return null;
    //        }
    //        String trackName = track.getTrackId().getTrack();
    //        String perron = track.getPerron();
    //        return Quay.builder()
    //            .id(getQuayId("" + stopPlaceUic, trackName))
    //            //.swissLocationId(track.getSwissLocationId) // TODO
    //            .name(trackName)
    //            .parentId(perron == null ? null : "" + stopPlaceUic + "_" + perron)
    //            .build();
    //    }

    public static Quay mapToQuay(@NonNull String stopPlaceUic, String trackName, String trackSwissLocationId) {
        if (StringUtils.isBlank(trackName)) {
            return null;
        }
        return Quay.builder()
            .id(getQuayId("" + stopPlaceUic, trackName))
            .swissLocationId(trackSwissLocationId)
            .name(trackName)
            .build();
    }

    private static String getQuayId(@NonNull String stopPlaceUic, String track) {
        return stopPlaceUic + "_" + track;
    }
}
