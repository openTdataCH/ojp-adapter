//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für VehicleStatusEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VehicleStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abandoned"/&gt;
 *     &lt;enumeration value="brokenDown"/&gt;
 *     &lt;enumeration value="burntOut"/&gt;
 *     &lt;enumeration value="damaged"/&gt;
 *     &lt;enumeration value="damagedAndImmobilized"/&gt;
 *     &lt;enumeration value="onFire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "VehicleStatusEnum")
@XmlEnum
public enum VehicleStatusEnum {

    @XmlEnumValue("abandoned")
    ABANDONED("abandoned"),
    @XmlEnumValue("brokenDown")
    BROKEN_DOWN("brokenDown"),
    @XmlEnumValue("burntOut")
    BURNT_OUT("burntOut"),
    @XmlEnumValue("damaged")
    DAMAGED("damaged"),
    @XmlEnumValue("damagedAndImmobilized")
    DAMAGED_AND_IMMOBILIZED("damagedAndImmobilized"),
    @XmlEnumValue("onFire")
    ON_FIRE("onFire");
    private final String value;

    VehicleStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleStatusEnum fromValue(String v) {
        for (VehicleStatusEnum c : VehicleStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
