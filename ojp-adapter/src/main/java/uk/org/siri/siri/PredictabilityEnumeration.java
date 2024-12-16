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
 * <p>Java-Klasse für PredictabilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PredictabilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="planned"/&gt;
 *     &lt;enumeration value="unplanned"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PredictabilityEnumeration")
@XmlEnum
public enum PredictabilityEnumeration {

    @XmlEnumValue("planned")
    PLANNED("planned"),
    @XmlEnumValue("unplanned")
    UNPLANNED("unplanned"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    PredictabilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictabilityEnumeration fromValue(String v) {
        for (PredictabilityEnumeration c: PredictabilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
