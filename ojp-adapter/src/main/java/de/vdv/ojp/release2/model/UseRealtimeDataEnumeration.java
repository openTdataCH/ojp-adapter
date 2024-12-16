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
 * <p>Java-Klasse für UseRealtimeDataEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="UseRealtimeDataEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="explanatory"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UseRealtimeDataEnumeration")
@XmlEnum
public enum UseRealtimeDataEnumeration {


    /**
     * Full use of real-time information, including removal of SERVICE JOURNEYS (TRIP REQUEST POLICY.UseRealTime is only a boolean in Transmodel).
     * 
     */
    @XmlEnumValue("full")
    FULL("full"),

    /**
     * Cancelled and delayed SERVICE JOURNEYs are still returned, but an additional explanatory textual information is provided to describe their current real-time status.
     * 
     */
    @XmlEnumValue("explanatory")
    EXPLANATORY("explanatory"),

    /**
     * Only based on timetable data
     * 
     */
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    UseRealtimeDataEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UseRealtimeDataEnumeration fromValue(String v) {
        for (UseRealtimeDataEnumeration c: UseRealtimeDataEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
