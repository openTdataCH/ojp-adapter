//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für PersonCategoryEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PersonCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="adult"/&gt;
 *     &lt;enumeration value="child"/&gt;
 *     &lt;enumeration value="emergencyServicesPerson"/&gt;
 *     &lt;enumeration value="fireman"/&gt;
 *     &lt;enumeration value="infant"/&gt;
 *     &lt;enumeration value="medicalStaff"/&gt;
 *     &lt;enumeration value="memberOfThePublic"/&gt;
 *     &lt;enumeration value="policeman"/&gt;
 *     &lt;enumeration value="politician"/&gt;
 *     &lt;enumeration value="publicTransportPassenger"/&gt;
 *     &lt;enumeration value="sickPerson"/&gt;
 *     &lt;enumeration value="trafficOfficer"/&gt;
 *     &lt;enumeration value="trafficWarden"/&gt;
 *     &lt;enumeration value="veryImportantPerson"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PersonCategoryEnum")
@XmlEnum
public enum PersonCategoryEnum {

    @XmlEnumValue("adult")
    ADULT("adult"),
    @XmlEnumValue("child")
    CHILD("child"),
    @XmlEnumValue("emergencyServicesPerson")
    EMERGENCY_SERVICES_PERSON("emergencyServicesPerson"),
    @XmlEnumValue("fireman")
    FIREMAN("fireman"),
    @XmlEnumValue("infant")
    INFANT("infant"),
    @XmlEnumValue("medicalStaff")
    MEDICAL_STAFF("medicalStaff"),
    @XmlEnumValue("memberOfThePublic")
    MEMBER_OF_THE_PUBLIC("memberOfThePublic"),
    @XmlEnumValue("policeman")
    POLICEMAN("policeman"),
    @XmlEnumValue("politician")
    POLITICIAN("politician"),
    @XmlEnumValue("publicTransportPassenger")
    PUBLIC_TRANSPORT_PASSENGER("publicTransportPassenger"),
    @XmlEnumValue("sickPerson")
    SICK_PERSON("sickPerson"),
    @XmlEnumValue("trafficOfficer")
    TRAFFIC_OFFICER("trafficOfficer"),
    @XmlEnumValue("trafficWarden")
    TRAFFIC_WARDEN("trafficWarden"),
    @XmlEnumValue("veryImportantPerson")
    VERY_IMPORTANT_PERSON("veryImportantPerson");
    private final String value;

    PersonCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonCategoryEnum fromValue(String v) {
        for (PersonCategoryEnum c : PersonCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
