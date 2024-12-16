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
 * <p>Java-Klasse für UrlLinkTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="UrlLinkTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="documentPdf"/&gt;
 *     &lt;enumeration value="html"/&gt;
 *     &lt;enumeration value="image"/&gt;
 *     &lt;enumeration value="rss"/&gt;
 *     &lt;enumeration value="videoStream"/&gt;
 *     &lt;enumeration value="voiceStream"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrlLinkTypeEnum")
@XmlEnum
public enum UrlLinkTypeEnum {

    @XmlEnumValue("documentPdf")
    DOCUMENT_PDF("documentPdf"),
    @XmlEnumValue("html")
    HTML("html"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("rss")
    RSS("rss"),
    @XmlEnumValue("videoStream")
    VIDEO_STREAM("videoStream"),
    @XmlEnumValue("voiceStream")
    VOICE_STREAM("voiceStream"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UrlLinkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrlLinkTypeEnum fromValue(String v) {
        for (UrlLinkTypeEnum c: UrlLinkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
