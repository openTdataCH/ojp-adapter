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
 * <p>Java-Klasse für BookableServiceItemTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BookableServiceItemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="wheelchair"/&gt;
 *     &lt;enumeration value="motorisedWheelchair"/&gt;
 *     &lt;enumeration value="foldableWheelchair"/&gt;
 *     &lt;enumeration value="walkingFrame"/&gt;
 *     &lt;enumeration value="pram"/&gt;
 *     &lt;enumeration value="heavyLuggage"/&gt;
 *     &lt;enumeration value="childSeatTakenAlong"/&gt;
 *     &lt;enumeration value="childSeatSupplied"/&gt;
 *     &lt;enumeration value="babyCarrierTakenAlong"/&gt;
 *     &lt;enumeration value="babyCarrierSupplied"/&gt;
 *     &lt;enumeration value="seatBoosterSupplied"/&gt;
 *     &lt;enumeration value="bicycle"/&gt;
 *     &lt;enumeration value="guideDog"/&gt;
 *     &lt;enumeration value="dog"/&gt;
 *     &lt;enumeration value="boardingAssistance"/&gt;
 *     &lt;enumeration value="alightingAssistance"/&gt;
 *     &lt;enumeration value="onboardAssistance"/&gt;
 *     &lt;enumeration value="unassistedMinorAssistance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "BookableServiceItemTypeEnumeration")
@XmlEnum
public enum BookableServiceItemTypeEnumeration {

    /**
     * Space for a wheelchair.
     */
    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair"),

    /**
     * Space for a motorised wheelchair.
     */
    @XmlEnumValue("motorisedWheelchair")
    MOTORISED_WHEELCHAIR("motorisedWheelchair"),

    /**
     * Space for storing a foldable wheelchair.
     */
    @XmlEnumValue("foldableWheelchair")
    FOLDABLE_WHEELCHAIR("foldableWheelchair"),

    /**
     * Place suitable for a person with a walking frame.
     */
    @XmlEnumValue("walkingFrame")
    WALKING_FRAME("walkingFrame"),

    /**
     * Space for a pram or pushchair.
     */
    @XmlEnumValue("pram")
    PRAM("pram"),

    /**
     * Space for storing heavy luggage.
     */
    @XmlEnumValue("heavyLuggage")
    HEAVY_LUGGAGE("heavyLuggage"),

    /**
     * Seat suitable for attaching a child seat taken along by the passengers.
     */
    @XmlEnumValue("childSeatTakenAlong")
    CHILD_SEAT_TAKEN_ALONG("childSeatTakenAlong"),

    /**
     * Child seat provided in the vehicle.
     */
    @XmlEnumValue("childSeatSupplied")
    CHILD_SEAT_SUPPLIED("childSeatSupplied"),

    /**
     * Seat suitable for attaching a baby carrier taken along by the passengers.
     */
    @XmlEnumValue("babyCarrierTakenAlong")
    BABY_CARRIER_TAKEN_ALONG("babyCarrierTakenAlong"),

    /**
     * Baby carrier provided in the vehicle.
     */
    @XmlEnumValue("babyCarrierSupplied")
    BABY_CARRIER_SUPPLIED("babyCarrierSupplied"),

    /**
     * Seat booster provided in the vehicle.
     */
    @XmlEnumValue("seatBoosterSupplied")
    SEAT_BOOSTER_SUPPLIED("seatBoosterSupplied"),

    /**
     * Space for a bicycle.
     */
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),

    /**
     * Place suitable when accompanied by a guide dog.
     */
    @XmlEnumValue("guideDog")
    GUIDE_DOG("guideDog"),

    /**
     * Place suitable when accompanied by a dog.
     */
    @XmlEnumValue("dog")
    DOG("dog"),

    /**
     * Assistance for boarding.
     */
    @XmlEnumValue("boardingAssistance")
    BOARDING_ASSISTANCE("boardingAssistance"),

    /**
     * Assistance for alighting.
     */
    @XmlEnumValue("alightingAssistance")
    ALIGHTING_ASSISTANCE("alightingAssistance"),

    /**
     * Assistance available on board, during the journey.
     */
    @XmlEnumValue("onboardAssistance")
    ONBOARD_ASSISTANCE("onboardAssistance"),

    /**
     * Assistance for a minor travelling alone.
     */
    @XmlEnumValue("unassistedMinorAssistance")
    UNASSISTED_MINOR_ASSISTANCE("unassistedMinorAssistance");
    private final String value;

    BookableServiceItemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookableServiceItemTypeEnumeration fromValue(String v) {
        for (BookableServiceItemTypeEnumeration c : BookableServiceItemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
