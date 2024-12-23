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
 * <p>Java-Klasse für CountryEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CountryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="at"/&gt;
 *     &lt;enumeration value="be"/&gt;
 *     &lt;enumeration value="bg"/&gt;
 *     &lt;enumeration value="ch"/&gt;
 *     &lt;enumeration value="cs"/&gt;
 *     &lt;enumeration value="cy"/&gt;
 *     &lt;enumeration value="cz"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="dk"/&gt;
 *     &lt;enumeration value="ee"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="fi"/&gt;
 *     &lt;enumeration value="fo"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="gb"/&gt;
 *     &lt;enumeration value="gg"/&gt;
 *     &lt;enumeration value="gi"/&gt;
 *     &lt;enumeration value="gr"/&gt;
 *     &lt;enumeration value="hr"/&gt;
 *     &lt;enumeration value="hu"/&gt;
 *     &lt;enumeration value="ie"/&gt;
 *     &lt;enumeration value="im"/&gt;
 *     &lt;enumeration value="is"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="je"/&gt;
 *     &lt;enumeration value="li"/&gt;
 *     &lt;enumeration value="lt"/&gt;
 *     &lt;enumeration value="lu"/&gt;
 *     &lt;enumeration value="lv"/&gt;
 *     &lt;enumeration value="ma"/&gt;
 *     &lt;enumeration value="mc"/&gt;
 *     &lt;enumeration value="mk"/&gt;
 *     &lt;enumeration value="mt"/&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="ro"/&gt;
 *     &lt;enumeration value="se"/&gt;
 *     &lt;enumeration value="si"/&gt;
 *     &lt;enumeration value="sk"/&gt;
 *     &lt;enumeration value="sm"/&gt;
 *     &lt;enumeration value="tr"/&gt;
 *     &lt;enumeration value="va"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryEnum")
@XmlEnum
public enum CountryEnum {

    @XmlEnumValue("at")
    AT("at"),
    @XmlEnumValue("be")
    BE("be"),
    @XmlEnumValue("bg")
    BG("bg"),
    @XmlEnumValue("ch")
    CH("ch"),
    @XmlEnumValue("cs")
    CS("cs"),
    @XmlEnumValue("cy")
    CY("cy"),
    @XmlEnumValue("cz")
    CZ("cz"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("dk")
    DK("dk"),
    @XmlEnumValue("ee")
    EE("ee"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("fi")
    FI("fi"),
    @XmlEnumValue("fo")
    FO("fo"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("gb")
    GB("gb"),
    @XmlEnumValue("gg")
    GG("gg"),
    @XmlEnumValue("gi")
    GI("gi"),
    @XmlEnumValue("gr")
    GR("gr"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("hu")
    HU("hu"),
    @XmlEnumValue("ie")
    IE("ie"),
    @XmlEnumValue("im")
    IM("im"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("je")
    JE("je"),
    @XmlEnumValue("li")
    LI("li"),
    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("lu")
    LU("lu"),
    @XmlEnumValue("lv")
    LV("lv"),
    @XmlEnumValue("ma")
    MA("ma"),
    @XmlEnumValue("mc")
    MC("mc"),
    @XmlEnumValue("mk")
    MK("mk"),
    @XmlEnumValue("mt")
    MT("mt"),
    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("pl")
    PL("pl"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("ro")
    RO("ro"),
    @XmlEnumValue("se")
    SE("se"),
    @XmlEnumValue("si")
    SI("si"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("sm")
    SM("sm"),
    @XmlEnumValue("tr")
    TR("tr"),
    @XmlEnumValue("va")
    VA("va"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CountryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryEnum fromValue(String v) {
        for (CountryEnum c: CountryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
