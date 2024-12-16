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
 * <p>Java-Klasse für FeasibilityEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FeasibilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allAccessFeaturesAvailable"/&gt;
 *     &lt;enumeration value="accessFeatureNotAvailable"/&gt;
 *     &lt;enumeration value="accessFeaturePartiallyAvailable"/&gt;
 *     &lt;enumeration value="accessFeatureWithUnknownAvailability"/&gt;
 *     &lt;enumeration value="seeSituations"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeasibilityEnumeration")
@XmlEnum
public enum FeasibilityEnumeration {

    @XmlEnumValue("allAccessFeaturesAvailable")
    ALL_ACCESS_FEATURES_AVAILABLE("allAccessFeaturesAvailable"),
    @XmlEnumValue("accessFeatureNotAvailable")
    ACCESS_FEATURE_NOT_AVAILABLE("accessFeatureNotAvailable"),
    @XmlEnumValue("accessFeaturePartiallyAvailable")
    ACCESS_FEATURE_PARTIALLY_AVAILABLE("accessFeaturePartiallyAvailable"),
    @XmlEnumValue("accessFeatureWithUnknownAvailability")
    ACCESS_FEATURE_WITH_UNKNOWN_AVAILABILITY("accessFeatureWithUnknownAvailability"),
    @XmlEnumValue("seeSituations")
    SEE_SITUATIONS("seeSituations");
    private final String value;

    FeasibilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeasibilityEnumeration fromValue(String v) {
        for (FeasibilityEnumeration c: FeasibilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
