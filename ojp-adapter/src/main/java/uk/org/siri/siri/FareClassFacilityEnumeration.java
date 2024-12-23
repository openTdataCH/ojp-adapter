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
 * <p>Java-Klasse für FareClassFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FareClassFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_0"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_6"/&gt;
 *     &lt;enumeration value="firstClass"/&gt;
 *     &lt;enumeration value="pti23_7"/&gt;
 *     &lt;enumeration value="secondClass"/&gt;
 *     &lt;enumeration value="pti23_8"/&gt;
 *     &lt;enumeration value="thirdClass"/&gt;
 *     &lt;enumeration value="pti23_9"/&gt;
 *     &lt;enumeration value="economyClass"/&gt;
 *     &lt;enumeration value="pti23_10"/&gt;
 *     &lt;enumeration value="businessClass"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareClassFacilityEnumeration")
@XmlEnum
public enum FareClassFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_0")
    PTI_23___0("pti23_0"),
    @XmlEnumValue("pti23_6")
    PTI_23___6("pti23_6"),
    @XmlEnumValue("firstClass")
    FIRST_CLASS("firstClass"),
    @XmlEnumValue("pti23_7")
    PTI_23___7("pti23_7"),
    @XmlEnumValue("secondClass")
    SECOND_CLASS("secondClass"),
    @XmlEnumValue("pti23_8")
    PTI_23___8("pti23_8"),
    @XmlEnumValue("thirdClass")
    THIRD_CLASS("thirdClass"),
    @XmlEnumValue("pti23_9")
    PTI_23___9("pti23_9"),
    @XmlEnumValue("economyClass")
    ECONOMY_CLASS("economyClass"),
    @XmlEnumValue("pti23_10")
    PTI_23___10("pti23_10"),
    @XmlEnumValue("businessClass")
    BUSINESS_CLASS("businessClass");
    private final String value;

    FareClassFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareClassFacilityEnumeration fromValue(String v) {
        for (FareClassFacilityEnumeration c: FareClassFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
