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
 * <p>Java-Klasse für LuggageFacilityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LuggageFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="pti23_17"/&gt;
 *     &lt;enumeration value="bikeCarriage"/&gt;
 *     &lt;enumeration value="baggageStorage"/&gt;
 *     &lt;enumeration value="leftLuggage"/&gt;
 *     &lt;enumeration value="porterage"/&gt;
 *     &lt;enumeration value="baggageTrolleys"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "LuggageFacilityEnumeration")
@XmlEnum
public enum LuggageFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_17")
    PTI_23___17("pti23_17"),
    @XmlEnumValue("bikeCarriage")
    BIKE_CARRIAGE("bikeCarriage"),
    @XmlEnumValue("baggageStorage")
    BAGGAGE_STORAGE("baggageStorage"),
    @XmlEnumValue("leftLuggage")
    LEFT_LUGGAGE("leftLuggage"),
    @XmlEnumValue("porterage")
    PORTERAGE("porterage"),
    @XmlEnumValue("baggageTrolleys")
    BAGGAGE_TROLLEYS("baggageTrolleys");
    private final String value;

    LuggageFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuggageFacilityEnumeration fromValue(String v) {
        for (LuggageFacilityEnumeration c : LuggageFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
