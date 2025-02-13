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
 * <p>Java-Klasse für VehicleStatusEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VehicleStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="expected"/&gt;
 *     &lt;enumeration value="notExpected"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="assigned"/&gt;
 *     &lt;enumeration value="signedOn"/&gt;
 *     &lt;enumeration value="atOrigin"/&gt;
 *     &lt;enumeration value="inProgress"/&gt;
 *     &lt;enumeration value="aborted"/&gt;
 *     &lt;enumeration value="offRoute"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="assumedCompleted"/&gt;
 *     &lt;enumeration value="notRun"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "VehicleStatusEnumeration")
@XmlEnum
public enum VehicleStatusEnumeration {

    /**
     * Service is expected to be performed.
     */
    @XmlEnumValue("expected")
    EXPECTED("expected"),

    /**
     * Service is not expected to be run. For instance a flexible service that has not yet been preordered.
     */
    @XmlEnumValue("notExpected")
    NOT_EXPECTED("notExpected"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("assigned")
    ASSIGNED("assigned"),
    @XmlEnumValue("signedOn")
    SIGNED_ON("signedOn"),
    @XmlEnumValue("atOrigin")
    AT_ORIGIN("atOrigin"),

    /**
     * Service has departed from first stop.
     */
    @XmlEnumValue("inProgress")
    IN_PROGRESS("inProgress"),
    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("offRoute")
    OFF_ROUTE("offRoute"),

    /**
     * It has been detected that the Service was completed.
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * It is assumed that the Service has completed.
     */
    @XmlEnumValue("assumedCompleted")
    ASSUMED_COMPLETED("assumedCompleted"),
    @XmlEnumValue("notRun")
    NOT_RUN("notRun");
    private final String value;

    VehicleStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleStatusEnumeration fromValue(String v) {
        for (VehicleStatusEnumeration c : VehicleStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
