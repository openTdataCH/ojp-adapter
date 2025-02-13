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

/**
 * Possibilities and restrictions for group booking.
 *
 * <p>Java-Klasse für GroupBookingListOfEnumerations complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GroupBookingListOfEnumerations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupBooking" type="{http://www.vdv.de/ojp}GroupBookingEnumeration" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupBookingListOfEnumerations", propOrder = {
    "groupBooking"
})
public class GroupBookingListOfEnumerations {

    @XmlElement(name = "GroupBooking", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected List<GroupBookingEnumeration> groupBooking;

    /**
     * Gets the value of the groupBooking property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the groupBooking property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupBooking().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GroupBookingEnumeration }
     */
    public List<GroupBookingEnumeration> getGroupBooking() {
        if (groupBooking == null) {
            groupBooking = new ArrayList<GroupBookingEnumeration>();
        }
        return this.groupBooking;
    }

    public GroupBookingListOfEnumerations withGroupBooking(GroupBookingEnumeration... values) {
        if (values != null) {
            for (GroupBookingEnumeration value : values) {
                getGroupBooking().add(value);
            }
        }
        return this;
    }

    public GroupBookingListOfEnumerations withGroupBooking(Collection<GroupBookingEnumeration> values) {
        if (values != null) {
            getGroupBooking().addAll(values);
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
