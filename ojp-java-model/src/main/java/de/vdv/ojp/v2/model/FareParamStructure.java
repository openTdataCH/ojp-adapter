//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.FareClassEnumeration;

/**
 * [related to the FARE parameter model in TM and NeTEx] parameters which are used to determine the price to be paid for a FARE PRODUCT by a specific passenger.
 *
 * <p>Java-Klasse für FareParamStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FareParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareDataFilterGroup"/&gt;
 *         &lt;element name="Traveller" type="{http://www.vdv.de/ojp}FarePassengerStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccessModeList" type="{http://www.vdv.de/ojp}AccessModesListOfEnumerations" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareParamStructure", propOrder = {
    "fareAuthorityFilter",
    "passengerCategory",
    "fareClass",
    "traveller",
    "accessModeList",
    "extension"
})
public class FareParamStructure {

    @XmlElement(name = "FareAuthorityFilter")
    protected List<FareAuthorityRefStructure> fareAuthorityFilter;
    @XmlElement(name = "PassengerCategory")
    @XmlSchemaType(name = "string")
    protected List<PassengerCategoryEnumeration> passengerCategory;
    @XmlElement(name = "FareClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "Traveller")
    protected List<FarePassengerStructure> traveller;
    @XmlElement(name = "AccessModeList")
    protected AccessModesListOfEnumerations accessModeList;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the fareAuthorityFilter property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the fareAuthorityFilter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareAuthorityFilter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FareAuthorityRefStructure }
     */
    public List<FareAuthorityRefStructure> getFareAuthorityFilter() {
        if (fareAuthorityFilter == null) {
            fareAuthorityFilter = new ArrayList<FareAuthorityRefStructure>();
        }
        return this.fareAuthorityFilter;
    }

    /**
     * Gets the value of the passengerCategory property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the passengerCategory property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCategory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PassengerCategoryEnumeration }
     */
    public List<PassengerCategoryEnumeration> getPassengerCategory() {
        if (passengerCategory == null) {
            passengerCategory = new ArrayList<PassengerCategoryEnumeration>();
        }
        return this.passengerCategory;
    }

    /**
     * Ruft den Wert der fareClass-Eigenschaft ab.
     *
     * @return possible object is {@link FareClassEnumeration }
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Legt den Wert der fareClass-Eigenschaft fest.
     *
     * @param value allowed object is {@link FareClassEnumeration }
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the traveller property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the traveller property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraveller().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FarePassengerStructure }
     */
    public List<FarePassengerStructure> getTraveller() {
        if (traveller == null) {
            traveller = new ArrayList<FarePassengerStructure>();
        }
        return this.traveller;
    }

    /**
     * Ruft den Wert der accessModeList-Eigenschaft ab.
     *
     * @return possible object is {@link AccessModesListOfEnumerations }
     */
    public AccessModesListOfEnumerations getAccessModeList() {
        return accessModeList;
    }

    /**
     * Legt den Wert der accessModeList-Eigenschaft fest.
     *
     * @param value allowed object is {@link AccessModesListOfEnumerations }
     */
    public void setAccessModeList(AccessModesListOfEnumerations value) {
        this.accessModeList = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     *
     * @return possible object is {@link Object }
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     *
     * @param value allowed object is {@link Object }
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public FareParamStructure withFareAuthorityFilter(FareAuthorityRefStructure... values) {
        if (values != null) {
            for (FareAuthorityRefStructure value : values) {
                getFareAuthorityFilter().add(value);
            }
        }
        return this;
    }

    public FareParamStructure withFareAuthorityFilter(Collection<FareAuthorityRefStructure> values) {
        if (values != null) {
            getFareAuthorityFilter().addAll(values);
        }
        return this;
    }

    public FareParamStructure withPassengerCategory(PassengerCategoryEnumeration... values) {
        if (values != null) {
            for (PassengerCategoryEnumeration value : values) {
                getPassengerCategory().add(value);
            }
        }
        return this;
    }

    public FareParamStructure withPassengerCategory(Collection<PassengerCategoryEnumeration> values) {
        if (values != null) {
            getPassengerCategory().addAll(values);
        }
        return this;
    }

    public FareParamStructure withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    public FareParamStructure withTraveller(FarePassengerStructure... values) {
        if (values != null) {
            for (FarePassengerStructure value : values) {
                getTraveller().add(value);
            }
        }
        return this;
    }

    public FareParamStructure withTraveller(Collection<FarePassengerStructure> values) {
        if (values != null) {
            getTraveller().addAll(values);
        }
        return this;
    }

    public FareParamStructure withAccessModeList(AccessModesListOfEnumerations value) {
        setAccessModeList(value);
        return this;
    }

    public FareParamStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
