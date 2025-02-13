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
 * <p>Java-Klasse für StopEventTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="StopEventTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="departure"/&gt;
 *     &lt;enumeration value="arrival"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "StopEventTypeEnumeration")
@XmlEnum
public enum StopEventTypeEnumeration {

    @XmlEnumValue("departure")
    DEPARTURE("departure"),
    @XmlEnumValue("arrival")
    ARRIVAL("arrival"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    StopEventTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopEventTypeEnumeration fromValue(String v) {
        for (StopEventTypeEnumeration c : StopEventTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
