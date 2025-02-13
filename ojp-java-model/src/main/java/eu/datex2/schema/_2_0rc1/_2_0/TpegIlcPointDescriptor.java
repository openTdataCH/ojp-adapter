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
 * <p>Java-Klasse für TpegIlcPointDescriptor complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TpegIlcPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegIlcPointDescriptorType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc03IlcPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegIlcPointDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegIlcPointDescriptor", propOrder = {
    "tpegIlcPointDescriptorType",
    "tpegIlcPointDescriptorExtension"
})
public class TpegIlcPointDescriptor
    extends TpegPointDescriptor {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03IlcPointDescriptorSubtypeEnum tpegIlcPointDescriptorType;
    protected ExtensionType tpegIlcPointDescriptorExtension;

    /**
     * Ruft den Wert der tpegIlcPointDescriptorType-Eigenschaft ab.
     *
     * @return possible object is {@link TpegLoc03IlcPointDescriptorSubtypeEnum }
     */
    public TpegLoc03IlcPointDescriptorSubtypeEnum getTpegIlcPointDescriptorType() {
        return tpegIlcPointDescriptorType;
    }

    /**
     * Legt den Wert der tpegIlcPointDescriptorType-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegLoc03IlcPointDescriptorSubtypeEnum }
     */
    public void setTpegIlcPointDescriptorType(TpegLoc03IlcPointDescriptorSubtypeEnum value) {
        this.tpegIlcPointDescriptorType = value;
    }

    /**
     * Ruft den Wert der tpegIlcPointDescriptorExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTpegIlcPointDescriptorExtension() {
        return tpegIlcPointDescriptorExtension;
    }

    /**
     * Legt den Wert der tpegIlcPointDescriptorExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTpegIlcPointDescriptorExtension(ExtensionType value) {
        this.tpegIlcPointDescriptorExtension = value;
    }

    public TpegIlcPointDescriptor withTpegIlcPointDescriptorType(TpegLoc03IlcPointDescriptorSubtypeEnum value) {
        setTpegIlcPointDescriptorType(value);
        return this;
    }

    public TpegIlcPointDescriptor withTpegIlcPointDescriptorExtension(ExtensionType value) {
        setTpegIlcPointDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegIlcPointDescriptor withTpegPointDescriptorExtension(ExtensionType value) {
        setTpegPointDescriptorExtension(value);
        return this;
    }

    @Override
    public TpegIlcPointDescriptor withDescriptor(MultilingualString value) {
        setDescriptor(value);
        return this;
    }

    @Override
    public TpegIlcPointDescriptor withTpegDescriptorExtension(ExtensionType value) {
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
