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
 * <p>Java-Klasse für AlternativeModesOfOperationEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AlternativeModesOfOperationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sharing"/&gt;
 *     &lt;enumeration value="stationLessSharing"/&gt;
 *     &lt;enumeration value="stationBasedSharing"/&gt;
 *     &lt;enumeration value="singleStationBasedSharing"/&gt;
 *     &lt;enumeration value="multipleStationBasedSharing"/&gt;
 *     &lt;enumeration value="peerToPeerSharing"/&gt;
 *     &lt;enumeration value="parkAndRideSharing"/&gt;
 *     &lt;enumeration value="sharingClubSharing"/&gt;
 *     &lt;enumeration value="prM"/&gt;
 *     &lt;enumeration value="pooling"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="dynamicPooling"/&gt;
 *     &lt;enumeration value="longDistancePooling"/&gt;
 *     &lt;enumeration value="commuterPooling"/&gt;
 *     &lt;enumeration value="parkAndRidePooling"/&gt;
 *     &lt;enumeration value="chauffeured"/&gt;
 *     &lt;enumeration value="demandResponsive"/&gt;
 *     &lt;enumeration value="flexibleArea"/&gt;
 *     &lt;enumeration value="companyShuttle"/&gt;
 *     &lt;enumeration value="hotelShuttle"/&gt;
 *     &lt;enumeration value="hire"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AlternativeModesOfOperationEnumeration")
@XmlEnum
public enum AlternativeModesOfOperationEnumeration {

    /**
     * Using a sharing as an ALTERNATIVE MODE OF OPERATION. Only if one of the specialisations doesn't apply.
     */
    @XmlEnumValue("sharing")
    SHARING("sharing"),

    /**
     * ALTERNATIVE MODE OF OPERATION. station less sharing.
     */
    @XmlEnumValue("stationLessSharing")
    STATION_LESS_SHARING("stationLessSharing"),

    /**
     * ALTERNATIVE MODE OF OPERATION. Based on fix stations (VEHICLE MEETING POINT).
     */
    @XmlEnumValue("stationBasedSharing")
    STATION_BASED_SHARING("stationBasedSharing"),

    /**
     * ALTERNATIVE MODE OF OPERATION. Based on single fix station (VEHICLE MEETING POINT).
     */
    @XmlEnumValue("singleStationBasedSharing")
    SINGLE_STATION_BASED_SHARING("singleStationBasedSharing"),

    /**
     * ALTERNATIVE MODE OF OPERATION. Based on multiple fix stations (VEHICLE MEETING POINT).
     */
    @XmlEnumValue("multipleStationBasedSharing")
    MULTIPLE_STATION_BASED_SHARING("multipleStationBasedSharing"),

    /**
     * ALTERNATIVE MODE OF OPERATION. Specialised sharing between people.
     */
    @XmlEnumValue("peerToPeerSharing")
    PEER_TO_PEER_SHARING("peerToPeerSharing"),

    /**
     * ALTERNATIVE MODE OF OPERATION. Specialised sharing in the context of a park and ride situation.
     */
    @XmlEnumValue("parkAndRideSharing")
    PARK_AND_RIDE_SHARING("parkAndRideSharing"),

    /**
     * ALTERNATIVE MODE OF OPERATION. Sharing organised as a club.
     */
    @XmlEnumValue("sharingClubSharing")
    SHARING_CLUB_SHARING("sharingClubSharing"),

    /**
     * ALTERNATIVE MODE OF OPERATION. In relation to a conventional SERVICE JOURNEY, but when pick-up and drop-off are not associated with SCHEDULED STOP POINTs.
     */
    @XmlEnumValue("prM")
    PR_M("prM"),

    /**
     * General pooling ALTERNATIVE MODE OF OPERATION. Only use this enum when no specialisation applies. In some cases, where the pooling is very "scheduled" use the pooling in
     * ConventionalModeOfOperation.
     */
    @XmlEnumValue("pooling")
    POOLING("pooling"),

    /**
     * Taxi MODE OF OPERATION.
     */
    @XmlEnumValue("taxi")
    TAXI("taxi"),

    /**
     * Shuttle MODE OF OPERATION, when not associated with SCHEDULED STOP POINTs.
     */
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),

    /**
     * ALTERNATIVE MODE OF OPERATION. A pooling that is dynamic, usually local, and not long-term planned.
     */
    @XmlEnumValue("dynamicPooling")
    DYNAMIC_POOLING("dynamicPooling"),

    /**
     * ALTERNATIVE MODE OF OPERATION. A pooling for long distances, mostly for a SINGLE JOURNEY.
     */
    @XmlEnumValue("longDistancePooling")
    LONG_DISTANCE_POOLING("longDistancePooling"),

    /**
     * ALTERNATIVE MODE OF OPERATION. A pooling to go to workplaces and related things. Usually, in a regular interval with the same people.
     */
    @XmlEnumValue("commuterPooling")
    COMMUTER_POOLING("commuterPooling"),

    /**
     * ALTERNATIVE MODE OF OPERATION. A pooling in relation to park and ride.
     */
    @XmlEnumValue("parkAndRidePooling")
    PARK_AND_RIDE_POOLING("parkAndRidePooling"),

    /**
     * ALTERNATIVE MODE OF OPERATION for SINGLE JOURNEY with a paid driver. Often more than a single SINGLE JOURNEY.
     */
    @XmlEnumValue("chauffeured")
    CHAUFFEURED("chauffeured"),

    /**
     * ALTERNATIVE MODE OF OPERATION demand responsive is used when there is no SCHEDULED STOP POINTs involved and the timetable component is weak. Otherwise, use the demandResponsive in
     * ConventionalModeOfOperation.
     */
    @XmlEnumValue("demandResponsive")
    DEMAND_RESPONSIVE("demandResponsive"),

    /**
     * Specialisation of the demand responsive ALTERNATIVE MODE OF OPERATION for AREA related offers. Otherwise, use the demandResponsive in ConventionalModeOfOperation.
     */
    @XmlEnumValue("flexibleArea")
    FLEXIBLE_AREA("flexibleArea"),

    /**
     * ALTERNATIVE MODE OF OPERATION. To specifically state that it is a company related. Specialisation of demand responsive.
     */
    @XmlEnumValue("companyShuttle")
    COMPANY_SHUTTLE("companyShuttle"),

    /**
     * ALTERNATIVE MODE OF OPERATION. To specifically state that it is hotel related. Specialisation of demand responsive.
     */
    @XmlEnumValue("hotelShuttle")
    HOTEL_SHUTTLE("hotelShuttle"),

    /**
     * Using a hired VEHICLE.
     */
    @XmlEnumValue("hire")
    HIRE("hire"),

    /**
     * Only use this value when no other applies.
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AlternativeModesOfOperationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlternativeModesOfOperationEnumeration fromValue(String v) {
        for (AlternativeModesOfOperationEnumeration c : AlternativeModesOfOperationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
