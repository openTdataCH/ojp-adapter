//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PersonalModesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PersonalModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="foot"/&gt;
 *     &lt;enumeration value="bicycle"/&gt;
 *     &lt;enumeration value="car"/&gt;
 *     &lt;enumeration value="motorcycle"/&gt;
 *     &lt;enumeration value="truck"/&gt;
 *     &lt;enumeration value="scooter"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonalModesEnumeration")
@XmlEnum
public enum PersonalModesEnumeration {

    @XmlEnumValue("foot")
    FOOT("foot"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("truck")
    TRUCK("truck"),
    @XmlEnumValue("scooter")
    SCOOTER("scooter"),

    /**
     * Only to be used when no other type applies.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PersonalModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonalModesEnumeration fromValue(String v) {
        for (PersonalModesEnumeration c: PersonalModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
