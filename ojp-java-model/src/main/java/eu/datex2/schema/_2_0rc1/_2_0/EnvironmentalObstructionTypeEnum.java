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
 * <p>Java-Klasse für EnvironmentalObstructionTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="EnvironmentalObstructionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="avalanches"/&gt;
 *     &lt;enumeration value="earthquakeDamage"/&gt;
 *     &lt;enumeration value="fallenTrees"/&gt;
 *     &lt;enumeration value="fallingIce"/&gt;
 *     &lt;enumeration value="fallingLightIceOrSnow"/&gt;
 *     &lt;enumeration value="flashFloods"/&gt;
 *     &lt;enumeration value="flooding"/&gt;
 *     &lt;enumeration value="forestFire"/&gt;
 *     &lt;enumeration value="grassFire"/&gt;
 *     &lt;enumeration value="landslips"/&gt;
 *     &lt;enumeration value="mudSlide"/&gt;
 *     &lt;enumeration value="sewerOverflow"/&gt;
 *     &lt;enumeration value="rockfalls"/&gt;
 *     &lt;enumeration value="seriousFire"/&gt;
 *     &lt;enumeration value="smokeOrFumes"/&gt;
 *     &lt;enumeration value="stormDamage"/&gt;
 *     &lt;enumeration value="subsidence"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "EnvironmentalObstructionTypeEnum")
@XmlEnum
public enum EnvironmentalObstructionTypeEnum {

    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage"),
    @XmlEnumValue("fallenTrees")
    FALLEN_TREES("fallenTrees"),
    @XmlEnumValue("fallingIce")
    FALLING_ICE("fallingIce"),
    @XmlEnumValue("fallingLightIceOrSnow")
    FALLING_LIGHT_ICE_OR_SNOW("fallingLightIceOrSnow"),
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),
    @XmlEnumValue("flooding")
    FLOODING("flooding"),
    @XmlEnumValue("forestFire")
    FOREST_FIRE("forestFire"),
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire"),
    @XmlEnumValue("landslips")
    LANDSLIPS("landslips"),
    @XmlEnumValue("mudSlide")
    MUD_SLIDE("mudSlide"),
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),
    @XmlEnumValue("seriousFire")
    SERIOUS_FIRE("seriousFire"),
    @XmlEnumValue("smokeOrFumes")
    SMOKE_OR_FUMES("smokeOrFumes"),
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EnvironmentalObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentalObstructionTypeEnum fromValue(String v) {
        for (EnvironmentalObstructionTypeEnum c : EnvironmentalObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
