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
 * <p>Java-Klasse für ExtendToFrontOrBackType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ExtendToFrontOrBackType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="extendToFront"/&gt;
 *     &lt;enumeration value="extendToBack"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtendToFrontOrBackType")
@XmlEnum
public enum ExtendToFrontOrBackType {

    @XmlEnumValue("extendToFront")
    EXTEND_TO_FRONT("extendToFront"),
    @XmlEnumValue("extendToBack")
    EXTEND_TO_BACK("extendToBack");
    private final String value;

    ExtendToFrontOrBackType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendToFrontOrBackType fromValue(String v) {
        for (ExtendToFrontOrBackType c: ExtendToFrontOrBackType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
