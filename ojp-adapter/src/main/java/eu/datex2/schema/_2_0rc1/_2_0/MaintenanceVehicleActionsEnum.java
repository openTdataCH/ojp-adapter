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
 * <p>Java-Klasse für MaintenanceVehicleActionsEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MaintenanceVehicleActionsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="maintenanceVehiclesMergingIntoTrafficFlow"/&gt;
 *     &lt;enumeration value="saltAndGritSpreading"/&gt;
 *     &lt;enumeration value="slowMoving"/&gt;
 *     &lt;enumeration value="snowClearing"/&gt;
 *     &lt;enumeration value="stoppingToServiceEquipments"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaintenanceVehicleActionsEnum")
@XmlEnum
public enum MaintenanceVehicleActionsEnum {

    @XmlEnumValue("maintenanceVehiclesMergingIntoTrafficFlow")
    MAINTENANCE_VEHICLES_MERGING_INTO_TRAFFIC_FLOW("maintenanceVehiclesMergingIntoTrafficFlow"),
    @XmlEnumValue("saltAndGritSpreading")
    SALT_AND_GRIT_SPREADING("saltAndGritSpreading"),
    @XmlEnumValue("slowMoving")
    SLOW_MOVING("slowMoving"),
    @XmlEnumValue("snowClearing")
    SNOW_CLEARING("snowClearing"),
    @XmlEnumValue("stoppingToServiceEquipments")
    STOPPING_TO_SERVICE_EQUIPMENTS("stoppingToServiceEquipments");
    private final String value;

    MaintenanceVehicleActionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaintenanceVehicleActionsEnum fromValue(String v) {
        for (MaintenanceVehicleActionsEnum c: MaintenanceVehicleActionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
