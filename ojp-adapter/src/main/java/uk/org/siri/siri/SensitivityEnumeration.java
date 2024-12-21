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
 * <p>Java-Klasse für SensitivityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="SensitivityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="veryHigh"/&gt;
 *     &lt;enumeration value="high"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="low"/&gt;
 *     &lt;enumeration value="veryLow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SensitivityEnumeration")
@XmlEnum
public enum SensitivityEnumeration {

    @XmlEnumValue("veryHigh")
    VERY_HIGH("veryHigh"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("veryLow")
    VERY_LOW("veryLow");
    private final String value;

    SensitivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensitivityEnumeration fromValue(String v) {
        for (SensitivityEnumeration c: SensitivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
