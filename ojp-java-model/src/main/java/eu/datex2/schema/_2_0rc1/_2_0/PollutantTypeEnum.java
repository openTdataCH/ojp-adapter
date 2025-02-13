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
 * <p>Java-Klasse für PollutantTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PollutantTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="benzeneTolueneXylene"/&gt;
 *     &lt;enumeration value="carbonMonoxide"/&gt;
 *     &lt;enumeration value="lead"/&gt;
 *     &lt;enumeration value="methane"/&gt;
 *     &lt;enumeration value="nitricOxide"/&gt;
 *     &lt;enumeration value="nitrogenDioxide"/&gt;
 *     &lt;enumeration value="nitrogenMonoxide"/&gt;
 *     &lt;enumeration value="nitrogenOxides"/&gt;
 *     &lt;enumeration value="nonMethaneHydrocarbons"/&gt;
 *     &lt;enumeration value="ozone"/&gt;
 *     &lt;enumeration value="particulates10"/&gt;
 *     &lt;enumeration value="polycyclicAromaticHydrocarbons"/&gt;
 *     &lt;enumeration value="primaryParticulate"/&gt;
 *     &lt;enumeration value="sulphurDioxide"/&gt;
 *     &lt;enumeration value="totalHydrocarbons"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PollutantTypeEnum")
@XmlEnum
public enum PollutantTypeEnum {

    @XmlEnumValue("benzeneTolueneXylene")
    BENZENE_TOLUENE_XYLENE("benzeneTolueneXylene"),
    @XmlEnumValue("carbonMonoxide")
    CARBON_MONOXIDE("carbonMonoxide"),
    @XmlEnumValue("lead")
    LEAD("lead"),
    @XmlEnumValue("methane")
    METHANE("methane"),
    @XmlEnumValue("nitricOxide")
    NITRIC_OXIDE("nitricOxide"),
    @XmlEnumValue("nitrogenDioxide")
    NITROGEN_DIOXIDE("nitrogenDioxide"),
    @XmlEnumValue("nitrogenMonoxide")
    NITROGEN_MONOXIDE("nitrogenMonoxide"),
    @XmlEnumValue("nitrogenOxides")
    NITROGEN_OXIDES("nitrogenOxides"),
    @XmlEnumValue("nonMethaneHydrocarbons")
    NON_METHANE_HYDROCARBONS("nonMethaneHydrocarbons"),
    @XmlEnumValue("ozone")
    OZONE("ozone"),
    @XmlEnumValue("particulates10")
    PARTICULATES_10("particulates10"),
    @XmlEnumValue("polycyclicAromaticHydrocarbons")
    POLYCYCLIC_AROMATIC_HYDROCARBONS("polycyclicAromaticHydrocarbons"),
    @XmlEnumValue("primaryParticulate")
    PRIMARY_PARTICULATE("primaryParticulate"),
    @XmlEnumValue("sulphurDioxide")
    SULPHUR_DIOXIDE("sulphurDioxide"),
    @XmlEnumValue("totalHydrocarbons")
    TOTAL_HYDROCARBONS("totalHydrocarbons");
    private final String value;

    PollutantTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PollutantTypeEnum fromValue(String v) {
        for (PollutantTypeEnum c : PollutantTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
