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
 * <p>Java-Klasse für DayTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DayTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="monday"/&gt;
 *     &lt;enumeration value="tuesday"/&gt;
 *     &lt;enumeration value="wednesday"/&gt;
 *     &lt;enumeration value="thursday"/&gt;
 *     &lt;enumeration value="friday"/&gt;
 *     &lt;enumeration value="saturday"/&gt;
 *     &lt;enumeration value="sunday"/&gt;
 *     &lt;enumeration value="weekdays"/&gt;
 *     &lt;enumeration value="weekends"/&gt;
 *     &lt;enumeration value="holiday"/&gt;
 *     &lt;enumeration value="publicHoliday"/&gt;
 *     &lt;enumeration value="religiousHoliday"/&gt;
 *     &lt;enumeration value="federalHoliday"/&gt;
 *     &lt;enumeration value="regionalHoliday"/&gt;
 *     &lt;enumeration value="nationalHoliday"/&gt;
 *     &lt;enumeration value="mondayToFriday"/&gt;
 *     &lt;enumeration value="mondayToSaturday"/&gt;
 *     &lt;enumeration value="sundaysAndPublicHolidays"/&gt;
 *     &lt;enumeration value="schoolDays"/&gt;
 *     &lt;enumeration value="everyDay"/&gt;
 *     &lt;enumeration value="undefinedDayType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "DayTypeEnumeration")
@XmlEnum
public enum DayTypeEnumeration {

    /**
     * TPEG Pti34_0, unknown
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti34_1, Monday
     */
    @XmlEnumValue("monday")
    MONDAY("monday"),

    /**
     * TPEG Pti34_2, Tuesday
     */
    @XmlEnumValue("tuesday")
    TUESDAY("tuesday"),

    /**
     * TPEG Pti34_3, Wednesday
     */
    @XmlEnumValue("wednesday")
    WEDNESDAY("wednesday"),

    /**
     * TPEG Pti34_4, Thursday
     */
    @XmlEnumValue("thursday")
    THURSDAY("thursday"),

    /**
     * TPEG Pti34_5, Friday
     */
    @XmlEnumValue("friday")
    FRIDAY("friday"),

    /**
     * TPEG Pti34_6, Saturday
     */
    @XmlEnumValue("saturday")
    SATURDAY("saturday"),

    /**
     * TPEG Pti34_7, Sunday
     */
    @XmlEnumValue("sunday")
    SUNDAY("sunday"),

    /**
     * TPEG Pti34_8, weekdays
     */
    @XmlEnumValue("weekdays")
    WEEKDAYS("weekdays"),

    /**
     * TPEG Pti34_9, weekends
     */
    @XmlEnumValue("weekends")
    WEEKENDS("weekends"),

    /**
     * TPEG Pti34_10, holiday
     */
    @XmlEnumValue("holiday")
    HOLIDAY("holiday"),

    /**
     * TPEG Pti34_11, public holiday
     */
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY("publicHoliday"),

    /**
     * TPEG Pti34_12, religious holiday
     */
    @XmlEnumValue("religiousHoliday")
    RELIGIOUS_HOLIDAY("religiousHoliday"),

    /**
     * TPEG Pti34_13, federal holiday
     */
    @XmlEnumValue("federalHoliday")
    FEDERAL_HOLIDAY("federalHoliday"),

    /**
     * TPEG Pti34_14, regional holiday
     */
    @XmlEnumValue("regionalHoliday")
    REGIONAL_HOLIDAY("regionalHoliday"),

    /**
     * TPEG Pti34_15, national holiday
     */
    @XmlEnumValue("nationalHoliday")
    NATIONAL_HOLIDAY("nationalHoliday"),

    /**
     * TPEG Pti34_16, Monday to Friday
     */
    @XmlEnumValue("mondayToFriday")
    MONDAY_TO_FRIDAY("mondayToFriday"),

    /**
     * TPEG Pti34_17, Monday to Saturday
     */
    @XmlEnumValue("mondayToSaturday")
    MONDAY_TO_SATURDAY("mondayToSaturday"),

    /**
     * TPEG Pti34_18, Sundays and public holidays
     */
    @XmlEnumValue("sundaysAndPublicHolidays")
    SUNDAYS_AND_PUBLIC_HOLIDAYS("sundaysAndPublicHolidays"),

    /**
     * TPEG Pti34_19, school days
     */
    @XmlEnumValue("schoolDays")
    SCHOOL_DAYS("schoolDays"),

    /**
     * TPEG Pti34_20, every day
     */
    @XmlEnumValue("everyDay")
    EVERY_DAY("everyDay"),

    /**
     * TPEG Pti34_255, undefined day type
     */
    @XmlEnumValue("undefinedDayType")
    UNDEFINED_DAY_TYPE("undefinedDayType");
    private final String value;

    DayTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayTypeEnumeration fromValue(String v) {
        for (DayTypeEnumeration c : DayTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
