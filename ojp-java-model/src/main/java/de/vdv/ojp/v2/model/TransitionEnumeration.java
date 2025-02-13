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
 * <p>Java-Klasse für TransitionEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TransitionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="up"/&gt;
 *     &lt;enumeration value="down"/&gt;
 *     &lt;enumeration value="level"/&gt;
 *     &lt;enumeration value="upAndDown"/&gt;
 *     &lt;enumeration value="downAndUp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TransitionEnumeration")
@XmlEnum
public enum TransitionEnumeration {

    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("level")
    LEVEL("level"),
    @XmlEnumValue("upAndDown")
    UP_AND_DOWN("upAndDown"),
    @XmlEnumValue("downAndUp")
    DOWN_AND_UP("downAndUp");
    private final String value;

    TransitionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitionEnumeration fromValue(String v) {
        for (TransitionEnumeration c : TransitionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
