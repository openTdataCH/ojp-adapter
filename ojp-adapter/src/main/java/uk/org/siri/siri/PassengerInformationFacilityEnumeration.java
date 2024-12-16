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
 * <p>Java-Klasse für PassengerInformationFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PassengerInformationFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="nextStopIndicator"/&gt;
 *     &lt;enumeration value="stopAnnouncements"/&gt;
 *     &lt;enumeration value="passengerInformationDisplay"/&gt;
 *     &lt;enumeration value="audioInformation"/&gt;
 *     &lt;enumeration value="visualInformation"/&gt;
 *     &lt;enumeration value="tactilePlatformEdges"/&gt;
 *     &lt;enumeration value="tactileInformation"/&gt;
 *     &lt;enumeration value="walkingGuidance"/&gt;
 *     &lt;enumeration value="journeyPlanning"/&gt;
 *     &lt;enumeration value="lostFound"/&gt;
 *     &lt;enumeration value="informationDesk"/&gt;
 *     &lt;enumeration value="interactiveKiosk-Display"/&gt;
 *     &lt;enumeration value="printedPublicNotice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassengerInformationFacilityEnumeration")
@XmlEnum
public enum PassengerInformationFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("nextStopIndicator")
    NEXT_STOP_INDICATOR("nextStopIndicator"),
    @XmlEnumValue("stopAnnouncements")
    STOP_ANNOUNCEMENTS("stopAnnouncements"),
    @XmlEnumValue("passengerInformationDisplay")
    PASSENGER_INFORMATION_DISPLAY("passengerInformationDisplay"),
    @XmlEnumValue("audioInformation")
    AUDIO_INFORMATION("audioInformation"),
    @XmlEnumValue("visualInformation")
    VISUAL_INFORMATION("visualInformation"),
    @XmlEnumValue("tactilePlatformEdges")
    TACTILE_PLATFORM_EDGES("tactilePlatformEdges"),
    @XmlEnumValue("tactileInformation")
    TACTILE_INFORMATION("tactileInformation"),
    @XmlEnumValue("walkingGuidance")
    WALKING_GUIDANCE("walkingGuidance"),
    @XmlEnumValue("journeyPlanning")
    JOURNEY_PLANNING("journeyPlanning"),
    @XmlEnumValue("lostFound")
    LOST_FOUND("lostFound"),
    @XmlEnumValue("informationDesk")
    INFORMATION_DESK("informationDesk"),
    @XmlEnumValue("interactiveKiosk-Display")
    INTERACTIVE_KIOSK___DISPLAY("interactiveKiosk-Display"),
    @XmlEnumValue("printedPublicNotice")
    PRINTED_PUBLIC_NOTICE("printedPublicNotice");
    private final String value;

    PassengerInformationFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerInformationFacilityEnumeration fromValue(String v) {
        for (PassengerInformationFacilityEnumeration c: PassengerInformationFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
