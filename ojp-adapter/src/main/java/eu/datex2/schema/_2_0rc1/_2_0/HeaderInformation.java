//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für HeaderInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaOfInterest" type="{http://datex2.eu/schema/2_0RC1/2_0}AreaOfInterestEnum" minOccurs="0"/&gt;
 *         &lt;element name="confidentiality" type="{http://datex2.eu/schema/2_0RC1/2_0}ConfidentialityValueEnum"/&gt;
 *         &lt;element name="informationStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}InformationStatusEnum"/&gt;
 *         &lt;element name="urgency" type="{http://datex2.eu/schema/2_0RC1/2_0}UrgencyEnum" minOccurs="0"/&gt;
 *         &lt;element name="headerInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderInformation", propOrder = {
    "areaOfInterest",
    "confidentiality",
    "informationStatus",
    "urgency",
    "headerInformationExtension"
})
public class HeaderInformation {

    @XmlSchemaType(name = "string")
    protected AreaOfInterestEnum areaOfInterest;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConfidentialityValueEnum confidentiality;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InformationStatusEnum informationStatus;
    @XmlSchemaType(name = "string")
    protected UrgencyEnum urgency;
    protected ExtensionType headerInformationExtension;

    /**
     * Ruft den Wert der areaOfInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public AreaOfInterestEnum getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * Legt den Wert der areaOfInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public void setAreaOfInterest(AreaOfInterestEnum value) {
        this.areaOfInterest = value;
    }

    /**
     * Ruft den Wert der confidentiality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentiality() {
        return confidentiality;
    }

    /**
     * Legt den Wert der confidentiality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentiality(ConfidentialityValueEnum value) {
        this.confidentiality = value;
    }

    /**
     * Ruft den Wert der informationStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getInformationStatus() {
        return informationStatus;
    }

    /**
     * Legt den Wert der informationStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setInformationStatus(InformationStatusEnum value) {
        this.informationStatus = value;
    }

    /**
     * Ruft den Wert der urgency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyEnum }
     *     
     */
    public UrgencyEnum getUrgency() {
        return urgency;
    }

    /**
     * Legt den Wert der urgency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyEnum }
     *     
     */
    public void setUrgency(UrgencyEnum value) {
        this.urgency = value;
    }

    /**
     * Ruft den Wert der headerInformationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaderInformationExtension() {
        return headerInformationExtension;
    }

    /**
     * Legt den Wert der headerInformationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaderInformationExtension(ExtensionType value) {
        this.headerInformationExtension = value;
    }

    public HeaderInformation withAreaOfInterest(AreaOfInterestEnum value) {
        setAreaOfInterest(value);
        return this;
    }

    public HeaderInformation withConfidentiality(ConfidentialityValueEnum value) {
        setConfidentiality(value);
        return this;
    }

    public HeaderInformation withInformationStatus(InformationStatusEnum value) {
        setInformationStatus(value);
        return this;
    }

    public HeaderInformation withUrgency(UrgencyEnum value) {
        setUrgency(value);
        return this;
    }

    public HeaderInformation withHeaderInformationExtension(ExtensionType value) {
        setHeaderInformationExtension(value);
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
