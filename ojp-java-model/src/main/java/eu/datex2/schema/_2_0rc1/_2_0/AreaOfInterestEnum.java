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
 * <p>Java-Klasse für AreaOfInterestEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AreaOfInterestEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="continentWide"/&gt;
 *     &lt;enumeration value="national"/&gt;
 *     &lt;enumeration value="neighbouringCountries"/&gt;
 *     &lt;enumeration value="notSpecified"/&gt;
 *     &lt;enumeration value="regional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AreaOfInterestEnum")
@XmlEnum
public enum AreaOfInterestEnum {

    @XmlEnumValue("continentWide")
    CONTINENT_WIDE("continentWide"),
    @XmlEnumValue("national")
    NATIONAL("national"),
    @XmlEnumValue("neighbouringCountries")
    NEIGHBOURING_COUNTRIES("neighbouringCountries"),
    @XmlEnumValue("notSpecified")
    NOT_SPECIFIED("notSpecified"),
    @XmlEnumValue("regional")
    REGIONAL("regional");
    private final String value;

    AreaOfInterestEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaOfInterestEnum fromValue(String v) {
        for (AreaOfInterestEnum c : AreaOfInterestEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
