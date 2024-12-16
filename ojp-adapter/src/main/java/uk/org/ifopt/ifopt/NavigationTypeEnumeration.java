//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NavigationTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="NavigationTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="hallToQuay"/&gt;
 *     &lt;enumeration value="hallToStreet"/&gt;
 *     &lt;enumeration value="quayToHall"/&gt;
 *     &lt;enumeration value="quayToQuay"/&gt;
 *     &lt;enumeration value="quayToStreet"/&gt;
 *     &lt;enumeration value="streetToHall"/&gt;
 *     &lt;enumeration value="streetToQuay"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NavigationTypeEnumeration")
@XmlEnum
public enum NavigationTypeEnumeration {

    @XmlEnumValue("hallToQuay")
    HALL_TO_QUAY("hallToQuay"),
    @XmlEnumValue("hallToStreet")
    HALL_TO_STREET("hallToStreet"),
    @XmlEnumValue("quayToHall")
    QUAY_TO_HALL("quayToHall"),
    @XmlEnumValue("quayToQuay")
    QUAY_TO_QUAY("quayToQuay"),
    @XmlEnumValue("quayToStreet")
    QUAY_TO_STREET("quayToStreet"),
    @XmlEnumValue("streetToHall")
    STREET_TO_HALL("streetToHall"),
    @XmlEnumValue("streetToQuay")
    STREET_TO_QUAY("streetToQuay"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NavigationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NavigationTypeEnumeration fromValue(String v) {
        for (NavigationTypeEnumeration c: NavigationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
