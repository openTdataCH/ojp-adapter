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
 * <p>Java-Klasse für GeneralNetworkManagementTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="GeneralNetworkManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bridgeSwingInOperation"/&gt;
 *     &lt;enumeration value="convoyService"/&gt;
 *     &lt;enumeration value="obstacleSignalling"/&gt;
 *     &lt;enumeration value="rampMeteringInOperation"/&gt;
 *     &lt;enumeration value="temporaryTrafficLights"/&gt;
 *     &lt;enumeration value="tollGatesOpen"/&gt;
 *     &lt;enumeration value="trafficBeingManuallyDirected"/&gt;
 *     &lt;enumeration value="trafficHeld"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneralNetworkManagementTypeEnum")
@XmlEnum
public enum GeneralNetworkManagementTypeEnum {

    @XmlEnumValue("bridgeSwingInOperation")
    BRIDGE_SWING_IN_OPERATION("bridgeSwingInOperation"),
    @XmlEnumValue("convoyService")
    CONVOY_SERVICE("convoyService"),
    @XmlEnumValue("obstacleSignalling")
    OBSTACLE_SIGNALLING("obstacleSignalling"),
    @XmlEnumValue("rampMeteringInOperation")
    RAMP_METERING_IN_OPERATION("rampMeteringInOperation"),
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights"),
    @XmlEnumValue("tollGatesOpen")
    TOLL_GATES_OPEN("tollGatesOpen"),
    @XmlEnumValue("trafficBeingManuallyDirected")
    TRAFFIC_BEING_MANUALLY_DIRECTED("trafficBeingManuallyDirected"),
    @XmlEnumValue("trafficHeld")
    TRAFFIC_HELD("trafficHeld"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GeneralNetworkManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralNetworkManagementTypeEnum fromValue(String v) {
        for (GeneralNetworkManagementTypeEnum c: GeneralNetworkManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
