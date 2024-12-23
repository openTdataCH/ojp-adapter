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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für AxleWeight complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AxleWeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axlePositionIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="axleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="maximumPermittedAxleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="axleWeightExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleWeight", propOrder = {
    "axlePositionIdentifier",
    "axleWeight",
    "maximumPermittedAxleWeight",
    "axleWeightExtension"
})
public class AxleWeight {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger axlePositionIdentifier;
    protected Float axleWeight;
    protected Float maximumPermittedAxleWeight;
    protected ExtensionType axleWeightExtension;

    /**
     * Ruft den Wert der axlePositionIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxlePositionIdentifier() {
        return axlePositionIdentifier;
    }

    /**
     * Legt den Wert der axlePositionIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxlePositionIdentifier(BigInteger value) {
        this.axlePositionIdentifier = value;
    }

    /**
     * Ruft den Wert der axleWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAxleWeight() {
        return axleWeight;
    }

    /**
     * Legt den Wert der axleWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxleWeight(Float value) {
        this.axleWeight = value;
    }

    /**
     * Ruft den Wert der maximumPermittedAxleWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumPermittedAxleWeight() {
        return maximumPermittedAxleWeight;
    }

    /**
     * Legt den Wert der maximumPermittedAxleWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumPermittedAxleWeight(Float value) {
        this.maximumPermittedAxleWeight = value;
    }

    /**
     * Ruft den Wert der axleWeightExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleWeightExtension() {
        return axleWeightExtension;
    }

    /**
     * Legt den Wert der axleWeightExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleWeightExtension(ExtensionType value) {
        this.axleWeightExtension = value;
    }

    public AxleWeight withAxlePositionIdentifier(BigInteger value) {
        setAxlePositionIdentifier(value);
        return this;
    }

    public AxleWeight withAxleWeight(Float value) {
        setAxleWeight(value);
        return this;
    }

    public AxleWeight withMaximumPermittedAxleWeight(Float value) {
        setMaximumPermittedAxleWeight(value);
        return this;
    }

    public AxleWeight withAxleWeightExtension(ExtensionType value) {
        setAxleWeightExtension(value);
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
