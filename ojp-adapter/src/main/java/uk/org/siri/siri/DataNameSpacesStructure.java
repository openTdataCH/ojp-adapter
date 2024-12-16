//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Name spaces.
 * 
 * <p>Java-Klasse für DataNameSpacesStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataNameSpacesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopPointNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="LineNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ProductCategoryNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ServiceFeatureNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="VehicleFeatureNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataNameSpacesStructure", propOrder = {
    "stopPointNameSpace",
    "lineNameSpace",
    "productCategoryNameSpace",
    "serviceFeatureNameSpace",
    "vehicleFeatureNameSpace"
})
public class DataNameSpacesStructure {

    @XmlElement(name = "StopPointNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String stopPointNameSpace;
    @XmlElement(name = "LineNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String lineNameSpace;
    @XmlElement(name = "ProductCategoryNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String productCategoryNameSpace;
    @XmlElement(name = "ServiceFeatureNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String serviceFeatureNameSpace;
    @XmlElement(name = "VehicleFeatureNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String vehicleFeatureNameSpace;

    /**
     * Ruft den Wert der stopPointNameSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPointNameSpace() {
        return stopPointNameSpace;
    }

    /**
     * Legt den Wert der stopPointNameSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPointNameSpace(String value) {
        this.stopPointNameSpace = value;
    }

    /**
     * Ruft den Wert der lineNameSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNameSpace() {
        return lineNameSpace;
    }

    /**
     * Legt den Wert der lineNameSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNameSpace(String value) {
        this.lineNameSpace = value;
    }

    /**
     * Ruft den Wert der productCategoryNameSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategoryNameSpace() {
        return productCategoryNameSpace;
    }

    /**
     * Legt den Wert der productCategoryNameSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategoryNameSpace(String value) {
        this.productCategoryNameSpace = value;
    }

    /**
     * Ruft den Wert der serviceFeatureNameSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeatureNameSpace() {
        return serviceFeatureNameSpace;
    }

    /**
     * Legt den Wert der serviceFeatureNameSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeatureNameSpace(String value) {
        this.serviceFeatureNameSpace = value;
    }

    /**
     * Ruft den Wert der vehicleFeatureNameSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleFeatureNameSpace() {
        return vehicleFeatureNameSpace;
    }

    /**
     * Legt den Wert der vehicleFeatureNameSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleFeatureNameSpace(String value) {
        this.vehicleFeatureNameSpace = value;
    }

    public DataNameSpacesStructure withStopPointNameSpace(String value) {
        setStopPointNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withLineNameSpace(String value) {
        setLineNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withProductCategoryNameSpace(String value) {
        setProductCategoryNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withServiceFeatureNameSpace(String value) {
        setServiceFeatureNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withVehicleFeatureNameSpace(String value) {
        setVehicleFeatureNameSpace(value);
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
