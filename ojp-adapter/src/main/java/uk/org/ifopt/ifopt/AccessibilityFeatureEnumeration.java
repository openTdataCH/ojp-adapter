//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.ifopt;

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
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="seriesOfStairs"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="travelator"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="confinedSpace"/&gt;
 *     &lt;enumeration value="queueManagement"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessibilityFeatureEnumeration")
@XmlEnum
public enum AccessibilityFeatureEnumeration {

    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("seriesOfStairs")
    SERIES_OF_STAIRS("seriesOfStairs"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("confinedSpace")
    CONFINED_SPACE("confinedSpace"),
    @XmlEnumValue("queueManagement")
    QUEUE_MANAGEMENT("queueManagement"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccessibilityFeatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessibilityFeatureEnumeration fromValue(String v) {
        for (AccessibilityFeatureEnumeration c: AccessibilityFeatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
