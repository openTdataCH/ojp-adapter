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
 * <p>Java-Klasse für CompressionMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CompressionMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="gzip"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompressionMethodEnumeration")
@XmlEnum
public enum CompressionMethodEnumeration {

    @XmlEnumValue("gzip")
    GZIP("gzip"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CompressionMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompressionMethodEnumeration fromValue(String v) {
        for (CompressionMethodEnumeration c: CompressionMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
