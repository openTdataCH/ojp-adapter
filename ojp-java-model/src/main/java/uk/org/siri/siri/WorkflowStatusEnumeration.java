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
 * <p>Java-Klasse für WorkflowStatusEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="WorkflowStatusEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="draft"/&gt;
 *     &lt;enumeration value="pendingApproval"/&gt;
 *     &lt;enumeration value="approvedDraft"/&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="published"/&gt;
 *     &lt;enumeration value="closing"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "WorkflowStatusEnumeration")
@XmlEnum
public enum WorkflowStatusEnumeration {

    @XmlEnumValue("draft")
    DRAFT("draft"),
    @XmlEnumValue("pendingApproval")
    PENDING_APPROVAL("pendingApproval"),
    @XmlEnumValue("approvedDraft")
    APPROVED_DRAFT("approvedDraft"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("published")
    PUBLISHED("published"),
    @XmlEnumValue("closing")
    CLOSING("closing"),
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    WorkflowStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowStatusEnumeration fromValue(String v) {
        for (WorkflowStatusEnumeration c : WorkflowStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
