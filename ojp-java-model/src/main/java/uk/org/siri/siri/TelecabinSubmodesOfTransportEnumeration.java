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
 * <p>Java-Klasse für TelecabinSubmodesOfTransportEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TelecabinSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="telecabin"/&gt;
 *     &lt;enumeration value="cableCar"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="chairLift"/&gt;
 *     &lt;enumeration value="dragLift"/&gt;
 *     &lt;enumeration value="telecabinLink"/&gt;
 *     &lt;enumeration value="scheduled"/&gt;
 *     &lt;enumeration value="unscheduled"/&gt;
 *     &lt;enumeration value="undefinedTelecabinService"/&gt;
 *     &lt;enumeration value="smallTelecabin"/&gt;
 *     &lt;enumeration value="eggLift"/&gt;
 *     &lt;enumeration value="mineralBuckets"/&gt;
 *     &lt;enumeration value="allTelecabinServices"/&gt;
 *     &lt;enumeration value="pti9_0"/&gt;
 *     &lt;enumeration value="pti9_1"/&gt;
 *     &lt;enumeration value="pti9_2"/&gt;
 *     &lt;enumeration value="pti9_3"/&gt;
 *     &lt;enumeration value="pti9_4"/&gt;
 *     &lt;enumeration value="pti9_5"/&gt;
 *     &lt;enumeration value="pti9_6"/&gt;
 *     &lt;enumeration value="pti9_7"/&gt;
 *     &lt;enumeration value="pti9_255"/&gt;
 *     &lt;enumeration value="loc14_0"/&gt;
 *     &lt;enumeration value="loc14_1"/&gt;
 *     &lt;enumeration value="loc14_3"/&gt;
 *     &lt;enumeration value="loc14_4"/&gt;
 *     &lt;enumeration value="loc14_52"/&gt;
 *     &lt;enumeration value="loc14_6"/&gt;
 *     &lt;enumeration value="loc14_7"/&gt;
 *     &lt;enumeration value="loc14_8"/&gt;
 *     &lt;enumeration value="loc14_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TelecabinSubmodesOfTransportEnumeration")
@XmlEnum
public enum TelecabinSubmodesOfTransportEnumeration {

    /**
     * TPEG Pts109_0 - submode of transport is not known to the source system.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Submode of transport is not supported in this list.
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("telecabin")
    TELECABIN("telecabin"),
    @XmlEnumValue("cableCar")
    CABLE_CAR("cableCar"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("chairLift")
    CHAIR_LIFT("chairLift"),
    @XmlEnumValue("dragLift")
    DRAG_LIFT("dragLift"),
    @XmlEnumValue("telecabinLink")
    TELECABIN_LINK("telecabinLink"),

    /**
     * TPEG Pts109_1 (SIRI 2.1)
     */
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),

    /**
     * TPEG Pts109_2 (SIRI 2.1)
     */
    @XmlEnumValue("unscheduled")
    UNSCHEDULED("unscheduled"),

    /**
     * TPEG Pts109_255 (SIRI 2.1) - see also 'undefined'.
     */
    @XmlEnumValue("undefinedTelecabinService")
    UNDEFINED_TELECABIN_SERVICE("undefinedTelecabinService"),
    @XmlEnumValue("smallTelecabin")
    SMALL_TELECABIN("smallTelecabin"),
    @XmlEnumValue("eggLift")
    EGG_LIFT("eggLift"),
    @XmlEnumValue("mineralBuckets")
    MINERAL_BUCKETS("mineralBuckets"),
    @XmlEnumValue("allTelecabinServices")
    ALL_TELECABIN_SERVICES("allTelecabinServices"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_0")
    PTI_9___0("pti9_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_1")
    PTI_9___1("pti9_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_2")
    PTI_9___2("pti9_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_3")
    PTI_9___3("pti9_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_4")
    PTI_9___4("pti9_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_5")
    PTI_9___5("pti9_5"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_6")
    PTI_9___6("pti9_6"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_7")
    PTI_9___7("pti9_7"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti9_255")
    PTI_9___255("pti9_255"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_0")
    LOC_14___0("loc14_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_1")
    LOC_14___1("loc14_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_3")
    LOC_14___3("loc14_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_4")
    LOC_14___4("loc14_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_52")
    LOC_14___52("loc14_52"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_6")
    LOC_14___6("loc14_6"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_7")
    LOC_14___7("loc14_7"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_8")
    LOC_14___8("loc14_8"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_255")
    LOC_14___255("loc14_255");
    private final String value;

    TelecabinSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelecabinSubmodesOfTransportEnumeration fromValue(String v) {
        for (TelecabinSubmodesOfTransportEnumeration c : TelecabinSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
