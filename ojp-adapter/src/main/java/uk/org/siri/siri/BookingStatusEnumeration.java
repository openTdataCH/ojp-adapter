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
 * <p>Java-Klasse für BookingStatusEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BookingStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="available"/&gt;
 *     &lt;enumeration value="limited"/&gt;
 *     &lt;enumeration value="veryLimited"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="waitingList"/&gt;
 *     &lt;enumeration value="noBookingRequired"/&gt;
 *     &lt;enumeration value="bookingRequired"/&gt;
 *     &lt;enumeration value="bookingOptional"/&gt;
 *     &lt;enumeration value="undefinedBookingInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BookingStatusEnumeration")
@XmlEnum
public enum BookingStatusEnumeration {


    /**
     * TPEG Pti24_0, unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pti24_1, available
     * 
     */
    @XmlEnumValue("available")
    AVAILABLE("available"),

    /**
     * TPEG Pti24_2, limited
     * 
     */
    @XmlEnumValue("limited")
    LIMITED("limited"),

    /**
     * TPEG Pti24_3, very limited
     * 
     */
    @XmlEnumValue("veryLimited")
    VERY_LIMITED("veryLimited"),

    /**
     * TPEG Pti24_4, full
     * 
     */
    @XmlEnumValue("full")
    FULL("full"),

    /**
     * TPEG Pti24_5, waiting list
     * 
     */
    @XmlEnumValue("waitingList")
    WAITING_LIST("waitingList"),

    /**
     * TPEG Pti24_6, no booking required
     * 
     */
    @XmlEnumValue("noBookingRequired")
    NO_BOOKING_REQUIRED("noBookingRequired"),

    /**
     * TPEG Pti24_7, booking is required
     * 
     */
    @XmlEnumValue("bookingRequired")
    BOOKING_REQUIRED("bookingRequired"),

    /**
     * TPEG Pti24_8, booking is optional
     * 
     */
    @XmlEnumValue("bookingOptional")
    BOOKING_OPTIONAL("bookingOptional"),

    /**
     * TPEG Pti24_255, undefined booking information
     * 
     */
    @XmlEnumValue("undefinedBookingInformation")
    UNDEFINED_BOOKING_INFORMATION("undefinedBookingInformation");
    private final String value;

    BookingStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingStatusEnumeration fromValue(String v) {
        for (BookingStatusEnumeration c: BookingStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
