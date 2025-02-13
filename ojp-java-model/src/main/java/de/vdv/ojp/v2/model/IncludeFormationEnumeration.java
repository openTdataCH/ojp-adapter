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
 * <p>Java-Klasse für IncludeFormationEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="IncludeFormationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="vehiclefeature"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "IncludeFormationEnumeration")
@XmlEnum
public enum IncludeFormationEnumeration {

    @XmlEnumValue("none")
    NONE("none"),

    /**
     * The response should include VehicleFeatureRef (from SIRI).
     */
    @XmlEnumValue("vehiclefeature")
    VEHICLEFEATURE("vehiclefeature"),

    /**
     * Besides VehicleFeatureRefs also Formation, ArrivalFormation and DepartureFormation can be used. This is the full SIRI formation experience. Refer to the SIRI documentation for details. The
     * specification document and the examples may show simpler ways of doing things. For full accessibility many features are needed. It is recommended to always also use VehicleFeatureRef (for
     * people not processing SIRI formation and because buses and the like don't need Formation in most cases).
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    IncludeFormationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncludeFormationEnumeration fromValue(String v) {
        for (IncludeFormationEnumeration c : IncludeFormationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
