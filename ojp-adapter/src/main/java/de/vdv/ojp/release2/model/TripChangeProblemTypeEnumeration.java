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
 * <p>Java-Klasse für TripChangeProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TripChangeProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRIPCHANGE_NOLATERTRIPFOUND"/&gt;
 *     &lt;enumeration value="TRIPCHANGE_NOEARLIERTRIPFOUND"/&gt;
 *     &lt;enumeration value="TRIPCHANGE_INVALIDLEGREF"/&gt;
 *     &lt;enumeration value="TRIPCHANGE_INVALIDOPERATOR"/&gt;
 *     &lt;enumeration value="TRIPCHANGE_NOVEHICLEAVAILABLE"/&gt;
 *     &lt;enumeration value="TRIPCHANGE_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TripChangeProblemTypeEnumeration")
@XmlEnum
public enum TripChangeProblemTypeEnumeration {


    /**
     * No later option for the requested part of the TRIP could be found.
     * 
     */
    @XmlEnumValue("TRIPCHANGE_NOLATERTRIPFOUND")
    TRIPCHANGE___NOLATERTRIPFOUND("TRIPCHANGE_NOLATERTRIPFOUND"),

    /**
     * No earlier option for the requested part of the TRIP could be found.
     * 
     */
    @XmlEnumValue("TRIPCHANGE_NOEARLIERTRIPFOUND")
    TRIPCHANGE___NOEARLIERTRIPFOUND("TRIPCHANGE_NOEARLIERTRIPFOUND"),

    /**
     * Requested leg ref is invalid.
     * 
     */
    @XmlEnumValue("TRIPCHANGE_INVALIDLEGREF")
    TRIPCHANGE___INVALIDLEGREF("TRIPCHANGE_INVALIDLEGREF"),

    /**
     * Requested operator is invalid.
     * 
     */
    @XmlEnumValue("TRIPCHANGE_INVALIDOPERATOR")
    TRIPCHANGE___INVALIDOPERATOR("TRIPCHANGE_INVALIDOPERATOR"),

    /**
     * No vehicle is available for the requested leg.
     * 
     */
    @XmlEnumValue("TRIPCHANGE_NOVEHICLEAVAILABLE")
    TRIPCHANGE___NOVEHICLEAVAILABLE("TRIPCHANGE_NOVEHICLEAVAILABLE"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("TRIPCHANGE_OTHER")
    TRIPCHANGE___OTHER("TRIPCHANGE_OTHER");
    private final String value;

    TripChangeProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TripChangeProblemTypeEnumeration fromValue(String v) {
        for (TripChangeProblemTypeEnumeration c: TripChangeProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
