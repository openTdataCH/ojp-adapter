//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for Origin and Destination stop of a VEHICLE JOURNEY.
 * 
 * <p>Java-Klasse für DatedVehicleJourneyIndirectRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatedVehicleJourneyIndirectRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/&gt;
 *         &lt;element name="AimedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DestinationRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/&gt;
 *         &lt;element name="AimedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedVehicleJourneyIndirectRefStructure", propOrder = {
    "originRef",
    "aimedDepartureTime",
    "destinationRef",
    "aimedArrivalTime"
})
public class DatedVehicleJourneyIndirectRefStructure {

    @XmlElement(name = "OriginRef", required = true)
    protected StopPointRefStructure originRef;
    @XmlElement(name = "AimedDepartureTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedDepartureTime;
    @XmlElement(name = "DestinationRef", required = true)
    protected StopPointRefStructure destinationRef;
    @XmlElement(name = "AimedArrivalTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedArrivalTime;

    /**
     * Ruft den Wert der originRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getOriginRef() {
        return originRef;
    }

    /**
     * Legt den Wert der originRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setOriginRef(StopPointRefStructure value) {
        this.originRef = value;
    }

    /**
     * Ruft den Wert der aimedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Legt den Wert der aimedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedDepartureTime(ZonedDateTime value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Ruft den Wert der destinationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Legt den Wert der destinationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setDestinationRef(StopPointRefStructure value) {
        this.destinationRef = value;
    }

    /**
     * Ruft den Wert der aimedArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Legt den Wert der aimedArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedArrivalTime(ZonedDateTime value) {
        this.aimedArrivalTime = value;
    }

    public DatedVehicleJourneyIndirectRefStructure withOriginRef(StopPointRefStructure value) {
        setOriginRef(value);
        return this;
    }

    public DatedVehicleJourneyIndirectRefStructure withAimedDepartureTime(ZonedDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public DatedVehicleJourneyIndirectRefStructure withDestinationRef(StopPointRefStructure value) {
        setDestinationRef(value);
        return this;
    }

    public DatedVehicleJourneyIndirectRefStructure withAimedArrivalTime(ZonedDateTime value) {
        setAimedArrivalTime(value);
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
