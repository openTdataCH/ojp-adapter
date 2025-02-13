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
 * <p>Java-Klasse für AccessibilityDetailsProfileEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccessibilityDetailsProfileEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="visualImpairment"/&gt;
 *     &lt;enumeration value="auditoryImpairment"/&gt;
 *     &lt;enumeration value="mobilityImpairment"/&gt;
 *     &lt;enumeration value="bicycle"/&gt;
 *     &lt;enumeration value="general"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AccessibilityDetailsProfileEnumeration")
@XmlEnum
public enum AccessibilityDetailsProfileEnumeration {

    @XmlEnumValue("visualImpairment")
    VISUAL_IMPAIRMENT("visualImpairment"),
    @XmlEnumValue("auditoryImpairment")
    AUDITORY_IMPAIRMENT("auditoryImpairment"),
    @XmlEnumValue("mobilityImpairment")
    MOBILITY_IMPAIRMENT("mobilityImpairment"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("general")
    GENERAL("general");
    private final String value;

    AccessibilityDetailsProfileEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessibilityDetailsProfileEnumeration fromValue(String v) {
        for (AccessibilityDetailsProfileEnumeration c : AccessibilityDetailsProfileEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
