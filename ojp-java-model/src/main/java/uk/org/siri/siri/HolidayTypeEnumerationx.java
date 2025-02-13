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
 * <p>Java-Klasse für HolidayTypeEnumerationx.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="HolidayTypeEnumerationx"&gt;
 *   &lt;restriction base="{http://www.siri.org.uk/siri}DayTypeEnumeration"&gt;
 *     &lt;enumeration value="holiday"/&gt;
 *     &lt;enumeration value="publicHoliday"/&gt;
 *     &lt;enumeration value="religiousHoliday"/&gt;
 *     &lt;enumeration value="federalHoliday"/&gt;
 *     &lt;enumeration value="regionalHoliday"/&gt;
 *     &lt;enumeration value="nationalHoliday"/&gt;
 *     &lt;enumeration value="sundaysAndPublicHolidays"/&gt;
 *     &lt;enumeration value="schoolDays"/&gt;
 *     &lt;enumeration value="everyDay"/&gt;
 *     &lt;enumeration value="undefinedDayType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "HolidayTypeEnumerationx")
@XmlEnum(DayTypeEnumeration.class)
public enum HolidayTypeEnumerationx {

    @XmlEnumValue("holiday")
    HOLIDAY(DayTypeEnumeration.HOLIDAY),
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY(DayTypeEnumeration.PUBLIC_HOLIDAY),
    @XmlEnumValue("religiousHoliday")
    RELIGIOUS_HOLIDAY(DayTypeEnumeration.RELIGIOUS_HOLIDAY),
    @XmlEnumValue("federalHoliday")
    FEDERAL_HOLIDAY(DayTypeEnumeration.FEDERAL_HOLIDAY),
    @XmlEnumValue("regionalHoliday")
    REGIONAL_HOLIDAY(DayTypeEnumeration.REGIONAL_HOLIDAY),
    @XmlEnumValue("nationalHoliday")
    NATIONAL_HOLIDAY(DayTypeEnumeration.NATIONAL_HOLIDAY),
    @XmlEnumValue("sundaysAndPublicHolidays")
    SUNDAYS_AND_PUBLIC_HOLIDAYS(DayTypeEnumeration.SUNDAYS_AND_PUBLIC_HOLIDAYS),
    @XmlEnumValue("schoolDays")
    SCHOOL_DAYS(DayTypeEnumeration.SCHOOL_DAYS),
    @XmlEnumValue("everyDay")
    EVERY_DAY(DayTypeEnumeration.EVERY_DAY),
    @XmlEnumValue("undefinedDayType")
    UNDEFINED_DAY_TYPE(DayTypeEnumeration.UNDEFINED_DAY_TYPE);
    private final DayTypeEnumeration value;

    HolidayTypeEnumerationx(DayTypeEnumeration v) {
        value = v;
    }

    public DayTypeEnumeration value() {
        return value;
    }

    public static HolidayTypeEnumerationx fromValue(DayTypeEnumeration v) {
        for (HolidayTypeEnumerationx c : HolidayTypeEnumerationx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
