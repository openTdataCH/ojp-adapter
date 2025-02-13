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
 * <p>Java-Klasse für PersonalModesOfOperationEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PersonalModesOfOperationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="self"/&gt;
 *     &lt;enumeration value="own"/&gt;
 *     &lt;enumeration value="otherOwned"/&gt;
 *     &lt;enumeration value="privateLift"/&gt;
 *     &lt;enumeration value="lease"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PersonalModesOfOperationEnumeration")
@XmlEnum
public enum PersonalModesOfOperationEnumeration {

    /**
     * Without a VEHICLE.
     */
    @XmlEnumValue("self")
    SELF("self"),

    /**
     * Using an owned VEHICLE.
     */
    @XmlEnumValue("own")
    OWN("own"),

    /**
     * Using a VEHICLE owned by a different private person without a commercial context.
     */
    @XmlEnumValue("otherOwned")
    OTHER_OWNED("otherOwned"),

    /**
     * Other driver without commercial interest is driving. Typical case of being picked up or dropped off at a stop e.g., by a friend, relative. If the offer is advertised or commercial, then pooling
     * from ALTERNATIVE MODE OF OPERATION should be chosen.
     */
    @XmlEnumValue("privateLift")
    PRIVATE_LIFT("privateLift"),

    /**
     * Using a leased VEHICLE.
     */
    @XmlEnumValue("lease")
    LEASE("lease");
    private final String value;

    PersonalModesOfOperationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonalModesOfOperationEnumeration fromValue(String v) {
        for (PersonalModesOfOperationEnumeration c : PersonalModesOfOperationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
