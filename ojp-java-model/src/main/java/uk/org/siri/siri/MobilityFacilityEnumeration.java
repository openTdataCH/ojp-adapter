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
 * <p>Java-Klasse für MobilityFacilityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MobilityFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="pti23_255_4"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_16"/&gt;
 *     &lt;enumeration value="suitableForWheelChairs"/&gt;
 *     &lt;enumeration value="pti23_16_1"/&gt;
 *     &lt;enumeration value="lowFloor"/&gt;
 *     &lt;enumeration value="pti23_16_2"/&gt;
 *     &lt;enumeration value="boardingAssistance"/&gt;
 *     &lt;enumeration value="pti23_16_3"/&gt;
 *     &lt;enumeration value="stepFreeAccess"/&gt;
 *     &lt;enumeration value="tactilePatformEdges"/&gt;
 *     &lt;enumeration value="onboardAssistance"/&gt;
 *     &lt;enumeration value="unaccompaniedMinorAssistance"/&gt;
 *     &lt;enumeration value="audioInformation"/&gt;
 *     &lt;enumeration value="visualInformation"/&gt;
 *     &lt;enumeration value="displaysForVisuallyImpaired"/&gt;
 *     &lt;enumeration value="audioForHearingImpaired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "MobilityFacilityEnumeration")
@XmlEnum
public enum MobilityFacilityEnumeration {

    @XmlEnumValue("pti23_255_4")
    PTI_23___255___4("pti23_255_4"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_16")
    PTI_23___16("pti23_16"),
    @XmlEnumValue("suitableForWheelChairs")
    SUITABLE_FOR_WHEEL_CHAIRS("suitableForWheelChairs"),
    @XmlEnumValue("pti23_16_1")
    PTI_23___16___1("pti23_16_1"),
    @XmlEnumValue("lowFloor")
    LOW_FLOOR("lowFloor"),
    @XmlEnumValue("pti23_16_2")
    PTI_23___16___2("pti23_16_2"),
    @XmlEnumValue("boardingAssistance")
    BOARDING_ASSISTANCE("boardingAssistance"),
    @XmlEnumValue("pti23_16_3")
    PTI_23___16___3("pti23_16_3"),
    @XmlEnumValue("stepFreeAccess")
    STEP_FREE_ACCESS("stepFreeAccess"),
    @XmlEnumValue("tactilePatformEdges")
    TACTILE_PATFORM_EDGES("tactilePatformEdges"),
    @XmlEnumValue("onboardAssistance")
    ONBOARD_ASSISTANCE("onboardAssistance"),
    @XmlEnumValue("unaccompaniedMinorAssistance")
    UNACCOMPANIED_MINOR_ASSISTANCE("unaccompaniedMinorAssistance"),
    @XmlEnumValue("audioInformation")
    AUDIO_INFORMATION("audioInformation"),
    @XmlEnumValue("visualInformation")
    VISUAL_INFORMATION("visualInformation"),
    @XmlEnumValue("displaysForVisuallyImpaired")
    DISPLAYS_FOR_VISUALLY_IMPAIRED("displaysForVisuallyImpaired"),
    @XmlEnumValue("audioForHearingImpaired")
    AUDIO_FOR_HEARING_IMPAIRED("audioForHearingImpaired");
    private final String value;

    MobilityFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityFacilityEnumeration fromValue(String v) {
        for (MobilityFacilityEnumeration c : MobilityFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
