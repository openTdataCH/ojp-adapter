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
 * <p>Java-Klasse für OccupancyEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="OccupancyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="empty"/&gt;
 *     &lt;enumeration value="manySeatsAvailable"/&gt;
 *     &lt;enumeration value="fewSeatsAvailable"/&gt;
 *     &lt;enumeration value="standingRoomOnly"/&gt;
 *     &lt;enumeration value="crushedStandingRoomOnly"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="notAcceptingPassengers"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="seatsAvailable"/&gt;
 *     &lt;enumeration value="standingAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "OccupancyEnumeration")
@XmlEnum
public enum OccupancyEnumeration {

    /**
     * TPEG Pts45_0, unknown
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * GTFS-R "EMPTY" The vehicle is considered empty by most measures, and has few or no passengers onboard, but is still accepting passengers.
     */
    @XmlEnumValue("empty")
    EMPTY("empty"),

    /**
     * GTFS-R "MANY_SEATS_AVAILABLE" / TPEG Pts45_1, many seats available The vehicle has a large percentage of seats available. What percentage of free seats out of the total seats available is to be
     * considered large enough to fall into this category is determined at the discretion of the producer.
     */
    @XmlEnumValue("manySeatsAvailable")
    MANY_SEATS_AVAILABLE("manySeatsAvailable"),

    /**
     * GTFS-R "FEW_SEATS_AVAILABLE" / TPEG Pts45_2, few seats available The vehicle has a small percentage of seats available. What percentage of free seats out of the total seats available is to be
     * considered small enough to fall into this category is determined at the discretion of the producer.
     */
    @XmlEnumValue("fewSeatsAvailable")
    FEW_SEATS_AVAILABLE("fewSeatsAvailable"),

    /**
     * GTFS-R "STANDING_ROOM_ONLY" / TPEG Pts45_4, standing room only (and TPEG Pts45_3, no seats available) The vehicle can currently accommodate only standing passengers.
     */
    @XmlEnumValue("standingRoomOnly")
    STANDING_ROOM_ONLY("standingRoomOnly"),

    /**
     * GTFS-R "CRUSHED_STANDING_ROOM_ONLY" The vehicle can currently accommodate only standing passengers and has limited space for them.
     */
    @XmlEnumValue("crushedStandingRoomOnly")
    CRUSHED_STANDING_ROOM_ONLY("crushedStandingRoomOnly"),

    /**
     * GTFS-R "FULL" / TPEG Pts45_5, full
     */
    @XmlEnumValue("full")
    FULL("full"),

    /**
     * GTFS-R "NOT_ACCEPTING_PASSENGERS" The vehicle cannot accept passengers.
     */
    @XmlEnumValue("notAcceptingPassengers")
    NOT_ACCEPTING_PASSENGERS("notAcceptingPassengers"),

    /**
     * TPEG Pts45_255, undefined occupancy
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * (SIRI 2.1) deprecated - use a more specific value
     */
    @XmlEnumValue("seatsAvailable")
    SEATS_AVAILABLE("seatsAvailable"),

    /**
     * (SIRI 2.1) deprecated - use a more specific value
     */
    @XmlEnumValue("standingAvailable")
    STANDING_AVAILABLE("standingAvailable");
    private final String value;

    OccupancyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OccupancyEnumeration fromValue(String v) {
        for (OccupancyEnumeration c : OccupancyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
