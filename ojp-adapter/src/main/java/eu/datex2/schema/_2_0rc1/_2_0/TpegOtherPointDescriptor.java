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
 * <p>Java-Klasse für TpegOtherPointDescriptor complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TpegOtherPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegOtherPointDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03OtherPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegOtherPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegOtherPointDescriptor", propOrder = {
    "tpegOtherPointDescriptorType",
    "tpegOtherPointDescriptorExtension"
})
public class TpegOtherPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03OtherPointDescriptorSubtypeEnum tpegOtherPointDescriptorType;
    protected ExtensionType tpegOtherPointDescriptorExtension;

    /**
     * Ruft den Wert der tpegOtherPointDescriptorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03OtherPointDescriptorSubtypeEnum getTpegOtherPointDescriptorType() {
        return tpegOtherPointDescriptorType;
    }

    /**
     * Legt den Wert der tpegOtherPointDescriptorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegOtherPointDescriptorType(TpegLoc03OtherPointDescriptorSubtypeEnum value) {
        this.tpegOtherPointDescriptorType = value;
    }

    /**
     * Ruft den Wert der tpegOtherPointDescriptorExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegOtherPointDescriptorExtension() {
        return tpegOtherPointDescriptorExtension;
    }

    /**
     * Legt den Wert der tpegOtherPointDescriptorExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegOtherPointDescriptorExtension(ExtensionType value) {
        this.tpegOtherPointDescriptorExtension = value;
    }

    public TpegOtherPointDescriptor withTpegOtherPointDescriptorType(TpegLoc03OtherPointDescriptorSubtypeEnum value) {
        setTpegOtherPointDescriptorType(value);
        return this;
    }

    public TpegOtherPointDescriptor withTpegOtherPointDescriptorExtension(ExtensionType value) {
        setTpegOtherPointDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegOtherPointDescriptor withTpegPointDescriptorExtension(ExtensionType value) {
        setTpegPointDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegOtherPointDescriptor withDescriptor(MultilingualString value) {
        setDescriptor(value);
        return this;
    }

    @Override
    public TpegOtherPointDescriptor withTpegDescriptorExtension(ExtensionType value) {
        setTpegDescriptorExtension(value);
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
