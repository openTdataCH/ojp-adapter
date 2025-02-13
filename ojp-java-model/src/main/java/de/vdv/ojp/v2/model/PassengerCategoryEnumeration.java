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
 * <p>Java-Klasse für PassengerCategoryEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PassengerCategoryEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Adult"/&gt;
 *     &lt;enumeration value="Child"/&gt;
 *     &lt;enumeration value="Senior"/&gt;
 *     &lt;enumeration value="Youth"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Dog"/&gt;
 *     &lt;enumeration value="Bicycle"/&gt;
 *     &lt;enumeration value="Motorcycle"/&gt;
 *     &lt;enumeration value="Car"/&gt;
 *     &lt;enumeration value="Truck"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PassengerCategoryEnumeration")
@XmlEnum
public enum PassengerCategoryEnumeration {

    @XmlEnumValue("Adult")
    ADULT("Adult"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Senior")
    SENIOR("Senior"),
    @XmlEnumValue("Youth")
    YOUTH("Youth"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Dog")
    DOG("Dog"),
    @XmlEnumValue("Bicycle")
    BICYCLE("Bicycle"),
    @XmlEnumValue("Motorcycle")
    MOTORCYCLE("Motorcycle"),
    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("Truck")
    TRUCK("Truck"),
    @XmlEnumValue("Group")
    GROUP("Group");
    private final String value;

    PassengerCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerCategoryEnumeration fromValue(String v) {
        for (PassengerCategoryEnumeration c : PassengerCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
