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
 * <p>Java-Klasse für TypeOfStopPlaceEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TypeOfStopPlaceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="onstreetBus"/&gt;
 *     &lt;enumeration value="onstreetTram"/&gt;
 *     &lt;enumeration value="ferryStop"/&gt;
 *     &lt;enumeration value="airport"/&gt;
 *     &lt;enumeration value="railStation"/&gt;
 *     &lt;enumeration value="metroStation"/&gt;
 *     &lt;enumeration value="coachStation"/&gt;
 *     &lt;enumeration value="ferryPort"/&gt;
 *     &lt;enumeration value="harbourPort"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfStopPlaceEnumeration")
@XmlEnum
public enum TypeOfStopPlaceEnumeration {

    @XmlEnumValue("onstreetBus")
    ONSTREET_BUS("onstreetBus"),
    @XmlEnumValue("onstreetTram")
    ONSTREET_TRAM("onstreetTram"),
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),
    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("ferryPort")
    FERRY_PORT("ferryPort"),
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TypeOfStopPlaceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfStopPlaceEnumeration fromValue(String v) {
        for (TypeOfStopPlaceEnumeration c: TypeOfStopPlaceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
