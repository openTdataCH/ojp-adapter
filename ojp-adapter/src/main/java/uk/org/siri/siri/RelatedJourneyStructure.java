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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für RelatedJourneyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RelatedJourneyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyRelationInfoGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedJourneyStructure", propOrder = {
    "callInfo",
    "journeyParts"
})
public class RelatedJourneyStructure
    extends ConnectingJourneyRefStructure
{

    @XmlElement(name = "CallInfo")
    protected RelatedCallStructure callInfo;
    @XmlElement(name = "JourneyParts")
    protected uk.org.siri.siri.JourneyRelationStructure.JourneyParts journeyParts;

    /**
     * Ruft den Wert der callInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelatedCallStructure }
     *     
     */
    public RelatedCallStructure getCallInfo() {
        return callInfo;
    }

    /**
     * Legt den Wert der callInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedCallStructure }
     *     
     */
    public void setCallInfo(RelatedCallStructure value) {
        this.callInfo = value;
    }

    /**
     * Ruft den Wert der journeyParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.JourneyRelationStructure.JourneyParts }
     *     
     */
    public uk.org.siri.siri.JourneyRelationStructure.JourneyParts getJourneyParts() {
        return journeyParts;
    }

    /**
     * Legt den Wert der journeyParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.JourneyRelationStructure.JourneyParts }
     *     
     */
    public void setJourneyParts(uk.org.siri.siri.JourneyRelationStructure.JourneyParts value) {
        this.journeyParts = value;
    }

    public RelatedJourneyStructure withCallInfo(RelatedCallStructure value) {
        setCallInfo(value);
        return this;
    }

    public RelatedJourneyStructure withJourneyParts(uk.org.siri.siri.JourneyRelationStructure.JourneyParts value) {
        setJourneyParts(value);
        return this;
    }

    @Override
    public RelatedJourneyStructure withFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        setFramedVehicleJourneyRef(value);
        return this;
    }

    @Override
    public RelatedJourneyStructure withDatedVehicleJourneyIndirectRef(DatedVehicleJourneyIndirectRefStructure value) {
        setDatedVehicleJourneyIndirectRef(value);
        return this;
    }

    @Override
    public RelatedJourneyStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    @Override
    public RelatedJourneyStructure withTrainNumberRef(TrainNumberRefStructure value) {
        setTrainNumberRef(value);
        return this;
    }

    @Override
    public RelatedJourneyStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    @Override
    public RelatedJourneyStructure withParticipantRef(ParticipantRefStructure value) {
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
