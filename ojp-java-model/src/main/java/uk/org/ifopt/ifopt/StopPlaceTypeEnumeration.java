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
 * <p>Java-Klasse für StopPlaceTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="StopPlaceTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airport"/&gt;
 *     &lt;enumeration value="railStation"/&gt;
 *     &lt;enumeration value="metroStation"/&gt;
 *     &lt;enumeration value="coachStation"/&gt;
 *     &lt;enumeration value="busStation"/&gt;
 *     &lt;enumeration value="harbourPort"/&gt;
 *     &lt;enumeration value="ferryPort"/&gt;
 *     &lt;enumeration value="ferryStop"/&gt;
 *     &lt;enumeration value="onStreetBus"/&gt;
 *     &lt;enumeration value="onStreetTram"/&gt;
 *     &lt;enumeration value="skiLift"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "StopPlaceTypeEnumeration")
@XmlEnum
public enum StopPlaceTypeEnumeration {

    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("busStation")
    BUS_STATION("busStation"),
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),
    @XmlEnumValue("ferryPort")
    FERRY_PORT("ferryPort"),
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),
    @XmlEnumValue("onStreetBus")
    ON_STREET_BUS("onStreetBus"),
    @XmlEnumValue("onStreetTram")
    ON_STREET_TRAM("onStreetTram"),
    @XmlEnumValue("skiLift")
    SKI_LIFT("skiLift"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    StopPlaceTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceTypeEnumeration fromValue(String v) {
        for (StopPlaceTypeEnumeration c : StopPlaceTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
