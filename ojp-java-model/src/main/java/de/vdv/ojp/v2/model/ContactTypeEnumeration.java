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
 * <p>Java-Klasse für ContactTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ContactTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="any"/&gt;
 *     &lt;enumeration value="information"/&gt;
 *     &lt;enumeration value="reservations"/&gt;
 *     &lt;enumeration value="lostProperty"/&gt;
 *     &lt;enumeration value="publicRelations"/&gt;
 *     &lt;enumeration value="complaints"/&gt;
 *     &lt;enumeration value="emergency"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ContactTypeEnumeration")
@XmlEnum
public enum ContactTypeEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("information")
    INFORMATION("information"),
    @XmlEnumValue("reservations")
    RESERVATIONS("reservations"),
    @XmlEnumValue("lostProperty")
    LOST_PROPERTY("lostProperty"),
    @XmlEnumValue("publicRelations")
    PUBLIC_RELATIONS("publicRelations"),
    @XmlEnumValue("complaints")
    COMPLAINTS("complaints"),
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ContactTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactTypeEnumeration fromValue(String v) {
        for (ContactTypeEnumeration c : ContactTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
