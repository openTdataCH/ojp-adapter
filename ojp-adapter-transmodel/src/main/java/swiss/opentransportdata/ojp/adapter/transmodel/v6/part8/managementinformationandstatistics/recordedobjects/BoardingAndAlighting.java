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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part8.managementinformationandstatistics.recordedobjects;

/**
 * The numbers of passengers boarding and alighting at a STOP POINT during a RECORDED STOP.
 */
public interface BoardingAndAlighting {
    // id: BoardingAndAlightingType

    // Number of passengers alighting.
    // Integer: numberOfAlighters;

    // Number of passengers boarding.
    // Integer: numberOfBoarders;

    // Whether the VEHICLE is occupied.
    // occupancy: boolean
}
