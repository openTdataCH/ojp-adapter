//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PurchaseMomentEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PurchaseMomentEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="onReservation"/&gt;
 *     &lt;enumeration value="inAdvance"/&gt;
 *     &lt;enumeration value="inAdvanceOnly"/&gt;
 *     &lt;enumeration value="beforeBoarding"/&gt;
 *     &lt;enumeration value="beforeBoardingOnly"/&gt;
 *     &lt;enumeration value="onBoarding"/&gt;
 *     &lt;enumeration value="onBoardingOnly"/&gt;
 *     &lt;enumeration value="afterBoarding"/&gt;
 *     &lt;enumeration value="onCheckIn"/&gt;
 *     &lt;enumeration value="onCheckOut"/&gt;
 *     &lt;enumeration value="subscriptionOnly"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseMomentEnumeration")
@XmlEnum
public enum PurchaseMomentEnumeration {


    /**
     * Purchase must be made on reservation in advance of travel.
     * 
     */
    @XmlEnumValue("onReservation")
    ON_RESERVATION("onReservation"),

    /**
     * Purchase can be made in advance of travel.
     * 
     */
    @XmlEnumValue("inAdvance")
    IN_ADVANCE("inAdvance"),

    /**
     * Purchase can only be made in advance of travel (e.g., for season ticket or advance ticket).
     * 
     */
    @XmlEnumValue("inAdvanceOnly")
    IN_ADVANCE_ONLY("inAdvanceOnly"),

    /**
     * Purchase can be made before boarding transport vehicle.
     * 
     */
    @XmlEnumValue("beforeBoarding")
    BEFORE_BOARDING("beforeBoarding"),

    /**
     * Purchase must be made before boarding transport vehicle.
     * 
     */
    @XmlEnumValue("beforeBoardingOnly")
    BEFORE_BOARDING_ONLY("beforeBoardingOnly"),

    /**
     * Purchase can be made when boarding the transport vehicle.
     * 
     */
    @XmlEnumValue("onBoarding")
    ON_BOARDING("onBoarding"),

    /**
     * Purchase can only be made when boarding the transport vehicle.
     * 
     */
    @XmlEnumValue("onBoardingOnly")
    ON_BOARDING_ONLY("onBoardingOnly"),

    /**
     * Purchase can be made after boarding transport vehicle.
     * 
     */
    @XmlEnumValue("afterBoarding")
    AFTER_BOARDING("afterBoarding"),

    /**
     * Purchase can be made on entering transport system.
     * 
     */
    @XmlEnumValue("onCheckIn")
    ON_CHECK_IN("onCheckIn"),

    /**
     * Purchase can be made on leaving transport system.
     * 
     */
    @XmlEnumValue("onCheckOut")
    ON_CHECK_OUT("onCheckOut"),

    /**
     * Purchase can only be made on subscription.
     * 
     */
    @XmlEnumValue("subscriptionOnly")
    SUBSCRIPTION_ONLY("subscriptionOnly"),

    /**
     * Other moment of Purchase.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PurchaseMomentEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseMomentEnumeration fromValue(String v) {
        for (PurchaseMomentEnumeration c: PurchaseMomentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
