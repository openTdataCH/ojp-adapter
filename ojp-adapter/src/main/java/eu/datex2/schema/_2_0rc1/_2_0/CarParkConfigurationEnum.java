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
 * <p>Java-Klasse für CarParkConfigurationEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CarParkConfigurationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="multiStorey"/&gt;
 *     &lt;enumeration value="parkAndRide"/&gt;
 *     &lt;enumeration value="singleLevel"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarParkConfigurationEnum")
@XmlEnum
public enum CarParkConfigurationEnum {

    @XmlEnumValue("multiStorey")
    MULTI_STOREY("multiStorey"),
    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),
    @XmlEnumValue("singleLevel")
    SINGLE_LEVEL("singleLevel"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground");
    private final String value;

    CarParkConfigurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarParkConfigurationEnum fromValue(String v) {
        for (CarParkConfigurationEnum c: CarParkConfigurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
