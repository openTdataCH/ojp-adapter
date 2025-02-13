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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Type for a reference to JOURNEY PART. (since SIRI 2.0)
 *
 * <p>Java-Klasse für JourneyPartInfoStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="JourneyPartInfoStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyPartRef" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *         &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="OperatorRef" type="{http://www.siri.org.uk/siri}OperatorRefStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}CompoundTrainRef" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPartViewGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPartInfoStructure", propOrder = {
    "journeyPartRef",
    "trainNumberRef",
    "operatorRef",
    "compoundTrainRef",
    "fromStopPointRef",
    "toStopPointRef",
    "startTime",
    "endTime"
})
@XmlSeeAlso({
    RelatedJourneyPartStructure.class
})
public class JourneyPartInfoStructure {

    @XmlElement(name = "JourneyPartRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String journeyPartRef;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "CompoundTrainRef")
    protected CompoundTrainRefStructure compoundTrainRef;
    @XmlElement(name = "FromStopPointRef")
    protected StopPointRefStructure fromStopPointRef;
    @XmlElement(name = "ToStopPointRef")
    protected StopPointRefStructure toStopPointRef;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime endTime;

    /**
     * Ruft den Wert der journeyPartRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getJourneyPartRef() {
        return journeyPartRef;
    }

    /**
     * Legt den Wert der journeyPartRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setJourneyPartRef(String value) {
        this.journeyPartRef = value;
    }

    /**
     * Ruft den Wert der trainNumberRef-Eigenschaft ab.
     *
     * @return possible object is {@link TrainNumberRefStructure }
     */
    public TrainNumberRefStructure getTrainNumberRef() {
        return trainNumberRef;
    }

    /**
     * Legt den Wert der trainNumberRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainNumberRefStructure }
     */
    public void setTrainNumberRef(TrainNumberRefStructure value) {
        this.trainNumberRef = value;
    }

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     *
     * @return possible object is {@link OperatorRefStructure }
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link OperatorRefStructure }
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Reference to COMPOUND TRAIN that represents the train formation/composition as a whole (for this JOURNEY PART). (since SIRI 2.1) A journey does always have one or more JOURNEY PARTs for which
     * the train formation/composition remains unchanged.
     *
     * @return possible object is {@link CompoundTrainRefStructure }
     */
    public CompoundTrainRefStructure getCompoundTrainRef() {
        return compoundTrainRef;
    }

    /**
     * Legt den Wert der compoundTrainRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link CompoundTrainRefStructure }
     */
    public void setCompoundTrainRef(CompoundTrainRefStructure value) {
        this.compoundTrainRef = value;
    }

    /**
     * Ruft den Wert der fromStopPointRef-Eigenschaft ab.
     *
     * @return possible object is {@link StopPointRefStructure }
     */
    public StopPointRefStructure getFromStopPointRef() {
        return fromStopPointRef;
    }

    /**
     * Legt den Wert der fromStopPointRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPointRefStructure }
     */
    public void setFromStopPointRef(StopPointRefStructure value) {
        this.fromStopPointRef = value;
    }

    /**
     * Ruft den Wert der toStopPointRef-Eigenschaft ab.
     *
     * @return possible object is {@link StopPointRefStructure }
     */
    public StopPointRefStructure getToStopPointRef() {
        return toStopPointRef;
    }

    /**
     * Legt den Wert der toStopPointRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPointRefStructure }
     */
    public void setToStopPointRef(StopPointRefStructure value) {
        this.toStopPointRef = value;
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

    public JourneyPartInfoStructure withJourneyPartRef(String value) {
        setJourneyPartRef(value);
        return this;
    }

    public JourneyPartInfoStructure withTrainNumberRef(TrainNumberRefStructure value) {
        setTrainNumberRef(value);
        return this;
    }

    public JourneyPartInfoStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public JourneyPartInfoStructure withCompoundTrainRef(CompoundTrainRefStructure value) {
        setCompoundTrainRef(value);
        return this;
    }

    public JourneyPartInfoStructure withFromStopPointRef(StopPointRefStructure value) {
        setFromStopPointRef(value);
        return this;
    }

    public JourneyPartInfoStructure withToStopPointRef(StopPointRefStructure value) {
        setToStopPointRef(value);
        return this;
    }

    public JourneyPartInfoStructure withStartTime(ZonedDateTime value) {
        setStartTime(value);
        return this;
    }

    public JourneyPartInfoStructure withEndTime(ZonedDateTime value) {
        setEndTime(value);
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
