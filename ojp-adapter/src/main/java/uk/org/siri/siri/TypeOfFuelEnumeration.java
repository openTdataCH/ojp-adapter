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
 * <p>Java-Klasse für TypeOfFuelEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TypeOfFuelEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *     &lt;enumeration value="diesel"/&gt;
 *     &lt;enumeration value="naturalGas"/&gt;
 *     &lt;enumeration value="biodiesel"/&gt;
 *     &lt;enumeration value="electricity"/&gt;
 *     &lt;enumeration value="hydrogen"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfFuelEnumeration")
@XmlEnum
public enum TypeOfFuelEnumeration {

    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("diesel")
    DIESEL("diesel"),
    @XmlEnumValue("naturalGas")
    NATURAL_GAS("naturalGas"),
    @XmlEnumValue("biodiesel")
    BIODIESEL("biodiesel"),
    @XmlEnumValue("electricity")
    ELECTRICITY("electricity"),
    @XmlEnumValue("hydrogen")
    HYDROGEN("hydrogen"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TypeOfFuelEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfFuelEnumeration fromValue(String v) {
        for (TypeOfFuelEnumeration c: TypeOfFuelEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
