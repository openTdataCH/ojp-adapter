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
 * <p>Java-Klasse für ObstructionTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ObstructionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airCrash"/&gt;
 *     &lt;enumeration value="childrenOnRoadway"/&gt;
 *     &lt;enumeration value="clearanceWork"/&gt;
 *     &lt;enumeration value="craneOperating"/&gt;
 *     &lt;enumeration value="cyclistsOnRoadway"/&gt;
 *     &lt;enumeration value="debris"/&gt;
 *     &lt;enumeration value="explosion"/&gt;
 *     &lt;enumeration value="explosionHazard"/&gt;
 *     &lt;enumeration value="hazardsOnTheRoad"/&gt;
 *     &lt;enumeration value="highSpeedChase"/&gt;
 *     &lt;enumeration value="houseFire"/&gt;
 *     &lt;enumeration value="incident"/&gt;
 *     &lt;enumeration value="industrialAccident"/&gt;
 *     &lt;enumeration value="objectOnTheRoad"/&gt;
 *     &lt;enumeration value="objectsFallingFromMovingVehicle"/&gt;
 *     &lt;enumeration value="obstructionOnTheRoad"/&gt;
 *     &lt;enumeration value="peopleOnRoadway"/&gt;
 *     &lt;enumeration value="railCrash"/&gt;
 *     &lt;enumeration value="recklessDriver"/&gt;
 *     &lt;enumeration value="rescueAndRecoveryWork"/&gt;
 *     &lt;enumeration value="severeFrostDamagedRoadway"/&gt;
 *     &lt;enumeration value="shedLoad"/&gt;
 *     &lt;enumeration value="snowAndIceDebris"/&gt;
 *     &lt;enumeration value="spillageOccurringFromMovingVehicle"/&gt;
 *     &lt;enumeration value="spillageOnTheRoad"/&gt;
 *     &lt;enumeration value="unprotectedAccidentArea"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObstructionTypeEnum")
@XmlEnum
public enum ObstructionTypeEnum {

    @XmlEnumValue("airCrash")
    AIR_CRASH("airCrash"),
    @XmlEnumValue("childrenOnRoadway")
    CHILDREN_ON_ROADWAY("childrenOnRoadway"),
    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),
    @XmlEnumValue("craneOperating")
    CRANE_OPERATING("craneOperating"),
    @XmlEnumValue("cyclistsOnRoadway")
    CYCLISTS_ON_ROADWAY("cyclistsOnRoadway"),
    @XmlEnumValue("debris")
    DEBRIS("debris"),
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),
    @XmlEnumValue("hazardsOnTheRoad")
    HAZARDS_ON_THE_ROAD("hazardsOnTheRoad"),
    @XmlEnumValue("highSpeedChase")
    HIGH_SPEED_CHASE("highSpeedChase"),
    @XmlEnumValue("houseFire")
    HOUSE_FIRE("houseFire"),
    @XmlEnumValue("incident")
    INCIDENT("incident"),
    @XmlEnumValue("industrialAccident")
    INDUSTRIAL_ACCIDENT("industrialAccident"),
    @XmlEnumValue("objectOnTheRoad")
    OBJECT_ON_THE_ROAD("objectOnTheRoad"),
    @XmlEnumValue("objectsFallingFromMovingVehicle")
    OBJECTS_FALLING_FROM_MOVING_VEHICLE("objectsFallingFromMovingVehicle"),
    @XmlEnumValue("obstructionOnTheRoad")
    OBSTRUCTION_ON_THE_ROAD("obstructionOnTheRoad"),
    @XmlEnumValue("peopleOnRoadway")
    PEOPLE_ON_ROADWAY("peopleOnRoadway"),
    @XmlEnumValue("railCrash")
    RAIL_CRASH("railCrash"),
    @XmlEnumValue("recklessDriver")
    RECKLESS_DRIVER("recklessDriver"),
    @XmlEnumValue("rescueAndRecoveryWork")
    RESCUE_AND_RECOVERY_WORK("rescueAndRecoveryWork"),
    @XmlEnumValue("severeFrostDamagedRoadway")
    SEVERE_FROST_DAMAGED_ROADWAY("severeFrostDamagedRoadway"),
    @XmlEnumValue("shedLoad")
    SHED_LOAD("shedLoad"),
    @XmlEnumValue("snowAndIceDebris")
    SNOW_AND_ICE_DEBRIS("snowAndIceDebris"),
    @XmlEnumValue("spillageOccurringFromMovingVehicle")
    SPILLAGE_OCCURRING_FROM_MOVING_VEHICLE("spillageOccurringFromMovingVehicle"),
    @XmlEnumValue("spillageOnTheRoad")
    SPILLAGE_ON_THE_ROAD("spillageOnTheRoad"),
    @XmlEnumValue("unprotectedAccidentArea")
    UNPROTECTED_ACCIDENT_AREA("unprotectedAccidentArea"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObstructionTypeEnum fromValue(String v) {
        for (ObstructionTypeEnum c: ObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
