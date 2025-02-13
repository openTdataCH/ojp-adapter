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
 * <p>Java-Klasse für UrgencyEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="UrgencyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="extremelyUrgent"/&gt;
 *     &lt;enumeration value="urgent"/&gt;
 *     &lt;enumeration value="normalUrgency"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "UrgencyEnum")
@XmlEnum
public enum UrgencyEnum {

    @XmlEnumValue("extremelyUrgent")
    EXTREMELY_URGENT("extremelyUrgent"),
    @XmlEnumValue("urgent")
    URGENT("urgent"),
    @XmlEnumValue("normalUrgency")
    NORMAL_URGENCY("normalUrgency");
    private final String value;

    UrgencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrgencyEnum fromValue(String v) {
        for (UrgencyEnum c : UrgencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
