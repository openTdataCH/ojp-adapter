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
 * <p>Java-Klasse für AvailabilityProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AvailabilityProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVAILABILITY_NOSERVICEFOUND"/&gt;
 *     &lt;enumeration value="AVAILABILITY_LOCATIONUNSERVED"/&gt;
 *     &lt;enumeration value="AVAILABILITY_LOCATIONUNKNOWN"/&gt;
 *     &lt;enumeration value="AVAILABILITY_OUTSIDERULES"/&gt;
 *     &lt;enumeration value="AVAILABILITY_SERVICEDISRUPTED"/&gt;
 *     &lt;enumeration value="AVAILABILITY_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="AVAILABILITY_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityProblemTypeEnumeration")
@XmlEnum
public enum AvailabilityProblemTypeEnumeration {


    /**
     * No SERVICE (VEHICLE JOURNEY or VEHICLE) could be found for this request.
     * 
     */
    @XmlEnumValue("AVAILABILITY_NOSERVICEFOUND")
    AVAILABILITY___NOSERVICEFOUND("AVAILABILITY_NOSERVICEFOUND"),

    /**
     * At the locations (address, stop, etc.) for which the availability has been requested, there is no public transport service at all. E.g. outside the area.
     * 
     */
    @XmlEnumValue("AVAILABILITY_LOCATIONUNSERVED")
    AVAILABILITY___LOCATIONUNSERVED("AVAILABILITY_LOCATIONUNSERVED"),

    /**
     * The location (address, stop, etc.) for which availability was requested is unknown.
     * 
     */
    @XmlEnumValue("AVAILABILITY_LOCATIONUNKNOWN")
    AVAILABILITY___LOCATIONUNKNOWN("AVAILABILITY_LOCATIONUNKNOWN"),

    /**
     * The vehicle is not available due to existing rules like operating hours or not competing against an existing public transport line. In the details of the problem there should be information indicating which rules were violated: e.g., The desired MOBILITY SERVICE can't be provided because there exists a regular line for this TRIP.
     * 
     */
    @XmlEnumValue("AVAILABILITY_OUTSIDERULES")
    AVAILABILITY___OUTSIDERULES("AVAILABILITY_OUTSIDERULES"),

    /**
     * The MOBILITY SERVICE is disrupted. 
     * 
     */
    @XmlEnumValue("AVAILABILITY_SERVICEDISRUPTED")
    AVAILABILITY___SERVICEDISRUPTED("AVAILABILITY_SERVICEDISRUPTED"),

    /**
     * There is no VEHICLE available at the current time.
     * 
     */
    @XmlEnumValue("AVAILABILITY_UNAVAILABLE")
    AVAILABILITY___UNAVAILABLE("AVAILABILITY_UNAVAILABLE"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("AVAILABILITY_OTHER")
    AVAILABILITY___OTHER("AVAILABILITY_OTHER");
    private final String value;

    AvailabilityProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityProblemTypeEnumeration fromValue(String v) {
        for (AvailabilityProblemTypeEnumeration c: AvailabilityProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
