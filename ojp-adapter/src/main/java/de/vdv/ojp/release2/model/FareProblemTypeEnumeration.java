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
 * <p>Java-Klasse für FareProblemTypeEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FareProblemTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FARE_OUTOFAREA"/&gt;
 *     &lt;enumeration value="FARE_JOURNEYNOTPERMITTED"/&gt;
 *     &lt;enumeration value="FARE_ADDITIONALCHARGES"/&gt;
 *     &lt;enumeration value="FARE_ADDITIONALTICKETS"/&gt;
 *     &lt;enumeration value="FARE_ROUTENOTFEASIBLE"/&gt;
 *     &lt;enumeration value="FARE_ALREADYCOVERED"/&gt;
 *     &lt;enumeration value="FARE_DATEOUTOFRANGE"/&gt;
 *     &lt;enumeration value="FARE_STOPPOINTUNKNOWN"/&gt;
 *     &lt;enumeration value="FARE_OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareProblemTypeEnumeration")
@XmlEnum
public enum FareProblemTypeEnumeration {


    /**
     * The trip planning has found a route that leaves the area of the fare authority.
     * 
     */
    @XmlEnumValue("FARE_OUTOFAREA")
    FARE___OUTOFAREA("FARE_OUTOFAREA"),

    /**
     * The trip planning result suggests a service which is not permitted by the fare authority.
     * 
     */
    @XmlEnumValue("FARE_JOURNEYNOTPERMITTED")
    FARE___JOURNEYNOTPERMITTED("FARE_JOURNEYNOTPERMITTED"),

    /**
     * Passengers may be charged additional fees (e.g.: for road tolls or seat reservation).
     * 
     */
    @XmlEnumValue("FARE_ADDITIONALCHARGES")
    FARE___ADDITIONALCHARGES("FARE_ADDITIONALCHARGES"),

    /**
     * Additional tickets may be necessary because only parts of the passenger trip could be covered.
     * 
     */
    @XmlEnumValue("FARE_ADDITIONALTICKETS")
    FARE___ADDITIONALTICKETS("FARE_ADDITIONALTICKETS"),

    /**
     * Fare calculation is not possible because the suggested trip is not in compliance with the fare regulations, e.g., because of round trips, LEGs that go forth and return or exceed the maximal total trip duration.
     * 
     */
    @XmlEnumValue("FARE_ROUTENOTFEASIBLE")
    FARE___ROUTENOTFEASIBLE("FARE_ROUTENOTFEASIBLE"),

    /**
     * The ticket that has been specified in the request is valid for the suggested trip (or parts of it as defined by LegRange).
     * 
     */
    @XmlEnumValue("FARE_ALREADYCOVERED")
    FARE___ALREADYCOVERED("FARE_ALREADYCOVERED"),

    /**
     * The fare request cannot be processed because there is no information available for the requested date.
     * 
     */
    @XmlEnumValue("FARE_DATEOUTOFRANGE")
    FARE___DATEOUTOFRANGE("FARE_DATEOUTOFRANGE"),

    /**
     * The fare request cannot be processed because the requested stop is unknown.
     * 
     */
    @XmlEnumValue("FARE_STOPPOINTUNKNOWN")
    FARE___STOPPOINTUNKNOWN("FARE_STOPPOINTUNKNOWN"),

    /**
     * A problem has occurred that does not have a specific problem type.
     * 
     */
    @XmlEnumValue("FARE_OTHER")
    FARE___OTHER("FARE_OTHER");
    private final String value;

    FareProblemTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareProblemTypeEnumeration fromValue(String v) {
        for (FareProblemTypeEnumeration c: FareProblemTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
