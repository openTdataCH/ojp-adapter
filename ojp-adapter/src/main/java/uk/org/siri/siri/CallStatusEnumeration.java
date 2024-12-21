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
 * <p>Java-Klasse für CallStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="onTime"/&gt;
 *     &lt;enumeration value="early"/&gt;
 *     &lt;enumeration value="delayed"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="arrived"/&gt;
 *     &lt;enumeration value="departed"/&gt;
 *     &lt;enumeration value="missed"/&gt;
 *     &lt;enumeration value="noReport"/&gt;
 *     &lt;enumeration value="notExpected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallStatusEnumeration")
@XmlEnum
public enum CallStatusEnumeration {


    /**
     * Service is on time.
     * 
     */
    @XmlEnumValue("onTime")
    ON_TIME("onTime"),

    /**
     * Service is earlier than expected.
     * 
     */
    @XmlEnumValue("early")
    EARLY("early"),

    /**
     * Service is delayed.
     * 
     */
    @XmlEnumValue("delayed")
    DELAYED("delayed"),

    /**
     * Service is cancelled.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * Service has arrived.
     * 
     */
    @XmlEnumValue("arrived")
    ARRIVED("arrived"),
    @XmlEnumValue("departed")
    DEPARTED("departed"),
    @XmlEnumValue("missed")
    MISSED("missed"),

    /**
     * There is no information about the service.
     * 
     */
    @XmlEnumValue("noReport")
    NO_REPORT("noReport"),

    /**
     * Service is not expected to call this stop. For instance a flexible service that has not yet been preordered.
     * 
     */
    @XmlEnumValue("notExpected")
    NOT_EXPECTED("notExpected");
    private final String value;

    CallStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallStatusEnumeration fromValue(String v) {
        for (CallStatusEnumeration c: CallStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
