//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für ConventionalModesOfOperationEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ConventionalModesOfOperationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="scheduled"/&gt;
 *     &lt;enumeration value="demandResponsive"/&gt;
 *     &lt;enumeration value="flexibleRoute"/&gt;
 *     &lt;enumeration value="flexibleArea"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="pooling"/&gt;
 *     &lt;enumeration value="replacement"/&gt;
 *     &lt;enumeration value="school"/&gt;
 *     &lt;enumeration value="pRM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ConventionalModesOfOperationEnumeration")
@XmlEnum
public enum ConventionalModesOfOperationEnumeration {

    /**
     * Regular MODE OF OPERATION for CONVENTIONAL MODE OF OPERATION. Based on SCHEDULED STOP POINTs and timetables.
     */
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),

    /**
     * Demand responsive services. General term when nothing else is known. Requires SCHEDULED STOP POINTs. The more taxi-like a demand responsive service becomes the more probable it is better to use
     * ALTERNATIVE MODE OF OPERATION.
     */
    @XmlEnumValue("demandResponsive")
    DEMAND_RESPONSIVE("demandResponsive"),

    /**
     * Specialisation of demand responsive MODE OF OPERATION. The service is still based on a ROUTE.
     */
    @XmlEnumValue("flexibleRoute")
    FLEXIBLE_ROUTE("flexibleRoute"),

    /**
     * Specialisation of demand responsive MODE OF OPERATION. The service is based on AREAs, but still SCHEDULED STOP POINTs are used. Sometimes the characteristics of a given demand responsive
     * service makes it mor of an ALTERNATIVE MODE OF OPERATION (e.g., pure area service). A conventional mode of operation is more indicated, when there is a limited list of stops within the area.
     */
    @XmlEnumValue("flexibleArea")
    FLEXIBLE_AREA("flexibleArea"),

    /**
     * If the service is provided as a form of shuttle.
     */
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),

    /**
     * In some cases, pooling is not an ALTERNATIVE MODE OF OPERATION, but is better served with a TimedLeg. Then this MODE OF OPERATION is to be used.
     */
    @XmlEnumValue("pooling")
    POOLING("pooling"),

    /**
     * The service is provided as a replacement of a SCHEDULED service.
     */
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement"),

    /**
     * MODE OF OPERATION that specifically states that it is school related. Specialisation of demand responsive or scheduled.
     */
    @XmlEnumValue("school")
    SCHOOL("school"),

    /**
     * If for a scheduled, conventional service a special additional vehicle is needed to provide for special PRM needs. This kind of MODE OF OPERATION is to be used.
     */
    @XmlEnumValue("pRM")
    P_RM("pRM");
    private final String value;

    ConventionalModesOfOperationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConventionalModesOfOperationEnumeration fromValue(String v) {
        for (ConventionalModesOfOperationEnumeration c : ConventionalModesOfOperationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
