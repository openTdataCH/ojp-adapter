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
 * Structure for a single trip result and associated problems.
 * 
 * <p>Java-Klasse für TripResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.vdv.de/ojp}TripResultObjectIdType"/&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.vdv.de/ojp}OJPErrorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Trip" type="{http://www.vdv.de/ojp}TripStructure"/&gt;
 *           &lt;element name="TripSummary" type="{http://www.vdv.de/ojp}TripSummaryStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="TripFare" type="{http://www.vdv.de/ojp}TripFareResultStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsAlternativeOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripResultStructure", propOrder = {
    "id",
    "errorCondition",
    "trip",
    "tripSummary",
    "tripFare",
    "isAlternativeOption"
})
public class TripResultStructure {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String id;
    @XmlElement(name = "ErrorCondition")
    protected List<OJPErrorStructure> errorCondition;
    @XmlElement(name = "Trip")
    protected TripStructure trip;
    @XmlElement(name = "TripSummary")
    protected TripSummaryStructure tripSummary;
    @XmlElement(name = "TripFare")
    protected List<TripFareResultStructure> tripFare;
    @XmlElement(name = "IsAlternativeOption", defaultValue = "false")
    protected Boolean isAlternativeOption;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the errorCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the errorCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJPErrorStructure }
     * 
     * 
     */
    public List<OJPErrorStructure> getErrorCondition() {
        if (errorCondition == null) {
            errorCondition = new ArrayList<OJPErrorStructure>();
        }
        return this.errorCondition;
    }

    /**
     * Ruft den Wert der trip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripStructure }
     *     
     */
    public TripStructure getTrip() {
        return trip;
    }

    /**
     * Legt den Wert der trip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripStructure }
     *     
     */
    public void setTrip(TripStructure value) {
        this.trip = value;
    }

    /**
     * Ruft den Wert der tripSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripSummaryStructure }
     *     
     */
    public TripSummaryStructure getTripSummary() {
        return tripSummary;
    }

    /**
     * Legt den Wert der tripSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripSummaryStructure }
     *     
     */
    public void setTripSummary(TripSummaryStructure value) {
        this.tripSummary = value;
    }

    /**
     * Gets the value of the tripFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tripFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripFareResultStructure }
     * 
     * 
     */
    public List<TripFareResultStructure> getTripFare() {
        if (tripFare == null) {
            tripFare = new ArrayList<TripFareResultStructure>();
        }
        return this.tripFare;
    }

    /**
     * Ruft den Wert der isAlternativeOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlternativeOption() {
        return isAlternativeOption;
    }

    /**
     * Legt den Wert der isAlternativeOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlternativeOption(Boolean value) {
        this.isAlternativeOption = value;
    }

    public TripResultStructure withId(String value) {
        setId(value);
        return this;
    }

    public TripResultStructure withErrorCondition(OJPErrorStructure... values) {
        if (values!= null) {
            for (OJPErrorStructure value: values) {
                getErrorCondition().add(value);
            }
        }
        return this;
    }

    public TripResultStructure withErrorCondition(Collection<OJPErrorStructure> values) {
        if (values!= null) {
            getErrorCondition().addAll(values);
        }
        return this;
    }

    public TripResultStructure withTrip(TripStructure value) {
        setTrip(value);
        return this;
    }

    public TripResultStructure withTripSummary(TripSummaryStructure value) {
        setTripSummary(value);
        return this;
    }

    public TripResultStructure withTripFare(TripFareResultStructure... values) {
        if (values!= null) {
            for (TripFareResultStructure value: values) {
                getTripFare().add(value);
            }
        }
        return this;
    }

    public TripResultStructure withTripFare(Collection<TripFareResultStructure> values) {
        if (values!= null) {
            getTripFare().addAll(values);
        }
        return this;
    }

    public TripResultStructure withIsAlternativeOption(Boolean value) {
        setIsAlternativeOption(value);
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
