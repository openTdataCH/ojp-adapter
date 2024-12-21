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
 * <p>Java-Klasse für AssistanceFacilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AssistanceFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="police"/&gt;
 *     &lt;enumeration value="firstAid"/&gt;
 *     &lt;enumeration value="sosPoint"/&gt;
 *     &lt;enumeration value="specificAssistance"/&gt;
 *     &lt;enumeration value="unaccompaniedMinorAssistance"/&gt;
 *     &lt;enumeration value="boardingAssistance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssistanceFacilityEnumeration")
@XmlEnum
public enum AssistanceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("police")
    POLICE("police"),
    @XmlEnumValue("firstAid")
    FIRST_AID("firstAid"),
    @XmlEnumValue("sosPoint")
    SOS_POINT("sosPoint"),
    @XmlEnumValue("specificAssistance")
    SPECIFIC_ASSISTANCE("specificAssistance"),
    @XmlEnumValue("unaccompaniedMinorAssistance")
    UNACCOMPANIED_MINOR_ASSISTANCE("unaccompaniedMinorAssistance"),
    @XmlEnumValue("boardingAssistance")
    BOARDING_ASSISTANCE("boardingAssistance");
    private final String value;

    AssistanceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssistanceFacilityEnumeration fromValue(String v) {
        for (AssistanceFacilityEnumeration c: AssistanceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
