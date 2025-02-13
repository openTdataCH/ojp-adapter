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
 * <p>Java-Klasse für MetroSubmodesOfTransportEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MetroSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="tube"/&gt;
 *     &lt;enumeration value="urbanRailway"/&gt;
 *     &lt;enumeration value="allRailServices"/&gt;
 *     &lt;enumeration value="metroService"/&gt;
 *     &lt;enumeration value="nightMetroService"/&gt;
 *     &lt;enumeration value="expressMetroService"/&gt;
 *     &lt;enumeration value="undefinedUrbanRailwayService"/&gt;
 *     &lt;enumeration value="pti4_0"/&gt;
 *     &lt;enumeration value="pti4_1"/&gt;
 *     &lt;enumeration value="pti4_2"/&gt;
 *     &lt;enumeration value="pti4_3"/&gt;
 *     &lt;enumeration value="pti4_4"/&gt;
 *     &lt;enumeration value="pti4_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "MetroSubmodesOfTransportEnumeration")
@XmlEnum
public enum MetroSubmodesOfTransportEnumeration {

    /**
     * TPEG Pts104_0 - submode of transport is not known to the source system.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Submode of transport is not supported in this list.
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("tube")
    TUBE("tube"),
    @XmlEnumValue("urbanRailway")
    URBAN_RAILWAY("urbanRailway"),
    @XmlEnumValue("allRailServices")
    ALL_RAIL_SERVICES("allRailServices"),

    /**
     * TPEG Pts104_1 (SIRI 2.1) - see also 'metro'.
     */
    @XmlEnumValue("metroService")
    METRO_SERVICE("metroService"),

    /**
     * TPEG Pts104_2 (SIRI 2.1)
     */
    @XmlEnumValue("nightMetroService")
    NIGHT_METRO_SERVICE("nightMetroService"),

    /**
     * TPEG Pts104_3 (SIRI 2.1)
     */
    @XmlEnumValue("expressMetroService")
    EXPRESS_METRO_SERVICE("expressMetroService"),

    /**
     * TPEG Pts104_255 (SIRI 2.1) - see also 'undefined'.
     */
    @XmlEnumValue("undefinedUrbanRailwayService")
    UNDEFINED_URBAN_RAILWAY_SERVICE("undefinedUrbanRailwayService"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti4_0")
    PTI_4___0("pti4_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti4_1")
    PTI_4___1("pti4_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti4_2")
    PTI_4___2("pti4_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti4_3")
    PTI_4___3("pti4_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti4_4")
    PTI_4___4("pti4_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti4_255")
    PTI_4___255("pti4_255");
    private final String value;

    MetroSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetroSubmodesOfTransportEnumeration fromValue(String v) {
        for (MetroSubmodesOfTransportEnumeration c : MetroSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
