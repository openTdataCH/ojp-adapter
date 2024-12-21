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
 * <p>Java-Klasse für AccommodationFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccommodationFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_3"/&gt;
 *     &lt;enumeration value="sleeper"/&gt;
 *     &lt;enumeration value="pti23_4"/&gt;
 *     &lt;enumeration value="couchette"/&gt;
 *     &lt;enumeration value="pti23_5"/&gt;
 *     &lt;enumeration value="specialSeating"/&gt;
 *     &lt;enumeration value="pti23_11"/&gt;
 *     &lt;enumeration value="freeSeating"/&gt;
 *     &lt;enumeration value="pti23_12"/&gt;
 *     &lt;enumeration value="recliningSeats"/&gt;
 *     &lt;enumeration value="pti23_13"/&gt;
 *     &lt;enumeration value="babyCompartment"/&gt;
 *     &lt;enumeration value="familyCarriage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccommodationFacilityEnumeration")
@XmlEnum
public enum AccommodationFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_3")
    PTI_23___3("pti23_3"),
    @XmlEnumValue("sleeper")
    SLEEPER("sleeper"),
    @XmlEnumValue("pti23_4")
    PTI_23___4("pti23_4"),
    @XmlEnumValue("couchette")
    COUCHETTE("couchette"),
    @XmlEnumValue("pti23_5")
    PTI_23___5("pti23_5"),
    @XmlEnumValue("specialSeating")
    SPECIAL_SEATING("specialSeating"),
    @XmlEnumValue("pti23_11")
    PTI_23___11("pti23_11"),
    @XmlEnumValue("freeSeating")
    FREE_SEATING("freeSeating"),
    @XmlEnumValue("pti23_12")
    PTI_23___12("pti23_12"),
    @XmlEnumValue("recliningSeats")
    RECLINING_SEATS("recliningSeats"),
    @XmlEnumValue("pti23_13")
    PTI_23___13("pti23_13"),
    @XmlEnumValue("babyCompartment")
    BABY_COMPARTMENT("babyCompartment"),
    @XmlEnumValue("familyCarriage")
    FAMILY_CARRIAGE("familyCarriage");
    private final String value;

    AccommodationFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccommodationFacilityEnumeration fromValue(String v) {
        for (AccommodationFacilityEnumeration c: AccommodationFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
