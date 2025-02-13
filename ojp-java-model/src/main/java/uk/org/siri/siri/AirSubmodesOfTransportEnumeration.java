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
 * <p>Java-Klasse für AirSubmodesOfTransportEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AirSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="internationalFlight"/&gt;
 *     &lt;enumeration value="domesticFlight"/&gt;
 *     &lt;enumeration value="intercontinentalFlight"/&gt;
 *     &lt;enumeration value="domesticScheduledFlight"/&gt;
 *     &lt;enumeration value="shuttleFlight"/&gt;
 *     &lt;enumeration value="intercontinentalCharterFlight"/&gt;
 *     &lt;enumeration value="internationalCharterFlight"/&gt;
 *     &lt;enumeration value="roundTripCharterFlight"/&gt;
 *     &lt;enumeration value="sightseeingFlight"/&gt;
 *     &lt;enumeration value="helicopterService"/&gt;
 *     &lt;enumeration value="domesticCharterFlight"/&gt;
 *     &lt;enumeration value="SchengenAreaFlight"/&gt;
 *     &lt;enumeration value="airshipService"/&gt;
 *     &lt;enumeration value="shortHaulInternationalFlight"/&gt;
 *     &lt;enumeration value="internationalAirService"/&gt;
 *     &lt;enumeration value="nationalAirService"/&gt;
 *     &lt;enumeration value="intercontinentalAirService"/&gt;
 *     &lt;enumeration value="nationalScheduledAirService"/&gt;
 *     &lt;enumeration value="shuttleAirService"/&gt;
 *     &lt;enumeration value="intercontinentalAirCharterService"/&gt;
 *     &lt;enumeration value="internationalAirCharterService"/&gt;
 *     &lt;enumeration value="roundTripAirCharterService"/&gt;
 *     &lt;enumeration value="sightseeingAirService"/&gt;
 *     &lt;enumeration value="helicopterAirService"/&gt;
 *     &lt;enumeration value="domesticAirCharterService"/&gt;
 *     &lt;enumeration value="SchengenAreaAirService"/&gt;
 *     &lt;enumeration value="onDemandService"/&gt;
 *     &lt;enumeration value="undefinedAirService"/&gt;
 *     &lt;enumeration value="undefinedAircraftService"/&gt;
 *     &lt;enumeration value="allAirServices"/&gt;
 *     &lt;enumeration value="pti8_0"/&gt;
 *     &lt;enumeration value="pti8_1"/&gt;
 *     &lt;enumeration value="pti8_2"/&gt;
 *     &lt;enumeration value="pti8_3"/&gt;
 *     &lt;enumeration value="pti8_4"/&gt;
 *     &lt;enumeration value="pti8_5"/&gt;
 *     &lt;enumeration value="pti8_6"/&gt;
 *     &lt;enumeration value="pti8_7"/&gt;
 *     &lt;enumeration value="pti8_8"/&gt;
 *     &lt;enumeration value="pti8_9"/&gt;
 *     &lt;enumeration value="pti8_10"/&gt;
 *     &lt;enumeration value="pti8_11"/&gt;
 *     &lt;enumeration value="pti8_12"/&gt;
 *     &lt;enumeration value="pti8_13"/&gt;
 *     &lt;enumeration value="pti8_14"/&gt;
 *     &lt;enumeration value="pti8_255"/&gt;
 *     &lt;enumeration value="loc15_0"/&gt;
 *     &lt;enumeration value="loc15_1"/&gt;
 *     &lt;enumeration value="loc15_2"/&gt;
 *     &lt;enumeration value="loc14_3"/&gt;
 *     &lt;enumeration value="loc15_4"/&gt;
 *     &lt;enumeration value="loc15_5"/&gt;
 *     &lt;enumeration value="loc15_6"/&gt;
 *     &lt;enumeration value="loc15_7"/&gt;
 *     &lt;enumeration value="loc15_8"/&gt;
 *     &lt;enumeration value="loc15_9"/&gt;
 *     &lt;enumeration value="loc15_10"/&gt;
 *     &lt;enumeration value="loc15_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AirSubmodesOfTransportEnumeration")
@XmlEnum
public enum AirSubmodesOfTransportEnumeration {

    /**
     * TPEG Pts108_0 - submode of transport is not known to the source system.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * (SIRI 2.1) - see also 'undefinedAircraftService'.
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("internationalFlight")
    INTERNATIONAL_FLIGHT("internationalFlight"),
    @XmlEnumValue("domesticFlight")
    DOMESTIC_FLIGHT("domesticFlight"),
    @XmlEnumValue("intercontinentalFlight")
    INTERCONTINENTAL_FLIGHT("intercontinentalFlight"),
    @XmlEnumValue("domesticScheduledFlight")
    DOMESTIC_SCHEDULED_FLIGHT("domesticScheduledFlight"),
    @XmlEnumValue("shuttleFlight")
    SHUTTLE_FLIGHT("shuttleFlight"),
    @XmlEnumValue("intercontinentalCharterFlight")
    INTERCONTINENTAL_CHARTER_FLIGHT("intercontinentalCharterFlight"),
    @XmlEnumValue("internationalCharterFlight")
    INTERNATIONAL_CHARTER_FLIGHT("internationalCharterFlight"),
    @XmlEnumValue("roundTripCharterFlight")
    ROUND_TRIP_CHARTER_FLIGHT("roundTripCharterFlight"),
    @XmlEnumValue("sightseeingFlight")
    SIGHTSEEING_FLIGHT("sightseeingFlight"),
    @XmlEnumValue("helicopterService")
    HELICOPTER_SERVICE("helicopterService"),
    @XmlEnumValue("domesticCharterFlight")
    DOMESTIC_CHARTER_FLIGHT("domesticCharterFlight"),
    @XmlEnumValue("SchengenAreaFlight")
    SCHENGEN_AREA_FLIGHT("SchengenAreaFlight"),

    /**
     * TPEG Pts108_13
     */
    @XmlEnumValue("airshipService")
    AIRSHIP_SERVICE("airshipService"),
    @XmlEnumValue("shortHaulInternationalFlight")
    SHORT_HAUL_INTERNATIONAL_FLIGHT("shortHaulInternationalFlight"),

    /**
     * TPEG Pts108_1 (SIRI 2.1) - see also 'internationalFlight'.
     */
    @XmlEnumValue("internationalAirService")
    INTERNATIONAL_AIR_SERVICE("internationalAirService"),

    /**
     * TPEG Pts108_2 (SIRI 2.1) - see also 'domesticFlight'.
     */
    @XmlEnumValue("nationalAirService")
    NATIONAL_AIR_SERVICE("nationalAirService"),

    /**
     * TPEG Pts108_3 (SIRI 2.1) - see also 'intercontinentalFlight'.
     */
    @XmlEnumValue("intercontinentalAirService")
    INTERCONTINENTAL_AIR_SERVICE("intercontinentalAirService"),

    /**
     * TPEG Pts108_4 (SIRI 2.1) - see also 'domesticScheduledFlight'.
     */
    @XmlEnumValue("nationalScheduledAirService")
    NATIONAL_SCHEDULED_AIR_SERVICE("nationalScheduledAirService"),

    /**
     * TPEG Pts108_5 (SIRI 2.1) - see also 'shuttleFlight'.
     */
    @XmlEnumValue("shuttleAirService")
    SHUTTLE_AIR_SERVICE("shuttleAirService"),

    /**
     * TPEG Pts108_6 (SIRI 2.1) - see also 'intercontinentalCharterFlight'.
     */
    @XmlEnumValue("intercontinentalAirCharterService")
    INTERCONTINENTAL_AIR_CHARTER_SERVICE("intercontinentalAirCharterService"),

    /**
     * TPEG Pts108_7 (SIRI 2.1) - see also 'intercontinentalCharterFlight'.
     */
    @XmlEnumValue("internationalAirCharterService")
    INTERNATIONAL_AIR_CHARTER_SERVICE("internationalAirCharterService"),

    /**
     * TPEG Pts108_8 (SIRI 2.1) - see also 'roundTripCharterFlight'.
     */
    @XmlEnumValue("roundTripAirCharterService")
    ROUND_TRIP_AIR_CHARTER_SERVICE("roundTripAirCharterService"),

    /**
     * TPEG Pts108_9 (SIRI 2.1) - see also 'sightseeingFlight'.
     */
    @XmlEnumValue("sightseeingAirService")
    SIGHTSEEING_AIR_SERVICE("sightseeingAirService"),

    /**
     * TPEG Pts108_10 (SIRI 2.1) - see also 'helicopterService'.
     */
    @XmlEnumValue("helicopterAirService")
    HELICOPTER_AIR_SERVICE("helicopterAirService"),

    /**
     * TPEG Pts108_11 (SIRI 2.1) - see also 'domesticCharterFlight'.
     */
    @XmlEnumValue("domesticAirCharterService")
    DOMESTIC_AIR_CHARTER_SERVICE("domesticAirCharterService"),

    /**
     * TPEG Pts108_12 (SIRI 2.1) - see also 'SchengenAreaFlight'.
     */
    @XmlEnumValue("SchengenAreaAirService")
    SCHENGEN_AREA_AIR_SERVICE("SchengenAreaAirService"),

    /**
     * TPEG Pts108_14 (SIRI 2.1)
     */
    @XmlEnumValue("onDemandService")
    ON_DEMAND_SERVICE("onDemandService"),

    /**
     * TPEG Pts108_15 (SIRI 2.1) - see also 'undefinedAircraftService'.
     */
    @XmlEnumValue("undefinedAirService")
    UNDEFINED_AIR_SERVICE("undefinedAirService"),

    /**
     * Submode of transport is not supported in this list.
     */
    @XmlEnumValue("undefinedAircraftService")
    UNDEFINED_AIRCRAFT_SERVICE("undefinedAircraftService"),
    @XmlEnumValue("allAirServices")
    ALL_AIR_SERVICES("allAirServices"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_0")
    PTI_8___0("pti8_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_1")
    PTI_8___1("pti8_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_2")
    PTI_8___2("pti8_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_3")
    PTI_8___3("pti8_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_4")
    PTI_8___4("pti8_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_5")
    PTI_8___5("pti8_5"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_6")
    PTI_8___6("pti8_6"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_7")
    PTI_8___7("pti8_7"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_8")
    PTI_8___8("pti8_8"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_9")
    PTI_8___9("pti8_9"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_10")
    PTI_8___10("pti8_10"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_11")
    PTI_8___11("pti8_11"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_12")
    PTI_8___12("pti8_12"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_13")
    PTI_8___13("pti8_13"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_14")
    PTI_8___14("pti8_14"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti8_255")
    PTI_8___255("pti8_255"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_0")
    LOC_15___0("loc15_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_1")
    LOC_15___1("loc15_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_2")
    LOC_15___2("loc15_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_3")
    LOC_14___3("loc14_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_4")
    LOC_15___4("loc15_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_5")
    LOC_15___5("loc15_5"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_6")
    LOC_15___6("loc15_6"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_7")
    LOC_15___7("loc15_7"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_8")
    LOC_15___8("loc15_8"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_9")
    LOC_15___9("loc15_9"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_10")
    LOC_15___10("loc15_10"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc15_255")
    LOC_15___255("loc15_255");
    private final String value;

    AirSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirSubmodesOfTransportEnumeration fromValue(String v) {
        for (AirSubmodesOfTransportEnumeration c : AirSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
