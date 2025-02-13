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
 * <p>Java-Klasse für ConfidentialityValueEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ConfidentialityValueEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="internalUse"/&gt;
 *     &lt;enumeration value="noRestriction"/&gt;
 *     &lt;enumeration value="restrictedToAuthorities"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesAndTrafficOperators"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesTrafficOperatorsAndPublishers"/&gt;
 *     &lt;enumeration value="restrictedToAuthoritiesTrafficOperatorsAndVms"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ConfidentialityValueEnum")
@XmlEnum
public enum ConfidentialityValueEnum {

    @XmlEnumValue("internalUse")
    INTERNAL_USE("internalUse"),
    @XmlEnumValue("noRestriction")
    NO_RESTRICTION("noRestriction"),
    @XmlEnumValue("restrictedToAuthorities")
    RESTRICTED_TO_AUTHORITIES("restrictedToAuthorities"),
    @XmlEnumValue("restrictedToAuthoritiesAndTrafficOperators")
    RESTRICTED_TO_AUTHORITIES_AND_TRAFFIC_OPERATORS("restrictedToAuthoritiesAndTrafficOperators"),
    @XmlEnumValue("restrictedToAuthoritiesTrafficOperatorsAndPublishers")
    RESTRICTED_TO_AUTHORITIES_TRAFFIC_OPERATORS_AND_PUBLISHERS("restrictedToAuthoritiesTrafficOperatorsAndPublishers"),
    @XmlEnumValue("restrictedToAuthoritiesTrafficOperatorsAndVms")
    RESTRICTED_TO_AUTHORITIES_TRAFFIC_OPERATORS_AND_VMS("restrictedToAuthoritiesTrafficOperatorsAndVms");
    private final String value;

    ConfidentialityValueEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfidentialityValueEnum fromValue(String v) {
        for (ConfidentialityValueEnum c : ConfidentialityValueEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
