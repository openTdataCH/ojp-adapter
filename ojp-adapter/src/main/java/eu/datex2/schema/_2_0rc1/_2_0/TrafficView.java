//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für TrafficView complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrafficView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficViewTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="predefinedLocationSetReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="linearTrafficView" type="{http://datex2.eu/schema/2_0RC1/2_0}LinearTrafficView" maxOccurs="unbounded"/&gt;
 *         &lt;element name="trafficViewExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficView", propOrder = {
    "trafficViewTime",
    "predefinedLocationSetReference",
    "linearTrafficView",
    "trafficViewExtension"
})
public class TrafficView {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime trafficViewTime;
    @XmlElement(required = true)
    protected String predefinedLocationSetReference;
    @XmlElement(required = true)
    protected List<LinearTrafficView> linearTrafficView;
    protected ExtensionType trafficViewExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der trafficViewTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTrafficViewTime() {
        return trafficViewTime;
    }

    /**
     * Legt den Wert der trafficViewTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficViewTime(ZonedDateTime value) {
        this.trafficViewTime = value;
    }

    /**
     * Ruft den Wert der predefinedLocationSetReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationSetReference() {
        return predefinedLocationSetReference;
    }

    /**
     * Legt den Wert der predefinedLocationSetReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationSetReference(String value) {
        this.predefinedLocationSetReference = value;
    }

    /**
     * Gets the value of the linearTrafficView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the linearTrafficView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearTrafficView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearTrafficView }
     * 
     * 
     */
    public List<LinearTrafficView> getLinearTrafficView() {
        if (linearTrafficView == null) {
            linearTrafficView = new ArrayList<LinearTrafficView>();
        }
        return this.linearTrafficView;
    }

    /**
     * Ruft den Wert der trafficViewExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficViewExtension() {
        return trafficViewExtension;
    }

    /**
     * Legt den Wert der trafficViewExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficViewExtension(ExtensionType value) {
        this.trafficViewExtension = value;
    }

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

    public TrafficView withTrafficViewTime(ZonedDateTime value) {
        setTrafficViewTime(value);
        return this;
    }

    public TrafficView withPredefinedLocationSetReference(String value) {
        setPredefinedLocationSetReference(value);
        return this;
    }

    public TrafficView withLinearTrafficView(LinearTrafficView... values) {
        if (values!= null) {
            for (LinearTrafficView value: values) {
                getLinearTrafficView().add(value);
            }
        }
        return this;
    }

    public TrafficView withLinearTrafficView(Collection<LinearTrafficView> values) {
        if (values!= null) {
            getLinearTrafficView().addAll(values);
        }
        return this;
    }

    public TrafficView withTrafficViewExtension(ExtensionType value) {
        setTrafficViewExtension(value);
        return this;
    }

    public TrafficView withId(String value) {
        setId(value);
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
