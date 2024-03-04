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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.reusablecomponents.alternativename;

/**
 * Alternative name for the entity.
 */
public interface AlternativeName {

    /**
     * @return Abbreviation associated with alternative name.
     */
    String abbreviation();

    /**
     * @return Text for alternative name.
     */
    String getName();

    /**
     * @return Short version of alternative name.
     */
    String getShortName();

    // qualifierName
}
