//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für RefreshmentFacilityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RefreshmentFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_1"/&gt;
 *     &lt;enumeration value="restaurantService"/&gt;
 *     &lt;enumeration value="pti23_2"/&gt;
 *     &lt;enumeration value="snacksService"/&gt;
 *     &lt;enumeration value="pti23"/&gt;
 *     &lt;enumeration value="trolley"/&gt;
 *     &lt;enumeration value="pti23_18"/&gt;
 *     &lt;enumeration value="bar"/&gt;
 *     &lt;enumeration value="pti23_19"/&gt;
 *     &lt;enumeration value="foodNotAvailable"/&gt;
 *     &lt;enumeration value="pti23_20"/&gt;
 *     &lt;enumeration value="beveragesNotAvailable"/&gt;
 *     &lt;enumeration value="pti23_26"/&gt;
 *     &lt;enumeration value="bistro"/&gt;
 *     &lt;enumeration value="foodVendingMachine"/&gt;
 *     &lt;enumeration value="beverageVendingMachine"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "RefreshmentFacilityEnumeration")
@XmlEnum
public enum RefreshmentFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_1")
    PTI_23___1("pti23_1"),
    @XmlEnumValue("restaurantService")
    RESTAURANT_SERVICE("restaurantService"),
    @XmlEnumValue("pti23_2")
    PTI_23___2("pti23_2"),
    @XmlEnumValue("snacksService")
    SNACKS_SERVICE("snacksService"),
    @XmlEnumValue("pti23")
    PTI_23("pti23"),
    @XmlEnumValue("trolley")
    TROLLEY("trolley"),
    @XmlEnumValue("pti23_18")
    PTI_23___18("pti23_18"),
    @XmlEnumValue("bar")
    BAR("bar"),
    @XmlEnumValue("pti23_19")
    PTI_23___19("pti23_19"),
    @XmlEnumValue("foodNotAvailable")
    FOOD_NOT_AVAILABLE("foodNotAvailable"),
    @XmlEnumValue("pti23_20")
    PTI_23___20("pti23_20"),
    @XmlEnumValue("beveragesNotAvailable")
    BEVERAGES_NOT_AVAILABLE("beveragesNotAvailable"),
    @XmlEnumValue("pti23_26")
    PTI_23___26("pti23_26"),
    @XmlEnumValue("bistro")
    BISTRO("bistro"),
    @XmlEnumValue("foodVendingMachine")
    FOOD_VENDING_MACHINE("foodVendingMachine"),
    @XmlEnumValue("beverageVendingMachine")
    BEVERAGE_VENDING_MACHINE("beverageVendingMachine");
    private final String value;

    RefreshmentFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefreshmentFacilityEnumeration fromValue(String v) {
        for (RefreshmentFacilityEnumeration c : RefreshmentFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
