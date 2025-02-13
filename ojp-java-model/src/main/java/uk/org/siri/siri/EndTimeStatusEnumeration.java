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
 * <p>Java-Klasse für EndTimeStatusEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="EndTimeStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="longTerm"/&gt;
 *     &lt;enumeration value="shortTerm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "EndTimeStatusEnumeration")
@XmlEnum
public enum EndTimeStatusEnumeration {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),
    @XmlEnumValue("shortTerm")
    SHORT_TERM("shortTerm");
    private final String value;

    EndTimeStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndTimeStatusEnumeration fromValue(String v) {
        for (EndTimeStatusEnumeration c : EndTimeStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
