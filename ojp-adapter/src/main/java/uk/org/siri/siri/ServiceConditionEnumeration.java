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
 * <p>Java-Klasse für ServiceConditionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ServiceConditionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="delay"/&gt;
 *     &lt;enumeration value="minorDelays"/&gt;
 *     &lt;enumeration value="majorDelays"/&gt;
 *     &lt;enumeration value="operationTimeExtension"/&gt;
 *     &lt;enumeration value="onTime"/&gt;
 *     &lt;enumeration value="disturbanceRectified"/&gt;
 *     &lt;enumeration value="changeOfPlatform"/&gt;
 *     &lt;enumeration value="lineCancellation"/&gt;
 *     &lt;enumeration value="tripCancellation"/&gt;
 *     &lt;enumeration value="boarding"/&gt;
 *     &lt;enumeration value="goToGate"/&gt;
 *     &lt;enumeration value="stopCancelled"/&gt;
 *     &lt;enumeration value="stopMoved"/&gt;
 *     &lt;enumeration value="stopOnDemand"/&gt;
 *     &lt;enumeration value="additionalStop"/&gt;
 *     &lt;enumeration value="substitutedStop"/&gt;
 *     &lt;enumeration value="diverted"/&gt;
 *     &lt;enumeration value="disruption"/&gt;
 *     &lt;enumeration value="limitedOperation"/&gt;
 *     &lt;enumeration value="discontinuedOperation"/&gt;
 *     &lt;enumeration value="irregularTraffic"/&gt;
 *     &lt;enumeration value="wagonOrderChanged"/&gt;
 *     &lt;enumeration value="trainShortened"/&gt;
 *     &lt;enumeration value="additionalRide"/&gt;
 *     &lt;enumeration value="replacementRide"/&gt;
 *     &lt;enumeration value="temporarilyNonStopping"/&gt;
 *     &lt;enumeration value="temporaryStopplace"/&gt;
 *     &lt;enumeration value="undefinedStatus"/&gt;
 *     &lt;enumeration value="altered"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="delayed"/&gt;
 *     &lt;enumeration value="noService"/&gt;
 *     &lt;enumeration value="disrupted"/&gt;
 *     &lt;enumeration value="additionalService"/&gt;
 *     &lt;enumeration value="specialService"/&gt;
 *     &lt;enumeration value="normalService"/&gt;
 *     &lt;enumeration value="intermittentService"/&gt;
 *     &lt;enumeration value="shortFormedService"/&gt;
 *     &lt;enumeration value="fullLengthService"/&gt;
 *     &lt;enumeration value="extendedService"/&gt;
 *     &lt;enumeration value="splittingTrain"/&gt;
 *     &lt;enumeration value="replacementTransport"/&gt;
 *     &lt;enumeration value="arrivesEarly"/&gt;
 *     &lt;enumeration value="shuttleService"/&gt;
 *     &lt;enumeration value="replacementService"/&gt;
 *     &lt;enumeration value="undefinedServiceInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceConditionEnumeration")
@XmlEnum
public enum ServiceConditionEnumeration {


    /**
     * TPEG Pts43_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts43_1, delay
     * 
     */
    @XmlEnumValue("delay")
    DELAY("delay"),

    /**
     * TPEG Pts43_2, minor delays
     * 
     */
    @XmlEnumValue("minorDelays")
    MINOR_DELAYS("minorDelays"),

    /**
     * TPEG Pts43_3, major delays
     * 
     */
    @XmlEnumValue("majorDelays")
    MAJOR_DELAYS("majorDelays"),

    /**
     * TPEG Pts43_4, operation time extension
     * 
     */
    @XmlEnumValue("operationTimeExtension")
    OPERATION_TIME_EXTENSION("operationTimeExtension"),

    /**
     * TPEG Pts43_5, on time
     * 
     */
    @XmlEnumValue("onTime")
    ON_TIME("onTime"),

    /**
     * TPEG Pts43_6, disturbance rectified
     * 
     */
    @XmlEnumValue("disturbanceRectified")
    DISTURBANCE_RECTIFIED("disturbanceRectified"),

    /**
     * TPEG Pts43_7, change of platform
     * 
     */
    @XmlEnumValue("changeOfPlatform")
    CHANGE_OF_PLATFORM("changeOfPlatform"),

    /**
     * TPEG Pts43_8, line cancellation
     * 
     */
    @XmlEnumValue("lineCancellation")
    LINE_CANCELLATION("lineCancellation"),

    /**
     * TPEG Pts43_9, trip cancellation
     * 
     */
    @XmlEnumValue("tripCancellation")
    TRIP_CANCELLATION("tripCancellation"),

    /**
     * TPEG Pts43_10, boarding
     * 
     */
    @XmlEnumValue("boarding")
    BOARDING("boarding"),

    /**
     * TPEG Pts43_11, go to gate
     * 
     */
    @XmlEnumValue("goToGate")
    GO_TO_GATE("goToGate"),

    /**
     * TPEG Pts43_12, stop cancelled
     * 
     */
    @XmlEnumValue("stopCancelled")
    STOP_CANCELLED("stopCancelled"),

    /**
     * TPEG Pts43_13, stop moved
     * 
     */
    @XmlEnumValue("stopMoved")
    STOP_MOVED("stopMoved"),

    /**
     * TPEG Pts43_14, stop on demand
     * 
     */
    @XmlEnumValue("stopOnDemand")
    STOP_ON_DEMAND("stopOnDemand"),

    /**
     * TPEG Pts43_15, additional stop
     * 
     */
    @XmlEnumValue("additionalStop")
    ADDITIONAL_STOP("additionalStop"),

    /**
     * TPEG Pts43_16, substituted stop
     * 
     */
    @XmlEnumValue("substitutedStop")
    SUBSTITUTED_STOP("substitutedStop"),

    /**
     * TPEG Pts43_17, diverted
     * 
     */
    @XmlEnumValue("diverted")
    DIVERTED("diverted"),

    /**
     * TPEG Pts43_18, disruption
     * 
     */
    @XmlEnumValue("disruption")
    DISRUPTION("disruption"),

    /**
     * TPEG Pts43_19, limited operation
     * 
     */
    @XmlEnumValue("limitedOperation")
    LIMITED_OPERATION("limitedOperation"),

    /**
     * TPEG Pts43_20, discontinued operation
     * 
     */
    @XmlEnumValue("discontinuedOperation")
    DISCONTINUED_OPERATION("discontinuedOperation"),

    /**
     * TPEG Pts43_21, irregular traffic
     * 
     */
    @XmlEnumValue("irregularTraffic")
    IRREGULAR_TRAFFIC("irregularTraffic"),

    /**
     * TPEG Pts43_22, wagon order changed
     * 
     */
    @XmlEnumValue("wagonOrderChanged")
    WAGON_ORDER_CHANGED("wagonOrderChanged"),

    /**
     * TPEG Pts43_23, train shortened
     * 
     */
    @XmlEnumValue("trainShortened")
    TRAIN_SHORTENED("trainShortened"),

    /**
     * TPEG Pts43_24, additional ride
     * 
     */
    @XmlEnumValue("additionalRide")
    ADDITIONAL_RIDE("additionalRide"),

    /**
     * TPEG Pts43_25, replacement ride
     * 
     */
    @XmlEnumValue("replacementRide")
    REPLACEMENT_RIDE("replacementRide"),

    /**
     * TPEG Pts43_26, temporarily non-stopping
     * 
     */
    @XmlEnumValue("temporarilyNonStopping")
    TEMPORARILY_NON_STOPPING("temporarilyNonStopping"),

    /**
     * TPEG Pts43_27, temporary stopplace
     * 
     */
    @XmlEnumValue("temporaryStopplace")
    TEMPORARY_STOPPLACE("temporaryStopplace"),

    /**
     * TPEG Pts43_255, undefined status
     * 
     */
    @XmlEnumValue("undefinedStatus")
    UNDEFINED_STATUS("undefinedStatus"),

    /**
     * TPEG Pti13_1, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("altered")
    ALTERED("altered"),

    /**
     * TPEG Pti13_2, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * TPEG Pti13_3, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("delayed")
    DELAYED("delayed"),

    /**
     * TPEG Pti13_5, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("noService")
    NO_SERVICE("noService"),

    /**
     * TPEG Pti13_6, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("disrupted")
    DISRUPTED("disrupted"),

    /**
     * TPEG Pti13_7, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("additionalService")
    ADDITIONAL_SERVICE("additionalService"),

    /**
     * TPEG Pti13_8, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("specialService")
    SPECIAL_SERVICE("specialService"),

    /**
     * TPEG Pti13_10, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("normalService")
    NORMAL_SERVICE("normalService"),

    /**
     * TPEG Pti13_11, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("intermittentService")
    INTERMITTENT_SERVICE("intermittentService"),

    /**
     * TPEG Pti13_12, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("shortFormedService")
    SHORT_FORMED_SERVICE("shortFormedService"),

    /**
     * TPEG Pti13_13, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("fullLengthService")
    FULL_LENGTH_SERVICE("fullLengthService"),

    /**
     * TPEG Pti13_14, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("extendedService")
    EXTENDED_SERVICE("extendedService"),

    /**
     * TPEG Pti13_15, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("splittingTrain")
    SPLITTING_TRAIN("splittingTrain"),

    /**
     * TPEG Pti13_16, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("replacementTransport")
    REPLACEMENT_TRANSPORT("replacementTransport"),

    /**
     * TPEG Pti13_17, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("arrivesEarly")
    ARRIVES_EARLY("arrivesEarly"),

    /**
     * TPEG Pti13_18, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("shuttleService")
    SHUTTLE_SERVICE("shuttleService"),

    /**
     * TPEG Pti13_19, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("replacementService")
    REPLACEMENT_SERVICE("replacementService"),

    /**
     * TPEG Pti13_255, DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("undefinedServiceInformation")
    UNDEFINED_SERVICE_INFORMATION("undefinedServiceInformation");
    private final String value;

    ServiceConditionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceConditionEnumeration fromValue(String v) {
        for (ServiceConditionEnumeration c: ServiceConditionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
