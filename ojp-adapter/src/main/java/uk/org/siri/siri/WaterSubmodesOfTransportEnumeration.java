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
 * <p>Java-Klasse für WaterSubmodesOfTransportEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="WaterSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="internationalCarFerry"/&gt;
 *     &lt;enumeration value="nationalCarFerry"/&gt;
 *     &lt;enumeration value="regionalCarFerry"/&gt;
 *     &lt;enumeration value="localCarFerry"/&gt;
 *     &lt;enumeration value="internationalPassengerFerry"/&gt;
 *     &lt;enumeration value="nationalPassengerFerry"/&gt;
 *     &lt;enumeration value="regionalPassengerFerry"/&gt;
 *     &lt;enumeration value="localPassengerFerry"/&gt;
 *     &lt;enumeration value="postBoat"/&gt;
 *     &lt;enumeration value="trainFerry"/&gt;
 *     &lt;enumeration value="roadFerryLink"/&gt;
 *     &lt;enumeration value="airportBoatLink"/&gt;
 *     &lt;enumeration value="highSpeedVehicleService"/&gt;
 *     &lt;enumeration value="highSpeedPassengerService"/&gt;
 *     &lt;enumeration value="sightseeingService"/&gt;
 *     &lt;enumeration value="schoolBoat"/&gt;
 *     &lt;enumeration value="cableFerry"/&gt;
 *     &lt;enumeration value="riverBus"/&gt;
 *     &lt;enumeration value="scheduledFerry"/&gt;
 *     &lt;enumeration value="shuttleFerryService"/&gt;
 *     &lt;enumeration value="canalBarge"/&gt;
 *     &lt;enumeration value="internationalCarFerryService"/&gt;
 *     &lt;enumeration value="nationalCarFerryService"/&gt;
 *     &lt;enumeration value="regionalCarFerryService"/&gt;
 *     &lt;enumeration value="localCarFerryService"/&gt;
 *     &lt;enumeration value="internationalPassengerFerryService"/&gt;
 *     &lt;enumeration value="nationalPassengerFerryService"/&gt;
 *     &lt;enumeration value="regionalPassengerFerryService"/&gt;
 *     &lt;enumeration value="localPassengerFerryService"/&gt;
 *     &lt;enumeration value="postBoatService"/&gt;
 *     &lt;enumeration value="trainFerryService"/&gt;
 *     &lt;enumeration value="roadLinkFerryService"/&gt;
 *     &lt;enumeration value="airportLinkFerryService"/&gt;
 *     &lt;enumeration value="carHighSpeedFerryService"/&gt;
 *     &lt;enumeration value="passengerHighSpeedFerryService"/&gt;
 *     &lt;enumeration value="scheduledBoatService"/&gt;
 *     &lt;enumeration value="scheduledExpressBoatService"/&gt;
 *     &lt;enumeration value="additionalBoatService"/&gt;
 *     &lt;enumeration value="sightseeingBoatService"/&gt;
 *     &lt;enumeration value="schoolBoatService"/&gt;
 *     &lt;enumeration value="riverBusService"/&gt;
 *     &lt;enumeration value="scheduledFerryService"/&gt;
 *     &lt;enumeration value="shuttleFerryService"/&gt;
 *     &lt;enumeration value="undefinedWaterTransportService"/&gt;
 *     &lt;enumeration value="undefinedWaterTransport"/&gt;
 *     &lt;enumeration value="allWaterTransportServices"/&gt;
 *     &lt;enumeration value="pti7_0"/&gt;
 *     &lt;enumeration value="pti7_1"/&gt;
 *     &lt;enumeration value="pti7_2"/&gt;
 *     &lt;enumeration value="pti7_3"/&gt;
 *     &lt;enumeration value="pti7_4"/&gt;
 *     &lt;enumeration value="pti7_5"/&gt;
 *     &lt;enumeration value="pti7_6"/&gt;
 *     &lt;enumeration value="pti7_7"/&gt;
 *     &lt;enumeration value="pti7_8"/&gt;
 *     &lt;enumeration value="pti7_9"/&gt;
 *     &lt;enumeration value="pti7_10"/&gt;
 *     &lt;enumeration value="pti7_11"/&gt;
 *     &lt;enumeration value="pti7_12"/&gt;
 *     &lt;enumeration value="pti7_13"/&gt;
 *     &lt;enumeration value="pti7_14"/&gt;
 *     &lt;enumeration value="pti7_15"/&gt;
 *     &lt;enumeration value="pti7_16"/&gt;
 *     &lt;enumeration value="pti7_17"/&gt;
 *     &lt;enumeration value="pti7_18"/&gt;
 *     &lt;enumeration value="pti7_19"/&gt;
 *     &lt;enumeration value="pti7_20"/&gt;
 *     &lt;enumeration value="pti7_21"/&gt;
 *     &lt;enumeration value="pti7_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WaterSubmodesOfTransportEnumeration")
@XmlEnum
public enum WaterSubmodesOfTransportEnumeration {


    /**
     * TPEG Pts107_0 - submode of transport is not known to the source system.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * (SIRI 2.1) - see also 'undefinedWaterTransport'.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * (SIRI 2.1) - see also 'internationalCarFerryService'.
     * 
     */
    @XmlEnumValue("internationalCarFerry")
    INTERNATIONAL_CAR_FERRY("internationalCarFerry"),

    /**
     * (SIRI 2.1) - see also 'nationalCarFerryService'.
     * 
     */
    @XmlEnumValue("nationalCarFerry")
    NATIONAL_CAR_FERRY("nationalCarFerry"),

    /**
     * (SIRI 2.1) - see also 'regionalCarFerryService'.
     * 
     */
    @XmlEnumValue("regionalCarFerry")
    REGIONAL_CAR_FERRY("regionalCarFerry"),

    /**
     * (SIRI 2.1) - see also 'localCarFerryService'.
     * 
     */
    @XmlEnumValue("localCarFerry")
    LOCAL_CAR_FERRY("localCarFerry"),
    @XmlEnumValue("internationalPassengerFerry")
    INTERNATIONAL_PASSENGER_FERRY("internationalPassengerFerry"),
    @XmlEnumValue("nationalPassengerFerry")
    NATIONAL_PASSENGER_FERRY("nationalPassengerFerry"),
    @XmlEnumValue("regionalPassengerFerry")
    REGIONAL_PASSENGER_FERRY("regionalPassengerFerry"),
    @XmlEnumValue("localPassengerFerry")
    LOCAL_PASSENGER_FERRY("localPassengerFerry"),
    @XmlEnumValue("postBoat")
    POST_BOAT("postBoat"),
    @XmlEnumValue("trainFerry")
    TRAIN_FERRY("trainFerry"),
    @XmlEnumValue("roadFerryLink")
    ROAD_FERRY_LINK("roadFerryLink"),
    @XmlEnumValue("airportBoatLink")
    AIRPORT_BOAT_LINK("airportBoatLink"),
    @XmlEnumValue("highSpeedVehicleService")
    HIGH_SPEED_VEHICLE_SERVICE("highSpeedVehicleService"),
    @XmlEnumValue("highSpeedPassengerService")
    HIGH_SPEED_PASSENGER_SERVICE("highSpeedPassengerService"),
    @XmlEnumValue("sightseeingService")
    SIGHTSEEING_SERVICE("sightseeingService"),
    @XmlEnumValue("schoolBoat")
    SCHOOL_BOAT("schoolBoat"),
    @XmlEnumValue("cableFerry")
    CABLE_FERRY("cableFerry"),
    @XmlEnumValue("riverBus")
    RIVER_BUS("riverBus"),
    @XmlEnumValue("scheduledFerry")
    SCHEDULED_FERRY("scheduledFerry"),
    @XmlEnumValue("shuttleFerryService")
    SHUTTLE_FERRY_SERVICE("shuttleFerryService"),

    /**
     * (SIRI 2.1)
     * 
     */
    @XmlEnumValue("canalBarge")
    CANAL_BARGE("canalBarge"),

    /**
     * TPEG Pts107_2
     * 
     */
    @XmlEnumValue("internationalCarFerryService")
    INTERNATIONAL_CAR_FERRY_SERVICE("internationalCarFerryService"),

    /**
     * TPEG Pts107_3
     * 
     */
    @XmlEnumValue("nationalCarFerryService")
    NATIONAL_CAR_FERRY_SERVICE("nationalCarFerryService"),

    /**
     * TPEG Pts107_4
     * 
     */
    @XmlEnumValue("regionalCarFerryService")
    REGIONAL_CAR_FERRY_SERVICE("regionalCarFerryService"),

    /**
     * TPEG Pts107_5
     * 
     */
    @XmlEnumValue("localCarFerryService")
    LOCAL_CAR_FERRY_SERVICE("localCarFerryService"),

    /**
     * TPEG Pts107_6 (SIRI 2.1) - see also 'internationalPassengerFerry'.
     * 
     */
    @XmlEnumValue("internationalPassengerFerryService")
    INTERNATIONAL_PASSENGER_FERRY_SERVICE("internationalPassengerFerryService"),

    /**
     * TPEG Pts107_7 (SIRI 2.1) - see also 'nationalPassengerFerry'.
     * 
     */
    @XmlEnumValue("nationalPassengerFerryService")
    NATIONAL_PASSENGER_FERRY_SERVICE("nationalPassengerFerryService"),

    /**
     * TPEG Pts107_8 (SIRI 2.1) - see also 'regionalPassengerFerry'.
     * 
     */
    @XmlEnumValue("regionalPassengerFerryService")
    REGIONAL_PASSENGER_FERRY_SERVICE("regionalPassengerFerryService"),

    /**
     * TPEG Pts107_9 (SIRI 2.1) - see also 'localPassengerFerry'.
     * 
     */
    @XmlEnumValue("localPassengerFerryService")
    LOCAL_PASSENGER_FERRY_SERVICE("localPassengerFerryService"),

    /**
     * TPEG Pts107_10 (SIRI 2.1) - see also 'postBoat'.
     * 
     */
    @XmlEnumValue("postBoatService")
    POST_BOAT_SERVICE("postBoatService"),

    /**
     * TPEG Pts107_11 (SIRI 2.1) - see also 'trainFerry'.
     * 
     */
    @XmlEnumValue("trainFerryService")
    TRAIN_FERRY_SERVICE("trainFerryService"),

    /**
     * TPEG Pts107_12 (SIRI 2.1) - see also 'roadFerryLink'.
     * 
     */
    @XmlEnumValue("roadLinkFerryService")
    ROAD_LINK_FERRY_SERVICE("roadLinkFerryService"),

    /**
     * TPEG Pts107_13 (SIRI 2.1) - see also 'airportBoatLink'.
     * 
     */
    @XmlEnumValue("airportLinkFerryService")
    AIRPORT_LINK_FERRY_SERVICE("airportLinkFerryService"),

    /**
     * TPEG Pts107_14 (SIRI 2.1) - see also 'highSpeedVehicleService'.
     * 
     */
    @XmlEnumValue("carHighSpeedFerryService")
    CAR_HIGH_SPEED_FERRY_SERVICE("carHighSpeedFerryService"),

    /**
     * TPEG Pts107_15 (SIRI 2.1) - see also 'highSpeedPassengerService'.
     * 
     */
    @XmlEnumValue("passengerHighSpeedFerryService")
    PASSENGER_HIGH_SPEED_FERRY_SERVICE("passengerHighSpeedFerryService"),

    /**
     * TPEG Pts107_16 (SIRI 2.1) - see also 'scheduledFerry'.
     * 
     */
    @XmlEnumValue("scheduledBoatService")
    SCHEDULED_BOAT_SERVICE("scheduledBoatService"),

    /**
     * TPEG Pts107_17 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("scheduledExpressBoatService")
    SCHEDULED_EXPRESS_BOAT_SERVICE("scheduledExpressBoatService"),

    /**
     * TPEG Pts107_18 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("additionalBoatService")
    ADDITIONAL_BOAT_SERVICE("additionalBoatService"),

    /**
     * TPEG Pts107_19 (SIRI 2.1) - see also 'sightseeingService'.
     * 
     */
    @XmlEnumValue("sightseeingBoatService")
    SIGHTSEEING_BOAT_SERVICE("sightseeingBoatService"),

    /**
     * TPEG Pts107_20 (SIRI 2.1) - see also 'schoolBoat'.
     * 
     */
    @XmlEnumValue("schoolBoatService")
    SCHOOL_BOAT_SERVICE("schoolBoatService"),

    /**
     * TPEG Pts107_21 (SIRI 2.1) - see also 'riverBus'.
     * 
     */
    @XmlEnumValue("riverBusService")
    RIVER_BUS_SERVICE("riverBusService"),

    /**
     * TPEG Pts107_22 (SIRI 2.1) - see also 'scheduledFerry'.
     * 
     */
    @XmlEnumValue("scheduledFerryService")
    SCHEDULED_FERRY_SERVICE("scheduledFerryService"),

    /**
     * TPEG Pts107_255 (SIRI 2.1) - see also 'undefinedWaterTransport'.
     * 
     */
    @XmlEnumValue("undefinedWaterTransportService")
    UNDEFINED_WATER_TRANSPORT_SERVICE("undefinedWaterTransportService"),

    /**
     * Submode of transport is not supported in this list.
     * 
     */
    @XmlEnumValue("undefinedWaterTransport")
    UNDEFINED_WATER_TRANSPORT("undefinedWaterTransport"),
    @XmlEnumValue("allWaterTransportServices")
    ALL_WATER_TRANSPORT_SERVICES("allWaterTransportServices"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_0")
    PTI_7___0("pti7_0"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_1")
    PTI_7___1("pti7_1"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_2")
    PTI_7___2("pti7_2"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_3")
    PTI_7___3("pti7_3"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_4")
    PTI_7___4("pti7_4"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_5")
    PTI_7___5("pti7_5"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_6")
    PTI_7___6("pti7_6"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_7")
    PTI_7___7("pti7_7"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_8")
    PTI_7___8("pti7_8"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_9")
    PTI_7___9("pti7_9"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_10")
    PTI_7___10("pti7_10"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_11")
    PTI_7___11("pti7_11"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_12")
    PTI_7___12("pti7_12"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_13")
    PTI_7___13("pti7_13"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_14")
    PTI_7___14("pti7_14"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_15")
    PTI_7___15("pti7_15"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_16")
    PTI_7___16("pti7_16"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_17")
    PTI_7___17("pti7_17"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_18")
    PTI_7___18("pti7_18"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_19")
    PTI_7___19("pti7_19"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_20")
    PTI_7___20("pti7_20"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_21")
    PTI_7___21("pti7_21"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti7_255")
    PTI_7___255("pti7_255");
    private final String value;

    WaterSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WaterSubmodesOfTransportEnumeration fromValue(String v) {
        for (WaterSubmodesOfTransportEnumeration c: WaterSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
