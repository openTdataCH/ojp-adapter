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
 * <p>Java-Klasse für SanitaryFacilityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="SanitaryFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_22"/&gt;
 *     &lt;enumeration value="toilet"/&gt;
 *     &lt;enumeration value="pti23_23"/&gt;
 *     &lt;enumeration value="noToilet"/&gt;
 *     &lt;enumeration value="shower"/&gt;
 *     &lt;enumeration value="wheelchairAcccessToilet"/&gt;
 *     &lt;enumeration value="babyChange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "SanitaryFacilityEnumeration")
@XmlEnum
public enum SanitaryFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_22")
    PTI_23___22("pti23_22"),
    @XmlEnumValue("toilet")
    TOILET("toilet"),
    @XmlEnumValue("pti23_23")
    PTI_23___23("pti23_23"),
    @XmlEnumValue("noToilet")
    NO_TOILET("noToilet"),
    @XmlEnumValue("shower")
    SHOWER("shower"),
    @XmlEnumValue("wheelchairAcccessToilet")
    WHEELCHAIR_ACCCESS_TOILET("wheelchairAcccessToilet"),
    @XmlEnumValue("babyChange")
    BABY_CHANGE("babyChange");
    private final String value;

    SanitaryFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SanitaryFacilityEnumeration fromValue(String v) {
        for (SanitaryFacilityEnumeration c : SanitaryFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
