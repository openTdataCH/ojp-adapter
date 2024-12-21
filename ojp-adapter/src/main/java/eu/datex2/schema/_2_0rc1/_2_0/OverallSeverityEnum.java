//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OverallSeverityEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="OverallSeverityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="highest"/&gt;
 *     &lt;enumeration value="high"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="low"/&gt;
 *     &lt;enumeration value="lowest"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OverallSeverityEnum")
@XmlEnum
public enum OverallSeverityEnum {

    @XmlEnumValue("highest")
    HIGHEST("highest"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("lowest")
    LOWEST("lowest"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    OverallSeverityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverallSeverityEnum fromValue(String v) {
        for (OverallSeverityEnum c: OverallSeverityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
