//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für NatureEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="NatureEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="plannedOnly"/&gt;
 *     &lt;enumeration value="unplannedOnly"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "NatureEnumeration")
@XmlEnum
public enum NatureEnumeration {

    @XmlEnumValue("plannedOnly")
    PLANNED_ONLY("plannedOnly"),
    @XmlEnumValue("unplannedOnly")
    UNPLANNED_ONLY("unplannedOnly"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    NatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NatureEnumeration fromValue(String v) {
        for (NatureEnumeration c : NatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
