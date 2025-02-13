//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für PlaceTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PlaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="stop"/&gt;
 *     &lt;enumeration value="address"/&gt;
 *     &lt;enumeration value="poi"/&gt;
 *     &lt;enumeration value="coord"/&gt;
 *     &lt;enumeration value="location"/&gt;
 *     &lt;enumeration value="topographicPlace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PlaceTypeEnumeration")
@XmlEnum
public enum PlaceTypeEnumeration {

    /**
     * stop covers StopPlace and StopPoint. The main reason is that many systems may only return either STOP PLACE/QUAY information or SCHEDULED STOP POINTs.
     */
    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("poi")
    POI("poi"),

    /**
     * Deprecated. Use location instead.
     */
    @XmlEnumValue("coord")
    COORD("coord"),

    /**
     * Geographic position consisting of coordinates. Replaces the deprecated value coord.
     */
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("topographicPlace")
    TOPOGRAPHIC_PLACE("topographicPlace");
    private final String value;

    PlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceTypeEnumeration fromValue(String v) {
        for (PlaceTypeEnumeration c : PlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
