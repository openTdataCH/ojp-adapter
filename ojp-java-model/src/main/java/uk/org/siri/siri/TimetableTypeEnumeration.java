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
 * <p>Java-Klasse für TimetableTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TimetableTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="winter"/&gt;
 *     &lt;enumeration value="spring"/&gt;
 *     &lt;enumeration value="summer"/&gt;
 *     &lt;enumeration value="autumn"/&gt;
 *     &lt;enumeration value="special"/&gt;
 *     &lt;enumeration value="emergency"/&gt;
 *     &lt;enumeration value="undefinedTimetableType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TimetableTypeEnumeration")
@XmlEnum
public enum TimetableTypeEnumeration {

    /**
     * TPEG Pti33_0, unknown
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti33_1, winter
     */
    @XmlEnumValue("winter")
    WINTER("winter"),

    /**
     * TPEG Pti33_2, spring
     */
    @XmlEnumValue("spring")
    SPRING("spring"),

    /**
     * TPEG Pti33_3, summer
     */
    @XmlEnumValue("summer")
    SUMMER("summer"),

    /**
     * TPEG Pti33_4, autumn
     */
    @XmlEnumValue("autumn")
    AUTUMN("autumn"),

    /**
     * TPEG Pti33_5, special
     */
    @XmlEnumValue("special")
    SPECIAL("special"),

    /**
     * TPEG Pti33_6, emergency
     */
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),

    /**
     * TPEG Pti33_255, undefined timetable type
     */
    @XmlEnumValue("undefinedTimetableType")
    UNDEFINED_TIMETABLE_TYPE("undefinedTimetableType");
    private final String value;

    TimetableTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimetableTypeEnumeration fromValue(String v) {
        for (TimetableTypeEnumeration c : TimetableTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
