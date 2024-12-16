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
 * <p>Java-Klasse für FirstOrLastJourneyEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FirstOrLastJourneyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="firstServiceOfDay"/&gt;
 *     &lt;enumeration value="otherService"/&gt;
 *     &lt;enumeration value="lastServiceOfDay"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FirstOrLastJourneyEnumeration")
@XmlEnum
public enum FirstOrLastJourneyEnumeration {

    @XmlEnumValue("firstServiceOfDay")
    FIRST_SERVICE_OF_DAY("firstServiceOfDay"),
    @XmlEnumValue("otherService")
    OTHER_SERVICE("otherService"),
    @XmlEnumValue("lastServiceOfDay")
    LAST_SERVICE_OF_DAY("lastServiceOfDay"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    FirstOrLastJourneyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FirstOrLastJourneyEnumeration fromValue(String v) {
        for (FirstOrLastJourneyEnumeration c: FirstOrLastJourneyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
