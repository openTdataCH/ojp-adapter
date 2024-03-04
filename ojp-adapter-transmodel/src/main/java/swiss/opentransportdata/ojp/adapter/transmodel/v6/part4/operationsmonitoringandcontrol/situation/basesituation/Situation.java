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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part4.operationsmonitoringandcontrol.situation.basesituation;

/**
 * An incident or deviation affecting traffic or travel circumstances.
 */
public interface Situation {

    /*
     * @return Identifier of SITUATION.
    String getId();
     */

    // SituationCause cause of [1..*]

    // progress

    /*
     * Unique identifier of SITUATION within a Participant that is retained across all versions of the SITUATION.
     * situationNumber
     */
}
