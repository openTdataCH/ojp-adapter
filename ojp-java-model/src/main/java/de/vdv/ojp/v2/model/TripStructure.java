//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

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
 * [an extended form of PT TRIP in TM and NeTEx as it also includes the initial and final access legs to and from public transport] whole journey from passenger origin to passenger destination in one
 * or more LEGs
 *
 * <p>Java-Klasse für TripStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TripStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.vdv.de/ojp}TripObjectIdType"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Transfers" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Distance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="Leg" type="{http://www.vdv.de/ojp}LegStructure" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}OperatingDaysGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripStatusGroup" minOccurs="0"/&gt;
 *         &lt;element name="Feasibility" type="{http://www.vdv.de/ojp}FeasibilityEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRefs" type="{http://www.vdv.de/ojp}SituationRefList" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripStructure", propOrder = {
    "id",
    "duration",
    "startTime",
    "endTime",
    "transfers",
    "distance",
    "leg",
    "operatingDays",
    "operatingDaysDescription",
    "unplanned",
    "cancelled",
    "deviation",
    "delayed",
    "infeasible",
    "feasibility",
    "situationFullRefs",
    "extension"
})
public class TripStructure {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String id;
    @XmlElement(name = "Duration", required = true, type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    @XmlElement(name = "StartTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime startTime;
    @XmlElement(name = "EndTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime endTime;
    @XmlElement(name = "Transfers", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger transfers;
    @XmlElement(name = "Distance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distance;
    @XmlElement(name = "Leg", required = true)
    protected List<LegStructure> leg;
    @XmlElement(name = "OperatingDays")
    protected OperatingDaysStructure operatingDays;
    @XmlElement(name = "OperatingDaysDescription")
    protected InternationalTextStructure operatingDaysDescription;
    @XmlElement(name = "Unplanned", defaultValue = "false")
    protected Boolean unplanned;
    @XmlElement(name = "Cancelled", defaultValue = "false")
    protected Boolean cancelled;
    @XmlElement(name = "Deviation", defaultValue = "false")
    protected Boolean deviation;
    @XmlElement(name = "Delayed", defaultValue = "false")
    protected Boolean delayed;
    @XmlElement(name = "Infeasible", defaultValue = "false")
    protected Boolean infeasible;
    @XmlElement(name = "Feasibility")
    @XmlSchemaType(name = "string")
    protected List<FeasibilityEnumeration> feasibility;
    @XmlElement(name = "SituationFullRefs")
    protected SituationRefList situationFullRefs;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setStartTime(ZonedDateTime value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setEndTime(ZonedDateTime value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der transfers-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getTransfers() {
        return transfers;
    }

    /**
     * Legt den Wert der transfers-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setTransfers(BigInteger value) {
        this.transfers = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

    /**
     * Gets the value of the leg property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the leg property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link LegStructure }
     */
    public List<LegStructure> getLeg() {
        if (leg == null) {
            leg = new ArrayList<LegStructure>();
        }
        return this.leg;
    }

    /**
     * Ruft den Wert der operatingDays-Eigenschaft ab.
     *
     * @return possible object is {@link OperatingDaysStructure }
     */
    public OperatingDaysStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Legt den Wert der operatingDays-Eigenschaft fest.
     *
     * @param value allowed object is {@link OperatingDaysStructure }
     */
    public void setOperatingDays(OperatingDaysStructure value) {
        this.operatingDays = value;
    }

    /**
     * Ruft den Wert der operatingDaysDescription-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getOperatingDaysDescription() {
        return operatingDaysDescription;
    }

    /**
     * Legt den Wert der operatingDaysDescription-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setOperatingDaysDescription(InternationalTextStructure value) {
        this.operatingDaysDescription = value;
    }

    /**
     * Ruft den Wert der unplanned-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isUnplanned() {
        return unplanned;
    }

    /**
     * Legt den Wert der unplanned-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setUnplanned(Boolean value) {
        this.unplanned = value;
    }

    /**
     * Ruft den Wert der cancelled-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isCancelled() {
        return cancelled;
    }

    /**
     * Legt den Wert der cancelled-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setCancelled(Boolean value) {
        this.cancelled = value;
    }

    /**
     * Ruft den Wert der deviation-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isDeviation() {
        return deviation;
    }

    /**
     * Legt den Wert der deviation-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setDeviation(Boolean value) {
        this.deviation = value;
    }

    /**
     * Ruft den Wert der delayed-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isDelayed() {
        return delayed;
    }

    /**
     * Legt den Wert der delayed-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setDelayed(Boolean value) {
        this.delayed = value;
    }

    /**
     * Ruft den Wert der infeasible-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isInfeasible() {
        return infeasible;
    }

    /**
     * Legt den Wert der infeasible-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setInfeasible(Boolean value) {
        this.infeasible = value;
    }

    /**
     * Gets the value of the feasibility property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the feasibility property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeasibility().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FeasibilityEnumeration }
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
     * @return possible object is {@link SituationRefList }
     */
    public SituationRefList getSituationFullRefs() {
        return situationFullRefs;
    }

    /**
     * Legt den Wert der situationFullRefs-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationRefList }
     */
    public void setSituationFullRefs(SituationRefList value) {
        this.situationFullRefs = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     *
     * @return possible object is {@link Object }
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     *
     * @param value allowed object is {@link Object }
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public TripStructure withId(String value) {
        setId(value);
        return this;
    }

    public TripStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public TripStructure withStartTime(ZonedDateTime value) {
        setStartTime(value);
        return this;
    }

    public TripStructure withEndTime(ZonedDateTime value) {
        setEndTime(value);
        return this;
    }

    public TripStructure withTransfers(BigInteger value) {
        setTransfers(value);
        return this;
    }

    public TripStructure withDistance(BigInteger value) {
        setDistance(value);
        return this;
    }

    public TripStructure withLeg(LegStructure... values) {
        if (values != null) {
            for (LegStructure value : values) {
                getLeg().add(value);
            }
        }
        return this;
    }

    public TripStructure withLeg(Collection<LegStructure> values) {
        if (values != null) {
            getLeg().addAll(values);
        }
        return this;
    }

    public TripStructure withOperatingDays(OperatingDaysStructure value) {
        setOperatingDays(value);
        return this;
    }

    public TripStructure withOperatingDaysDescription(InternationalTextStructure value) {
        setOperatingDaysDescription(value);
        return this;
    }

    public TripStructure withUnplanned(Boolean value) {
        setUnplanned(value);
        return this;
    }

    public TripStructure withCancelled(Boolean value) {
        setCancelled(value);
        return this;
    }

    public TripStructure withDeviation(Boolean value) {
        setDeviation(value);
        return this;
    }

    public TripStructure withDelayed(Boolean value) {
        setDelayed(value);
        return this;
    }

    public TripStructure withInfeasible(Boolean value) {
        setInfeasible(value);
        return this;
    }

    public TripStructure withFeasibility(FeasibilityEnumeration... values) {
        if (values != null) {
            for (FeasibilityEnumeration value : values) {
                getFeasibility().add(value);
            }
        }
        return this;
    }

    public TripStructure withFeasibility(Collection<FeasibilityEnumeration> values) {
        if (values != null) {
            getFeasibility().addAll(values);
        }
        return this;
    }

    public TripStructure withSituationFullRefs(SituationRefList value) {
        setSituationFullRefs(value);
        return this;
    }

    public TripStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
