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
 * <p>Java-Klasse für SeverityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="SeverityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="verySlight"/&gt;
 *     &lt;enumeration value="slight"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="severe"/&gt;
 *     &lt;enumeration value="verySevere"/&gt;
 *     &lt;enumeration value="noImpact"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityEnumeration")
@XmlEnum
public enum SeverityEnumeration {


    /**
     * TPEG Pti26_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti26_1, very slight
     * 
     */
    @XmlEnumValue("verySlight")
    VERY_SLIGHT("verySlight"),

    /**
     * TPEG Pti26_2, slight
     * 
     */
    @XmlEnumValue("slight")
    SLIGHT("slight"),

    /**
     * TPEG Pti26_3, normal
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * TPEG Pti26_4, severe
     * 
     */
    @XmlEnumValue("severe")
    SEVERE("severe"),

    /**
     * TPEG Pti26_5, very severe
     * 
     */
    @XmlEnumValue("verySevere")
    VERY_SEVERE("verySevere"),

    /**
     * TPEG Pti26_6, no impact
     * 
     */
    @XmlEnumValue("noImpact")
    NO_IMPACT("noImpact"),

    /**
     * TPEG Pti26_255, undefined
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    SeverityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityEnumeration fromValue(String v) {
        for (SeverityEnumeration c: SeverityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
