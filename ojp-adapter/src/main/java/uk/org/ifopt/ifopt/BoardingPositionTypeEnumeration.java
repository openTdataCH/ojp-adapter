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
 * <p>Java-Klasse für BoardingPositionTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BoardingPositionTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="doorFromAirlineGate"/&gt;
 *     &lt;enumeration value="positionOnRailPlatform"/&gt;
 *     &lt;enumeration value="positionOnMetroPlatform"/&gt;
 *     &lt;enumeration value="positionAtCoachStop"/&gt;
 *     &lt;enumeration value="positionAtBusStop"/&gt;
 *     &lt;enumeration value="boatGangway"/&gt;
 *     &lt;enumeration value="ferryGangway"/&gt;
 *     &lt;enumeration value="telecabinePlatform"/&gt;
 *     &lt;enumeration value="telecabinePlatfrom"/&gt;
 *     &lt;enumeration value="setDownPoint"/&gt;
 *     &lt;enumeration value="taxiBay"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BoardingPositionTypeEnumeration")
@XmlEnum
public enum BoardingPositionTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("doorFromAirlineGate")
    DOOR_FROM_AIRLINE_GATE("doorFromAirlineGate"),
    @XmlEnumValue("positionOnRailPlatform")
    POSITION_ON_RAIL_PLATFORM("positionOnRailPlatform"),
    @XmlEnumValue("positionOnMetroPlatform")
    POSITION_ON_METRO_PLATFORM("positionOnMetroPlatform"),
    @XmlEnumValue("positionAtCoachStop")
    POSITION_AT_COACH_STOP("positionAtCoachStop"),
    @XmlEnumValue("positionAtBusStop")
    POSITION_AT_BUS_STOP("positionAtBusStop"),
    @XmlEnumValue("boatGangway")
    BOAT_GANGWAY("boatGangway"),
    @XmlEnumValue("ferryGangway")
    FERRY_GANGWAY("ferryGangway"),
    @XmlEnumValue("telecabinePlatform")
    TELECABINE_PLATFORM("telecabinePlatform"),

    /**
     * deprecated
     * 
     */
    @XmlEnumValue("telecabinePlatfrom")
    TELECABINE_PLATFROM("telecabinePlatfrom"),
    @XmlEnumValue("setDownPoint")
    SET_DOWN_POINT("setDownPoint"),
    @XmlEnumValue("taxiBay")
    TAXI_BAY("taxiBay"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BoardingPositionTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingPositionTypeEnumeration fromValue(String v) {
        for (BoardingPositionTypeEnumeration c: BoardingPositionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
