//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Corresponds to a RIDE or PT RIDE LEG in TM 6.2 with the attribute Timed (with related information). Passenger LEG with timetabled schedule.
 * 
 * <p>Java-Klasse für TimedLegStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimedLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegBoard" type="{http://www.vdv.de/ojp}LegBoardStructure"/&gt;
 *         &lt;element name="LegIntermediate" type="{http://www.vdv.de/ojp}LegIntermediateStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LegAlight" type="{http://www.vdv.de/ojp}LegAlightStructure"/&gt;
 *         &lt;element name="Service" type="{http://www.vdv.de/ojp}DatedJourneyStructure"/&gt;
 *         &lt;element name="LegAttribute" type="{http://www.vdv.de/ojp}LegAttributeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}OperatingDaysGroup" minOccurs="0"/&gt;
 *         &lt;element name="LegTrack" type="{http://www.vdv.de/ojp}LegTrackStructure" minOccurs="0"/&gt;
 *         &lt;element name="ParallelService" type="{http://www.vdv.de/ojp}ParallelServiceStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TimedLegStructure", propOrder = {
    "legBoard",
    "legIntermediate",
    "legAlight",
    "service",
    "legAttribute",
    "operatingDays",
    "operatingDaysDescription",
    "legTrack",
    "parallelService",
    "emissionCO2",
    "extension"
})
public class TimedLegStructure {

    @XmlElement(name = "LegBoard", required = true)
    protected LegBoardStructure legBoard;
    @XmlElement(name = "LegIntermediate")
    protected List<LegIntermediateStructure> legIntermediate;
    @XmlElement(name = "LegAlight", required = true)
    protected LegAlightStructure legAlight;
    @XmlElement(name = "Service", required = true)
    protected DatedJourneyStructure service;
    @XmlElement(name = "LegAttribute")
    protected List<LegAttributeStructure> legAttribute;
    @XmlElement(name = "OperatingDays")
    protected OperatingDaysStructure operatingDays;
    @XmlElement(name = "OperatingDaysDescription")
    protected InternationalTextStructure operatingDaysDescription;
    @XmlElement(name = "LegTrack")
    protected LegTrackStructure legTrack;
    @XmlElement(name = "ParallelService")
    protected List<ParallelServiceStructure> parallelService;
    @XmlElement(name = "EmissionCO2")
    protected EmissionCO2Structure emissionCO2;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der legBoard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegBoardStructure }
     *     
     */
    public LegBoardStructure getLegBoard() {
        return legBoard;
    }

    /**
     * Legt den Wert der legBoard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegBoardStructure }
     *     
     */
    public void setLegBoard(LegBoardStructure value) {
        this.legBoard = value;
    }

    /**
     * Gets the value of the legIntermediate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the legIntermediate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegIntermediate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegIntermediateStructure }
     * 
     * 
     */
    public List<LegIntermediateStructure> getLegIntermediate() {
        if (legIntermediate == null) {
            legIntermediate = new ArrayList<LegIntermediateStructure>();
        }
        return this.legIntermediate;
    }

    /**
     * Ruft den Wert der legAlight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegAlightStructure }
     *     
     */
    public LegAlightStructure getLegAlight() {
        return legAlight;
    }

    /**
     * Legt den Wert der legAlight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegAlightStructure }
     *     
     */
    public void setLegAlight(LegAlightStructure value) {
        this.legAlight = value;
    }

    /**
     * Ruft den Wert der service-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatedJourneyStructure }
     *     
     */
    public DatedJourneyStructure getService() {
        return service;
    }

    /**
     * Legt den Wert der service-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedJourneyStructure }
     *     
     */
    public void setService(DatedJourneyStructure value) {
        this.service = value;
    }

    /**
     * Gets the value of the legAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the legAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegAttributeStructure }
     * 
     * 
     */
    public List<LegAttributeStructure> getLegAttribute() {
        if (legAttribute == null) {
            legAttribute = new ArrayList<LegAttributeStructure>();
        }
        return this.legAttribute;
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
     * Gets the value of the parallelService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parallelService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParallelService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParallelServiceStructure }
     * 
     * 
     */
    public List<ParallelServiceStructure> getParallelService() {
        if (parallelService == null) {
            parallelService = new ArrayList<ParallelServiceStructure>();
        }
        return this.parallelService;
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

    public TimedLegStructure withLegBoard(LegBoardStructure value) {
        setLegBoard(value);
        return this;
    }

    public TimedLegStructure withLegIntermediate(LegIntermediateStructure... values) {
        if (values!= null) {
            for (LegIntermediateStructure value: values) {
                getLegIntermediate().add(value);
            }
        }
        return this;
    }

    public TimedLegStructure withLegIntermediate(Collection<LegIntermediateStructure> values) {
        if (values!= null) {
            getLegIntermediate().addAll(values);
        }
        return this;
    }

    public TimedLegStructure withLegAlight(LegAlightStructure value) {
        setLegAlight(value);
        return this;
    }

    public TimedLegStructure withService(DatedJourneyStructure value) {
        setService(value);
        return this;
    }

    public TimedLegStructure withLegAttribute(LegAttributeStructure... values) {
        if (values!= null) {
            for (LegAttributeStructure value: values) {
                getLegAttribute().add(value);
            }
        }
        return this;
    }

    public TimedLegStructure withLegAttribute(Collection<LegAttributeStructure> values) {
        if (values!= null) {
            getLegAttribute().addAll(values);
        }
        return this;
    }

    public TimedLegStructure withOperatingDays(OperatingDaysStructure value) {
        setOperatingDays(value);
        return this;
    }

    public TimedLegStructure withOperatingDaysDescription(InternationalTextStructure value) {
        setOperatingDaysDescription(value);
        return this;
    }

    public TimedLegStructure withLegTrack(LegTrackStructure value) {
        setLegTrack(value);
        return this;
    }

    public TimedLegStructure withParallelService(ParallelServiceStructure... values) {
        if (values!= null) {
            for (ParallelServiceStructure value: values) {
                getParallelService().add(value);
            }
        }
        return this;
    }

    public TimedLegStructure withParallelService(Collection<ParallelServiceStructure> values) {
        if (values!= null) {
            getParallelService().addAll(values);
        }
        return this;
    }

    public TimedLegStructure withEmissionCO2(EmissionCO2Structure value) {
        setEmissionCO2(value);
        return this;
    }

    public TimedLegStructure withExtension(Object value) {
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
