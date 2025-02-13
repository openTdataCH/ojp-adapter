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
 * <p>Java-Klasse für StopPlaceComponentTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="StopPlaceComponentTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="quay"/&gt;
 *     &lt;enumeration value="accessSpace"/&gt;
 *     &lt;enumeration value="entrance"/&gt;
 *     &lt;enumeration value="boardingPosition"/&gt;
 *     &lt;enumeration value="stoppingPlace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "StopPlaceComponentTypeEnumeration")
@XmlEnum
public enum StopPlaceComponentTypeEnumeration {

    @XmlEnumValue("quay")
    QUAY("quay"),
    @XmlEnumValue("accessSpace")
    ACCESS_SPACE("accessSpace"),
    @XmlEnumValue("entrance")
    ENTRANCE("entrance"),
    @XmlEnumValue("boardingPosition")
    BOARDING_POSITION("boardingPosition"),
    @XmlEnumValue("stoppingPlace")
    STOPPING_PLACE("stoppingPlace");
    private final String value;

    StopPlaceComponentTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceComponentTypeEnumeration fromValue(String v) {
        for (StopPlaceComponentTypeEnumeration c : StopPlaceComponentTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
