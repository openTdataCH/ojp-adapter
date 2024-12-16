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
 * <p>Java-Klasse für OperatorActionStatusEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="OperatorActionStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="requested"/&gt;
 *     &lt;enumeration value="approved"/&gt;
 *     &lt;enumeration value="beingImplemented"/&gt;
 *     &lt;enumeration value="implemented"/&gt;
 *     &lt;enumeration value="rejected"/&gt;
 *     &lt;enumeration value="terminationRequested"/&gt;
 *     &lt;enumeration value="beingTerminated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionStatusEnum")
@XmlEnum
public enum OperatorActionStatusEnum {

    @XmlEnumValue("requested")
    REQUESTED("requested"),
    @XmlEnumValue("approved")
    APPROVED("approved"),
    @XmlEnumValue("beingImplemented")
    BEING_IMPLEMENTED("beingImplemented"),
    @XmlEnumValue("implemented")
    IMPLEMENTED("implemented"),
    @XmlEnumValue("rejected")
    REJECTED("rejected"),
    @XmlEnumValue("terminationRequested")
    TERMINATION_REQUESTED("terminationRequested"),
    @XmlEnumValue("beingTerminated")
    BEING_TERMINATED("beingTerminated");
    private final String value;

    OperatorActionStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionStatusEnum fromValue(String v) {
        for (OperatorActionStatusEnum c: OperatorActionStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
