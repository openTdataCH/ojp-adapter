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
 * <p>Java-Klasse für TrainElementTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TrainElementTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="buffetCar"/&gt;
 *     &lt;enumeration value="carriage"/&gt;
 *     &lt;enumeration value="engine"/&gt;
 *     &lt;enumeration value="carTransporter"/&gt;
 *     &lt;enumeration value="sleeperCarriage"/&gt;
 *     &lt;enumeration value="luggageVan"/&gt;
 *     &lt;enumeration value="restaurantCarriage"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TrainElementTypeEnumeration")
@XmlEnum
public enum TrainElementTypeEnumeration {

    @XmlEnumValue("buffetCar")
    BUFFET_CAR("buffetCar"),
    @XmlEnumValue("carriage")
    CARRIAGE("carriage"),
    @XmlEnumValue("engine")
    ENGINE("engine"),
    @XmlEnumValue("carTransporter")
    CAR_TRANSPORTER("carTransporter"),
    @XmlEnumValue("sleeperCarriage")
    SLEEPER_CARRIAGE("sleeperCarriage"),
    @XmlEnumValue("luggageVan")
    LUGGAGE_VAN("luggageVan"),
    @XmlEnumValue("restaurantCarriage")
    RESTAURANT_CARRIAGE("restaurantCarriage"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TrainElementTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrainElementTypeEnumeration fromValue(String v) {
        for (TrainElementTypeEnumeration c : TrainElementTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
