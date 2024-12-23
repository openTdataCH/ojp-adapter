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
 * <p>Java-Klasse für InterchangeManagementEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="InterchangeManagementEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Planned"/&gt;
 *     &lt;enumeration value="Advertised"/&gt;
 *     &lt;enumeration value="Controlled"/&gt;
 *     &lt;enumeration value="Guaranteed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterchangeManagementEnumeration")
@XmlEnum
public enum InterchangeManagementEnumeration {


    /**
     * Interchange is considered a possible connection between journeys.
     * 
     */
    @XmlEnumValue("Planned")
    PLANNED("Planned"),

    /**
     * Interchange is advertised to public as a possible connection between journeys.
     * 
     */
    @XmlEnumValue("Advertised")
    ADVERTISED("Advertised"),

    /**
     * Interchange is actively managed as a possible connection between journeys and passengers are informed of real-time alterations.
     * 
     */
    @XmlEnumValue("Controlled")
    CONTROLLED("Controlled"),

    /**
     * Interchange is actively managed as a possible connection between journeys and distributor may be delayed in order to make a transfer possible.
     * 
     */
    @XmlEnumValue("Guaranteed")
    GUARANTEED("Guaranteed");
    private final String value;

    InterchangeManagementEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeManagementEnumeration fromValue(String v) {
        for (InterchangeManagementEnumeration c: InterchangeManagementEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
