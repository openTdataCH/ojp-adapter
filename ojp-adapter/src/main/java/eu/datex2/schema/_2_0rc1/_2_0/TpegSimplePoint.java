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
 * <p>Java-Klasse für TpegSimplePoint complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TpegSimplePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegSimplePointLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01SimplePointLocationSubtypeEnum"/&gt;
 *         &lt;element name="point" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPoint"/&gt;
 *         &lt;element name="tpegSimplePointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegSimplePoint", propOrder = {
    "tpegSimplePointLocationType",
    "point",
    "tpegSimplePointExtension"
})
public class TpegSimplePoint
    extends TpegPointLocation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc01SimplePointLocationSubtypeEnum tpegSimplePointLocationType;
    @XmlElement(required = true)
    protected TpegPoint point;
    protected ExtensionType tpegSimplePointExtension;

    /**
     * Ruft den Wert der tpegSimplePointLocationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public TpegLoc01SimplePointLocationSubtypeEnum getTpegSimplePointLocationType() {
        return tpegSimplePointLocationType;
    }

    /**
     * Legt den Wert der tpegSimplePointLocationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public void setTpegSimplePointLocationType(TpegLoc01SimplePointLocationSubtypeEnum value) {
        this.tpegSimplePointLocationType = value;
    }

    /**
     * Ruft den Wert der point-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getPoint() {
        return point;
    }

    /**
     * Legt den Wert der point-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setPoint(TpegPoint value) {
        this.point = value;
    }

    /**
     * Ruft den Wert der tpegSimplePointExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegSimplePointExtension() {
        return tpegSimplePointExtension;
    }

    /**
     * Legt den Wert der tpegSimplePointExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegSimplePointExtension(ExtensionType value) {
        this.tpegSimplePointExtension = value;
    }

    public TpegSimplePoint withTpegSimplePointLocationType(TpegLoc01SimplePointLocationSubtypeEnum value) {
        setTpegSimplePointLocationType(value);
        return this;
    }

    public TpegSimplePoint withPoint(TpegPoint value) {
        setPoint(value);
        return this;
    }

    public TpegSimplePoint withTpegSimplePointExtension(ExtensionType value) {
        setTpegSimplePointExtension(value);
        return this;
    }

    @Override
    public TpegSimplePoint withTpegDirection(TpegLoc02DirectionTypeEnum value) {
        setTpegDirection(value);
        return this;
    }

    @Override
    public TpegSimplePoint withTpegPointLocationExtension(ExtensionType value) {
        setTpegPointLocationExtension(value);
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
