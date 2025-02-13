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
 * <p>Java-Klasse für OptimisationMethodEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="OptimisationMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fastest"/&gt;
 *     &lt;enumeration value="minChanges"/&gt;
 *     &lt;enumeration value="leastWalking"/&gt;
 *     &lt;enumeration value="leastCost"/&gt;
 *     &lt;enumeration value="leastDistance"/&gt;
 *     &lt;enumeration value="earliestArrival"/&gt;
 *     &lt;enumeration value="latestDeparture"/&gt;
 *     &lt;enumeration value="earliestArrivalAndLatestDeparture"/&gt;
 *     &lt;enumeration value="minNonLevelEntrances"/&gt;
 *     &lt;enumeration value="minStairs"/&gt;
 *     &lt;enumeration value="bestForVisualImpairment"/&gt;
 *     &lt;enumeration value="bestForAuditoryImpairment"/&gt;
 *     &lt;enumeration value="environmentalSafety"/&gt;
 *     &lt;enumeration value="extraSafe"/&gt;
 *     &lt;enumeration value="extraReliable"/&gt;
 *     &lt;enumeration value="scenic"/&gt;
 *     &lt;enumeration value="quietTravel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "OptimisationMethodEnumeration")
@XmlEnum
public enum OptimisationMethodEnumeration {

    /**
     * Shortest duration somewhere in the future. This may present a shorter trip than the next earliest arrival (with latest departure). Expected strategy.
     */
    @XmlEnumValue("fastest")
    FASTEST("fastest"),

    /**
     * Minimise the number of interchanges as the first criterion. Expected strategy.
     */
    @XmlEnumValue("minChanges")
    MIN_CHANGES("minChanges"),

    /**
     * Shortest walking distance in meters, summed over all legs.
     */
    @XmlEnumValue("leastWalking")
    LEAST_WALKING("leastWalking"),

    /**
     * Cheapest fare, considering the applicable reductions. Might not be based on actual cost, but an estimation. Expected strategy.
     */
    @XmlEnumValue("leastCost")
    LEAST_COST("leastCost"),

    /**
     * Least distance in metres. Mostly used for ALTERNATIVE MODE OF OPERATION and for ItModesToCover.
     */
    @XmlEnumValue("leastDistance")
    LEAST_DISTANCE("leastDistance"),

    /**
     * Earliest possible arrival time respecting the time constraints (forward search).
     */
    @XmlEnumValue("earliestArrival")
    EARLIEST_ARRIVAL("earliestArrival"),

    /**
     * Latest departure time for a given arrival time (backward search).
     */
    @XmlEnumValue("latestDeparture")
    LATEST_DEPARTURE("latestDeparture"),

    /**
     * Combines earliestArrival and latestDeparture, allowing to compress the departure time (forward-backward-forward search).
     */
    @XmlEnumValue("earliestArrivalAndLatestDeparture")
    EARLIEST_ARRIVAL_AND_LATEST_DEPARTURE("earliestArrivalAndLatestDeparture"),

    /**
     * The user wants to minimize non-level entrances on the trip. this is useful for PRM who still can use some non-level entrances.
     */
    @XmlEnumValue("minNonLevelEntrances")
    MIN_NON_LEVEL_ENTRANCES("minNonLevelEntrances"),

    /**
     * The user wants to minimize stairs and steps on the trip. This is useful for PRM who still can use some steps/stairs.
     */
    @XmlEnumValue("minStairs")
    MIN_STAIRS("minStairs"),

    /**
     * The user wants to avoid transfers without tactile guidance, as well as platforms and vehicles without auditory signals.
     */
    @XmlEnumValue("bestForVisualImpairment")
    BEST_FOR_VISUAL_IMPAIRMENT("bestForVisualImpairment"),

    /**
     * The user wants to avoid transfers without guidance for people with auditory impairment, as well as platforms and vehicles without visual signs.
     */
    @XmlEnumValue("bestForAuditoryImpairment")
    BEST_FOR_AUDITORY_IMPAIRMENT("bestForAuditoryImpairment"),

    /**
     * If set, favour "green" modes/lines such as bike sharing and (electric) trains, avoid or restrict modes/lines known for higher CO2 emissions such as (conventional) taxi, ride-hailing or coach.
     */
    @XmlEnumValue("environmentalSafety")
    ENVIRONMENTAL_SAFETY("environmentalSafety"),

    /**
     * High level of safety (referring to crime, hazards or prone to accidents). If used, certain modes, lines or zones/districts known for lower safety, i.e. higher risk of accidents and crime, may
     * be avoided, others may be preferred. This may depend on the actual, local or time of day situation. E.g. bike or scooter may be considered unsafe in some cities/districts while safe in others.
     */
    @XmlEnumValue("extraSafe")
    EXTRA_SAFE("extraSafe"),

    /**
     * Low probability of delays, cancellations etc. If used, modes known for their (un)reliability may be avoided/preferred, and extra time added for transfers. This may depend on the actual, local
     * or time of day situation, based on punctuality statics, traffic jam statistics or rush hours. E.g. taxis in a given city might be known to be unreliable during at 8-10 and 16-19 hours,
     * otherwise reliable.
     */
    @XmlEnumValue("extraReliable")
    EXTRA_RELIABLE("extraReliable"),

    /**
     * Scenic (or touristic) travel. Different by modes or by the surrounding.
     */
    @XmlEnumValue("scenic")
    SCENIC("scenic"),

    /**
     * E.g. first class or quiet compartments preferred. Journeys that are with low occupancy.
     */
    @XmlEnumValue("quietTravel")
    QUIET_TRAVEL("quietTravel");
    private final String value;

    OptimisationMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptimisationMethodEnumeration fromValue(String v) {
        for (OptimisationMethodEnumeration c : OptimisationMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
