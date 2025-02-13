//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für CongestionEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CongestionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noWaiting"/&gt;
 *     &lt;enumeration value="queue"/&gt;
 *     &lt;enumeration value="crowding"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "CongestionEnumeration")
@XmlEnum
public enum CongestionEnumeration {

    @XmlEnumValue("noWaiting")
    NO_WAITING("noWaiting"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("crowding")
    CROWDING("crowding"),
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    CongestionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CongestionEnumeration fromValue(String v) {
        for (CongestionEnumeration c : CongestionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
