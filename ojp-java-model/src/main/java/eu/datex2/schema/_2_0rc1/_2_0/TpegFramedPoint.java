//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für TpegFramedPoint complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TpegFramedPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegFramedPointLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01FramedPointLocationSubtypeEnum"/&gt;
 *         &lt;element name="framedPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegNonJunctionPoint"/&gt;
 *         &lt;element name="to" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/&gt;
 *         &lt;element name="from" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/&gt;
 *         &lt;element name="tpegFramedPointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegFramedPoint", propOrder = {
    "tpegFramedPointLocationType",
    "framedPoint",
    "to",
    "from",
    "tpegFramedPointExtension"
})
public class TpegFramedPoint
    extends TpegPointLocation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc01FramedPointLocationSubtypeEnum tpegFramedPointLocationType;
    @XmlElement(required = true)
    protected TpegNonJunctionPoint framedPoint;
    @XmlElement(required = true)
    protected TpegPoint to;
    @XmlElement(required = true)
    protected TpegPoint from;
    protected ExtensionType tpegFramedPointExtension;

    /**
     * Ruft den Wert der tpegFramedPointLocationType-Eigenschaft ab.
     *
     * @return possible object is {@link TpegLoc01FramedPointLocationSubtypeEnum }
     */
    public TpegLoc01FramedPointLocationSubtypeEnum getTpegFramedPointLocationType() {
        return tpegFramedPointLocationType;
    }

    /**
     * Legt den Wert der tpegFramedPointLocationType-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegLoc01FramedPointLocationSubtypeEnum }
     */
    public void setTpegFramedPointLocationType(TpegLoc01FramedPointLocationSubtypeEnum value) {
        this.tpegFramedPointLocationType = value;
    }

    /**
     * Ruft den Wert der framedPoint-Eigenschaft ab.
     *
     * @return possible object is {@link TpegNonJunctionPoint }
     */
    public TpegNonJunctionPoint getFramedPoint() {
        return framedPoint;
    }

    /**
     * Legt den Wert der framedPoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegNonJunctionPoint }
     */
    public void setFramedPoint(TpegNonJunctionPoint value) {
        this.framedPoint = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     *
     * @return possible object is {@link TpegPoint }
     */
    public TpegPoint getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegPoint }
     */
    public void setTo(TpegPoint value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     *
     * @return possible object is {@link TpegPoint }
     */
    public TpegPoint getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegPoint }
     */
    public void setFrom(TpegPoint value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der tpegFramedPointExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTpegFramedPointExtension() {
        return tpegFramedPointExtension;
    }

    /**
     * Legt den Wert der tpegFramedPointExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTpegFramedPointExtension(ExtensionType value) {
        this.tpegFramedPointExtension = value;
    }

    public TpegFramedPoint withTpegFramedPointLocationType(TpegLoc01FramedPointLocationSubtypeEnum value) {
        setTpegFramedPointLocationType(value);
        return this;
    }

    public TpegFramedPoint withFramedPoint(TpegNonJunctionPoint value) {
        setFramedPoint(value);
        return this;
    }

    public TpegFramedPoint withTo(TpegPoint value) {
        setTo(value);
        return this;
    }

    public TpegFramedPoint withFrom(TpegPoint value) {
        setFrom(value);
        return this;
    }

    public TpegFramedPoint withTpegFramedPointExtension(ExtensionType value) {
        setTpegFramedPointExtension(value);
        return this;
    }

    @Override
    public TpegFramedPoint withTpegDirection(TpegLoc02DirectionTypeEnum value) {
        setTpegDirection(value);
        return this;
    }

    @Override
    public TpegFramedPoint withTpegPointLocationExtension(ExtensionType value) {
        setTpegPointLocationExtension(value);
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
