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
 * Structure of a Multi Trip Fare Request result
 *
 * <p>Java-Klasse für MultiTripFareResultStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MultiTripFareResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TripFareProductReference" type="{http://www.vdv.de/ojp}TripFareProductReferenceStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FareProduct" type="{http://www.vdv.de/ojp}FareProductStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PassedZones" type="{http://www.vdv.de/ojp}TariffZoneListInAreaStructure" minOccurs="0"/&gt;
 *         &lt;element name="StaticInfoUrl" type="{http://www.vdv.de/ojp}WebLinkStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiTripFareResultStructure", propOrder = {
    "tripFareProductReference",
    "fareProduct",
    "passedZones",
    "staticInfoUrl"
})
public class MultiTripFareResultStructure {

    @XmlElement(name = "TripFareProductReference", required = true)
    protected List<TripFareProductReferenceStructure> tripFareProductReference;
    @XmlElement(name = "FareProduct")
    protected List<FareProductStructure> fareProduct;
    @XmlElement(name = "PassedZones")
    protected TariffZoneListInAreaStructure passedZones;
    @XmlElement(name = "StaticInfoUrl")
    protected List<WebLinkStructure> staticInfoUrl;

    /**
     * Gets the value of the tripFareProductReference property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the tripFareProductReference property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripFareProductReference().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TripFareProductReferenceStructure }
     */
    public List<TripFareProductReferenceStructure> getTripFareProductReference() {
        if (tripFareProductReference == null) {
            tripFareProductReference = new ArrayList<TripFareProductReferenceStructure>();
        }
        return this.tripFareProductReference;
    }

    /**
     * Gets the value of the fareProduct property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the fareProduct property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProduct().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FareProductStructure }
     */
    public List<FareProductStructure> getFareProduct() {
        if (fareProduct == null) {
            fareProduct = new ArrayList<FareProductStructure>();
        }
        return this.fareProduct;
    }

    /**
     * Ruft den Wert der passedZones-Eigenschaft ab.
     *
     * @return possible object is {@link TariffZoneListInAreaStructure }
     */
    public TariffZoneListInAreaStructure getPassedZones() {
        return passedZones;
    }

    /**
     * Legt den Wert der passedZones-Eigenschaft fest.
     *
     * @param value allowed object is {@link TariffZoneListInAreaStructure }
     */
    public void setPassedZones(TariffZoneListInAreaStructure value) {
        this.passedZones = value;
    }

    /**
     * Gets the value of the staticInfoUrl property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the staticInfoUrl property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticInfoUrl().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link WebLinkStructure }
     */
    public List<WebLinkStructure> getStaticInfoUrl() {
        if (staticInfoUrl == null) {
            staticInfoUrl = new ArrayList<WebLinkStructure>();
        }
        return this.staticInfoUrl;
    }

    public MultiTripFareResultStructure withTripFareProductReference(TripFareProductReferenceStructure... values) {
        if (values != null) {
            for (TripFareProductReferenceStructure value : values) {
                getTripFareProductReference().add(value);
            }
        }
        return this;
    }

    public MultiTripFareResultStructure withTripFareProductReference(Collection<TripFareProductReferenceStructure> values) {
        if (values != null) {
            getTripFareProductReference().addAll(values);
        }
        return this;
    }

    public MultiTripFareResultStructure withFareProduct(FareProductStructure... values) {
        if (values != null) {
            for (FareProductStructure value : values) {
                getFareProduct().add(value);
            }
        }
        return this;
    }

    public MultiTripFareResultStructure withFareProduct(Collection<FareProductStructure> values) {
        if (values != null) {
            getFareProduct().addAll(values);
        }
        return this;
    }

    public MultiTripFareResultStructure withPassedZones(TariffZoneListInAreaStructure value) {
        setPassedZones(value);
        return this;
    }

    public MultiTripFareResultStructure withStaticInfoUrl(WebLinkStructure... values) {
        if (values != null) {
            for (WebLinkStructure value : values) {
                getStaticInfoUrl().add(value);
            }
        }
        return this;
    }

    public MultiTripFareResultStructure withStaticInfoUrl(Collection<WebLinkStructure> values) {
        if (values != null) {
            getStaticInfoUrl().addAll(values);
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
