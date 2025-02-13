//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Names of VIA points, used to help identify the LINE, for example, Luton to Luton via Sutton. Currently 3 in VDV. Should only be included if the detail level was requested.
 *
 * <p>Java-Klasse für PlaceNameStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PlaceNameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlaceRef" type="{http://www.siri.org.uk/siri}JourneyPlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PlaceShortName" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceNameStructure", propOrder = {
    "placeRef",
    "placeName",
    "placeShortName"
})
@XmlSeeAlso({
    ViaNameStructure.class
})
public class PlaceNameStructure {

    @XmlElement(name = "PlaceRef")
    protected JourneyPlaceRefStructure placeRef;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguagePlaceNameStructure> placeName;
    @XmlElement(name = "PlaceShortName")
    protected List<NaturalLanguagePlaceNameStructure> placeShortName;

    /**
     * Ruft den Wert der placeRef-Eigenschaft ab.
     *
     * @return possible object is {@link JourneyPlaceRefStructure }
     */
    public JourneyPlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link JourneyPlaceRefStructure }
     */
    public void setPlaceRef(JourneyPlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Gets the value of the placeName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the placeName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.placeName;
    }

    /**
     * Gets the value of the placeShortName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the placeShortName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceShortName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getPlaceShortName() {
        if (placeShortName == null) {
            placeShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.placeShortName;
    }

    public PlaceNameStructure withPlaceRef(JourneyPlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public PlaceNameStructure withPlaceName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    public PlaceNameStructure withPlaceName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    public PlaceNameStructure withPlaceShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getPlaceShortName().add(value);
            }
        }
        return this;
    }

    public PlaceNameStructure withPlaceShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getPlaceShortName().addAll(values);
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
