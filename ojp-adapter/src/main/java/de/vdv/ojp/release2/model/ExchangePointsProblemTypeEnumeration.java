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
 * <p>Java-Klasse für ExchangePointsProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ExchangePointsProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXCHANGEPOINTS_NORESULTS"/&gt;
 *     &lt;enumeration value="EXCHANGEPOINTS_UNKNOWNDESTINATIONSYSTEM"/&gt;
 *     &lt;enumeration value="EXCHANGEPOINTS_UNKNOWNADJACENTSYSTEM"/&gt;
 *     &lt;enumeration value="EXCHANGEPOINTS_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangePointsProblemTypeEnumeration")
@XmlEnum
public enum ExchangePointsProblemTypeEnumeration {


    /**
     * No exchange points could be found that match the query criteria.
     * 
     */
    @XmlEnumValue("EXCHANGEPOINTS_NORESULTS")
    EXCHANGEPOINTS___NORESULTS("EXCHANGEPOINTS_NORESULTS"),

    /**
     * The destination system given in the request parameters is unknown.
     * 
     */
    @XmlEnumValue("EXCHANGEPOINTS_UNKNOWNDESTINATIONSYSTEM")
    EXCHANGEPOINTS___UNKNOWNDESTINATIONSYSTEM("EXCHANGEPOINTS_UNKNOWNDESTINATIONSYSTEM"),

    /**
     * One or more of the adjacent systems given in the request parameters are unknown.
     * 
     */
    @XmlEnumValue("EXCHANGEPOINTS_UNKNOWNADJACENTSYSTEM")
    EXCHANGEPOINTS___UNKNOWNADJACENTSYSTEM("EXCHANGEPOINTS_UNKNOWNADJACENTSYSTEM"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("EXCHANGEPOINTS_OTHER")
    EXCHANGEPOINTS___OTHER("EXCHANGEPOINTS_OTHER");
    private final String value;

    ExchangePointsProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangePointsProblemTypeEnumeration fromValue(String v) {
        for (ExchangePointsProblemTypeEnumeration c: ExchangePointsProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
