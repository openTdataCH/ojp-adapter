//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WeekOfMonthEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="WeekOfMonthEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="firstWeekOfMonth"/&gt;
 *     &lt;enumeration value="secondWeekOfMonth"/&gt;
 *     &lt;enumeration value="thirdWeekOfMonth"/&gt;
 *     &lt;enumeration value="fourthWeekOfMonth"/&gt;
 *     &lt;enumeration value="fifthWeekOfMonth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeekOfMonthEnum")
@XmlEnum
public enum WeekOfMonthEnum {

    @XmlEnumValue("firstWeekOfMonth")
    FIRST_WEEK_OF_MONTH("firstWeekOfMonth"),
    @XmlEnumValue("secondWeekOfMonth")
    SECOND_WEEK_OF_MONTH("secondWeekOfMonth"),
    @XmlEnumValue("thirdWeekOfMonth")
    THIRD_WEEK_OF_MONTH("thirdWeekOfMonth"),
    @XmlEnumValue("fourthWeekOfMonth")
    FOURTH_WEEK_OF_MONTH("fourthWeekOfMonth"),
    @XmlEnumValue("fifthWeekOfMonth")
    FIFTH_WEEK_OF_MONTH("fifthWeekOfMonth");
    private final String value;

    WeekOfMonthEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeekOfMonthEnum fromValue(String v) {
        for (WeekOfMonthEnum c: WeekOfMonthEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
