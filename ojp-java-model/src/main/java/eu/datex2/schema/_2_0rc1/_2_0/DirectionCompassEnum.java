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
 * <p>Java-Klasse für DirectionCompassEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DirectionCompassEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="east"/&gt;
 *     &lt;enumeration value="eastNorthEast"/&gt;
 *     &lt;enumeration value="eastSouthEast"/&gt;
 *     &lt;enumeration value="north"/&gt;
 *     &lt;enumeration value="northEast"/&gt;
 *     &lt;enumeration value="northNorthEast"/&gt;
 *     &lt;enumeration value="northNorthWest"/&gt;
 *     &lt;enumeration value="northWest"/&gt;
 *     &lt;enumeration value="south"/&gt;
 *     &lt;enumeration value="southEast"/&gt;
 *     &lt;enumeration value="southSouthEast"/&gt;
 *     &lt;enumeration value="southSouthWest"/&gt;
 *     &lt;enumeration value="southWest"/&gt;
 *     &lt;enumeration value="west"/&gt;
 *     &lt;enumeration value="westNorthWest"/&gt;
 *     &lt;enumeration value="westSouthWest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "DirectionCompassEnum")
@XmlEnum
public enum DirectionCompassEnum {

    @XmlEnumValue("east")
    EAST("east"),
    @XmlEnumValue("eastNorthEast")
    EAST_NORTH_EAST("eastNorthEast"),
    @XmlEnumValue("eastSouthEast")
    EAST_SOUTH_EAST("eastSouthEast"),
    @XmlEnumValue("north")
    NORTH("north"),
    @XmlEnumValue("northEast")
    NORTH_EAST("northEast"),
    @XmlEnumValue("northNorthEast")
    NORTH_NORTH_EAST("northNorthEast"),
    @XmlEnumValue("northNorthWest")
    NORTH_NORTH_WEST("northNorthWest"),
    @XmlEnumValue("northWest")
    NORTH_WEST("northWest"),
    @XmlEnumValue("south")
    SOUTH("south"),
    @XmlEnumValue("southEast")
    SOUTH_EAST("southEast"),
    @XmlEnumValue("southSouthEast")
    SOUTH_SOUTH_EAST("southSouthEast"),
    @XmlEnumValue("southSouthWest")
    SOUTH_SOUTH_WEST("southSouthWest"),
    @XmlEnumValue("southWest")
    SOUTH_WEST("southWest"),
    @XmlEnumValue("west")
    WEST("west"),
    @XmlEnumValue("westNorthWest")
    WEST_NORTH_WEST("westNorthWest"),
    @XmlEnumValue("westSouthWest")
    WEST_SOUTH_WEST("westSouthWest");
    private final String value;

    DirectionCompassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionCompassEnum fromValue(String v) {
        for (DirectionCompassEnum c : DirectionCompassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
