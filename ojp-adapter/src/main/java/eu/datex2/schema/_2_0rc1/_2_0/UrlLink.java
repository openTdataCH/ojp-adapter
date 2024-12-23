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
 * <p>Java-Klasse für UrlLink complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UrlLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/2_0RC1/2_0}Url"/&gt;
 *         &lt;element name="urlLinkDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="urlLinkType" type="{http://datex2.eu/schema/2_0RC1/2_0}UrlLinkTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="urlLinkExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlLink", propOrder = {
    "urlLinkAddress",
    "urlLinkDescription",
    "urlLinkType",
    "urlLinkExtension"
})
public class UrlLink {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String urlLinkAddress;
    protected MultilingualString urlLinkDescription;
    @XmlSchemaType(name = "string")
    protected UrlLinkTypeEnum urlLinkType;
    protected ExtensionType urlLinkExtension;

    /**
     * Ruft den Wert der urlLinkAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLinkAddress() {
        return urlLinkAddress;
    }

    /**
     * Legt den Wert der urlLinkAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLinkAddress(String value) {
        this.urlLinkAddress = value;
    }

    /**
     * Ruft den Wert der urlLinkDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getUrlLinkDescription() {
        return urlLinkDescription;
    }

    /**
     * Legt den Wert der urlLinkDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setUrlLinkDescription(MultilingualString value) {
        this.urlLinkDescription = value;
    }

    /**
     * Ruft den Wert der urlLinkType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UrlLinkTypeEnum }
     *     
     */
    public UrlLinkTypeEnum getUrlLinkType() {
        return urlLinkType;
    }

    /**
     * Legt den Wert der urlLinkType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLinkTypeEnum }
     *     
     */
    public void setUrlLinkType(UrlLinkTypeEnum value) {
        this.urlLinkType = value;
    }

    /**
     * Ruft den Wert der urlLinkExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getUrlLinkExtension() {
        return urlLinkExtension;
    }

    /**
     * Legt den Wert der urlLinkExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setUrlLinkExtension(ExtensionType value) {
        this.urlLinkExtension = value;
    }

    public UrlLink withUrlLinkAddress(String value) {
        setUrlLinkAddress(value);
        return this;
    }

    public UrlLink withUrlLinkDescription(MultilingualString value) {
        setUrlLinkDescription(value);
        return this;
    }

    public UrlLink withUrlLinkType(UrlLinkTypeEnum value) {
        setUrlLinkType(value);
        return this;
    }

    public UrlLink withUrlLinkExtension(ExtensionType value) {
        setUrlLinkExtension(value);
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
