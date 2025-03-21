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
 * The LINK PROJECTION of a Leg onto the topography of the route being followed.
 *
 * <p>Java-Klasse für LegTrackStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LegTrackStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackSection" type="{http://www.vdv.de/ojp}TrackSectionStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegTrackStructure", propOrder = {
    "trackSection"
})
public class LegTrackStructure {

    @XmlElement(name = "TrackSection", required = true)
    protected List<TrackSectionStructure> trackSection;

    /**
     * Gets the value of the trackSection property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the trackSection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackSection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TrackSectionStructure }
     */
    public List<TrackSectionStructure> getTrackSection() {
        if (trackSection == null) {
            trackSection = new ArrayList<TrackSectionStructure>();
        }
        return this.trackSection;
    }

    public LegTrackStructure withTrackSection(TrackSectionStructure... values) {
        if (values != null) {
            for (TrackSectionStructure value : values) {
                getTrackSection().add(value);
            }
        }
        return this;
    }

    public LegTrackStructure withTrackSection(Collection<TrackSectionStructure> values) {
        if (values != null) {
            getTrackSection().addAll(values);
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
