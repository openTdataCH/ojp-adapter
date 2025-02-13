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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.LocationStructure;

/**
 * <p>Java-Klasse für GeoCircleStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeoCircleStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Center" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *         &lt;element name="Radius" type="{http://www.siri.org.uk/siri}DistanceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoCircleStructure", propOrder = {
    "center",
    "radius"
})
public class GeoCircleStructure {

    @XmlElement(name = "Center", required = true)
    protected LocationStructure center;
    @XmlElement(name = "Radius", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger radius;

    /**
     * Ruft den Wert der center-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getCenter() {
        return center;
    }

    /**
     * Legt den Wert der center-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setCenter(LocationStructure value) {
        this.center = value;
    }

    /**
     * Ruft den Wert der radius-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getRadius() {
        return radius;
    }

    /**
     * Legt den Wert der radius-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setRadius(BigInteger value) {
        this.radius = value;
    }

    public GeoCircleStructure withCenter(LocationStructure value) {
        setCenter(value);
        return this;
    }

    public GeoCircleStructure withRadius(BigInteger value) {
        setRadius(value);
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
