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
 * <p>Java-Klasse für QualityIndexEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="QualityIndexEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="certain"/&gt;
 *     &lt;enumeration value="veryReliable"/&gt;
 *     &lt;enumeration value="reliable"/&gt;
 *     &lt;enumeration value="probablyReliable"/&gt;
 *     &lt;enumeration value="unconfirmed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "QualityIndexEnumeration")
@XmlEnum
public enum QualityIndexEnumeration {

    /**
     * Data is certain (1/5).
     */
    @XmlEnumValue("certain")
    CERTAIN("certain"),

    /**
     * Data has confidence level of very reliable (2/5).
     */
    @XmlEnumValue("veryReliable")
    VERY_RELIABLE("veryReliable"),

    /**
     * Data has confidence level of reliable (3/5).
     */
    @XmlEnumValue("reliable")
    RELIABLE("reliable"),

    /**
     * Data is thought to be reliable (4/5)
     */
    @XmlEnumValue("probablyReliable")
    PROBABLY_RELIABLE("probablyReliable"),

    /**
     * Data is unconfirmed (5/5).
     */
    @XmlEnumValue("unconfirmed")
    UNCONFIRMED("unconfirmed");
    private final String value;

    QualityIndexEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityIndexEnumeration fromValue(String v) {
        for (QualityIndexEnumeration c : QualityIndexEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
