//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für GeneralInstructionToRoadUsersTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="GeneralInstructionToRoadUsersTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allowEmergencyVehiclesToPass"/&gt;
 *     &lt;enumeration value="approachWithCare"/&gt;
 *     &lt;enumeration value="avoidTheArea"/&gt;
 *     &lt;enumeration value="closeAllWindowsTurnOffHeaterAndVents"/&gt;
 *     &lt;enumeration value="crossJunctionWithCare"/&gt;
 *     &lt;enumeration value="doNotAllowUnnecessaryGaps"/&gt;
 *     &lt;enumeration value="doNotLeaveYourVehicle"/&gt;
 *     &lt;enumeration value="doNotThrowOutAnyBurningObjects"/&gt;
 *     &lt;enumeration value="doNotUseNavigationSystems"/&gt;
 *     &lt;enumeration value="driveCarefully"/&gt;
 *     &lt;enumeration value="driveWithExtremeCaution"/&gt;
 *     &lt;enumeration value="flashYourLights"/&gt;
 *     &lt;enumeration value="followTheVehicleInFrontSmoothly"/&gt;
 *     &lt;enumeration value="increaseNormalFollowingDistance"/&gt;
 *     &lt;enumeration value="inEmergencyWaitForPatrolService"/&gt;
 *     &lt;enumeration value="keepYourDistance"/&gt;
 *     &lt;enumeration value="leaveYourVehicleProceedToNextSafePlace"/&gt;
 *     &lt;enumeration value="noNakedFlames"/&gt;
 *     &lt;enumeration value="noOvertaking"/&gt;
 *     &lt;enumeration value="noSmoking"/&gt;
 *     &lt;enumeration value="noStopping"/&gt;
 *     &lt;enumeration value="noUturns"/&gt;
 *     &lt;enumeration value="observeSignals"/&gt;
 *     &lt;enumeration value="observeSigns"/&gt;
 *     &lt;enumeration value="onlyTravelIfAbsolutelyNecessary"/&gt;
 *     &lt;enumeration value="overtakeWithCare"/&gt;
 *     &lt;enumeration value="pullOverToTheEdgeOfTheRoadway"/&gt;
 *     &lt;enumeration value="stopAtNextSafePlace"/&gt;
 *     &lt;enumeration value="stopAtNextServiceArea"/&gt;
 *     &lt;enumeration value="switchOffEngine"/&gt;
 *     &lt;enumeration value="switchOffMobilePhonesAndTwoWayRadios"/&gt;
 *     &lt;enumeration value="testYourBrakes"/&gt;
 *     &lt;enumeration value="useBusService"/&gt;
 *     &lt;enumeration value="useFogLights"/&gt;
 *     &lt;enumeration value="useHazardWarningLights"/&gt;
 *     &lt;enumeration value="useHeadlights"/&gt;
 *     &lt;enumeration value="useRailService"/&gt;
 *     &lt;enumeration value="useTramService"/&gt;
 *     &lt;enumeration value="useUndergroundService"/&gt;
 *     &lt;enumeration value="waitForEscortVehicle"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "GeneralInstructionToRoadUsersTypeEnum")
@XmlEnum
public enum GeneralInstructionToRoadUsersTypeEnum {

    @XmlEnumValue("allowEmergencyVehiclesToPass")
    ALLOW_EMERGENCY_VEHICLES_TO_PASS("allowEmergencyVehiclesToPass"),
    @XmlEnumValue("approachWithCare")
    APPROACH_WITH_CARE("approachWithCare"),
    @XmlEnumValue("avoidTheArea")
    AVOID_THE_AREA("avoidTheArea"),
    @XmlEnumValue("closeAllWindowsTurnOffHeaterAndVents")
    CLOSE_ALL_WINDOWS_TURN_OFF_HEATER_AND_VENTS("closeAllWindowsTurnOffHeaterAndVents"),
    @XmlEnumValue("crossJunctionWithCare")
    CROSS_JUNCTION_WITH_CARE("crossJunctionWithCare"),
    @XmlEnumValue("doNotAllowUnnecessaryGaps")
    DO_NOT_ALLOW_UNNECESSARY_GAPS("doNotAllowUnnecessaryGaps"),
    @XmlEnumValue("doNotLeaveYourVehicle")
    DO_NOT_LEAVE_YOUR_VEHICLE("doNotLeaveYourVehicle"),
    @XmlEnumValue("doNotThrowOutAnyBurningObjects")
    DO_NOT_THROW_OUT_ANY_BURNING_OBJECTS("doNotThrowOutAnyBurningObjects"),
    @XmlEnumValue("doNotUseNavigationSystems")
    DO_NOT_USE_NAVIGATION_SYSTEMS("doNotUseNavigationSystems"),
    @XmlEnumValue("driveCarefully")
    DRIVE_CAREFULLY("driveCarefully"),
    @XmlEnumValue("driveWithExtremeCaution")
    DRIVE_WITH_EXTREME_CAUTION("driveWithExtremeCaution"),
    @XmlEnumValue("flashYourLights")
    FLASH_YOUR_LIGHTS("flashYourLights"),
    @XmlEnumValue("followTheVehicleInFrontSmoothly")
    FOLLOW_THE_VEHICLE_IN_FRONT_SMOOTHLY("followTheVehicleInFrontSmoothly"),
    @XmlEnumValue("increaseNormalFollowingDistance")
    INCREASE_NORMAL_FOLLOWING_DISTANCE("increaseNormalFollowingDistance"),
    @XmlEnumValue("inEmergencyWaitForPatrolService")
    IN_EMERGENCY_WAIT_FOR_PATROL_SERVICE("inEmergencyWaitForPatrolService"),
    @XmlEnumValue("keepYourDistance")
    KEEP_YOUR_DISTANCE("keepYourDistance"),
    @XmlEnumValue("leaveYourVehicleProceedToNextSafePlace")
    LEAVE_YOUR_VEHICLE_PROCEED_TO_NEXT_SAFE_PLACE("leaveYourVehicleProceedToNextSafePlace"),
    @XmlEnumValue("noNakedFlames")
    NO_NAKED_FLAMES("noNakedFlames"),
    @XmlEnumValue("noOvertaking")
    NO_OVERTAKING("noOvertaking"),
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),
    @XmlEnumValue("noStopping")
    NO_STOPPING("noStopping"),
    @XmlEnumValue("noUturns")
    NO_UTURNS("noUturns"),
    @XmlEnumValue("observeSignals")
    OBSERVE_SIGNALS("observeSignals"),
    @XmlEnumValue("observeSigns")
    OBSERVE_SIGNS("observeSigns"),
    @XmlEnumValue("onlyTravelIfAbsolutelyNecessary")
    ONLY_TRAVEL_IF_ABSOLUTELY_NECESSARY("onlyTravelIfAbsolutelyNecessary"),
    @XmlEnumValue("overtakeWithCare")
    OVERTAKE_WITH_CARE("overtakeWithCare"),
    @XmlEnumValue("pullOverToTheEdgeOfTheRoadway")
    PULL_OVER_TO_THE_EDGE_OF_THE_ROADWAY("pullOverToTheEdgeOfTheRoadway"),
    @XmlEnumValue("stopAtNextSafePlace")
    STOP_AT_NEXT_SAFE_PLACE("stopAtNextSafePlace"),
    @XmlEnumValue("stopAtNextServiceArea")
    STOP_AT_NEXT_SERVICE_AREA("stopAtNextServiceArea"),
    @XmlEnumValue("switchOffEngine")
    SWITCH_OFF_ENGINE("switchOffEngine"),
    @XmlEnumValue("switchOffMobilePhonesAndTwoWayRadios")
    SWITCH_OFF_MOBILE_PHONES_AND_TWO_WAY_RADIOS("switchOffMobilePhonesAndTwoWayRadios"),
    @XmlEnumValue("testYourBrakes")
    TEST_YOUR_BRAKES("testYourBrakes"),
    @XmlEnumValue("useBusService")
    USE_BUS_SERVICE("useBusService"),
    @XmlEnumValue("useFogLights")
    USE_FOG_LIGHTS("useFogLights"),
    @XmlEnumValue("useHazardWarningLights")
    USE_HAZARD_WARNING_LIGHTS("useHazardWarningLights"),
    @XmlEnumValue("useHeadlights")
    USE_HEADLIGHTS("useHeadlights"),
    @XmlEnumValue("useRailService")
    USE_RAIL_SERVICE("useRailService"),
    @XmlEnumValue("useTramService")
    USE_TRAM_SERVICE("useTramService"),
    @XmlEnumValue("useUndergroundService")
    USE_UNDERGROUND_SERVICE("useUndergroundService"),
    @XmlEnumValue("waitForEscortVehicle")
    WAIT_FOR_ESCORT_VEHICLE("waitForEscortVehicle"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GeneralInstructionToRoadUsersTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralInstructionToRoadUsersTypeEnum fromValue(String v) {
        for (GeneralInstructionToRoadUsersTypeEnum c : GeneralInstructionToRoadUsersTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
