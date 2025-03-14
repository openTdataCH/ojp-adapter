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
 * A structure for an ordered list of booking notes.
 *
 * <p>Java-Klasse für BookingNotesStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BookingNotesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingNote" type="{http://www.vdv.de/ojp}InternationalTextStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingNotesStructure", propOrder = {
    "bookingNote"
})
public class BookingNotesStructure {

    @XmlElement(name = "BookingNote", required = true)
    protected List<InternationalTextStructure> bookingNote;

    /**
     * Gets the value of the bookingNote property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the bookingNote property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingNote().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link InternationalTextStructure }
     */
    public List<InternationalTextStructure> getBookingNote() {
        if (bookingNote == null) {
            bookingNote = new ArrayList<InternationalTextStructure>();
        }
        return this.bookingNote;
    }

    public BookingNotesStructure withBookingNote(InternationalTextStructure... values) {
        if (values != null) {
            for (InternationalTextStructure value : values) {
                getBookingNote().add(value);
            }
        }
        return this;
    }

    public BookingNotesStructure withBookingNote(Collection<InternationalTextStructure> values) {
        if (values != null) {
            getBookingNote().addAll(values);
        }
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
