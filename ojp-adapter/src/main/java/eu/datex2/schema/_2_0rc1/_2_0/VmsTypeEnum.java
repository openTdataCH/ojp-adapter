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
 * <p>Java-Klasse für VmsTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VmsTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="colourGraphic"/&gt;
 *     &lt;enumeration value="continuousSign"/&gt;
 *     &lt;enumeration value="monochromeGraphic"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VmsTypeEnum")
@XmlEnum
public enum VmsTypeEnum {

    @XmlEnumValue("colourGraphic")
    COLOUR_GRAPHIC("colourGraphic"),
    @XmlEnumValue("continuousSign")
    CONTINUOUS_SIGN("continuousSign"),
    @XmlEnumValue("monochromeGraphic")
    MONOCHROME_GRAPHIC("monochromeGraphic"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsTypeEnum fromValue(String v) {
        for (VmsTypeEnum c: VmsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
