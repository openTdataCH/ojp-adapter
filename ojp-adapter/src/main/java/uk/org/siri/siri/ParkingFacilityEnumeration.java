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
 * <p>Java-Klasse für ParkingFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ParkingFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="carPark"/&gt;
 *     &lt;enumeration value="parkAndRidePark"/&gt;
 *     &lt;enumeration value="motorcyclePark"/&gt;
 *     &lt;enumeration value="cyclePark"/&gt;
 *     &lt;enumeration value="rentalCarPark"/&gt;
 *     &lt;enumeration value="coachPark"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingFacilityEnumeration")
@XmlEnum
public enum ParkingFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("carPark")
    CAR_PARK("carPark"),
    @XmlEnumValue("parkAndRidePark")
    PARK_AND_RIDE_PARK("parkAndRidePark"),
    @XmlEnumValue("motorcyclePark")
    MOTORCYCLE_PARK("motorcyclePark"),
    @XmlEnumValue("cyclePark")
    CYCLE_PARK("cyclePark"),
    @XmlEnumValue("rentalCarPark")
    RENTAL_CAR_PARK("rentalCarPark"),
    @XmlEnumValue("coachPark")
    COACH_PARK("coachPark");
    private final String value;

    ParkingFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingFacilityEnumeration fromValue(String v) {
        for (ParkingFacilityEnumeration c: ParkingFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
