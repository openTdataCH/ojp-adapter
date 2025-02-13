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
 * <p>Java-Klasse für SituationSourceTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="SituationSourceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="directReport"/&gt;
 *     &lt;enumeration value="email"/&gt;
 *     &lt;enumeration value="phone"/&gt;
 *     &lt;enumeration value="fax"/&gt;
 *     &lt;enumeration value="post"/&gt;
 *     &lt;enumeration value="feed"/&gt;
 *     &lt;enumeration value="radio"/&gt;
 *     &lt;enumeration value="tv"/&gt;
 *     &lt;enumeration value="web"/&gt;
 *     &lt;enumeration value="pager"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "SituationSourceTypeEnumeration")
@XmlEnum
public enum SituationSourceTypeEnumeration {

    @XmlEnumValue("directReport")
    DIRECT_REPORT("directReport"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("post")
    POST("post"),
    @XmlEnumValue("feed")
    FEED("feed"),
    @XmlEnumValue("radio")
    RADIO("radio"),
    @XmlEnumValue("tv")
    TV("tv"),
    @XmlEnumValue("web")
    WEB("web"),
    @XmlEnumValue("pager")
    PAGER("pager"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SituationSourceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SituationSourceTypeEnumeration fromValue(String v) {
        for (SituationSourceTypeEnumeration c : SituationSourceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
