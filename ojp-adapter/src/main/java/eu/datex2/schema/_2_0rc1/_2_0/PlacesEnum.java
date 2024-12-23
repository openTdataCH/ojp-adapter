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
 * <p>Java-Klasse für PlacesEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PlacesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aroundBendsInTheRoad"/&gt;
 *     &lt;enumeration value="atCustomsPosts"/&gt;
 *     &lt;enumeration value="atHighAltitudes"/&gt;
 *     &lt;enumeration value="atTollPlazas"/&gt;
 *     &lt;enumeration value="inGalleries"/&gt;
 *     &lt;enumeration value="inLowLyingAreas"/&gt;
 *     &lt;enumeration value="inRoadworksAreas"/&gt;
 *     &lt;enumeration value="inShadedAreas"/&gt;
 *     &lt;enumeration value="inTheCityCentre"/&gt;
 *     &lt;enumeration value="inTheInnerCityAreas"/&gt;
 *     &lt;enumeration value="inTunnels"/&gt;
 *     &lt;enumeration value="onBridges"/&gt;
 *     &lt;enumeration value="onElevatedSections"/&gt;
 *     &lt;enumeration value="onEnteringOrLeavingTunnels"/&gt;
 *     &lt;enumeration value="onEnteringTheCountry"/&gt;
 *     &lt;enumeration value="onFlyovers"/&gt;
 *     &lt;enumeration value="onLeavingTheCountry"/&gt;
 *     &lt;enumeration value="onMotorways"/&gt;
 *     &lt;enumeration value="onNonMotorways"/&gt;
 *     &lt;enumeration value="onRoundabouts"/&gt;
 *     &lt;enumeration value="onSlipRoads"/&gt;
 *     &lt;enumeration value="onUndergroundSections"/&gt;
 *     &lt;enumeration value="onUnderpasses"/&gt;
 *     &lt;enumeration value="overTheCrestOfHills"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlacesEnum")
@XmlEnum
public enum PlacesEnum {

    @XmlEnumValue("aroundBendsInTheRoad")
    AROUND_BENDS_IN_THE_ROAD("aroundBendsInTheRoad"),
    @XmlEnumValue("atCustomsPosts")
    AT_CUSTOMS_POSTS("atCustomsPosts"),
    @XmlEnumValue("atHighAltitudes")
    AT_HIGH_ALTITUDES("atHighAltitudes"),
    @XmlEnumValue("atTollPlazas")
    AT_TOLL_PLAZAS("atTollPlazas"),
    @XmlEnumValue("inGalleries")
    IN_GALLERIES("inGalleries"),
    @XmlEnumValue("inLowLyingAreas")
    IN_LOW_LYING_AREAS("inLowLyingAreas"),
    @XmlEnumValue("inRoadworksAreas")
    IN_ROADWORKS_AREAS("inRoadworksAreas"),
    @XmlEnumValue("inShadedAreas")
    IN_SHADED_AREAS("inShadedAreas"),
    @XmlEnumValue("inTheCityCentre")
    IN_THE_CITY_CENTRE("inTheCityCentre"),
    @XmlEnumValue("inTheInnerCityAreas")
    IN_THE_INNER_CITY_AREAS("inTheInnerCityAreas"),
    @XmlEnumValue("inTunnels")
    IN_TUNNELS("inTunnels"),
    @XmlEnumValue("onBridges")
    ON_BRIDGES("onBridges"),
    @XmlEnumValue("onElevatedSections")
    ON_ELEVATED_SECTIONS("onElevatedSections"),
    @XmlEnumValue("onEnteringOrLeavingTunnels")
    ON_ENTERING_OR_LEAVING_TUNNELS("onEnteringOrLeavingTunnels"),
    @XmlEnumValue("onEnteringTheCountry")
    ON_ENTERING_THE_COUNTRY("onEnteringTheCountry"),
    @XmlEnumValue("onFlyovers")
    ON_FLYOVERS("onFlyovers"),
    @XmlEnumValue("onLeavingTheCountry")
    ON_LEAVING_THE_COUNTRY("onLeavingTheCountry"),
    @XmlEnumValue("onMotorways")
    ON_MOTORWAYS("onMotorways"),
    @XmlEnumValue("onNonMotorways")
    ON_NON_MOTORWAYS("onNonMotorways"),
    @XmlEnumValue("onRoundabouts")
    ON_ROUNDABOUTS("onRoundabouts"),
    @XmlEnumValue("onSlipRoads")
    ON_SLIP_ROADS("onSlipRoads"),
    @XmlEnumValue("onUndergroundSections")
    ON_UNDERGROUND_SECTIONS("onUndergroundSections"),
    @XmlEnumValue("onUnderpasses")
    ON_UNDERPASSES("onUnderpasses"),
    @XmlEnumValue("overTheCrestOfHills")
    OVER_THE_CREST_OF_HILLS("overTheCrestOfHills"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PlacesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacesEnum fromValue(String v) {
        for (PlacesEnum c: PlacesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
