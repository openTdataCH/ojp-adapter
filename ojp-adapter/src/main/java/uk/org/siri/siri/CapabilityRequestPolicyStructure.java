//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Common Request Policy capabilities.
 * 
 * <p>Java-Klasse für CapabilityRequestPolicyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CapabilityRequestPolicyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NationalLanguage" type="{http://www.w3.org/2001/XMLSchema}language" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Translations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="GmlCoordinateFormat" type="{http://www.siri.org.uk/siri}SrsNameType"/&gt;
 *           &lt;element name="WgsDecimalDegrees" type="{http://www.siri.org.uk/siri}EmptyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityRequestPolicyStructure", propOrder = {
    "nationalLanguage",
    "translations",
    "gmlCoordinateFormat",
    "wgsDecimalDegrees"
})
public class CapabilityRequestPolicyStructure {

    @XmlElement(name = "NationalLanguage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> nationalLanguage;
    @XmlElement(name = "Translations")
    protected Boolean translations;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;

    /**
     * Gets the value of the nationalLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nationalLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNationalLanguage() {
        if (nationalLanguage == null) {
            nationalLanguage = new ArrayList<String>();
        }
        return this.nationalLanguage;
    }

    /**
     * Ruft den Wert der translations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranslations() {
        return translations;
    }

    /**
     * Legt den Wert der translations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranslations(Boolean value) {
        this.translations = value;
    }

    /**
     * Ruft den Wert der gmlCoordinateFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Legt den Wert der gmlCoordinateFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    /**
     * Ruft den Wert der wgsDecimalDegrees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Legt den Wert der wgsDecimalDegrees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

    public CapabilityRequestPolicyStructure withNationalLanguage(String... values) {
        if (values!= null) {
            for (String value: values) {
                getNationalLanguage().add(value);
            }
        }
        return this;
    }

    public CapabilityRequestPolicyStructure withNationalLanguage(Collection<String> values) {
        if (values!= null) {
            getNationalLanguage().addAll(values);
        }
        return this;
    }

    public CapabilityRequestPolicyStructure withTranslations(Boolean value) {
        setTranslations(value);
        return this;
    }

    public CapabilityRequestPolicyStructure withGmlCoordinateFormat(String value) {
        setGmlCoordinateFormat(value);
        return this;
    }

    public CapabilityRequestPolicyStructure withWgsDecimalDegrees(String value) {
        setWgsDecimalDegrees(value);
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
