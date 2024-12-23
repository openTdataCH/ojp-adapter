//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for a reference to a connecting journey.
 * 
 * <p>Java-Klasse für ConnectingJourneyRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConnectingJourneyRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FramedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}FramedVehicleJourneyRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="DatedVehicleJourneyIndirectRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyIndirectRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="OperatorRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="ParticipantRef" type="{http://www.siri.org.uk/siri}ParticipantRefStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectingJourneyRefStructure", propOrder = {
    "framedVehicleJourneyRef",
    "datedVehicleJourneyIndirectRef",
    "lineRef",
    "trainNumberRef",
    "operatorRef",
    "participantRef"
})
@XmlSeeAlso({
    RelatedJourneyStructure.class
})
public class ConnectingJourneyRefStructure {

    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "DatedVehicleJourneyIndirectRef")
    protected DatedVehicleJourneyIndirectRefStructure datedVehicleJourneyIndirectRef;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ParticipantRef")
    protected ParticipantRefStructure participantRef;

    /**
     * Ruft den Wert der framedVehicleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public FramedVehicleJourneyRefStructure getFramedVehicleJourneyRef() {
        return framedVehicleJourneyRef;
    }

    /**
     * Legt den Wert der framedVehicleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public void setFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        this.framedVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der datedVehicleJourneyIndirectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyIndirectRefStructure }
     *     
     */
    public DatedVehicleJourneyIndirectRefStructure getDatedVehicleJourneyIndirectRef() {
        return datedVehicleJourneyIndirectRef;
    }

    /**
     * Legt den Wert der datedVehicleJourneyIndirectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyIndirectRefStructure }
     *     
     */
    public void setDatedVehicleJourneyIndirectRef(DatedVehicleJourneyIndirectRefStructure value) {
        this.datedVehicleJourneyIndirectRef = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der trainNumberRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public TrainNumberRefStructure getTrainNumberRef() {
        return trainNumberRef;
    }

    /**
     * Legt den Wert der trainNumberRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public void setTrainNumberRef(TrainNumberRefStructure value) {
        this.trainNumberRef = value;
    }

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
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

    public ConnectingJourneyRefStructure withFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        setFramedVehicleJourneyRef(value);
        return this;
    }

    public ConnectingJourneyRefStructure withDatedVehicleJourneyIndirectRef(DatedVehicleJourneyIndirectRefStructure value) {
        setDatedVehicleJourneyIndirectRef(value);
        return this;
    }

    public ConnectingJourneyRefStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public ConnectingJourneyRefStructure withTrainNumberRef(TrainNumberRefStructure value) {
        setTrainNumberRef(value);
        return this;
    }

    public ConnectingJourneyRefStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public ConnectingJourneyRefStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
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
