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
 * <p>Java-Klasse für ReservedSpaceFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ReservedSpaceFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="lounge"/&gt;
 *     &lt;enumeration value="hall"/&gt;
 *     &lt;enumeration value="meetingpoint"/&gt;
 *     &lt;enumeration value="groupPoint"/&gt;
 *     &lt;enumeration value="reception"/&gt;
 *     &lt;enumeration value="shelter"/&gt;
 *     &lt;enumeration value="seats"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservedSpaceFacilityEnumeration")
@XmlEnum
public enum ReservedSpaceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lounge")
    LOUNGE("lounge"),
    @XmlEnumValue("hall")
    HALL("hall"),
    @XmlEnumValue("meetingpoint")
    MEETINGPOINT("meetingpoint"),
    @XmlEnumValue("groupPoint")
    GROUP_POINT("groupPoint"),
    @XmlEnumValue("reception")
    RECEPTION("reception"),
    @XmlEnumValue("shelter")
    SHELTER("shelter"),
    @XmlEnumValue("seats")
    SEATS("seats");
    private final String value;

    ReservedSpaceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservedSpaceFacilityEnumeration fromValue(String v) {
        for (ReservedSpaceFacilityEnumeration c: ReservedSpaceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
