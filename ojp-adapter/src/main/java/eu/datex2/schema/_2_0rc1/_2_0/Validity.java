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
 * <p>Java-Klasse für Validity complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Validity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validityStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}ValidityStatusEnum"/&gt;
 *         &lt;element name="overrunning" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="validityTimeSpecification" type="{http://datex2.eu/schema/2_0RC1/2_0}OverallPeriod"/&gt;
 *         &lt;element name="validityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Validity", propOrder = {
    "validityStatus",
    "overrunning",
    "validityTimeSpecification",
    "validityExtension"
})
public class Validity {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ValidityStatusEnum validityStatus;
    protected Boolean overrunning;
    @XmlElement(required = true)
    protected OverallPeriod validityTimeSpecification;
    protected ExtensionType validityExtension;

    /**
     * Ruft den Wert der validityStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityStatusEnum }
     *     
     */
    public ValidityStatusEnum getValidityStatus() {
        return validityStatus;
    }

    /**
     * Legt den Wert der validityStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityStatusEnum }
     *     
     */
    public void setValidityStatus(ValidityStatusEnum value) {
        this.validityStatus = value;
    }

    /**
     * Ruft den Wert der overrunning-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrunning() {
        return overrunning;
    }

    /**
     * Legt den Wert der overrunning-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrunning(Boolean value) {
        this.overrunning = value;
    }

    /**
     * Ruft den Wert der validityTimeSpecification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getValidityTimeSpecification() {
        return validityTimeSpecification;
    }

    /**
     * Legt den Wert der validityTimeSpecification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setValidityTimeSpecification(OverallPeriod value) {
        this.validityTimeSpecification = value;
    }

    /**
     * Ruft den Wert der validityExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getValidityExtension() {
        return validityExtension;
    }

    /**
     * Legt den Wert der validityExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setValidityExtension(ExtensionType value) {
        this.validityExtension = value;
    }

    public Validity withValidityStatus(ValidityStatusEnum value) {
        setValidityStatus(value);
        return this;
    }

    public Validity withOverrunning(Boolean value) {
        setOverrunning(value);
        return this;
    }

    public Validity withValidityTimeSpecification(OverallPeriod value) {
        setValidityTimeSpecification(value);
        return this;
    }

    public Validity withValidityExtension(ExtensionType value) {
        setValidityExtension(value);
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
