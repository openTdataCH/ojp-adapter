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
 * <p>Java-Klasse für VerificationStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VerificationStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="unverified"/&gt;
 *     &lt;enumeration value="verified"/&gt;
 *     &lt;enumeration value="verifiedAsDuplicate"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationStatusEnumeration")
@XmlEnum
public enum VerificationStatusEnumeration {


    /**
     * TPEG Pti32_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti32_1, unverified
     * 
     */
    @XmlEnumValue("unverified")
    UNVERIFIED("unverified"),

    /**
     * TPEG Pti32_?, verified
     * 
     */
    @XmlEnumValue("verified")
    VERIFIED("verified"),

    /**
     * TPEG Pti32_?, verifiedAsDuplicate
     * 
     */
    @XmlEnumValue("verifiedAsDuplicate")
    VERIFIED_AS_DUPLICATE("verifiedAsDuplicate"),

    /**
     * TPEG Pti32_255 ?
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    VerificationStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationStatusEnumeration fromValue(String v) {
        for (VerificationStatusEnumeration c: VerificationStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
