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
 * <p>Java-Klasse für TaxiSubmodesOfTransportEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TaxiSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="communalTaxi"/&gt;
 *     &lt;enumeration value="charterTaxi"/&gt;
 *     &lt;enumeration value="waterTaxi"/&gt;
 *     &lt;enumeration value="railTaxi"/&gt;
 *     &lt;enumeration value="bikeTaxi"/&gt;
 *     &lt;enumeration value="blackCab"/&gt;
 *     &lt;enumeration value="miniCab"/&gt;
 *     &lt;enumeration value="allTaxiServices"/&gt;
 *     &lt;enumeration value="undefinedTaxiService"/&gt;
 *     &lt;enumeration value="pti11_0"/&gt;
 *     &lt;enumeration value="pti11_1"/&gt;
 *     &lt;enumeration value="pti11_2"/&gt;
 *     &lt;enumeration value="pti11_3"/&gt;
 *     &lt;enumeration value="pti11_4"/&gt;
 *     &lt;enumeration value="pti11_5"/&gt;
 *     &lt;enumeration value="pti11_6"/&gt;
 *     &lt;enumeration value="pti11_7"/&gt;
 *     &lt;enumeration value="pti11_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxiSubmodesOfTransportEnumeration")
@XmlEnum
public enum TaxiSubmodesOfTransportEnumeration {


    /**
     * Submode of transport is not known to the source system.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * (SIRI 2.1) - see also 'undefinedTaxiService'.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("communalTaxi")
    COMMUNAL_TAXI("communalTaxi"),

    /**
     * (SIRI 2.1)
     * 
     */
    @XmlEnumValue("charterTaxi")
    CHARTER_TAXI("charterTaxi"),
    @XmlEnumValue("waterTaxi")
    WATER_TAXI("waterTaxi"),
    @XmlEnumValue("railTaxi")
    RAIL_TAXI("railTaxi"),
    @XmlEnumValue("bikeTaxi")
    BIKE_TAXI("bikeTaxi"),
    @XmlEnumValue("blackCab")
    BLACK_CAB("blackCab"),
    @XmlEnumValue("miniCab")
    MINI_CAB("miniCab"),
    @XmlEnumValue("allTaxiServices")
    ALL_TAXI_SERVICES("allTaxiServices"),

    /**
     * Submode of transport is not supported in this list.
     * 
     */
    @XmlEnumValue("undefinedTaxiService")
    UNDEFINED_TAXI_SERVICE("undefinedTaxiService"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_0")
    PTI_11___0("pti11_0"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_1")
    PTI_11___1("pti11_1"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_2")
    PTI_11___2("pti11_2"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_3")
    PTI_11___3("pti11_3"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_4")
    PTI_11___4("pti11_4"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_5")
    PTI_11___5("pti11_5"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_6")
    PTI_11___6("pti11_6"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_7")
    PTI_11___7("pti11_7"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti11_255")
    PTI_11___255("pti11_255");
    private final String value;

    TaxiSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxiSubmodesOfTransportEnumeration fromValue(String v) {
        for (TaxiSubmodesOfTransportEnumeration c: TaxiSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
