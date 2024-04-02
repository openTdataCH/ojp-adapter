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

/**
 * Open Journey Planer: Prognosed Occupancy (de:Belegung) per car.
 * <p>
 * SBB: Occupancy per car or whole transport-product.
 * <p>
 * siri:OccupancyEnumeration
 */
enum Occupancy /*implements Translatable*/ {
    /**
     * For e.g. displayed as greyed-out.
     */
    UNKNOWN(0),
    /**
     * For e.g. displayed as 1/3 resp. 0..50% de: tiefe bis mittlere Belegung
     */
    LOW(1),
    /**
     * For e.g. displayed as 2/3 resp. 50..80 de: hohe Belegung
     */
    MEDIUM(2),
    /**
     * For e.g. displayed as 3/3 resp. 80..% de: sehr hohe Belegung
     */
    HIGH(3);

    private final int degree;

    Occupancy(int degree) {
        this.degree = degree;
    }

    /**
     * Return the Enum value in thirds.
     * <ul>
     * <li>0 for unknown</li>
     * <li>1 for 1/3</li>
     * <li>2 for 2/3</li>
     * <li>3 for 3/3</li>
     * </ul>
     *
     * @return third-numerator
     */
    public int getDegree() {
        return degree;
    }

    public String printThirds() {
        return (UNKNOWN == this ? "?" : degree) + "/3";
    }
}
