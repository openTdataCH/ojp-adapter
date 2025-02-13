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
 * <p>Java-Klasse für InterchangeWeightingEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="InterchangeWeightingEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="noInterchange"/&gt;
 *     &lt;enumeration value="interchangeAllowed"/&gt;
 *     &lt;enumeration value="recommendedInterchange"/&gt;
 *     &lt;enumeration value="preferredInterchange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "InterchangeWeightingEnumeration")
@XmlEnum
public enum InterchangeWeightingEnumeration {

    @XmlEnumValue("noInterchange")
    NO_INTERCHANGE("noInterchange"),
    @XmlEnumValue("interchangeAllowed")
    INTERCHANGE_ALLOWED("interchangeAllowed"),
    @XmlEnumValue("recommendedInterchange")
    RECOMMENDED_INTERCHANGE("recommendedInterchange"),
    @XmlEnumValue("preferredInterchange")
    PREFERRED_INTERCHANGE("preferredInterchange");
    private final String value;

    InterchangeWeightingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeWeightingEnumeration fromValue(String v) {
        for (InterchangeWeightingEnumeration c : InterchangeWeightingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
