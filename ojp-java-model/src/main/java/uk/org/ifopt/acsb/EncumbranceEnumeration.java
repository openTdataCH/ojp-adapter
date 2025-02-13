//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.acsb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für EncumbranceEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="EncumbranceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="luggageEncumbered"/&gt;
 *     &lt;enumeration value="pushchair"/&gt;
 *     &lt;enumeration value="baggageTrolley"/&gt;
 *     &lt;enumeration value="oversizeBaggage"/&gt;
 *     &lt;enumeration value="guideDog"/&gt;
 *     &lt;enumeration value="otherAnimal"/&gt;
 *     &lt;enumeration value="otherEncumbrance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "EncumbranceEnumeration")
@XmlEnum
public enum EncumbranceEnumeration {

    @XmlEnumValue("luggageEncumbered")
    LUGGAGE_ENCUMBERED("luggageEncumbered"),
    @XmlEnumValue("pushchair")
    PUSHCHAIR("pushchair"),
    @XmlEnumValue("baggageTrolley")
    BAGGAGE_TROLLEY("baggageTrolley"),
    @XmlEnumValue("oversizeBaggage")
    OVERSIZE_BAGGAGE("oversizeBaggage"),
    @XmlEnumValue("guideDog")
    GUIDE_DOG("guideDog"),
    @XmlEnumValue("otherAnimal")
    OTHER_ANIMAL("otherAnimal"),
    @XmlEnumValue("otherEncumbrance")
    OTHER_ENCUMBRANCE("otherEncumbrance");
    private final String value;

    EncumbranceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncumbranceEnumeration fromValue(String v) {
        for (EncumbranceEnumeration c : EncumbranceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
