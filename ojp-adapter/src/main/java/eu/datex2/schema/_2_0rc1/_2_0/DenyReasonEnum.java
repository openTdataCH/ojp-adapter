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
 * <p>Java-Klasse für DenyReasonEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DenyReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknownReason"/&gt;
 *     &lt;enumeration value="wrongCatalogue"/&gt;
 *     &lt;enumeration value="wrongFilter"/&gt;
 *     &lt;enumeration value="wrongOrder"/&gt;
 *     &lt;enumeration value="wrongPartner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DenyReasonEnum")
@XmlEnum
public enum DenyReasonEnum {

    @XmlEnumValue("unknownReason")
    UNKNOWN_REASON("unknownReason"),
    @XmlEnumValue("wrongCatalogue")
    WRONG_CATALOGUE("wrongCatalogue"),
    @XmlEnumValue("wrongFilter")
    WRONG_FILTER("wrongFilter"),
    @XmlEnumValue("wrongOrder")
    WRONG_ORDER("wrongOrder"),
    @XmlEnumValue("wrongPartner")
    WRONG_PARTNER("wrongPartner");
    private final String value;

    DenyReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenyReasonEnum fromValue(String v) {
        for (DenyReasonEnum c: DenyReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
