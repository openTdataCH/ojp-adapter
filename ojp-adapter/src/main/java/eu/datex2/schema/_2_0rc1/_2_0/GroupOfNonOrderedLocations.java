//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für GroupOfNonOrderedLocations complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfNonOrderedLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationContainedInGroup" type="{http://datex2.eu/schema/2_0RC1/2_0}Location" maxOccurs="unbounded"/&gt;
 *         &lt;element name="groupOfNonOrderedLocationsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfNonOrderedLocations", propOrder = {
    "locationContainedInGroup",
    "groupOfNonOrderedLocationsExtension"
})
public class GroupOfNonOrderedLocations
    extends GroupOfLocations
{

    @XmlElement(required = true)
    protected List<Location> locationContainedInGroup;
    protected ExtensionType groupOfNonOrderedLocationsExtension;

    /**
     * Gets the value of the locationContainedInGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationContainedInGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContainedInGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocationContainedInGroup() {
        if (locationContainedInGroup == null) {
            locationContainedInGroup = new ArrayList<Location>();
        }
        return this.locationContainedInGroup;
    }

    /**
     * Ruft den Wert der groupOfNonOrderedLocationsExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfNonOrderedLocationsExtension() {
        return groupOfNonOrderedLocationsExtension;
    }

    /**
     * Legt den Wert der groupOfNonOrderedLocationsExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfNonOrderedLocationsExtension(ExtensionType value) {
        this.groupOfNonOrderedLocationsExtension = value;
    }

    public GroupOfNonOrderedLocations withLocationContainedInGroup(Location... values) {
        if (values!= null) {
            for (Location value: values) {
                getLocationContainedInGroup().add(value);
            }
        }
        return this;
    }

    public GroupOfNonOrderedLocations withLocationContainedInGroup(Collection<Location> values) {
        if (values!= null) {
            getLocationContainedInGroup().addAll(values);
        }
        return this;
    }

    public GroupOfNonOrderedLocations withGroupOfNonOrderedLocationsExtension(ExtensionType value) {
        setGroupOfNonOrderedLocationsExtension(value);
        return this;
    }

    @Override
    public GroupOfNonOrderedLocations withGroupOfLocationsExtension(ExtensionType value) {
        setGroupOfLocationsExtension(value);
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
