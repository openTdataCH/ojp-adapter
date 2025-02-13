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
 * <p>Java-Klasse für FormationChangeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FormationChangeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="changedFormation"/&gt;
 *     &lt;enumeration value="reversedFormation"/&gt;
 *     &lt;enumeration value="missingVehicles"/&gt;
 *     &lt;enumeration value="extraVehicles"/&gt;
 *     &lt;enumeration value="missingTrainInCompoundTrain"/&gt;
 *     &lt;enumeration value="extraTrainInCompoundTrain"/&gt;
 *     &lt;enumeration value="missingFamilyCoach"/&gt;
 *     &lt;enumeration value="missingThroughCoach"/&gt;
 *     &lt;enumeration value="missingLowFloorCoach"/&gt;
 *     &lt;enumeration value="missingRestaurantCoach"/&gt;
 *     &lt;enumeration value="missingWheelchairSpaces"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "FormationChangeEnumeration")
@XmlEnum
public enum FormationChangeEnumeration {

    @XmlEnumValue("changedFormation")
    CHANGED_FORMATION("changedFormation"),
    @XmlEnumValue("reversedFormation")
    REVERSED_FORMATION("reversedFormation"),
    @XmlEnumValue("missingVehicles")
    MISSING_VEHICLES("missingVehicles"),
    @XmlEnumValue("extraVehicles")
    EXTRA_VEHICLES("extraVehicles"),
    @XmlEnumValue("missingTrainInCompoundTrain")
    MISSING_TRAIN_IN_COMPOUND_TRAIN("missingTrainInCompoundTrain"),
    @XmlEnumValue("extraTrainInCompoundTrain")
    EXTRA_TRAIN_IN_COMPOUND_TRAIN("extraTrainInCompoundTrain"),
    @XmlEnumValue("missingFamilyCoach")
    MISSING_FAMILY_COACH("missingFamilyCoach"),
    @XmlEnumValue("missingThroughCoach")
    MISSING_THROUGH_COACH("missingThroughCoach"),
    @XmlEnumValue("missingLowFloorCoach")
    MISSING_LOW_FLOOR_COACH("missingLowFloorCoach"),
    @XmlEnumValue("missingRestaurantCoach")
    MISSING_RESTAURANT_COACH("missingRestaurantCoach"),
    @XmlEnumValue("missingWheelchairSpaces")
    MISSING_WHEELCHAIR_SPACES("missingWheelchairSpaces");
    private final String value;

    FormationChangeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormationChangeEnumeration fromValue(String v) {
        for (FormationChangeEnumeration c : FormationChangeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
