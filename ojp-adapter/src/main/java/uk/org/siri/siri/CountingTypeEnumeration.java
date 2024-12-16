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
 * <p>Java-Klasse für CountingTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CountingTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="availabilityCount"/&gt;
 *     &lt;enumeration value="reservedCount"/&gt;
 *     &lt;enumeration value="inUseCount"/&gt;
 *     &lt;enumeration value="outOfOrderCount"/&gt;
 *     &lt;enumeration value="presentCount"/&gt;
 *     &lt;enumeration value="chargingLevel"/&gt;
 *     &lt;enumeration value="availableRunningDistance"/&gt;
 *     &lt;enumeration value="currentStateCount"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountingTypeEnumeration")
@XmlEnum
public enum CountingTypeEnumeration {

    @XmlEnumValue("availabilityCount")
    AVAILABILITY_COUNT("availabilityCount"),
    @XmlEnumValue("reservedCount")
    RESERVED_COUNT("reservedCount"),
    @XmlEnumValue("inUseCount")
    IN_USE_COUNT("inUseCount"),
    @XmlEnumValue("outOfOrderCount")
    OUT_OF_ORDER_COUNT("outOfOrderCount"),
    @XmlEnumValue("presentCount")
    PRESENT_COUNT("presentCount"),
    @XmlEnumValue("chargingLevel")
    CHARGING_LEVEL("chargingLevel"),
    @XmlEnumValue("availableRunningDistance")
    AVAILABLE_RUNNING_DISTANCE("availableRunningDistance"),
    @XmlEnumValue("currentStateCount")
    CURRENT_STATE_COUNT("currentStateCount");
    private final String value;

    CountingTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountingTypeEnumeration fromValue(String v) {
        for (CountingTypeEnumeration c: CountingTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
