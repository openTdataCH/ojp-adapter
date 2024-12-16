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
 * <p>Java-Klasse für NonManagedCause complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonManagedCause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Cause"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causeDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="causeType" type="{http://datex2.eu/schema/2_0RC1/2_0}CauseTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="nonManagedCauseExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonManagedCause", propOrder = {
    "causeDescription",
    "causeType",
    "nonManagedCauseExtension"
})
public class NonManagedCause
    extends Cause
{

    protected MultilingualString causeDescription;
    @XmlSchemaType(name = "string")
    protected CauseTypeEnum causeType;
    protected ExtensionType nonManagedCauseExtension;

    /**
     * Ruft den Wert der causeDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCauseDescription() {
        return causeDescription;
    }

    /**
     * Legt den Wert der causeDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCauseDescription(MultilingualString value) {
        this.causeDescription = value;
    }

    /**
     * Ruft den Wert der causeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CauseTypeEnum }
     *     
     */
    public CauseTypeEnum getCauseType() {
        return causeType;
    }

    /**
     * Legt den Wert der causeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseTypeEnum }
     *     
     */
    public void setCauseType(CauseTypeEnum value) {
        this.causeType = value;
    }

    /**
     * Ruft den Wert der nonManagedCauseExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonManagedCauseExtension() {
        return nonManagedCauseExtension;
    }

    /**
     * Legt den Wert der nonManagedCauseExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonManagedCauseExtension(ExtensionType value) {
        this.nonManagedCauseExtension = value;
    }

    public NonManagedCause withCauseDescription(MultilingualString value) {
        setCauseDescription(value);
        return this;
    }

    public NonManagedCause withCauseType(CauseTypeEnum value) {
        setCauseType(value);
        return this;
    }

    public NonManagedCause withNonManagedCauseExtension(ExtensionType value) {
        setNonManagedCauseExtension(value);
        return this;
    }

    @Override
    public NonManagedCause withCauseExtension(ExtensionType value) {
        setCauseExtension(value);
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
