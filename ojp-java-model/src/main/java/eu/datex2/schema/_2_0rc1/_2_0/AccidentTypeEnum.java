//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für AccidentTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccidentTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accident"/&gt;
 *     &lt;enumeration value="accidentInvolvingBicycles"/&gt;
 *     &lt;enumeration value="accidentInvolvingBuses"/&gt;
 *     &lt;enumeration value="accidentInvolvingHazardousMaterials"/&gt;
 *     &lt;enumeration value="accidentInvolvingHeavyLorries"/&gt;
 *     &lt;enumeration value="accidentInvolvingMassTransitVehicle"/&gt;
 *     &lt;enumeration value="accidentInvolvingMopeds"/&gt;
 *     &lt;enumeration value="accidentInvolvingMotorcycles"/&gt;
 *     &lt;enumeration value="accidentInvolvingRadioactiveMaterial"/&gt;
 *     &lt;enumeration value="accidentInvolvingTrain"/&gt;
 *     &lt;enumeration value="chemicalSpillageAccident"/&gt;
 *     &lt;enumeration value="collision"/&gt;
 *     &lt;enumeration value="collisionWithAnimal"/&gt;
 *     &lt;enumeration value="collisionWithObstruction"/&gt;
 *     &lt;enumeration value="collisionWithPerson"/&gt;
 *     &lt;enumeration value="earlierAccident"/&gt;
 *     &lt;enumeration value="fuelSpillageAccident"/&gt;
 *     &lt;enumeration value="headOnCollision"/&gt;
 *     &lt;enumeration value="headOnOrSideCollision"/&gt;
 *     &lt;enumeration value="jackknifedArticulatedLorry"/&gt;
 *     &lt;enumeration value="jackknifedCaravan"/&gt;
 *     &lt;enumeration value="jackknifedTrailer"/&gt;
 *     &lt;enumeration value="multipleVehicleCollision"/&gt;
 *     &lt;enumeration value="multivehicleAccident"/&gt;
 *     &lt;enumeration value="oilSpillageAccident"/&gt;
 *     &lt;enumeration value="overturnedHeavyLorry"/&gt;
 *     &lt;enumeration value="overturnedTrailer"/&gt;
 *     &lt;enumeration value="overturnedVehicle"/&gt;
 *     &lt;enumeration value="rearCollision"/&gt;
 *     &lt;enumeration value="secondaryAccident"/&gt;
 *     &lt;enumeration value="seriousAccident"/&gt;
 *     &lt;enumeration value="sideCollision"/&gt;
 *     &lt;enumeration value="vehicleOffRoad"/&gt;
 *     &lt;enumeration value="vehicleSpunAround"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AccidentTypeEnum")
@XmlEnum
public enum AccidentTypeEnum {

    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("accidentInvolvingBicycles")
    ACCIDENT_INVOLVING_BICYCLES("accidentInvolvingBicycles"),
    @XmlEnumValue("accidentInvolvingBuses")
    ACCIDENT_INVOLVING_BUSES("accidentInvolvingBuses"),
    @XmlEnumValue("accidentInvolvingHazardousMaterials")
    ACCIDENT_INVOLVING_HAZARDOUS_MATERIALS("accidentInvolvingHazardousMaterials"),
    @XmlEnumValue("accidentInvolvingHeavyLorries")
    ACCIDENT_INVOLVING_HEAVY_LORRIES("accidentInvolvingHeavyLorries"),
    @XmlEnumValue("accidentInvolvingMassTransitVehicle")
    ACCIDENT_INVOLVING_MASS_TRANSIT_VEHICLE("accidentInvolvingMassTransitVehicle"),
    @XmlEnumValue("accidentInvolvingMopeds")
    ACCIDENT_INVOLVING_MOPEDS("accidentInvolvingMopeds"),
    @XmlEnumValue("accidentInvolvingMotorcycles")
    ACCIDENT_INVOLVING_MOTORCYCLES("accidentInvolvingMotorcycles"),
    @XmlEnumValue("accidentInvolvingRadioactiveMaterial")
    ACCIDENT_INVOLVING_RADIOACTIVE_MATERIAL("accidentInvolvingRadioactiveMaterial"),
    @XmlEnumValue("accidentInvolvingTrain")
    ACCIDENT_INVOLVING_TRAIN("accidentInvolvingTrain"),
    @XmlEnumValue("chemicalSpillageAccident")
    CHEMICAL_SPILLAGE_ACCIDENT("chemicalSpillageAccident"),
    @XmlEnumValue("collision")
    COLLISION("collision"),
    @XmlEnumValue("collisionWithAnimal")
    COLLISION_WITH_ANIMAL("collisionWithAnimal"),
    @XmlEnumValue("collisionWithObstruction")
    COLLISION_WITH_OBSTRUCTION("collisionWithObstruction"),
    @XmlEnumValue("collisionWithPerson")
    COLLISION_WITH_PERSON("collisionWithPerson"),
    @XmlEnumValue("earlierAccident")
    EARLIER_ACCIDENT("earlierAccident"),
    @XmlEnumValue("fuelSpillageAccident")
    FUEL_SPILLAGE_ACCIDENT("fuelSpillageAccident"),
    @XmlEnumValue("headOnCollision")
    HEAD_ON_COLLISION("headOnCollision"),
    @XmlEnumValue("headOnOrSideCollision")
    HEAD_ON_OR_SIDE_COLLISION("headOnOrSideCollision"),
    @XmlEnumValue("jackknifedArticulatedLorry")
    JACKKNIFED_ARTICULATED_LORRY("jackknifedArticulatedLorry"),
    @XmlEnumValue("jackknifedCaravan")
    JACKKNIFED_CARAVAN("jackknifedCaravan"),
    @XmlEnumValue("jackknifedTrailer")
    JACKKNIFED_TRAILER("jackknifedTrailer"),
    @XmlEnumValue("multipleVehicleCollision")
    MULTIPLE_VEHICLE_COLLISION("multipleVehicleCollision"),
    @XmlEnumValue("multivehicleAccident")
    MULTIVEHICLE_ACCIDENT("multivehicleAccident"),
    @XmlEnumValue("oilSpillageAccident")
    OIL_SPILLAGE_ACCIDENT("oilSpillageAccident"),
    @XmlEnumValue("overturnedHeavyLorry")
    OVERTURNED_HEAVY_LORRY("overturnedHeavyLorry"),
    @XmlEnumValue("overturnedTrailer")
    OVERTURNED_TRAILER("overturnedTrailer"),
    @XmlEnumValue("overturnedVehicle")
    OVERTURNED_VEHICLE("overturnedVehicle"),
    @XmlEnumValue("rearCollision")
    REAR_COLLISION("rearCollision"),
    @XmlEnumValue("secondaryAccident")
    SECONDARY_ACCIDENT("secondaryAccident"),
    @XmlEnumValue("seriousAccident")
    SERIOUS_ACCIDENT("seriousAccident"),
    @XmlEnumValue("sideCollision")
    SIDE_COLLISION("sideCollision"),
    @XmlEnumValue("vehicleOffRoad")
    VEHICLE_OFF_ROAD("vehicleOffRoad"),
    @XmlEnumValue("vehicleSpunAround")
    VEHICLE_SPUN_AROUND("vehicleSpunAround"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccidentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccidentTypeEnum fromValue(String v) {
        for (AccidentTypeEnum c : AccidentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
