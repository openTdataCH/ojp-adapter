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
 * <p>Java-Klasse für TrainSizeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TrainSizeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="short"/&gt;
 *     &lt;enumeration value="long"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrainSizeEnumeration")
@XmlEnum
public enum TrainSizeEnumeration {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("long")
    LONG("long");
    private final String value;

    TrainSizeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrainSizeEnumeration fromValue(String v) {
        for (TrainSizeEnumeration c: TrainSizeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
