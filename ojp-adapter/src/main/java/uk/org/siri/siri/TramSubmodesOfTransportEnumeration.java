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
 * <p>Java-Klasse für TramSubmodesOfTransportEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TramSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="cityTram"/&gt;
 *     &lt;enumeration value="localTram"/&gt;
 *     &lt;enumeration value="regionalTram"/&gt;
 *     &lt;enumeration value="sightseeingTram"/&gt;
 *     &lt;enumeration value="shuttleTram"/&gt;
 *     &lt;enumeration value="trainTram"/&gt;
 *     &lt;enumeration value="tramService"/&gt;
 *     &lt;enumeration value="cityTramService"/&gt;
 *     &lt;enumeration value="regionalTramService"/&gt;
 *     &lt;enumeration value="sightseeingTramService"/&gt;
 *     &lt;enumeration value="nightTramService"/&gt;
 *     &lt;enumeration value="shuttleTramService"/&gt;
 *     &lt;enumeration value="undefinedUrbanRailwayService"/&gt;
 *     &lt;enumeration value="localTramService"/&gt;
 *     &lt;enumeration value="undefinedTramService"/&gt;
 *     &lt;enumeration value="allTramServices"/&gt;
 *     &lt;enumeration value="pti6_0"/&gt;
 *     &lt;enumeration value="pti6_1"/&gt;
 *     &lt;enumeration value="pti6_2"/&gt;
 *     &lt;enumeration value="pti6_3"/&gt;
 *     &lt;enumeration value="pti6_4"/&gt;
 *     &lt;enumeration value="pti6_5"/&gt;
 *     &lt;enumeration value="pti6_6"/&gt;
 *     &lt;enumeration value="pti6_255"/&gt;
 *     &lt;enumeration value="loc12_0"/&gt;
 *     &lt;enumeration value="loc12_1"/&gt;
 *     &lt;enumeration value="loc12_2"/&gt;
 *     &lt;enumeration value="loc12_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TramSubmodesOfTransportEnumeration")
@XmlEnum
public enum TramSubmodesOfTransportEnumeration {


    /**
     * TPEG Pts104_0 - submode of transport is not known to the source system.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * (SIRI 2.1) - see also 'undefinedTramService'.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("cityTram")
    CITY_TRAM("cityTram"),

    /**
     * (SIRI 2.1) - see also 'localTramService'.
     * 
     */
    @XmlEnumValue("localTram")
    LOCAL_TRAM("localTram"),
    @XmlEnumValue("regionalTram")
    REGIONAL_TRAM("regionalTram"),
    @XmlEnumValue("sightseeingTram")
    SIGHTSEEING_TRAM("sightseeingTram"),
    @XmlEnumValue("shuttleTram")
    SHUTTLE_TRAM("shuttleTram"),

    /**
     * (SIRI 2.1)
     * 
     */
    @XmlEnumValue("trainTram")
    TRAIN_TRAM("trainTram"),

    /**
     * TPEG Pts104_4 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("tramService")
    TRAM_SERVICE("tramService"),

    /**
     * TPEG Pts104_5 (SIRI 2.1) - see also 'cityTram'.
     * 
     */
    @XmlEnumValue("cityTramService")
    CITY_TRAM_SERVICE("cityTramService"),

    /**
     * TPEG Pts104_6 (SIRI 2.1) - see also 'regionalTram'.
     * 
     */
    @XmlEnumValue("regionalTramService")
    REGIONAL_TRAM_SERVICE("regionalTramService"),

    /**
     * TPEG Pts104_7 (SIRI 2.1) - see also 'sightseeingTram'.
     * 
     */
    @XmlEnumValue("sightseeingTramService")
    SIGHTSEEING_TRAM_SERVICE("sightseeingTramService"),

    /**
     * TPEG Pts104_8 (SIRI 2.1)
     * 
     */
    @XmlEnumValue("nightTramService")
    NIGHT_TRAM_SERVICE("nightTramService"),

    /**
     * TPEG Pts104_9 (SIRI 2.1) - see also 'shuttleTram'.
     * 
     */
    @XmlEnumValue("shuttleTramService")
    SHUTTLE_TRAM_SERVICE("shuttleTramService"),

    /**
     * TPEG Pts104_255 (SIRI 2.1) - see also 'undefined'.
     * 
     */
    @XmlEnumValue("undefinedUrbanRailwayService")
    UNDEFINED_URBAN_RAILWAY_SERVICE("undefinedUrbanRailwayService"),
    @XmlEnumValue("localTramService")
    LOCAL_TRAM_SERVICE("localTramService"),

    /**
     * Submode of transport is not supported in this list.
     * 
     */
    @XmlEnumValue("undefinedTramService")
    UNDEFINED_TRAM_SERVICE("undefinedTramService"),
    @XmlEnumValue("allTramServices")
    ALL_TRAM_SERVICES("allTramServices"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti6_0")
    PTI_6___0("pti6_0"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti6_1")
    PTI_6___1("pti6_1"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti6_2")
    PTI_6___2("pti6_2"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti6_3")
    PTI_6___3("pti6_3"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti6_4")
    PTI_6___4("pti6_4"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti6_5")
    PTI_6___5("pti6_5"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti6_6")
    PTI_6___6("pti6_6"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("pti6_255")
    PTI_6___255("pti6_255"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc12_0")
    LOC_12___0("loc12_0"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc12_1")
    LOC_12___1("loc12_1"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc12_2")
    LOC_12___2("loc12_2"),

    /**
     * DEPRECATED since SIRI 2.1
     * 
     */
    @XmlEnumValue("loc12_255")
    LOC_12___255("loc12_255");
    private final String value;

    TramSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TramSubmodesOfTransportEnumeration fromValue(String v) {
        for (TramSubmodesOfTransportEnumeration c: TramSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
