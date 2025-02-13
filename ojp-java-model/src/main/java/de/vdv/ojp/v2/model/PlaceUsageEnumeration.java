//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für PlaceUsageEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PlaceUsageEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="origin"/&gt;
 *     &lt;enumeration value="via"/&gt;
 *     &lt;enumeration value="destination"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PlaceUsageEnumeration")
@XmlEnum
public enum PlaceUsageEnumeration {

    @XmlEnumValue("origin")
    ORIGIN("origin"),
    @XmlEnumValue("via")
    VIA("via"),
    @XmlEnumValue("destination")
    DESTINATION("destination");
    private final String value;

    PlaceUsageEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceUsageEnumeration fromValue(String v) {
        for (PlaceUsageEnumeration c : PlaceUsageEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
