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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für TpegPointLocation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TpegPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc02DirectionTypeEnum"/&gt;
 *         &lt;element name="tpegPointLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPointLocation", propOrder = {
    "tpegDirection",
    "tpegPointLocationExtension"
})
@XmlSeeAlso({
    TpegFramedPoint.class,
    TpegSimplePoint.class
})
public abstract class TpegPointLocation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc02DirectionTypeEnum tpegDirection;
    protected ExtensionType tpegPointLocationExtension;

    /**
     * Ruft den Wert der tpegDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc02DirectionTypeEnum }
     *     
     */
    public TpegLoc02DirectionTypeEnum getTpegDirection() {
        return tpegDirection;
    }

    /**
     * Legt den Wert der tpegDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc02DirectionTypeEnum }
     *     
     */
    public void setTpegDirection(TpegLoc02DirectionTypeEnum value) {
        this.tpegDirection = value;
    }

    /**
     * Ruft den Wert der tpegPointLocationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegPointLocationExtension() {
        return tpegPointLocationExtension;
    }

    /**
     * Legt den Wert der tpegPointLocationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegPointLocationExtension(ExtensionType value) {
        this.tpegPointLocationExtension = value;
    }

    public TpegPointLocation withTpegDirection(TpegLoc02DirectionTypeEnum value) {
        setTpegDirection(value);
        return this;
    }

    public TpegPointLocation withTpegPointLocationExtension(ExtensionType value) {
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
