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
 * <p>Java-Klasse für FareClassEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FareClassEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="firstClass"/&gt;
 *     &lt;enumeration value="secondClass "/&gt;
 *     &lt;enumeration value="thirdClass"/&gt;
 *     &lt;enumeration value="preferente"/&gt;
 *     &lt;enumeration value="premiumClass"/&gt;
 *     &lt;enumeration value="businessClass"/&gt;
 *     &lt;enumeration value="standardClass"/&gt;
 *     &lt;enumeration value="turista"/&gt;
 *     &lt;enumeration value="economyClass"/&gt;
 *     &lt;enumeration value="any"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "FareClassEnumeration")
@XmlEnum
public enum FareClassEnumeration {

    /**
     * pti23_0
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * pti23_6
     */
    @XmlEnumValue("firstClass")
    FIRST_CLASS("firstClass"),

    /**
     * pti23_7
     */
    @XmlEnumValue("secondClass ")
    SECOND_CLASS__("secondClass "),

    /**
     * pti23_8
     */
    @XmlEnumValue("thirdClass")
    THIRD_CLASS("thirdClass"),
    @XmlEnumValue("preferente")
    PREFERENTE("preferente"),

    /**
     * pti23_6_1
     */
    @XmlEnumValue("premiumClass")
    PREMIUM_CLASS("premiumClass"),

    /**
     * Business Class - pti23_10
     */
    @XmlEnumValue("businessClass")
    BUSINESS_CLASS("businessClass"),

    /**
     * Standard class Add pti23_7
     */
    @XmlEnumValue("standardClass")
    STANDARD_CLASS("standardClass"),
    @XmlEnumValue("turista")
    TURISTA("turista"),

    /**
     * pti23_9
     */
    @XmlEnumValue("economyClass")
    ECONOMY_CLASS("economyClass"),
    @XmlEnumValue("any")
    ANY("any");
    private final String value;

    FareClassEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareClassEnumeration fromValue(String v) {
        for (FareClassEnumeration c : FareClassEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
