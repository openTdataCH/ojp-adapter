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
 * <p>Java-Klasse für CoachSubmodesOfTransportEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CoachSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="internationalCoach"/&gt;
 *     &lt;enumeration value="nationalCoach"/&gt;
 *     &lt;enumeration value="shuttleCoach"/&gt;
 *     &lt;enumeration value="regionalCoach"/&gt;
 *     &lt;enumeration value="specialCoach"/&gt;
 *     &lt;enumeration value="schoolCoach"/&gt;
 *     &lt;enumeration value="sightseeingCoach"/&gt;
 *     &lt;enumeration value="touristCoach"/&gt;
 *     &lt;enumeration value="commuterCoach"/&gt;
 *     &lt;enumeration value="internationalCoachService"/&gt;
 *     &lt;enumeration value="nationalCoachService"/&gt;
 *     &lt;enumeration value="shuttleCoachService"/&gt;
 *     &lt;enumeration value="regionalCoachService"/&gt;
 *     &lt;enumeration value="additionalCoachService"/&gt;
 *     &lt;enumeration value="nightCoachService"/&gt;
 *     &lt;enumeration value="specialCoachService"/&gt;
 *     &lt;enumeration value="sightseeingCoachService"/&gt;
 *     &lt;enumeration value="touristCoachService"/&gt;
 *     &lt;enumeration value="commuterCoachService"/&gt;
 *     &lt;enumeration value="onDemandService"/&gt;
 *     &lt;enumeration value="undefinedCoachService"/&gt;
 *     &lt;enumeration value="allCoachServices"/&gt;
 *     &lt;enumeration value="pti3_0"/&gt;
 *     &lt;enumeration value="pti3_1"/&gt;
 *     &lt;enumeration value="pti3_2"/&gt;
 *     &lt;enumeration value="pti3_3"/&gt;
 *     &lt;enumeration value="pti3_4"/&gt;
 *     &lt;enumeration value="pti3_5"/&gt;
 *     &lt;enumeration value="pti3_6"/&gt;
 *     &lt;enumeration value="pti3_7"/&gt;
 *     &lt;enumeration value="pti3_8"/&gt;
 *     &lt;enumeration value="pti3_9"/&gt;
 *     &lt;enumeration value="pti3_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoachSubmodesOfTransportEnumeration")
@XmlEnum
public enum CoachSubmodesOfTransportEnumeration {


    /**
     * TPEG Pts103_0 - submode of transport is not known to the source system.
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
     * (SIRI 2.1) - see also 'internationalCoachService'.
     * 
     */
    @XmlEnumValue("internationalCoach")
    INTERNATIONAL_COACH("internationalCoach"),

    /**
     * (SIRI 2.1) - see also 'nationalCoachService'.
     * 
     */
    @XmlEnumValue("nationalCoach")
    NATIONAL_COACH("nationalCoach"),

    /**
     * (SIRI 2.1) - see also 'shuttleCoachService'.
     * 
     */
    @XmlEnumValue("shuttleCoach")
    SHUTTLE_COACH("shuttleCoach"),

    /**
     * (SIRI 2.1) - see also 'regionalCoachService'.
     * 
     */
    @XmlEnumValue("regionalCoach")
    REGIONAL_COACH("regionalCoach"),

    /**
     * (SIRI 2.1) - see also 'specialCoachService'.
     * 
     */
    @XmlEnumValue("specialCoach")
    SPECIAL_COACH("specialCoach"),

    /**
     * (SIRI 2.1)
     * 
     */
    @XmlEnumValue("schoolCoach")
    SCHOOL_COACH("schoolCoach"),

    /**
     * (SIRI 2.1) - see also 'sightseeingCoachService'.
     * 
     */
    @XmlEnumValue("sightseeingCoach")
    SIGHTSEEING_COACH("sightseeingCoach"),

    /**
     * (SIRI 2.1) - see also 'touristCoachService'.
     * 
     */
    @XmlEnumValue("touristCoach")
    TOURIST_COACH("touristCoach"),

    /**
     * (SIRI 2.1) - see also 'commuterCoachService'.
     * 
     */
    @XmlEnumValue("commuterCoach")
    COMMUTER_COACH("commuterCoach"),

    /**
     * TPEG Pts103_1
     * 
     */
    @XmlEnumValue("internationalCoachService")
    INTERNATIONAL_COACH_SERVICE("internationalCoachService"),

    /**
     * TPEG Pts103_2
     * 
     */
    @XmlEnumValue("nationalCoachService")
    NATIONAL_COACH_SERVICE("nationalCoachService"),

    /**
     * TPEG Pts103_3
     * 
     */
    @XmlEnumValue("shuttleCoachService")
    SHUTTLE_COACH_SERVICE("shuttleCoachService"),

    /**
     * TPEG Pts103_4
     * 
     */
    @XmlEnumValue("regionalCoachService")
    REGIONAL_COACH_SERVICE("regionalCoachService"),

    /**
     * TPEG Pts103_5 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("additionalCoachService")
    ADDITIONAL_COACH_SERVICE("additionalCoachService"),

    /**
     * TPEG Pts103_6 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("nightCoachService")
    NIGHT_COACH_SERVICE("nightCoachService"),

    /**
     * TPEG Pts103_7
     * 
     */
    @XmlEnumValue("specialCoachService")
    SPECIAL_COACH_SERVICE("specialCoachService"),

    /**
     * TPEG Pts103_8
     * 
     */
    @XmlEnumValue("sightseeingCoachService")
    SIGHTSEEING_COACH_SERVICE("sightseeingCoachService"),

    /**
     * TPEG Pts103_9
     * 
     */
    @XmlEnumValue("touristCoachService")
    TOURIST_COACH_SERVICE("touristCoachService"),

    /**
     * TPEG Pts103_10
     * 
     */
    @XmlEnumValue("commuterCoachService")
    COMMUTER_COACH_SERVICE("commuterCoachService"),

    /**
     * TPEG Pts103_11 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("onDemandService")
    ON_DEMAND_SERVICE("onDemandService"),

    /**
     * TPEG Pts103_255 (SIRI 2.1) - see also 'undefined'.
     * 
     */
    @XmlEnumValue("undefinedCoachService")
    UNDEFINED_COACH_SERVICE("undefinedCoachService"),
    @XmlEnumValue("allCoachServices")
    ALL_COACH_SERVICES("allCoachServices"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_0")
    PTI_3___0("pti3_0"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_1")
    PTI_3___1("pti3_1"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_2")
    PTI_3___2("pti3_2"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_3")
    PTI_3___3("pti3_3"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_4")
    PTI_3___4("pti3_4"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_5")
    PTI_3___5("pti3_5"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_6")
    PTI_3___6("pti3_6"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_7")
    PTI_3___7("pti3_7"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_8")
    PTI_3___8("pti3_8"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_9")
    PTI_3___9("pti3_9"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti3_255")
    PTI_3___255("pti3_255");
    private final String value;

    CoachSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoachSubmodesOfTransportEnumeration fromValue(String v) {
        for (CoachSubmodesOfTransportEnumeration c: CoachSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
