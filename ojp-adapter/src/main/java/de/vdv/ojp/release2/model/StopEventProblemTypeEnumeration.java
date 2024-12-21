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
 * <p>Java-Klasse für StopEventProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="StopEventProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STOPEVENT_NOEVENTFOUND"/&gt;
 *     &lt;enumeration value="STOPEVENT_LOCATIONUNSERVED"/&gt;
 *     &lt;enumeration value="STOPEVENT_LOCATIONUNKNOWN"/&gt;
 *     &lt;enumeration value="STOPEVENT_DATEOUTOFRANGE"/&gt;
 *     &lt;enumeration value="STOPEVENT_LASTSERVICEOFTHISLINE"/&gt;
 *     &lt;enumeration value="STOPEVENT_NOREALTIME"/&gt;
 *     &lt;enumeration value="STOPEVENT_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopEventProblemTypeEnumeration")
@XmlEnum
public enum StopEventProblemTypeEnumeration {


    /**
     * No departure/arrival could be found within the requested period that meets the given restrictions.
     * 
     */
    @XmlEnumValue("STOPEVENT_NOEVENTFOUND")
    STOPEVENT___NOEVENTFOUND("STOPEVENT_NOEVENTFOUND"),

    /**
     * At the locations (address, stop, etc.) for which stop events have been requested, there is no public transport service at all.
     * 
     */
    @XmlEnumValue("STOPEVENT_LOCATIONUNSERVED")
    STOPEVENT___LOCATIONUNSERVED("STOPEVENT_LOCATIONUNSERVED"),

    /**
     * The location (address, stop, etc.) for which stop events were requested is unknown.
     * 
     */
    @XmlEnumValue("STOPEVENT_LOCATIONUNKNOWN")
    STOPEVENT___LOCATIONUNKNOWN("STOPEVENT_LOCATIONUNKNOWN"),

    /**
     * There are no timetables available for the requested date.
     * 
     */
    @XmlEnumValue("STOPEVENT_DATEOUTOFRANGE")
    STOPEVENT___DATEOUTOFRANGE("STOPEVENT_DATEOUTOFRANGE"),

    /**
     * This departure/arrival event is the last one of this line for this operating day.
     * 
     */
    @XmlEnumValue("STOPEVENT_LASTSERVICEOFTHISLINE")
    STOPEVENT___LASTSERVICEOFTHISLINE("STOPEVENT_LASTSERVICEOFTHISLINE"),

    /**
     * There is no real-time or forecast data available for this departure/arrival event.
     * 
     */
    @XmlEnumValue("STOPEVENT_NOREALTIME")
    STOPEVENT___NOREALTIME("STOPEVENT_NOREALTIME"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("STOPEVENT_OTHER")
    STOPEVENT___OTHER("STOPEVENT_OTHER");
    private final String value;

    StopEventProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopEventProblemTypeEnumeration fromValue(String v) {
        for (StopEventProblemTypeEnumeration c: StopEventProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
