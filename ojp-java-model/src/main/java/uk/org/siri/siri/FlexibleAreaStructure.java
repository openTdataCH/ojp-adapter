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
import jakarta.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Bounding box, circular area or gml:polyon of the area where stops of a flexible service are called. (since SIRI 2.1) A flexible area is used in cases where a pre-booked service allows
 * pick-up/drop-off anywhere in a designated area and provides a possible interchange to a higher-frequency service.
 *
 * <p>Java-Klasse für FlexibleAreaStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FlexibleAreaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="BoundingBox" type="{http://www.siri.org.uk/siri}BoundingBoxStructure"/&gt;
 *         &lt;element name="CircularArea" type="{http://www.siri.org.uk/siri}CircularAreaStructure"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}Polygon"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleAreaStructure", propOrder = {
    "boundingBox",
    "circularArea",
    "polygon"
})
public class FlexibleAreaStructure {

    @XmlElement(name = "BoundingBox")
    protected BoundingBoxStructure boundingBox;
    @XmlElement(name = "CircularArea")
    protected CircularAreaStructure circularArea;
    @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml/3.2")
    protected PolygonType polygon;

    /**
     * Ruft den Wert der boundingBox-Eigenschaft ab.
     *
     * @return possible object is {@link BoundingBoxStructure }
     */
    public BoundingBoxStructure getBoundingBox() {
        return boundingBox;
    }

    /**
     * Legt den Wert der boundingBox-Eigenschaft fest.
     *
     * @param value allowed object is {@link BoundingBoxStructure }
     */
    public void setBoundingBox(BoundingBoxStructure value) {
        this.boundingBox = value;
    }

    /**
     * Ruft den Wert der circularArea-Eigenschaft ab.
     *
     * @return possible object is {@link CircularAreaStructure }
     */
    public CircularAreaStructure getCircularArea() {
        return circularArea;
    }

    /**
     * Legt den Wert der circularArea-Eigenschaft fest.
     *
     * @param value allowed object is {@link CircularAreaStructure }
     */
    public void setCircularArea(CircularAreaStructure value) {
        this.circularArea = value;
    }

    /**
     * Flexible area specified as a gml:Polygon that consists of an interior and exterior linear ring.
     *
     * @return possible object is {@link PolygonType }
     */
    public PolygonType getPolygon() {
        return polygon;
    }

    /**
     * Legt den Wert der polygon-Eigenschaft fest.
     *
     * @param value allowed object is {@link PolygonType }
     */
    public void setPolygon(PolygonType value) {
        this.polygon = value;
    }

    public FlexibleAreaStructure withBoundingBox(BoundingBoxStructure value) {
        setBoundingBox(value);
        return this;
    }

    public FlexibleAreaStructure withCircularArea(CircularAreaStructure value) {
        setCircularArea(value);
        return this;
    }

    public FlexibleAreaStructure withPolygon(PolygonType value) {
        setPolygon(value);
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
