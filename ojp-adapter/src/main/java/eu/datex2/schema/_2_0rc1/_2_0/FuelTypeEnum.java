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
 * <p>Java-Klasse für FuelTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FuelTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="battery"/&gt;
 *     &lt;enumeration value="biodiesel"/&gt;
 *     &lt;enumeration value="diesel"/&gt;
 *     &lt;enumeration value="dieselBatteryHybrid"/&gt;
 *     &lt;enumeration value="ethanol"/&gt;
 *     &lt;enumeration value="hydrogen"/&gt;
 *     &lt;enumeration value="liquidGas"/&gt;
 *     &lt;enumeration value="lpg"/&gt;
 *     &lt;enumeration value="methane"/&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *     &lt;enumeration value="petrolBatteryHybrid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelTypeEnum")
@XmlEnum
public enum FuelTypeEnum {

    @XmlEnumValue("battery")
    BATTERY("battery"),
    @XmlEnumValue("biodiesel")
    BIODIESEL("biodiesel"),
    @XmlEnumValue("diesel")
    DIESEL("diesel"),
    @XmlEnumValue("dieselBatteryHybrid")
    DIESEL_BATTERY_HYBRID("dieselBatteryHybrid"),
    @XmlEnumValue("ethanol")
    ETHANOL("ethanol"),
    @XmlEnumValue("hydrogen")
    HYDROGEN("hydrogen"),
    @XmlEnumValue("liquidGas")
    LIQUID_GAS("liquidGas"),
    @XmlEnumValue("lpg")
    LPG("lpg"),
    @XmlEnumValue("methane")
    METHANE("methane"),
    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("petrolBatteryHybrid")
    PETROL_BATTERY_HYBRID("petrolBatteryHybrid");
    private final String value;

    FuelTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeEnum fromValue(String v) {
        for (FuelTypeEnum c: FuelTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
