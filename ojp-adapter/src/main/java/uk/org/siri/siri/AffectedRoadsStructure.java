//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import eu.datex2.schema._2_0rc1._2_0.GroupOfLocations;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Location model for scope of SITUATION or effect.
 * 
 * <p>Java-Klasse für AffectedRoadsStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AffectedRoadsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datex2Locations" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="AffectedRoad" type="{http://www.siri.org.uk/siri}AffectedRoadStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedRoadsStructure", propOrder = {
    "datex2Locations",
    "affectedRoad"
})
public class AffectedRoadsStructure {

    @XmlElement(name = "Datex2Locations")
    protected GroupOfLocations datex2Locations;
    @XmlElement(name = "AffectedRoad")
    protected List<AffectedRoadStructure> affectedRoad;

    /**
     * Ruft den Wert der datex2Locations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getDatex2Locations() {
        return datex2Locations;
    }

    /**
     * Legt den Wert der datex2Locations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setDatex2Locations(GroupOfLocations value) {
        this.datex2Locations = value;
    }

    /**
     * Gets the value of the affectedRoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the affectedRoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedRoadStructure }
     * 
     * 
     */
    public List<AffectedRoadStructure> getAffectedRoad() {
        if (affectedRoad == null) {
            affectedRoad = new ArrayList<AffectedRoadStructure>();
        }
        return this.affectedRoad;
    }

    public AffectedRoadsStructure withDatex2Locations(GroupOfLocations value) {
        setDatex2Locations(value);
        return this;
    }

    public AffectedRoadsStructure withAffectedRoad(AffectedRoadStructure... values) {
        if (values!= null) {
            for (AffectedRoadStructure value: values) {
                getAffectedRoad().add(value);
            }
        }
        return this;
    }

    public AffectedRoadsStructure withAffectedRoad(Collection<AffectedRoadStructure> values) {
        if (values!= null) {
            getAffectedRoad().addAll(values);
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
