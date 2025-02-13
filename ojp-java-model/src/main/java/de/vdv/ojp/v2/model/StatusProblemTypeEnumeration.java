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
 * <p>Java-Klasse für StatusProblemTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="StatusProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STATUS_INSTANCE_USAGE_DEPRECATED"/&gt;
 *     &lt;enumeration value="STATUS_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "StatusProblemTypeEnumeration")
@XmlEnum
public enum StatusProblemTypeEnumeration {

    /**
     * Usage of this instance is deprecated. Contact the provider for more information.
     */
    @XmlEnumValue("STATUS_INSTANCE_USAGE_DEPRECATED")
    STATUS___INSTANCE___USAGE___DEPRECATED("STATUS_INSTANCE_USAGE_DEPRECATED"),

    /**
     * A problem has occurred that does not have a specific problem type.
     */
    @XmlEnumValue("STATUS_OTHER")
    STATUS___OTHER("STATUS_OTHER");
    private final String value;

    StatusProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusProblemTypeEnumeration fromValue(String v) {
        for (StatusProblemTypeEnumeration c : StatusProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
