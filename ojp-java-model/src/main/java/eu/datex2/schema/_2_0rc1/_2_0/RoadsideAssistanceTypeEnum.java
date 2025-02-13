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
 * <p>Java-Klasse für RoadsideAssistanceTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RoadsideAssistanceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airAmbulance"/&gt;
 *     &lt;enumeration value="busPassengerAssistance"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="firstAid"/&gt;
 *     &lt;enumeration value="foodDelivery"/&gt;
 *     &lt;enumeration value="helicopterRescue"/&gt;
 *     &lt;enumeration value="vehicleRepair"/&gt;
 *     &lt;enumeration value="vehicleRecovery"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "RoadsideAssistanceTypeEnum")
@XmlEnum
public enum RoadsideAssistanceTypeEnum {

    @XmlEnumValue("airAmbulance")
    AIR_AMBULANCE("airAmbulance"),
    @XmlEnumValue("busPassengerAssistance")
    BUS_PASSENGER_ASSISTANCE("busPassengerAssistance"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("firstAid")
    FIRST_AID("firstAid"),
    @XmlEnumValue("foodDelivery")
    FOOD_DELIVERY("foodDelivery"),
    @XmlEnumValue("helicopterRescue")
    HELICOPTER_RESCUE("helicopterRescue"),
    @XmlEnumValue("vehicleRepair")
    VEHICLE_REPAIR("vehicleRepair"),
    @XmlEnumValue("vehicleRecovery")
    VEHICLE_RECOVERY("vehicleRecovery"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadsideAssistanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadsideAssistanceTypeEnum fromValue(String v) {
        for (RoadsideAssistanceTypeEnum c : RoadsideAssistanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
