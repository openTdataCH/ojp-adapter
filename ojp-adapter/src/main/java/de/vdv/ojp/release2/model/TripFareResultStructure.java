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
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Structure of a single TripFareResult. This may cover the whole trip or only the part the service can answer. If only partial answers can be delivered, then this must be indicated with FARE_ADDITIONALTICKETS (as a warning). For a given trip multiple FareResults may need to be combined to get the whole tariff. A typical example may be classic public transport and a sharing leg. Some legs, e.g., TransferLegs and walking ContinuousLeg will never have a price. The service may include them in one of the tickets. If the whole trip is for free, then a TripFareResult with a price of 0 is expected. It is possible to have combined FareResults (e.g., for a bundle) and in addition price each leg individually.
 * 
 * <p>Java-Klasse für TripFareResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripFareResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.vdv.de/ojp}OJPErrorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TripId" type="{http://www.vdv.de/ojp}TripObjectIdType" minOccurs="0"/&gt;
 *         &lt;element name="BookingId" type="{http://www.vdv.de/ojp}BookingObjectIdType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}LegRangeGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PassedZones" type="{http://www.vdv.de/ojp}TariffZoneListInAreaStructure" minOccurs="0"/&gt;
 *         &lt;element name="FareProduct" type="{http://www.vdv.de/ojp}FareProductStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StaticInfoUrl" type="{http://www.vdv.de/ojp}WebLinkStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripFareResultStructure", propOrder = {
    "errorCondition",
    "tripId",
    "bookingId",
    "legRangeGroup",
    "passedZones",
    "fareProduct",
    "staticInfoUrl"
})
public class TripFareResultStructure {

    @XmlElement(name = "ErrorCondition")
    protected List<OJPErrorStructure> errorCondition;
    @XmlElement(name = "TripId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tripId;
    @XmlElement(name = "BookingId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bookingId;
    @XmlElementRefs({
        @XmlElementRef(name = "FromLegIdRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ToLegIdRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> legRangeGroup;
    @XmlElement(name = "PassedZones")
    protected TariffZoneListInAreaStructure passedZones;
    @XmlElement(name = "FareProduct")
    protected List<FareProductStructure> fareProduct;
    @XmlElement(name = "StaticInfoUrl")
    protected List<WebLinkStructure> staticInfoUrl;

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
     * Ruft den Wert der tripId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripId() {
        return tripId;
    }

    /**
     * Legt den Wert der tripId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripId(String value) {
        this.tripId = value;
    }

    /**
     * Ruft den Wert der bookingId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * Legt den Wert der bookingId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingId(String value) {
        this.bookingId = value;
    }

    /**
     * A ticket may be valid for multiple non-consecutive legs. TransferLegs and ContinuousLegs without a tariff may be either included or ignored. If the tariff depends on not having a ContinuousLeg e.g., with sharing in the middle, then the server must decide, if it wants to provide more than one TripFareResult.Gets the value of the legRangeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the legRangeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegRangeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getLegRangeGroup() {
        if (legRangeGroup == null) {
            legRangeGroup = new ArrayList<JAXBElement<String>>();
        }
        return this.legRangeGroup;
    }

    /**
     * Ruft den Wert der passedZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneListInAreaStructure }
     *     
     */
    public TariffZoneListInAreaStructure getPassedZones() {
        return passedZones;
    }

    /**
     * Legt den Wert der passedZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneListInAreaStructure }
     *     
     */
    public void setPassedZones(TariffZoneListInAreaStructure value) {
        this.passedZones = value;
    }

    /**
     * Gets the value of the fareProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fareProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareProductStructure }
     * 
     * 
     */
    public List<FareProductStructure> getFareProduct() {
        if (fareProduct == null) {
            fareProduct = new ArrayList<FareProductStructure>();
        }
        return this.fareProduct;
    }

    /**
     * Gets the value of the staticInfoUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the staticInfoUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticInfoUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkStructure }
     * 
     * 
     */
    public List<WebLinkStructure> getStaticInfoUrl() {
        if (staticInfoUrl == null) {
            staticInfoUrl = new ArrayList<WebLinkStructure>();
        }
        return this.staticInfoUrl;
    }

    public TripFareResultStructure withErrorCondition(OJPErrorStructure... values) {
        if (values!= null) {
            for (OJPErrorStructure value: values) {
                getErrorCondition().add(value);
            }
        }
        return this;
    }

    public TripFareResultStructure withErrorCondition(Collection<OJPErrorStructure> values) {
        if (values!= null) {
            getErrorCondition().addAll(values);
        }
        return this;
    }

    public TripFareResultStructure withTripId(String value) {
        setTripId(value);
        return this;
    }

    public TripFareResultStructure withBookingId(String value) {
        setBookingId(value);
        return this;
    }

    public TripFareResultStructure withLegRangeGroup(JAXBElement<String> ... values) {
        if (values!= null) {
            for (JAXBElement<String> value: values) {
                getLegRangeGroup().add(value);
            }
        }
        return this;
    }

    public TripFareResultStructure withLegRangeGroup(Collection<JAXBElement<String>> values) {
        if (values!= null) {
            getLegRangeGroup().addAll(values);
        }
        return this;
    }

    public TripFareResultStructure withPassedZones(TariffZoneListInAreaStructure value) {
        setPassedZones(value);
        return this;
    }

    public TripFareResultStructure withFareProduct(FareProductStructure... values) {
        if (values!= null) {
            for (FareProductStructure value: values) {
                getFareProduct().add(value);
            }
        }
        return this;
    }

    public TripFareResultStructure withFareProduct(Collection<FareProductStructure> values) {
        if (values!= null) {
            getFareProduct().addAll(values);
        }
        return this;
    }

    public TripFareResultStructure withStaticInfoUrl(WebLinkStructure... values) {
        if (values!= null) {
            for (WebLinkStructure value: values) {
                getStaticInfoUrl().add(value);
            }
        }
        return this;
    }

    public TripFareResultStructure withStaticInfoUrl(Collection<WebLinkStructure> values) {
        if (values!= null) {
            getStaticInfoUrl().addAll(values);
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
