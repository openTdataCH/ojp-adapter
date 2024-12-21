//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RetailFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RetailFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="food"/&gt;
 *     &lt;enumeration value="newspaperTobacco"/&gt;
 *     &lt;enumeration value="recreationTravel"/&gt;
 *     &lt;enumeration value="hygieneHealthBeauty"/&gt;
 *     &lt;enumeration value="fashionAccessories"/&gt;
 *     &lt;enumeration value="bankFinanceInsurance"/&gt;
 *     &lt;enumeration value="cashMachine"/&gt;
 *     &lt;enumeration value="currencyExchange"/&gt;
 *     &lt;enumeration value="tourismService"/&gt;
 *     &lt;enumeration value="photoBooth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailFacilityEnumeration")
@XmlEnum
public enum RetailFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("food")
    FOOD("food"),
    @XmlEnumValue("newspaperTobacco")
    NEWSPAPER_TOBACCO("newspaperTobacco"),
    @XmlEnumValue("recreationTravel")
    RECREATION_TRAVEL("recreationTravel"),
    @XmlEnumValue("hygieneHealthBeauty")
    HYGIENE_HEALTH_BEAUTY("hygieneHealthBeauty"),
    @XmlEnumValue("fashionAccessories")
    FASHION_ACCESSORIES("fashionAccessories"),
    @XmlEnumValue("bankFinanceInsurance")
    BANK_FINANCE_INSURANCE("bankFinanceInsurance"),
    @XmlEnumValue("cashMachine")
    CASH_MACHINE("cashMachine"),
    @XmlEnumValue("currencyExchange")
    CURRENCY_EXCHANGE("currencyExchange"),
    @XmlEnumValue("tourismService")
    TOURISM_SERVICE("tourismService"),
    @XmlEnumValue("photoBooth")
    PHOTO_BOOTH("photoBooth");
    private final String value;

    RetailFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetailFacilityEnumeration fromValue(String v) {
        for (RetailFacilityEnumeration c: RetailFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
