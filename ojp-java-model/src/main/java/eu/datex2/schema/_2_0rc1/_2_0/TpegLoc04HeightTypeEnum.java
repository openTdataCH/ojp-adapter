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
 * <p>Java-Klasse für TpegLoc04HeightTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TpegLoc04HeightTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="above"/&gt;
 *     &lt;enumeration value="aboveSeaLevel"/&gt;
 *     &lt;enumeration value="aboveStreetLevel"/&gt;
 *     &lt;enumeration value="at"/&gt;
 *     &lt;enumeration value="atSeaLevel"/&gt;
 *     &lt;enumeration value="atStreetLevel"/&gt;
 *     &lt;enumeration value="below"/&gt;
 *     &lt;enumeration value="belowSeaLevel"/&gt;
 *     &lt;enumeration value="belowStreetLevel"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TpegLoc04HeightTypeEnum")
@XmlEnum
public enum TpegLoc04HeightTypeEnum {

    @XmlEnumValue("above")
    ABOVE("above"),
    @XmlEnumValue("aboveSeaLevel")
    ABOVE_SEA_LEVEL("aboveSeaLevel"),
    @XmlEnumValue("aboveStreetLevel")
    ABOVE_STREET_LEVEL("aboveStreetLevel"),
    @XmlEnumValue("at")
    AT("at"),
    @XmlEnumValue("atSeaLevel")
    AT_SEA_LEVEL("atSeaLevel"),
    @XmlEnumValue("atStreetLevel")
    AT_STREET_LEVEL("atStreetLevel"),
    @XmlEnumValue("below")
    BELOW("below"),
    @XmlEnumValue("belowSeaLevel")
    BELOW_SEA_LEVEL("belowSeaLevel"),
    @XmlEnumValue("belowStreetLevel")
    BELOW_STREET_LEVEL("belowStreetLevel"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc04HeightTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc04HeightTypeEnum fromValue(String v) {
        for (TpegLoc04HeightTypeEnum c : TpegLoc04HeightTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
