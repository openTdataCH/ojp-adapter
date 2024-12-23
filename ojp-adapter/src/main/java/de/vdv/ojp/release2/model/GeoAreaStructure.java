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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.LocationStructure;


/**
 *  [specialisation of ZONE in TMv6] a LINK SEQUENCE (one-dimensional) forming the boundary of a ZONE
 * 	
 * 
 * <p>Java-Klasse für GeoAreaStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeoAreaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PolylinePoint" type="{http://www.siri.org.uk/siri}LocationStructure" maxOccurs="unbounded" minOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoAreaStructure", propOrder = {
    "polylinePoint"
})
public class GeoAreaStructure {

    @XmlElement(name = "PolylinePoint", required = true)
    protected List<LocationStructure> polylinePoint;

    /**
     * Gets the value of the polylinePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the polylinePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolylinePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationStructure }
     * 
     * 
     */
    public List<LocationStructure> getPolylinePoint() {
        if (polylinePoint == null) {
            polylinePoint = new ArrayList<LocationStructure>();
        }
        return this.polylinePoint;
    }

    public GeoAreaStructure withPolylinePoint(LocationStructure... values) {
        if (values!= null) {
            for (LocationStructure value: values) {
                getPolylinePoint().add(value);
            }
        }
        return this;
    }

    public GeoAreaStructure withPolylinePoint(Collection<LocationStructure> values) {
        if (values!= null) {
            getPolylinePoint().addAll(values);
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
