//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für Impact complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Impact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capacityRemaining" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="numberOfLanesRestricted" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOperationalLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="originalNumberOfLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="residualRoadWidth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="trafficConstrictionType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficConstrictionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="delays" type="{http://datex2.eu/schema/2_0RC1/2_0}Delays" minOccurs="0"/&gt;
 *         &lt;element name="impactExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Impact", propOrder = {
    "capacityRemaining",
    "numberOfLanesRestricted",
    "numberOfOperationalLanes",
    "originalNumberOfLanes",
    "residualRoadWidth",
    "trafficConstrictionType",
    "delays",
    "impactExtension"
})
public class Impact {

    protected Float capacityRemaining;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfLanesRestricted;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfOperationalLanes;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger originalNumberOfLanes;
    protected Float residualRoadWidth;
    @XmlSchemaType(name = "string")
    protected TrafficConstrictionTypeEnum trafficConstrictionType;
    protected Delays delays;
    protected ExtensionType impactExtension;

    /**
     * Ruft den Wert der capacityRemaining-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCapacityRemaining() {
        return capacityRemaining;
    }

    /**
     * Legt den Wert der capacityRemaining-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCapacityRemaining(Float value) {
        this.capacityRemaining = value;
    }

    /**
     * Ruft den Wert der numberOfLanesRestricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLanesRestricted() {
        return numberOfLanesRestricted;
    }

    /**
     * Legt den Wert der numberOfLanesRestricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLanesRestricted(BigInteger value) {
        this.numberOfLanesRestricted = value;
    }

    /**
     * Ruft den Wert der numberOfOperationalLanes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOperationalLanes() {
        return numberOfOperationalLanes;
    }

    /**
     * Legt den Wert der numberOfOperationalLanes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOperationalLanes(BigInteger value) {
        this.numberOfOperationalLanes = value;
    }

    /**
     * Ruft den Wert der originalNumberOfLanes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalNumberOfLanes() {
        return originalNumberOfLanes;
    }

    /**
     * Legt den Wert der originalNumberOfLanes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalNumberOfLanes(BigInteger value) {
        this.originalNumberOfLanes = value;
    }

    /**
     * Ruft den Wert der residualRoadWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResidualRoadWidth() {
        return residualRoadWidth;
    }

    /**
     * Legt den Wert der residualRoadWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResidualRoadWidth(Float value) {
        this.residualRoadWidth = value;
    }

    /**
     * Ruft den Wert der trafficConstrictionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public TrafficConstrictionTypeEnum getTrafficConstrictionType() {
        return trafficConstrictionType;
    }

    /**
     * Legt den Wert der trafficConstrictionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public void setTrafficConstrictionType(TrafficConstrictionTypeEnum value) {
        this.trafficConstrictionType = value;
    }

    /**
     * Ruft den Wert der delays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Legt den Wert der delays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public void setDelays(Delays value) {
        this.delays = value;
    }

    /**
     * Ruft den Wert der impactExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getImpactExtension() {
        return impactExtension;
    }

    /**
     * Legt den Wert der impactExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setImpactExtension(ExtensionType value) {
        this.impactExtension = value;
    }

    public Impact withCapacityRemaining(Float value) {
        setCapacityRemaining(value);
        return this;
    }

    public Impact withNumberOfLanesRestricted(BigInteger value) {
        setNumberOfLanesRestricted(value);
        return this;
    }

    public Impact withNumberOfOperationalLanes(BigInteger value) {
        setNumberOfOperationalLanes(value);
        return this;
    }

    public Impact withOriginalNumberOfLanes(BigInteger value) {
        setOriginalNumberOfLanes(value);
        return this;
    }

    public Impact withResidualRoadWidth(Float value) {
        setResidualRoadWidth(value);
        return this;
    }

    public Impact withTrafficConstrictionType(TrafficConstrictionTypeEnum value) {
        setTrafficConstrictionType(value);
        return this;
    }

    public Impact withDelays(Delays value) {
        setDelays(value);
        return this;
    }

    public Impact withImpactExtension(ExtensionType value) {
        setImpactExtension(value);
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
