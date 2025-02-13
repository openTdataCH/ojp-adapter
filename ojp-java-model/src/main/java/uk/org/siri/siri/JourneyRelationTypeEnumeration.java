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
 * <p>Java-Klasse für JourneyRelationTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="JourneyRelationTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="ContinuationOfJourney"/&gt;
 *     &lt;enumeration value="ContinuedByJourney"/&gt;
 *     &lt;enumeration value="SplitsIntoJourneys"/&gt;
 *     &lt;enumeration value="ContinuationOfSplitJourney"/&gt;
 *     &lt;enumeration value="JoiningOfJourneys"/&gt;
 *     &lt;enumeration value="ContinuedByJoinedJourney"/&gt;
 *     &lt;enumeration value="ReplacementOfJourney"/&gt;
 *     &lt;enumeration value="ReplacedByJourney"/&gt;
 *     &lt;enumeration value="SupportOfJourney"/&gt;
 *     &lt;enumeration value="SupportedByJourney"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "JourneyRelationTypeEnumeration")
@XmlEnum
public enum JourneyRelationTypeEnumeration {

    /**
     * The journey is a continuation of the specified RelatedJourney at the stop point given in CallInfo. Passengers don't need to change vehicles. The new journey is not communicated as an
     * interchange.
     */
    @XmlEnumValue("ContinuationOfJourney")
    CONTINUATION_OF_JOURNEY("ContinuationOfJourney"),

    /**
     * The journey is continued by the specified RelatedJourney at the stop point given in CallInfo. Passengers don't need to change vehicles. The new journey is not communicated as an interchange.
     */
    @XmlEnumValue("ContinuedByJourney")
    CONTINUED_BY_JOURNEY("ContinuedByJourney"),

    /**
     * The journey splits into multiple RelatedJourneys at the stop point given in CallInfo.
     */
    @XmlEnumValue("SplitsIntoJourneys")
    SPLITS_INTO_JOURNEYS("SplitsIntoJourneys"),

    /**
     * The journey is a continuation of a single RelatedJourney splitting into multiple journeys at the stop point given in CallInfo.
     */
    @XmlEnumValue("ContinuationOfSplitJourney")
    CONTINUATION_OF_SPLIT_JOURNEY("ContinuationOfSplitJourney"),

    /**
     * The journey is the continuation of multiple RelatedJourneys joining together at the stop point given in CallInfo.
     */
    @XmlEnumValue("JoiningOfJourneys")
    JOINING_OF_JOURNEYS("JoiningOfJourneys"),

    /**
     * The journey is continued by a single RelatedJourney after joining other journeys at the stop point given in CallInfo.
     */
    @XmlEnumValue("ContinuedByJoinedJourney")
    CONTINUED_BY_JOINED_JOURNEY("ContinuedByJoinedJourney"),

    /**
     * The journey replaces one or more partially or fully cancelled RelatedJourneys during the JourneyPart defined or referenced in JourneyPartInfo.
     */
    @XmlEnumValue("ReplacementOfJourney")
    REPLACEMENT_OF_JOURNEY("ReplacementOfJourney"),

    /**
     * The partially or fully cancelled journey is replaced by one or more RelatedJourneys during the JourneyPart defined or referenced in JourneyPartInfo.
     */
    @XmlEnumValue("ReplacedByJourney")
    REPLACED_BY_JOURNEY("ReplacedByJourney"),

    /**
     * The journey partially or fully supports one or more RelatedJourneys during the JourneyPart defined or referenced in JourneyPartInfo.
     */
    @XmlEnumValue("SupportOfJourney")
    SUPPORT_OF_JOURNEY("SupportOfJourney"),

    /**
     * The journey is partially or fully supported by one or more RelatedJourneys during the JourneyPart defined or referenced in JourneyPartInfo.
     */
    @XmlEnumValue("SupportedByJourney")
    SUPPORTED_BY_JOURNEY("SupportedByJourney");
    private final String value;

    JourneyRelationTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JourneyRelationTypeEnumeration fromValue(String v) {
        for (JourneyRelationTypeEnumeration c : JourneyRelationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
