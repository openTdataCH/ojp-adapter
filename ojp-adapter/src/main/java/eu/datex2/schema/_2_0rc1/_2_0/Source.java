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
 * <p>Java-Klasse für Source complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Source"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceCountry" type="{http://datex2.eu/schema/2_0RC1/2_0}CountryEnum" minOccurs="0"/&gt;
 *         &lt;element name="sourceIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="sourceName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="sourceType" type="{http://datex2.eu/schema/2_0RC1/2_0}SourceTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="reliable" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="sourceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", propOrder = {
    "sourceCountry",
    "sourceIdentification",
    "sourceName",
    "sourceType",
    "reliable",
    "sourceExtension"
})
public class Source {

    @XmlSchemaType(name = "string")
    protected CountryEnum sourceCountry;
    protected String sourceIdentification;
    protected MultilingualString sourceName;
    @XmlSchemaType(name = "string")
    protected SourceTypeEnum sourceType;
    protected Boolean reliable;
    protected ExtensionType sourceExtension;

    /**
     * Ruft den Wert der sourceCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryEnum }
     *     
     */
    public CountryEnum getSourceCountry() {
        return sourceCountry;
    }

    /**
     * Legt den Wert der sourceCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryEnum }
     *     
     */
    public void setSourceCountry(CountryEnum value) {
        this.sourceCountry = value;
    }

    /**
     * Ruft den Wert der sourceIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIdentification() {
        return sourceIdentification;
    }

    /**
     * Legt den Wert der sourceIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIdentification(String value) {
        this.sourceIdentification = value;
    }

    /**
     * Ruft den Wert der sourceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSourceName() {
        return sourceName;
    }

    /**
     * Legt den Wert der sourceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSourceName(MultilingualString value) {
        this.sourceName = value;
    }

    /**
     * Ruft den Wert der sourceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    /**
     * Legt den Wert der sourceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceType(SourceTypeEnum value) {
        this.sourceType = value;
    }

    /**
     * Ruft den Wert der reliable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReliable() {
        return reliable;
    }

    /**
     * Legt den Wert der reliable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReliable(Boolean value) {
        this.reliable = value;
    }

    /**
     * Ruft den Wert der sourceExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSourceExtension() {
        return sourceExtension;
    }

    /**
     * Legt den Wert der sourceExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSourceExtension(ExtensionType value) {
        this.sourceExtension = value;
    }

    public Source withSourceCountry(CountryEnum value) {
        setSourceCountry(value);
        return this;
    }

    public Source withSourceIdentification(String value) {
        setSourceIdentification(value);
        return this;
    }

    public Source withSourceName(MultilingualString value) {
        setSourceName(value);
        return this;
    }

    public Source withSourceType(SourceTypeEnum value) {
        setSourceType(value);
        return this;
    }

    public Source withReliable(Boolean value) {
        setReliable(value);
        return this;
    }

    public Source withSourceExtension(ExtensionType value) {
        setSourceExtension(value);
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
