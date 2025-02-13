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
import uk.org.siri.siri.LocationStructure;

/**
 * geographic PLACE of any type which may be specified as the origin or destination of a trip
 *
 * <p>Java-Klasse für PlaceStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PlaceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="StopPoint" type="{http://www.vdv.de/ojp}StopPointStructure"/&gt;
 *           &lt;element name="StopPlace" type="{http://www.vdv.de/ojp}StopPlaceStructure"/&gt;
 *           &lt;element name="TopographicPlace" type="{http://www.vdv.de/ojp}TopographicPlaceStructure"/&gt;
 *           &lt;element name="PointOfInterest" type="{http://www.vdv.de/ojp}PointOfInterestStructure"/&gt;
 *           &lt;element name="Address" type="{http://www.vdv.de/ojp}AddressStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Name" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *         &lt;element name="Mode" type="{http://www.vdv.de/ojp}ModeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccessModeList" type="{http://www.vdv.de/ojp}AccessModesListOfEnumerations" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRefs" type="{http://www.vdv.de/ojp}SituationRefList" minOccurs="0"/&gt;
 *         &lt;element name="Attribute" type="{http://www.vdv.de/ojp}GeneralAttributeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceStructure", propOrder = {
    "stopPoint",
    "stopPlace",
    "topographicPlace",
    "pointOfInterest",
    "address",
    "name",
    "geoPosition",
    "mode",
    "accessModeList",
    "situationFullRefs",
    "attribute",
    "extension"
})
public class PlaceStructure {

    @XmlElement(name = "StopPoint")
    protected StopPointStructure stopPoint;
    @XmlElement(name = "StopPlace")
    protected StopPlaceStructure stopPlace;
    @XmlElement(name = "TopographicPlace")
    protected TopographicPlaceStructure topographicPlace;
    @XmlElement(name = "PointOfInterest")
    protected PointOfInterestStructure pointOfInterest;
    @XmlElement(name = "Address")
    protected AddressStructure address;
    @XmlElement(name = "Name", required = true)
    protected InternationalTextStructure name;
    @XmlElement(name = "GeoPosition", required = true)
    protected LocationStructure geoPosition;
    @XmlElement(name = "Mode")
    protected List<ModeStructure> mode;
    @XmlElement(name = "AccessModeList")
    protected AccessModesListOfEnumerations accessModeList;
    @XmlElement(name = "SituationFullRefs")
    protected SituationRefList situationFullRefs;
    @XmlElement(name = "Attribute")
    protected List<GeneralAttributeStructure> attribute;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der stopPoint-Eigenschaft ab.
     *
     * @return possible object is {@link StopPointStructure }
     */
    public StopPointStructure getStopPoint() {
        return stopPoint;
    }

    /**
     * Legt den Wert der stopPoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPointStructure }
     */
    public void setStopPoint(StopPointStructure value) {
        this.stopPoint = value;
    }

    /**
     * Ruft den Wert der stopPlace-Eigenschaft ab.
     *
     * @return possible object is {@link StopPlaceStructure }
     */
    public StopPlaceStructure getStopPlace() {
        return stopPlace;
    }

    /**
     * Legt den Wert der stopPlace-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPlaceStructure }
     */
    public void setStopPlace(StopPlaceStructure value) {
        this.stopPlace = value;
    }

    /**
     * Ruft den Wert der topographicPlace-Eigenschaft ab.
     *
     * @return possible object is {@link TopographicPlaceStructure }
     */
    public TopographicPlaceStructure getTopographicPlace() {
        return topographicPlace;
    }

    /**
     * Legt den Wert der topographicPlace-Eigenschaft fest.
     *
     * @param value allowed object is {@link TopographicPlaceStructure }
     */
    public void setTopographicPlace(TopographicPlaceStructure value) {
        this.topographicPlace = value;
    }

    /**
     * Ruft den Wert der pointOfInterest-Eigenschaft ab.
     *
     * @return possible object is {@link PointOfInterestStructure }
     */
    public PointOfInterestStructure getPointOfInterest() {
        return pointOfInterest;
    }

    /**
     * Legt den Wert der pointOfInterest-Eigenschaft fest.
     *
     * @param value allowed object is {@link PointOfInterestStructure }
     */
    public void setPointOfInterest(PointOfInterestStructure value) {
        this.pointOfInterest = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     *
     * @return possible object is {@link AddressStructure }
     */
    public AddressStructure getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     *
     * @param value allowed object is {@link AddressStructure }
     */
    public void setAddress(AddressStructure value) {
        this.address = value;
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
     * Gets the value of the mode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the mode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ModeStructure }
     */
    public List<ModeStructure> getMode() {
        if (mode == null) {
            mode = new ArrayList<ModeStructure>();
        }
        return this.mode;
    }

    /**
     * Ruft den Wert der accessModeList-Eigenschaft ab.
     *
     * @return possible object is {@link AccessModesListOfEnumerations }
     */
    public AccessModesListOfEnumerations getAccessModeList() {
        return accessModeList;
    }

    /**
     * Legt den Wert der accessModeList-Eigenschaft fest.
     *
     * @param value allowed object is {@link AccessModesListOfEnumerations }
     */
    public void setAccessModeList(AccessModesListOfEnumerations value) {
        this.accessModeList = value;
    }

    /**
     * Ruft den Wert der situationFullRefs-Eigenschaft ab.
     *
     * @return possible object is {@link SituationRefList }
     */
    public SituationRefList getSituationFullRefs() {
        return situationFullRefs;
    }

    /**
     * Legt den Wert der situationFullRefs-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationRefList }
     */
    public void setSituationFullRefs(SituationRefList value) {
        this.situationFullRefs = value;
    }

    /**
     * Gets the value of the attribute property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the attribute property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GeneralAttributeStructure }
     */
    public List<GeneralAttributeStructure> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<GeneralAttributeStructure>();
        }
        return this.attribute;
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

    public PlaceStructure withStopPoint(StopPointStructure value) {
        setStopPoint(value);
        return this;
    }

    public PlaceStructure withStopPlace(StopPlaceStructure value) {
        setStopPlace(value);
        return this;
    }

    public PlaceStructure withTopographicPlace(TopographicPlaceStructure value) {
        setTopographicPlace(value);
        return this;
    }

    public PlaceStructure withPointOfInterest(PointOfInterestStructure value) {
        setPointOfInterest(value);
        return this;
    }

    public PlaceStructure withAddress(AddressStructure value) {
        setAddress(value);
        return this;
    }

    public PlaceStructure withName(InternationalTextStructure value) {
        setName(value);
        return this;
    }

    public PlaceStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public PlaceStructure withMode(ModeStructure... values) {
        if (values != null) {
            for (ModeStructure value : values) {
                getMode().add(value);
            }
        }
        return this;
    }

    public PlaceStructure withMode(Collection<ModeStructure> values) {
        if (values != null) {
            getMode().addAll(values);
        }
        return this;
    }

    public PlaceStructure withAccessModeList(AccessModesListOfEnumerations value) {
        setAccessModeList(value);
        return this;
    }

    public PlaceStructure withSituationFullRefs(SituationRefList value) {
        setSituationFullRefs(value);
        return this;
    }

    public PlaceStructure withAttribute(GeneralAttributeStructure... values) {
        if (values != null) {
            for (GeneralAttributeStructure value : values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public PlaceStructure withAttribute(Collection<GeneralAttributeStructure> values) {
        if (values != null) {
            getAttribute().addAll(values);
        }
        return this;
    }

    public PlaceStructure withExtension(Object value) {
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
