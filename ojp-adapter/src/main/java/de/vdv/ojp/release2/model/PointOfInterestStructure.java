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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [corresponds to POINT OF INTEREST in TMv6 with related information] type of PLACE to or through which passengers may wish to navigate as part of their journey and which is modelled in detail by journey planners. 
 * 
 * <p>Java-Klasse für PointOfInterestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublicCode" type="{http://www.vdv.de/ojp}PointOfInterestCodeType"/&gt;
 *         &lt;element name="Name" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="NameSuffix" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="PointOfInterestCategory" type="{http://www.vdv.de/ojp}PointOfInterestCategoryStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrivateCode" type="{http://www.vdv.de/ojp}PrivateCodeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}TopographicPlaceRef" minOccurs="0"/&gt;
 *         &lt;element name="POIAdditionalInformation" type="{http://www.vdv.de/ojp}PointOfInterestAdditionalInformationStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestStructure", propOrder = {
    "publicCode",
    "name",
    "nameSuffix",
    "pointOfInterestCategory",
    "privateCode",
    "topographicPlaceRef",
    "poiAdditionalInformation"
})
public class PointOfInterestStructure {

    @XmlElement(name = "PublicCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publicCode;
    @XmlElement(name = "Name", required = true)
    protected InternationalTextStructure name;
    @XmlElement(name = "NameSuffix")
    protected InternationalTextStructure nameSuffix;
    @XmlElement(name = "PointOfInterestCategory")
    protected List<PointOfInterestCategoryStructure> pointOfInterestCategory;
    @XmlElement(name = "PrivateCode")
    protected List<PrivateCodeStructure> privateCode;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "POIAdditionalInformation")
    protected PointOfInterestAdditionalInformationStructure poiAdditionalInformation;

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicCode(String value) {
        this.publicCode = value;
    }

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
     * Ruft den Wert der nameSuffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Legt den Wert der nameSuffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setNameSuffix(InternationalTextStructure value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the pointOfInterestCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfInterestCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfInterestCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInterestCategoryStructure }
     * 
     * 
     */
    public List<PointOfInterestCategoryStructure> getPointOfInterestCategory() {
        if (pointOfInterestCategory == null) {
            pointOfInterestCategory = new ArrayList<PointOfInterestCategoryStructure>();
        }
        return this.pointOfInterestCategory;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the privateCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateCodeStructure }
     * 
     * 
     */
    public List<PrivateCodeStructure> getPrivateCode() {
        if (privateCode == null) {
            privateCode = new ArrayList<PrivateCodeStructure>();
        }
        return this.privateCode;
    }

    /**
     * Ruft den Wert der topographicPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Legt den Wert der topographicPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Ruft den Wert der poiAdditionalInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestAdditionalInformationStructure }
     *     
     */
    public PointOfInterestAdditionalInformationStructure getPOIAdditionalInformation() {
        return poiAdditionalInformation;
    }

    /**
     * Legt den Wert der poiAdditionalInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestAdditionalInformationStructure }
     *     
     */
    public void setPOIAdditionalInformation(PointOfInterestAdditionalInformationStructure value) {
        this.poiAdditionalInformation = value;
    }

    public PointOfInterestStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    public PointOfInterestStructure withName(InternationalTextStructure value) {
        setName(value);
        return this;
    }

    public PointOfInterestStructure withNameSuffix(InternationalTextStructure value) {
        setNameSuffix(value);
        return this;
    }

    public PointOfInterestStructure withPointOfInterestCategory(PointOfInterestCategoryStructure... values) {
        if (values!= null) {
            for (PointOfInterestCategoryStructure value: values) {
                getPointOfInterestCategory().add(value);
            }
        }
        return this;
    }

    public PointOfInterestStructure withPointOfInterestCategory(Collection<PointOfInterestCategoryStructure> values) {
        if (values!= null) {
            getPointOfInterestCategory().addAll(values);
        }
        return this;
    }

    public PointOfInterestStructure withPrivateCode(PrivateCodeStructure... values) {
        if (values!= null) {
            for (PrivateCodeStructure value: values) {
                getPrivateCode().add(value);
            }
        }
        return this;
    }

    public PointOfInterestStructure withPrivateCode(Collection<PrivateCodeStructure> values) {
        if (values!= null) {
            getPrivateCode().addAll(values);
        }
        return this;
    }

    public PointOfInterestStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public PointOfInterestStructure withPOIAdditionalInformation(PointOfInterestAdditionalInformationStructure value) {
        setPOIAdditionalInformation(value);
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
