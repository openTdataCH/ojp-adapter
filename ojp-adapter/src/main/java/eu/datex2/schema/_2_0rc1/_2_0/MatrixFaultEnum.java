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
 * <p>Java-Klasse für MatrixFaultEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MatrixFaultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="communicationsFailure"/&gt;
 *     &lt;enumeration value="incorrectAspectDisplayed"/&gt;
 *     &lt;enumeration value="outOfService"/&gt;
 *     &lt;enumeration value="powerFailure"/&gt;
 *     &lt;enumeration value="unableToClearDown"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MatrixFaultEnum")
@XmlEnum
public enum MatrixFaultEnum {

    @XmlEnumValue("communicationsFailure")
    COMMUNICATIONS_FAILURE("communicationsFailure"),
    @XmlEnumValue("incorrectAspectDisplayed")
    INCORRECT_ASPECT_DISPLAYED("incorrectAspectDisplayed"),
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),
    @XmlEnumValue("powerFailure")
    POWER_FAILURE("powerFailure"),
    @XmlEnumValue("unableToClearDown")
    UNABLE_TO_CLEAR_DOWN("unableToClearDown"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MatrixFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatrixFaultEnum fromValue(String v) {
        for (MatrixFaultEnum c: MatrixFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
