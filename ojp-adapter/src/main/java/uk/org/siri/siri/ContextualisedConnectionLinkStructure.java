//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * Connection between two stops within a connection area. Used within the context of one or other end.
 * 
 * <p>Java-Klasse für ContextualisedConnectionLinkStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContextualisedConnectionLinkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectionLinkCode" type="{http://www.siri.org.uk/siri}ConnectionLinkCodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointName" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionDurationGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextualisedConnectionLinkStructure", propOrder = {
    "connectionLinkCode",
    "stopPointRef",
    "stopPointName",
    "defaultDuration",
    "frequentTravellerDuration",
    "occasionalTravellerDuration",
    "impairedAccessDuration"
})
public class ContextualisedConnectionLinkStructure {

    @XmlElement(name = "ConnectionLinkCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String connectionLinkCode;
    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPointName")
    protected NaturalLanguageStringStructure stopPointName;
    @XmlElement(name = "DefaultDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration defaultDuration;
    @XmlElement(name = "FrequentTravellerDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration frequentTravellerDuration;
    @XmlElement(name = "OccasionalTravellerDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration occasionalTravellerDuration;
    @XmlElement(name = "ImpairedAccessDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration impairedAccessDuration;

    /**
     * Ruft den Wert der connectionLinkCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionLinkCode() {
        return connectionLinkCode;
    }

    /**
     * Legt den Wert der connectionLinkCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionLinkCode(String value) {
        this.connectionLinkCode = value;
    }

    /**
     * Ruft den Wert der stopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Legt den Wert der stopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Ruft den Wert der stopPointName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getStopPointName() {
        return stopPointName;
    }

    /**
     * Legt den Wert der stopPointName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setStopPointName(NaturalLanguageStringStructure value) {
        this.stopPointName = value;
    }

    /**
     * Ruft den Wert der defaultDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDefaultDuration() {
        return defaultDuration;
    }

    /**
     * Legt den Wert der defaultDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDuration(Duration value) {
        this.defaultDuration = value;
    }

    /**
     * Ruft den Wert der frequentTravellerDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getFrequentTravellerDuration() {
        return frequentTravellerDuration;
    }

    /**
     * Legt den Wert der frequentTravellerDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentTravellerDuration(Duration value) {
        this.frequentTravellerDuration = value;
    }

    /**
     * Ruft den Wert der occasionalTravellerDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getOccasionalTravellerDuration() {
        return occasionalTravellerDuration;
    }

    /**
     * Legt den Wert der occasionalTravellerDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccasionalTravellerDuration(Duration value) {
        this.occasionalTravellerDuration = value;
    }

    /**
     * Ruft den Wert der impairedAccessDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getImpairedAccessDuration() {
        return impairedAccessDuration;
    }

    /**
     * Legt den Wert der impairedAccessDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpairedAccessDuration(Duration value) {
        this.impairedAccessDuration = value;
    }

    public ContextualisedConnectionLinkStructure withConnectionLinkCode(String value) {
        setConnectionLinkCode(value);
        return this;
    }

    public ContextualisedConnectionLinkStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public ContextualisedConnectionLinkStructure withStopPointName(NaturalLanguageStringStructure value) {
        setStopPointName(value);
        return this;
    }

    public ContextualisedConnectionLinkStructure withDefaultDuration(Duration value) {
        setDefaultDuration(value);
        return this;
    }

    public ContextualisedConnectionLinkStructure withFrequentTravellerDuration(Duration value) {
        setFrequentTravellerDuration(value);
        return this;
    }

    public ContextualisedConnectionLinkStructure withOccasionalTravellerDuration(Duration value) {
        setOccasionalTravellerDuration(value);
        return this;
    }

    public ContextualisedConnectionLinkStructure withImpairedAccessDuration(Duration value) {
        setImpairedAccessDuration(value);
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
