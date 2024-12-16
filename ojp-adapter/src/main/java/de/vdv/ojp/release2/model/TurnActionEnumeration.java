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
 * <p>Java-Klasse für TurnActionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TurnActionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="straight_on"/&gt;
 *     &lt;enumeration value="half_right"/&gt;
 *     &lt;enumeration value="right"/&gt;
 *     &lt;enumeration value="sharp_right"/&gt;
 *     &lt;enumeration value="uturn"/&gt;
 *     &lt;enumeration value="sharp_left"/&gt;
 *     &lt;enumeration value="left"/&gt;
 *     &lt;enumeration value="half_left"/&gt;
 *     &lt;enumeration value="up"/&gt;
 *     &lt;enumeration value="down"/&gt;
 *     &lt;enumeration value="unknown_turn_action"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TurnActionEnumeration")
@XmlEnum
public enum TurnActionEnumeration {


    /**
     *  338-21 degrees
     * 
     */
    @XmlEnumValue("straight_on")
    STRAIGHT___ON("straight_on"),

    /**
     *  22-67 degrees
     * 
     */
    @XmlEnumValue("half_right")
    HALF___RIGHT("half_right"),

    /**
     *  68-111 degrees
     * 
     */
    @XmlEnumValue("right")
    RIGHT("right"),

    /**
     *  112-157 degrees
     * 
     */
    @XmlEnumValue("sharp_right")
    SHARP___RIGHT("sharp_right"),

    /**
     *  158-201 degrees
     * 
     */
    @XmlEnumValue("uturn")
    UTURN("uturn"),

    /**
     *  202-247 degrees
     * 
     */
    @XmlEnumValue("sharp_left")
    SHARP___LEFT("sharp_left"),

    /**
     *  248-291 degrees
     * 
     */
    @XmlEnumValue("left")
    LEFT("left"),

    /**
     *  292-337 degrees
     * 
     */
    @XmlEnumValue("half_left")
    HALF___LEFT("half_left"),

    /**
     * Upwards, the target level is in the PathLink structure.
     * 
     */
    @XmlEnumValue("up")
    UP("up"),

    /**
     * Downwards, the target level is in the PathLink structure.
     * 
     */
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("unknown_turn_action")
    UNKNOWN___TURN___ACTION("unknown_turn_action");
    private final String value;

    TurnActionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TurnActionEnumeration fromValue(String v) {
        for (TurnActionEnumeration c: TurnActionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
