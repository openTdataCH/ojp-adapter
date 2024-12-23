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
 * <p>Java-Klasse für LocationDescriptorEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LocationDescriptorEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aroundABendInRoad"/&gt;
 *     &lt;enumeration value="atMotorwayInterchange"/&gt;
 *     &lt;enumeration value="atRestArea"/&gt;
 *     &lt;enumeration value="atServiceArea"/&gt;
 *     &lt;enumeration value="atTollPlaza"/&gt;
 *     &lt;enumeration value="atTunnelEntryOrExit"/&gt;
 *     &lt;enumeration value="inbound"/&gt;
 *     &lt;enumeration value="inGallery"/&gt;
 *     &lt;enumeration value="inTheCentre"/&gt;
 *     &lt;enumeration value="inTheOppositeDirection"/&gt;
 *     &lt;enumeration value="inTunnel"/&gt;
 *     &lt;enumeration value="onBorder"/&gt;
 *     &lt;enumeration value="onBridge"/&gt;
 *     &lt;enumeration value="onConnector"/&gt;
 *     &lt;enumeration value="onElevatedSection"/&gt;
 *     &lt;enumeration value="onFlyover"/&gt;
 *     &lt;enumeration value="onIceRoad"/&gt;
 *     &lt;enumeration value="onLevelCrossing"/&gt;
 *     &lt;enumeration value="onLinkRoad"/&gt;
 *     &lt;enumeration value="onPass"/&gt;
 *     &lt;enumeration value="onRoundabout"/&gt;
 *     &lt;enumeration value="onTheLeft"/&gt;
 *     &lt;enumeration value="onTheRight"/&gt;
 *     &lt;enumeration value="onTheRoadway"/&gt;
 *     &lt;enumeration value="onUndergroundSection"/&gt;
 *     &lt;enumeration value="onUnderpass"/&gt;
 *     &lt;enumeration value="outbound"/&gt;
 *     &lt;enumeration value="overCrestOfHill"/&gt;
 *     &lt;enumeration value="withinJunction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDescriptorEnum")
@XmlEnum
public enum LocationDescriptorEnum {

    @XmlEnumValue("aroundABendInRoad")
    AROUND_A_BEND_IN_ROAD("aroundABendInRoad"),
    @XmlEnumValue("atMotorwayInterchange")
    AT_MOTORWAY_INTERCHANGE("atMotorwayInterchange"),
    @XmlEnumValue("atRestArea")
    AT_REST_AREA("atRestArea"),
    @XmlEnumValue("atServiceArea")
    AT_SERVICE_AREA("atServiceArea"),
    @XmlEnumValue("atTollPlaza")
    AT_TOLL_PLAZA("atTollPlaza"),
    @XmlEnumValue("atTunnelEntryOrExit")
    AT_TUNNEL_ENTRY_OR_EXIT("atTunnelEntryOrExit"),
    @XmlEnumValue("inbound")
    INBOUND("inbound"),
    @XmlEnumValue("inGallery")
    IN_GALLERY("inGallery"),
    @XmlEnumValue("inTheCentre")
    IN_THE_CENTRE("inTheCentre"),
    @XmlEnumValue("inTheOppositeDirection")
    IN_THE_OPPOSITE_DIRECTION("inTheOppositeDirection"),
    @XmlEnumValue("inTunnel")
    IN_TUNNEL("inTunnel"),
    @XmlEnumValue("onBorder")
    ON_BORDER("onBorder"),
    @XmlEnumValue("onBridge")
    ON_BRIDGE("onBridge"),
    @XmlEnumValue("onConnector")
    ON_CONNECTOR("onConnector"),
    @XmlEnumValue("onElevatedSection")
    ON_ELEVATED_SECTION("onElevatedSection"),
    @XmlEnumValue("onFlyover")
    ON_FLYOVER("onFlyover"),
    @XmlEnumValue("onIceRoad")
    ON_ICE_ROAD("onIceRoad"),
    @XmlEnumValue("onLevelCrossing")
    ON_LEVEL_CROSSING("onLevelCrossing"),
    @XmlEnumValue("onLinkRoad")
    ON_LINK_ROAD("onLinkRoad"),
    @XmlEnumValue("onPass")
    ON_PASS("onPass"),
    @XmlEnumValue("onRoundabout")
    ON_ROUNDABOUT("onRoundabout"),
    @XmlEnumValue("onTheLeft")
    ON_THE_LEFT("onTheLeft"),
    @XmlEnumValue("onTheRight")
    ON_THE_RIGHT("onTheRight"),
    @XmlEnumValue("onTheRoadway")
    ON_THE_ROADWAY("onTheRoadway"),
    @XmlEnumValue("onUndergroundSection")
    ON_UNDERGROUND_SECTION("onUndergroundSection"),
    @XmlEnumValue("onUnderpass")
    ON_UNDERPASS("onUnderpass"),
    @XmlEnumValue("outbound")
    OUTBOUND("outbound"),
    @XmlEnumValue("overCrestOfHill")
    OVER_CREST_OF_HILL("overCrestOfHill"),
    @XmlEnumValue("withinJunction")
    WITHIN_JUNCTION("withinJunction");
    private final String value;

    LocationDescriptorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDescriptorEnum fromValue(String v) {
        for (LocationDescriptorEnum c: LocationDescriptorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
