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
 * <p>Java-Klasse für TpegHeight complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TpegHeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="height" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="heightType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc04HeightTypeEnum"/&gt;
 *         &lt;element name="tpegHeightExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegHeight", propOrder = {
    "height",
    "heightType",
    "tpegHeightExtension"
})
public class TpegHeight {

    protected Float height;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc04HeightTypeEnum heightType;
    protected ExtensionType tpegHeightExtension;

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der heightType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc04HeightTypeEnum }
     *     
     */
    public TpegLoc04HeightTypeEnum getHeightType() {
        return heightType;
    }

    /**
     * Legt den Wert der heightType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc04HeightTypeEnum }
     *     
     */
    public void setHeightType(TpegLoc04HeightTypeEnum value) {
        this.heightType = value;
    }

    /**
     * Ruft den Wert der tpegHeightExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegHeightExtension() {
        return tpegHeightExtension;
    }

    /**
     * Legt den Wert der tpegHeightExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegHeightExtension(ExtensionType value) {
        this.tpegHeightExtension = value;
    }

    public TpegHeight withHeight(Float value) {
        setHeight(value);
        return this;
    }

    public TpegHeight withHeightType(TpegLoc04HeightTypeEnum value) {
        setHeightType(value);
        return this;
    }

    public TpegHeight withTpegHeightExtension(ExtensionType value) {
        setTpegHeightExtension(value);
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
