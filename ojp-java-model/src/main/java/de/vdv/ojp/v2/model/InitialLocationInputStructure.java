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
import uk.org.siri.siri.ParticipantRefStructure;

/**
 * <p>Java-Klasse für InitialLocationInputStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InitialLocationInputStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="GeoRestriction" type="{http://www.vdv.de/ojp}GeoRestrictionsStructure" minOccurs="0"/&gt;
 *         &lt;element name="AllowedSystem" type="{http://www.siri.org.uk/siri}ParticipantRefStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialLocationInputStructure", propOrder = {
    "name",
    "geoPosition",
    "geoRestriction",
    "allowedSystem"
})
public class InitialLocationInputStructure {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "GeoRestriction")
    protected GeoRestrictionsStructure geoRestriction;
    @XmlElement(name = "AllowedSystem")
    protected List<ParticipantRefStructure> allowedSystem;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setName(String value) {
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
     * Ruft den Wert der geoRestriction-Eigenschaft ab.
     *
     * @return possible object is {@link GeoRestrictionsStructure }
     */
    public GeoRestrictionsStructure getGeoRestriction() {
        return geoRestriction;
    }

    /**
     * Legt den Wert der geoRestriction-Eigenschaft fest.
     *
     * @param value allowed object is {@link GeoRestrictionsStructure }
     */
    public void setGeoRestriction(GeoRestrictionsStructure value) {
        this.geoRestriction = value;
    }

    /**
     * Gets the value of the allowedSystem property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the allowedSystem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedSystem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ParticipantRefStructure }
     */
    public List<ParticipantRefStructure> getAllowedSystem() {
        if (allowedSystem == null) {
            allowedSystem = new ArrayList<ParticipantRefStructure>();
        }
        return this.allowedSystem;
    }

    public InitialLocationInputStructure withName(String value) {
        setName(value);
        return this;
    }

    public InitialLocationInputStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public InitialLocationInputStructure withGeoRestriction(GeoRestrictionsStructure value) {
        setGeoRestriction(value);
        return this;
    }

    public InitialLocationInputStructure withAllowedSystem(ParticipantRefStructure... values) {
        if (values != null) {
            for (ParticipantRefStructure value : values) {
                getAllowedSystem().add(value);
            }
        }
        return this;
    }

    public InitialLocationInputStructure withAllowedSystem(Collection<ParticipantRefStructure> values) {
        if (values != null) {
            getAllowedSystem().addAll(values);
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
