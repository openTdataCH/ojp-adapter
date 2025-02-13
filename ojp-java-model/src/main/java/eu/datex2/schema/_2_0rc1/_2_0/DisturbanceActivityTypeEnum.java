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
 * <p>Java-Klasse für DisturbanceActivityTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DisturbanceActivityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airRaid"/&gt;
 *     &lt;enumeration value="altercationOfVehicleOccupants"/&gt;
 *     &lt;enumeration value="assault"/&gt;
 *     &lt;enumeration value="assetDestruction"/&gt;
 *     &lt;enumeration value="attack"/&gt;
 *     &lt;enumeration value="attackOnVehicle"/&gt;
 *     &lt;enumeration value="blockadeOrBarrier"/&gt;
 *     &lt;enumeration value="bombAlert"/&gt;
 *     &lt;enumeration value="crowd"/&gt;
 *     &lt;enumeration value="demonstration"/&gt;
 *     &lt;enumeration value="evacuation"/&gt;
 *     &lt;enumeration value="filterBlockade"/&gt;
 *     &lt;enumeration value="goSlowOperation"/&gt;
 *     &lt;enumeration value="gunfireOnRoadway"/&gt;
 *     &lt;enumeration value="illVehicleOccupants"/&gt;
 *     &lt;enumeration value="march"/&gt;
 *     &lt;enumeration value="publicDisturbance"/&gt;
 *     &lt;enumeration value="radioactiveLeakAlert"/&gt;
 *     &lt;enumeration value="riot"/&gt;
 *     &lt;enumeration value="sabotage"/&gt;
 *     &lt;enumeration value="securityAlert"/&gt;
 *     &lt;enumeration value="securityIncident"/&gt;
 *     &lt;enumeration value="sightseersObstructingAccess"/&gt;
 *     &lt;enumeration value="strike"/&gt;
 *     &lt;enumeration value="terroristIncident"/&gt;
 *     &lt;enumeration value="theft"/&gt;
 *     &lt;enumeration value="toxicCloudAlert"/&gt;
 *     &lt;enumeration value="unspecifiedAlert"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "DisturbanceActivityTypeEnum")
@XmlEnum
public enum DisturbanceActivityTypeEnum {

    @XmlEnumValue("airRaid")
    AIR_RAID("airRaid"),
    @XmlEnumValue("altercationOfVehicleOccupants")
    ALTERCATION_OF_VEHICLE_OCCUPANTS("altercationOfVehicleOccupants"),
    @XmlEnumValue("assault")
    ASSAULT("assault"),
    @XmlEnumValue("assetDestruction")
    ASSET_DESTRUCTION("assetDestruction"),
    @XmlEnumValue("attack")
    ATTACK("attack"),
    @XmlEnumValue("attackOnVehicle")
    ATTACK_ON_VEHICLE("attackOnVehicle"),
    @XmlEnumValue("blockadeOrBarrier")
    BLOCKADE_OR_BARRIER("blockadeOrBarrier"),
    @XmlEnumValue("bombAlert")
    BOMB_ALERT("bombAlert"),
    @XmlEnumValue("crowd")
    CROWD("crowd"),
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),
    @XmlEnumValue("evacuation")
    EVACUATION("evacuation"),
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),
    @XmlEnumValue("goSlowOperation")
    GO_SLOW_OPERATION("goSlowOperation"),
    @XmlEnumValue("gunfireOnRoadway")
    GUNFIRE_ON_ROADWAY("gunfireOnRoadway"),
    @XmlEnumValue("illVehicleOccupants")
    ILL_VEHICLE_OCCUPANTS("illVehicleOccupants"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),
    @XmlEnumValue("radioactiveLeakAlert")
    RADIOACTIVE_LEAK_ALERT("radioactiveLeakAlert"),
    @XmlEnumValue("riot")
    RIOT("riot"),
    @XmlEnumValue("sabotage")
    SABOTAGE("sabotage"),
    @XmlEnumValue("securityAlert")
    SECURITY_ALERT("securityAlert"),
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),
    @XmlEnumValue("strike")
    STRIKE("strike"),
    @XmlEnumValue("terroristIncident")
    TERRORIST_INCIDENT("terroristIncident"),
    @XmlEnumValue("theft")
    THEFT("theft"),
    @XmlEnumValue("toxicCloudAlert")
    TOXIC_CLOUD_ALERT("toxicCloudAlert"),
    @XmlEnumValue("unspecifiedAlert")
    UNSPECIFIED_ALERT("unspecifiedAlert"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DisturbanceActivityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisturbanceActivityTypeEnum fromValue(String v) {
        for (DisturbanceActivityTypeEnum c : DisturbanceActivityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
