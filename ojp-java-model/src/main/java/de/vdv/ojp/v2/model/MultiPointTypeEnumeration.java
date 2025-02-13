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
 * <p>Java-Klasse für MultiPointTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MultiPointTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anyPoint"/&gt;
 *     &lt;enumeration value="eachOrigin"/&gt;
 *     &lt;enumeration value="eachDestination"/&gt;
 *     &lt;enumeration value="eachOriginDestination"/&gt;
 *     &lt;enumeration value="somePoints"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "MultiPointTypeEnumeration")
@XmlEnum
public enum MultiPointTypeEnumeration {

    /**
     * Returning results for a single origin and destination (hopefully the best ones). As this element was not sufficiently defined in the past, some implementations may behave differently.
     */
    @XmlEnumValue("anyPoint")
    ANY_POINT("anyPoint"),

    /**
     * At least a distinct solution for each of the origin points must be delivered.
     */
    @XmlEnumValue("eachOrigin")
    EACH_ORIGIN("eachOrigin"),

    /**
     * At least a distinct solution for each of the destination points must be delivered.
     */
    @XmlEnumValue("eachDestination")
    EACH_DESTINATION("eachDestination"),

    /**
     * At least one result for each origin/destination pair must be delivered.
     */
    @XmlEnumValue("eachOriginDestination")
    EACH_ORIGIN_DESTINATION("eachOriginDestination"),

    /**
     * Clarifies that some (probably the "best") origin-destination pairs should be returned. How many are to be used is not defined.
     */
    @XmlEnumValue("somePoints")
    SOME_POINTS("somePoints");
    private final String value;

    MultiPointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultiPointTypeEnumeration fromValue(String v) {
        for (MultiPointTypeEnumeration c : MultiPointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
