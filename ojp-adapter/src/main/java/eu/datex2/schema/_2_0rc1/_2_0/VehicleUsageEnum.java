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
 * <p>Java-Klasse für VehicleUsageEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VehicleUsageEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="agricultural"/&gt;
 *     &lt;enumeration value="commercial"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="military"/&gt;
 *     &lt;enumeration value="nonCommercial"/&gt;
 *     &lt;enumeration value="patrol"/&gt;
 *     &lt;enumeration value="recoveryServices"/&gt;
 *     &lt;enumeration value="roadMaintenanceOrConstruction"/&gt;
 *     &lt;enumeration value="roadOperator"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleUsageEnum")
@XmlEnum
public enum VehicleUsageEnum {

    @XmlEnumValue("agricultural")
    AGRICULTURAL("agricultural"),
    @XmlEnumValue("commercial")
    COMMERCIAL("commercial"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("military")
    MILITARY("military"),
    @XmlEnumValue("nonCommercial")
    NON_COMMERCIAL("nonCommercial"),
    @XmlEnumValue("patrol")
    PATROL("patrol"),
    @XmlEnumValue("recoveryServices")
    RECOVERY_SERVICES("recoveryServices"),
    @XmlEnumValue("roadMaintenanceOrConstruction")
    ROAD_MAINTENANCE_OR_CONSTRUCTION("roadMaintenanceOrConstruction"),
    @XmlEnumValue("roadOperator")
    ROAD_OPERATOR("roadOperator"),
    @XmlEnumValue("taxi")
    TAXI("taxi");
    private final String value;

    VehicleUsageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleUsageEnum fromValue(String v) {
        for (VehicleUsageEnum c: VehicleUsageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
