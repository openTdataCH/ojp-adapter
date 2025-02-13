//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.acsb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für PyschosensoryNeedEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PyschosensoryNeedEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="visualImpairment"/&gt;
 *     &lt;enumeration value="auditoryImpairment"/&gt;
 *     &lt;enumeration value="cognitiveInputImpairment"/&gt;
 *     &lt;enumeration value="averseToLifts"/&gt;
 *     &lt;enumeration value="averseToEscalators"/&gt;
 *     &lt;enumeration value="averseToConfinedSpaces"/&gt;
 *     &lt;enumeration value="averseToCrowds"/&gt;
 *     &lt;enumeration value="otherPsychosensoryNeed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PyschosensoryNeedEnumeration")
@XmlEnum
public enum PyschosensoryNeedEnumeration {

    @XmlEnumValue("visualImpairment")
    VISUAL_IMPAIRMENT("visualImpairment"),
    @XmlEnumValue("auditoryImpairment")
    AUDITORY_IMPAIRMENT("auditoryImpairment"),
    @XmlEnumValue("cognitiveInputImpairment")
    COGNITIVE_INPUT_IMPAIRMENT("cognitiveInputImpairment"),
    @XmlEnumValue("averseToLifts")
    AVERSE_TO_LIFTS("averseToLifts"),
    @XmlEnumValue("averseToEscalators")
    AVERSE_TO_ESCALATORS("averseToEscalators"),
    @XmlEnumValue("averseToConfinedSpaces")
    AVERSE_TO_CONFINED_SPACES("averseToConfinedSpaces"),
    @XmlEnumValue("averseToCrowds")
    AVERSE_TO_CROWDS("averseToCrowds"),
    @XmlEnumValue("otherPsychosensoryNeed")
    OTHER_PSYCHOSENSORY_NEED("otherPsychosensoryNeed");
    private final String value;

    PyschosensoryNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PyschosensoryNeedEnumeration fromValue(String v) {
        for (PyschosensoryNeedEnumeration c : PyschosensoryNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
