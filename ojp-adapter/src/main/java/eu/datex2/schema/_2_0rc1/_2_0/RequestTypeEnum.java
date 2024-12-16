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
 * <p>Java-Klasse für RequestTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RequestTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="catalogue"/&gt;
 *     &lt;enumeration value="filter"/&gt;
 *     &lt;enumeration value="requestData"/&gt;
 *     &lt;enumeration value="requestHistoricalData"/&gt;
 *     &lt;enumeration value="subscription"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestTypeEnum")
@XmlEnum
public enum RequestTypeEnum {

    @XmlEnumValue("catalogue")
    CATALOGUE("catalogue"),
    @XmlEnumValue("filter")
    FILTER("filter"),
    @XmlEnumValue("requestData")
    REQUEST_DATA("requestData"),
    @XmlEnumValue("requestHistoricalData")
    REQUEST_HISTORICAL_DATA("requestHistoricalData"),
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription");
    private final String value;

    RequestTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestTypeEnum fromValue(String v) {
        for (RequestTypeEnum c: RequestTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
