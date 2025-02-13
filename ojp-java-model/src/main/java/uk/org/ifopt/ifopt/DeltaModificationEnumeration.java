//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für DeltaModificationEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DeltaModificationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="new"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *     &lt;enumeration value="revise"/&gt;
 *     &lt;enumeration value="delta"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "DeltaModificationEnumeration")
@XmlEnum
public enum DeltaModificationEnumeration {

    /**
     * This is a definition of a new entity.
     */
    @XmlEnumValue("new")
    NEW("new"),

    /**
     * This is a deletion of an existing entity.
     */
    @XmlEnumValue("delete")
    DELETE("delete"),

    /**
     * This is a revision to an existing entity. All values are replaced.
     */
    @XmlEnumValue("revise")
    REVISE("revise"),

    /**
     * This is a change to an existing enity. Only those values expliciitly supplied will be changed.
     */
    @XmlEnumValue("delta")
    DELTA("delta");
    private final String value;

    DeltaModificationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeltaModificationEnumeration fromValue(String v) {
        for (DeltaModificationEnumeration c : DeltaModificationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
