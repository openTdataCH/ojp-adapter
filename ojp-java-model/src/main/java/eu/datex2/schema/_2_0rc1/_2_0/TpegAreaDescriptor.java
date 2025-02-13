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
 * <p>Java-Klasse für TpegAreaDescriptor complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TpegAreaDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegAreaDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03AreaDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegAreaDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaDescriptor", propOrder = {
    "tpegAreaDescriptorType",
    "tpegAreaDescriptorExtension"
})
public class TpegAreaDescriptor
    extends TpegDescriptor {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03AreaDescriptorSubtypeEnum tpegAreaDescriptorType;
    protected ExtensionType tpegAreaDescriptorExtension;

    /**
     * Ruft den Wert der tpegAreaDescriptorType-Eigenschaft ab.
     *
     * @return possible object is {@link TpegLoc03AreaDescriptorSubtypeEnum }
     */
    public TpegLoc03AreaDescriptorSubtypeEnum getTpegAreaDescriptorType() {
        return tpegAreaDescriptorType;
    }

    /**
     * Legt den Wert der tpegAreaDescriptorType-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegLoc03AreaDescriptorSubtypeEnum }
     */
    public void setTpegAreaDescriptorType(TpegLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegAreaDescriptorType = value;
    }

    /**
     * Ruft den Wert der tpegAreaDescriptorExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTpegAreaDescriptorExtension() {
        return tpegAreaDescriptorExtension;
    }

    /**
     * Legt den Wert der tpegAreaDescriptorExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTpegAreaDescriptorExtension(ExtensionType value) {
        this.tpegAreaDescriptorExtension = value;
    }

    public TpegAreaDescriptor withTpegAreaDescriptorType(TpegLoc03AreaDescriptorSubtypeEnum value) {
        setTpegAreaDescriptorType(value);
        return this;
    }

    public TpegAreaDescriptor withTpegAreaDescriptorExtension(ExtensionType value) {
        setTpegAreaDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegAreaDescriptor withDescriptor(MultilingualString value) {
        setDescriptor(value);
        return this;
    }

    @Override
    public TpegAreaDescriptor withTpegDescriptorExtension(ExtensionType value) {
        setTpegDescriptorExtension(value);
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
