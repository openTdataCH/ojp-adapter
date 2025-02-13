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
 * <p>Java-Klasse für FunicularSubmodesOfTransportEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FunicularSubmodesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="funicular"/&gt;
 *     &lt;enumeration value="streetCableCar"/&gt;
 *     &lt;enumeration value="allFunicularServices"/&gt;
 *     &lt;enumeration value="undefinedFunicular"/&gt;
 *     &lt;enumeration value="pti10_0"/&gt;
 *     &lt;enumeration value="pti10_1"/&gt;
 *     &lt;enumeration value="pti10_2"/&gt;
 *     &lt;enumeration value="pti10_255"/&gt;
 *     &lt;enumeration value="loc14_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "FunicularSubmodesOfTransportEnumeration")
@XmlEnum
public enum FunicularSubmodesOfTransportEnumeration {

    /**
     * Submode of transport is not known to the source system.
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),

    /**
     * (SIRI 2.1)
     */
    @XmlEnumValue("streetCableCar")
    STREET_CABLE_CAR("streetCableCar"),
    @XmlEnumValue("allFunicularServices")
    ALL_FUNICULAR_SERVICES("allFunicularServices"),

    /**
     * Submode of transport is not supported in this list.
     */
    @XmlEnumValue("undefinedFunicular")
    UNDEFINED_FUNICULAR("undefinedFunicular"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti10_0")
    PTI_10___0("pti10_0"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti10_1")
    PTI_10___1("pti10_1"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti10_2")
    PTI_10___2("pti10_2"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("pti10_255")
    PTI_10___255("pti10_255"),

    /**
     * DEPRECATED since SIRI 2.1
     */
    @XmlEnumValue("loc14_2")
    LOC_14___2("loc14_2");
    private final String value;

    FunicularSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunicularSubmodesOfTransportEnumeration fromValue(String v) {
        for (FunicularSubmodesOfTransportEnumeration c : FunicularSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
