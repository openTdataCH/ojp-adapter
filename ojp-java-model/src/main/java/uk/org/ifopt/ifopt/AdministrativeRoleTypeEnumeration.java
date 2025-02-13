//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für AdministrativeRoleTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AdministrativeRoleTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="collects"/&gt;
 *     &lt;enumeration value="validates"/&gt;
 *     &lt;enumeration value="aggregates"/&gt;
 *     &lt;enumeration value="distributes"/&gt;
 *     &lt;enumeration value="redistributes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AdministrativeRoleTypeEnumeration")
@XmlEnum
public enum AdministrativeRoleTypeEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("collects")
    COLLECTS("collects"),
    @XmlEnumValue("validates")
    VALIDATES("validates"),
    @XmlEnumValue("aggregates")
    AGGREGATES("aggregates"),
    @XmlEnumValue("distributes")
    DISTRIBUTES("distributes"),
    @XmlEnumValue("redistributes")
    REDISTRIBUTES("redistributes");
    private final String value;

    AdministrativeRoleTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdministrativeRoleTypeEnumeration fromValue(String v) {
        for (AdministrativeRoleTypeEnumeration c : AdministrativeRoleTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
