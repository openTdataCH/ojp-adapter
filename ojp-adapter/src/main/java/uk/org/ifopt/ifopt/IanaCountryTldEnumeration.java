//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IanaCountryTldEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="IanaCountryTldEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="ac"/&gt;
 *     &lt;enumeration value="ad"/&gt;
 *     &lt;enumeration value="ae"/&gt;
 *     &lt;enumeration value="af"/&gt;
 *     &lt;enumeration value="ag"/&gt;
 *     &lt;enumeration value="ai"/&gt;
 *     &lt;enumeration value="al"/&gt;
 *     &lt;enumeration value="am"/&gt;
 *     &lt;enumeration value="an"/&gt;
 *     &lt;enumeration value="ao"/&gt;
 *     &lt;enumeration value="aq"/&gt;
 *     &lt;enumeration value="ar"/&gt;
 *     &lt;enumeration value="as"/&gt;
 *     &lt;enumeration value="at"/&gt;
 *     &lt;enumeration value="au"/&gt;
 *     &lt;enumeration value="aw"/&gt;
 *     &lt;enumeration value="az"/&gt;
 *     &lt;enumeration value="ax"/&gt;
 *     &lt;enumeration value="ba"/&gt;
 *     &lt;enumeration value="bb"/&gt;
 *     &lt;enumeration value="bd"/&gt;
 *     &lt;enumeration value="be"/&gt;
 *     &lt;enumeration value="bf"/&gt;
 *     &lt;enumeration value="bg"/&gt;
 *     &lt;enumeration value="bh"/&gt;
 *     &lt;enumeration value="bi"/&gt;
 *     &lt;enumeration value="bj"/&gt;
 *     &lt;enumeration value="bm"/&gt;
 *     &lt;enumeration value="bn"/&gt;
 *     &lt;enumeration value="bo"/&gt;
 *     &lt;enumeration value="br"/&gt;
 *     &lt;enumeration value="bs"/&gt;
 *     &lt;enumeration value="bt"/&gt;
 *     &lt;enumeration value="bv"/&gt;
 *     &lt;enumeration value="bw"/&gt;
 *     &lt;enumeration value="by"/&gt;
 *     &lt;enumeration value="bz"/&gt;
 *     &lt;enumeration value="ca"/&gt;
 *     &lt;enumeration value="cc"/&gt;
 *     &lt;enumeration value="cd"/&gt;
 *     &lt;enumeration value="cf"/&gt;
 *     &lt;enumeration value="cg"/&gt;
 *     &lt;enumeration value="ch"/&gt;
 *     &lt;enumeration value="ci"/&gt;
 *     &lt;enumeration value="ck"/&gt;
 *     &lt;enumeration value="cl"/&gt;
 *     &lt;enumeration value="cm"/&gt;
 *     &lt;enumeration value="cn"/&gt;
 *     &lt;enumeration value="co"/&gt;
 *     &lt;enumeration value="cr"/&gt;
 *     &lt;enumeration value="cs"/&gt;
 *     &lt;enumeration value="cu"/&gt;
 *     &lt;enumeration value="cv"/&gt;
 *     &lt;enumeration value="cx"/&gt;
 *     &lt;enumeration value="cy"/&gt;
 *     &lt;enumeration value="cz"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="dj"/&gt;
 *     &lt;enumeration value="dk"/&gt;
 *     &lt;enumeration value="dm"/&gt;
 *     &lt;enumeration value="do"/&gt;
 *     &lt;enumeration value="dz"/&gt;
 *     &lt;enumeration value="ec"/&gt;
 *     &lt;enumeration value="ee"/&gt;
 *     &lt;enumeration value="eg"/&gt;
 *     &lt;enumeration value="eh"/&gt;
 *     &lt;enumeration value="er"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="et"/&gt;
 *     &lt;enumeration value="eu"/&gt;
 *     &lt;enumeration value="fi"/&gt;
 *     &lt;enumeration value="fj"/&gt;
 *     &lt;enumeration value="fk"/&gt;
 *     &lt;enumeration value="fm"/&gt;
 *     &lt;enumeration value="fo"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="ga"/&gt;
 *     &lt;enumeration value="gb"/&gt;
 *     &lt;enumeration value="gd"/&gt;
 *     &lt;enumeration value="ge"/&gt;
 *     &lt;enumeration value="gf"/&gt;
 *     &lt;enumeration value="gg"/&gt;
 *     &lt;enumeration value="gh"/&gt;
 *     &lt;enumeration value="gi"/&gt;
 *     &lt;enumeration value="gl"/&gt;
 *     &lt;enumeration value="gm"/&gt;
 *     &lt;enumeration value="gn"/&gt;
 *     &lt;enumeration value="gp"/&gt;
 *     &lt;enumeration value="gq"/&gt;
 *     &lt;enumeration value="gr"/&gt;
 *     &lt;enumeration value="gs"/&gt;
 *     &lt;enumeration value="gt"/&gt;
 *     &lt;enumeration value="gu"/&gt;
 *     &lt;enumeration value="gw"/&gt;
 *     &lt;enumeration value="gy"/&gt;
 *     &lt;enumeration value="hk"/&gt;
 *     &lt;enumeration value="hm"/&gt;
 *     &lt;enumeration value="hn"/&gt;
 *     &lt;enumeration value="hr"/&gt;
 *     &lt;enumeration value="ht"/&gt;
 *     &lt;enumeration value="hu"/&gt;
 *     &lt;enumeration value="id"/&gt;
 *     &lt;enumeration value="ie"/&gt;
 *     &lt;enumeration value="il"/&gt;
 *     &lt;enumeration value="im"/&gt;
 *     &lt;enumeration value="in"/&gt;
 *     &lt;enumeration value="io"/&gt;
 *     &lt;enumeration value="iq"/&gt;
 *     &lt;enumeration value="ir"/&gt;
 *     &lt;enumeration value="is"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="je"/&gt;
 *     &lt;enumeration value="jm"/&gt;
 *     &lt;enumeration value="jo"/&gt;
 *     &lt;enumeration value="jp"/&gt;
 *     &lt;enumeration value="ke"/&gt;
 *     &lt;enumeration value="kg"/&gt;
 *     &lt;enumeration value="kh"/&gt;
 *     &lt;enumeration value="ki"/&gt;
 *     &lt;enumeration value="km"/&gt;
 *     &lt;enumeration value="kn"/&gt;
 *     &lt;enumeration value="kp"/&gt;
 *     &lt;enumeration value="kr"/&gt;
 *     &lt;enumeration value="kw"/&gt;
 *     &lt;enumeration value="ky"/&gt;
 *     &lt;enumeration value="kz"/&gt;
 *     &lt;enumeration value="la"/&gt;
 *     &lt;enumeration value="lb"/&gt;
 *     &lt;enumeration value="lc"/&gt;
 *     &lt;enumeration value="li"/&gt;
 *     &lt;enumeration value="lk"/&gt;
 *     &lt;enumeration value="lr"/&gt;
 *     &lt;enumeration value="ls"/&gt;
 *     &lt;enumeration value="lt"/&gt;
 *     &lt;enumeration value="lu"/&gt;
 *     &lt;enumeration value="lv"/&gt;
 *     &lt;enumeration value="ly"/&gt;
 *     &lt;enumeration value="ma"/&gt;
 *     &lt;enumeration value="mc"/&gt;
 *     &lt;enumeration value="md"/&gt;
 *     &lt;enumeration value="mg"/&gt;
 *     &lt;enumeration value="mh"/&gt;
 *     &lt;enumeration value="mk"/&gt;
 *     &lt;enumeration value="ml"/&gt;
 *     &lt;enumeration value="mm"/&gt;
 *     &lt;enumeration value="mn"/&gt;
 *     &lt;enumeration value="mo"/&gt;
 *     &lt;enumeration value="mp"/&gt;
 *     &lt;enumeration value="mq"/&gt;
 *     &lt;enumeration value="mr"/&gt;
 *     &lt;enumeration value="ms"/&gt;
 *     &lt;enumeration value="mt"/&gt;
 *     &lt;enumeration value="mu"/&gt;
 *     &lt;enumeration value="mv"/&gt;
 *     &lt;enumeration value="mw"/&gt;
 *     &lt;enumeration value="mx"/&gt;
 *     &lt;enumeration value="my"/&gt;
 *     &lt;enumeration value="mz"/&gt;
 *     &lt;enumeration value="na"/&gt;
 *     &lt;enumeration value="nc"/&gt;
 *     &lt;enumeration value="ne"/&gt;
 *     &lt;enumeration value="nf"/&gt;
 *     &lt;enumeration value="ng"/&gt;
 *     &lt;enumeration value="ni"/&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="np"/&gt;
 *     &lt;enumeration value="nr"/&gt;
 *     &lt;enumeration value="nu"/&gt;
 *     &lt;enumeration value="nz"/&gt;
 *     &lt;enumeration value="om"/&gt;
 *     &lt;enumeration value="pa"/&gt;
 *     &lt;enumeration value="pe"/&gt;
 *     &lt;enumeration value="pf"/&gt;
 *     &lt;enumeration value="pg"/&gt;
 *     &lt;enumeration value="ph"/&gt;
 *     &lt;enumeration value="pk"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *     &lt;enumeration value="pm"/&gt;
 *     &lt;enumeration value="pn"/&gt;
 *     &lt;enumeration value="pr"/&gt;
 *     &lt;enumeration value="ps"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="pw"/&gt;
 *     &lt;enumeration value="py"/&gt;
 *     &lt;enumeration value="qa"/&gt;
 *     &lt;enumeration value="re"/&gt;
 *     &lt;enumeration value="ro"/&gt;
 *     &lt;enumeration value="ru"/&gt;
 *     &lt;enumeration value="rw"/&gt;
 *     &lt;enumeration value="sa"/&gt;
 *     &lt;enumeration value="sb"/&gt;
 *     &lt;enumeration value="sc"/&gt;
 *     &lt;enumeration value="sd"/&gt;
 *     &lt;enumeration value="se"/&gt;
 *     &lt;enumeration value="sg"/&gt;
 *     &lt;enumeration value="sh"/&gt;
 *     &lt;enumeration value="si"/&gt;
 *     &lt;enumeration value="sj"/&gt;
 *     &lt;enumeration value="sk"/&gt;
 *     &lt;enumeration value="sl"/&gt;
 *     &lt;enumeration value="sm"/&gt;
 *     &lt;enumeration value="sn"/&gt;
 *     &lt;enumeration value="so"/&gt;
 *     &lt;enumeration value="sr"/&gt;
 *     &lt;enumeration value="st"/&gt;
 *     &lt;enumeration value="sv"/&gt;
 *     &lt;enumeration value="sy"/&gt;
 *     &lt;enumeration value="sz"/&gt;
 *     &lt;enumeration value="tc"/&gt;
 *     &lt;enumeration value="td"/&gt;
 *     &lt;enumeration value="tf"/&gt;
 *     &lt;enumeration value="tg"/&gt;
 *     &lt;enumeration value="th"/&gt;
 *     &lt;enumeration value="tj"/&gt;
 *     &lt;enumeration value="tk"/&gt;
 *     &lt;enumeration value="tl"/&gt;
 *     &lt;enumeration value="tm"/&gt;
 *     &lt;enumeration value="tn"/&gt;
 *     &lt;enumeration value="to"/&gt;
 *     &lt;enumeration value="tp"/&gt;
 *     &lt;enumeration value="tr"/&gt;
 *     &lt;enumeration value="tt"/&gt;
 *     &lt;enumeration value="tv"/&gt;
 *     &lt;enumeration value="tw"/&gt;
 *     &lt;enumeration value="tz"/&gt;
 *     &lt;enumeration value="ua"/&gt;
 *     &lt;enumeration value="ug"/&gt;
 *     &lt;enumeration value="uk"/&gt;
 *     &lt;enumeration value="um"/&gt;
 *     &lt;enumeration value="us"/&gt;
 *     &lt;enumeration value="uy"/&gt;
 *     &lt;enumeration value="uz"/&gt;
 *     &lt;enumeration value="va"/&gt;
 *     &lt;enumeration value="vc"/&gt;
 *     &lt;enumeration value="ve"/&gt;
 *     &lt;enumeration value="vg"/&gt;
 *     &lt;enumeration value="vi"/&gt;
 *     &lt;enumeration value="vn"/&gt;
 *     &lt;enumeration value="vu"/&gt;
 *     &lt;enumeration value="wf"/&gt;
 *     &lt;enumeration value="ws"/&gt;
 *     &lt;enumeration value="ye"/&gt;
 *     &lt;enumeration value="yt"/&gt;
 *     &lt;enumeration value="yu"/&gt;
 *     &lt;enumeration value="za"/&gt;
 *     &lt;enumeration value="zm"/&gt;
 *     &lt;enumeration value="zw"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IanaCountryTldEnumeration")
@XmlEnum
public enum IanaCountryTldEnumeration {


    /**
     * Ascension Island.
     * 
     */
    @XmlEnumValue("ac")
    AC("ac"),

    /**
     * Andorra.
     * 
     */
    @XmlEnumValue("ad")
    AD("ad"),

    /**
     * United Arab Emirates.
     * 
     */
    @XmlEnumValue("ae")
    AE("ae"),

    /**
     * Afghanistan.
     * 
     */
    @XmlEnumValue("af")
    AF("af"),

    /**
     * Antigua and Barbuda.
     * 
     */
    @XmlEnumValue("ag")
    AG("ag"),

    /**
     * Anguilla.
     * 
     */
    @XmlEnumValue("ai")
    AI("ai"),

    /**
     * Albania.
     * 
     */
    @XmlEnumValue("al")
    AL("al"),

    /**
     * Armenia.
     * 
     */
    @XmlEnumValue("am")
    AM("am"),

    /**
     * Netherlands Antilles.
     * 
     */
    @XmlEnumValue("an")
    AN("an"),

    /**
     * Angola.
     * 
     */
    @XmlEnumValue("ao")
    AO("ao"),

    /**
     * Antarctica.
     * 
     */
    @XmlEnumValue("aq")
    AQ("aq"),

    /**
     * Argentina.
     * 
     */
    @XmlEnumValue("ar")
    AR("ar"),

    /**
     * American Samoa.
     * 
     */
    @XmlEnumValue("as")
    AS("as"),

    /**
     * Austria.
     * 
     */
    @XmlEnumValue("at")
    AT("at"),

    /**
     * Australia.
     * 
     */
    @XmlEnumValue("au")
    AU("au"),

    /**
     * Aruba.
     * 
     */
    @XmlEnumValue("aw")
    AW("aw"),

    /**
     * Azerbaijan.
     * 
     */
    @XmlEnumValue("az")
    AZ("az"),

    /**
     * Aland Islands.
     * 
     */
    @XmlEnumValue("ax")
    AX("ax"),

    /**
     * Bosnia and Herzegovina.
     * 
     */
    @XmlEnumValue("ba")
    BA("ba"),

    /**
     * Barbados.
     * 
     */
    @XmlEnumValue("bb")
    BB("bb"),

    /**
     * Bangladesh.
     * 
     */
    @XmlEnumValue("bd")
    BD("bd"),

    /**
     * Belgium.
     * 
     */
    @XmlEnumValue("be")
    BE("be"),

    /**
     * Burkina Faso.
     * 
     */
    @XmlEnumValue("bf")
    BF("bf"),

    /**
     * Bulgaria.
     * 
     */
    @XmlEnumValue("bg")
    BG("bg"),

    /**
     * Bahrain.
     * 
     */
    @XmlEnumValue("bh")
    BH("bh"),

    /**
     * Burundi.
     * 
     */
    @XmlEnumValue("bi")
    BI("bi"),

    /**
     * Benin.
     * 
     */
    @XmlEnumValue("bj")
    BJ("bj"),

    /**
     * Bermuda.
     * 
     */
    @XmlEnumValue("bm")
    BM("bm"),

    /**
     * Brunei Darussalam.
     * 
     */
    @XmlEnumValue("bn")
    BN("bn"),

    /**
     * Bolivia.
     * 
     */
    @XmlEnumValue("bo")
    BO("bo"),

    /**
     * Brazil.
     * 
     */
    @XmlEnumValue("br")
    BR("br"),

    /**
     * Bahamas.
     * 
     */
    @XmlEnumValue("bs")
    BS("bs"),

    /**
     * Bhutan.
     * 
     */
    @XmlEnumValue("bt")
    BT("bt"),

    /**
     * Bouvet Island.
     * 
     */
    @XmlEnumValue("bv")
    BV("bv"),

    /**
     * Botswana.
     * 
     */
    @XmlEnumValue("bw")
    BW("bw"),

    /**
     * Belarus.
     * 
     */
    @XmlEnumValue("by")
    BY("by"),

    /**
     * Belize.
     * 
     */
    @XmlEnumValue("bz")
    BZ("bz"),

    /**
     * Canada.
     * 
     */
    @XmlEnumValue("ca")
    CA("ca"),

    /**
     * Cocos (Keeling) Islands.
     * 
     */
    @XmlEnumValue("cc")
    CC("cc"),

    /**
     * Congo, The Democratic Republic of the.
     * 
     */
    @XmlEnumValue("cd")
    CD("cd"),

    /**
     * Central African Republic.
     * 
     */
    @XmlEnumValue("cf")
    CF("cf"),

    /**
     * Congo, Republic of.
     * 
     */
    @XmlEnumValue("cg")
    CG("cg"),

    /**
     * Switzerland.
     * 
     */
    @XmlEnumValue("ch")
    CH("ch"),

    /**
     * Cote d'Ivoire.
     * 
     */
    @XmlEnumValue("ci")
    CI("ci"),

    /**
     * Cook Islands.
     * 
     */
    @XmlEnumValue("ck")
    CK("ck"),

    /**
     * Chile.
     * 
     */
    @XmlEnumValue("cl")
    CL("cl"),

    /**
     * Cameroon.
     * 
     */
    @XmlEnumValue("cm")
    CM("cm"),

    /**
     * China.
     * 
     */
    @XmlEnumValue("cn")
    CN("cn"),

    /**
     * Colombia.
     * 
     */
    @XmlEnumValue("co")
    CO("co"),

    /**
     * Costa Rica.
     * 
     */
    @XmlEnumValue("cr")
    CR("cr"),

    /**
     * Serbia and Montenegro.
     * 
     */
    @XmlEnumValue("cs")
    CS("cs"),

    /**
     * Cuba.
     * 
     */
    @XmlEnumValue("cu")
    CU("cu"),

    /**
     * Cape Verde.
     * 
     */
    @XmlEnumValue("cv")
    CV("cv"),

    /**
     * Christmas Island.
     * 
     */
    @XmlEnumValue("cx")
    CX("cx"),

    /**
     * Cyprus.
     * 
     */
    @XmlEnumValue("cy")
    CY("cy"),

    /**
     * Czech Republic.
     * 
     */
    @XmlEnumValue("cz")
    CZ("cz"),

    /**
     * Germany.
     * 
     */
    @XmlEnumValue("de")
    DE("de"),

    /**
     * Djibouti.
     * 
     */
    @XmlEnumValue("dj")
    DJ("dj"),

    /**
     * Denmark.
     * 
     */
    @XmlEnumValue("dk")
    DK("dk"),

    /**
     * Dominica.
     * 
     */
    @XmlEnumValue("dm")
    DM("dm"),

    /**
     * Dominican Republic.
     * 
     */
    @XmlEnumValue("do")
    DO("do"),

    /**
     * Algeria.
     * 
     */
    @XmlEnumValue("dz")
    DZ("dz"),

    /**
     * Ecuador.
     * 
     */
    @XmlEnumValue("ec")
    EC("ec"),

    /**
     * Estonia.
     * 
     */
    @XmlEnumValue("ee")
    EE("ee"),

    /**
     * Egypt.
     * 
     */
    @XmlEnumValue("eg")
    EG("eg"),

    /**
     * Western Sahara.
     * 
     */
    @XmlEnumValue("eh")
    EH("eh"),

    /**
     * Eritrea.
     * 
     */
    @XmlEnumValue("er")
    ER("er"),

    /**
     * Spain.
     * 
     */
    @XmlEnumValue("es")
    ES("es"),

    /**
     * Ethiopia.
     * 
     */
    @XmlEnumValue("et")
    ET("et"),

    /**
     * European Union.
     * 
     */
    @XmlEnumValue("eu")
    EU("eu"),

    /**
     * Finland.
     * 
     */
    @XmlEnumValue("fi")
    FI("fi"),

    /**
     * Fiji.
     * 
     */
    @XmlEnumValue("fj")
    FJ("fj"),

    /**
     * Falkland Islands (Malvinas)
     * 
     */
    @XmlEnumValue("fk")
    FK("fk"),

    /**
     * Micronesia, Federal State of.
     * 
     */
    @XmlEnumValue("fm")
    FM("fm"),

    /**
     * Faroe Islands.
     * 
     */
    @XmlEnumValue("fo")
    FO("fo"),

    /**
     * France.
     * 
     */
    @XmlEnumValue("fr")
    FR("fr"),

    /**
     * Gabon.
     * 
     */
    @XmlEnumValue("ga")
    GA("ga"),

    /**
     * United Kingdom.
     * 
     */
    @XmlEnumValue("gb")
    GB("gb"),

    /**
     * Grenada.
     * 
     */
    @XmlEnumValue("gd")
    GD("gd"),

    /**
     * Georgia.
     * 
     */
    @XmlEnumValue("ge")
    GE("ge"),

    /**
     * French Guiana.
     * 
     */
    @XmlEnumValue("gf")
    GF("gf"),

    /**
     * Guernsey.
     * 
     */
    @XmlEnumValue("gg")
    GG("gg"),

    /**
     * Ghana.
     * 
     */
    @XmlEnumValue("gh")
    GH("gh"),

    /**
     * Gibraltar.
     * 
     */
    @XmlEnumValue("gi")
    GI("gi"),

    /**
     * Greenland.
     * 
     */
    @XmlEnumValue("gl")
    GL("gl"),

    /**
     * Gambia.
     * 
     */
    @XmlEnumValue("gm")
    GM("gm"),

    /**
     * Guinea.
     * 
     */
    @XmlEnumValue("gn")
    GN("gn"),

    /**
     * Guadeloupe.
     * 
     */
    @XmlEnumValue("gp")
    GP("gp"),

    /**
     * Equatorial Guinea.
     * 
     */
    @XmlEnumValue("gq")
    GQ("gq"),

    /**
     * Greece.
     * 
     */
    @XmlEnumValue("gr")
    GR("gr"),

    /**
     * South Georgia and the South Sandwich Islands.
     * 
     */
    @XmlEnumValue("gs")
    GS("gs"),

    /**
     * Guatemala.
     * 
     */
    @XmlEnumValue("gt")
    GT("gt"),

    /**
     * Guam.
     * 
     */
    @XmlEnumValue("gu")
    GU("gu"),

    /**
     * Guinea-Bissau.
     * 
     */
    @XmlEnumValue("gw")
    GW("gw"),

    /**
     * Guyana.
     * 
     */
    @XmlEnumValue("gy")
    GY("gy"),

    /**
     * Hong Kong.
     * 
     */
    @XmlEnumValue("hk")
    HK("hk"),

    /**
     * Heard and McDonald Islands.
     * 
     */
    @XmlEnumValue("hm")
    HM("hm"),

    /**
     * Honduras.
     * 
     */
    @XmlEnumValue("hn")
    HN("hn"),

    /**
     * Croatia/Hrvatska.
     * 
     */
    @XmlEnumValue("hr")
    HR("hr"),

    /**
     * Haiti.
     * 
     */
    @XmlEnumValue("ht")
    HT("ht"),

    /**
     * Hungary.
     * 
     */
    @XmlEnumValue("hu")
    HU("hu"),

    /**
     * Indonesia.
     * 
     */
    @XmlEnumValue("id")
    ID("id"),

    /**
     * Ireland.
     * 
     */
    @XmlEnumValue("ie")
    IE("ie"),

    /**
     * Israel.
     * 
     */
    @XmlEnumValue("il")
    IL("il"),

    /**
     * Isle of Man.
     * 
     */
    @XmlEnumValue("im")
    IM("im"),

    /**
     * India.
     * 
     */
    @XmlEnumValue("in")
    IN("in"),

    /**
     * British Indian Ocean Territory.
     * 
     */
    @XmlEnumValue("io")
    IO("io"),

    /**
     * Iraq
     * 
     */
    @XmlEnumValue("iq")
    IQ("iq"),

    /**
     * Iran, Islamic Republic of.
     * 
     */
    @XmlEnumValue("ir")
    IR("ir"),

    /**
     * Iceland.
     * 
     */
    @XmlEnumValue("is")
    IS("is"),

    /**
     * Italy.
     * 
     */
    @XmlEnumValue("it")
    IT("it"),

    /**
     * Jersey.
     * 
     */
    @XmlEnumValue("je")
    JE("je"),

    /**
     * Jamaica.
     * 
     */
    @XmlEnumValue("jm")
    JM("jm"),

    /**
     * Jordan.
     * 
     */
    @XmlEnumValue("jo")
    JO("jo"),

    /**
     * Japan.
     * 
     */
    @XmlEnumValue("jp")
    JP("jp"),

    /**
     * Kenya.
     * 
     */
    @XmlEnumValue("ke")
    KE("ke"),

    /**
     * Kyrgyzstan.
     * 
     */
    @XmlEnumValue("kg")
    KG("kg"),

    /**
     * Cambodia.
     * 
     */
    @XmlEnumValue("kh")
    KH("kh"),

    /**
     * Kiribati.
     * 
     */
    @XmlEnumValue("ki")
    KI("ki"),

    /**
     * Comoros.
     * 
     */
    @XmlEnumValue("km")
    KM("km"),

    /**
     * Saint Kitts and Nevis.
     * 
     */
    @XmlEnumValue("kn")
    KN("kn"),

    /**
     * Korea, Democratic People's Republic.
     * 
     */
    @XmlEnumValue("kp")
    KP("kp"),

    /**
     * Korea, Republic of.
     * 
     */
    @XmlEnumValue("kr")
    KR("kr"),

    /**
     * Kuwait.
     * 
     */
    @XmlEnumValue("kw")
    KW("kw"),

    /**
     * Cayman Islands.
     * 
     */
    @XmlEnumValue("ky")
    KY("ky"),

    /**
     * Kazakhstan.
     * 
     */
    @XmlEnumValue("kz")
    KZ("kz"),

    /**
     * Lao People's Democratic Republic.
     * 
     */
    @XmlEnumValue("la")
    LA("la"),

    /**
     * Lebanon.
     * 
     */
    @XmlEnumValue("lb")
    LB("lb"),

    /**
     * Saint Lucia.
     * 
     */
    @XmlEnumValue("lc")
    LC("lc"),

    /**
     * Liechtenstein.
     * 
     */
    @XmlEnumValue("li")
    LI("li"),

    /**
     * Sri Lanka.
     * 
     */
    @XmlEnumValue("lk")
    LK("lk"),

    /**
     * Liberia.
     * 
     */
    @XmlEnumValue("lr")
    LR("lr"),

    /**
     * Lesotho.
     * 
     */
    @XmlEnumValue("ls")
    LS("ls"),

    /**
     * Lithuania.
     * 
     */
    @XmlEnumValue("lt")
    LT("lt"),

    /**
     * Luxembourg.
     * 
     */
    @XmlEnumValue("lu")
    LU("lu"),

    /**
     * Latvia.
     * 
     */
    @XmlEnumValue("lv")
    LV("lv"),

    /**
     * Libyan Arab Jamahiriya.
     * 
     */
    @XmlEnumValue("ly")
    LY("ly"),

    /**
     * Morocco.
     * 
     */
    @XmlEnumValue("ma")
    MA("ma"),

    /**
     * Monaco.
     * 
     */
    @XmlEnumValue("mc")
    MC("mc"),

    /**
     * Moldova, Republic of.
     * 
     */
    @XmlEnumValue("md")
    MD("md"),

    /**
     * Madagascar.
     * 
     */
    @XmlEnumValue("mg")
    MG("mg"),

    /**
     * Marshall Islands.
     * 
     */
    @XmlEnumValue("mh")
    MH("mh"),

    /**
     * Macedonia, The Former Yugoslav Republic of.
     * 
     */
    @XmlEnumValue("mk")
    MK("mk"),

    /**
     * Mali.
     * 
     */
    @XmlEnumValue("ml")
    ML("ml"),

    /**
     * Myanmar.
     * 
     */
    @XmlEnumValue("mm")
    MM("mm"),

    /**
     * Mongolia.
     * 
     */
    @XmlEnumValue("mn")
    MN("mn"),

    /**
     * Macau.
     * 
     */
    @XmlEnumValue("mo")
    MO("mo"),

    /**
     * Northern Mariana Islands.
     * 
     */
    @XmlEnumValue("mp")
    MP("mp"),

    /**
     * Martinique.
     * 
     */
    @XmlEnumValue("mq")
    MQ("mq"),

    /**
     * Mauritania.
     * 
     */
    @XmlEnumValue("mr")
    MR("mr"),

    /**
     * Montserrat.
     * 
     */
    @XmlEnumValue("ms")
    MS("ms"),

    /**
     * Malta.
     * 
     */
    @XmlEnumValue("mt")
    MT("mt"),

    /**
     * Mauritius.
     * 
     */
    @XmlEnumValue("mu")
    MU("mu"),

    /**
     * Maldives.
     * 
     */
    @XmlEnumValue("mv")
    MV("mv"),

    /**
     * Malawi.
     * 
     */
    @XmlEnumValue("mw")
    MW("mw"),

    /**
     * Mexico.
     * 
     */
    @XmlEnumValue("mx")
    MX("mx"),

    /**
     * Malaysia.
     * 
     */
    @XmlEnumValue("my")
    MY("my"),

    /**
     * Mozambique.
     * 
     */
    @XmlEnumValue("mz")
    MZ("mz"),

    /**
     * Namibia.
     * 
     */
    @XmlEnumValue("na")
    NA("na"),

    /**
     * New Caledonia.
     * 
     */
    @XmlEnumValue("nc")
    NC("nc"),

    /**
     * Niger.
     * 
     */
    @XmlEnumValue("ne")
    NE("ne"),

    /**
     * Norfolk Island.
     * 
     */
    @XmlEnumValue("nf")
    NF("nf"),

    /**
     * Nigeria.
     * 
     */
    @XmlEnumValue("ng")
    NG("ng"),

    /**
     * Nicaragua.
     * 
     */
    @XmlEnumValue("ni")
    NI("ni"),

    /**
     * Netherlands.
     * 
     */
    @XmlEnumValue("nl")
    NL("nl"),

    /**
     * Norway.
     * 
     */
    @XmlEnumValue("no")
    NO("no"),

    /**
     * Nepal.
     * 
     */
    @XmlEnumValue("np")
    NP("np"),

    /**
     * Nauru.
     * 
     */
    @XmlEnumValue("nr")
    NR("nr"),

    /**
     * Niue.
     * 
     */
    @XmlEnumValue("nu")
    NU("nu"),

    /**
     * New Zealand.
     * 
     */
    @XmlEnumValue("nz")
    NZ("nz"),

    /**
     * Oman.
     * 
     */
    @XmlEnumValue("om")
    OM("om"),

    /**
     * Panama.
     * 
     */
    @XmlEnumValue("pa")
    PA("pa"),

    /**
     * Peru.
     * 
     */
    @XmlEnumValue("pe")
    PE("pe"),

    /**
     * French Polynesia.
     * 
     */
    @XmlEnumValue("pf")
    PF("pf"),

    /**
     * Papua New Guinea.
     * 
     */
    @XmlEnumValue("pg")
    PG("pg"),

    /**
     * Philippines.
     * 
     */
    @XmlEnumValue("ph")
    PH("ph"),

    /**
     * Pakistan.
     * 
     */
    @XmlEnumValue("pk")
    PK("pk"),

    /**
     * Poland.
     * 
     */
    @XmlEnumValue("pl")
    PL("pl"),

    /**
     * Saint Pierre and Miquelon.
     * 
     */
    @XmlEnumValue("pm")
    PM("pm"),

    /**
     * Pitcairn Island.
     * 
     */
    @XmlEnumValue("pn")
    PN("pn"),

    /**
     * Puerto Rico.
     * 
     */
    @XmlEnumValue("pr")
    PR("pr"),

    /**
     * Palestinian Territories.
     * 
     */
    @XmlEnumValue("ps")
    PS("ps"),

    /**
     * Portugal.
     * 
     */
    @XmlEnumValue("pt")
    PT("pt"),

    /**
     * Palau.
     * 
     */
    @XmlEnumValue("pw")
    PW("pw"),

    /**
     * Paraguay.
     * 
     */
    @XmlEnumValue("py")
    PY("py"),

    /**
     * Qatar.
     * 
     */
    @XmlEnumValue("qa")
    QA("qa"),

    /**
     * Reunion Island.
     * 
     */
    @XmlEnumValue("re")
    RE("re"),

    /**
     * Romania.
     * 
     */
    @XmlEnumValue("ro")
    RO("ro"),

    /**
     * Russian Federation.
     * 
     */
    @XmlEnumValue("ru")
    RU("ru"),

    /**
     * Rwanda.
     * 
     */
    @XmlEnumValue("rw")
    RW("rw"),

    /**
     * Saudi Arabia.
     * 
     */
    @XmlEnumValue("sa")
    SA("sa"),

    /**
     * Solomon Islands.
     * 
     */
    @XmlEnumValue("sb")
    SB("sb"),

    /**
     * Seychelles.
     * 
     */
    @XmlEnumValue("sc")
    SC("sc"),

    /**
     * Sudan.
     * 
     */
    @XmlEnumValue("sd")
    SD("sd"),

    /**
     * Sweden.
     * 
     */
    @XmlEnumValue("se")
    SE("se"),

    /**
     * Singapore.
     * 
     */
    @XmlEnumValue("sg")
    SG("sg"),

    /**
     * Saint Helena.
     * 
     */
    @XmlEnumValue("sh")
    SH("sh"),

    /**
     * Slovenia.
     * 
     */
    @XmlEnumValue("si")
    SI("si"),

    /**
     * Svalbard and Jan Mayen Islands.
     * 
     */
    @XmlEnumValue("sj")
    SJ("sj"),

    /**
     * Slovak Republic.
     * 
     */
    @XmlEnumValue("sk")
    SK("sk"),

    /**
     * Sierra Leone.
     * 
     */
    @XmlEnumValue("sl")
    SL("sl"),

    /**
     * San Marino.
     * 
     */
    @XmlEnumValue("sm")
    SM("sm"),

    /**
     * Senegal.
     * 
     */
    @XmlEnumValue("sn")
    SN("sn"),

    /**
     * Somalia.
     * 
     */
    @XmlEnumValue("so")
    SO("so"),

    /**
     * Suriname.
     * 
     */
    @XmlEnumValue("sr")
    SR("sr"),

    /**
     * Sao Tome and Principe.
     * 
     */
    @XmlEnumValue("st")
    ST("st"),

    /**
     * El Salvador.
     * 
     */
    @XmlEnumValue("sv")
    SV("sv"),

    /**
     * Syrian Arab Republic.
     * 
     */
    @XmlEnumValue("sy")
    SY("sy"),

    /**
     * Swaziland.
     * 
     */
    @XmlEnumValue("sz")
    SZ("sz"),

    /**
     * Turks and Caicos Islands.
     * 
     */
    @XmlEnumValue("tc")
    TC("tc"),

    /**
     * Chad.
     * 
     */
    @XmlEnumValue("td")
    TD("td"),

    /**
     * French Southern Territories.
     * 
     */
    @XmlEnumValue("tf")
    TF("tf"),

    /**
     * Togo.
     * 
     */
    @XmlEnumValue("tg")
    TG("tg"),

    /**
     * Thailand.
     * 
     */
    @XmlEnumValue("th")
    TH("th"),

    /**
     * Tajikistan.
     * 
     */
    @XmlEnumValue("tj")
    TJ("tj"),

    /**
     * Tokelau.
     * 
     */
    @XmlEnumValue("tk")
    TK("tk"),

    /**
     * Timor-Leste.
     * 
     */
    @XmlEnumValue("tl")
    TL("tl"),

    /**
     * Turkmenistan.
     * 
     */
    @XmlEnumValue("tm")
    TM("tm"),

    /**
     * Tunisia.
     * 
     */
    @XmlEnumValue("tn")
    TN("tn"),

    /**
     * Tonga.
     * 
     */
    @XmlEnumValue("to")
    TO("to"),

    /**
     * East Timor.
     * 
     */
    @XmlEnumValue("tp")
    TP("tp"),

    /**
     * Turkey.
     * 
     */
    @XmlEnumValue("tr")
    TR("tr"),

    /**
     * Trinidad and Tobago.
     * 
     */
    @XmlEnumValue("tt")
    TT("tt"),

    /**
     * Tuvalu.
     * 
     */
    @XmlEnumValue("tv")
    TV("tv"),

    /**
     * Taiwan.
     * 
     */
    @XmlEnumValue("tw")
    TW("tw"),

    /**
     * Tanzania.
     * 
     */
    @XmlEnumValue("tz")
    TZ("tz"),

    /**
     * Ukraine.
     * 
     */
    @XmlEnumValue("ua")
    UA("ua"),

    /**
     * Uganda.
     * 
     */
    @XmlEnumValue("ug")
    UG("ug"),

    /**
     * United Kingdom.
     * 
     */
    @XmlEnumValue("uk")
    UK("uk"),

    /**
     * United States Minor Outlying Islands.
     * 
     */
    @XmlEnumValue("um")
    UM("um"),

    /**
     * United States.
     * 
     */
    @XmlEnumValue("us")
    US("us"),

    /**
     * Uruguay.
     * 
     */
    @XmlEnumValue("uy")
    UY("uy"),

    /**
     * Uzbekistan.
     * 
     */
    @XmlEnumValue("uz")
    UZ("uz"),

    /**
     * Holy See (Vatican City State)
     * 
     */
    @XmlEnumValue("va")
    VA("va"),

    /**
     * Saint Vincent and the Grenadines.
     * 
     */
    @XmlEnumValue("vc")
    VC("vc"),

    /**
     * Venezuela.
     * 
     */
    @XmlEnumValue("ve")
    VE("ve"),

    /**
     * Virgin Islands, British.
     * 
     */
    @XmlEnumValue("vg")
    VG("vg"),

    /**
     * Virgin Islands, Us.
     * 
     */
    @XmlEnumValue("vi")
    VI("vi"),

    /**
     * Vietnam.
     * 
     */
    @XmlEnumValue("vn")
    VN("vn"),

    /**
     * Vanuatu.
     * 
     */
    @XmlEnumValue("vu")
    VU("vu"),

    /**
     * Wallis and Futuna Islands.
     * 
     */
    @XmlEnumValue("wf")
    WF("wf"),

    /**
     * Samoa.
     * 
     */
    @XmlEnumValue("ws")
    WS("ws"),

    /**
     * Yemen.
     * 
     */
    @XmlEnumValue("ye")
    YE("ye"),

    /**
     * Mayotte.
     * 
     */
    @XmlEnumValue("yt")
    YT("yt"),

    /**
     * Yugoslavia.
     * 
     */
    @XmlEnumValue("yu")
    YU("yu"),

    /**
     * South Africa.
     * 
     */
    @XmlEnumValue("za")
    ZA("za"),

    /**
     * Zambia.
     * 
     */
    @XmlEnumValue("zm")
    ZM("zm"),

    /**
     * Zimbabwe.
     * 
     */
    @XmlEnumValue("zw")
    ZW("zw");
    private final String value;

    IanaCountryTldEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IanaCountryTldEnumeration fromValue(String v) {
        for (IanaCountryTldEnumeration c: IanaCountryTldEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
