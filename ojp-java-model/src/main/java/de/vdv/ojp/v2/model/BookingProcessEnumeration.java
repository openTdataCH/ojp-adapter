//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für BookingProcessEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BookingProcessEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="productNotAvailable"/&gt;
 *     &lt;enumeration value="productNotBookable"/&gt;
 *     &lt;enumeration value="bookableThroughInternationalSystem"/&gt;
 *     &lt;enumeration value="bookableThroughNationalSystem"/&gt;
 *     &lt;enumeration value="bookableManually"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "BookingProcessEnumeration")
@XmlEnum
public enum BookingProcessEnumeration {

    /**
     * Product is not available.
     */
    @XmlEnumValue("productNotAvailable")
    PRODUCT_NOT_AVAILABLE("productNotAvailable"),

    /**
     * Product cannot be booked.
     */
    @XmlEnumValue("productNotBookable")
    PRODUCT_NOT_BOOKABLE("productNotBookable"),

    /**
     * Product can be booked online internationally.
     */
    @XmlEnumValue("bookableThroughInternationalSystem")
    BOOKABLE_THROUGH_INTERNATIONAL_SYSTEM("bookableThroughInternationalSystem"),

    /**
     * Product can be booked online nationally.
     */
    @XmlEnumValue("bookableThroughNationalSystem")
    BOOKABLE_THROUGH_NATIONAL_SYSTEM("bookableThroughNationalSystem"),

    /**
     * Product can only be booked by contacting specific authorised retail outlets.
     */
    @XmlEnumValue("bookableManually")
    BOOKABLE_MANUALLY("bookableManually"),

    /**
     * Other booking process.
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BookingProcessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingProcessEnumeration fromValue(String v) {
        for (BookingProcessEnumeration c : BookingProcessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
