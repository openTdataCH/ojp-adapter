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
 * <p>Java-Klasse für AccessFacilityEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccessFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="travelator"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="palletAccess_lowFloor"/&gt;
 *     &lt;enumeration value="validator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AccessFacilityEnumeration")
@XmlEnum
public enum AccessFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("palletAccess_lowFloor")
    PALLET_ACCESS___LOW_FLOOR("palletAccess_lowFloor"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    AccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFacilityEnumeration fromValue(String v) {
        for (AccessFacilityEnumeration c : AccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
