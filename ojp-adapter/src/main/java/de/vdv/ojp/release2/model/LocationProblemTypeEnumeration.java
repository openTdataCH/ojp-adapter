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
 * <p>Java-Klasse für LocationProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LocationProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOCATION_NORESULTS"/&gt;
 *     &lt;enumeration value="LOCATION_UNSUPPORTEDTYPE"/&gt;
 *     &lt;enumeration value="LOCATION_UNSUPPORTEDCOMBINATION"/&gt;
 *     &lt;enumeration value="LOCATION_NOREFINEMENT"/&gt;
 *     &lt;enumeration value="LOCATION_USAGEIGNORED"/&gt;
 *     &lt;enumeration value="LOCATION_UNSUPPORTEDPTMODES"/&gt;
 *     &lt;enumeration value="LOCATION_UNSUPPORTEDLOCALITY"/&gt;
 *     &lt;enumeration value="LOCATION_UNSUPPORTEDSORTINGMETHOD"/&gt;
 *     &lt;enumeration value="LOCATION_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationProblemTypeEnumeration")
@XmlEnum
public enum LocationProblemTypeEnumeration {


    /**
     * No location objects could be found that match the input data.
     * 
     */
    @XmlEnumValue("LOCATION_NORESULTS")
    LOCATION___NORESULTS("LOCATION_NORESULTS"),

    /**
     * The requested location types are not supported by the service.
     * 
     */
    @XmlEnumValue("LOCATION_UNSUPPORTEDTYPE")
    LOCATION___UNSUPPORTEDTYPE("LOCATION_UNSUPPORTEDTYPE"),

    /**
     * The combination of input data (text string, coordinates, geographical restrictions) cannot be processed by the service.
     * 
     */
    @XmlEnumValue("LOCATION_UNSUPPORTEDCOMBINATION")
    LOCATION___UNSUPPORTEDCOMBINATION("LOCATION_UNSUPPORTEDCOMBINATION"),

    /**
     * The given location object could not be refined.
     * 
     */
    @XmlEnumValue("LOCATION_NOREFINEMENT")
    LOCATION___NOREFINEMENT("LOCATION_NOREFINEMENT"),

    /**
     * The usage type has been ignored.
     * 
     */
    @XmlEnumValue("LOCATION_USAGEIGNORED")
    LOCATION___USAGEIGNORED("LOCATION_USAGEIGNORED"),

    /**
     * The service does not support any restrictions by transport modes.
     * 
     */
    @XmlEnumValue("LOCATION_UNSUPPORTEDPTMODES")
    LOCATION___UNSUPPORTEDPTMODES("LOCATION_UNSUPPORTEDPTMODES"),

    /**
     * The service does not support any restrictions by localities.
     * 
     */
    @XmlEnumValue("LOCATION_UNSUPPORTEDLOCALITY")
    LOCATION___UNSUPPORTEDLOCALITY("LOCATION_UNSUPPORTEDLOCALITY"),

    /**
     * The service does not support the sorting method. The details should provide a list of the allowed methods the service supports.
     * 
     */
    @XmlEnumValue("LOCATION_UNSUPPORTEDSORTINGMETHOD")
    LOCATION___UNSUPPORTEDSORTINGMETHOD("LOCATION_UNSUPPORTEDSORTINGMETHOD"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("LOCATION_OTHER")
    LOCATION___OTHER("LOCATION_OTHER");
    private final String value;

    LocationProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationProblemTypeEnumeration fromValue(String v) {
        for (LocationProblemTypeEnumeration c: LocationProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
