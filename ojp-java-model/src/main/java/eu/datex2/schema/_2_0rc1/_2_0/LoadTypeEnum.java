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
 * <p>Java-Klasse für LoadTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LoadTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abnormalLoad"/&gt;
 *     &lt;enumeration value="ammunition"/&gt;
 *     &lt;enumeration value="chemicals"/&gt;
 *     &lt;enumeration value="combustibleMaterials"/&gt;
 *     &lt;enumeration value="corrosiveMaterials"/&gt;
 *     &lt;enumeration value="debris"/&gt;
 *     &lt;enumeration value="empty"/&gt;
 *     &lt;enumeration value="explosiveMaterials"/&gt;
 *     &lt;enumeration value="extraHighLoad"/&gt;
 *     &lt;enumeration value="extraLongLoad"/&gt;
 *     &lt;enumeration value="extraWideLoad"/&gt;
 *     &lt;enumeration value="fuel"/&gt;
 *     &lt;enumeration value="glass"/&gt;
 *     &lt;enumeration value="goods"/&gt;
 *     &lt;enumeration value="hazardousMaterials"/&gt;
 *     &lt;enumeration value="liquid"/&gt;
 *     &lt;enumeration value="livestock"/&gt;
 *     &lt;enumeration value="materials"/&gt;
 *     &lt;enumeration value="materialsDangerousForPeople"/&gt;
 *     &lt;enumeration value="materialsDangerousForTheEnvironment"/&gt;
 *     &lt;enumeration value="materialsDangerousForWater"/&gt;
 *     &lt;enumeration value="oil"/&gt;
 *     &lt;enumeration value="ordinary"/&gt;
 *     &lt;enumeration value="perishableProducts"/&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *     &lt;enumeration value="pharmaceuticalMaterials"/&gt;
 *     &lt;enumeration value="radioactiveMaterials"/&gt;
 *     &lt;enumeration value="refuse"/&gt;
 *     &lt;enumeration value="toxicMaterials"/&gt;
 *     &lt;enumeration value="vehicles"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "LoadTypeEnum")
@XmlEnum
public enum LoadTypeEnum {

    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),
    @XmlEnumValue("ammunition")
    AMMUNITION("ammunition"),
    @XmlEnumValue("chemicals")
    CHEMICALS("chemicals"),
    @XmlEnumValue("combustibleMaterials")
    COMBUSTIBLE_MATERIALS("combustibleMaterials"),
    @XmlEnumValue("corrosiveMaterials")
    CORROSIVE_MATERIALS("corrosiveMaterials"),
    @XmlEnumValue("debris")
    DEBRIS("debris"),
    @XmlEnumValue("empty")
    EMPTY("empty"),
    @XmlEnumValue("explosiveMaterials")
    EXPLOSIVE_MATERIALS("explosiveMaterials"),
    @XmlEnumValue("extraHighLoad")
    EXTRA_HIGH_LOAD("extraHighLoad"),
    @XmlEnumValue("extraLongLoad")
    EXTRA_LONG_LOAD("extraLongLoad"),
    @XmlEnumValue("extraWideLoad")
    EXTRA_WIDE_LOAD("extraWideLoad"),
    @XmlEnumValue("fuel")
    FUEL("fuel"),
    @XmlEnumValue("glass")
    GLASS("glass"),
    @XmlEnumValue("goods")
    GOODS("goods"),
    @XmlEnumValue("hazardousMaterials")
    HAZARDOUS_MATERIALS("hazardousMaterials"),
    @XmlEnumValue("liquid")
    LIQUID("liquid"),
    @XmlEnumValue("livestock")
    LIVESTOCK("livestock"),
    @XmlEnumValue("materials")
    MATERIALS("materials"),
    @XmlEnumValue("materialsDangerousForPeople")
    MATERIALS_DANGEROUS_FOR_PEOPLE("materialsDangerousForPeople"),
    @XmlEnumValue("materialsDangerousForTheEnvironment")
    MATERIALS_DANGEROUS_FOR_THE_ENVIRONMENT("materialsDangerousForTheEnvironment"),
    @XmlEnumValue("materialsDangerousForWater")
    MATERIALS_DANGEROUS_FOR_WATER("materialsDangerousForWater"),
    @XmlEnumValue("oil")
    OIL("oil"),
    @XmlEnumValue("ordinary")
    ORDINARY("ordinary"),
    @XmlEnumValue("perishableProducts")
    PERISHABLE_PRODUCTS("perishableProducts"),
    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("pharmaceuticalMaterials")
    PHARMACEUTICAL_MATERIALS("pharmaceuticalMaterials"),
    @XmlEnumValue("radioactiveMaterials")
    RADIOACTIVE_MATERIALS("radioactiveMaterials"),
    @XmlEnumValue("refuse")
    REFUSE("refuse"),
    @XmlEnumValue("toxicMaterials")
    TOXIC_MATERIALS("toxicMaterials"),
    @XmlEnumValue("vehicles")
    VEHICLES("vehicles"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LoadTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadTypeEnum fromValue(String v) {
        for (LoadTypeEnum c : LoadTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
