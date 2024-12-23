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
 * <p>Java-Klasse für AdviceTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AdviceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="useReplacementBus"/&gt;
 *     &lt;enumeration value="useReplacementTrain"/&gt;
 *     &lt;enumeration value="useAlternativeRoute"/&gt;
 *     &lt;enumeration value="goOnFoot"/&gt;
 *     &lt;enumeration value="dangerLeaveStation"/&gt;
 *     &lt;enumeration value="noMeansOfTravel"/&gt;
 *     &lt;enumeration value="useDifferentStops"/&gt;
 *     &lt;enumeration value="useAlternativeStop"/&gt;
 *     &lt;enumeration value="dangerDoNotLeaveVehicle"/&gt;
 *     &lt;enumeration value="takeAdviceAnnouncements"/&gt;
 *     &lt;enumeration value="takeAdvicePersonnel"/&gt;
 *     &lt;enumeration value="obeyAdvicePolice"/&gt;
 *     &lt;enumeration value="useOtherPT"/&gt;
 *     &lt;enumeration value="useInterchange"/&gt;
 *     &lt;enumeration value="noAdvice"/&gt;
 *     &lt;enumeration value="undefinedAdvice"/&gt;
 *     &lt;enumeration value="takeDetour"/&gt;
 *     &lt;enumeration value="useAlternativeAccess"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdviceTypeEnumeration")
@XmlEnum
public enum AdviceTypeEnumeration {


    /**
     * TPEG Pts39_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts39_1, use replacement bus
     * 
     */
    @XmlEnumValue("useReplacementBus")
    USE_REPLACEMENT_BUS("useReplacementBus"),

    /**
     * TPEG Pts39_2, use replacement train
     * 
     */
    @XmlEnumValue("useReplacementTrain")
    USE_REPLACEMENT_TRAIN("useReplacementTrain"),

    /**
     * TPEG Pts39_3, use the alternative route
     * 
     */
    @XmlEnumValue("useAlternativeRoute")
    USE_ALTERNATIVE_ROUTE("useAlternativeRoute"),

    /**
     * TPEG Pts39_4, go on foot
     * 
     */
    @XmlEnumValue("goOnFoot")
    GO_ON_FOOT("goOnFoot"),

    /**
     * TPEG Pts39_5, please leave the station! Danger!
     * 
     */
    @XmlEnumValue("dangerLeaveStation")
    DANGER_LEAVE_STATION("dangerLeaveStation"),

    /**
     * TPEG Pts39_6, no means of travel
     * 
     */
    @XmlEnumValue("noMeansOfTravel")
    NO_MEANS_OF_TRAVEL("noMeansOfTravel"),

    /**
     * TPEG Pts39_7, use different stops
     * 
     */
    @XmlEnumValue("useDifferentStops")
    USE_DIFFERENT_STOPS("useDifferentStops"),

    /**
     * TPEG Pts39_8, use alternative stop
     * 
     */
    @XmlEnumValue("useAlternativeStop")
    USE_ALTERNATIVE_STOP("useAlternativeStop"),

    /**
     * TPEG Pts39_9, do not leave vehicle! Danger!
     * 
     */
    @XmlEnumValue("dangerDoNotLeaveVehicle")
    DANGER_DO_NOT_LEAVE_VEHICLE("dangerDoNotLeaveVehicle"),

    /**
     * TPEG Pts39_10, take advice from announcements
     * 
     */
    @XmlEnumValue("takeAdviceAnnouncements")
    TAKE_ADVICE_ANNOUNCEMENTS("takeAdviceAnnouncements"),

    /**
     * TPEG Pts39_11, take advice from personnel
     * 
     */
    @XmlEnumValue("takeAdvicePersonnel")
    TAKE_ADVICE_PERSONNEL("takeAdvicePersonnel"),

    /**
     * TPEG Pts39_12, obey advice from police
     * 
     */
    @XmlEnumValue("obeyAdvicePolice")
    OBEY_ADVICE_POLICE("obeyAdvicePolice"),

    /**
     * use other PT services
     * 
     */
    @XmlEnumValue("useOtherPT")
    USE_OTHER_PT("useOtherPT"),

    /**
     * use interchange
     * 
     */
    @XmlEnumValue("useInterchange")
    USE_INTERCHANGE("useInterchange"),

    /**
     * no advice
     * 
     */
    @XmlEnumValue("noAdvice")
    NO_ADVICE("noAdvice"),

    /**
     * TPEG Pts39_255, undefined advice
     * 
     */
    @XmlEnumValue("undefinedAdvice")
    UNDEFINED_ADVICE("undefinedAdvice"),

    /**
     * take detour
     * 
     */
    @XmlEnumValue("takeDetour")
    TAKE_DETOUR("takeDetour"),

    /**
     * change accessibility
     * 
     */
    @XmlEnumValue("useAlternativeAccess")
    USE_ALTERNATIVE_ACCESS("useAlternativeAccess");
    private final String value;

    AdviceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdviceTypeEnumeration fromValue(String v) {
        for (AdviceTypeEnumeration c: AdviceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
