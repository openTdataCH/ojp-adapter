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

import de.vdv.ojp.PlaceTypeEnumeration;
import de.vdv.ojp.model.OJP;
import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import jdk.jfr.Experimental;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import swiss.opentransportdata.ojp.adapter.OJPException;
import swiss.opentransportdata.ojp.adapter.configuration.OJPAccessor;
import swiss.opentransportdata.ojp.adapter.model.place.request.PlaceTypeEnum;
import swiss.opentransportdata.ojp.adapter.model.place.response.PlaceResponse;
import swiss.opentransportdata.ojp.adapter.v1.OJPAdapter;
import swiss.opentransportdata.ojp.adapter.v1.PlaceRequestFilter;

/**
 * Facade to interact with OJP using Transmodel (TRM6) like models, therefore this is a kind of OJP overlay.
 * <p>
 * Requests against OJP by {@link OJPAdapter} and maps native OJP XML responses to TRM implementations models.
 *
 * @author Peter Hirzel
 */
@Slf4j
@Component
public class OJPFacade {

    /**
     * Hint for SKI+ OJP Support-Team about use case usage of OJP active/passive instance.
     */
    static final String CALLER_REF = "OJP-Adapter";
    /**
     * According to SKI+ Andreas Glauser, data available 2 weeks back only.
     */
    @Experimental
    private static final int JOURNEY_PLANNER_PAST_DAYS_TO_SUPPORT = 21;
    static final String JOURNEY_PLANNER_DAYS_DETAIL = "Too old, no more Journey-Planner data available.";

    private final PlaceConverter placeConverter;
    //    private final TripConverter tripConverter;
    //    private final ServiceJourneyConverter serviceJourneyConverter;

    private final OJPAdapter ojpAdapter;

    @Autowired
    public OJPFacade(OJPConfiguration ojpConfiguration,
        @Qualifier("OJPPlaceConverter") PlaceConverter placeConverter /*,
        @Qualifier("OJPTripConverter") TripConverter tripConverter,
        @Qualifier("OJPDepartureConverter") ServiceJourneyConverter serviceJourneyConverter*/) {

        this.ojpAdapter = new OJPAdapter(ojpConfiguration.createWebClient(), CALLER_REF);
        this.placeConverter = placeConverter;
        //        this.tripConverter = tripConverter;
        //        this.serviceJourneyConverter = serviceJourneyConverter;
    }

    static boolean isTooOld(LocalDate date) {
        if (date == null) {
            // NOW
            return false;
        }
        return !date.isAfter(LocalDate.now().minusDays(JOURNEY_PLANNER_PAST_DAYS_TO_SUPPORT));
    }

    static Set<PlaceTypeEnumeration> mapToPlaceTypes(Set<PlaceTypeEnum> types) {
        if (CollectionUtils.isEmpty(types) || types.contains(PlaceTypeEnum.ALL) || (types.size() >= 3)) {
            // not supported yet: PlaceTypeEnumeration.COORD, PlaceTypeEnumeration.TOPOGRAPHIC_PLACE
            return Set.of(PlaceTypeEnumeration.STOP, PlaceTypeEnumeration.ADDRESS, PlaceTypeEnumeration.POI);
        }

        return types.stream()
            .map(type -> switch (type) {
                case StopPlace -> PlaceTypeEnumeration.STOP;
                case PointOfInterest -> PlaceTypeEnumeration.POI;
                case Address -> PlaceTypeEnumeration.ADDRESS;
                case ALL -> throw new IllegalStateException("developer fault: ALL should not remain any more");
            })
            .collect(Collectors.toSet());
    }

    /**
     * Find Place's by OJP.
     *
     * @param ojpAccessor OJP instance and token
     * @param filter search filter
     * @return response containing a list of {@link swiss.opentransportdata.ojp.adapter.model.place.response.Place}
     * @throws OJPException
     */
    @NonNull
    public PlaceResponse requestPlaces(@NonNull OJPAccessor ojpAccessor, @NonNull PlaceRequestFilter filter) throws OJPException {
        final OJP ojpResponse = ojpAdapter.requestPlaces(ojpAccessor, filter);
        return placeConverter.convertToDTO(ojpResponse);
    }
}