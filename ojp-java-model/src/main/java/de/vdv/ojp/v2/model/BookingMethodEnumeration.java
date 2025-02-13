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
 * <p>Java-Klasse für BookingMethodEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BookingMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="callDriver"/&gt;
 *     &lt;enumeration value="callOffice"/&gt;
 *     &lt;enumeration value="online"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="phoneAtStop"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="mobileApp"/&gt;
 *     &lt;enumeration value="atOffice"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "BookingMethodEnumeration")
@XmlEnum
public enum BookingMethodEnumeration {

    @XmlEnumValue("callDriver")
    CALL_DRIVER("callDriver"),
    @XmlEnumValue("callOffice")
    CALL_OFFICE("callOffice"),
    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("phoneAtStop")
    PHONE_AT_STOP("phoneAtStop"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),
    @XmlEnumValue("atOffice")
    AT_OFFICE("atOffice"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    BookingMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingMethodEnumeration fromValue(String v) {
        for (BookingMethodEnumeration c : BookingMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
