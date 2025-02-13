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
 * <p>Java-Klasse für NuisanceFacilityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="NuisanceFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="smoking"/&gt;
 *     &lt;enumeration value="noSmoking"/&gt;
 *     &lt;enumeration value="mobilePhoneUseZone"/&gt;
 *     &lt;enumeration value="mobilePhoneFreeZone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "NuisanceFacilityEnumeration")
@XmlEnum
public enum NuisanceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("smoking")
    SMOKING("smoking"),
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),
    @XmlEnumValue("mobilePhoneUseZone")
    MOBILE_PHONE_USE_ZONE("mobilePhoneUseZone"),
    @XmlEnumValue("mobilePhoneFreeZone")
    MOBILE_PHONE_FREE_ZONE("mobilePhoneFreeZone");
    private final String value;

    NuisanceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NuisanceFacilityEnumeration fromValue(String v) {
        for (NuisanceFacilityEnumeration c : NuisanceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
