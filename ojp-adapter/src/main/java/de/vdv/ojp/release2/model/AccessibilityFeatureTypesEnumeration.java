//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AccessibilityFeatureTypesEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccessibilityFeatureTypesEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lowFloorAccess"/&gt;
 *     &lt;enumeration value="stepFreeAccess"/&gt;
 *     &lt;enumeration value="accessWithSteps"/&gt;
 *     &lt;enumeration value="slidingStep"/&gt;
 *     &lt;enumeration value="raisedKerb"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="wheelchairLift"/&gt;
 *     &lt;enumeration value="manualRamp"/&gt;
 *     &lt;enumeration value="automaticRamp"/&gt;
 *     &lt;enumeration value="suitableForWheelchairs"/&gt;
 *     &lt;enumeration value="suitableForUnassistedWheelchairs"/&gt;
 *     &lt;enumeration value="suitableForSeverelyDisabled"/&gt;
 *     &lt;enumeration value="suitableForPushchairs"/&gt;
 *     &lt;enumeration value="suitableForBicycles"/&gt;
 *     &lt;enumeration value="tactilePlatformEdges"/&gt;
 *     &lt;enumeration value="tactileGuidingStrips"/&gt;
 *     &lt;enumeration value="tactileOrAuditorySigns"/&gt;
 *     &lt;enumeration value="visualSigns"/&gt;
 *     &lt;enumeration value="elevatorWithTactileButtons"/&gt;
 *     &lt;enumeration value="elevatorWithAcousticAnnouncements"/&gt;
 *     &lt;enumeration value="audioInformation"/&gt;
 *     &lt;enumeration value="audioForHearingImpaired"/&gt;
 *     &lt;enumeration value="visualDisplays"/&gt;
 *     &lt;enumeration value="displaysForVisuallyImpaired"/&gt;
 *     &lt;enumeration value="largePrintTimetables"/&gt;
 *     &lt;enumeration value="boardingAssistance"/&gt;
 *     &lt;enumeration value="onboardAssistance"/&gt;
 *     &lt;enumeration value="unaccompaniedMinorAssistance"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="validator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessibilityFeatureTypesEnumeration")
@XmlEnum
public enum AccessibilityFeatureTypesEnumeration {

    @XmlEnumValue("lowFloorAccess")
    LOW_FLOOR_ACCESS("lowFloorAccess"),
    @XmlEnumValue("stepFreeAccess")
    STEP_FREE_ACCESS("stepFreeAccess"),
    @XmlEnumValue("accessWithSteps")
    ACCESS_WITH_STEPS("accessWithSteps"),
    @XmlEnumValue("slidingStep")
    SLIDING_STEP("slidingStep"),
    @XmlEnumValue("raisedKerb")
    RAISED_KERB("raisedKerb"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("wheelchairLift")
    WHEELCHAIR_LIFT("wheelchairLift"),
    @XmlEnumValue("manualRamp")
    MANUAL_RAMP("manualRamp"),
    @XmlEnumValue("automaticRamp")
    AUTOMATIC_RAMP("automaticRamp"),
    @XmlEnumValue("suitableForWheelchairs")
    SUITABLE_FOR_WHEELCHAIRS("suitableForWheelchairs"),
    @XmlEnumValue("suitableForUnassistedWheelchairs")
    SUITABLE_FOR_UNASSISTED_WHEELCHAIRS("suitableForUnassistedWheelchairs"),
    @XmlEnumValue("suitableForSeverelyDisabled")
    SUITABLE_FOR_SEVERELY_DISABLED("suitableForSeverelyDisabled"),
    @XmlEnumValue("suitableForPushchairs")
    SUITABLE_FOR_PUSHCHAIRS("suitableForPushchairs"),
    @XmlEnumValue("suitableForBicycles")
    SUITABLE_FOR_BICYCLES("suitableForBicycles"),
    @XmlEnumValue("tactilePlatformEdges")
    TACTILE_PLATFORM_EDGES("tactilePlatformEdges"),
    @XmlEnumValue("tactileGuidingStrips")
    TACTILE_GUIDING_STRIPS("tactileGuidingStrips"),
    @XmlEnumValue("tactileOrAuditorySigns")
    TACTILE_OR_AUDITORY_SIGNS("tactileOrAuditorySigns"),
    @XmlEnumValue("visualSigns")
    VISUAL_SIGNS("visualSigns"),
    @XmlEnumValue("elevatorWithTactileButtons")
    ELEVATOR_WITH_TACTILE_BUTTONS("elevatorWithTactileButtons"),
    @XmlEnumValue("elevatorWithAcousticAnnouncements")
    ELEVATOR_WITH_ACOUSTIC_ANNOUNCEMENTS("elevatorWithAcousticAnnouncements"),
    @XmlEnumValue("audioInformation")
    AUDIO_INFORMATION("audioInformation"),
    @XmlEnumValue("audioForHearingImpaired")
    AUDIO_FOR_HEARING_IMPAIRED("audioForHearingImpaired"),
    @XmlEnumValue("visualDisplays")
    VISUAL_DISPLAYS("visualDisplays"),
    @XmlEnumValue("displaysForVisuallyImpaired")
    DISPLAYS_FOR_VISUALLY_IMPAIRED("displaysForVisuallyImpaired"),
    @XmlEnumValue("largePrintTimetables")
    LARGE_PRINT_TIMETABLES("largePrintTimetables"),
    @XmlEnumValue("boardingAssistance")
    BOARDING_ASSISTANCE("boardingAssistance"),
    @XmlEnumValue("onboardAssistance")
    ONBOARD_ASSISTANCE("onboardAssistance"),
    @XmlEnumValue("unaccompaniedMinorAssistance")
    UNACCOMPANIED_MINOR_ASSISTANCE("unaccompaniedMinorAssistance"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    AccessibilityFeatureTypesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessibilityFeatureTypesEnumeration fromValue(String v) {
        for (AccessibilityFeatureTypesEnumeration c: AccessibilityFeatureTypesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
