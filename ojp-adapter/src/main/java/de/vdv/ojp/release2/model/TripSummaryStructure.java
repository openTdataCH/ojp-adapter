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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Structure for trip overview information (only implementation related and therefore not modelled in Transmodel).
 * 
 * <p>Java-Klasse für TripSummaryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripSummaryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TripId" type="{http://www.vdv.de/ojp}TripObjectIdType"/&gt;
 *         &lt;element name="Origin" type="{http://www.vdv.de/ojp}PlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.vdv.de/ojp}PlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PTLegs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}OperatingDaysGroup" minOccurs="0"/&gt;
 *         &lt;element name="Feasibility" type="{http://www.vdv.de/ojp}FeasibilityEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRefs" type="{http://www.vdv.de/ojp}SituationRefList" minOccurs="0"/&gt;
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
@XmlType(name = "TripSummaryStructure", propOrder = {
    "tripId",
    "origin",
    "destination",
    "duration",
    "startTime",
    "endTime",
    "ptLegs",
    "distance",
    "operatingDays",
    "operatingDaysDescription",
    "feasibility",
    "situationFullRefs",
    "extension"
})
public class TripSummaryStructure {

    @XmlElement(name = "TripId", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tripId;
    @XmlElement(name = "Origin")
    protected PlaceRefStructure origin;
    @XmlElement(name = "Destination")
    protected PlaceRefStructure destination;
    @XmlElement(name = "Duration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime endTime;
    @XmlElement(name = "PTLegs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ptLegs;
    @XmlElement(name = "Distance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distance;
    @XmlElement(name = "OperatingDays")
    protected OperatingDaysStructure operatingDays;
    @XmlElement(name = "OperatingDaysDescription")
    protected InternationalTextStructure operatingDaysDescription;
    @XmlElement(name = "Feasibility")
    @XmlSchemaType(name = "string")
    protected List<FeasibilityEnumeration> feasibility;
    @XmlElement(name = "SituationFullRefs")
    protected SituationRefList situationFullRefs;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der tripId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripId() {
        return tripId;
    }

    /**
     * Legt den Wert der tripId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripId(String value) {
        this.tripId = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setOrigin(PlaceRefStructure value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setDestination(PlaceRefStructure value) {
        this.destination = value;
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
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(ZonedDateTime value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(ZonedDateTime value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der ptLegs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPTLegs() {
        return ptLegs;
    }

    /**
     * Legt den Wert der ptLegs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPTLegs(BigInteger value) {
        this.ptLegs = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der operatingDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDaysStructure }
     *     
     */
    public OperatingDaysStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Legt den Wert der operatingDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDaysStructure }
     *     
     */
    public void setOperatingDays(OperatingDaysStructure value) {
        this.operatingDays = value;
    }

    /**
     * Ruft den Wert der operatingDaysDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getOperatingDaysDescription() {
        return operatingDaysDescription;
    }

    /**
     * Legt den Wert der operatingDaysDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setOperatingDaysDescription(InternationalTextStructure value) {
        this.operatingDaysDescription = value;
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

    public TripSummaryStructure withTripId(String value) {
        setTripId(value);
        return this;
    }

    public TripSummaryStructure withOrigin(PlaceRefStructure value) {
        setOrigin(value);
        return this;
    }

    public TripSummaryStructure withDestination(PlaceRefStructure value) {
        setDestination(value);
        return this;
    }

    public TripSummaryStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public TripSummaryStructure withStartTime(ZonedDateTime value) {
        setStartTime(value);
        return this;
    }

    public TripSummaryStructure withEndTime(ZonedDateTime value) {
        setEndTime(value);
        return this;
    }

    public TripSummaryStructure withPTLegs(BigInteger value) {
        setPTLegs(value);
        return this;
    }

    public TripSummaryStructure withDistance(BigInteger value) {
        setDistance(value);
        return this;
    }

    public TripSummaryStructure withOperatingDays(OperatingDaysStructure value) {
        setOperatingDays(value);
        return this;
    }

    public TripSummaryStructure withOperatingDaysDescription(InternationalTextStructure value) {
        setOperatingDaysDescription(value);
        return this;
    }

    public TripSummaryStructure withFeasibility(FeasibilityEnumeration... values) {
        if (values!= null) {
            for (FeasibilityEnumeration value: values) {
                getFeasibility().add(value);
            }
        }
        return this;
    }

    public TripSummaryStructure withFeasibility(Collection<FeasibilityEnumeration> values) {
        if (values!= null) {
            getFeasibility().addAll(values);
        }
        return this;
    }

    public TripSummaryStructure withSituationFullRefs(SituationRefList value) {
        setSituationFullRefs(value);
        return this;
    }

    public TripSummaryStructure withExtension(Object value) {
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
