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
 * <p>Java-Klasse für TpegLoc02DirectionTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TpegLoc02DirectionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allDirections"/&gt;
 *     &lt;enumeration value="anticlockwise"/&gt;
 *     &lt;enumeration value="bothWays"/&gt;
 *     &lt;enumeration value="clockwise"/&gt;
 *     &lt;enumeration value="eastBound"/&gt;
 *     &lt;enumeration value="innerRing"/&gt;
 *     &lt;enumeration value="northBound"/&gt;
 *     &lt;enumeration value="northEastBound"/&gt;
 *     &lt;enumeration value="northWestBound"/&gt;
 *     &lt;enumeration value="opposite"/&gt;
 *     &lt;enumeration value="outerRing"/&gt;
 *     &lt;enumeration value="southBound"/&gt;
 *     &lt;enumeration value="southEastBound"/&gt;
 *     &lt;enumeration value="southWestBound"/&gt;
 *     &lt;enumeration value="westBound"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc02DirectionTypeEnum")
@XmlEnum
public enum TpegLoc02DirectionTypeEnum {

    @XmlEnumValue("allDirections")
    ALL_DIRECTIONS("allDirections"),
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays"),
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),
    @XmlEnumValue("innerRing")
    INNER_RING("innerRing"),
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),
    @XmlEnumValue("outerRing")
    OUTER_RING("outerRing"),
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc02DirectionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc02DirectionTypeEnum fromValue(String v) {
        for (TpegLoc02DirectionTypeEnum c: TpegLoc02DirectionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
