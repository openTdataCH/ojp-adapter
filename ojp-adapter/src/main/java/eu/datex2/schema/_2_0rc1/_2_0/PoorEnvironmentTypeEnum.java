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
 * <p>Java-Klasse für PoorEnvironmentTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PoorEnvironmentTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="badWeather"/&gt;
 *     &lt;enumeration value="blizzard"/&gt;
 *     &lt;enumeration value="blowingDust"/&gt;
 *     &lt;enumeration value="blowingSnow"/&gt;
 *     &lt;enumeration value="crosswinds"/&gt;
 *     &lt;enumeration value="damagingHail"/&gt;
 *     &lt;enumeration value="denseFog"/&gt;
 *     &lt;enumeration value="eclipse"/&gt;
 *     &lt;enumeration value="extremeCold"/&gt;
 *     &lt;enumeration value="extremeHeat"/&gt;
 *     &lt;enumeration value="fog"/&gt;
 *     &lt;enumeration value="freezingFog"/&gt;
 *     &lt;enumeration value="frost"/&gt;
 *     &lt;enumeration value="gales"/&gt;
 *     &lt;enumeration value="gustyWinds"/&gt;
 *     &lt;enumeration value="hail"/&gt;
 *     &lt;enumeration value="heavyFrost"/&gt;
 *     &lt;enumeration value="heavyRain"/&gt;
 *     &lt;enumeration value="heavySnowfall"/&gt;
 *     &lt;enumeration value="hurricaneForceWinds"/&gt;
 *     &lt;enumeration value="lowSunGlare"/&gt;
 *     &lt;enumeration value="moderateFog"/&gt;
 *     &lt;enumeration value="ozonePollution"/&gt;
 *     &lt;enumeration value="pollution"/&gt;
 *     &lt;enumeration value="patchyFog"/&gt;
 *     &lt;enumeration value="precipitationInTheArea"/&gt;
 *     &lt;enumeration value="rain"/&gt;
 *     &lt;enumeration value="rainChangingToSnow"/&gt;
 *     &lt;enumeration value="sandStorms"/&gt;
 *     &lt;enumeration value="severeExhaustPollution"/&gt;
 *     &lt;enumeration value="severeSmog"/&gt;
 *     &lt;enumeration value="showers"/&gt;
 *     &lt;enumeration value="sleet"/&gt;
 *     &lt;enumeration value="smogAlert"/&gt;
 *     &lt;enumeration value="smokeHazard"/&gt;
 *     &lt;enumeration value="snowChangingToRain"/&gt;
 *     &lt;enumeration value="snowfall"/&gt;
 *     &lt;enumeration value="sprayHazard"/&gt;
 *     &lt;enumeration value="stormForceWinds"/&gt;
 *     &lt;enumeration value="strongGustsOfWind"/&gt;
 *     &lt;enumeration value="strongWinds"/&gt;
 *     &lt;enumeration value="swarmsOfInsects"/&gt;
 *     &lt;enumeration value="temperatureFalling"/&gt;
 *     &lt;enumeration value="thunderstorms"/&gt;
 *     &lt;enumeration value="tornadoes"/&gt;
 *     &lt;enumeration value="veryStrongGustsOfWind"/&gt;
 *     &lt;enumeration value="visibilityReduced"/&gt;
 *     &lt;enumeration value="whiteOut"/&gt;
 *     &lt;enumeration value="winterStorm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PoorEnvironmentTypeEnum")
@XmlEnum
public enum PoorEnvironmentTypeEnum {

    @XmlEnumValue("badWeather")
    BAD_WEATHER("badWeather"),
    @XmlEnumValue("blizzard")
    BLIZZARD("blizzard"),
    @XmlEnumValue("blowingDust")
    BLOWING_DUST("blowingDust"),
    @XmlEnumValue("blowingSnow")
    BLOWING_SNOW("blowingSnow"),
    @XmlEnumValue("crosswinds")
    CROSSWINDS("crosswinds"),
    @XmlEnumValue("damagingHail")
    DAMAGING_HAIL("damagingHail"),
    @XmlEnumValue("denseFog")
    DENSE_FOG("denseFog"),
    @XmlEnumValue("eclipse")
    ECLIPSE("eclipse"),
    @XmlEnumValue("extremeCold")
    EXTREME_COLD("extremeCold"),
    @XmlEnumValue("extremeHeat")
    EXTREME_HEAT("extremeHeat"),
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("freezingFog")
    FREEZING_FOG("freezingFog"),
    @XmlEnumValue("frost")
    FROST("frost"),
    @XmlEnumValue("gales")
    GALES("gales"),
    @XmlEnumValue("gustyWinds")
    GUSTY_WINDS("gustyWinds"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("heavyFrost")
    HEAVY_FROST("heavyFrost"),
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),
    @XmlEnumValue("heavySnowfall")
    HEAVY_SNOWFALL("heavySnowfall"),
    @XmlEnumValue("hurricaneForceWinds")
    HURRICANE_FORCE_WINDS("hurricaneForceWinds"),
    @XmlEnumValue("lowSunGlare")
    LOW_SUN_GLARE("lowSunGlare"),
    @XmlEnumValue("moderateFog")
    MODERATE_FOG("moderateFog"),
    @XmlEnumValue("ozonePollution")
    OZONE_POLLUTION("ozonePollution"),
    @XmlEnumValue("pollution")
    POLLUTION("pollution"),
    @XmlEnumValue("patchyFog")
    PATCHY_FOG("patchyFog"),
    @XmlEnumValue("precipitationInTheArea")
    PRECIPITATION_IN_THE_AREA("precipitationInTheArea"),
    @XmlEnumValue("rain")
    RAIN("rain"),
    @XmlEnumValue("rainChangingToSnow")
    RAIN_CHANGING_TO_SNOW("rainChangingToSnow"),
    @XmlEnumValue("sandStorms")
    SAND_STORMS("sandStorms"),
    @XmlEnumValue("severeExhaustPollution")
    SEVERE_EXHAUST_POLLUTION("severeExhaustPollution"),
    @XmlEnumValue("severeSmog")
    SEVERE_SMOG("severeSmog"),
    @XmlEnumValue("showers")
    SHOWERS("showers"),
    @XmlEnumValue("sleet")
    SLEET("sleet"),
    @XmlEnumValue("smogAlert")
    SMOG_ALERT("smogAlert"),
    @XmlEnumValue("smokeHazard")
    SMOKE_HAZARD("smokeHazard"),
    @XmlEnumValue("snowChangingToRain")
    SNOW_CHANGING_TO_RAIN("snowChangingToRain"),
    @XmlEnumValue("snowfall")
    SNOWFALL("snowfall"),
    @XmlEnumValue("sprayHazard")
    SPRAY_HAZARD("sprayHazard"),
    @XmlEnumValue("stormForceWinds")
    STORM_FORCE_WINDS("stormForceWinds"),
    @XmlEnumValue("strongGustsOfWind")
    STRONG_GUSTS_OF_WIND("strongGustsOfWind"),
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),
    @XmlEnumValue("swarmsOfInsects")
    SWARMS_OF_INSECTS("swarmsOfInsects"),
    @XmlEnumValue("temperatureFalling")
    TEMPERATURE_FALLING("temperatureFalling"),
    @XmlEnumValue("thunderstorms")
    THUNDERSTORMS("thunderstorms"),
    @XmlEnumValue("tornadoes")
    TORNADOES("tornadoes"),
    @XmlEnumValue("veryStrongGustsOfWind")
    VERY_STRONG_GUSTS_OF_WIND("veryStrongGustsOfWind"),
    @XmlEnumValue("visibilityReduced")
    VISIBILITY_REDUCED("visibilityReduced"),
    @XmlEnumValue("whiteOut")
    WHITE_OUT("whiteOut"),
    @XmlEnumValue("winterStorm")
    WINTER_STORM("winterStorm");
    private final String value;

    PoorEnvironmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoorEnvironmentTypeEnum fromValue(String v) {
        for (PoorEnvironmentTypeEnum c: PoorEnvironmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
