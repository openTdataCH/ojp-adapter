//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für GuidanceAdviceEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="GuidanceAdviceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="origin"/&gt;
 *     &lt;enumeration value="destination"/&gt;
 *     &lt;enumeration value="continue"/&gt;
 *     &lt;enumeration value="keep"/&gt;
 *     &lt;enumeration value="turn"/&gt;
 *     &lt;enumeration value="leave"/&gt;
 *     &lt;enumeration value="enter"/&gt;
 *     &lt;enumeration value="enter_roundabout"/&gt;
 *     &lt;enumeration value="stay_in_roundabout"/&gt;
 *     &lt;enumeration value="leave_roundabout"/&gt;
 *     &lt;enumeration value="enter_builtup_area"/&gt;
 *     &lt;enumeration value="leave_builtup_area"/&gt;
 *     &lt;enumeration value="freewayAccessRamp"/&gt;
 *     &lt;enumeration value="unknown_lane_choice"/&gt;
 *     &lt;enumeration value="left_lane"/&gt;
 *     &lt;enumeration value="middle_lane"/&gt;
 *     &lt;enumeration value="right_lane"/&gt;
 *     &lt;enumeration value="unknown_turning_kind"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "GuidanceAdviceEnumeration")
@XmlEnum
public enum GuidanceAdviceEnumeration {

    /**
     * Defining origin.
     */
    @XmlEnumValue("origin")
    ORIGIN("origin"),

    /**
     * Defining a destination.
     */
    @XmlEnumValue("destination")
    DESTINATION("destination"),

    /**
     * Continue on the same street/road/path.
     */
    @XmlEnumValue("continue")
    CONTINUE("continue"),

    /**
     * Keep going on the same street/road/path.
     */
    @XmlEnumValue("keep")
    KEEP("keep"),

    /**
     * When this value is used, you always must consider the value in TurnAction as well. There must be a TurnAction present if "turn" is used.
     */
    @XmlEnumValue("turn")
    TURN("turn"),

    /**
     * Can be something like an elevator or a vehicle.
     */
    @XmlEnumValue("leave")
    LEAVE("leave"),

    /**
     * Can be something like an elevator or a vehicle.
     */
    @XmlEnumValue("enter")
    ENTER("enter"),

    /**
     * Entering a roundabout.
     */
    @XmlEnumValue("enter_roundabout")
    ENTER___ROUNDABOUT("enter_roundabout"),

    /**
     * Staying in the roundabout.
     */
    @XmlEnumValue("stay_in_roundabout")
    STAY___IN___ROUNDABOUT("stay_in_roundabout"),

    /**
     * Leave the roundabout.
     */
    @XmlEnumValue("leave_roundabout")
    LEAVE___ROUNDABOUT("leave_roundabout"),

    /**
     * Entering a built-up area / community.
     */
    @XmlEnumValue("enter_builtup_area")
    ENTER___BUILTUP___AREA("enter_builtup_area"),

    /**
     * Leave the built-up area / community.
     */
    @XmlEnumValue("leave_builtup_area")
    LEAVE___BUILTUP___AREA("leave_builtup_area"),

    /**
     * Access lane to highway or the like.
     */
    @XmlEnumValue("freewayAccessRamp")
    FREEWAY_ACCESS_RAMP("freewayAccessRamp"),

    /**
     * If it is unclear which lane to choose.
     */
    @XmlEnumValue("unknown_lane_choice")
    UNKNOWN___LANE___CHOICE("unknown_lane_choice"),

    /**
     * If there are more than 2 lanes, then TurnAction half_left, left, sharp_left may help decide.
     */
    @XmlEnumValue("left_lane")
    LEFT___LANE("left_lane"),

    /**
     * If there are more than 3 lanes, then Turnaction straight defines the middle one.
     */
    @XmlEnumValue("middle_lane")
    MIDDLE___LANE("middle_lane"),

    /**
     * If there are more than 2 lanes, then TurnAction half_right, right, sharp_right may help decide.
     */
    @XmlEnumValue("right_lane")
    RIGHT___LANE("right_lane"),
    @XmlEnumValue("unknown_turning_kind")
    UNKNOWN___TURNING___KIND("unknown_turning_kind");
    private final String value;

    GuidanceAdviceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuidanceAdviceEnumeration fromValue(String v) {
        for (GuidanceAdviceEnumeration c : GuidanceAdviceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
