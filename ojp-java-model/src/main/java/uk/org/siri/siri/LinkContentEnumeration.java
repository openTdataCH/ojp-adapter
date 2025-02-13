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
 * <p>Java-Klasse für LinkContentEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LinkContentEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="timetable"/&gt;
 *     &lt;enumeration value="relatedSite"/&gt;
 *     &lt;enumeration value="details"/&gt;
 *     &lt;enumeration value="advice"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "LinkContentEnumeration")
@XmlEnum
public enum LinkContentEnumeration {

    @XmlEnumValue("timetable")
    TIMETABLE("timetable"),
    @XmlEnumValue("relatedSite")
    RELATED_SITE("relatedSite"),
    @XmlEnumValue("details")
    DETAILS("details"),
    @XmlEnumValue("advice")
    ADVICE("advice"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LinkContentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkContentEnumeration fromValue(String v) {
        for (LinkContentEnumeration c : LinkContentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
