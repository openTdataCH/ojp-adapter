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
 * <p>Java-Klasse für BookingAccessEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BookingAccessEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="public"/&gt;
 *     &lt;enumeration value="authorisedPublic"/&gt;
 *     &lt;enumeration value="staff"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BookingAccessEnumeration")
@XmlEnum
public enum BookingAccessEnumeration {

    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("authorisedPublic")
    AUTHORISED_PUBLIC("authorisedPublic"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BookingAccessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingAccessEnumeration fromValue(String v) {
        for (BookingAccessEnumeration c: BookingAccessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}