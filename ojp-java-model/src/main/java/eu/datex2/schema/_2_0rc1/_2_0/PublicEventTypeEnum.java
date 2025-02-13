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
 * <p>Java-Klasse für PublicEventTypeEnum.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PublicEventTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="agriculturalShow"/&gt;
 *     &lt;enumeration value="airShow"/&gt;
 *     &lt;enumeration value="artEvent"/&gt;
 *     &lt;enumeration value="athleticsMeeting"/&gt;
 *     &lt;enumeration value="ballGame"/&gt;
 *     &lt;enumeration value="baseballGame"/&gt;
 *     &lt;enumeration value="basketballGame"/&gt;
 *     &lt;enumeration value="beerFestival"/&gt;
 *     &lt;enumeration value="bicycleRace"/&gt;
 *     &lt;enumeration value="boatRace"/&gt;
 *     &lt;enumeration value="boatShow"/&gt;
 *     &lt;enumeration value="boxingTournament"/&gt;
 *     &lt;enumeration value="bullFight"/&gt;
 *     &lt;enumeration value="ceremonialEvent"/&gt;
 *     &lt;enumeration value="commercialEvent"/&gt;
 *     &lt;enumeration value="concert"/&gt;
 *     &lt;enumeration value="cricketMatch"/&gt;
 *     &lt;enumeration value="culturalEvent"/&gt;
 *     &lt;enumeration value="exhibition"/&gt;
 *     &lt;enumeration value="fair"/&gt;
 *     &lt;enumeration value="festival"/&gt;
 *     &lt;enumeration value="filmFestival"/&gt;
 *     &lt;enumeration value="filmTVMaking"/&gt;
 *     &lt;enumeration value="fireworkDisplay"/&gt;
 *     &lt;enumeration value="flowerEvent"/&gt;
 *     &lt;enumeration value="foodFestival"/&gt;
 *     &lt;enumeration value="footballMatch"/&gt;
 *     &lt;enumeration value="funfair"/&gt;
 *     &lt;enumeration value="gardeningOrFlowerShow"/&gt;
 *     &lt;enumeration value="golfTournament"/&gt;
 *     &lt;enumeration value="hockeyGame"/&gt;
 *     &lt;enumeration value="horseRaceMeeting"/&gt;
 *     &lt;enumeration value="internationalSportsMeeting"/&gt;
 *     &lt;enumeration value="majorEvent"/&gt;
 *     &lt;enumeration value="marathon"/&gt;
 *     &lt;enumeration value="market"/&gt;
 *     &lt;enumeration value="match"/&gt;
 *     &lt;enumeration value="motorShow"/&gt;
 *     &lt;enumeration value="motorSportRaceMeeting"/&gt;
 *     &lt;enumeration value="openAirConcert"/&gt;
 *     &lt;enumeration value="parade"/&gt;
 *     &lt;enumeration value="procession"/&gt;
 *     &lt;enumeration value="raceMeeting"/&gt;
 *     &lt;enumeration value="rugbyMatch"/&gt;
 *     &lt;enumeration value="severalMajorEvents"/&gt;
 *     &lt;enumeration value="show"/&gt;
 *     &lt;enumeration value="showJumping"/&gt;
 *     &lt;enumeration value="soundAndLightShow"/&gt;
 *     &lt;enumeration value="sportsMeeting"/&gt;
 *     &lt;enumeration value="stateOccasion"/&gt;
 *     &lt;enumeration value="streetFestival"/&gt;
 *     &lt;enumeration value="tennisTournament"/&gt;
 *     &lt;enumeration value="theatricalEvent"/&gt;
 *     &lt;enumeration value="tournament"/&gt;
 *     &lt;enumeration value="tradeFair"/&gt;
 *     &lt;enumeration value="waterSportsMeeting"/&gt;
 *     &lt;enumeration value="wineFestival"/&gt;
 *     &lt;enumeration value="winterSportsMeeting"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PublicEventTypeEnum")
@XmlEnum
public enum PublicEventTypeEnum {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("agriculturalShow")
    AGRICULTURAL_SHOW("agriculturalShow"),
    @XmlEnumValue("airShow")
    AIR_SHOW("airShow"),
    @XmlEnumValue("artEvent")
    ART_EVENT("artEvent"),
    @XmlEnumValue("athleticsMeeting")
    ATHLETICS_MEETING("athleticsMeeting"),
    @XmlEnumValue("ballGame")
    BALL_GAME("ballGame"),
    @XmlEnumValue("baseballGame")
    BASEBALL_GAME("baseballGame"),
    @XmlEnumValue("basketballGame")
    BASKETBALL_GAME("basketballGame"),
    @XmlEnumValue("beerFestival")
    BEER_FESTIVAL("beerFestival"),
    @XmlEnumValue("bicycleRace")
    BICYCLE_RACE("bicycleRace"),
    @XmlEnumValue("boatRace")
    BOAT_RACE("boatRace"),
    @XmlEnumValue("boatShow")
    BOAT_SHOW("boatShow"),
    @XmlEnumValue("boxingTournament")
    BOXING_TOURNAMENT("boxingTournament"),
    @XmlEnumValue("bullFight")
    BULL_FIGHT("bullFight"),
    @XmlEnumValue("ceremonialEvent")
    CEREMONIAL_EVENT("ceremonialEvent"),
    @XmlEnumValue("commercialEvent")
    COMMERCIAL_EVENT("commercialEvent"),
    @XmlEnumValue("concert")
    CONCERT("concert"),
    @XmlEnumValue("cricketMatch")
    CRICKET_MATCH("cricketMatch"),
    @XmlEnumValue("culturalEvent")
    CULTURAL_EVENT("culturalEvent"),
    @XmlEnumValue("exhibition")
    EXHIBITION("exhibition"),
    @XmlEnumValue("fair")
    FAIR("fair"),
    @XmlEnumValue("festival")
    FESTIVAL("festival"),
    @XmlEnumValue("filmFestival")
    FILM_FESTIVAL("filmFestival"),
    @XmlEnumValue("filmTVMaking")
    FILM_TV_MAKING("filmTVMaking"),
    @XmlEnumValue("fireworkDisplay")
    FIREWORK_DISPLAY("fireworkDisplay"),
    @XmlEnumValue("flowerEvent")
    FLOWER_EVENT("flowerEvent"),
    @XmlEnumValue("foodFestival")
    FOOD_FESTIVAL("foodFestival"),
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),
    @XmlEnumValue("funfair")
    FUNFAIR("funfair"),
    @XmlEnumValue("gardeningOrFlowerShow")
    GARDENING_OR_FLOWER_SHOW("gardeningOrFlowerShow"),
    @XmlEnumValue("golfTournament")
    GOLF_TOURNAMENT("golfTournament"),
    @XmlEnumValue("hockeyGame")
    HOCKEY_GAME("hockeyGame"),
    @XmlEnumValue("horseRaceMeeting")
    HORSE_RACE_MEETING("horseRaceMeeting"),
    @XmlEnumValue("internationalSportsMeeting")
    INTERNATIONAL_SPORTS_MEETING("internationalSportsMeeting"),
    @XmlEnumValue("majorEvent")
    MAJOR_EVENT("majorEvent"),
    @XmlEnumValue("marathon")
    MARATHON("marathon"),
    @XmlEnumValue("market")
    MARKET("market"),
    @XmlEnumValue("match")
    MATCH("match"),
    @XmlEnumValue("motorShow")
    MOTOR_SHOW("motorShow"),
    @XmlEnumValue("motorSportRaceMeeting")
    MOTOR_SPORT_RACE_MEETING("motorSportRaceMeeting"),
    @XmlEnumValue("openAirConcert")
    OPEN_AIR_CONCERT("openAirConcert"),
    @XmlEnumValue("parade")
    PARADE("parade"),
    @XmlEnumValue("procession")
    PROCESSION("procession"),
    @XmlEnumValue("raceMeeting")
    RACE_MEETING("raceMeeting"),
    @XmlEnumValue("rugbyMatch")
    RUGBY_MATCH("rugbyMatch"),
    @XmlEnumValue("severalMajorEvents")
    SEVERAL_MAJOR_EVENTS("severalMajorEvents"),
    @XmlEnumValue("show")
    SHOW("show"),
    @XmlEnumValue("showJumping")
    SHOW_JUMPING("showJumping"),
    @XmlEnumValue("soundAndLightShow")
    SOUND_AND_LIGHT_SHOW("soundAndLightShow"),
    @XmlEnumValue("sportsMeeting")
    SPORTS_MEETING("sportsMeeting"),
    @XmlEnumValue("stateOccasion")
    STATE_OCCASION("stateOccasion"),
    @XmlEnumValue("streetFestival")
    STREET_FESTIVAL("streetFestival"),
    @XmlEnumValue("tennisTournament")
    TENNIS_TOURNAMENT("tennisTournament"),
    @XmlEnumValue("theatricalEvent")
    THEATRICAL_EVENT("theatricalEvent"),
    @XmlEnumValue("tournament")
    TOURNAMENT("tournament"),
    @XmlEnumValue("tradeFair")
    TRADE_FAIR("tradeFair"),
    @XmlEnumValue("waterSportsMeeting")
    WATER_SPORTS_MEETING("waterSportsMeeting"),
    @XmlEnumValue("wineFestival")
    WINE_FESTIVAL("wineFestival"),
    @XmlEnumValue("winterSportsMeeting")
    WINTER_SPORTS_MEETING("winterSportsMeeting"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PublicEventTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicEventTypeEnum fromValue(String v) {
        for (PublicEventTypeEnum c : PublicEventTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
