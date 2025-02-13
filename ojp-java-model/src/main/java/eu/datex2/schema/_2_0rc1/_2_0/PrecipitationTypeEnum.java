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
 * <p>Java-Klasse für PrecipitationTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PrecipitationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="drizzle"/&gt;
 *     &lt;enumeration value="freezingRain"/&gt;
 *     &lt;enumeration value="hail"/&gt;
 *     &lt;enumeration value="rain"/&gt;
 *     &lt;enumeration value="sleet"/&gt;
 *     &lt;enumeration value="snow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PrecipitationTypeEnum")
@XmlEnum
public enum PrecipitationTypeEnum {

    @XmlEnumValue("drizzle")
    DRIZZLE("drizzle"),
    @XmlEnumValue("freezingRain")
    FREEZING_RAIN("freezingRain"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("rain")
    RAIN("rain"),
    @XmlEnumValue("sleet")
    SLEET("sleet"),
    @XmlEnumValue("snow")
    SNOW("snow");
    private final String value;

    PrecipitationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrecipitationTypeEnum fromValue(String v) {
        for (PrecipitationTypeEnum c : PrecipitationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
