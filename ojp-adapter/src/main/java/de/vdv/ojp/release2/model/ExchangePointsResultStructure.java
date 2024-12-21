//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * <p>Java-Klasse für ExchangePointsResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExchangePointsResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.vdv.de/ojp}OJPErrorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Place" type="{http://www.vdv.de/ojp}PlaceStructure"/&gt;
 *         &lt;element name="TravelDurationEstimate" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="WaitDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="BorderPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://www.vdv.de/ojp}ModeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.vdv.de/ojp}PercentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangePointsResultStructure", propOrder = {
    "errorCondition",
    "place",
    "travelDurationEstimate",
    "waitDuration",
    "borderPoint",
    "mode",
    "priority"
})
public class ExchangePointsResultStructure {

    @XmlElement(name = "ErrorCondition")
    protected List<OJPErrorStructure> errorCondition;
    @XmlElement(name = "Place", required = true)
    protected PlaceStructure place;
    @XmlElement(name = "TravelDurationEstimate", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration travelDurationEstimate;
    @XmlElement(name = "WaitDuration", type = String.class, defaultValue = "PT0M")
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration waitDuration;
    @XmlElement(name = "BorderPoint", defaultValue = "false")
    protected Boolean borderPoint;
    @XmlElement(name = "Mode")
    protected List<ModeStructure> mode;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer priority;

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
     * Ruft den Wert der travelDurationEstimate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTravelDurationEstimate() {
        return travelDurationEstimate;
    }

    /**
     * Legt den Wert der travelDurationEstimate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDurationEstimate(Duration value) {
        this.travelDurationEstimate = value;
    }

    /**
     * Ruft den Wert der waitDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getWaitDuration() {
        return waitDuration;
    }

    /**
     * Legt den Wert der waitDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitDuration(Duration value) {
        this.waitDuration = value;
    }

    /**
     * Ruft den Wert der borderPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBorderPoint() {
        return borderPoint;
    }

    /**
     * Legt den Wert der borderPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBorderPoint(Boolean value) {
        this.borderPoint = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModeStructure }
     * 
     * 
     */
    public List<ModeStructure> getMode() {
        if (mode == null) {
            mode = new ArrayList<ModeStructure>();
        }
        return this.mode;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    public ExchangePointsResultStructure withErrorCondition(OJPErrorStructure... values) {
        if (values!= null) {
            for (OJPErrorStructure value: values) {
                getErrorCondition().add(value);
            }
        }
        return this;
    }

    public ExchangePointsResultStructure withErrorCondition(Collection<OJPErrorStructure> values) {
        if (values!= null) {
            getErrorCondition().addAll(values);
        }
        return this;
    }

    public ExchangePointsResultStructure withPlace(PlaceStructure value) {
        setPlace(value);
        return this;
    }

    public ExchangePointsResultStructure withTravelDurationEstimate(Duration value) {
        setTravelDurationEstimate(value);
        return this;
    }

    public ExchangePointsResultStructure withWaitDuration(Duration value) {
        setWaitDuration(value);
        return this;
    }

    public ExchangePointsResultStructure withBorderPoint(Boolean value) {
        setBorderPoint(value);
        return this;
    }

    public ExchangePointsResultStructure withMode(ModeStructure... values) {
        if (values!= null) {
            for (ModeStructure value: values) {
                getMode().add(value);
            }
        }
        return this;
    }

    public ExchangePointsResultStructure withMode(Collection<ModeStructure> values) {
        if (values!= null) {
            getMode().addAll(values);
        }
        return this;
    }

    public ExchangePointsResultStructure withPriority(Integer value) {
        setPriority(value);
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
