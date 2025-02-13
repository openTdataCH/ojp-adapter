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
 * <p>Java-Klasse für CountingTrendEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CountingTrendEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="decreasing"/&gt;
 *     &lt;enumeration value="increasing"/&gt;
 *     &lt;enumeration value="stable"/&gt;
 *     &lt;enumeration value="unstable"/&gt;
 *     &lt;enumeration value="increasingQuickly"/&gt;
 *     &lt;enumeration value="increasingSlowly"/&gt;
 *     &lt;enumeration value="decreasingQuickly"/&gt;
 *     &lt;enumeration value="decreasingSlowly"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "CountingTrendEnumeration")
@XmlEnum
public enum CountingTrendEnumeration {

    @XmlEnumValue("decreasing")
    DECREASING("decreasing"),
    @XmlEnumValue("increasing")
    INCREASING("increasing"),
    @XmlEnumValue("stable")
    STABLE("stable"),
    @XmlEnumValue("unstable")
    UNSTABLE("unstable"),
    @XmlEnumValue("increasingQuickly")
    INCREASING_QUICKLY("increasingQuickly"),
    @XmlEnumValue("increasingSlowly")
    INCREASING_SLOWLY("increasingSlowly"),
    @XmlEnumValue("decreasingQuickly")
    DECREASING_QUICKLY("decreasingQuickly"),
    @XmlEnumValue("decreasingSlowly")
    DECREASING_SLOWLY("decreasingSlowly"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    CountingTrendEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountingTrendEnumeration fromValue(String v) {
        for (CountingTrendEnumeration c : CountingTrendEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
