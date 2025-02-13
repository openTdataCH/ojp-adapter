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
 * <p>Java-Klasse für StopPointTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="StopPointTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="platformNumber"/&gt;
 *     &lt;enumeration value="terminalGate"/&gt;
 *     &lt;enumeration value="ferryBerth"/&gt;
 *     &lt;enumeration value="harbourPier"/&gt;
 *     &lt;enumeration value="landingStage"/&gt;
 *     &lt;enumeration value="busStop"/&gt;
 *     &lt;enumeration value="undefinedStopPointType"/&gt;
 *     &lt;enumeration value="undefinedBookingInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "StopPointTypeEnumeration")
@XmlEnum
public enum StopPointTypeEnumeration {

    /**
     * TPEG Pts17_0, unknown
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * TPEG Pts17_1, platform number
     */
    @XmlEnumValue("platformNumber")
    PLATFORM_NUMBER("platformNumber"),

    /**
     * TPEG Pts17_2, terminal gate
     */
    @XmlEnumValue("terminalGate")
    TERMINAL_GATE("terminalGate"),

    /**
     * TPEG Pts17_3, ferry berth
     */
    @XmlEnumValue("ferryBerth")
    FERRY_BERTH("ferryBerth"),

    /**
     * TPEG Pts17_4, harbour pier
     */
    @XmlEnumValue("harbourPier")
    HARBOUR_PIER("harbourPier"),

    /**
     * TPEG Pts17_5, unknown
     */
    @XmlEnumValue("landingStage")
    LANDING_STAGE("landingStage"),

    /**
     * TPEG Pts17_6, bus stop
     */
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),

    /**
     * TPEG Pts17_255, undefined service delivery point type
     */
    @XmlEnumValue("undefinedStopPointType")
    UNDEFINED_STOP_POINT_TYPE("undefinedStopPointType"),

    /**
     * DEPRECATED since SIRI 2.1 - use undefinedStopPointType
     */
    @XmlEnumValue("undefinedBookingInformation")
    UNDEFINED_BOOKING_INFORMATION("undefinedBookingInformation");
    private final String value;

    StopPointTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPointTypeEnumeration fromValue(String v) {
        for (StopPointTypeEnumeration c : StopPointTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
