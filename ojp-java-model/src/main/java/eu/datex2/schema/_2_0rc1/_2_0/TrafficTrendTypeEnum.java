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
 * <p>Java-Klasse für TrafficTrendTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TrafficTrendTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="trafficBuildingUp"/&gt;
 *     &lt;enumeration value="trafficEasing"/&gt;
 *     &lt;enumeration value="trafficStable"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TrafficTrendTypeEnum")
@XmlEnum
public enum TrafficTrendTypeEnum {

    @XmlEnumValue("trafficBuildingUp")
    TRAFFIC_BUILDING_UP("trafficBuildingUp"),
    @XmlEnumValue("trafficEasing")
    TRAFFIC_EASING("trafficEasing"),
    @XmlEnumValue("trafficStable")
    TRAFFIC_STABLE("trafficStable"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrafficTrendTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficTrendTypeEnum fromValue(String v) {
        for (TrafficTrendTypeEnum c : TrafficTrendTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
