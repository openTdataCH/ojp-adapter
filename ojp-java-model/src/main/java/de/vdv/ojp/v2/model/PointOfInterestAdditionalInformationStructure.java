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
 * Generic structure for additional information on POIs.
 *
 * <p>Java-Klasse für PointOfInterestAdditionalInformationStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PointOfInterestAdditionalInformationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POIAdditionalInformation" type="{http://www.vdv.de/ojp}CategoryKeyValueType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestAdditionalInformationStructure", propOrder = {
    "poiAdditionalInformation"
})
public class PointOfInterestAdditionalInformationStructure {

    @XmlElement(name = "POIAdditionalInformation", required = true)
    protected List<CategoryKeyValueType> poiAdditionalInformation;

    /**
     * Gets the value of the poiAdditionalInformation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the poiAdditionalInformation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOIAdditionalInformation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CategoryKeyValueType }
     */
    public List<CategoryKeyValueType> getPOIAdditionalInformation() {
        if (poiAdditionalInformation == null) {
            poiAdditionalInformation = new ArrayList<CategoryKeyValueType>();
        }
        return this.poiAdditionalInformation;
    }

    public PointOfInterestAdditionalInformationStructure withPOIAdditionalInformation(CategoryKeyValueType... values) {
        if (values != null) {
            for (CategoryKeyValueType value : values) {
                getPOIAdditionalInformation().add(value);
            }
        }
        return this;
    }

    public PointOfInterestAdditionalInformationStructure withPOIAdditionalInformation(Collection<CategoryKeyValueType> values) {
        if (values != null) {
            getPOIAdditionalInformation().addAll(values);
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
