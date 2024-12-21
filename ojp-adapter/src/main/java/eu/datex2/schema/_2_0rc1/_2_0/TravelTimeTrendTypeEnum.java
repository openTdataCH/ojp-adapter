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
 * <p>Java-Klasse für TravelTimeTrendTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TravelTimeTrendTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="decreasing"/&gt;
 *     &lt;enumeration value="increasing"/&gt;
 *     &lt;enumeration value="stable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelTimeTrendTypeEnum")
@XmlEnum
public enum TravelTimeTrendTypeEnum {

    @XmlEnumValue("decreasing")
    DECREASING("decreasing"),
    @XmlEnumValue("increasing")
    INCREASING("increasing"),
    @XmlEnumValue("stable")
    STABLE("stable");
    private final String value;

    TravelTimeTrendTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelTimeTrendTypeEnum fromValue(String v) {
        for (TravelTimeTrendTypeEnum c: TravelTimeTrendTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
