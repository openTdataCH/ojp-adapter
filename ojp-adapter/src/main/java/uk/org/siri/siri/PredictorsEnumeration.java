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
 * <p>Java-Klasse für PredictorsEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PredictorsEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="avmsOnly"/&gt;
 *     &lt;enumeration value="anyone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PredictorsEnumeration")
@XmlEnum
public enum PredictorsEnumeration {

    @XmlEnumValue("avmsOnly")
    AVMS_ONLY("avmsOnly"),
    @XmlEnumValue("anyone")
    ANYONE("anyone");
    private final String value;

    PredictorsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictorsEnumeration fromValue(String v) {
        for (PredictorsEnumeration c: PredictorsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
