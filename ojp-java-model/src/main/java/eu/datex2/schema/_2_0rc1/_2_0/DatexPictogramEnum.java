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
 * <p>Java-Klasse für DatexPictogramEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DatexPictogramEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="advisorySpeed"/&gt;
 *     &lt;enumeration value="blankVoid"/&gt;
 *     &lt;enumeration value="chainsOrSnowTyresRecommended"/&gt;
 *     &lt;enumeration value="crossWind"/&gt;
 *     &lt;enumeration value="drivingOfVehiclesLessThanXMetresApartProhibited"/&gt;
 *     &lt;enumeration value="endOfAdvisorySpeed"/&gt;
 *     &lt;enumeration value="endOfProhibitionOfOvertaking"/&gt;
 *     &lt;enumeration value="endOfProhibitionOfOvertakingForGoodsVehicles"/&gt;
 *     &lt;enumeration value="endOfSpeedLimit"/&gt;
 *     &lt;enumeration value="exitClosed"/&gt;
 *     &lt;enumeration value="fog"/&gt;
 *     &lt;enumeration value="keepASafeDistance"/&gt;
 *     &lt;enumeration value="maximumSpeedLimit"/&gt;
 *     &lt;enumeration value="noEntry"/&gt;
 *     &lt;enumeration value="noEntryForGoodsVehicles"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesExceedingXTonnesLadenMass"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesCarryingDangerousGoods"/&gt;
 *     &lt;enumeration value="otherDanger"/&gt;
 *     &lt;enumeration value="overtakingByGoodsVehiclesProhibited"/&gt;
 *     &lt;enumeration value="overtakingProhibited"/&gt;
 *     &lt;enumeration value="roadClosedAhead"/&gt;
 *     &lt;enumeration value="roadworks"/&gt;
 *     &lt;enumeration value="slipperyRoad"/&gt;
 *     &lt;enumeration value="snow"/&gt;
 *     &lt;enumeration value="snowTyresCompulsory"/&gt;
 *     &lt;enumeration value="trafficCongestion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "DatexPictogramEnum")
@XmlEnum
public enum DatexPictogramEnum {

    @XmlEnumValue("advisorySpeed")
    ADVISORY_SPEED("advisorySpeed"),
    @XmlEnumValue("blankVoid")
    BLANK_VOID("blankVoid"),
    @XmlEnumValue("chainsOrSnowTyresRecommended")
    CHAINS_OR_SNOW_TYRES_RECOMMENDED("chainsOrSnowTyresRecommended"),
    @XmlEnumValue("crossWind")
    CROSS_WIND("crossWind"),
    @XmlEnumValue("drivingOfVehiclesLessThanXMetresApartProhibited")
    DRIVING_OF_VEHICLES_LESS_THAN_X_METRES_APART_PROHIBITED("drivingOfVehiclesLessThanXMetresApartProhibited"),
    @XmlEnumValue("endOfAdvisorySpeed")
    END_OF_ADVISORY_SPEED("endOfAdvisorySpeed"),
    @XmlEnumValue("endOfProhibitionOfOvertaking")
    END_OF_PROHIBITION_OF_OVERTAKING("endOfProhibitionOfOvertaking"),
    @XmlEnumValue("endOfProhibitionOfOvertakingForGoodsVehicles")
    END_OF_PROHIBITION_OF_OVERTAKING_FOR_GOODS_VEHICLES("endOfProhibitionOfOvertakingForGoodsVehicles"),
    @XmlEnumValue("endOfSpeedLimit")
    END_OF_SPEED_LIMIT("endOfSpeedLimit"),
    @XmlEnumValue("exitClosed")
    EXIT_CLOSED("exitClosed"),
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("keepASafeDistance")
    KEEP_A_SAFE_DISTANCE("keepASafeDistance"),
    @XmlEnumValue("maximumSpeedLimit")
    MAXIMUM_SPEED_LIMIT("maximumSpeedLimit"),
    @XmlEnumValue("noEntry")
    NO_ENTRY("noEntry"),
    @XmlEnumValue("noEntryForGoodsVehicles")
    NO_ENTRY_FOR_GOODS_VEHICLES("noEntryForGoodsVehicles"),
    @XmlEnumValue("noEntryForVehiclesExceedingXTonnesLadenMass")
    NO_ENTRY_FOR_VEHICLES_EXCEEDING_X_TONNES_LADEN_MASS("noEntryForVehiclesExceedingXTonnesLadenMass"),
    @XmlEnumValue("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle")
    NO_ENTRY_FOR_VEHICLES_HAVING_A_MASS_EXCEEDING_X_TONNES_ON_ONE_AXLE("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_HEIGHT_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_LENGTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesCarryingDangerousGoods")
    NO_ENTRY_FOR_VEHICLES_CARRYING_DANGEROUS_GOODS("noEntryForVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("otherDanger")
    OTHER_DANGER("otherDanger"),
    @XmlEnumValue("overtakingByGoodsVehiclesProhibited")
    OVERTAKING_BY_GOODS_VEHICLES_PROHIBITED("overtakingByGoodsVehiclesProhibited"),
    @XmlEnumValue("overtakingProhibited")
    OVERTAKING_PROHIBITED("overtakingProhibited"),
    @XmlEnumValue("roadClosedAhead")
    ROAD_CLOSED_AHEAD("roadClosedAhead"),
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),
    @XmlEnumValue("snow")
    SNOW("snow"),
    @XmlEnumValue("snowTyresCompulsory")
    SNOW_TYRES_COMPULSORY("snowTyresCompulsory"),
    @XmlEnumValue("trafficCongestion")
    TRAFFIC_CONGESTION("trafficCongestion");
    private final String value;

    DatexPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatexPictogramEnum fromValue(String v) {
        for (DatexPictogramEnum c : DatexPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
