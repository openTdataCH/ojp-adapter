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
 * <p>Java-Klasse für TicketingFacilityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TicketingFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="ticketMachines"/&gt;
 *     &lt;enumeration value="ticketOffice"/&gt;
 *     &lt;enumeration value="ticketOnDemandMachines"/&gt;
 *     &lt;enumeration value="ticketSales"/&gt;
 *     &lt;enumeration value="mobileTicketing"/&gt;
 *     &lt;enumeration value="ticketCollection"/&gt;
 *     &lt;enumeration value="centralReservations"/&gt;
 *     &lt;enumeration value="localTickets"/&gt;
 *     &lt;enumeration value="nationalTickets"/&gt;
 *     &lt;enumeration value="internationalTickets"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TicketingFacilityEnumeration")
@XmlEnum
public enum TicketingFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("ticketMachines")
    TICKET_MACHINES("ticketMachines"),
    @XmlEnumValue("ticketOffice")
    TICKET_OFFICE("ticketOffice"),
    @XmlEnumValue("ticketOnDemandMachines")
    TICKET_ON_DEMAND_MACHINES("ticketOnDemandMachines"),
    @XmlEnumValue("ticketSales")
    TICKET_SALES("ticketSales"),
    @XmlEnumValue("mobileTicketing")
    MOBILE_TICKETING("mobileTicketing"),
    @XmlEnumValue("ticketCollection")
    TICKET_COLLECTION("ticketCollection"),
    @XmlEnumValue("centralReservations")
    CENTRAL_RESERVATIONS("centralReservations"),
    @XmlEnumValue("localTickets")
    LOCAL_TICKETS("localTickets"),
    @XmlEnumValue("nationalTickets")
    NATIONAL_TICKETS("nationalTickets"),
    @XmlEnumValue("internationalTickets")
    INTERNATIONAL_TICKETS("internationalTickets");
    private final String value;

    TicketingFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketingFacilityEnumeration fromValue(String v) {
        for (TicketingFacilityEnumeration c : TicketingFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
