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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * [a view of PLACE in TMv6] a PLACE and access to it by individual transport
 *
 * <p>Java-Klasse für PlaceContextStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PlaceContextStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PlaceRef" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *           &lt;element name="TripLocation" type="{http://www.vdv.de/ojp}TripLocationStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="DepArrTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *           &lt;element name="TimeAllowance" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IndividualTransportOption" type="{http://www.vdv.de/ojp}IndividualTransportOptionStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceContextStructure", propOrder = {
    "placeRef",
    "tripLocation",
    "depArrTime",
    "timeAllowance",
    "individualTransportOption"
})
public class PlaceContextStructure {

    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "TripLocation")
    protected TripLocationStructure tripLocation;
    @XmlElement(name = "DepArrTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime depArrTime;
    @XmlElement(name = "TimeAllowance", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeAllowance;
    @XmlElement(name = "IndividualTransportOption")
    protected List<IndividualTransportOptionStructure> individualTransportOption;

    /**
     * Ruft den Wert der placeRef-Eigenschaft ab.
     *
     * @return possible object is {@link PlaceRefStructure }
     */
    public PlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link PlaceRefStructure }
     */
    public void setPlaceRef(PlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Ruft den Wert der tripLocation-Eigenschaft ab.
     *
     * @return possible object is {@link TripLocationStructure }
     */
    public TripLocationStructure getTripLocation() {
        return tripLocation;
    }

    /**
     * Legt den Wert der tripLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link TripLocationStructure }
     */
    public void setTripLocation(TripLocationStructure value) {
        this.tripLocation = value;
    }

    /**
     * Ruft den Wert der depArrTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getDepArrTime() {
        return depArrTime;
    }

    /**
     * Legt den Wert der depArrTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDepArrTime(ZonedDateTime value) {
        this.depArrTime = value;
    }

    /**
     * Ruft den Wert der timeAllowance-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getTimeAllowance() {
        return timeAllowance;
    }

    /**
     * Legt den Wert der timeAllowance-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTimeAllowance(Duration value) {
        this.timeAllowance = value;
    }

    /**
     * Gets the value of the individualTransportOption property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the individualTransportOption property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualTransportOption().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link IndividualTransportOptionStructure }
     */
    public List<IndividualTransportOptionStructure> getIndividualTransportOption() {
        if (individualTransportOption == null) {
            individualTransportOption = new ArrayList<IndividualTransportOptionStructure>();
        }
        return this.individualTransportOption;
    }

    public PlaceContextStructure withPlaceRef(PlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public PlaceContextStructure withTripLocation(TripLocationStructure value) {
        setTripLocation(value);
        return this;
    }

    public PlaceContextStructure withDepArrTime(ZonedDateTime value) {
        setDepArrTime(value);
        return this;
    }

    public PlaceContextStructure withTimeAllowance(Duration value) {
        setTimeAllowance(value);
        return this;
    }

    public PlaceContextStructure withIndividualTransportOption(IndividualTransportOptionStructure... values) {
        if (values != null) {
            for (IndividualTransportOptionStructure value : values) {
                getIndividualTransportOption().add(value);
            }
        }
        return this;
    }

    public PlaceContextStructure withIndividualTransportOption(Collection<IndividualTransportOptionStructure> values) {
        if (values != null) {
            getIndividualTransportOption().addAll(values);
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
