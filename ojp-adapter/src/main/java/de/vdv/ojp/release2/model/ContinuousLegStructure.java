//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * [relates to a specific type of RIDE LEG with Timed=false or an ACCESS LEG in TM and NeTEx] leg of a journey that is not bound to a timetable.
 * 
 * <p>Java-Klasse für ContinuousLegStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContinuousLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegStart" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;element name="LegEnd" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;element name="Service" type="{http://www.vdv.de/ojp}ContinuousServiceStructure"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TimeWindowGroup"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="LegDescription" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.vdv.de/ojp}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="LegTrack" type="{http://www.vdv.de/ojp}LegTrackStructure" minOccurs="0"/&gt;
 *         &lt;element name="PathGuidance" type="{http://www.vdv.de/ojp}PathGuidanceStructure" minOccurs="0"/&gt;
 *         &lt;element name="Feasibility" type="{http://www.vdv.de/ojp}FeasibilityEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRefs" type="{http://www.vdv.de/ojp}SituationRefList" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}SustainabilityGroup" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContinuousLegStructure", propOrder = {
    "legStart",
    "legEnd",
    "service",
    "timeWindowStart",
    "timeWindowEnd",
    "duration",
    "legDescription",
    "length",
    "legTrack",
    "pathGuidance",
    "feasibility",
    "situationFullRefs",
    "emissionCO2",
    "extension"
})
public class ContinuousLegStructure {

    @XmlElement(name = "LegStart", required = true)
    protected PlaceRefStructure legStart;
    @XmlElement(name = "LegEnd", required = true)
    protected PlaceRefStructure legEnd;
    @XmlElement(name = "Service", required = true)
    protected ContinuousServiceStructure service;
    @XmlElement(name = "TimeWindowStart", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timeWindowStart;
    @XmlElement(name = "TimeWindowEnd", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timeWindowEnd;
    @XmlElement(name = "Duration", required = true, type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    @XmlElement(name = "LegDescription")
    protected InternationalTextStructure legDescription;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger length;
    @XmlElement(name = "LegTrack")
    protected LegTrackStructure legTrack;
    @XmlElement(name = "PathGuidance")
    protected PathGuidanceStructure pathGuidance;
    @XmlElement(name = "Feasibility")
    @XmlSchemaType(name = "string")
    protected List<FeasibilityEnumeration> feasibility;
    @XmlElement(name = "SituationFullRefs")
    protected SituationRefList situationFullRefs;
    @XmlElement(name = "EmissionCO2")
    protected EmissionCO2Structure emissionCO2;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der legStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getLegStart() {
        return legStart;
    }

    /**
     * Legt den Wert der legStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setLegStart(PlaceRefStructure value) {
        this.legStart = value;
    }

    /**
     * Ruft den Wert der legEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getLegEnd() {
        return legEnd;
    }

    /**
     * Legt den Wert der legEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setLegEnd(PlaceRefStructure value) {
        this.legEnd = value;
    }

    /**
     * Ruft den Wert der service-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousServiceStructure }
     *     
     */
    public ContinuousServiceStructure getService() {
        return service;
    }

    /**
     * Legt den Wert der service-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousServiceStructure }
     *     
     */
    public void setService(ContinuousServiceStructure value) {
        this.service = value;
    }

    /**
     * Ruft den Wert der timeWindowStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTimeWindowStart() {
        return timeWindowStart;
    }

    /**
     * Legt den Wert der timeWindowStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWindowStart(ZonedDateTime value) {
        this.timeWindowStart = value;
    }

    /**
     * Ruft den Wert der timeWindowEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTimeWindowEnd() {
        return timeWindowEnd;
    }

    /**
     * Legt den Wert der timeWindowEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWindowEnd(ZonedDateTime value) {
        this.timeWindowEnd = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der legDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getLegDescription() {
        return legDescription;
    }

    /**
     * Legt den Wert der legDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setLegDescription(InternationalTextStructure value) {
        this.legDescription = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der legTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegTrackStructure }
     *     
     */
    public LegTrackStructure getLegTrack() {
        return legTrack;
    }

    /**
     * Legt den Wert der legTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegTrackStructure }
     *     
     */
    public void setLegTrack(LegTrackStructure value) {
        this.legTrack = value;
    }

    /**
     * Ruft den Wert der pathGuidance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathGuidanceStructure }
     *     
     */
    public PathGuidanceStructure getPathGuidance() {
        return pathGuidance;
    }

    /**
     * Legt den Wert der pathGuidance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathGuidanceStructure }
     *     
     */
    public void setPathGuidance(PathGuidanceStructure value) {
        this.pathGuidance = value;
    }

    /**
     * Gets the value of the feasibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the feasibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeasibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeasibilityEnumeration }
     * 
     * 
     */
    public List<FeasibilityEnumeration> getFeasibility() {
        if (feasibility == null) {
            feasibility = new ArrayList<FeasibilityEnumeration>();
        }
        return this.feasibility;
    }

    /**
     * Ruft den Wert der situationFullRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefList }
     *     
     */
    public SituationRefList getSituationFullRefs() {
        return situationFullRefs;
    }

    /**
     * Legt den Wert der situationFullRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefList }
     *     
     */
    public void setSituationFullRefs(SituationRefList value) {
        this.situationFullRefs = value;
    }

    /**
     * Ruft den Wert der emissionCO2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmissionCO2Structure }
     *     
     */
    public EmissionCO2Structure getEmissionCO2() {
        return emissionCO2;
    }

    /**
     * Legt den Wert der emissionCO2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionCO2Structure }
     *     
     */
    public void setEmissionCO2(EmissionCO2Structure value) {
        this.emissionCO2 = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public ContinuousLegStructure withLegStart(PlaceRefStructure value) {
        setLegStart(value);
        return this;
    }

    public ContinuousLegStructure withLegEnd(PlaceRefStructure value) {
        setLegEnd(value);
        return this;
    }

    public ContinuousLegStructure withService(ContinuousServiceStructure value) {
        setService(value);
        return this;
    }

    public ContinuousLegStructure withTimeWindowStart(ZonedDateTime value) {
        setTimeWindowStart(value);
        return this;
    }

    public ContinuousLegStructure withTimeWindowEnd(ZonedDateTime value) {
        setTimeWindowEnd(value);
        return this;
    }

    public ContinuousLegStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public ContinuousLegStructure withLegDescription(InternationalTextStructure value) {
        setLegDescription(value);
        return this;
    }

    public ContinuousLegStructure withLength(BigInteger value) {
        setLength(value);
        return this;
    }

    public ContinuousLegStructure withLegTrack(LegTrackStructure value) {
        setLegTrack(value);
        return this;
    }

    public ContinuousLegStructure withPathGuidance(PathGuidanceStructure value) {
        setPathGuidance(value);
        return this;
    }

    public ContinuousLegStructure withFeasibility(FeasibilityEnumeration... values) {
        if (values!= null) {
            for (FeasibilityEnumeration value: values) {
                getFeasibility().add(value);
            }
        }
        return this;
    }

    public ContinuousLegStructure withFeasibility(Collection<FeasibilityEnumeration> values) {
        if (values!= null) {
            getFeasibility().addAll(values);
        }
        return this;
    }

    public ContinuousLegStructure withSituationFullRefs(SituationRefList value) {
        setSituationFullRefs(value);
        return this;
    }

    public ContinuousLegStructure withEmissionCO2(EmissionCO2Structure value) {
        setEmissionCO2(value);
        return this;
    }

    public ContinuousLegStructure withExtension(Object value) {
        setExtension(value);
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
