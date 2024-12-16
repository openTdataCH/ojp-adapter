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
 * <p>Java-Klasse für TicketRestrictionEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TicketRestrictionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="allTicketClassesValid"/&gt;
 *     &lt;enumeration value="fullFareOnly"/&gt;
 *     &lt;enumeration value="certainTicketsOnly"/&gt;
 *     &lt;enumeration value="ticketWithReservation"/&gt;
 *     &lt;enumeration value="specialFare"/&gt;
 *     &lt;enumeration value="onlyTicketsOfSpecifiedOperator"/&gt;
 *     &lt;enumeration value="noRestrictions"/&gt;
 *     &lt;enumeration value="noOffPeakTickets"/&gt;
 *     &lt;enumeration value="noWeekendReturnTickets"/&gt;
 *     &lt;enumeration value="noReducedFareTickets"/&gt;
 *     &lt;enumeration value="unknownTicketRestriction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TicketRestrictionEnumeration")
@XmlEnum
public enum TicketRestrictionEnumeration {


    /**
     * TPEG Pti25_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti25_1, all ticket classes valid
     * 
     */
    @XmlEnumValue("allTicketClassesValid")
    ALL_TICKET_CLASSES_VALID("allTicketClassesValid"),

    /**
     * TPEG Pti25_2, full fare only
     * 
     */
    @XmlEnumValue("fullFareOnly")
    FULL_FARE_ONLY("fullFareOnly"),

    /**
     * TPEG Pti25_3, certain tickets only
     * 
     */
    @XmlEnumValue("certainTicketsOnly")
    CERTAIN_TICKETS_ONLY("certainTicketsOnly"),

    /**
     * TPEG Pti25_4, ticket with reservation
     * 
     */
    @XmlEnumValue("ticketWithReservation")
    TICKET_WITH_RESERVATION("ticketWithReservation"),

    /**
     * TPEG Pti25_5, special fare
     * 
     */
    @XmlEnumValue("specialFare")
    SPECIAL_FARE("specialFare"),

    /**
     * TPEG Pti25_6, only tickets of specified operator
     * 
     */
    @XmlEnumValue("onlyTicketsOfSpecifiedOperator")
    ONLY_TICKETS_OF_SPECIFIED_OPERATOR("onlyTicketsOfSpecifiedOperator"),

    /**
     * TPEG Pti25_7, no restrictions
     * 
     */
    @XmlEnumValue("noRestrictions")
    NO_RESTRICTIONS("noRestrictions"),

    /**
     * TPEG Pti25_8, no off-peak tickets
     * 
     */
    @XmlEnumValue("noOffPeakTickets")
    NO_OFF_PEAK_TICKETS("noOffPeakTickets"),

    /**
     * TPEG Pti25_9, no weekend return tickets
     * 
     */
    @XmlEnumValue("noWeekendReturnTickets")
    NO_WEEKEND_RETURN_TICKETS("noWeekendReturnTickets"),

    /**
     * TPEG Pti25_10, no reduced fare tickets
     * 
     */
    @XmlEnumValue("noReducedFareTickets")
    NO_REDUCED_FARE_TICKETS("noReducedFareTickets"),

    /**
     * TPEG Pti25_255, unknown ticket restriction
     * 
     */
    @XmlEnumValue("unknownTicketRestriction")
    UNKNOWN_TICKET_RESTRICTION("unknownTicketRestriction");
    private final String value;

    TicketRestrictionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketRestrictionEnumeration fromValue(String v) {
        for (TicketRestrictionEnumeration c: TicketRestrictionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
