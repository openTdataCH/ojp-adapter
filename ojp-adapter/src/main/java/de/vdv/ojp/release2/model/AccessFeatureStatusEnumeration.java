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
 * <p>Java-Klasse für AccessFeatureStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccessFeatureStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="available"/&gt;
 *     &lt;enumeration value="partiallyAvailable"/&gt;
 *     &lt;enumeration value="notAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessFeatureStatusEnumeration")
@XmlEnum
public enum AccessFeatureStatusEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("available")
    AVAILABLE("available"),

    /**
     * If partiallyAvailable is used, then some note should be provided in one of the descriptive elements of the containing PathLink
     * 
     */
    @XmlEnumValue("partiallyAvailable")
    PARTIALLY_AVAILABLE("partiallyAvailable"),
    @XmlEnumValue("notAvailable")
    NOT_AVAILABLE("notAvailable");
    private final String value;

    AccessFeatureStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFeatureStatusEnumeration fromValue(String v) {
        for (AccessFeatureStatusEnumeration c: AccessFeatureStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
