//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AirSubmodesOfTransportEnumeration;
import uk.org.siri.siri.BusSubmodesOfTransportEnumeration;
import uk.org.siri.siri.CoachSubmodesOfTransportEnumeration;
import uk.org.siri.siri.FunicularSubmodesOfTransportEnumeration;
import uk.org.siri.siri.MetroSubmodesOfTransportEnumeration;
import uk.org.siri.siri.RailSubmodesOfTransportEnumeration;
import uk.org.siri.siri.TelecabinSubmodesOfTransportEnumeration;
import uk.org.siri.siri.TramSubmodesOfTransportEnumeration;
import uk.org.siri.siri.VehicleModesOfTransportEnumeration;
import uk.org.siri.siri.WaterSubmodesOfTransportEnumeration;


/**
 * [a specialisation of MODE in TMv6] an extended range of VEHICLE MODEs, aggregating them with some SUBMODEs
 * 
 * <p>Java-Klasse für ModeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ModeGroup"/&gt;
 *         &lt;element name="Name" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="ShortName" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeStructure", propOrder = {
    "ptMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "funicularSubmode",
    "metroSubmode",
    "tramSubmode",
    "telecabinSubmode",
    "railSubmode",
    "waterSubmode",
    "name",
    "shortName",
    "description"
})
public class ModeStructure {

    @XmlElement(name = "PtMode", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModesOfTransportEnumeration ptMode;
    @XmlElement(name = "AirSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AirSubmodesOfTransportEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected BusSubmodesOfTransportEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CoachSubmodesOfTransportEnumeration coachSubmode;
    @XmlElement(name = "FunicularSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FunicularSubmodesOfTransportEnumeration funicularSubmode;
    @XmlElement(name = "MetroSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MetroSubmodesOfTransportEnumeration metroSubmode;
    @XmlElement(name = "TramSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TramSubmodesOfTransportEnumeration tramSubmode;
    @XmlElement(name = "TelecabinSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TelecabinSubmodesOfTransportEnumeration telecabinSubmode;
    @XmlElement(name = "RailSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RailSubmodesOfTransportEnumeration railSubmode;
    @XmlElement(name = "WaterSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected WaterSubmodesOfTransportEnumeration waterSubmode;
    @XmlElement(name = "Name")
    protected InternationalTextStructure name;
    @XmlElement(name = "ShortName")
    protected InternationalTextStructure shortName;
    @XmlElement(name = "Description")
    protected InternationalTextStructure description;

    /**
     * Ruft den Wert der ptMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public VehicleModesOfTransportEnumeration getPtMode() {
        return ptMode;
    }

    /**
     * Legt den Wert der ptMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public void setPtMode(VehicleModesOfTransportEnumeration value) {
        this.ptMode = value;
    }

    /**
     * Ruft den Wert der airSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public AirSubmodesOfTransportEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Legt den Wert der airSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public void setAirSubmode(AirSubmodesOfTransportEnumeration value) {
        this.airSubmode = value;
    }

    /**
     * Ruft den Wert der busSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public BusSubmodesOfTransportEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Legt den Wert der busSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public void setBusSubmode(BusSubmodesOfTransportEnumeration value) {
        this.busSubmode = value;
    }

    /**
     * Ruft den Wert der coachSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Legt den Wert der coachSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public void setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        this.coachSubmode = value;
    }

    /**
     * Ruft den Wert der funicularSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FunicularSubmodesOfTransportEnumeration }
     *     
     */
    public FunicularSubmodesOfTransportEnumeration getFunicularSubmode() {
        return funicularSubmode;
    }

    /**
     * Legt den Wert der funicularSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FunicularSubmodesOfTransportEnumeration }
     *     
     */
    public void setFunicularSubmode(FunicularSubmodesOfTransportEnumeration value) {
        this.funicularSubmode = value;
    }

    /**
     * Ruft den Wert der metroSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Legt den Wert der metroSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public void setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        this.metroSubmode = value;
    }

    /**
     * Ruft den Wert der tramSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public TramSubmodesOfTransportEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Legt den Wert der tramSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public void setTramSubmode(TramSubmodesOfTransportEnumeration value) {
        this.tramSubmode = value;
    }

    /**
     * Ruft den Wert der telecabinSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TelecabinSubmodesOfTransportEnumeration }
     *     
     */
    public TelecabinSubmodesOfTransportEnumeration getTelecabinSubmode() {
        return telecabinSubmode;
    }

    /**
     * Legt den Wert der telecabinSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecabinSubmodesOfTransportEnumeration }
     *     
     */
    public void setTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        this.telecabinSubmode = value;
    }

    /**
     * Ruft den Wert der railSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public RailSubmodesOfTransportEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Legt den Wert der railSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public void setRailSubmode(RailSubmodesOfTransportEnumeration value) {
        this.railSubmode = value;
    }

    /**
     * Ruft den Wert der waterSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Legt den Wert der waterSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public void setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        this.waterSubmode = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setName(InternationalTextStructure value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setShortName(InternationalTextStructure value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setDescription(InternationalTextStructure value) {
        this.description = value;
    }

    public ModeStructure withPtMode(VehicleModesOfTransportEnumeration value) {
        setPtMode(value);
        return this;
    }

    public ModeStructure withAirSubmode(AirSubmodesOfTransportEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    public ModeStructure withBusSubmode(BusSubmodesOfTransportEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    public ModeStructure withCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    public ModeStructure withFunicularSubmode(FunicularSubmodesOfTransportEnumeration value) {
        setFunicularSubmode(value);
        return this;
    }

    public ModeStructure withMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    public ModeStructure withTramSubmode(TramSubmodesOfTransportEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    public ModeStructure withTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    public ModeStructure withRailSubmode(RailSubmodesOfTransportEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    public ModeStructure withWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    public ModeStructure withName(InternationalTextStructure value) {
        setName(value);
        return this;
    }

    public ModeStructure withShortName(InternationalTextStructure value) {
        setShortName(value);
        return this;
    }

    public ModeStructure withDescription(InternationalTextStructure value) {
        setDescription(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
