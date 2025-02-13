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
 * <p>Java-Klasse für AccessibilityFeatureEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccessibilityFeatureEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="singleStep"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="travelator"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="mindTheGap"/&gt;
 *     &lt;enumeration value="tactilePaving"/&gt;
 *     &lt;enumeration value="seriesOfStairs"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="confinedSpace"/&gt;
 *     &lt;enumeration value="queueManagement"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AccessibilityFeatureEnumeration")
@XmlEnum
public enum AccessibilityFeatureEnumeration {

    /**
     * IFOPT, TPEG Pts40_0, unknown
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts40_1, single step
     */
    @XmlEnumValue("singleStep")
    SINGLE_STEP("singleStep"),

    /**
     * IFOPT, TPEG Pts40_2, stairs
     */
    @XmlEnumValue("stairs")
    STAIRS("stairs"),

    /**
     * IFOPT, TPEG Pts40_3, escalator
     */
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),

    /**
     * IFOPT, TPEG Pts40_4, travelator / moving walkway
     */
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),

    /**
     * IFOPT, TPEG Pts40_5, lift / elevator
     */
    @XmlEnumValue("lift")
    LIFT("lift"),

    /**
     * IFOPT, TPEG Pts40_6, ramp
     */
    @XmlEnumValue("ramp")
    RAMP("ramp"),

    /**
     * TPEG Pts40_7, mind the gap
     */
    @XmlEnumValue("mindTheGap")
    MIND_THE_GAP("mindTheGap"),

    /**
     * TPEG Pts40_8, tactile paving
     */
    @XmlEnumValue("tactilePaving")
    TACTILE_PAVING("tactilePaving"),

    /**
     * IFOPT, series of stairs
     */
    @XmlEnumValue("seriesOfStairs")
    SERIES_OF_STAIRS("seriesOfStairs"),

    /**
     * IFOPT, shuttle
     */
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),

    /**
     * IFOPT, barrier
     */
    @XmlEnumValue("barrier")
    BARRIER("barrier"),

    /**
     * IFOPT, narrow entrance
     */
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),

    /**
     * IFOPT, confined space
     */
    @XmlEnumValue("confinedSpace")
    CONFINED_SPACE("confinedSpace"),

    /**
     * IFOPT, queue management
     */
    @XmlEnumValue("queueManagement")
    QUEUE_MANAGEMENT("queueManagement"),

    /**
     * IFOPT, none
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * IFOPT, other
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * TPEG Pts40_255, undefined accessibility feature type
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    AccessibilityFeatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessibilityFeatureEnumeration fromValue(String v) {
        for (AccessibilityFeatureEnumeration c : AccessibilityFeatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
