//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.acsb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für MedicalNeedEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MedicalNeedEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="allergic"/&gt;
 *     &lt;enumeration value="heartCondition"/&gt;
 *     &lt;enumeration value="otherMedicalNeed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "MedicalNeedEnumeration")
@XmlEnum
public enum MedicalNeedEnumeration {

    @XmlEnumValue("allergic")
    ALLERGIC("allergic"),
    @XmlEnumValue("heartCondition")
    HEART_CONDITION("heartCondition"),
    @XmlEnumValue("otherMedicalNeed")
    OTHER_MEDICAL_NEED("otherMedicalNeed");
    private final String value;

    MedicalNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicalNeedEnumeration fromValue(String v) {
        for (MedicalNeedEnumeration c : MedicalNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
