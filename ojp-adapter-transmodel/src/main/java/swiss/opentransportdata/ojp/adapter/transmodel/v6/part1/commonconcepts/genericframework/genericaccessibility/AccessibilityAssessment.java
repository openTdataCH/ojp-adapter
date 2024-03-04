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

package swiss.opentransportdata.ojp.adapter.transmodel.v6.part1.commonconcepts.genericframework.genericaccessibility;

/**
 * The accessibility characteristics of an entity used by passengers such as a STOP PLACE, or a STOP PLACE COMPONENT. Described by ACCESSIBILITY LIMITATIONs, and/or a set of SUITABILITies.
 * <p>
 * The accessibility of a site is described using an ACCESSIBILITY ASSESSMENT: this allows to express the accessibility either in terms of suitability for specific USER NEEDs – for example wheelchair,
 * hearing impaired, vision impaired, lift-averse, etc. - using a SUITABILITY element, or in terms of ACCESSIBILITY LIMITATIONs, i.e. description of the limitations of a site to support a specific
 * need, for example Wheelchair, Step free, Escalator free, Lift free or both.
 */
public interface AccessibilityAssessment {
    /*
    // Whether the overall assessment is that there is Access for Mobility Impaired users.
    Boolean mobilityImpairedAccess;

    List<AccessibilityLimitation> determining>;
     */
}
