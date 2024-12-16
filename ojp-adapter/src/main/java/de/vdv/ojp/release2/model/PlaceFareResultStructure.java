//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * PLACE-related Fare information.
 * 
 * <p>Java-Klasse für PlaceFareResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlaceFareResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Place" type="{http://www.vdv.de/ojp}PlaceStructure"/&gt;
 *         &lt;element name="FareProduct" type="{http://www.vdv.de/ojp}FareProductStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StaticInfoUrl" type="{http://www.vdv.de/ojp}WebLinkStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceFareResultStructure", propOrder = {
    "place",
    "fareProduct",
    "staticInfoUrl",
    "extension"
})
public class PlaceFareResultStructure {

    @XmlElement(name = "Place", required = true)
    protected PlaceStructure place;
    @XmlElement(name = "FareProduct")
    protected List<FareProductStructure> fareProduct;
    @XmlElement(name = "StaticInfoUrl")
    protected List<WebLinkStructure> staticInfoUrl;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der place-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceStructure }
     *     
     */
    public PlaceStructure getPlace() {
        return place;
    }

    /**
     * Legt den Wert der place-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceStructure }
     *     
     */
    public void setPlace(PlaceStructure value) {
        this.place = value;
    }

    /**
     * Gets the value of the fareProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fareProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductStructure }
     * 
     * 
     */
    public List<FareProductStructure> getFareProduct() {
        if (fareProduct == null) {
            fareProduct = new ArrayList<FareProductStructure>();
        }
        return this.fareProduct;
    }

    /**
     * Gets the value of the staticInfoUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the staticInfoUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticInfoUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getStaticInfoUrl() {
        if (staticInfoUrl == null) {
            staticInfoUrl = new ArrayList<WebLinkStructure>();
        }
        return this.staticInfoUrl;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public PlaceFareResultStructure withPlace(PlaceStructure value) {
        setPlace(value);
        return this;
    }

    public PlaceFareResultStructure withFareProduct(FareProductStructure... values) {
        if (values!= null) {
            for (FareProductStructure value: values) {
                getFareProduct().add(value);
            }
        }
        return this;
    }

    public PlaceFareResultStructure withFareProduct(Collection<FareProductStructure> values) {
        if (values!= null) {
            getFareProduct().addAll(values);
        }
        return this;
    }

    public PlaceFareResultStructure withStaticInfoUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getStaticInfoUrl().add(value);
            }
        }
        return this;
    }

    public PlaceFareResultStructure withStaticInfoUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getStaticInfoUrl().addAll(values);
        }
        return this;
    }

    public PlaceFareResultStructure withExtension(Object value) {
        setExtension(value);
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
