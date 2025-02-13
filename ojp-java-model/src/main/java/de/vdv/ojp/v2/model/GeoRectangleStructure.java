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
import uk.org.siri.siri.LocationStructure;

/**
 * <p>Java-Klasse für GeoRectangleStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeoRectangleStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpperLeft" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *         &lt;element name="LowerRight" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoRectangleStructure", propOrder = {
    "upperLeft",
    "lowerRight"
})
public class GeoRectangleStructure {

    @XmlElement(name = "UpperLeft", required = true)
    protected LocationStructure upperLeft;
    @XmlElement(name = "LowerRight", required = true)
    protected LocationStructure lowerRight;

    /**
     * Ruft den Wert der upperLeft-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getUpperLeft() {
        return upperLeft;
    }

    /**
     * Legt den Wert der upperLeft-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setUpperLeft(LocationStructure value) {
        this.upperLeft = value;
    }

    /**
     * Ruft den Wert der lowerRight-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getLowerRight() {
        return lowerRight;
    }

    /**
     * Legt den Wert der lowerRight-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setLowerRight(LocationStructure value) {
        this.lowerRight = value;
    }

    public GeoRectangleStructure withUpperLeft(LocationStructure value) {
        setUpperLeft(value);
        return this;
    }

    public GeoRectangleStructure withLowerRight(LocationStructure value) {
        setLowerRight(value);
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
