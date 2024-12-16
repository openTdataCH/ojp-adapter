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
 * <p>Java-Klasse für RoutePointTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RoutePointTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="origin"/&gt;
 *     &lt;enumeration value="destination"/&gt;
 *     &lt;enumeration value="intermediate"/&gt;
 *     &lt;enumeration value="legBoard"/&gt;
 *     &lt;enumeration value="legIntermediate"/&gt;
 *     &lt;enumeration value="legAlight"/&gt;
 *     &lt;enumeration value="firstRoutePoint"/&gt;
 *     &lt;enumeration value="lastRoutePoint"/&gt;
 *     &lt;enumeration value="affectedStopplace"/&gt;
 *     &lt;enumeration value="presentedStopplace"/&gt;
 *     &lt;enumeration value="undefinedStopplaceUsage"/&gt;
 *     &lt;enumeration value="startPoint"/&gt;
 *     &lt;enumeration value="stop"/&gt;
 *     &lt;enumeration value="via"/&gt;
 *     &lt;enumeration value="notStopping"/&gt;
 *     &lt;enumeration value="temporaryStop"/&gt;
 *     &lt;enumeration value="temporarilyNotStopping"/&gt;
 *     &lt;enumeration value="exceptionalStop"/&gt;
 *     &lt;enumeration value="additionalStop"/&gt;
 *     &lt;enumeration value="requestStop"/&gt;
 *     &lt;enumeration value="frontTrainDestination"/&gt;
 *     &lt;enumeration value="rearTrainDestination"/&gt;
 *     &lt;enumeration value="throughServiceDestination"/&gt;
 *     &lt;enumeration value="notVia"/&gt;
 *     &lt;enumeration value="alteredStartPoint"/&gt;
 *     &lt;enumeration value="alteredDestination"/&gt;
 *     &lt;enumeration value="undefinedRoutePoint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutePointTypeEnumeration")
@XmlEnum
public enum RoutePointTypeEnumeration {


    /**
     * TPEG Pti15_0, Pts44_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts44_1, origin
     * 
     */
    @XmlEnumValue("origin")
    ORIGIN("origin"),

    /**
     * TPEG Pti15_2, Pts44_2, destination
     * 
     */
    @XmlEnumValue("destination")
    DESTINATION("destination"),

    /**
     * TPEG Pts44_3, intermediate.
     * 
     */
    @XmlEnumValue("intermediate")
    INTERMEDIATE("intermediate"),

    /**
     * TPEG Pts44_4, leg board
     * 
     */
    @XmlEnumValue("legBoard")
    LEG_BOARD("legBoard"),

    /**
     * TPEG Pts44_5, leg intermediate
     * 
     */
    @XmlEnumValue("legIntermediate")
    LEG_INTERMEDIATE("legIntermediate"),

    /**
     * TPEG Pts44_6, leg alight
     * 
     */
    @XmlEnumValue("legAlight")
    LEG_ALIGHT("legAlight"),

    /**
     * TPEG Pts44_7, first route point
     * 
     */
    @XmlEnumValue("firstRoutePoint")
    FIRST_ROUTE_POINT("firstRoutePoint"),

    /**
     * TPEG Pts44_8, last route point
     * 
     */
    @XmlEnumValue("lastRoutePoint")
    LAST_ROUTE_POINT("lastRoutePoint"),

    /**
     * TPEG Pts44_9, affected STOP PLACE
     * 
     */
    @XmlEnumValue("affectedStopplace")
    AFFECTED_STOPPLACE("affectedStopplace"),

    /**
     * TPEG Pts44_10, presented STOP PLACE
     * 
     */
    @XmlEnumValue("presentedStopplace")
    PRESENTED_STOPPLACE("presentedStopplace"),

    /**
     * TPEG Pts44_255, undefined STOP PLACE usage
     * 
     */
    @XmlEnumValue("undefinedStopplaceUsage")
    UNDEFINED_STOPPLACE_USAGE("undefinedStopplaceUsage"),

    /**
     * DEPRECATED since SIRI 2.1 and replaced by Pts44_1 value 'origin' (TPEG Pti15_1 - start point) .
     * 
     */
    @XmlEnumValue("startPoint")
    START_POINT("startPoint"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_3 - stop)
     * 
     */
    @XmlEnumValue("stop")
    STOP("stop"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_4 - via)
     * 
     */
    @XmlEnumValue("via")
    VIA("via"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_5 - not-stopping)
     * 
     */
    @XmlEnumValue("notStopping")
    NOT_STOPPING("notStopping"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_6 - temporary stop)
     * 
     */
    @XmlEnumValue("temporaryStop")
    TEMPORARY_STOP("temporaryStop"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_7 - temporarily not-stopping)
     * 
     */
    @XmlEnumValue("temporarilyNotStopping")
    TEMPORARILY_NOT_STOPPING("temporarilyNotStopping"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_8 - exceptional stop)
     * 
     */
    @XmlEnumValue("exceptionalStop")
    EXCEPTIONAL_STOP("exceptionalStop"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_9 - additional stop)
     * 
     */
    @XmlEnumValue("additionalStop")
    ADDITIONAL_STOP("additionalStop"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_10 - request stop)
     * 
     */
    @XmlEnumValue("requestStop")
    REQUEST_STOP("requestStop"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_11 - front train destination)
     * 
     */
    @XmlEnumValue("frontTrainDestination")
    FRONT_TRAIN_DESTINATION("frontTrainDestination"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_12 - rear train destination)
     * 
     */
    @XmlEnumValue("rearTrainDestination")
    REAR_TRAIN_DESTINATION("rearTrainDestination"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_13 - through service destination)
     * 
     */
    @XmlEnumValue("throughServiceDestination")
    THROUGH_SERVICE_DESTINATION("throughServiceDestination"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_14 - not via)
     * 
     */
    @XmlEnumValue("notVia")
    NOT_VIA("notVia"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_15 - altered start point)
     * 
     */
    @XmlEnumValue("alteredStartPoint")
    ALTERED_START_POINT("alteredStartPoint"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_16 - altered destination)
     * 
     */
    @XmlEnumValue("alteredDestination")
    ALTERED_DESTINATION("alteredDestination"),

    /**
     * DEPRECATED since SIRI 2.1 (TPEG Pti15_255 - undefined route point)
     * 
     */
    @XmlEnumValue("undefinedRoutePoint")
    UNDEFINED_ROUTE_POINT("undefinedRoutePoint");
    private final String value;

    RoutePointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointTypeEnumeration fromValue(String v) {
        for (RoutePointTypeEnumeration c: RoutePointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
