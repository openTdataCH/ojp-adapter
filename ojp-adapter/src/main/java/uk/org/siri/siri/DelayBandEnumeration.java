//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DelayBandEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DelayBandEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="delayTwoMinutes"/&gt;
 *     &lt;enumeration value="upToThreeMinutes"/&gt;
 *     &lt;enumeration value="upToFourMinutes"/&gt;
 *     &lt;enumeration value="upToFiveMinutes"/&gt;
 *     &lt;enumeration value="upToEightMinutes"/&gt;
 *     &lt;enumeration value="negligible"/&gt;
 *     &lt;enumeration value="upToTenMinutes"/&gt;
 *     &lt;enumeration value="betweenTenMinutesAndThirtyMinutes"/&gt;
 *     &lt;enumeration value="betweenThirtyMinutesAndOneHour"/&gt;
 *     &lt;enumeration value="betweenOneHourAndThreeHours"/&gt;
 *     &lt;enumeration value="betweenThreeHoursAndSixHours"/&gt;
 *     &lt;enumeration value="longerThanSixHours"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelayBandEnumeration")
@XmlEnum
public enum DelayBandEnumeration {

    @XmlEnumValue("delayTwoMinutes")
    DELAY_TWO_MINUTES("delayTwoMinutes"),
    @XmlEnumValue("upToThreeMinutes")
    UP_TO_THREE_MINUTES("upToThreeMinutes"),
    @XmlEnumValue("upToFourMinutes")
    UP_TO_FOUR_MINUTES("upToFourMinutes"),
    @XmlEnumValue("upToFiveMinutes")
    UP_TO_FIVE_MINUTES("upToFiveMinutes"),
    @XmlEnumValue("upToEightMinutes")
    UP_TO_EIGHT_MINUTES("upToEightMinutes"),
    @XmlEnumValue("negligible")
    NEGLIGIBLE("negligible"),
    @XmlEnumValue("upToTenMinutes")
    UP_TO_TEN_MINUTES("upToTenMinutes"),
    @XmlEnumValue("betweenTenMinutesAndThirtyMinutes")
    BETWEEN_TEN_MINUTES_AND_THIRTY_MINUTES("betweenTenMinutesAndThirtyMinutes"),
    @XmlEnumValue("betweenThirtyMinutesAndOneHour")
    BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR("betweenThirtyMinutesAndOneHour"),
    @XmlEnumValue("betweenOneHourAndThreeHours")
    BETWEEN_ONE_HOUR_AND_THREE_HOURS("betweenOneHourAndThreeHours"),
    @XmlEnumValue("betweenThreeHoursAndSixHours")
    BETWEEN_THREE_HOURS_AND_SIX_HOURS("betweenThreeHoursAndSixHours"),
    @XmlEnumValue("longerThanSixHours")
    LONGER_THAN_SIX_HOURS("longerThanSixHours");
    private final String value;

    DelayBandEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelayBandEnumeration fromValue(String v) {
        for (DelayBandEnumeration c: DelayBandEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
