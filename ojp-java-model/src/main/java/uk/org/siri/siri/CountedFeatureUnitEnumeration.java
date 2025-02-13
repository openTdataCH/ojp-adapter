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
 * <p>Java-Klasse für CountedFeatureUnitEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CountedFeatureUnitEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="bays"/&gt;
 *     &lt;enumeration value="seats"/&gt;
 *     &lt;enumeration value="otherSpaces"/&gt;
 *     &lt;enumeration value="devices"/&gt;
 *     &lt;enumeration value="vehicles"/&gt;
 *     &lt;enumeration value="persons"/&gt;
 *     &lt;enumeration value="litres"/&gt;
 *     &lt;enumeration value="squareMeters"/&gt;
 *     &lt;enumeration value="cubicMeters"/&gt;
 *     &lt;enumeration value="meters"/&gt;
 *     &lt;enumeration value="kWh"/&gt;
 *     &lt;enumeration value="mAh"/&gt;
 *     &lt;enumeration value="kW"/&gt;
 *     &lt;enumeration value="kg"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "CountedFeatureUnitEnumeration")
@XmlEnum
public enum CountedFeatureUnitEnumeration {

    @XmlEnumValue("bays")
    BAYS("bays"),
    @XmlEnumValue("seats")
    SEATS("seats"),
    @XmlEnumValue("otherSpaces")
    OTHER_SPACES("otherSpaces"),
    @XmlEnumValue("devices")
    DEVICES("devices"),
    @XmlEnumValue("vehicles")
    VEHICLES("vehicles"),
    @XmlEnumValue("persons")
    PERSONS("persons"),
    @XmlEnumValue("litres")
    LITRES("litres"),
    @XmlEnumValue("squareMeters")
    SQUARE_METERS("squareMeters"),
    @XmlEnumValue("cubicMeters")
    CUBIC_METERS("cubicMeters"),
    @XmlEnumValue("meters")
    METERS("meters"),
    @XmlEnumValue("kWh")
    K_WH("kWh"),
    @XmlEnumValue("mAh")
    M_AH("mAh"),
    @XmlEnumValue("kW")
    K_W("kW"),
    @XmlEnumValue("kg")
    KG("kg"),
    A("A"),
    C("C"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CountedFeatureUnitEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountedFeatureUnitEnumeration fromValue(String v) {
        for (CountedFeatureUnitEnumeration c : CountedFeatureUnitEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
