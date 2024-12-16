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
 * <p>Java-Klasse für ReportTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ReportTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="incident"/&gt;
 *     &lt;enumeration value="general"/&gt;
 *     &lt;enumeration value="operator"/&gt;
 *     &lt;enumeration value="network"/&gt;
 *     &lt;enumeration value="stationTerminal"/&gt;
 *     &lt;enumeration value="stopPoint"/&gt;
 *     &lt;enumeration value="connectionLink"/&gt;
 *     &lt;enumeration value="point"/&gt;
 *     &lt;enumeration value="route"/&gt;
 *     &lt;enumeration value="individualService"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportTypeEnumeration")
@XmlEnum
public enum ReportTypeEnumeration {


    /**
     * TPEG Pti27_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti27_1, incident
     * 
     */
    @XmlEnumValue("incident")
    INCIDENT("incident"),

    /**
     * TPEG Pti27_1_1, general
     * 
     */
    @XmlEnumValue("general")
    GENERAL("general"),

    /**
     * TPEG Pti27_1_2, operator
     * 
     */
    @XmlEnumValue("operator")
    OPERATOR("operator"),

    /**
     * TPEG Pti27_1_3, network
     * 
     */
    @XmlEnumValue("network")
    NETWORK("network"),

    /**
     * TPEG Pti27_2, station terminal
     * 
     */
    @XmlEnumValue("stationTerminal")
    STATION_TERMINAL("stationTerminal"),

    /**
     * TPEG Pti27_2_1, stoppoint
     * 
     */
    @XmlEnumValue("stopPoint")
    STOP_POINT("stopPoint"),

    /**
     * TPEG Pti27_2_2, connection link
     * 
     */
    @XmlEnumValue("connectionLink")
    CONNECTION_LINK("connectionLink"),

    /**
     * TPEG Pti27_2_3, point
     * 
     */
    @XmlEnumValue("point")
    POINT("point"),

    /**
     * TPEG Pti27_3, route
     * 
     */
    @XmlEnumValue("route")
    ROUTE("route"),

    /**
     * TPEG Pti27_4, individual service
     * 
     */
    @XmlEnumValue("individualService")
    INDIVIDUAL_SERVICE("individualService"),

    /**
     * TPEG Pti27_255, undefined type
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    ReportTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportTypeEnumeration fromValue(String v) {
        for (ReportTypeEnumeration c: ReportTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
