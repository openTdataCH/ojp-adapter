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
 * <p>Java-Klasse für TripProblemTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TripProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRIP_NOTRIPFOUND"/&gt;
 *     &lt;enumeration value="TRIP_ORIGINUNKNOWN"/&gt;
 *     &lt;enumeration value="TRIP_DESTINATIONUNKNOWN"/&gt;
 *     &lt;enumeration value="TRIP_VIAUNKNOWN"/&gt;
 *     &lt;enumeration value="TRIP_NOTVIAUNKNOWN"/&gt;
 *     &lt;enumeration value="TRIP_NOCHANGEATUNKNOWN"/&gt;
 *     &lt;enumeration value="TRIP_NOORIGIN"/&gt;
 *     &lt;enumeration value="TRIP_NODESTINATION"/&gt;
 *     &lt;enumeration value="TRIP_ORIGINDESTINATIONIDENTICAL"/&gt;
 *     &lt;enumeration value="TRIP_DATETIMEERROR"/&gt;
 *     &lt;enumeration value="TRIP_TIMEWINDOWTOOLARGE"/&gt;
 *     &lt;enumeration value="TRIP_DEPARTUREAFTERARRIVAL"/&gt;
 *     &lt;enumeration value="TRIP_DATEOUTOFRANGE"/&gt;
 *     &lt;enumeration value="TRIP_ORIGINEQUIVALENT"/&gt;
 *     &lt;enumeration value="TRIP_DESTINATIONEQUIVALENT"/&gt;
 *     &lt;enumeration value="TRIP_VIAEQUIVALENT"/&gt;
 *     &lt;enumeration value="TRIP_REALTIMEINCOMPLETE"/&gt;
 *     &lt;enumeration value="TRIP_ITTIMEEXTENDED"/&gt;
 *     &lt;enumeration value="TRIP_ITMODECHANGED"/&gt;
 *     &lt;enumeration value="TRIP_INCONVENIENTWAITING"/&gt;
 *     &lt;enumeration value="TRIP_RESTRICTEDRESULTSDROPPED"/&gt;
 *     &lt;enumeration value="TRIP_MULTIPOINT_NOTALLPOINTSCOVERED"/&gt;
 *     &lt;enumeration value="TRIP_MULTIPOINT_TOOMANYPOINTS"/&gt;
 *     &lt;enumeration value="TRIP_MULTIPOINT_TYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="TRIP_REFINE_LEG_UNKNOWN"/&gt;
 *     &lt;enumeration value="REFINE_OBJECTNOTFOUND"/&gt;
 *     &lt;enumeration value="REFINE_PROFILENOTSUPPORTED"/&gt;
 *     &lt;enumeration value="TRIP_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TripProblemTypeEnumeration")
@XmlEnum
public enum TripProblemTypeEnumeration {

    /**
     * No trip plan could be found that meets all the parameters as they have been set by the user (start and end locations, departure/arrival time and further options possibly set by the user).
     */
    @XmlEnumValue("TRIP_NOTRIPFOUND")
    TRIP___NOTRIPFOUND("TRIP_NOTRIPFOUND"),

    /**
     * The start location (address, stop place, …) for the requested trip is unknown.
     */
    @XmlEnumValue("TRIP_ORIGINUNKNOWN")
    TRIP___ORIGINUNKNOWN("TRIP_ORIGINUNKNOWN"),

    /**
     * The end location (address, stop place, …) for the requested trip is unknown.
     */
    @XmlEnumValue("TRIP_DESTINATIONUNKNOWN")
    TRIP___DESTINATIONUNKNOWN("TRIP_DESTINATIONUNKNOWN"),

    /**
     * One of the via points is unknown.
     */
    @XmlEnumValue("TRIP_VIAUNKNOWN")
    TRIP___VIAUNKNOWN("TRIP_VIAUNKNOWN"),

    /**
     * One of the not-via points is unknown.
     */
    @XmlEnumValue("TRIP_NOTVIAUNKNOWN")
    TRIP___NOTVIAUNKNOWN("TRIP_NOTVIAUNKNOWN"),

    /**
     * One of the no-change-at stations is unknown.
     */
    @XmlEnumValue("TRIP_NOCHANGEATUNKNOWN")
    TRIP___NOCHANGEATUNKNOWN("TRIP_NOCHANGEATUNKNOWN"),

    /**
     * No start location has been defined for the trip.
     */
    @XmlEnumValue("TRIP_NOORIGIN")
    TRIP___NOORIGIN("TRIP_NOORIGIN"),

    /**
     * No end location has been defined for the trip.
     */
    @XmlEnumValue("TRIP_NODESTINATION")
    TRIP___NODESTINATION("TRIP_NODESTINATION"),

    /**
     * Start and end of the trip are identical.
     */
    @XmlEnumValue("TRIP_ORIGINDESTINATIONIDENTICAL")
    TRIP___ORIGINDESTINATIONIDENTICAL("TRIP_ORIGINDESTINATIONIDENTICAL"),

    /**
     * The requested date and/or time do not make sense.
     */
    @XmlEnumValue("TRIP_DATETIMEERROR")
    TRIP___DATETIMEERROR("TRIP_DATETIMEERROR"),

    /**
     * The requested time window is too large.
     */
    @XmlEnumValue("TRIP_TIMEWINDOWTOOLARGE")
    TRIP___TIMEWINDOWTOOLARGE("TRIP_TIMEWINDOWTOOLARGE"),

    /**
     * The requested departure time at each origin is after the requested arrival time at any destination.
     */
    @XmlEnumValue("TRIP_DEPARTUREAFTERARRIVAL")
    TRIP___DEPARTUREAFTERARRIVAL("TRIP_DEPARTUREAFTERARRIVAL"),

    /**
     * There is no timetable data available for the requested date.
     */
    @XmlEnumValue("TRIP_DATEOUTOFRANGE")
    TRIP___DATEOUTOFRANGE("TRIP_DATEOUTOFRANGE"),

    /**
     * The requested origin stop place has been replaced by an equivalent stop place.
     */
    @XmlEnumValue("TRIP_ORIGINEQUIVALENT")
    TRIP___ORIGINEQUIVALENT("TRIP_ORIGINEQUIVALENT"),

    /**
     * The requested destination stop place has been replaced by an equivalent stop place.
     */
    @XmlEnumValue("TRIP_DESTINATIONEQUIVALENT")
    TRIP___DESTINATIONEQUIVALENT("TRIP_DESTINATIONEQUIVALENT"),

    /**
     * One of the requested via stop places has been replaced by an equivalent stop place.
     */
    @XmlEnumValue("TRIP_VIAEQUIVALENT")
    TRIP___VIAEQUIVALENT("TRIP_VIAEQUIVALENT"),

    /**
     * There is no real-time information available for at least one of the services within this trip result.
     */
    @XmlEnumValue("TRIP_REALTIMEINCOMPLETE")
    TRIP___REALTIMEINCOMPLETE("TRIP_REALTIMEINCOMPLETE"),

    /**
     * The maximum time allowed for using modes of individual transport (mostly walking or cycling) has been extended by the system because otherwise no trip could be found.
     */
    @XmlEnumValue("TRIP_ITTIMEEXTENDED")
    TRIP___ITTIMEEXTENDED("TRIP_ITTIMEEXTENDED"),

    /**
     * The mode of individual transport specified by the user has been replaced by the system because otherwise no trip could be found. Usually, this means taking a taxi instead of walking.
     */
    @XmlEnumValue("TRIP_ITMODECHANGED")
    TRIP___ITMODECHANGED("TRIP_ITMODECHANGED"),

    /**
     * The trip plan in this trip result contains a long waiting time.
     */
    @XmlEnumValue("TRIP_INCONVENIENTWAITING")
    TRIP___INCONVENIENTWAITING("TRIP_INCONVENIENTWAITING"),

    /**
     * Used for warnings, when possible/better results were dropped, because of the criteria were not used (e.g., private services, offer only available for seniors).
     */
    @XmlEnumValue("TRIP_RESTRICTEDRESULTSDROPPED")
    TRIP___RESTRICTEDRESULTSDROPPED("TRIP_RESTRICTEDRESULTSDROPPED"),

    /**
     * No trip solution was found covering each of the requested points.
     */
    @XmlEnumValue("TRIP_MULTIPOINT_NOTALLPOINTSCOVERED")
    TRIP___MULTIPOINT___NOTALLPOINTSCOVERED("TRIP_MULTIPOINT_NOTALLPOINTSCOVERED"),

    /**
     * Too many points have been requested as departure or arrival.
     */
    @XmlEnumValue("TRIP_MULTIPOINT_TOOMANYPOINTS")
    TRIP___MULTIPOINT___TOOMANYPOINTS("TRIP_MULTIPOINT_TOOMANYPOINTS"),

    /**
     * The indicated multipoint type is not supported.
     */
    @XmlEnumValue("TRIP_MULTIPOINT_TYPE_NOT_SUPPORTED")
    TRIP___MULTIPOINT___TYPE___NOT___SUPPORTED("TRIP_MULTIPOINT_TYPE_NOT_SUPPORTED"),

    /**
     * Indicated legs do not exist.
     */
    @XmlEnumValue("TRIP_REFINE_LEG_UNKNOWN")
    TRIP___REFINE___LEG___UNKNOWN("TRIP_REFINE_LEG_UNKNOWN"),

    /**
     * The object to be refined could not be found in the database of the responding system or could not be found unequivocally.
     */
    @XmlEnumValue("REFINE_OBJECTNOTFOUND")
    REFINE___OBJECTNOTFOUND("REFINE_OBJECTNOTFOUND"),

    /**
     * Refinement does not support the hiking or cycling profile.
     */
    @XmlEnumValue("REFINE_PROFILENOTSUPPORTED")
    REFINE___PROFILENOTSUPPORTED("REFINE_PROFILENOTSUPPORTED"),

    /**
     * A problem has occurred that does not have a specific problem type.
     */
    @XmlEnumValue("TRIP_OTHER")
    TRIP___OTHER("TRIP_OTHER");
    private final String value;

    TripProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TripProblemTypeEnumeration fromValue(String v) {
        for (TripProblemTypeEnumeration c : TripProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
