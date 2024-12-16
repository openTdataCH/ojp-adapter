//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für PrecipitationDetail complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depositionDepth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="precipitationIntensity" type="{http://datex2.eu/schema/2_0RC1/2_0}IntensityMillimetresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="precipitationType" type="{http://datex2.eu/schema/2_0RC1/2_0}PrecipitationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="precipitationDetailExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationDetail", propOrder = {
    "depositionDepth",
    "precipitationIntensity",
    "precipitationType",
    "precipitationDetailExtension"
})
public class PrecipitationDetail {

    protected Float depositionDepth;
    protected Float precipitationIntensity;
    @XmlSchemaType(name = "string")
    protected PrecipitationTypeEnum precipitationType;
    protected ExtensionType precipitationDetailExtension;

    /**
     * Ruft den Wert der depositionDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepositionDepth() {
        return depositionDepth;
    }

    /**
     * Legt den Wert der depositionDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepositionDepth(Float value) {
        this.depositionDepth = value;
    }

    /**
     * Ruft den Wert der precipitationIntensity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    /**
     * Legt den Wert der precipitationIntensity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrecipitationIntensity(Float value) {
        this.precipitationIntensity = value;
    }

    /**
     * Ruft den Wert der precipitationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public PrecipitationTypeEnum getPrecipitationType() {
        return precipitationType;
    }

    /**
     * Legt den Wert der precipitationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public void setPrecipitationType(PrecipitationTypeEnum value) {
        this.precipitationType = value;
    }

    /**
     * Ruft den Wert der precipitationDetailExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationDetailExtension() {
        return precipitationDetailExtension;
    }

    /**
     * Legt den Wert der precipitationDetailExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationDetailExtension(ExtensionType value) {
        this.precipitationDetailExtension = value;
    }

    public PrecipitationDetail withDepositionDepth(Float value) {
        setDepositionDepth(value);
        return this;
    }

    public PrecipitationDetail withPrecipitationIntensity(Float value) {
        setPrecipitationIntensity(value);
        return this;
    }

    public PrecipitationDetail withPrecipitationType(PrecipitationTypeEnum value) {
        setPrecipitationType(value);
        return this;
    }

    public PrecipitationDetail withPrecipitationDetailExtension(ExtensionType value) {
        setPrecipitationDetailExtension(value);
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
