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

package swiss.opentransportdata.ojp.adapter.trm.v6.part2.ptnetworktopology.fixedobject.checkconstraint;

/**
 * Characteristics of a process that takes place at a SITE COMPONENT, such as check-in, security screening, ticket control or immigration, that may potentially incur a time penalty that should be
 * allowed for when journey planning.
 */
public interface CheckConstraint {

    // id

    /**
     * @return Name of CHECK CONSTRAINT.
     */
    String getName();

    // order
}
