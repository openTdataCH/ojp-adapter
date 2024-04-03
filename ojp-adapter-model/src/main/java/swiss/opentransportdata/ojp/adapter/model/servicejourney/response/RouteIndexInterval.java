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

/**
 * Some types declare a validity within scheduled Stop routeIndices.
 */
public interface RouteIndexInterval {

    /**
     * See the JourneySegment#getStops() list for details of the stop/station.
     * <p>
     * Relates to Stop#getRouteIndex()
     *
     * @return first stop/station where this name is valid; null if unknown
     */
    default Integer getRouteIndexFrom() {
        return null;
    }

    /**
     * Relates to Stop#getRouteIndex()
     *
     * @return last stop/station where this name is valid; null if unknown
     */
    default Integer getRouteIndexTo() {
        return null;
    }
}
