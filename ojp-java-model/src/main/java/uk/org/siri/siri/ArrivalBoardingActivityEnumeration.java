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
 * <p>Java-Klasse für ArrivalBoardingActivityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ArrivalBoardingActivityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="alighting"/&gt;
 *     &lt;enumeration value="noAlighting"/&gt;
 *     &lt;enumeration value="passThru"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ArrivalBoardingActivityEnumeration")
@XmlEnum
public enum ArrivalBoardingActivityEnumeration {

    @XmlEnumValue("alighting")
    ALIGHTING("alighting"),
    @XmlEnumValue("noAlighting")
    NO_ALIGHTING("noAlighting"),
    @XmlEnumValue("passThru")
    PASS_THRU("passThru");
    private final String value;

    ArrivalBoardingActivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArrivalBoardingActivityEnumeration fromValue(String v) {
        for (ArrivalBoardingActivityEnumeration c : ArrivalBoardingActivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
