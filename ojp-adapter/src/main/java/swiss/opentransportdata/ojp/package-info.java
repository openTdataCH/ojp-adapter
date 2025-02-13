/*
 * Copyright 2023 Peter Hirzel
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

/**
 * Library to access Open Journey Planner (OJP) Public Transportation router.
 * <p>
 * Design goal: Easy Adapter to assist dealing with OJP 1.0 XML based requests and responses.
 * <ul>
 *     <li>v1 relates to vdv.OJP v1.0.1 xsd</li>
 * </ul>
 *
 * @see <a href=" https://opentransportdata.swiss/de/dataset/ojp2-0">OJP Manual (swiss passive instance)</a>
 * @see <a href="https://github.com/openTdataCH/opj-adapter>Github repository of this Software</a>
 */

package swiss.opentransportdata.ojp;