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
 * <p>Java-Klasse für PredictionInaccurateReasonEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PredictionInaccurateReasonEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="vehicleInTrafficJam"/&gt;
 *     &lt;enumeration value="technicalProblem"/&gt;
 *     &lt;enumeration value="dispatchAction"/&gt;
 *     &lt;enumeration value="missingUpdate"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PredictionInaccurateReasonEnumeration")
@XmlEnum
public enum PredictionInaccurateReasonEnumeration {

    /**
     * Prediction is inaccurate because of a traffic jam.
     */
    @XmlEnumValue("vehicleInTrafficJam")
    VEHICLE_IN_TRAFFIC_JAM("vehicleInTrafficJam"),

    /**
     * Prediction is inaccurate because of technical problems.
     */
    @XmlEnumValue("technicalProblem")
    TECHNICAL_PROBLEM("technicalProblem"),

    /**
     * Prediction is inaccurate because of a despatching alteration.
     */
    @XmlEnumValue("dispatchAction")
    DISPATCH_ACTION("dispatchAction"),

    /**
     * Prediction is inaccurate because communication errors have prevented any updates.
     */
    @XmlEnumValue("missingUpdate")
    MISSING_UPDATE("missingUpdate"),

    /**
     * Prediction is inaccurate but the reason for an inaccurate prediction is unknown.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    PredictionInaccurateReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictionInaccurateReasonEnumeration fromValue(String v) {
        for (PredictionInaccurateReasonEnumeration c : PredictionInaccurateReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
