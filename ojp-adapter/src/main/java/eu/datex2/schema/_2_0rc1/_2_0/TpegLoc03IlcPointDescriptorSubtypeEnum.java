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
 * <p>Java-Klasse für TpegLoc03IlcPointDescriptorSubtypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TpegLoc03IlcPointDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tpegIlcName1"/&gt;
 *     &lt;enumeration value="tpegIlcName2"/&gt;
 *     &lt;enumeration value="tpegIlcName3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03IlcPointDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03IlcPointDescriptorSubtypeEnum {

    @XmlEnumValue("tpegIlcName1")
    TPEG_ILC_NAME_1("tpegIlcName1"),
    @XmlEnumValue("tpegIlcName2")
    TPEG_ILC_NAME_2("tpegIlcName2"),
    @XmlEnumValue("tpegIlcName3")
    TPEG_ILC_NAME_3("tpegIlcName3");
    private final String value;

    TpegLoc03IlcPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03IlcPointDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03IlcPointDescriptorSubtypeEnum c: TpegLoc03IlcPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
