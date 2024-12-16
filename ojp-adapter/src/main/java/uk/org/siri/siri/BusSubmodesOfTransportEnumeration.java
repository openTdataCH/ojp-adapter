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
 * <p>Java-Klasse für BusSubmodesOfTransportEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BusSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="localBus"/&gt;
 *     &lt;enumeration value="regionalBus"/&gt;
 *     &lt;enumeration value="expressBus"/&gt;
 *     &lt;enumeration value="nightBus"/&gt;
 *     &lt;enumeration value="postBus"/&gt;
 *     &lt;enumeration value="specialNeedsBus"/&gt;
 *     &lt;enumeration value="mobilityBus"/&gt;
 *     &lt;enumeration value="mobilityBusForRegisteredDisabled"/&gt;
 *     &lt;enumeration value="sightseeingBus"/&gt;
 *     &lt;enumeration value="shuttleBus"/&gt;
 *     &lt;enumeration value="highFrequencyBus"/&gt;
 *     &lt;enumeration value="dedicatedLaneBus"/&gt;
 *     &lt;enumeration value="schoolBus"/&gt;
 *     &lt;enumeration value="schoolAndPublicServiceBus"/&gt;
 *     &lt;enumeration value="railReplacementBus"/&gt;
 *     &lt;enumeration value="demandAndResponseBus"/&gt;
 *     &lt;enumeration value="airportLinkBus"/&gt;
 *     &lt;enumeration value="regionalBusService"/&gt;
 *     &lt;enumeration value="additionalBusService"/&gt;
 *     &lt;enumeration value="expressBusService"/&gt;
 *     &lt;enumeration value="stoppingBusService"/&gt;
 *     &lt;enumeration value="localBusService"/&gt;
 *     &lt;enumeration value="nightBusService"/&gt;
 *     &lt;enumeration value="postBusService"/&gt;
 *     &lt;enumeration value="specialNeedsBusService"/&gt;
 *     &lt;enumeration value="mobilityBusService"/&gt;
 *     &lt;enumeration value="mobilityBusForRegisteredDisabledService"/&gt;
 *     &lt;enumeration value="sightseeingBusService"/&gt;
 *     &lt;enumeration value="shuttleBusService"/&gt;
 *     &lt;enumeration value="schoolBusService"/&gt;
 *     &lt;enumeration value="schoolAndPublicServiceBusService"/&gt;
 *     &lt;enumeration value="railReplacementBusService"/&gt;
 *     &lt;enumeration value="demandAndResponseBusService"/&gt;
 *     &lt;enumeration value="undefinedBusService"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="allBusServices"/&gt;
 *     &lt;enumeration value="pti5_0"/&gt;
 *     &lt;enumeration value="pti5_1"/&gt;
 *     &lt;enumeration value="pti5_2"/&gt;
 *     &lt;enumeration value="pti5_3"/&gt;
 *     &lt;enumeration value="pti5_4"/&gt;
 *     &lt;enumeration value="pti5_5"/&gt;
 *     &lt;enumeration value="pti5_6"/&gt;
 *     &lt;enumeration value="pti5_7"/&gt;
 *     &lt;enumeration value="pti5_8"/&gt;
 *     &lt;enumeration value="pti5_9"/&gt;
 *     &lt;enumeration value="pti5_10"/&gt;
 *     &lt;enumeration value="pti5_11"/&gt;
 *     &lt;enumeration value="pti5_12"/&gt;
 *     &lt;enumeration value="pti5_13"/&gt;
 *     &lt;enumeration value="pti5_14"/&gt;
 *     &lt;enumeration value="pti5_15"/&gt;
 *     &lt;enumeration value="pti5_16"/&gt;
 *     &lt;enumeration value="pti5_255"/&gt;
 *     &lt;enumeration value="loc_10"/&gt;
 *     &lt;enumeration value="loc10_0"/&gt;
 *     &lt;enumeration value="loc10_1"/&gt;
 *     &lt;enumeration value="loc10_2"/&gt;
 *     &lt;enumeration value="loc10_4"/&gt;
 *     &lt;enumeration value="loc10_5"/&gt;
 *     &lt;enumeration value="loc10_6"/&gt;
 *     &lt;enumeration value="loc10_7"/&gt;
 *     &lt;enumeration value="loc10_8"/&gt;
 *     &lt;enumeration value="loc10_9"/&gt;
 *     &lt;enumeration value="loc10_13"/&gt;
 *     &lt;enumeration value="loc10_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusSubmodesOfTransportEnumeration")
@XmlEnum
public enum BusSubmodesOfTransportEnumeration {


    /**
     * TPEG Pts105_0 - submode of transport is not known to the source system.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Submode of transport is not supported in this list.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * (SIRI 2.1) - see also 'localBusService'.
     * 
     */
    @XmlEnumValue("localBus")
    LOCAL_BUS("localBus"),
    @XmlEnumValue("regionalBus")
    REGIONAL_BUS("regionalBus"),
    @XmlEnumValue("expressBus")
    EXPRESS_BUS("expressBus"),
    @XmlEnumValue("nightBus")
    NIGHT_BUS("nightBus"),
    @XmlEnumValue("postBus")
    POST_BUS("postBus"),
    @XmlEnumValue("specialNeedsBus")
    SPECIAL_NEEDS_BUS("specialNeedsBus"),
    @XmlEnumValue("mobilityBus")
    MOBILITY_BUS("mobilityBus"),
    @XmlEnumValue("mobilityBusForRegisteredDisabled")
    MOBILITY_BUS_FOR_REGISTERED_DISABLED("mobilityBusForRegisteredDisabled"),
    @XmlEnumValue("sightseeingBus")
    SIGHTSEEING_BUS("sightseeingBus"),
    @XmlEnumValue("shuttleBus")
    SHUTTLE_BUS("shuttleBus"),

    /**
     * (SIRI 2.1)
     * 
     */
    @XmlEnumValue("highFrequencyBus")
    HIGH_FREQUENCY_BUS("highFrequencyBus"),

    /**
     * (SIRI 2.1)
     * 
     */
    @XmlEnumValue("dedicatedLaneBus")
    DEDICATED_LANE_BUS("dedicatedLaneBus"),
    @XmlEnumValue("schoolBus")
    SCHOOL_BUS("schoolBus"),
    @XmlEnumValue("schoolAndPublicServiceBus")
    SCHOOL_AND_PUBLIC_SERVICE_BUS("schoolAndPublicServiceBus"),
    @XmlEnumValue("railReplacementBus")
    RAIL_REPLACEMENT_BUS("railReplacementBus"),
    @XmlEnumValue("demandAndResponseBus")
    DEMAND_AND_RESPONSE_BUS("demandAndResponseBus"),
    @XmlEnumValue("airportLinkBus")
    AIRPORT_LINK_BUS("airportLinkBus"),

    /**
     * TPEG Pts105_1 (SIRI 2.1) - see also 'regionalBus'.
     * 
     */
    @XmlEnumValue("regionalBusService")
    REGIONAL_BUS_SERVICE("regionalBusService"),

    /**
     * TPEG Pts105_2 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("additionalBusService")
    ADDITIONAL_BUS_SERVICE("additionalBusService"),

    /**
     * TPEG Pts105_3 (SIRI 2.1) - see also 'expressBus'.
     * 
     */
    @XmlEnumValue("expressBusService")
    EXPRESS_BUS_SERVICE("expressBusService"),

    /**
     * TPEG Pts105_4 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("stoppingBusService")
    STOPPING_BUS_SERVICE("stoppingBusService"),

    /**
     * TPEG Pts105_5 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("localBusService")
    LOCAL_BUS_SERVICE("localBusService"),

    /**
     * TPEG Pts105_6 (SIRI 2.1) - see also 'nightBus'.
     * 
     */
    @XmlEnumValue("nightBusService")
    NIGHT_BUS_SERVICE("nightBusService"),

    /**
     * TPEG Pts105_7 (SIRI 2.1) - see also 'postBus'.
     * 
     */
    @XmlEnumValue("postBusService")
    POST_BUS_SERVICE("postBusService"),

    /**
     * TPEG Pts105_8 (SIRI 2.1) - see also 'specialNeedsBus'.
     * 
     */
    @XmlEnumValue("specialNeedsBusService")
    SPECIAL_NEEDS_BUS_SERVICE("specialNeedsBusService"),

    /**
     * TPEG Pts105_9 (SIRI 2.1) - see also 'mobilityBus'.
     * 
     */
    @XmlEnumValue("mobilityBusService")
    MOBILITY_BUS_SERVICE("mobilityBusService"),

    /**
     * TPEG Pts105_10 (SIRI 2.1) - see also 'mobilityBusForRegisteredDisabled'.
     * 
     */
    @XmlEnumValue("mobilityBusForRegisteredDisabledService")
    MOBILITY_BUS_FOR_REGISTERED_DISABLED_SERVICE("mobilityBusForRegisteredDisabledService"),

    /**
     * TPEG Pts105_11 (SIRI 2.1) - see also 'sightseeingBus'.
     * 
     */
    @XmlEnumValue("sightseeingBusService")
    SIGHTSEEING_BUS_SERVICE("sightseeingBusService"),

    /**
     * TPEG Pts105_12 (SIRI 2.1) - see also 'shuttleBus'.
     * 
     */
    @XmlEnumValue("shuttleBusService")
    SHUTTLE_BUS_SERVICE("shuttleBusService"),

    /**
     * TPEG Pts105_13 (SIRI 2.1) - see also 'schoolBus'.
     * 
     */
    @XmlEnumValue("schoolBusService")
    SCHOOL_BUS_SERVICE("schoolBusService"),

    /**
     * TPEG Pts105_14 (SIRI 2.1) - see also 'schoolAndPublicServiceBus'.
     * 
     */
    @XmlEnumValue("schoolAndPublicServiceBusService")
    SCHOOL_AND_PUBLIC_SERVICE_BUS_SERVICE("schoolAndPublicServiceBusService"),

    /**
     * TPEG Pts105_15 (SIRI 2.1) - see also 'railReplacementBus'.
     * 
     */
    @XmlEnumValue("railReplacementBusService")
    RAIL_REPLACEMENT_BUS_SERVICE("railReplacementBusService"),

    /**
     * TPEG Pts105_16 (SIRI 2.1) - see also 'demandAndResponseBus'.
     * 
     */
    @XmlEnumValue("demandAndResponseBusService")
    DEMAND_AND_RESPONSE_BUS_SERVICE("demandAndResponseBusService"),

    /**
     * TPEG Pts105_255 (SIRI 2.1) - see also 'undefined'.
     * 
     */
    @XmlEnumValue("undefinedBusService")
    UNDEFINED_BUS_SERVICE("undefinedBusService"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("allBusServices")
    ALL_BUS_SERVICES("allBusServices"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_0")
    PTI_5___0("pti5_0"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_1")
    PTI_5___1("pti5_1"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_2")
    PTI_5___2("pti5_2"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_3")
    PTI_5___3("pti5_3"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_4")
    PTI_5___4("pti5_4"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_5")
    PTI_5___5("pti5_5"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_6")
    PTI_5___6("pti5_6"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_7")
    PTI_5___7("pti5_7"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_8")
    PTI_5___8("pti5_8"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_9")
    PTI_5___9("pti5_9"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_10")
    PTI_5___10("pti5_10"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_11")
    PTI_5___11("pti5_11"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_12")
    PTI_5___12("pti5_12"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_13")
    PTI_5___13("pti5_13"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_14")
    PTI_5___14("pti5_14"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_15")
    PTI_5___15("pti5_15"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_16")
    PTI_5___16("pti5_16"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti5_255")
    PTI_5___255("pti5_255"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc_10")
    LOC___10("loc_10"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_0")
    LOC_10___0("loc10_0"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_1")
    LOC_10___1("loc10_1"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_2")
    LOC_10___2("loc10_2"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_4")
    LOC_10___4("loc10_4"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_5")
    LOC_10___5("loc10_5"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_6")
    LOC_10___6("loc10_6"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_7")
    LOC_10___7("loc10_7"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_8")
    LOC_10___8("loc10_8"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_9")
    LOC_10___9("loc10_9"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_13")
    LOC_10___13("loc10_13"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc10_255")
    LOC_10___255("loc10_255");
    private final String value;

    BusSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusSubmodesOfTransportEnumeration fromValue(String v) {
        for (BusSubmodesOfTransportEnumeration c: BusSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
