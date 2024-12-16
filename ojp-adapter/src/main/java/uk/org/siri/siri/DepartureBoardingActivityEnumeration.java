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
 * <p>Java-Klasse für DepartureBoardingActivityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DepartureBoardingActivityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="boarding"/&gt;
 *     &lt;enumeration value="noBoarding"/&gt;
 *     &lt;enumeration value="passThru"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DepartureBoardingActivityEnumeration")
@XmlEnum
public enum DepartureBoardingActivityEnumeration {

    @XmlEnumValue("boarding")
    BOARDING("boarding"),
    @XmlEnumValue("noBoarding")
    NO_BOARDING("noBoarding"),
    @XmlEnumValue("passThru")
    PASS_THRU("passThru");
    private final String value;

    DepartureBoardingActivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepartureBoardingActivityEnumeration fromValue(String v) {
        for (DepartureBoardingActivityEnumeration c: DepartureBoardingActivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
