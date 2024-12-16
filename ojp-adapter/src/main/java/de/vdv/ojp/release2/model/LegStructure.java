//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.time.Duration;
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
import uk.org.siri.siri.ParticipantRefStructure;


/**
 * A single stage of a TRIP that is made without change of MODE or service (e.g., between each interchange). Implements LEG from TM 6.2.
 * 
 * <p>Java-Klasse für LegStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.vdv.de/ojp}LegObjectIdType"/&gt;
 *         &lt;element name="ParticipantRef" type="{http://www.siri.org.uk/siri}ParticipantRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TimedLeg" type="{http://www.vdv.de/ojp}TimedLegStructure"/&gt;
 *           &lt;element name="TransferLeg" type="{http://www.vdv.de/ojp}TransferLegStructure"/&gt;
 *           &lt;element name="ContinuousLeg" type="{http://www.vdv.de/ojp}ContinuousLegStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}SustainabilityGroup" minOccurs="0"/&gt;
 *         &lt;element name="Changed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegStructure", propOrder = {
    "id",
    "participantRef",
    "duration",
    "timedLeg",
    "transferLeg",
    "continuousLeg",
    "emissionCO2",
    "changed"
})
public class LegStructure {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String id;
    @XmlElement(name = "ParticipantRef")
    protected ParticipantRefStructure participantRef;
    @XmlElement(name = "Duration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    @XmlElement(name = "TimedLeg")
    protected TimedLegStructure timedLeg;
    @XmlElement(name = "TransferLeg")
    protected TransferLegStructure transferLeg;
    @XmlElement(name = "ContinuousLeg")
    protected ContinuousLegStructure continuousLeg;
    @XmlElement(name = "EmissionCO2")
    protected EmissionCO2Structure emissionCO2;
    @XmlElement(name = "Changed")
    protected Boolean changed;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der participantRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getParticipantRef() {
        return participantRef;
    }

    /**
     * Legt den Wert der participantRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setParticipantRef(ParticipantRefStructure value) {
        this.participantRef = value;
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
     * Ruft den Wert der timedLeg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimedLegStructure }
     *     
     */
    public TimedLegStructure getTimedLeg() {
        return timedLeg;
    }

    /**
     * Legt den Wert der timedLeg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimedLegStructure }
     *     
     */
    public void setTimedLeg(TimedLegStructure value) {
        this.timedLeg = value;
    }

    /**
     * Ruft den Wert der transferLeg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransferLegStructure }
     *     
     */
    public TransferLegStructure getTransferLeg() {
        return transferLeg;
    }

    /**
     * Legt den Wert der transferLeg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferLegStructure }
     *     
     */
    public void setTransferLeg(TransferLegStructure value) {
        this.transferLeg = value;
    }

    /**
     * Ruft den Wert der continuousLeg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousLegStructure }
     *     
     */
    public ContinuousLegStructure getContinuousLeg() {
        return continuousLeg;
    }

    /**
     * Legt den Wert der continuousLeg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousLegStructure }
     *     
     */
    public void setContinuousLeg(ContinuousLegStructure value) {
        this.continuousLeg = value;
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
     * Ruft den Wert der changed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChanged() {
        return changed;
    }

    /**
     * Legt den Wert der changed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChanged(Boolean value) {
        this.changed = value;
    }

    public LegStructure withId(String value) {
        setId(value);
        return this;
    }

    public LegStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    public LegStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public LegStructure withTimedLeg(TimedLegStructure value) {
        setTimedLeg(value);
        return this;
    }

    public LegStructure withTransferLeg(TransferLegStructure value) {
        setTransferLeg(value);
        return this;
    }

    public LegStructure withContinuousLeg(ContinuousLegStructure value) {
        setContinuousLeg(value);
        return this;
    }

    public LegStructure withEmissionCO2(EmissionCO2Structure value) {
        setEmissionCO2(value);
        return this;
    }

    public LegStructure withChanged(Boolean value) {
        setChanged(value);
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
