//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für TpegGeometricArea complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TpegGeometricArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegAreaLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="radius" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger"/&gt;
 *         &lt;element name="centrePoint" type="{http://datex2.eu/schema/2_0RC1/2_0}PointCoordinates"/&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegAreaDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="tpegGeometricAreaExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegGeometricArea", propOrder = {
    "radius",
    "centrePoint",
    "name",
    "tpegGeometricAreaExtension"
})
public class TpegGeometricArea
    extends TpegAreaLocation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger radius;
    @XmlElement(required = true)
    protected PointCoordinates centrePoint;
    protected TpegAreaDescriptor name;
    protected ExtensionType tpegGeometricAreaExtension;

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

    /**
     * Ruft den Wert der centrePoint-Eigenschaft ab.
     *
     * @return possible object is {@link PointCoordinates }
     */
    public PointCoordinates getCentrePoint() {
        return centrePoint;
    }

    /**
     * Legt den Wert der centrePoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link PointCoordinates }
     */
    public void setCentrePoint(PointCoordinates value) {
        this.centrePoint = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is {@link TpegAreaDescriptor }
     */
    public TpegAreaDescriptor getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegAreaDescriptor }
     */
    public void setName(TpegAreaDescriptor value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der tpegGeometricAreaExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTpegGeometricAreaExtension() {
        return tpegGeometricAreaExtension;
    }

    /**
     * Legt den Wert der tpegGeometricAreaExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTpegGeometricAreaExtension(ExtensionType value) {
        this.tpegGeometricAreaExtension = value;
    }

    public TpegGeometricArea withRadius(BigInteger value) {
        setRadius(value);
        return this;
    }

    public TpegGeometricArea withCentrePoint(PointCoordinates value) {
        setCentrePoint(value);
        return this;
    }

    public TpegGeometricArea withName(TpegAreaDescriptor value) {
        setName(value);
        return this;
    }

    public TpegGeometricArea withTpegGeometricAreaExtension(ExtensionType value) {
        setTpegGeometricAreaExtension(value);
        return this;
    }

    @Override
    public TpegGeometricArea withTpegAreaLocationType(TpegLoc01AreaLocationSubtypeEnum value) {
        setTpegAreaLocationType(value);
        return this;
    }

    @Override
    public TpegGeometricArea withTpegHeight(TpegHeight value) {
        setTpegHeight(value);
        return this;
    }

    @Override
    public TpegGeometricArea withTpegAreaLocationExtension(ExtensionType value) {
        setTpegAreaLocationExtension(value);
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
