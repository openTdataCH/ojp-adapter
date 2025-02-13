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
 * <p>Java-Klasse für DaysOfWeekEnumerationx.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DaysOfWeekEnumerationx"&gt;
 *   &lt;restriction base="{http://www.siri.org.uk/siri}DayTypeEnumeration"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="monday"/&gt;
 *     &lt;enumeration value="tuesday"/&gt;
 *     &lt;enumeration value="wednesday"/&gt;
 *     &lt;enumeration value="thursday"/&gt;
 *     &lt;enumeration value="friday"/&gt;
 *     &lt;enumeration value="saturday"/&gt;
 *     &lt;enumeration value="sunday"/&gt;
 *     &lt;enumeration value="mondayToFriday"/&gt;
 *     &lt;enumeration value="mondayToSaturday"/&gt;
 *     &lt;enumeration value="weekdays"/&gt;
 *     &lt;enumeration value="weekends"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "DaysOfWeekEnumerationx")
@XmlEnum(DayTypeEnumeration.class)
public enum DaysOfWeekEnumerationx {

    @XmlEnumValue("unknown")
    UNKNOWN(DayTypeEnumeration.UNKNOWN),
    @XmlEnumValue("monday")
    MONDAY(DayTypeEnumeration.MONDAY),
    @XmlEnumValue("tuesday")
    TUESDAY(DayTypeEnumeration.TUESDAY),
    @XmlEnumValue("wednesday")
    WEDNESDAY(DayTypeEnumeration.WEDNESDAY),
    @XmlEnumValue("thursday")
    THURSDAY(DayTypeEnumeration.THURSDAY),
    @XmlEnumValue("friday")
    FRIDAY(DayTypeEnumeration.FRIDAY),
    @XmlEnumValue("saturday")
    SATURDAY(DayTypeEnumeration.SATURDAY),
    @XmlEnumValue("sunday")
    SUNDAY(DayTypeEnumeration.SUNDAY),
    @XmlEnumValue("mondayToFriday")
    MONDAY_TO_FRIDAY(DayTypeEnumeration.MONDAY_TO_FRIDAY),
    @XmlEnumValue("mondayToSaturday")
    MONDAY_TO_SATURDAY(DayTypeEnumeration.MONDAY_TO_SATURDAY),
    @XmlEnumValue("weekdays")
    WEEKDAYS(DayTypeEnumeration.WEEKDAYS),
    @XmlEnumValue("weekends")
    WEEKENDS(DayTypeEnumeration.WEEKENDS);
    private final DayTypeEnumeration value;

    DaysOfWeekEnumerationx(DayTypeEnumeration v) {
        value = v;
    }

    public DayTypeEnumeration value() {
        return value;
    }

    public static DaysOfWeekEnumerationx fromValue(DayTypeEnumeration v) {
        for (DaysOfWeekEnumerationx c : DaysOfWeekEnumerationx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
