//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für AccessSpaceTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccessSpaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="concours"/&gt;
 *     &lt;enumeration value="bookingHall"/&gt;
 *     &lt;enumeration value="forecourt"/&gt;
 *     &lt;enumeration value="underpass"/&gt;
 *     &lt;enumeration value="overpass"/&gt;
 *     &lt;enumeration value="passage"/&gt;
 *     &lt;enumeration value="passageSection"/&gt;
 *     &lt;enumeration value="gallery"/&gt;
 *     &lt;enumeration value="garage"/&gt;
 *     &lt;enumeration value="shop"/&gt;
 *     &lt;enumeration value="waitingRoom"/&gt;
 *     &lt;enumeration value="restaurant"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AccessSpaceTypeEnumeration")
@XmlEnum
public enum AccessSpaceTypeEnumeration {

    @XmlEnumValue("concours")
    CONCOURS("concours"),
    @XmlEnumValue("bookingHall")
    BOOKING_HALL("bookingHall"),
    @XmlEnumValue("forecourt")
    FORECOURT("forecourt"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("overpass")
    OVERPASS("overpass"),
    @XmlEnumValue("passage")
    PASSAGE("passage"),
    @XmlEnumValue("passageSection")
    PASSAGE_SECTION("passageSection"),
    @XmlEnumValue("gallery")
    GALLERY("gallery"),
    @XmlEnumValue("garage")
    GARAGE("garage"),
    @XmlEnumValue("shop")
    SHOP("shop"),
    @XmlEnumValue("waitingRoom")
    WAITING_ROOM("waitingRoom"),
    @XmlEnumValue("restaurant")
    RESTAURANT("restaurant"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccessSpaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessSpaceTypeEnumeration fromValue(String v) {
        for (AccessSpaceTypeEnumeration c : AccessSpaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
