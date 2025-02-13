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
 * <p>Java-Klasse für StopPlaceTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="StopPlaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="railwayStation"/&gt;
 *     &lt;enumeration value="undergroundStation"/&gt;
 *     &lt;enumeration value="tramStation"/&gt;
 *     &lt;enumeration value="busStation"/&gt;
 *     &lt;enumeration value="airport"/&gt;
 *     &lt;enumeration value="pier"/&gt;
 *     &lt;enumeration value="harbourPort"/&gt;
 *     &lt;enumeration value="ferryStop"/&gt;
 *     &lt;enumeration value="lightRailwayStation"/&gt;
 *     &lt;enumeration value="cogwheelStation"/&gt;
 *     &lt;enumeration value="funicularStation"/&gt;
 *     &lt;enumeration value="ropewayStation"/&gt;
 *     &lt;enumeration value="coachStation"/&gt;
 *     &lt;enumeration value="ferryPort"/&gt;
 *     &lt;enumeration value="onStreetBus"/&gt;
 *     &lt;enumeration value="onStreetTram"/&gt;
 *     &lt;enumeration value="skiLift"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="undefinedStopPlaceType"/&gt;
 *     &lt;enumeration value="railStation"/&gt;
 *     &lt;enumeration value="metroStation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "StopPlaceTypeEnumeration")
@XmlEnum
public enum StopPlaceTypeEnumeration {

    /**
     * TPEG Pts41_0, unknown
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts41_1, railway station
     */
    @XmlEnumValue("railwayStation")
    RAILWAY_STATION("railwayStation"),

    /**
     * TPEG Pts41_2, underground station
     */
    @XmlEnumValue("undergroundStation")
    UNDERGROUND_STATION("undergroundStation"),

    /**
     * IFOPT, TPEG Pts41_3, tram station
     */
    @XmlEnumValue("tramStation")
    TRAM_STATION("tramStation"),

    /**
     * IFOPT, TPEG Pts41_4, bus station
     */
    @XmlEnumValue("busStation")
    BUS_STATION("busStation"),

    /**
     * IFOPT, TPEG Pts41_5, airport
     */
    @XmlEnumValue("airport")
    AIRPORT("airport"),

    /**
     * TPEG Pts41_6, pier
     */
    @XmlEnumValue("pier")
    PIER("pier"),

    /**
     * IFOPT, TPEG Pts41_7, harbour port
     */
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),

    /**
     * ,IFOPT, TPEG Pts41_8, ferry stop
     */
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),

    /**
     * TPEG Pts41_9, light railway station
     */
    @XmlEnumValue("lightRailwayStation")
    LIGHT_RAILWAY_STATION("lightRailwayStation"),

    /**
     * TPEG Pts41_10, cogwheel station
     */
    @XmlEnumValue("cogwheelStation")
    COGWHEEL_STATION("cogwheelStation"),

    /**
     * TPEG Pts41_11, funicular station
     */
    @XmlEnumValue("funicularStation")
    FUNICULAR_STATION("funicularStation"),

    /**
     * TPEG Pts41_12, ropeway station
     */
    @XmlEnumValue("ropewayStation")
    ROPEWAY_STATION("ropewayStation"),

    /**
     * IFOPT, coach station
     */
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),

    /**
     * IFOPT, ferry port
     */
    @XmlEnumValue("ferryPort")
    FERRY_PORT("ferryPort"),

    /**
     * IFOPT, on-street bus stop
     */
    @XmlEnumValue("onStreetBus")
    ON_STREET_BUS("onStreetBus"),

    /**
     * IFOPT, on-street tram stop
     */
    @XmlEnumValue("onStreetTram")
    ON_STREET_TRAM("onStreetTram"),

    /**
     * IFOPT, ski lift
     */
    @XmlEnumValue("skiLift")
    SKI_LIFT("skiLift"),

    /**
     * IFOPT, other
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * TPEG Pts41_255, undefined STOP PLACE type
     */
    @XmlEnumValue("undefinedStopPlaceType")
    UNDEFINED_STOP_PLACE_TYPE("undefinedStopPlaceType"),

    /**
     * IFOPT, deprecated (SIRI 2.1), use railwayStation
     */
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),

    /**
     * IFOPT, deprecated (SIRI 2.1), use undergroundStation
     */
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation");
    private final String value;

    StopPlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceTypeEnumeration fromValue(String v) {
        for (StopPlaceTypeEnumeration c : StopPlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
