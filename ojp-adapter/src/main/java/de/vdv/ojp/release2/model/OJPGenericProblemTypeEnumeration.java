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
 * <p>Java-Klasse für OJPGenericProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="OJPGenericProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OJPGENERIC_REQUESTNOTSUPPORTED"/&gt;
 *     &lt;enumeration value="OJPGENERIC_FEATURENOTSUPPORTED"/&gt;
 *     &lt;enumeration value="OJPGENERIC_LANGUAGENOTSUPPORTED"/&gt;
 *     &lt;enumeration value="OJPGENERIC_EXCEPTIONFROMREQUESTEDLANGUAGE"/&gt;
 *     &lt;enumeration value="OJPGENERIC_DATAFRAMEREFNOTAVAILABLE"/&gt;
 *     &lt;enumeration value="OJPGENERIC_SYSTEMID_NOT_FOUND"/&gt;
 *     &lt;enumeration value="OJPGENERIC_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OJPGenericProblemTypeEnumeration")
@XmlEnum
public enum OJPGenericProblemTypeEnumeration {


    /**
     * The server does not support the specific request (e.g.: MultiPointTripRequest).
     * 
     */
    @XmlEnumValue("OJPGENERIC_REQUESTNOTSUPPORTED")
    OJPGENERIC___REQUESTNOTSUPPORTED("OJPGENERIC_REQUESTNOTSUPPORTED"),

    /**
     * The server does not support the requested feature (e.g.: parameter NotVia in TripRequest).
     * 
     */
    @XmlEnumValue("OJPGENERIC_FEATURENOTSUPPORTED")
    OJPGENERIC___FEATURENOTSUPPORTED("OJPGENERIC_FEATURENOTSUPPORTED"),

    /**
     * For the display of texts within the result, the server (at least in the context of this request) does not support the requested language.
     * 
     */
    @XmlEnumValue("OJPGENERIC_LANGUAGENOTSUPPORTED")
    OJPGENERIC___LANGUAGENOTSUPPORTED("OJPGENERIC_LANGUAGENOTSUPPORTED"),

    /**
     * When displaying texts within the result, the server does not support the requested language for all occurring text elements.
     * 
     */
    @XmlEnumValue("OJPGENERIC_EXCEPTIONFROMREQUESTEDLANGUAGE")
    OJPGENERIC___EXCEPTIONFROMREQUESTEDLANGUAGE("OJPGENERIC_EXCEPTIONFROMREQUESTEDLANGUAGE"),

    /**
     * The server cannot provide the requested data frame (data version).
     * 
     */
    @XmlEnumValue("OJPGENERIC_DATAFRAMEREFNOTAVAILABLE")
    OJPGENERIC___DATAFRAMEREFNOTAVAILABLE("OJPGENERIC_DATAFRAMEREFNOTAVAILABLE"),

    /**
     * The server was not able to work with the SystemID that was provided.
     * 
     */
    @XmlEnumValue("OJPGENERIC_SYSTEMID_NOT_FOUND")
    OJPGENERIC___SYSTEMID___NOT___FOUND("OJPGENERIC_SYSTEMID_NOT_FOUND"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("OJPGENERIC_OTHER")
    OJPGENERIC___OTHER("OJPGENERIC_OTHER");
    private final String value;

    OJPGenericProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OJPGenericProblemTypeEnumeration fromValue(String v) {
        for (OJPGenericProblemTypeEnumeration c: OJPGenericProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
