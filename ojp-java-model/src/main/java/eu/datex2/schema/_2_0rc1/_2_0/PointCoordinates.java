//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für PointCoordinates complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PointCoordinates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://datex2.eu/schema/2_0RC1/2_0}Float"/&gt;
 *         &lt;element name="longitude" type="{http://datex2.eu/schema/2_0RC1/2_0}Float"/&gt;
 *         &lt;element name="pointCoordinatesExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointCoordinates", propOrder = {
    "latitude",
    "longitude",
    "pointCoordinatesExtension"
})
public class PointCoordinates {

    protected float latitude;
    protected float longitude;
    protected ExtensionType pointCoordinatesExtension;

    /**
     * Ruft den Wert der latitude-Eigenschaft ab.
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Legt den Wert der latitude-Eigenschaft fest.
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Ruft den Wert der longitude-Eigenschaft ab.
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Legt den Wert der longitude-Eigenschaft fest.
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Ruft den Wert der pointCoordinatesExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getPointCoordinatesExtension() {
        return pointCoordinatesExtension;
    }

    /**
     * Legt den Wert der pointCoordinatesExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setPointCoordinatesExtension(ExtensionType value) {
        this.pointCoordinatesExtension = value;
    }

    public PointCoordinates withLatitude(float value) {
        setLatitude(value);
        return this;
    }

    public PointCoordinates withLongitude(float value) {
        setLongitude(value);
        return this;
    }

    public PointCoordinates withPointCoordinatesExtension(ExtensionType value) {
        setPointCoordinatesExtension(value);
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
