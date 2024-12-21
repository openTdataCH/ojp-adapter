//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CheckPointProcessEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CheckPointProcessEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="ticketPurchase"/&gt;
 *     &lt;enumeration value="ticketCollection"/&gt;
 *     &lt;enumeration value="ticketValidation"/&gt;
 *     &lt;enumeration value="baggageCheckIn"/&gt;
 *     &lt;enumeration value="oversizeBaggageCheckIn"/&gt;
 *     &lt;enumeration value="oversizeBaggageReclaim"/&gt;
 *     &lt;enumeration value="baggageReclaim"/&gt;
 *     &lt;enumeration value="leftLuggageDeposit"/&gt;
 *     &lt;enumeration value="leftLuggageReclaim"/&gt;
 *     &lt;enumeration value="firstclassCheckin"/&gt;
 *     &lt;enumeration value="specialNeedsCheckin"/&gt;
 *     &lt;enumeration value="baggageSecurityCheck"/&gt;
 *     &lt;enumeration value="securityCheck"/&gt;
 *     &lt;enumeration value="outgoingPassportControl"/&gt;
 *     &lt;enumeration value="incomingPassportControl"/&gt;
 *     &lt;enumeration value="fasttrackDepartures"/&gt;
 *     &lt;enumeration value="fasttrackArrivals"/&gt;
 *     &lt;enumeration value="incomingDutyFree"/&gt;
 *     &lt;enumeration value="outgoingDutyFree"/&gt;
 *     &lt;enumeration value="taxRefunds"/&gt;
 *     &lt;enumeration value="outgoingCustoms"/&gt;
 *     &lt;enumeration value="incomingCustoms"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CheckPointProcessEnumeration")
@XmlEnum
public enum CheckPointProcessEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("ticketPurchase")
    TICKET_PURCHASE("ticketPurchase"),
    @XmlEnumValue("ticketCollection")
    TICKET_COLLECTION("ticketCollection"),
    @XmlEnumValue("ticketValidation")
    TICKET_VALIDATION("ticketValidation"),
    @XmlEnumValue("baggageCheckIn")
    BAGGAGE_CHECK_IN("baggageCheckIn"),
    @XmlEnumValue("oversizeBaggageCheckIn")
    OVERSIZE_BAGGAGE_CHECK_IN("oversizeBaggageCheckIn"),
    @XmlEnumValue("oversizeBaggageReclaim")
    OVERSIZE_BAGGAGE_RECLAIM("oversizeBaggageReclaim"),
    @XmlEnumValue("baggageReclaim")
    BAGGAGE_RECLAIM("baggageReclaim"),
    @XmlEnumValue("leftLuggageDeposit")
    LEFT_LUGGAGE_DEPOSIT("leftLuggageDeposit"),
    @XmlEnumValue("leftLuggageReclaim")
    LEFT_LUGGAGE_RECLAIM("leftLuggageReclaim"),
    @XmlEnumValue("firstclassCheckin")
    FIRSTCLASS_CHECKIN("firstclassCheckin"),
    @XmlEnumValue("specialNeedsCheckin")
    SPECIAL_NEEDS_CHECKIN("specialNeedsCheckin"),
    @XmlEnumValue("baggageSecurityCheck")
    BAGGAGE_SECURITY_CHECK("baggageSecurityCheck"),
    @XmlEnumValue("securityCheck")
    SECURITY_CHECK("securityCheck"),
    @XmlEnumValue("outgoingPassportControl")
    OUTGOING_PASSPORT_CONTROL("outgoingPassportControl"),
    @XmlEnumValue("incomingPassportControl")
    INCOMING_PASSPORT_CONTROL("incomingPassportControl"),
    @XmlEnumValue("fasttrackDepartures")
    FASTTRACK_DEPARTURES("fasttrackDepartures"),
    @XmlEnumValue("fasttrackArrivals")
    FASTTRACK_ARRIVALS("fasttrackArrivals"),
    @XmlEnumValue("incomingDutyFree")
    INCOMING_DUTY_FREE("incomingDutyFree"),
    @XmlEnumValue("outgoingDutyFree")
    OUTGOING_DUTY_FREE("outgoingDutyFree"),
    @XmlEnumValue("taxRefunds")
    TAX_REFUNDS("taxRefunds"),
    @XmlEnumValue("outgoingCustoms")
    OUTGOING_CUSTOMS("outgoingCustoms"),
    @XmlEnumValue("incomingCustoms")
    INCOMING_CUSTOMS("incomingCustoms");
    private final String value;

    CheckPointProcessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckPointProcessEnumeration fromValue(String v) {
        for (CheckPointProcessEnumeration c: CheckPointProcessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
