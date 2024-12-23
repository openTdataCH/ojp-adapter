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
 * Wrapper element for Fare results.
 * 
 * <p>Java-Klasse für FareResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.vdv.de/ojp}FareResultObjectIdType"/&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.vdv.de/ojp}OJPErrorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareEstimated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="StopFareResult" type="{http://www.vdv.de/ojp}StopFareResultStructure"/&gt;
 *           &lt;element name="PlaceFareResult" type="{http://www.vdv.de/ojp}PlaceFareResultStructure"/&gt;
 *           &lt;element name="StaticFareResult" type="{http://www.vdv.de/ojp}StaticFareResultStructure"/&gt;
 *           &lt;element name="TripFareResult" type="{http://www.vdv.de/ojp}TripFareResultStructure" maxOccurs="unbounded"/&gt;
 *           &lt;element name="MultiTripFareResult" type="{http://www.vdv.de/ojp}MultiTripFareResultStructure" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareResultStructure", propOrder = {
    "id",
    "errorCondition",
    "fareEstimated",
    "stopFareResult",
    "placeFareResult",
    "staticFareResult",
    "tripFareResult",
    "multiTripFareResult"
})
public class FareResultStructure {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String id;
    @XmlElement(name = "ErrorCondition")
    protected List<OJPErrorStructure> errorCondition;
    @XmlElement(name = "FareEstimated", defaultValue = "true")
    protected Boolean fareEstimated;
    @XmlElement(name = "StopFareResult")
    protected StopFareResultStructure stopFareResult;
    @XmlElement(name = "PlaceFareResult")
    protected PlaceFareResultStructure placeFareResult;
    @XmlElement(name = "StaticFareResult")
    protected StaticFareResultStructure staticFareResult;
    @XmlElement(name = "TripFareResult")
    protected List<TripFareResultStructure> tripFareResult;
    @XmlElement(name = "MultiTripFareResult")
    protected List<MultiTripFareResultStructure> multiTripFareResult;

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
     * Ruft den Wert der fareEstimated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFareEstimated() {
        return fareEstimated;
    }

    /**
     * Legt den Wert der fareEstimated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFareEstimated(Boolean value) {
        this.fareEstimated = value;
    }

    /**
     * Ruft den Wert der stopFareResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopFareResultStructure }
     *     
     */
    public StopFareResultStructure getStopFareResult() {
        return stopFareResult;
    }

    /**
     * Legt den Wert der stopFareResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopFareResultStructure }
     *     
     */
    public void setStopFareResult(StopFareResultStructure value) {
        this.stopFareResult = value;
    }

    /**
     * Ruft den Wert der placeFareResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceFareResultStructure }
     *     
     */
    public PlaceFareResultStructure getPlaceFareResult() {
        return placeFareResult;
    }

    /**
     * Legt den Wert der placeFareResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceFareResultStructure }
     *     
     */
    public void setPlaceFareResult(PlaceFareResultStructure value) {
        this.placeFareResult = value;
    }

    /**
     * Ruft den Wert der staticFareResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StaticFareResultStructure }
     *     
     */
    public StaticFareResultStructure getStaticFareResult() {
        return staticFareResult;
    }

    /**
     * Legt den Wert der staticFareResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticFareResultStructure }
     *     
     */
    public void setStaticFareResult(StaticFareResultStructure value) {
        this.staticFareResult = value;
    }

    /**
     * Gets the value of the tripFareResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tripFareResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripFareResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripFareResultStructure }
     * 
     * 
     */
    public List<TripFareResultStructure> getTripFareResult() {
        if (tripFareResult == null) {
            tripFareResult = new ArrayList<TripFareResultStructure>();
        }
        return this.tripFareResult;
    }

    /**
     * Gets the value of the multiTripFareResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the multiTripFareResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiTripFareResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiTripFareResultStructure }
     * 
     * 
     */
    public List<MultiTripFareResultStructure> getMultiTripFareResult() {
        if (multiTripFareResult == null) {
            multiTripFareResult = new ArrayList<MultiTripFareResultStructure>();
        }
        return this.multiTripFareResult;
    }

    public FareResultStructure withId(String value) {
        setId(value);
        return this;
    }

    public FareResultStructure withErrorCondition(OJPErrorStructure... values) {
        if (values!= null) {
            for (OJPErrorStructure value: values) {
                getErrorCondition().add(value);
            }
        }
        return this;
    }

    public FareResultStructure withErrorCondition(Collection<OJPErrorStructure> values) {
        if (values!= null) {
            getErrorCondition().addAll(values);
        }
        return this;
    }

    public FareResultStructure withFareEstimated(Boolean value) {
        setFareEstimated(value);
        return this;
    }

    public FareResultStructure withStopFareResult(StopFareResultStructure value) {
        setStopFareResult(value);
        return this;
    }

    public FareResultStructure withPlaceFareResult(PlaceFareResultStructure value) {
        setPlaceFareResult(value);
        return this;
    }

    public FareResultStructure withStaticFareResult(StaticFareResultStructure value) {
        setStaticFareResult(value);
        return this;
    }

    public FareResultStructure withTripFareResult(TripFareResultStructure... values) {
        if (values!= null) {
            for (TripFareResultStructure value: values) {
                getTripFareResult().add(value);
            }
        }
        return this;
    }

    public FareResultStructure withTripFareResult(Collection<TripFareResultStructure> values) {
        if (values!= null) {
            getTripFareResult().addAll(values);
        }
        return this;
    }

    public FareResultStructure withMultiTripFareResult(MultiTripFareResultStructure... values) {
        if (values!= null) {
            for (MultiTripFareResultStructure value: values) {
                getMultiTripFareResult().add(value);
            }
        }
        return this;
    }

    public FareResultStructure withMultiTripFareResult(Collection<MultiTripFareResultStructure> values) {
        if (values!= null) {
            getMultiTripFareResult().addAll(values);
        }
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
