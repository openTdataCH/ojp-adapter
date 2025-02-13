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
 * <p>Java-Klasse für CarParkStatusEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CarParkStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="carParkClosed"/&gt;
 *     &lt;enumeration value="allCarParksFull"/&gt;
 *     &lt;enumeration value="carParkFacilityFaulty"/&gt;
 *     &lt;enumeration value="carParkFull"/&gt;
 *     &lt;enumeration value="carParkStatusUnknown"/&gt;
 *     &lt;enumeration value="enoughSpacesAvailable"/&gt;
 *     &lt;enumeration value="multiStoryCarParksFull"/&gt;
 *     &lt;enumeration value="noMoreParkingSpacesAvailable"/&gt;
 *     &lt;enumeration value="noParkAndRideInformation"/&gt;
 *     &lt;enumeration value="noParkingAllowed"/&gt;
 *     &lt;enumeration value="noParkingInformationAvailable"/&gt;
 *     &lt;enumeration value="normalParkingRestrictionsLifted"/&gt;
 *     &lt;enumeration value="onlyAFewSpacesAvailable"/&gt;
 *     &lt;enumeration value="parkAndRideServiceNotOperating"/&gt;
 *     &lt;enumeration value="parkAndRideServiceOperating"/&gt;
 *     &lt;enumeration value="specialParkingRestrictionsInForce"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "CarParkStatusEnum")
@XmlEnum
public enum CarParkStatusEnum {

    @XmlEnumValue("carParkClosed")
    CAR_PARK_CLOSED("carParkClosed"),
    @XmlEnumValue("allCarParksFull")
    ALL_CAR_PARKS_FULL("allCarParksFull"),
    @XmlEnumValue("carParkFacilityFaulty")
    CAR_PARK_FACILITY_FAULTY("carParkFacilityFaulty"),
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),
    @XmlEnumValue("carParkStatusUnknown")
    CAR_PARK_STATUS_UNKNOWN("carParkStatusUnknown"),
    @XmlEnumValue("enoughSpacesAvailable")
    ENOUGH_SPACES_AVAILABLE("enoughSpacesAvailable"),
    @XmlEnumValue("multiStoryCarParksFull")
    MULTI_STORY_CAR_PARKS_FULL("multiStoryCarParksFull"),
    @XmlEnumValue("noMoreParkingSpacesAvailable")
    NO_MORE_PARKING_SPACES_AVAILABLE("noMoreParkingSpacesAvailable"),
    @XmlEnumValue("noParkAndRideInformation")
    NO_PARK_AND_RIDE_INFORMATION("noParkAndRideInformation"),
    @XmlEnumValue("noParkingAllowed")
    NO_PARKING_ALLOWED("noParkingAllowed"),
    @XmlEnumValue("noParkingInformationAvailable")
    NO_PARKING_INFORMATION_AVAILABLE("noParkingInformationAvailable"),
    @XmlEnumValue("normalParkingRestrictionsLifted")
    NORMAL_PARKING_RESTRICTIONS_LIFTED("normalParkingRestrictionsLifted"),
    @XmlEnumValue("onlyAFewSpacesAvailable")
    ONLY_A_FEW_SPACES_AVAILABLE("onlyAFewSpacesAvailable"),
    @XmlEnumValue("parkAndRideServiceNotOperating")
    PARK_AND_RIDE_SERVICE_NOT_OPERATING("parkAndRideServiceNotOperating"),
    @XmlEnumValue("parkAndRideServiceOperating")
    PARK_AND_RIDE_SERVICE_OPERATING("parkAndRideServiceOperating"),
    @XmlEnumValue("specialParkingRestrictionsInForce")
    SPECIAL_PARKING_RESTRICTIONS_IN_FORCE("specialParkingRestrictionsInForce");
    private final String value;

    CarParkStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarParkStatusEnum fromValue(String v) {
        for (CarParkStatusEnum c : CarParkStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
