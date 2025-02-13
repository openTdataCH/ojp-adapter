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
 * <p>Java-Klasse für BoardingActivityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BoardingActivityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="boardingAndAlighting"/&gt;
 *     &lt;enumeration value="noBoarding"/&gt;
 *     &lt;enumeration value="noAlighting"/&gt;
 *     &lt;enumeration value="passThru"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "BoardingActivityEnumeration")
@XmlEnum
public enum BoardingActivityEnumeration {

    @XmlEnumValue("boardingAndAlighting")
    BOARDING_AND_ALIGHTING("boardingAndAlighting"),
    @XmlEnumValue("noBoarding")
    NO_BOARDING("noBoarding"),
    @XmlEnumValue("noAlighting")
    NO_ALIGHTING("noAlighting"),
    @XmlEnumValue("passThru")
    PASS_THRU("passThru");
    private final String value;

    BoardingActivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingActivityEnumeration fromValue(String v) {
        for (BoardingActivityEnumeration c : BoardingActivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
