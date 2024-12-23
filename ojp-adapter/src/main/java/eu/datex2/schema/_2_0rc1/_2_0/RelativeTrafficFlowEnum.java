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
 * <p>Java-Klasse für RelativeTrafficFlowEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RelativeTrafficFlowEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="trafficVeryMuchHeavierThanNormal"/&gt;
 *     &lt;enumeration value="trafficHeavierThanNormal"/&gt;
 *     &lt;enumeration value="trafficFlowNormal"/&gt;
 *     &lt;enumeration value="trafficLighterThanNormal"/&gt;
 *     &lt;enumeration value="trafficVeryMuchLighterThanNormal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelativeTrafficFlowEnum")
@XmlEnum
public enum RelativeTrafficFlowEnum {

    @XmlEnumValue("trafficVeryMuchHeavierThanNormal")
    TRAFFIC_VERY_MUCH_HEAVIER_THAN_NORMAL("trafficVeryMuchHeavierThanNormal"),
    @XmlEnumValue("trafficHeavierThanNormal")
    TRAFFIC_HEAVIER_THAN_NORMAL("trafficHeavierThanNormal"),
    @XmlEnumValue("trafficFlowNormal")
    TRAFFIC_FLOW_NORMAL("trafficFlowNormal"),
    @XmlEnumValue("trafficLighterThanNormal")
    TRAFFIC_LIGHTER_THAN_NORMAL("trafficLighterThanNormal"),
    @XmlEnumValue("trafficVeryMuchLighterThanNormal")
    TRAFFIC_VERY_MUCH_LIGHTER_THAN_NORMAL("trafficVeryMuchLighterThanNormal");
    private final String value;

    RelativeTrafficFlowEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelativeTrafficFlowEnum fromValue(String v) {
        for (RelativeTrafficFlowEnum c: RelativeTrafficFlowEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
