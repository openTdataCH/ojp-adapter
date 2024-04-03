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

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OperatorHelper {

    private static final int OPERATOR_NUMBER_CH_NUMERIC_LENGTH = 6;
    private static final String OPERATOR_NUMBER_PADDING_VALUE = "0";

    /**
     * @param value Business Organisation resp. Operator::number
     * @return leading "0" removed if numeric
     * @see #padLeadingZerosIfNumeric(String)
     */
    public static String stripLeadingZeroesIfNumeric(String value) {
        if (StringUtils.isNumeric(value)) {
            return StringUtils.stripStart(value, OPERATOR_NUMBER_PADDING_VALUE);
        }
        return value;
    }

    /**
     * Operator::number by Hafas is given with leading "0" and is also expected by NOVA for Ticketing.
     *
     * @param value Business Organisation resp. Operator::number
     * @return manipulated according to Hafas
     * @see #stripLeadingZeroesIfNumeric(String)
     */
    public static String padLeadingZerosIfNumeric(String value) {
        if (StringUtils.isNumeric(value)) {
            return StringUtils.leftPad(value, OPERATOR_NUMBER_CH_NUMERIC_LENGTH, OPERATOR_NUMBER_PADDING_VALUE);
        }
        return value;
    }
}
