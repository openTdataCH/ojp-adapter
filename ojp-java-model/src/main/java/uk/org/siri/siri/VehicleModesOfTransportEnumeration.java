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
 * <p>Java-Klasse für VehicleModesOfTransportEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VehicleModesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="air"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="coach"/&gt;
 *     &lt;enumeration value="ferry"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="trolleyBus"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *     &lt;enumeration value="cableway"/&gt;
 *     &lt;enumeration value="funicular"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="snowAndIce"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="airService"/&gt;
 *     &lt;enumeration value="gondolaCableCarService"/&gt;
 *     &lt;enumeration value="chairliftService"/&gt;
 *     &lt;enumeration value="elevatorService"/&gt;
 *     &lt;enumeration value="railwayService"/&gt;
 *     &lt;enumeration value="urbanRailwayService"/&gt;
 *     &lt;enumeration value="lightRailwayService"/&gt;
 *     &lt;enumeration value="rackRailService"/&gt;
 *     &lt;enumeration value="funicularService"/&gt;
 *     &lt;enumeration value="busService"/&gt;
 *     &lt;enumeration value="trolleybusService"/&gt;
 *     &lt;enumeration value="coachService"/&gt;
 *     &lt;enumeration value="taxiService"/&gt;
 *     &lt;enumeration value="rentalVehicle"/&gt;
 *     &lt;enumeration value="waterTransportService"/&gt;
 *     &lt;enumeration value="cableDrawnBoatService"/&gt;
 *     &lt;enumeration value="undefinedModeOfTransport"/&gt;
 *     &lt;enumeration value="suburbanRail"/&gt;
 *     &lt;enumeration value="suburbanRailwayService"/&gt;
 *     &lt;enumeration value="urbanRail"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *     &lt;enumeration value="undergroundService"/&gt;
 *     &lt;enumeration value="metroService"/&gt;
 *     &lt;enumeration value="trolleyBusService"/&gt;
 *     &lt;enumeration value="tramService"/&gt;
 *     &lt;enumeration value="waterTransport"/&gt;
 *     &lt;enumeration value="ferryService"/&gt;
 *     &lt;enumeration value="telecabin"/&gt;
 *     &lt;enumeration value="telecabinService"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="selfDrive"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="allServices"/&gt;
 *     &lt;enumeration value="allServicesExcept"/&gt;
 *     &lt;enumeration value="pti1_0"/&gt;
 *     &lt;enumeration value="pti1_1"/&gt;
 *     &lt;enumeration value="pti1_2"/&gt;
 *     &lt;enumeration value="pti1_3"/&gt;
 *     &lt;enumeration value="pti1_4"/&gt;
 *     &lt;enumeration value="pti1_5"/&gt;
 *     &lt;enumeration value="pti1_6"/&gt;
 *     &lt;enumeration value="pti1_7"/&gt;
 *     &lt;enumeration value="pti1_8"/&gt;
 *     &lt;enumeration value="pti1_9"/&gt;
 *     &lt;enumeration value="pti1_10"/&gt;
 *     &lt;enumeration value="pti1_11"/&gt;
 *     &lt;enumeration value="pti1_12"/&gt;
 *     &lt;enumeration value="pti1_13"/&gt;
 *     &lt;enumeration value="pti1_14"/&gt;
 *     &lt;enumeration value="pti1_15"/&gt;
 *     &lt;enumeration value="pti1_16"/&gt;
 *     &lt;enumeration value="pti1_17"/&gt;
 *     &lt;enumeration value="pti1_18"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "VehicleModesOfTransportEnumeration")
@XmlEnum
public enum VehicleModesOfTransportEnumeration {

    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("coach")
    COACH("coach"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("trolleyBus")
    TROLLEY_BUS("trolleyBus"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("water")
    WATER("water"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("cableway")
    CABLEWAY("cableway"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("lift")
    LIFT("lift"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("snowAndIce")
    SNOW_AND_ICE("snowAndIce"),

    /**
     * Placeholder value if mode of transport is different from all other enumerations in this list (SIRI 2.1) - same meaning as 'undefinedModeOfTransport'.
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * TPEG Pts1_0 - mode of transport is not known to the source system.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts1_1 - use 'air' instead.
     */
    @XmlEnumValue("airService")
    AIR_SERVICE("airService"),

    /**
     * TPEG Pts1_2 (SIRI 2.1) - see also 'cableway'.
     */
    @XmlEnumValue("gondolaCableCarService")
    GONDOLA_CABLE_CAR_SERVICE("gondolaCableCarService"),

    /**
     * TPEG Pts1_3 (SIRI 2.1)
     */
    @XmlEnumValue("chairliftService")
    CHAIRLIFT_SERVICE("chairliftService"),

    /**
     * TPEG Pts1_4 (SIRI 2.1) - use 'lift' instead.
     */
    @XmlEnumValue("elevatorService")
    ELEVATOR_SERVICE("elevatorService"),

    /**
     * TPEG Pts1_5 - use 'rail' instead.
     */
    @XmlEnumValue("railwayService")
    RAILWAY_SERVICE("railwayService"),

    /**
     * TPEG Pts1_6 - see also 'urbanRail'.
     */
    @XmlEnumValue("urbanRailwayService")
    URBAN_RAILWAY_SERVICE("urbanRailwayService"),

    /**
     * TPEG Pts1_7 (SIRI 2.1)
     */
    @XmlEnumValue("lightRailwayService")
    LIGHT_RAILWAY_SERVICE("lightRailwayService"),

    /**
     * TPEG Pts1_8 (SIRI 2.1)
     */
    @XmlEnumValue("rackRailService")
    RACK_RAIL_SERVICE("rackRailService"),

    /**
     * TPEG Pts1_9 - use 'funicular' instead.
     */
    @XmlEnumValue("funicularService")
    FUNICULAR_SERVICE("funicularService"),

    /**
     * TPEG Pts1_10 - use 'bus' instead.
     */
    @XmlEnumValue("busService")
    BUS_SERVICE("busService"),

    /**
     * TPEG Pts1_11 (SIRI 2.1) - use 'trolleyBus' instead.
     */
    @XmlEnumValue("trolleybusService")
    TROLLEYBUS_SERVICE("trolleybusService"),

    /**
     * TPEG Pts1_12 - use 'coach' instead.
     */
    @XmlEnumValue("coachService")
    COACH_SERVICE("coachService"),

    /**
     * TPEG Pts1_13 - use 'taxi' instead.
     */
    @XmlEnumValue("taxiService")
    TAXI_SERVICE("taxiService"),

    /**
     * TPEG Pts1_14 (SIRI 2.1)
     */
    @XmlEnumValue("rentalVehicle")
    RENTAL_VEHICLE("rentalVehicle"),

    /**
     * TPEG Pts1_15 - use 'water' instead.
     */
    @XmlEnumValue("waterTransportService")
    WATER_TRANSPORT_SERVICE("waterTransportService"),

    /**
     * TPEG Pts1_16 (SIRI 2.1)
     */
    @XmlEnumValue("cableDrawnBoatService")
    CABLE_DRAWN_BOAT_SERVICE("cableDrawnBoatService"),

    /**
     * TPEG Pts1_255 (SIRI 2.1) - mode of transport is not supported in this list.
     */
    @XmlEnumValue("undefinedModeOfTransport")
    UNDEFINED_MODE_OF_TRANSPORT("undefinedModeOfTransport"),
    @XmlEnumValue("suburbanRail")
    SUBURBAN_RAIL("suburbanRail"),

    /**
     * See also 'suburbanRail'.
     */
    @XmlEnumValue("suburbanRailwayService")
    SUBURBAN_RAILWAY_SERVICE("suburbanRailwayService"),
    @XmlEnumValue("urbanRail")
    URBAN_RAIL("urbanRail"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground"),

    /**
     * See also 'underground'.
     */
    @XmlEnumValue("undergroundService")
    UNDERGROUND_SERVICE("undergroundService"),

    /**
     * Use 'metro' instead.
     */
    @XmlEnumValue("metroService")
    METRO_SERVICE("metroService"),

    /**
     * Use 'trolleyBus' instead.
     */
    @XmlEnumValue("trolleyBusService")
    TROLLEY_BUS_SERVICE("trolleyBusService"),

    /**
     * Use 'tram' instead.
     */
    @XmlEnumValue("tramService")
    TRAM_SERVICE("tramService"),

    /**
     * Use 'water' instead.
     */
    @XmlEnumValue("waterTransport")
    WATER_TRANSPORT("waterTransport"),

    /**
     * Use 'ferry' instead.
     */
    @XmlEnumValue("ferryService")
    FERRY_SERVICE("ferryService"),

    /**
     * See also 'cableway'.
     */
    @XmlEnumValue("telecabin")
    TELECABIN("telecabin"),

    /**
     * See also 'telecabin'.
     */
    @XmlEnumValue("telecabinService")
    TELECABIN_SERVICE("telecabinService"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("selfDrive")
    SELF_DRIVE("selfDrive"),
    @XmlEnumValue("all")
    ALL("all"),

    /**
     * See also 'all'.
     */
    @XmlEnumValue("allServices")
    ALL_SERVICES("allServices"),
    @XmlEnumValue("allServicesExcept")
    ALL_SERVICES_EXCEPT("allServicesExcept"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_0")
    PTI_1___0("pti1_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_1")
    PTI_1___1("pti1_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_2")
    PTI_1___2("pti1_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_3")
    PTI_1___3("pti1_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_4")
    PTI_1___4("pti1_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_5")
    PTI_1___5("pti1_5"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_6")
    PTI_1___6("pti1_6"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_7")
    PTI_1___7("pti1_7"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_8")
    PTI_1___8("pti1_8"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_9")
    PTI_1___9("pti1_9"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_10")
    PTI_1___10("pti1_10"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_11")
    PTI_1___11("pti1_11"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_12")
    PTI_1___12("pti1_12"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_13")
    PTI_1___13("pti1_13"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_14")
    PTI_1___14("pti1_14"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_15")
    PTI_1___15("pti1_15"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_16")
    PTI_1___16("pti1_16"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_17")
    PTI_1___17("pti1_17"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti1_18")
    PTI_1___18("pti1_18");
    private final String value;

    VehicleModesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleModesOfTransportEnumeration fromValue(String v) {
        for (VehicleModesOfTransportEnumeration c : VehicleModesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
