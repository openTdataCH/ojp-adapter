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
 * <p>Java-Klasse für RelatedToEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RelatedToEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="cause"/&gt;
 *     &lt;enumeration value="effect"/&gt;
 *     &lt;enumeration value="correctionTo"/&gt;
 *     &lt;enumeration value="update"/&gt;
 *     &lt;enumeration value="supercedes"/&gt;
 *     &lt;enumeration value="supercededBy"/&gt;
 *     &lt;enumeration value="associated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelatedToEnumeration")
@XmlEnum
public enum RelatedToEnumeration {

    @XmlEnumValue("cause")
    CAUSE("cause"),
    @XmlEnumValue("effect")
    EFFECT("effect"),
    @XmlEnumValue("correctionTo")
    CORRECTION_TO("correctionTo"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("supercedes")
    SUPERCEDES("supercedes"),
    @XmlEnumValue("supercededBy")
    SUPERCEDED_BY("supercededBy"),
    @XmlEnumValue("associated")
    ASSOCIATED("associated");
    private final String value;

    RelatedToEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelatedToEnumeration fromValue(String v) {
        for (RelatedToEnumeration c: RelatedToEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
