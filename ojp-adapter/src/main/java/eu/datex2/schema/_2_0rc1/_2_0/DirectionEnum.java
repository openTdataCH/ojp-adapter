//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DirectionEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anticlockwise"/&gt;
 *     &lt;enumeration value="clockwise"/&gt;
 *     &lt;enumeration value="northBound"/&gt;
 *     &lt;enumeration value="northEastBound"/&gt;
 *     &lt;enumeration value="eastBound"/&gt;
 *     &lt;enumeration value="southEastBound"/&gt;
 *     &lt;enumeration value="southBound"/&gt;
 *     &lt;enumeration value="southWestBound"/&gt;
 *     &lt;enumeration value="westBound"/&gt;
 *     &lt;enumeration value="northWestBound"/&gt;
 *     &lt;enumeration value="inboundTowardsTown"/&gt;
 *     &lt;enumeration value="outboundFromTown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DirectionEnum")
@XmlEnum
public enum DirectionEnum {

    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),
    @XmlEnumValue("inboundTowardsTown")
    INBOUND_TOWARDS_TOWN("inboundTowardsTown"),
    @XmlEnumValue("outboundFromTown")
    OUTBOUND_FROM_TOWN("outboundFromTown");
    private final String value;

    DirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionEnum fromValue(String v) {
        for (DirectionEnum c: DirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
