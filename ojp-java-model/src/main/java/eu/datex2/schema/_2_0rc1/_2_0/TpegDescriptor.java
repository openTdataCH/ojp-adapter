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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für TpegDescriptor complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TpegDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descriptor" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString"/&gt;
 *         &lt;element name="tpegDescriptorExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegDescriptor", propOrder = {
    "descriptor",
    "tpegDescriptorExtension"
})
@XmlSeeAlso({
    TpegAreaDescriptor.class,
    TpegPointDescriptor.class
})
public abstract class TpegDescriptor {

    @XmlElement(required = true)
    protected MultilingualString descriptor;
    protected ExtensionType tpegDescriptorExtension;

    /**
     * Ruft den Wert der descriptor-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getDescriptor() {
        return descriptor;
    }

    /**
     * Legt den Wert der descriptor-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setDescriptor(MultilingualString value) {
        this.descriptor = value;
    }

    /**
     * Ruft den Wert der tpegDescriptorExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTpegDescriptorExtension() {
        return tpegDescriptorExtension;
    }

    /**
     * Legt den Wert der tpegDescriptorExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTpegDescriptorExtension(ExtensionType value) {
        this.tpegDescriptorExtension = value;
    }

    public TpegDescriptor withDescriptor(MultilingualString value) {
        setDescriptor(value);
        return this;
    }

    public TpegDescriptor withTpegDescriptorExtension(ExtensionType value) {
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
