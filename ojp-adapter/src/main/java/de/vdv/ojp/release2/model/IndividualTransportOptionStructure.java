//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
import java.time.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * Individual modes and their usage limits as stated by the passenger (TRIP ACCESS CONSTRAINT).
 * 
 * <p>Java-Klasse für IndividualTransportOptionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IndividualTransportOptionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItModeAndModeOfOperation" type="{http://www.vdv.de/ojp}ItModesStructure"/&gt;
 *         &lt;element name="MaxDistance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="MaxDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinDistance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="MinDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Speed" type="{http://www.vdv.de/ojp}OpenPercentType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualTransportOptionStructure", propOrder = {
    "itModeAndModeOfOperation",
    "maxDistance",
    "maxDuration",
    "minDistance",
    "minDuration",
    "speed",
    "additionalTime"
})
public class IndividualTransportOptionStructure {

    @XmlElement(name = "ItModeAndModeOfOperation", required = true)
    protected ItModesStructure itModeAndModeOfOperation;
    @XmlElement(name = "MaxDistance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxDistance;
    @XmlElement(name = "MaxDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maxDuration;
    @XmlElement(name = "MinDistance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minDistance;
    @XmlElement(name = "MinDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minDuration;
    @XmlElement(name = "Speed")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger speed;
    @XmlElement(name = "AdditionalTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration additionalTime;

    /**
     * Ruft den Wert der itModeAndModeOfOperation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItModesStructure }
     *     
     */
    public ItModesStructure getItModeAndModeOfOperation() {
        return itModeAndModeOfOperation;
    }

    /**
     * Legt den Wert der itModeAndModeOfOperation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItModesStructure }
     *     
     */
    public void setItModeAndModeOfOperation(ItModesStructure value) {
        this.itModeAndModeOfOperation = value;
    }

    /**
     * Ruft den Wert der maxDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDistance() {
        return maxDistance;
    }

    /**
     * Legt den Wert der maxDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDistance(BigInteger value) {
        this.maxDistance = value;
    }

    /**
     * Ruft den Wert der maxDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaxDuration() {
        return maxDuration;
    }

    /**
     * Legt den Wert der maxDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDuration(Duration value) {
        this.maxDuration = value;
    }

    /**
     * Ruft den Wert der minDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDistance() {
        return minDistance;
    }

    /**
     * Legt den Wert der minDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDistance(BigInteger value) {
        this.minDistance = value;
    }

    /**
     * Ruft den Wert der minDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinDuration() {
        return minDuration;
    }

    /**
     * Legt den Wert der minDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDuration(Duration value) {
        this.minDuration = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpeed(BigInteger value) {
        this.speed = value;
    }

    /**
     * Ruft den Wert der additionalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAdditionalTime() {
        return additionalTime;
    }

    /**
     * Legt den Wert der additionalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTime(Duration value) {
        this.additionalTime = value;
    }

    public IndividualTransportOptionStructure withItModeAndModeOfOperation(ItModesStructure value) {
        setItModeAndModeOfOperation(value);
        return this;
    }

    public IndividualTransportOptionStructure withMaxDistance(BigInteger value) {
        setMaxDistance(value);
        return this;
    }

    public IndividualTransportOptionStructure withMaxDuration(Duration value) {
        setMaxDuration(value);
        return this;
    }

    public IndividualTransportOptionStructure withMinDistance(BigInteger value) {
        setMinDistance(value);
        return this;
    }

    public IndividualTransportOptionStructure withMinDuration(Duration value) {
        setMinDuration(value);
        return this;
    }

    public IndividualTransportOptionStructure withSpeed(BigInteger value) {
        setSpeed(value);
        return this;
    }

    public IndividualTransportOptionStructure withAdditionalTime(Duration value) {
        setAdditionalTime(value);
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
