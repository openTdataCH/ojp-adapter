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
 * <p>Java-Klasse für AccessFeatureTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccessFeatureTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="elevator"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="seriesOfStairs"/&gt;
 *     &lt;enumeration value="singleStep"/&gt;
 *     &lt;enumeration value="seriesOfSingleSteps"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="travelator"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="footpath"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AccessFeatureTypeEnumeration")
@XmlEnum
public enum AccessFeatureTypeEnumeration {

    @XmlEnumValue("elevator")
    ELEVATOR("elevator"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("seriesOfStairs")
    SERIES_OF_STAIRS("seriesOfStairs"),
    @XmlEnumValue("singleStep")
    SINGLE_STEP("singleStep"),
    @XmlEnumValue("seriesOfSingleSteps")
    SERIES_OF_SINGLE_STEPS("seriesOfSingleSteps"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("footpath")
    FOOTPATH("footpath"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AccessFeatureTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFeatureTypeEnumeration fromValue(String v) {
        for (AccessFeatureTypeEnumeration c : AccessFeatureTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
