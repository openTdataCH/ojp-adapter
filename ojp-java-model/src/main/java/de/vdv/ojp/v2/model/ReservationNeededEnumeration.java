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
 * <p>Java-Klasse für ReservationNeededEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ReservationNeededEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="service"/&gt;
 *     &lt;enumeration value="stop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ReservationNeededEnumeration")
@XmlEnum
public enum ReservationNeededEnumeration {

    @XmlEnumValue("none")
    NONE("none"),

    /**
     * A reservation/booking is required for the service to operate. BookingArrangement should then be used and contain more details.
     */
    @XmlEnumValue("service")
    SERVICE("service"),

    /**
     * A reservation/booking is required for the service to call at the stop for boarding and alighting. BookingArrangement should then be used and contain more details.
     */
    @XmlEnumValue("stop")
    STOP("stop");
    private final String value;

    ReservationNeededEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservationNeededEnumeration fromValue(String v) {
        for (ReservationNeededEnumeration c : ReservationNeededEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
