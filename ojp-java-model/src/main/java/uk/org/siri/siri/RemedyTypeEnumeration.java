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
 * <p>Java-Klasse für RemedyTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RemedyTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="replace"/&gt;
 *     &lt;enumeration value="repair"/&gt;
 *     &lt;enumeration value="remove"/&gt;
 *     &lt;enumeration value="otherRoute"/&gt;
 *     &lt;enumeration value="otherLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "RemedyTypeEnumeration")
@XmlEnum
public enum RemedyTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("repair")
    REPAIR("repair"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("otherRoute")
    OTHER_ROUTE("otherRoute"),
    @XmlEnumValue("otherLocation")
    OTHER_LOCATION("otherLocation");
    private final String value;

    RemedyTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemedyTypeEnumeration fromValue(String v) {
        for (RemedyTypeEnumeration c : RemedyTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
