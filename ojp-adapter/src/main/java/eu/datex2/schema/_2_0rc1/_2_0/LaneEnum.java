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
 * <p>Java-Klasse für LaneEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LaneEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allLanesCompleteCarriageway"/&gt;
 *     &lt;enumeration value="busLane"/&gt;
 *     &lt;enumeration value="busStop"/&gt;
 *     &lt;enumeration value="carPoolLane"/&gt;
 *     &lt;enumeration value="centralReservation"/&gt;
 *     &lt;enumeration value="crawlerLane"/&gt;
 *     &lt;enumeration value="emergencyLane"/&gt;
 *     &lt;enumeration value="escapeLane"/&gt;
 *     &lt;enumeration value="expressLane"/&gt;
 *     &lt;enumeration value="hardShoulder"/&gt;
 *     &lt;enumeration value="heavyVehicleLane"/&gt;
 *     &lt;enumeration value="lane1"/&gt;
 *     &lt;enumeration value="lane2"/&gt;
 *     &lt;enumeration value="lane3"/&gt;
 *     &lt;enumeration value="lane4"/&gt;
 *     &lt;enumeration value="lane5"/&gt;
 *     &lt;enumeration value="lane6"/&gt;
 *     &lt;enumeration value="lane7"/&gt;
 *     &lt;enumeration value="lane8"/&gt;
 *     &lt;enumeration value="lane9"/&gt;
 *     &lt;enumeration value="layBy"/&gt;
 *     &lt;enumeration value="leftHandTurningLane"/&gt;
 *     &lt;enumeration value="leftLane"/&gt;
 *     &lt;enumeration value="localTrafficLane"/&gt;
 *     &lt;enumeration value="middleLane"/&gt;
 *     &lt;enumeration value="opposingLanes"/&gt;
 *     &lt;enumeration value="overtakingLane"/&gt;
 *     &lt;enumeration value="rightHandTurningLane"/&gt;
 *     &lt;enumeration value="rightLane"/&gt;
 *     &lt;enumeration value="rushHourLane"/&gt;
 *     &lt;enumeration value="setDownArea"/&gt;
 *     &lt;enumeration value="slowVehicleLane"/&gt;
 *     &lt;enumeration value="throughTrafficLane"/&gt;
 *     &lt;enumeration value="tidalFlowLane"/&gt;
 *     &lt;enumeration value="turningLane"/&gt;
 *     &lt;enumeration value="verge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LaneEnum")
@XmlEnum
public enum LaneEnum {

    @XmlEnumValue("allLanesCompleteCarriageway")
    ALL_LANES_COMPLETE_CARRIAGEWAY("allLanesCompleteCarriageway"),
    @XmlEnumValue("busLane")
    BUS_LANE("busLane"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("carPoolLane")
    CAR_POOL_LANE("carPoolLane"),
    @XmlEnumValue("centralReservation")
    CENTRAL_RESERVATION("centralReservation"),
    @XmlEnumValue("crawlerLane")
    CRAWLER_LANE("crawlerLane"),
    @XmlEnumValue("emergencyLane")
    EMERGENCY_LANE("emergencyLane"),
    @XmlEnumValue("escapeLane")
    ESCAPE_LANE("escapeLane"),
    @XmlEnumValue("expressLane")
    EXPRESS_LANE("expressLane"),
    @XmlEnumValue("hardShoulder")
    HARD_SHOULDER("hardShoulder"),
    @XmlEnumValue("heavyVehicleLane")
    HEAVY_VEHICLE_LANE("heavyVehicleLane"),
    @XmlEnumValue("lane1")
    LANE_1("lane1"),
    @XmlEnumValue("lane2")
    LANE_2("lane2"),
    @XmlEnumValue("lane3")
    LANE_3("lane3"),
    @XmlEnumValue("lane4")
    LANE_4("lane4"),
    @XmlEnumValue("lane5")
    LANE_5("lane5"),
    @XmlEnumValue("lane6")
    LANE_6("lane6"),
    @XmlEnumValue("lane7")
    LANE_7("lane7"),
    @XmlEnumValue("lane8")
    LANE_8("lane8"),
    @XmlEnumValue("lane9")
    LANE_9("lane9"),
    @XmlEnumValue("layBy")
    LAY_BY("layBy"),
    @XmlEnumValue("leftHandTurningLane")
    LEFT_HAND_TURNING_LANE("leftHandTurningLane"),
    @XmlEnumValue("leftLane")
    LEFT_LANE("leftLane"),
    @XmlEnumValue("localTrafficLane")
    LOCAL_TRAFFIC_LANE("localTrafficLane"),
    @XmlEnumValue("middleLane")
    MIDDLE_LANE("middleLane"),
    @XmlEnumValue("opposingLanes")
    OPPOSING_LANES("opposingLanes"),
    @XmlEnumValue("overtakingLane")
    OVERTAKING_LANE("overtakingLane"),
    @XmlEnumValue("rightHandTurningLane")
    RIGHT_HAND_TURNING_LANE("rightHandTurningLane"),
    @XmlEnumValue("rightLane")
    RIGHT_LANE("rightLane"),
    @XmlEnumValue("rushHourLane")
    RUSH_HOUR_LANE("rushHourLane"),
    @XmlEnumValue("setDownArea")
    SET_DOWN_AREA("setDownArea"),
    @XmlEnumValue("slowVehicleLane")
    SLOW_VEHICLE_LANE("slowVehicleLane"),
    @XmlEnumValue("throughTrafficLane")
    THROUGH_TRAFFIC_LANE("throughTrafficLane"),
    @XmlEnumValue("tidalFlowLane")
    TIDAL_FLOW_LANE("tidalFlowLane"),
    @XmlEnumValue("turningLane")
    TURNING_LANE("turningLane"),
    @XmlEnumValue("verge")
    VERGE("verge");
    private final String value;

    LaneEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaneEnum fromValue(String v) {
        for (LaneEnum c: LaneEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
