//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Structure of a Single Trip Fare Request.
 * 
 * <p>Java-Klasse für TripFareRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripFareRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TripContext" type="{http://www.vdv.de/ojp}ResponseContextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Trip" type="{http://www.vdv.de/ojp}TripStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripFareRequestStructure", propOrder = {
    "tripContext",
    "trip"
})
public class TripFareRequestStructure {

    @XmlElement(name = "TripContext")
    protected ResponseContextStructure tripContext;
    @XmlElement(name = "Trip", required = true)
    protected TripStructure trip;

    /**
     * Ruft den Wert der tripContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseContextStructure }
     *     
     */
    public ResponseContextStructure getTripContext() {
        return tripContext;
    }

    /**
     * Legt den Wert der tripContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseContextStructure }
     *     
     */
    public void setTripContext(ResponseContextStructure value) {
        this.tripContext = value;
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

    public TripFareRequestStructure withTripContext(ResponseContextStructure value) {
        setTripContext(value);
        return this;
    }

    public TripFareRequestStructure withTrip(TripStructure value) {
        setTrip(value);
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
