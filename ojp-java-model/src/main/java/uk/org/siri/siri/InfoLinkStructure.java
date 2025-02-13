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
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for a general hyperlink.
 *
 * <p>Java-Klasse für InfoLinkStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InfoLinkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="Label" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.siri.org.uk/siri}ImageStructure" minOccurs="0"/&gt;
 *         &lt;element name="LinkContent" type="{http://www.siri.org.uk/siri}LinkContentEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoLinkStructure", propOrder = {
    "uri",
    "label",
    "image",
    "linkContent"
})
public class InfoLinkStructure {

    @XmlElement(name = "Uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(name = "Label")
    protected List<NaturalLanguageStringStructure> label;
    @XmlElement(name = "Image")
    protected ImageStructure image;
    @XmlElement(name = "LinkContent")
    @XmlSchemaType(name = "NMTOKEN")
    protected LinkContentEnumeration linkContent;

    /**
     * Ruft den Wert der uri-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getUri() {
        return uri;
    }

    /**
     * Legt den Wert der uri-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the label property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the label property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getLabel() {
        if (label == null) {
            label = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.label;
    }

    /**
     * Ruft den Wert der image-Eigenschaft ab.
     *
     * @return possible object is {@link ImageStructure }
     */
    public ImageStructure getImage() {
        return image;
    }

    /**
     * Legt den Wert der image-Eigenschaft fest.
     *
     * @param value allowed object is {@link ImageStructure }
     */
    public void setImage(ImageStructure value) {
        this.image = value;
    }

    /**
     * Ruft den Wert der linkContent-Eigenschaft ab.
     *
     * @return possible object is {@link LinkContentEnumeration }
     */
    public LinkContentEnumeration getLinkContent() {
        return linkContent;
    }

    /**
     * Legt den Wert der linkContent-Eigenschaft fest.
     *
     * @param value allowed object is {@link LinkContentEnumeration }
     */
    public void setLinkContent(LinkContentEnumeration value) {
        this.linkContent = value;
    }

    public InfoLinkStructure withUri(String value) {
        setUri(value);
        return this;
    }

    public InfoLinkStructure withLabel(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getLabel().add(value);
            }
        }
        return this;
    }

    public InfoLinkStructure withLabel(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getLabel().addAll(values);
        }
        return this;
    }

    public InfoLinkStructure withImage(ImageStructure value) {
        setImage(value);
        return this;
    }

    public InfoLinkStructure withLinkContent(LinkContentEnumeration value) {
        setLinkContent(value);
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
