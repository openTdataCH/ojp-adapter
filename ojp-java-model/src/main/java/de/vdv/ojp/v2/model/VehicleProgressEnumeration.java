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
 * <p>Java-Klasse für VehicleProgressEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VehicleProgressEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Not yet operated"/&gt;
 *     &lt;enumeration value="Operation finished"/&gt;
 *     &lt;enumeration value="At stop"/&gt;
 *     &lt;enumeration value="Between stops"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "VehicleProgressEnumeration")
@XmlEnum
public enum VehicleProgressEnumeration {

    @XmlEnumValue("Not yet operated")
    NOT___YET___OPERATED("Not yet operated"),
    @XmlEnumValue("Operation finished")
    OPERATION___FINISHED("Operation finished"),
    @XmlEnumValue("At stop")
    AT___STOP("At stop"),
    @XmlEnumValue("Between stops")
    BETWEEN___STOPS("Between stops");
    private final String value;

    VehicleProgressEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleProgressEnumeration fromValue(String v) {
        for (VehicleProgressEnumeration c : VehicleProgressEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
