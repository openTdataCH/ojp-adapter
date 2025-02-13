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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für GeoRestrictionsStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeoRestrictionsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Circle" type="{http://www.vdv.de/ojp}GeoCircleStructure"/&gt;
 *         &lt;element name="Rectangle" type="{http://www.vdv.de/ojp}GeoRectangleStructure"/&gt;
 *         &lt;element name="Area" type="{http://www.vdv.de/ojp}GeoAreaStructure"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoRestrictionsStructure", propOrder = {
    "circle",
    "rectangle",
    "area"
})
public class GeoRestrictionsStructure {

    @XmlElement(name = "Circle")
    protected GeoCircleStructure circle;
    @XmlElement(name = "Rectangle")
    protected GeoRectangleStructure rectangle;
    @XmlElement(name = "Area")
    protected GeoAreaStructure area;

    /**
     * Ruft den Wert der circle-Eigenschaft ab.
     *
     * @return possible object is {@link GeoCircleStructure }
     */
    public GeoCircleStructure getCircle() {
        return circle;
    }

    /**
     * Legt den Wert der circle-Eigenschaft fest.
     *
     * @param value allowed object is {@link GeoCircleStructure }
     */
    public void setCircle(GeoCircleStructure value) {
        this.circle = value;
    }

    /**
     * Ruft den Wert der rectangle-Eigenschaft ab.
     *
     * @return possible object is {@link GeoRectangleStructure }
     */
    public GeoRectangleStructure getRectangle() {
        return rectangle;
    }

    /**
     * Legt den Wert der rectangle-Eigenschaft fest.
     *
     * @param value allowed object is {@link GeoRectangleStructure }
     */
    public void setRectangle(GeoRectangleStructure value) {
        this.rectangle = value;
    }

    /**
     * Ruft den Wert der area-Eigenschaft ab.
     *
     * @return possible object is {@link GeoAreaStructure }
     */
    public GeoAreaStructure getArea() {
        return area;
    }

    /**
     * Legt den Wert der area-Eigenschaft fest.
     *
     * @param value allowed object is {@link GeoAreaStructure }
     */
    public void setArea(GeoAreaStructure value) {
        this.area = value;
    }

    public GeoRestrictionsStructure withCircle(GeoCircleStructure value) {
        setCircle(value);
        return this;
    }

    public GeoRestrictionsStructure withRectangle(GeoRectangleStructure value) {
        setRectangle(value);
        return this;
    }

    public GeoRestrictionsStructure withArea(GeoAreaStructure value) {
        setArea(value);
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
