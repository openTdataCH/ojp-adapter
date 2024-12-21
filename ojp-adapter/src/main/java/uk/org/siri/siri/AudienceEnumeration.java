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
 * <p>Java-Klasse für AudienceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AudienceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="public"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="staff"/&gt;
 *     &lt;enumeration value="stationStaff"/&gt;
 *     &lt;enumeration value="management"/&gt;
 *     &lt;enumeration value="authorities"/&gt;
 *     &lt;enumeration value="infoServices"/&gt;
 *     &lt;enumeration value="transportOperators"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AudienceEnumeration")
@XmlEnum
public enum AudienceEnumeration {

    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("stationStaff")
    STATION_STAFF("stationStaff"),
    @XmlEnumValue("management")
    MANAGEMENT("management"),
    @XmlEnumValue("authorities")
    AUTHORITIES("authorities"),
    @XmlEnumValue("infoServices")
    INFO_SERVICES("infoServices"),
    @XmlEnumValue("transportOperators")
    TRANSPORT_OPERATORS("transportOperators");
    private final String value;

    AudienceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceEnumeration fromValue(String v) {
        for (AudienceEnumeration c: AudienceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
