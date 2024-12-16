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
 * <p>Java-Klasse für RelationToVehicleEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RelationToVehicleEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="frontLeft"/&gt;
 *     &lt;enumeration value="frontRight"/&gt;
 *     &lt;enumeration value="backRight"/&gt;
 *     &lt;enumeration value="backRight"/&gt;
 *     &lt;enumeration value="driverLeft"/&gt;
 *     &lt;enumeration value="driverRight"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationToVehicleEnumeration")
@XmlEnum
public enum RelationToVehicleEnumeration {

    @XmlEnumValue("frontLeft")
    FRONT_LEFT("frontLeft"),
    @XmlEnumValue("frontRight")
    FRONT_RIGHT("frontRight"),
    @XmlEnumValue("backRight")
    BACK_RIGHT("backRight"),
    @XmlEnumValue("driverLeft")
    DRIVER_LEFT("driverLeft"),
    @XmlEnumValue("driverRight")
    DRIVER_RIGHT("driverRight");
    private final String value;

    RelationToVehicleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationToVehicleEnumeration fromValue(String v) {
        for (RelationToVehicleEnumeration c: RelationToVehicleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
