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
 * <p>Java-Klasse für DrivingConditionTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DrivingConditionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="impossible"/&gt;
 *     &lt;enumeration value="hazardous"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="passableWithCare"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="veryHazardous"/&gt;
 *     &lt;enumeration value="winterConditions"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DrivingConditionTypeEnum")
@XmlEnum
public enum DrivingConditionTypeEnum {

    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),
    @XmlEnumValue("hazardous")
    HAZARDOUS("hazardous"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("passableWithCare")
    PASSABLE_WITH_CARE("passableWithCare"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("veryHazardous")
    VERY_HAZARDOUS("veryHazardous"),
    @XmlEnumValue("winterConditions")
    WINTER_CONDITIONS("winterConditions"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DrivingConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrivingConditionTypeEnum fromValue(String v) {
        for (DrivingConditionTypeEnum c: DrivingConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
