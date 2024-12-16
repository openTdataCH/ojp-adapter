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
 * <p>Java-Klasse für HierarchyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="HierarchyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="local"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="down"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HierarchyEnumeration")
@XmlEnum
public enum HierarchyEnumeration {

    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    HierarchyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HierarchyEnumeration fromValue(String v) {
        for (HierarchyEnumeration c: HierarchyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
