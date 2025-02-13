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
 * <p>Java-Klasse für ContinuousModesEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ContinuousModesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="walk"/&gt;
 *     &lt;enumeration value="car"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="cycle"/&gt;
 *     &lt;enumeration value="drt"/&gt;
 *     &lt;enumeration value="movingWalkway"/&gt;
 *     &lt;enumeration value="through"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ContinuousModesEnumeration")
@XmlEnum
public enum ContinuousModesEnumeration {

    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("cycle")
    CYCLE("cycle"),
    @XmlEnumValue("drt")
    DRT("drt"),
    @XmlEnumValue("movingWalkway")
    MOVING_WALKWAY("movingWalkway"),
    @XmlEnumValue("through")
    THROUGH("through");
    private final String value;

    ContinuousModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContinuousModesEnumeration fromValue(String v) {
        for (ContinuousModesEnumeration c : ContinuousModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
