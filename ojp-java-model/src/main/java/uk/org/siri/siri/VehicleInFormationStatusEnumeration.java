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
 * <p>Java-Klasse für VehicleInFormationStatusEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VehicleInFormationStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="available"/&gt;
 *     &lt;enumeration value="notAvailable"/&gt;
 *     &lt;enumeration value="partiallyAvailable"/&gt;
 *     &lt;enumeration value="added"/&gt;
 *     &lt;enumeration value="removed"/&gt;
 *     &lt;enumeration value="defective"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *     &lt;enumeration value="booked"/&gt;
 *     &lt;enumeration value="noRestaurantService"/&gt;
 *     &lt;enumeration value="open"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "VehicleInFormationStatusEnumeration")
@XmlEnum
public enum VehicleInFormationStatusEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("notAvailable")
    NOT_AVAILABLE("notAvailable"),
    @XmlEnumValue("partiallyAvailable")
    PARTIALLY_AVAILABLE("partiallyAvailable"),
    @XmlEnumValue("added")
    ADDED("added"),
    @XmlEnumValue("removed")
    REMOVED("removed"),
    @XmlEnumValue("defective")
    DEFECTIVE("defective"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("booked")
    BOOKED("booked"),
    @XmlEnumValue("noRestaurantService")
    NO_RESTAURANT_SERVICE("noRestaurantService"),
    @XmlEnumValue("open")
    OPEN("open");
    private final String value;

    VehicleInFormationStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleInFormationStatusEnumeration fromValue(String v) {
        for (VehicleInFormationStatusEnumeration c : VehicleInFormationStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
