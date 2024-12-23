//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.ProductCategoryRefStructure;


/**
 * Product category based on NeTEx/SIRI. A product category is a classification for VEHICLE JOURNEYs to express some common properties of journeys for marketing and fare products.
 * 
 * <p>Java-Klasse für ProductCategoryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProductCategoryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="ShortName" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}ProductCategoryRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCategoryStructure", propOrder = {
    "name",
    "shortName",
    "productCategoryRef"
})
public class ProductCategoryStructure {

    @XmlElement(name = "Name")
    protected InternationalTextStructure name;
    @XmlElement(name = "ShortName")
    protected InternationalTextStructure shortName;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setName(InternationalTextStructure value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setShortName(InternationalTextStructure value) {
        this.shortName = value;
    }

    /**
     * A reference to the product category. This is the internal code used within the reference frameworks (NeTEx, SIRI). It is usually not displayed, but interpreted by the technical system, e.g., "ch:1:TypeOfProductCategory:ARZ" (Autoreisezug in Switzerland) or "ch:1:TypeOfProductCategory:BAV".
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public ProductCategoryRefStructure getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Legt den Wert der productCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public void setProductCategoryRef(ProductCategoryRefStructure value) {
        this.productCategoryRef = value;
    }

    public ProductCategoryStructure withName(InternationalTextStructure value) {
        setName(value);
        return this;
    }

    public ProductCategoryStructure withShortName(InternationalTextStructure value) {
        setShortName(value);
        return this;
    }

    public ProductCategoryStructure withProductCategoryRef(ProductCategoryRefStructure value) {
        setProductCategoryRef(value);
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
