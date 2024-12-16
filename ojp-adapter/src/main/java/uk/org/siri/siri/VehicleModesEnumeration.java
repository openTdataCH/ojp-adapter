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
 * <p>Java-Klasse für VehicleModesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VehicleModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="air"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="coach"/&gt;
 *     &lt;enumeration value="ferry"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleModesEnumeration")
@XmlEnum
public enum VehicleModesEnumeration {

    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("coach")
    COACH("coach"),
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground");
    private final String value;

    VehicleModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleModesEnumeration fromValue(String v) {
        for (VehicleModesEnumeration c: VehicleModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
