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
 * <p>Java-Klasse für InterchangeStatusEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="InterchangeStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="connection"/&gt;
 *     &lt;enumeration value="replacement"/&gt;
 *     &lt;enumeration value="alternative"/&gt;
 *     &lt;enumeration value="connectionNotHeld"/&gt;
 *     &lt;enumeration value="connectionHeld"/&gt;
 *     &lt;enumeration value="statusOfConnectionUndecided"/&gt;
 *     &lt;enumeration value="undefinedCrossReferenceInformation"/&gt;
 *     &lt;enumeration value="connectionChanged"/&gt;
 *     &lt;enumeration value="distributorWaitProlonged"/&gt;
 *     &lt;enumeration value="departurePlatformChanged"/&gt;
 *     &lt;enumeration value="extraInterchange"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="feederArrivalCancellation"/&gt;
 *     &lt;enumeration value="distributorDepartureCancellation"/&gt;
 *     &lt;enumeration value="statusOfConenctionUndecided"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "InterchangeStatusEnumeration")
@XmlEnum
public enum InterchangeStatusEnumeration {

    /**
     * TPEG Pti31_0, unknown
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti31_1, connection
     */
    @XmlEnumValue("connection")
    CONNECTION("connection"),

    /**
     * TPEG Pti31_2, replacement
     */
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement"),

    /**
     * TPEG Pti31_3, alternative
     */
    @XmlEnumValue("alternative")
    ALTERNATIVE("alternative"),

    /**
     * TPEG Pti31_4, connection not held
     */
    @XmlEnumValue("connectionNotHeld")
    CONNECTION_NOT_HELD("connectionNotHeld"),

    /**
     * TPEG Pti31_5, connection held
     */
    @XmlEnumValue("connectionHeld")
    CONNECTION_HELD("connectionHeld"),

    /**
     * TPEG Pti31_6, status of connection undecided
     */
    @XmlEnumValue("statusOfConnectionUndecided")
    STATUS_OF_CONNECTION_UNDECIDED("statusOfConnectionUndecided"),

    /**
     * TPEG Pti31_255, undefined cross reference information
     */
    @XmlEnumValue("undefinedCrossReferenceInformation")
    UNDEFINED_CROSS_REFERENCE_INFORMATION("undefinedCrossReferenceInformation"),

    /**
     * Interchange is planned but was updated as a result of changes in the QUAYs or arrival/departure times. Can be used if the status is a combination of the other values. (since SIRI 2.1)
     */
    @XmlEnumValue("connectionChanged")
    CONNECTION_CHANGED("connectionChanged"),

    /**
     * An important function of connection protection is the ability to hold back a distributor VEHICLE (i.e. prolonged waiting) to allow passengers to transfer from delayed feeders. To achieve this a
     * distributorWaitProlonged status shall be communicated back to the feeder VEHICLEs to inform the passengers about the new departure time of the distributor or even a willWait guarantee. (since
     * SIRI 2.1)
     */
    @XmlEnumValue("distributorWaitProlonged")
    DISTRIBUTOR_WAIT_PROLONGED("distributorWaitProlonged"),

    /**
     * Used to provide the passengers with information about a new departure platform of the distributor VEHICLE if the distributor changes its planned stopping position. (since SIRI 2.1)
     */
    @XmlEnumValue("departurePlatformChanged")
    DEPARTURE_PLATFORM_CHANGED("departurePlatformChanged"),

    /**
     * Interchange is an addition to the plan. (since SIRI 2.1)
     */
    @XmlEnumValue("extraInterchange")
    EXTRA_INTERCHANGE("extraInterchange"),

    /**
     * Interchange is a cancellation of an interchange in the plan. (since SIRI 2.1)
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * Loss of the inbound connection indicates the cancellation of the visit (of the FeederJourney) to the FeederArrivalStop, or a severely delayed arrival. This can lead to the distributor VEHICLE
     * abandoning the connection. Reasons for the loss of a feeder include (but are not limited to) the cancellation of the feeder VEHICLE, diversion/rerouting of the feeder VEHICLE, disruption of a
     * line section or journey part of the feeder VEHICLE etc. (since SIRI 2.1)
     */
    @XmlEnumValue("feederArrivalCancellation")
    FEEDER_ARRIVAL_CANCELLATION("feederArrivalCancellation"),

    /**
     * Indicates the loss of an outbound connection, i.e., is used to signal the cancellation of the onward connection to the passengers in the feeder VEHICLEs. (since SIRI 2.1)
     */
    @XmlEnumValue("distributorDepartureCancellation")
    DISTRIBUTOR_DEPARTURE_CANCELLATION("distributorDepartureCancellation"),

    /**
     * DEPRECATED since SIRI 2.1 - use statusOfConnectionUndecided instead
     */
    @XmlEnumValue("statusOfConenctionUndecided")
    STATUS_OF_CONENCTION_UNDECIDED("statusOfConenctionUndecided");
    private final String value;

    InterchangeStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeStatusEnumeration fromValue(String v) {
        for (InterchangeStatusEnumeration c : InterchangeStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
