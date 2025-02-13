//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AllFacilitiesFeatureStructure;

/**
 * Structured attribute classification with associated text. If URL is given, it refers to the whole attribute text.
 *
 * <p>Java-Klasse für GeneralAttributeStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeneralAttributeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserText" type="{http://www.vdv.de/ojp}InternationalTextStructure"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Facility" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Importance" type="{http://www.vdv.de/ojp}PercentType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}WebLinkGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralAttributeStructure", propOrder = {
    "userText",
    "code",
    "key",
    "value",
    "facility",
    "mandatory",
    "importance",
    "url",
    "mimeType",
    "embeddable"
})
@XmlSeeAlso({
    LegAttributeStructure.class
})
public class GeneralAttributeStructure {

    @XmlElement(name = "UserText", required = true)
    protected InternationalTextStructure userText;
    @XmlElement(name = "Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String code;
    @XmlElement(name = "Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String key;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Facility")
    protected List<AllFacilitiesFeatureStructure> facility;
    @XmlElement(name = "Mandatory", defaultValue = "false")
    protected Boolean mandatory;
    @XmlElement(name = "Importance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer importance;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "MimeType", defaultValue = "text/html")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mimeType;
    @XmlElement(name = "Embeddable", defaultValue = "false")
    protected Boolean embeddable;

    /**
     * Ruft den Wert der userText-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getUserText() {
        return userText;
    }

    /**
     * Legt den Wert der userText-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setUserText(InternationalTextStructure value) {
        this.userText = value;
    }

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Ruft den Wert der key-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the facility property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the facility property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacility().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AllFacilitiesFeatureStructure }
     */
    public List<AllFacilitiesFeatureStructure> getFacility() {
        if (facility == null) {
            facility = new ArrayList<AllFacilitiesFeatureStructure>();
        }
        return this.facility;
    }

    /**
     * Ruft den Wert der mandatory-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isMandatory() {
        return mandatory;
    }

    /**
     * Legt den Wert der mandatory-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setMandatory(Boolean value) {
        this.mandatory = value;
    }

    /**
     * Ruft den Wert der importance-Eigenschaft ab.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getImportance() {
        return importance;
    }

    /**
     * Legt den Wert der importance-Eigenschaft fest.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setImportance(Integer value) {
        this.importance = value;
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
     * Ruft den Wert der mimeType-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Legt den Wert der mimeType-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Ruft den Wert der embeddable-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isEmbeddable() {
        return embeddable;
    }

    /**
     * Legt den Wert der embeddable-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setEmbeddable(Boolean value) {
        this.embeddable = value;
    }

    public GeneralAttributeStructure withUserText(InternationalTextStructure value) {
        setUserText(value);
        return this;
    }

    public GeneralAttributeStructure withCode(String value) {
        setCode(value);
        return this;
    }

    public GeneralAttributeStructure withKey(String value) {
        setKey(value);
        return this;
    }

    public GeneralAttributeStructure withValue(String value) {
        setValue(value);
        return this;
    }

    public GeneralAttributeStructure withFacility(AllFacilitiesFeatureStructure... values) {
        if (values != null) {
            for (AllFacilitiesFeatureStructure value : values) {
                getFacility().add(value);
            }
        }
        return this;
    }

    public GeneralAttributeStructure withFacility(Collection<AllFacilitiesFeatureStructure> values) {
        if (values != null) {
            getFacility().addAll(values);
        }
        return this;
    }

    public GeneralAttributeStructure withMandatory(Boolean value) {
        setMandatory(value);
        return this;
    }

    public GeneralAttributeStructure withImportance(Integer value) {
        setImportance(value);
        return this;
    }

    public GeneralAttributeStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    public GeneralAttributeStructure withMimeType(String value) {
        setMimeType(value);
        return this;
    }

    public GeneralAttributeStructure withEmbeddable(Boolean value) {
        setEmbeddable(value);
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
