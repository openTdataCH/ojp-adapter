//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TrafficFlowCharacteristicsEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TrafficFlowCharacteristicsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="erraticFlow"/&gt;
 *     &lt;enumeration value="smoothFlow"/&gt;
 *     &lt;enumeration value="stopAndGo"/&gt;
 *     &lt;enumeration value="trafficBlocked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficFlowCharacteristicsEnum")
@XmlEnum
public enum TrafficFlowCharacteristicsEnum {

    @XmlEnumValue("erraticFlow")
    ERRATIC_FLOW("erraticFlow"),
    @XmlEnumValue("smoothFlow")
    SMOOTH_FLOW("smoothFlow"),
    @XmlEnumValue("stopAndGo")
    STOP_AND_GO("stopAndGo"),
    @XmlEnumValue("trafficBlocked")
    TRAFFIC_BLOCKED("trafficBlocked");
    private final String value;

    TrafficFlowCharacteristicsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficFlowCharacteristicsEnum fromValue(String v) {
        for (TrafficFlowCharacteristicsEnum c: TrafficFlowCharacteristicsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
