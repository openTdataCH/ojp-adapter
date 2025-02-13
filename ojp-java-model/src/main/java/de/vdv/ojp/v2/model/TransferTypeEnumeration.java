//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für TransferTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TransferTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="walk"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="protectedConnection"/&gt;
 *     &lt;enumeration value="guaranteedConnection"/&gt;
 *     &lt;enumeration value="remainInVehicle"/&gt;
 *     &lt;enumeration value="changeWithinVehicle"/&gt;
 *     &lt;enumeration value="checkIn"/&gt;
 *     &lt;enumeration value="checkOut"/&gt;
 *     &lt;enumeration value="parkAndRide"/&gt;
 *     &lt;enumeration value="bikeAndRide"/&gt;
 *     &lt;enumeration value="carHire"/&gt;
 *     &lt;enumeration value="bikeHire"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TransferTypeEnumeration")
@XmlEnum
public enum TransferTypeEnumeration {

    /**
     * The "normal" TransferType. Indicates that the traveler walks to the next LEG.
     */
    @XmlEnumValue("walk")
    WALK("walk"),

    /**
     * Indicates that a shuttle service is used for the TRANSFER LEG. E.g. between gates in an airport.
     */
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),

    /**
     * Indicates that the transfer is done by taxi. This type should be avoided and the taxi leg should be modelled as a ContinuousLeg.
     */
    @XmlEnumValue("taxi")
    TAXI("taxi"),

    /**
     * Indicates that the connection to the next leg is specially monitored and usually kept (depending on agreements between the operators). Usually, it is used in combination with walk.
     */
    @XmlEnumValue("protectedConnection")
    PROTECTED_CONNECTION("protectedConnection"),

    /**
     * The connection is guaranteed. This doesn't apply very often, but e.g., a bus has to bring  people from the last train to a different destination. Then it will not depart before the train has
     * arrived and the passengers have changed. In some cases, guaranteedConnection might be used with less strictness.
     */
    @XmlEnumValue("guaranteedConnection")
    GUARANTEED_CONNECTION("guaranteedConnection"),

    /**
     * The next leg is in the same VEHICLE and there is no need to change it.
     */
    @XmlEnumValue("remainInVehicle")
    REMAIN_IN_VEHICLE("remainInVehicle"),

    /**
     * If trains are split, it may be necessary to change to the correct part of the train. Usage of changeWithinVehicle is preferred over remainInVehicle if it is unclear whether the traveller is in
     * the correct part of the train.
     */
    @XmlEnumValue("changeWithinVehicle")
    CHANGE_WITHIN_VEHICLE("changeWithinVehicle"),

    /**
     * Means that a checkin operation is necessary. This usually results in a longer time that can't be justified by the length of the transfer leg.
     */
    @XmlEnumValue("checkIn")
    CHECK_IN("checkIn"),

    /**
     * Means that a checkout operation is necessary. This usually results in a longer time that can't be justified by the length of the transfer leg
     */
    @XmlEnumValue("checkOut")
    CHECK_OUT("checkOut"),

    /**
     * This does not model the car ride. But parking the car and getting to the stop may take way longer e.g., in a big parking garage. This is a special type of checkIn or checkOut.
     */
    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),

    /**
     * In the transfer leg additional time may be needed to get or stow a bike (e.g., because the BIKE PARKING is at a special place). this can be seen as a special type of checkIn or checkOut.
     */
    @XmlEnumValue("bikeAndRide")
    BIKE_AND_RIDE("bikeAndRide"),

    /**
     * Time for a car hire is needed. This will make the transfer leg to take longer than expected. Can be seen as a special case of checkIn.
     */
    @XmlEnumValue("carHire")
    CAR_HIRE("carHire"),

    /**
     * Time for a bike hire is needed. This will make the transfer leg to take longer than expected. Can be seen as a special case of checkIn.
     */
    @XmlEnumValue("bikeHire")
    BIKE_HIRE("bikeHire"),

    /**
     * Only to be used when no other type applies.
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TransferTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferTypeEnumeration fromValue(String v) {
        for (TransferTypeEnumeration c : TransferTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
