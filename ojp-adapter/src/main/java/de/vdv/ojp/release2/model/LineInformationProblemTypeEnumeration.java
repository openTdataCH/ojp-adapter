//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LineInformationProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LineInformationProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LINEINFORMATION_LINEUNKNOWN"/&gt;
 *     &lt;enumeration value="LINEINFORMATION_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineInformationProblemTypeEnumeration")
@XmlEnum
public enum LineInformationProblemTypeEnumeration {


    /**
     * The requested LINE is unknown.
     * 
     */
    @XmlEnumValue("LINEINFORMATION_LINEUNKNOWN")
    LINEINFORMATION___LINEUNKNOWN("LINEINFORMATION_LINEUNKNOWN"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("LINEINFORMATION_OTHER")
    LINEINFORMATION___OTHER("LINEINFORMATION_OTHER");
    private final String value;

    LineInformationProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineInformationProblemTypeEnumeration fromValue(String v) {
        for (LineInformationProblemTypeEnumeration c: LineInformationProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
