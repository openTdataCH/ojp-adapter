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
 * <p>Java-Klasse für ProgressRateEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ProgressRateEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="noProgress"/&gt;
 *     &lt;enumeration value="slowProgress"/&gt;
 *     &lt;enumeration value="normalProgress"/&gt;
 *     &lt;enumeration value="fastProgress"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ProgressRateEnumeration")
@XmlEnum
public enum ProgressRateEnumeration {

    /**
     * Vehicle is stationary.
     */
    @XmlEnumValue("noProgress")
    NO_PROGRESS("noProgress"),

    /**
     * Vehicle is proceeding slower than normal.
     */
    @XmlEnumValue("slowProgress")
    SLOW_PROGRESS("slowProgress"),

    /**
     * Vehicle is proceeding at a normal rate.
     */
    @XmlEnumValue("normalProgress")
    NORMAL_PROGRESS("normalProgress"),

    /**
     * Vehicle is proceeding faster than normal.
     */
    @XmlEnumValue("fastProgress")
    FAST_PROGRESS("fastProgress"),

    /**
     * There is no data.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ProgressRateEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgressRateEnumeration fromValue(String v) {
        for (ProgressRateEnumeration c : ProgressRateEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
