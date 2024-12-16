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
 * <p>Java-Klasse für ScopeTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ScopeTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="stopPlace"/&gt;
 *     &lt;enumeration value="line"/&gt;
 *     &lt;enumeration value="route"/&gt;
 *     &lt;enumeration value="publicTransportService"/&gt;
 *     &lt;enumeration value="operator"/&gt;
 *     &lt;enumeration value="city"/&gt;
 *     &lt;enumeration value="area"/&gt;
 *     &lt;enumeration value="stopPoint"/&gt;
 *     &lt;enumeration value="stopPlaceComponent"/&gt;
 *     &lt;enumeration value="place"/&gt;
 *     &lt;enumeration value="network"/&gt;
 *     &lt;enumeration value="vehicleJourney"/&gt;
 *     &lt;enumeration value="datedVehicleJourney"/&gt;
 *     &lt;enumeration value="connectionLink"/&gt;
 *     &lt;enumeration value="interchange"/&gt;
 *     &lt;enumeration value="allPT"/&gt;
 *     &lt;enumeration value="general"/&gt;
 *     &lt;enumeration value="road"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScopeTypeEnumeration")
@XmlEnum
public enum ScopeTypeEnumeration {


    /**
     * TPEG Pts36_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts36_1, STOP PLACE
     * 
     */
    @XmlEnumValue("stopPlace")
    STOP_PLACE("stopPlace"),

    /**
     * TPEG Pts36_2, line
     * 
     */
    @XmlEnumValue("line")
    LINE("line"),

    /**
     * TPEG Pts36_3, route
     * 
     */
    @XmlEnumValue("route")
    ROUTE("route"),

    /**
     * TPEG Pts36_4, individual PT service
     * 
     */
    @XmlEnumValue("publicTransportService")
    PUBLIC_TRANSPORT_SERVICE("publicTransportService"),

    /**
     * TPEG Pts36_5, operator
     * 
     */
    @XmlEnumValue("operator")
    OPERATOR("operator"),

    /**
     * TPEG Pts36_6, city
     * 
     */
    @XmlEnumValue("city")
    CITY("city"),

    /**
     * TPEG Pts36_7, area
     * 
     */
    @XmlEnumValue("area")
    AREA("area"),

    /**
     * TPEG Pts36_8, stop point
     * 
     */
    @XmlEnumValue("stopPoint")
    STOP_POINT("stopPoint"),

    /**
     * STOP PLACE component
     * 
     */
    @XmlEnumValue("stopPlaceComponent")
    STOP_PLACE_COMPONENT("stopPlaceComponent"),

    /**
     * place
     * 
     */
    @XmlEnumValue("place")
    PLACE("place"),

    /**
     * network
     * 
     */
    @XmlEnumValue("network")
    NETWORK("network"),

    /**
     * vehicle journey
     * 
     */
    @XmlEnumValue("vehicleJourney")
    VEHICLE_JOURNEY("vehicleJourney"),

    /**
     * dated vehicle journey
     * 
     */
    @XmlEnumValue("datedVehicleJourney")
    DATED_VEHICLE_JOURNEY("datedVehicleJourney"),

    /**
     * connection link
     * 
     */
    @XmlEnumValue("connectionLink")
    CONNECTION_LINK("connectionLink"),

    /**
     * interchange
     * 
     */
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),

    /**
     * TPEG Pts36_0, unknown
     * 
     */
    @XmlEnumValue("allPT")
    ALL_PT("allPT"),

    /**
     * general
     * 
     */
    @XmlEnumValue("general")
    GENERAL("general"),

    /**
     * road
     * 
     */
    @XmlEnumValue("road")
    ROAD("road"),

    /**
     * TPEG Pts36_255, undefined
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    ScopeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeTypeEnumeration fromValue(String v) {
        for (ScopeTypeEnumeration c: ScopeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
