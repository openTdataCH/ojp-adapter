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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for a TYPE OF VALUE. Used to define open classifications of value types. (since SIRI 2.1)
 *
 * <p>Java-Klasse für TypeOfValueStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TypeOfValueStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeOfValueCode" type="{http://www.siri.org.uk/siri}TypeOfValueCodeType"/&gt;
 *         &lt;element name="NameOfClass" type="{http://www.siri.org.uk/siri}NameOfClassType"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TypeOfValueGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfValueStructure", propOrder = {
    "typeOfValueCode",
    "nameOfClass",
    "name",
    "shortName",
    "description",
    "image",
    "url",
    "privateCode"
})
public class TypeOfValueStructure {

    @XmlElement(name = "TypeOfValueCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String typeOfValueCode;
    @XmlElement(name = "NameOfClass", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String nameOfClass;
    @XmlElement(name = "Name")
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "ShortName")
    protected NaturalLanguageStringStructure shortName;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "Image")
    @XmlSchemaType(name = "anyURI")
    protected String image;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "PrivateCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String privateCode;

    /**
     * Ruft den Wert der typeOfValueCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getTypeOfValueCode() {
        return typeOfValueCode;
    }

    /**
     * Legt den Wert der typeOfValueCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTypeOfValueCode(String value) {
        this.typeOfValueCode = value;
    }

    /**
     * Ruft den Wert der nameOfClass-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getNameOfClass() {
        return nameOfClass;
    }

    /**
     * Legt den Wert der nameOfClass-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setNameOfClass(String value) {
        this.nameOfClass = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setShortName(NaturalLanguageStringStructure value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der image-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getImage() {
        return image;
    }

    /**
     * Legt den Wert der image-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der privateCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPrivateCode(String value) {
        this.privateCode = value;
    }

    public TypeOfValueStructure withTypeOfValueCode(String value) {
        setTypeOfValueCode(value);
        return this;
    }

    public TypeOfValueStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    public TypeOfValueStructure withName(NaturalLanguageStringStructure value) {
        setName(value);
        return this;
    }

    public TypeOfValueStructure withShortName(NaturalLanguageStringStructure value) {
        setShortName(value);
        return this;
    }

    public TypeOfValueStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    public TypeOfValueStructure withImage(String value) {
        setImage(value);
        return this;
    }

    public TypeOfValueStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    public TypeOfValueStructure withPrivateCode(String value) {
        setPrivateCode(value);
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
