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
 * <p>Java-Klasse für WinterEquipmentManagementTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="WinterEquipmentManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="doNoUseStudTyres"/&gt;
 *     &lt;enumeration value="useSnowChains"/&gt;
 *     &lt;enumeration value="useSnowChainsOrTyres"/&gt;
 *     &lt;enumeration value="useSnowTyres"/&gt;
 *     &lt;enumeration value="winterEquipmentOnBoardRequired"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WinterEquipmentManagementTypeEnum")
@XmlEnum
public enum WinterEquipmentManagementTypeEnum {

    @XmlEnumValue("doNoUseStudTyres")
    DO_NO_USE_STUD_TYRES("doNoUseStudTyres"),
    @XmlEnumValue("useSnowChains")
    USE_SNOW_CHAINS("useSnowChains"),
    @XmlEnumValue("useSnowChainsOrTyres")
    USE_SNOW_CHAINS_OR_TYRES("useSnowChainsOrTyres"),
    @XmlEnumValue("useSnowTyres")
    USE_SNOW_TYRES("useSnowTyres"),
    @XmlEnumValue("winterEquipmentOnBoardRequired")
    WINTER_EQUIPMENT_ON_BOARD_REQUIRED("winterEquipmentOnBoardRequired"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WinterEquipmentManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WinterEquipmentManagementTypeEnum fromValue(String v) {
        for (WinterEquipmentManagementTypeEnum c: WinterEquipmentManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
