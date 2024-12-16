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
 * <p>Java-Klasse für TripInfoProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TripInfoProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRIPINFO_JOURNEYREFUNKNOWN"/&gt;
 *     &lt;enumeration value="TRIPINFO_VEHICLEUNKNOWN"/&gt;
 *     &lt;enumeration value="TRIPINFO_NOJOURNEYFOUND"/&gt;
 *     &lt;enumeration value="TRIPINFO_NOGEOINFO"/&gt;
 *     &lt;enumeration value="TRIPINFO_NOREALTIME"/&gt;
 *     &lt;enumeration value="TRIPINFO_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TripInfoProblemTypeEnumeration")
@XmlEnum
public enum TripInfoProblemTypeEnumeration {


    /**
     * The journey reference used in the request is unknown.
     * 
     */
    @XmlEnumValue("TRIPINFO_JOURNEYREFUNKNOWN")
    TRIPINFO___JOURNEYREFUNKNOWN("TRIPINFO_JOURNEYREFUNKNOWN"),

    /**
     * The vehicle reference used in the request is unknown.
     * 
     */
    @XmlEnumValue("TRIPINFO_VEHICLEUNKNOWN")
    TRIPINFO___VEHICLEUNKNOWN("TRIPINFO_VEHICLEUNKNOWN"),

    /**
     * No matching journey could be found for the requested time and journey/vehicle identifiers.
     * 
     */
    @XmlEnumValue("TRIPINFO_NOJOURNEYFOUND")
    TRIPINFO___NOJOURNEYFOUND("TRIPINFO_NOJOURNEYFOUND"),

    /**
     * No geographic information available for this vehicle journey.
     * 
     */
    @XmlEnumValue("TRIPINFO_NOGEOINFO")
    TRIPINFO___NOGEOINFO("TRIPINFO_NOGEOINFO"),

    /**
     * No real-time information available.
     * 
     */
    @XmlEnumValue("TRIPINFO_NOREALTIME")
    TRIPINFO___NOREALTIME("TRIPINFO_NOREALTIME"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("TRIPINFO_OTHER")
    TRIPINFO___OTHER("TRIPINFO_OTHER");
    private final String value;

    TripInfoProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TripInfoProblemTypeEnumeration fromValue(String v) {
        for (TripInfoProblemTypeEnumeration c: TripInfoProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
