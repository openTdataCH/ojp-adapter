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
 * <p>Java-Klasse für FacilityCategoryEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FacilityCategoryEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="fixedEquipment"/&gt;
 *     &lt;enumeration value="mobileEquipment"/&gt;
 *     &lt;enumeration value="serviceProvidedByIndividual"/&gt;
 *     &lt;enumeration value="serviceForPersonalDevice"/&gt;
 *     &lt;enumeration value="reservedArea"/&gt;
 *     &lt;enumeration value="site"/&gt;
 *     &lt;enumeration value="siteComponent"/&gt;
 *     &lt;enumeration value="parkingBay"/&gt;
 *     &lt;enumeration value="vehicle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "FacilityCategoryEnumeration")
@XmlEnum
public enum FacilityCategoryEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("fixedEquipment")
    FIXED_EQUIPMENT("fixedEquipment"),
    @XmlEnumValue("mobileEquipment")
    MOBILE_EQUIPMENT("mobileEquipment"),
    @XmlEnumValue("serviceProvidedByIndividual")
    SERVICE_PROVIDED_BY_INDIVIDUAL("serviceProvidedByIndividual"),
    @XmlEnumValue("serviceForPersonalDevice")
    SERVICE_FOR_PERSONAL_DEVICE("serviceForPersonalDevice"),
    @XmlEnumValue("reservedArea")
    RESERVED_AREA("reservedArea"),
    @XmlEnumValue("site")
    SITE("site"),
    @XmlEnumValue("siteComponent")
    SITE_COMPONENT("siteComponent"),
    @XmlEnumValue("parkingBay")
    PARKING_BAY("parkingBay"),
    @XmlEnumValue("vehicle")
    VEHICLE("vehicle");
    private final String value;

    FacilityCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityCategoryEnumeration fromValue(String v) {
        for (FacilityCategoryEnumeration c : FacilityCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
