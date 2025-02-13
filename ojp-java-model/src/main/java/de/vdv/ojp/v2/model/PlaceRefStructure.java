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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.LocationStructure;
import uk.org.siri.siri.StopPointRefStructure;

/**
 * Reference to a geographic PLACE of any type which may be specified as the origin or destination of a trip.
 *
 * <p>Java-Klasse für PlaceRefStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PlaceRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}PlaceRefGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceRefStructure", propOrder = {
    "stopPointRef",
    "stopPlaceRef",
    "geoPosition",
    "topographicPlaceRef",
    "pointOfInterestRef",
    "addressRef",
    "name",
    "allowedSystemId"
})
public class PlaceRefStructure {

    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPlaceRef")
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "PointOfInterestRef")
    protected PointOfInterestRefStructure pointOfInterestRef;
    @XmlElement(name = "AddressRef")
    protected AddressRefStructure addressRef;
    @XmlElement(name = "Name", required = true)
    protected InternationalTextStructure name;
    @XmlElement(name = "AllowedSystemId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> allowedSystemId;

    /**
     * Reference to a stop point.
     *
     * @return possible object is {@link StopPointRefStructure }
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Legt den Wert der stopPointRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPointRefStructure }
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Ruft den Wert der stopPlaceRef-Eigenschaft ab.
     *
     * @return possible object is {@link StopPlaceRefStructure }
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Legt den Wert der stopPlaceRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPlaceRefStructure }
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    /**
     * Ruft den Wert der geoPosition-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getGeoPosition() {
        return geoPosition;
    }

    /**
     * Legt den Wert der geoPosition-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setGeoPosition(LocationStructure value) {
        this.geoPosition = value;
    }

    /**
     * Ruft den Wert der topographicPlaceRef-Eigenschaft ab.
     *
     * @return possible object is {@link TopographicPlaceRefStructure }
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Legt den Wert der topographicPlaceRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TopographicPlaceRefStructure }
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Ruft den Wert der pointOfInterestRef-Eigenschaft ab.
     *
     * @return possible object is {@link PointOfInterestRefStructure }
     */
    public PointOfInterestRefStructure getPointOfInterestRef() {
        return pointOfInterestRef;
    }

    /**
     * Legt den Wert der pointOfInterestRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link PointOfInterestRefStructure }
     */
    public void setPointOfInterestRef(PointOfInterestRefStructure value) {
        this.pointOfInterestRef = value;
    }

    /**
     * Ruft den Wert der addressRef-Eigenschaft ab.
     *
     * @return possible object is {@link AddressRefStructure }
     */
    public AddressRefStructure getAddressRef() {
        return addressRef;
    }

    /**
     * Legt den Wert der addressRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link AddressRefStructure }
     */
    public void setAddressRef(AddressRefStructure value) {
        this.addressRef = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setName(InternationalTextStructure value) {
        this.name = value;
    }

    /**
     * Gets the value of the allowedSystemId property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the allowedSystemId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedSystemId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getAllowedSystemId() {
        if (allowedSystemId == null) {
            allowedSystemId = new ArrayList<String>();
        }
        return this.allowedSystemId;
    }

    public PlaceRefStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public PlaceRefStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    public PlaceRefStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public PlaceRefStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public PlaceRefStructure withPointOfInterestRef(PointOfInterestRefStructure value) {
        setPointOfInterestRef(value);
        return this;
    }

    public PlaceRefStructure withAddressRef(AddressRefStructure value) {
        setAddressRef(value);
        return this;
    }

    public PlaceRefStructure withName(InternationalTextStructure value) {
        setName(value);
        return this;
    }

    public PlaceRefStructure withAllowedSystemId(String... values) {
        if (values != null) {
            for (String value : values) {
                getAllowedSystemId().add(value);
            }
        }
        return this;
    }

    public PlaceRefStructure withAllowedSystemId(Collection<String> values) {
        if (values != null) {
            getAllowedSystemId().addAll(values);
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
