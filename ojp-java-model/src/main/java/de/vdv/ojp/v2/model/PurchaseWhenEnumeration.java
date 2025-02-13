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
 * <p>Java-Klasse für PurchaseWhenEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PurchaseWhenEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="advanceOnly"/&gt;
 *     &lt;enumeration value="untilPreviousDay"/&gt;
 *     &lt;enumeration value="dayOfTravelOnly"/&gt;
 *     &lt;enumeration value="advanceAndDayOfTravel"/&gt;
 *     &lt;enumeration value="timeOfTravelOnly"/&gt;
 *     &lt;enumeration value="subscriptionChargeMoment"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PurchaseWhenEnumeration")
@XmlEnum
public enum PurchaseWhenEnumeration {

    @XmlEnumValue("advanceOnly")
    ADVANCE_ONLY("advanceOnly"),
    @XmlEnumValue("untilPreviousDay")
    UNTIL_PREVIOUS_DAY("untilPreviousDay"),
    @XmlEnumValue("dayOfTravelOnly")
    DAY_OF_TRAVEL_ONLY("dayOfTravelOnly"),
    @XmlEnumValue("advanceAndDayOfTravel")
    ADVANCE_AND_DAY_OF_TRAVEL("advanceAndDayOfTravel"),
    @XmlEnumValue("timeOfTravelOnly")
    TIME_OF_TRAVEL_ONLY("timeOfTravelOnly"),
    @XmlEnumValue("subscriptionChargeMoment")
    SUBSCRIPTION_CHARGE_MOMENT("subscriptionChargeMoment"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PurchaseWhenEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseWhenEnumeration fromValue(String v) {
        for (PurchaseWhenEnumeration c : PurchaseWhenEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
