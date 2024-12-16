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
 * <p>Java-Klasse für EquipmentOrSystemFaultTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="EquipmentOrSystemFaultTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="notWorking"/&gt;
 *     &lt;enumeration value="outOfService"/&gt;
 *     &lt;enumeration value="workingIncorrectly"/&gt;
 *     &lt;enumeration value="workingIntermittently"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentOrSystemFaultTypeEnum")
@XmlEnum
public enum EquipmentOrSystemFaultTypeEnum {

    @XmlEnumValue("notWorking")
    NOT_WORKING("notWorking"),
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),
    @XmlEnumValue("workingIncorrectly")
    WORKING_INCORRECTLY("workingIncorrectly"),
    @XmlEnumValue("workingIntermittently")
    WORKING_INTERMITTENTLY("workingIntermittently");
    private final String value;

    EquipmentOrSystemFaultTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentOrSystemFaultTypeEnum fromValue(String v) {
        for (EquipmentOrSystemFaultTypeEnum c: EquipmentOrSystemFaultTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
