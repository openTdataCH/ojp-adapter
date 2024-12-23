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
 * descriptive data associated with a PLACE that can be used to describe the unique geographical context of a PLACE for the purposes of identifying it. May be refined as either a ROAD ADDRESS, a POSTAL ADDRESS or both
 * 
 * <p>Java-Klasse für AddressStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddressStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublicCode" type="{http://www.vdv.de/ojp}AddressCodeType"/&gt;
 *         &lt;element name="PrivateCode" type="{http://www.vdv.de/ojp}PrivateCodeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="NameSuffix" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}AddressDetailGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressStructure", propOrder = {
    "publicCode",
    "privateCode",
    "name",
    "nameSuffix",
    "countryName",
    "postCode",
    "topographicPlaceName",
    "topographicPlaceRef",
    "street",
    "houseNumber",
    "crossRoad"
})
public class AddressStructure {

    @XmlElement(name = "PublicCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publicCode;
    @XmlElement(name = "PrivateCode")
    protected List<PrivateCodeStructure> privateCode;
    @XmlElement(name = "Name", required = true)
    protected InternationalTextStructure name;
    @XmlElement(name = "NameSuffix")
    protected InternationalTextStructure nameSuffix;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "TopographicPlaceName")
    protected String topographicPlaceName;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "HouseNumber")
    protected String houseNumber;
    @XmlElement(name = "CrossRoad")
    protected String crossRoad;

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
     * Ruft den Wert der countryName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Legt den Wert der countryName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Ruft den Wert der postCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Legt den Wert der postCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Ruft den Wert der topographicPlaceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopographicPlaceName() {
        return topographicPlaceName;
    }

    /**
     * Legt den Wert der topographicPlaceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopographicPlaceName(String value) {
        this.topographicPlaceName = value;
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
     * Ruft den Wert der street-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Ruft den Wert der houseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Legt den Wert der houseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Ruft den Wert der crossRoad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossRoad() {
        return crossRoad;
    }

    /**
     * Legt den Wert der crossRoad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossRoad(String value) {
        this.crossRoad = value;
    }

    public AddressStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    public AddressStructure withPrivateCode(PrivateCodeStructure... values) {
        if (values!= null) {
            for (PrivateCodeStructure value: values) {
                getPrivateCode().add(value);
            }
        }
        return this;
    }

    public AddressStructure withPrivateCode(Collection<PrivateCodeStructure> values) {
        if (values!= null) {
            getPrivateCode().addAll(values);
        }
        return this;
    }

    public AddressStructure withName(InternationalTextStructure value) {
        setName(value);
        return this;
    }

    public AddressStructure withNameSuffix(InternationalTextStructure value) {
        setNameSuffix(value);
        return this;
    }

    public AddressStructure withCountryName(String value) {
        setCountryName(value);
        return this;
    }

    public AddressStructure withPostCode(String value) {
        setPostCode(value);
        return this;
    }

    public AddressStructure withTopographicPlaceName(String value) {
        setTopographicPlaceName(value);
        return this;
    }

    public AddressStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public AddressStructure withStreet(String value) {
        setStreet(value);
        return this;
    }

    public AddressStructure withHouseNumber(String value) {
        setHouseNumber(value);
        return this;
    }

    public AddressStructure withCrossRoad(String value) {
        setCrossRoad(value);
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
