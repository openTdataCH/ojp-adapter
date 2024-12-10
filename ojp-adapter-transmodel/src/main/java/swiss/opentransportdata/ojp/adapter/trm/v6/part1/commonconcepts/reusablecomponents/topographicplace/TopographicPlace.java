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

package swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.reusablecomponents.topographicplace;

import swiss.opentransportdata.ojp.adapter.trm.v6.part1.commonconcepts.genericframework.genericplace.Place;

/**
 * A type of PLACE providing the topographical context when searching for or presenting travel information, for example as the origin or destination of a trip. It may be of any size (e.g. County,City,
 * Town, Village) and of different specificity (e.g. Greater London, London, West End, Westminster, St James s).
 */
public interface TopographicPlace extends Place {

}
