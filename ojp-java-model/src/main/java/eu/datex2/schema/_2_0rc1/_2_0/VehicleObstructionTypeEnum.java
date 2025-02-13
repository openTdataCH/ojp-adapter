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
 * <p>Java-Klasse für VehicleObstructionTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VehicleObstructionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abandonedVehicle"/&gt;
 *     &lt;enumeration value="abnormalLoad"/&gt;
 *     &lt;enumeration value="brokenDownBus"/&gt;
 *     &lt;enumeration value="brokenDownHeavyLorry"/&gt;
 *     &lt;enumeration value="brokenDownVehicle"/&gt;
 *     &lt;enumeration value="convoy"/&gt;
 *     &lt;enumeration value="damagedVehicle"/&gt;
 *     &lt;enumeration value="dangerousSlowMovingVehicle"/&gt;
 *     &lt;enumeration value="emergencyVehicle"/&gt;
 *     &lt;enumeration value="highSpeedEmergencyVehicle"/&gt;
 *     &lt;enumeration value="longLoad"/&gt;
 *     &lt;enumeration value="militaryConvoy"/&gt;
 *     &lt;enumeration value="overheightVehicle"/&gt;
 *     &lt;enumeration value="prohibitedVehicleOnTheRoadway"/&gt;
 *     &lt;enumeration value="saltingOrGrittingVehicleInUse"/&gt;
 *     &lt;enumeration value="slowMovingMaintenanceVehicle"/&gt;
 *     &lt;enumeration value="slowVehicle"/&gt;
 *     &lt;enumeration value="snowplough"/&gt;
 *     &lt;enumeration value="trackLayingVehicle"/&gt;
 *     &lt;enumeration value="unlitVehicleOnTheRoad"/&gt;
 *     &lt;enumeration value="vehicleOnFire"/&gt;
 *     &lt;enumeration value="vehicleCarryingHazardousMaterials"/&gt;
 *     &lt;enumeration value="vehicleInDifficulty"/&gt;
 *     &lt;enumeration value="vehicleOnWrongCarriageway"/&gt;
 *     &lt;enumeration value="vehicleStuck"/&gt;
 *     &lt;enumeration value="vehicleStuckUnderBridge"/&gt;
 *     &lt;enumeration value="vehicleWithOverheightLoad"/&gt;
 *     &lt;enumeration value="vehicleWithOverwideLoad"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "VehicleObstructionTypeEnum")
@XmlEnum
public enum VehicleObstructionTypeEnum {

    @XmlEnumValue("abandonedVehicle")
    ABANDONED_VEHICLE("abandonedVehicle"),
    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),
    @XmlEnumValue("brokenDownBus")
    BROKEN_DOWN_BUS("brokenDownBus"),
    @XmlEnumValue("brokenDownHeavyLorry")
    BROKEN_DOWN_HEAVY_LORRY("brokenDownHeavyLorry"),
    @XmlEnumValue("brokenDownVehicle")
    BROKEN_DOWN_VEHICLE("brokenDownVehicle"),
    @XmlEnumValue("convoy")
    CONVOY("convoy"),
    @XmlEnumValue("damagedVehicle")
    DAMAGED_VEHICLE("damagedVehicle"),
    @XmlEnumValue("dangerousSlowMovingVehicle")
    DANGEROUS_SLOW_MOVING_VEHICLE("dangerousSlowMovingVehicle"),
    @XmlEnumValue("emergencyVehicle")
    EMERGENCY_VEHICLE("emergencyVehicle"),
    @XmlEnumValue("highSpeedEmergencyVehicle")
    HIGH_SPEED_EMERGENCY_VEHICLE("highSpeedEmergencyVehicle"),
    @XmlEnumValue("longLoad")
    LONG_LOAD("longLoad"),
    @XmlEnumValue("militaryConvoy")
    MILITARY_CONVOY("militaryConvoy"),
    @XmlEnumValue("overheightVehicle")
    OVERHEIGHT_VEHICLE("overheightVehicle"),
    @XmlEnumValue("prohibitedVehicleOnTheRoadway")
    PROHIBITED_VEHICLE_ON_THE_ROADWAY("prohibitedVehicleOnTheRoadway"),
    @XmlEnumValue("saltingOrGrittingVehicleInUse")
    SALTING_OR_GRITTING_VEHICLE_IN_USE("saltingOrGrittingVehicleInUse"),
    @XmlEnumValue("slowMovingMaintenanceVehicle")
    SLOW_MOVING_MAINTENANCE_VEHICLE("slowMovingMaintenanceVehicle"),
    @XmlEnumValue("slowVehicle")
    SLOW_VEHICLE("slowVehicle"),
    @XmlEnumValue("snowplough")
    SNOWPLOUGH("snowplough"),
    @XmlEnumValue("trackLayingVehicle")
    TRACK_LAYING_VEHICLE("trackLayingVehicle"),
    @XmlEnumValue("unlitVehicleOnTheRoad")
    UNLIT_VEHICLE_ON_THE_ROAD("unlitVehicleOnTheRoad"),
    @XmlEnumValue("vehicleOnFire")
    VEHICLE_ON_FIRE("vehicleOnFire"),
    @XmlEnumValue("vehicleCarryingHazardousMaterials")
    VEHICLE_CARRYING_HAZARDOUS_MATERIALS("vehicleCarryingHazardousMaterials"),
    @XmlEnumValue("vehicleInDifficulty")
    VEHICLE_IN_DIFFICULTY("vehicleInDifficulty"),
    @XmlEnumValue("vehicleOnWrongCarriageway")
    VEHICLE_ON_WRONG_CARRIAGEWAY("vehicleOnWrongCarriageway"),
    @XmlEnumValue("vehicleStuck")
    VEHICLE_STUCK("vehicleStuck"),
    @XmlEnumValue("vehicleStuckUnderBridge")
    VEHICLE_STUCK_UNDER_BRIDGE("vehicleStuckUnderBridge"),
    @XmlEnumValue("vehicleWithOverheightLoad")
    VEHICLE_WITH_OVERHEIGHT_LOAD("vehicleWithOverheightLoad"),
    @XmlEnumValue("vehicleWithOverwideLoad")
    VEHICLE_WITH_OVERWIDE_LOAD("vehicleWithOverwideLoad"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VehicleObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleObstructionTypeEnum fromValue(String v) {
        for (VehicleObstructionTypeEnum c : VehicleObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
