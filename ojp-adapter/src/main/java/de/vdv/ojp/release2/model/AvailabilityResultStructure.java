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
 * Availability result structure.
 * 
 * <p>Java-Klasse für AvailabilityResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.vdv.de/ojp}OJPErrorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PublicTransport" type="{http://www.vdv.de/ojp}BookingPTLegStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}BookableTicketAndServiceInformationGroup"/&gt;
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
@XmlType(name = "AvailabilityResultStructure", propOrder = {
    "errorCondition",
    "publicTransport",
    "bookableTicket",
    "bookableServiceItem",
    "extension"
})
public class AvailabilityResultStructure {

    @XmlElement(name = "ErrorCondition")
    protected List<OJPErrorStructure> errorCondition;
    @XmlElement(name = "PublicTransport")
    protected BookingPTLegStructure publicTransport;
    @XmlElement(name = "BookableTicket")
    protected List<FareProductStructure> bookableTicket;
    @XmlElement(name = "BookableServiceItem")
    protected List<BookableServiceItemStructure> bookableServiceItem;
    @XmlElement(name = "Extension")
    protected Object extension;

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
     * Ruft den Wert der publicTransport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingPTLegStructure }
     *     
     */
    public BookingPTLegStructure getPublicTransport() {
        return publicTransport;
    }

    /**
     * Legt den Wert der publicTransport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingPTLegStructure }
     *     
     */
    public void setPublicTransport(BookingPTLegStructure value) {
        this.publicTransport = value;
    }

    /**
     * Gets the value of the bookableTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bookableTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookableTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductStructure }
     * 
     * 
     */
    public List<FareProductStructure> getBookableTicket() {
        if (bookableTicket == null) {
            bookableTicket = new ArrayList<FareProductStructure>();
        }
        return this.bookableTicket;
    }

    /**
     * Gets the value of the bookableServiceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bookableServiceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookableServiceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookableServiceItemStructure }
     * 
     * 
     */
    public List<BookableServiceItemStructure> getBookableServiceItem() {
        if (bookableServiceItem == null) {
            bookableServiceItem = new ArrayList<BookableServiceItemStructure>();
        }
        return this.bookableServiceItem;
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

    public AvailabilityResultStructure withErrorCondition(OJPErrorStructure... values) {
        if (values!= null) {
            for (OJPErrorStructure value: values) {
                getErrorCondition().add(value);
            }
        }
        return this;
    }

    public AvailabilityResultStructure withErrorCondition(Collection<OJPErrorStructure> values) {
        if (values!= null) {
            getErrorCondition().addAll(values);
        }
        return this;
    }

    public AvailabilityResultStructure withPublicTransport(BookingPTLegStructure value) {
        setPublicTransport(value);
        return this;
    }

    public AvailabilityResultStructure withBookableTicket(FareProductStructure... values) {
        if (values!= null) {
            for (FareProductStructure value: values) {
                getBookableTicket().add(value);
            }
        }
        return this;
    }

    public AvailabilityResultStructure withBookableTicket(Collection<FareProductStructure> values) {
        if (values!= null) {
            getBookableTicket().addAll(values);
        }
        return this;
    }

    public AvailabilityResultStructure withBookableServiceItem(BookableServiceItemStructure... values) {
        if (values!= null) {
            for (BookableServiceItemStructure value: values) {
                getBookableServiceItem().add(value);
            }
        }
        return this;
    }

    public AvailabilityResultStructure withBookableServiceItem(Collection<BookableServiceItemStructure> values) {
        if (values!= null) {
            getBookableServiceItem().addAll(values);
        }
        return this;
    }

    public AvailabilityResultStructure withExtension(Object value) {
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
