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
 * Structure of a Multi Trip Fare Request.
 *
 * <p>Java-Klasse für MultiTripFareRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MultiTripFareRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TripContext" type="{http://www.vdv.de/ojp}ResponseContextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Trip" type="{http://www.vdv.de/ojp}TripStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiTripFareRequestStructure", propOrder = {
    "tripContext",
    "trip"
})
public class MultiTripFareRequestStructure {

    @XmlElement(name = "TripContext")
    protected ResponseContextStructure tripContext;
    @XmlElement(name = "Trip", required = true)
    protected List<TripStructure> trip;

    /**
     * Ruft den Wert der tripContext-Eigenschaft ab.
     *
     * @return possible object is {@link ResponseContextStructure }
     */
    public ResponseContextStructure getTripContext() {
        return tripContext;
    }

    /**
     * Legt den Wert der tripContext-Eigenschaft fest.
     *
     * @param value allowed object is {@link ResponseContextStructure }
     */
    public void setTripContext(ResponseContextStructure value) {
        this.tripContext = value;
    }

    /**
     * Gets the value of the trip property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the trip property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrip().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TripStructure }
     */
    public List<TripStructure> getTrip() {
        if (trip == null) {
            trip = new ArrayList<TripStructure>();
        }
        return this.trip;
    }

    public MultiTripFareRequestStructure withTripContext(ResponseContextStructure value) {
        setTripContext(value);
        return this;
    }

    public MultiTripFareRequestStructure withTrip(TripStructure... values) {
        if (values != null) {
            for (TripStructure value : values) {
                getTrip().add(value);
            }
        }
        return this;
    }

    public MultiTripFareRequestStructure withTrip(Collection<TripStructure> values) {
        if (values != null) {
            getTrip().addAll(values);
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
