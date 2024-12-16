//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for image.
 * 
 * <p>Java-Klasse für ImageStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ImageRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *           &lt;element name="ImageBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ImageContent" type="{http://www.siri.org.uk/siri}ImageContentEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageStructure", propOrder = {
    "imageRef",
    "imageBinary",
    "imageContent"
})
@XmlSeeAlso({
    uk.org.siri.siri.RoadSituationElementStructure.Images.Image.class
})
public class ImageStructure {

    @XmlElement(name = "ImageRef")
    @XmlSchemaType(name = "anyURI")
    protected String imageRef;
    @XmlElement(name = "ImageBinary")
    protected byte[] imageBinary;
    @XmlElement(name = "ImageContent")
    @XmlSchemaType(name = "NMTOKEN")
    protected ImageContentEnumeration imageContent;

    /**
     * Ruft den Wert der imageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * Legt den Wert der imageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRef(String value) {
        this.imageRef = value;
    }

    /**
     * Ruft den Wert der imageBinary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageBinary() {
        return imageBinary;
    }

    /**
     * Legt den Wert der imageBinary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageBinary(byte[] value) {
        this.imageBinary = value;
    }

    /**
     * Ruft den Wert der imageContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public ImageContentEnumeration getImageContent() {
        return imageContent;
    }

    /**
     * Legt den Wert der imageContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public void setImageContent(ImageContentEnumeration value) {
        this.imageContent = value;
    }

    public ImageStructure withImageRef(String value) {
        setImageRef(value);
        return this;
    }

    public ImageStructure withImageBinary(byte[] value) {
        setImageBinary(value);
        return this;
    }

    public ImageStructure withImageContent(ImageContentEnumeration value) {
        setImageContent(value);
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
