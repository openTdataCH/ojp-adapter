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
 * <p>Java-Klasse für RailSubmodesOfTransportEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RailSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="local"/&gt;
 *     &lt;enumeration value="highSpeedRail"/&gt;
 *     &lt;enumeration value="suburbanRailway"/&gt;
 *     &lt;enumeration value="regionalRail"/&gt;
 *     &lt;enumeration value="interregionalRail"/&gt;
 *     &lt;enumeration value="longDistance"/&gt;
 *     &lt;enumeration value="international"/&gt;
 *     &lt;enumeration value="sleeperRailService"/&gt;
 *     &lt;enumeration value="nightRail"/&gt;
 *     &lt;enumeration value="carTransportRailService"/&gt;
 *     &lt;enumeration value="touristRailway"/&gt;
 *     &lt;enumeration value="airportLinkRail"/&gt;
 *     &lt;enumeration value="railShuttle"/&gt;
 *     &lt;enumeration value="replacementRailService"/&gt;
 *     &lt;enumeration value="specialTrain"/&gt;
 *     &lt;enumeration value="crossCountryRail"/&gt;
 *     &lt;enumeration value="rackAndPinionRailway"/&gt;
 *     &lt;enumeration value="highSpeedRailService"/&gt;
 *     &lt;enumeration value="longDistanceInternationalRailService"/&gt;
 *     &lt;enumeration value="longDistanceRailService"/&gt;
 *     &lt;enumeration value="interRegionalExpressRailService"/&gt;
 *     &lt;enumeration value="interRegionalRailService"/&gt;
 *     &lt;enumeration value="regionalExpressRailService"/&gt;
 *     &lt;enumeration value="regionalRailService"/&gt;
 *     &lt;enumeration value="touristRailwayService"/&gt;
 *     &lt;enumeration value="railShuttleService"/&gt;
 *     &lt;enumeration value="suburbanRailService"/&gt;
 *     &lt;enumeration value="suburbanNightRailService"/&gt;
 *     &lt;enumeration value="specialRailService"/&gt;
 *     &lt;enumeration value="lorryTransportRailService"/&gt;
 *     &lt;enumeration value="vehicleTransportRailService"/&gt;
 *     &lt;enumeration value="vehicleTunnelTransportRailService"/&gt;
 *     &lt;enumeration value="additionalRailService"/&gt;
 *     &lt;enumeration value="undefinedRailService"/&gt;
 *     &lt;enumeration value="longDistanceTrain"/&gt;
 *     &lt;enumeration value="specialTrainService"/&gt;
 *     &lt;enumeration value="crossCountryRailService"/&gt;
 *     &lt;enumeration value="vehicleRailTransportService"/&gt;
 *     &lt;enumeration value="additionalTrainService"/&gt;
 *     &lt;enumeration value="allRailServices"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="interbational"/&gt;
 *     &lt;enumeration value="pti2_0"/&gt;
 *     &lt;enumeration value="pti2_1"/&gt;
 *     &lt;enumeration value="pti2_2"/&gt;
 *     &lt;enumeration value="pti2_3"/&gt;
 *     &lt;enumeration value="pti2_4"/&gt;
 *     &lt;enumeration value="pti2_5"/&gt;
 *     &lt;enumeration value="pti2_6"/&gt;
 *     &lt;enumeration value="pti2_7"/&gt;
 *     &lt;enumeration value="pti2_8"/&gt;
 *     &lt;enumeration value="pti2_9"/&gt;
 *     &lt;enumeration value="pti2_10"/&gt;
 *     &lt;enumeration value="pti2_11"/&gt;
 *     &lt;enumeration value="pti2_12"/&gt;
 *     &lt;enumeration value="pti2_13"/&gt;
 *     &lt;enumeration value="pti2_14"/&gt;
 *     &lt;enumeration value="pti2_15"/&gt;
 *     &lt;enumeration value="pti2_16"/&gt;
 *     &lt;enumeration value="pti2_17"/&gt;
 *     &lt;enumeration value="pti2_255"/&gt;
 *     &lt;enumeration value="loc13_0"/&gt;
 *     &lt;enumeration value="loc13_1"/&gt;
 *     &lt;enumeration value="loc13_2"/&gt;
 *     &lt;enumeration value="loc13_3"/&gt;
 *     &lt;enumeration value="loc13_4"/&gt;
 *     &lt;enumeration value="loc13_5"/&gt;
 *     &lt;enumeration value="loc13_6"/&gt;
 *     &lt;enumeration value="loc13_7"/&gt;
 *     &lt;enumeration value="loc13_8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "RailSubmodesOfTransportEnumeration")
@XmlEnum
public enum RailSubmodesOfTransportEnumeration {

    /**
     * TPEG Pts102_0 - submode of transport is not known to the source system.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("local")
    LOCAL("local"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("highSpeedRail")
    HIGH_SPEED_RAIL("highSpeedRail"),
    @XmlEnumValue("suburbanRailway")
    SUBURBAN_RAILWAY("suburbanRailway"),
    @XmlEnumValue("regionalRail")
    REGIONAL_RAIL("regionalRail"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("interregionalRail")
    INTERREGIONAL_RAIL("interregionalRail"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("longDistance")
    LONG_DISTANCE("longDistance"),
    @XmlEnumValue("international")
    INTERNATIONAL("international"),

    /**
     * TPEG Pts105_6
     */
    @XmlEnumValue("sleeperRailService")
    SLEEPER_RAIL_SERVICE("sleeperRailService"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("nightRail")
    NIGHT_RAIL("nightRail"),
    @XmlEnumValue("carTransportRailService")
    CAR_TRANSPORT_RAIL_SERVICE("carTransportRailService"),
    @XmlEnumValue("touristRailway")
    TOURIST_RAILWAY("touristRailway"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("airportLinkRail")
    AIRPORT_LINK_RAIL("airportLinkRail"),
    @XmlEnumValue("railShuttle")
    RAIL_SHUTTLE("railShuttle"),

    /**
     * TPEG Pts105_13
     */
    @XmlEnumValue("replacementRailService")
    REPLACEMENT_RAIL_SERVICE("replacementRailService"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("specialTrain")
    SPECIAL_TRAIN("specialTrain"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("crossCountryRail")
    CROSS_COUNTRY_RAIL("crossCountryRail"),
    @XmlEnumValue("rackAndPinionRailway")
    RACK_AND_PINION_RAILWAY("rackAndPinionRailway"),

    /**
     * TPEG Pts102_1 - see also 'highSpeedRail'.
     */
    @XmlEnumValue("highSpeedRailService")
    HIGH_SPEED_RAIL_SERVICE("highSpeedRailService"),

    /**
     * TPEG Pts102_2 (SIRI 2.1) - see also 'international'.
     */
    @XmlEnumValue("longDistanceInternationalRailService")
    LONG_DISTANCE_INTERNATIONAL_RAIL_SERVICE("longDistanceInternationalRailService"),

    /**
     * TPEG Pts102_3 (SIRI 2.1) - see also 'longDistance'.
     */
    @XmlEnumValue("longDistanceRailService")
    LONG_DISTANCE_RAIL_SERVICE("longDistanceRailService"),

    /**
     * TPEG Pts102_4 (SIRI 2.1)
     */
    @XmlEnumValue("interRegionalExpressRailService")
    INTER_REGIONAL_EXPRESS_RAIL_SERVICE("interRegionalExpressRailService"),

    /**
     * TPEG Pts105_5 - see also 'interregionalRail'.
     */
    @XmlEnumValue("interRegionalRailService")
    INTER_REGIONAL_RAIL_SERVICE("interRegionalRailService"),

    /**
     * TPEG Pts105_7 (SIRI 2.1)
     */
    @XmlEnumValue("regionalExpressRailService")
    REGIONAL_EXPRESS_RAIL_SERVICE("regionalExpressRailService"),

    /**
     * TPEG Pts105_8 (SIRI 2.1) - see also 'regionalRail'.
     */
    @XmlEnumValue("regionalRailService")
    REGIONAL_RAIL_SERVICE("regionalRailService"),

    /**
     * TPEG Pts105_9 (SIRI 2.1) - see also 'touristRailway'.
     */
    @XmlEnumValue("touristRailwayService")
    TOURIST_RAILWAY_SERVICE("touristRailwayService"),

    /**
     * TPEG Pts105_10 (SIRI 2.1) - see also 'railShuttle'.
     */
    @XmlEnumValue("railShuttleService")
    RAIL_SHUTTLE_SERVICE("railShuttleService"),

    /**
     * TPEG Pts105_11 (SIRI 2.1)
     */
    @XmlEnumValue("suburbanRailService")
    SUBURBAN_RAIL_SERVICE("suburbanRailService"),

    /**
     * TPEG Pts105_12 (SIRI 2.1) - see also 'nightRail'.
     */
    @XmlEnumValue("suburbanNightRailService")
    SUBURBAN_NIGHT_RAIL_SERVICE("suburbanNightRailService"),

    /**
     * TPEG Pts105_14 (SIRI 2.1) - see also 'specialTrain'.
     */
    @XmlEnumValue("specialRailService")
    SPECIAL_RAIL_SERVICE("specialRailService"),

    /**
     * TPEG Pts105_15
     */
    @XmlEnumValue("lorryTransportRailService")
    LORRY_TRANSPORT_RAIL_SERVICE("lorryTransportRailService"),

    /**
     * TPEG Pts105_17 (SIRI 2.1) - see also 'vehicleRailTransportService'.
     */
    @XmlEnumValue("vehicleTransportRailService")
    VEHICLE_TRANSPORT_RAIL_SERVICE("vehicleTransportRailService"),

    /**
     * TPEG Pts105_18 (SIRI 2.1)
     */
    @XmlEnumValue("vehicleTunnelTransportRailService")
    VEHICLE_TUNNEL_TRANSPORT_RAIL_SERVICE("vehicleTunnelTransportRailService"),

    /**
     * TPEG Pts105_19 (SIRI 2.1) - see also 'additionalTrainService'.
     */
    @XmlEnumValue("additionalRailService")
    ADDITIONAL_RAIL_SERVICE("additionalRailService"),

    /**
     * TPEG Pts105_255 (SIRI 2.1) - see also 'undefined'.
     */
    @XmlEnumValue("undefinedRailService")
    UNDEFINED_RAIL_SERVICE("undefinedRailService"),

    /**
     * See also 'longDistance'.
     */
    @XmlEnumValue("longDistanceTrain")
    LONG_DISTANCE_TRAIN("longDistanceTrain"),
    @XmlEnumValue("specialTrainService")
    SPECIAL_TRAIN_SERVICE("specialTrainService"),
    @XmlEnumValue("crossCountryRailService")
    CROSS_COUNTRY_RAIL_SERVICE("crossCountryRailService"),
    @XmlEnumValue("vehicleRailTransportService")
    VEHICLE_RAIL_TRANSPORT_SERVICE("vehicleRailTransportService"),
    @XmlEnumValue("additionalTrainService")
    ADDITIONAL_TRAIN_SERVICE("additionalTrainService"),
    @XmlEnumValue("allRailServices")
    ALL_RAIL_SERVICES("allRailServices"),

    /**
     * Submode of transport is not supported in this list.
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("interbational")
    INTERBATIONAL("interbational"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_0")
    PTI_2___0("pti2_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_1")
    PTI_2___1("pti2_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_2")
    PTI_2___2("pti2_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_3")
    PTI_2___3("pti2_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_4")
    PTI_2___4("pti2_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_5")
    PTI_2___5("pti2_5"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_6")
    PTI_2___6("pti2_6"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_7")
    PTI_2___7("pti2_7"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_8")
    PTI_2___8("pti2_8"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_9")
    PTI_2___9("pti2_9"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_10")
    PTI_2___10("pti2_10"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_11")
    PTI_2___11("pti2_11"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_12")
    PTI_2___12("pti2_12"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_13")
    PTI_2___13("pti2_13"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_14")
    PTI_2___14("pti2_14"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_15")
    PTI_2___15("pti2_15"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_16")
    PTI_2___16("pti2_16"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_17")
    PTI_2___17("pti2_17"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti2_255")
    PTI_2___255("pti2_255"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_0")
    LOC_13___0("loc13_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_1")
    LOC_13___1("loc13_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_2")
    LOC_13___2("loc13_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_3")
    LOC_13___3("loc13_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_4")
    LOC_13___4("loc13_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_5")
    LOC_13___5("loc13_5"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_6")
    LOC_13___6("loc13_6"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_7")
    LOC_13___7("loc13_7"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc13_8")
    LOC_13___8("loc13_8");
    private final String value;

    RailSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RailSubmodesOfTransportEnumeration fromValue(String v) {
        for (RailSubmodesOfTransportEnumeration c : RailSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
