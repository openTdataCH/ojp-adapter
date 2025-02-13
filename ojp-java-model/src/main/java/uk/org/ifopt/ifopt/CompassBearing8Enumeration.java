//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für CompassBearing8Enumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CompassBearing8Enumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "CompassBearing8Enumeration")
@XmlEnum
public enum CompassBearing8Enumeration {

    SW,
    SE,
    NW,
    NE,
    W,
    E,
    S,
    N;

    public String value() {
        return name();
    }

    public static CompassBearing8Enumeration fromValue(String v) {
        return valueOf(v);
    }

}
