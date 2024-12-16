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
 * <p>Java-Klasse für MeasuredOrDerivedDataTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MeasuredOrDerivedDataTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="humidityInformation"/&gt;
 *     &lt;enumeration value="individualVehicleMeasurements"/&gt;
 *     &lt;enumeration value="pollutionInformation"/&gt;
 *     &lt;enumeration value="precipitationInformation"/&gt;
 *     &lt;enumeration value="pressureInformation"/&gt;
 *     &lt;enumeration value="radiationInformation"/&gt;
 *     &lt;enumeration value="roadSurfaceConditionInformation"/&gt;
 *     &lt;enumeration value="temperatureInformation"/&gt;
 *     &lt;enumeration value="trafficConcentration"/&gt;
 *     &lt;enumeration value="trafficFlow"/&gt;
 *     &lt;enumeration value="trafficHeadway"/&gt;
 *     &lt;enumeration value="trafficSpeed"/&gt;
 *     &lt;enumeration value="trafficStatusInformation"/&gt;
 *     &lt;enumeration value="travelTimeInformation"/&gt;
 *     &lt;enumeration value="visibilityInformation"/&gt;
 *     &lt;enumeration value="windInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasuredOrDerivedDataTypeEnum")
@XmlEnum
public enum MeasuredOrDerivedDataTypeEnum {

    @XmlEnumValue("humidityInformation")
    HUMIDITY_INFORMATION("humidityInformation"),
    @XmlEnumValue("individualVehicleMeasurements")
    INDIVIDUAL_VEHICLE_MEASUREMENTS("individualVehicleMeasurements"),
    @XmlEnumValue("pollutionInformation")
    POLLUTION_INFORMATION("pollutionInformation"),
    @XmlEnumValue("precipitationInformation")
    PRECIPITATION_INFORMATION("precipitationInformation"),
    @XmlEnumValue("pressureInformation")
    PRESSURE_INFORMATION("pressureInformation"),
    @XmlEnumValue("radiationInformation")
    RADIATION_INFORMATION("radiationInformation"),
    @XmlEnumValue("roadSurfaceConditionInformation")
    ROAD_SURFACE_CONDITION_INFORMATION("roadSurfaceConditionInformation"),
    @XmlEnumValue("temperatureInformation")
    TEMPERATURE_INFORMATION("temperatureInformation"),
    @XmlEnumValue("trafficConcentration")
    TRAFFIC_CONCENTRATION("trafficConcentration"),
    @XmlEnumValue("trafficFlow")
    TRAFFIC_FLOW("trafficFlow"),
    @XmlEnumValue("trafficHeadway")
    TRAFFIC_HEADWAY("trafficHeadway"),
    @XmlEnumValue("trafficSpeed")
    TRAFFIC_SPEED("trafficSpeed"),
    @XmlEnumValue("trafficStatusInformation")
    TRAFFIC_STATUS_INFORMATION("trafficStatusInformation"),
    @XmlEnumValue("travelTimeInformation")
    TRAVEL_TIME_INFORMATION("travelTimeInformation"),
    @XmlEnumValue("visibilityInformation")
    VISIBILITY_INFORMATION("visibilityInformation"),
    @XmlEnumValue("windInformation")
    WIND_INFORMATION("windInformation");
    private final String value;

    MeasuredOrDerivedDataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasuredOrDerivedDataTypeEnum fromValue(String v) {
        for (MeasuredOrDerivedDataTypeEnum c: MeasuredOrDerivedDataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
