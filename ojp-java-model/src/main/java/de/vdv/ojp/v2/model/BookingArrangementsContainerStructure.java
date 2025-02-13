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
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Container for multiple booking arrangements.
 *
 * <p>Java-Klasse für BookingArrangementsContainerStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BookingArrangementsContainerStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingArrangement" type="{http://www.vdv.de/ojp}BookingArrangementsStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingArrangementsContainerStructure", propOrder = {
    "bookingArrangement",
    "extension"
})
public class BookingArrangementsContainerStructure {

    @XmlElement(name = "BookingArrangement", required = true)
    protected List<BookingArrangementsStructure> bookingArrangement;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the bookingArrangement property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the bookingArrangement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingArrangement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link BookingArrangementsStructure }
     */
    public List<BookingArrangementsStructure> getBookingArrangement() {
        if (bookingArrangement == null) {
            bookingArrangement = new ArrayList<BookingArrangementsStructure>();
        }
        return this.bookingArrangement;
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

    public BookingArrangementsContainerStructure withBookingArrangement(BookingArrangementsStructure... values) {
        if (values != null) {
            for (BookingArrangementsStructure value : values) {
                getBookingArrangement().add(value);
            }
        }
        return this;
    }

    public BookingArrangementsContainerStructure withBookingArrangement(Collection<BookingArrangementsStructure> values) {
        if (values != null) {
            getBookingArrangement().addAll(values);
        }
        return this;
    }

    public BookingArrangementsContainerStructure withExtension(Object value) {
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
