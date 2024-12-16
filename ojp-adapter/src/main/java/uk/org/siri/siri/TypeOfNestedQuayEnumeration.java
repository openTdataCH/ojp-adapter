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
 * <p>Java-Klasse für TypeOfNestedQuayEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TypeOfNestedQuayEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="platformGroup"/&gt;
 *     &lt;enumeration value="platform"/&gt;
 *     &lt;enumeration value="platformEdge"/&gt;
 *     &lt;enumeration value="platformSector"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfNestedQuayEnumeration")
@XmlEnum
public enum TypeOfNestedQuayEnumeration {


    /**
     * A type of QUAY that consists of multiple QUAYs of type 'platform'. Examples of such groups would be the lower and upper level of a station.
     * 
     */
    @XmlEnumValue("platformGroup")
    PLATFORM_GROUP("platformGroup"),

    /**
     * A type of QUAY that consists of at least two child QUAYs of type 'platformEdge'.
     * 
     */
    @XmlEnumValue("platform")
    PLATFORM("platform"),

    /**
     * A type of QUAY which allows direct access to a VEHICLE, e.g. an on-street bus stop, or consists of multiple child QUAYs of type 'platformSector'.
     * 
     */
    @XmlEnumValue("platformEdge")
    PLATFORM_EDGE("platformEdge"),

    /**
     * A QUAY of type 'platformEdge' may be divided into multiple sectors, e.g. "A", "B", "C" etc., to help passengers find a specific part of a vehicle. 
     * The first class carriage of a TRAIN might, for example, be assigned to sector "A" of a QUAY.
     * 
     */
    @XmlEnumValue("platformSector")
    PLATFORM_SECTOR("platformSector");
    private final String value;

    TypeOfNestedQuayEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfNestedQuayEnumeration fromValue(String v) {
        for (TypeOfNestedQuayEnumeration c: TypeOfNestedQuayEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
