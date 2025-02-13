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
 * <p>Java-Klasse für EndTimePrecisionEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="EndTimePrecisionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="day"/&gt;
 *     &lt;enumeration value="hour"/&gt;
 *     &lt;enumeration value="second"/&gt;
 *     &lt;enumeration value="milliSecond"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "EndTimePrecisionEnumeration")
@XmlEnum
public enum EndTimePrecisionEnumeration {

    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("hour")
    HOUR("hour"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("milliSecond")
    MILLI_SECOND("milliSecond");
    private final String value;

    EndTimePrecisionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndTimePrecisionEnumeration fromValue(String v) {
        for (EndTimePrecisionEnumeration c : EndTimePrecisionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
