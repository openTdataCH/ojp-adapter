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
 * <p>Java-Klasse für SelfDriveSubmodesOfTransportEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="SelfDriveSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="hireCar"/&gt;
 *     &lt;enumeration value="hireVan"/&gt;
 *     &lt;enumeration value="hireMotorbike"/&gt;
 *     &lt;enumeration value="hireCycle"/&gt;
 *     &lt;enumeration value="allHireVehicles"/&gt;
 *     &lt;enumeration value="undefinedHireVehicle"/&gt;
 *     &lt;enumeration value="pti12_0"/&gt;
 *     &lt;enumeration value="pti12_1"/&gt;
 *     &lt;enumeration value="pti12_2"/&gt;
 *     &lt;enumeration value="pti12_3"/&gt;
 *     &lt;enumeration value="pti12_4"/&gt;
 *     &lt;enumeration value="pti12_5"/&gt;
 *     &lt;enumeration value="pti12_255"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "SelfDriveSubmodesOfTransportEnumeration")
@XmlEnum
public enum SelfDriveSubmodesOfTransportEnumeration {

    /**
     * Submode of transport is not known to the source system.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * (SIRI 2.1) - see also 'undefinedHireVehicle'.
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("hireCar")
    HIRE_CAR("hireCar"),
    @XmlEnumValue("hireVan")
    HIRE_VAN("hireVan"),
    @XmlEnumValue("hireMotorbike")
    HIRE_MOTORBIKE("hireMotorbike"),
    @XmlEnumValue("hireCycle")
    HIRE_CYCLE("hireCycle"),
    @XmlEnumValue("allHireVehicles")
    ALL_HIRE_VEHICLES("allHireVehicles"),

    /**
     * Submode of transport is not supported in this list.
     */
    @XmlEnumValue("undefinedHireVehicle")
    UNDEFINED_HIRE_VEHICLE("undefinedHireVehicle"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti12_0")
    PTI_12___0("pti12_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti12_1")
    PTI_12___1("pti12_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti12_2")
    PTI_12___2("pti12_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti12_3")
    PTI_12___3("pti12_3"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti12_4")
    PTI_12___4("pti12_4"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti12_5")
    PTI_12___5("pti12_5"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti12_255")
    PTI_12___255("pti12_255");
    private final String value;

    SelfDriveSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelfDriveSubmodesOfTransportEnumeration fromValue(String v) {
        for (SelfDriveSubmodesOfTransportEnumeration c : SelfDriveSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
