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
 * <p>Java-Klasse für GroupBookingEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="GroupBookingEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="groupsAllowed"/&gt;
 *     &lt;enumeration value="groupsNotAllowed"/&gt;
 *     &lt;enumeration value="groupsAllowedWithReservation"/&gt;
 *     &lt;enumeration value="groupBookingsRestricted"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupBookingEnumeration")
@XmlEnum
public enum GroupBookingEnumeration {

    @XmlEnumValue("groupsAllowed")
    GROUPS_ALLOWED("groupsAllowed"),
    @XmlEnumValue("groupsNotAllowed")
    GROUPS_NOT_ALLOWED("groupsNotAllowed"),
    @XmlEnumValue("groupsAllowedWithReservation")
    GROUPS_ALLOWED_WITH_RESERVATION("groupsAllowedWithReservation"),
    @XmlEnumValue("groupBookingsRestricted")
    GROUP_BOOKINGS_RESTRICTED("groupBookingsRestricted"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    GroupBookingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupBookingEnumeration fromValue(String v) {
        for (GroupBookingEnumeration c: GroupBookingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
