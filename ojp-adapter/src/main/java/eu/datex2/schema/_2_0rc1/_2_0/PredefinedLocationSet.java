//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für PredefinedLocationSet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationSetName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="predefinedLocationSetVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="predefinedLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}PredefinedLocation" maxOccurs="unbounded"/&gt;
 *         &lt;element name="predefinedLocationSetExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationSet", propOrder = {
    "predefinedLocationSetName",
    "predefinedLocationSetVersion",
    "predefinedLocation",
    "predefinedLocationSetExtension"
})
public class PredefinedLocationSet {

    protected MultilingualString predefinedLocationSetName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger predefinedLocationSetVersion;
    @XmlElement(required = true)
    protected List<PredefinedLocation> predefinedLocation;
    protected ExtensionType predefinedLocationSetExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der predefinedLocationSetName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPredefinedLocationSetName() {
        return predefinedLocationSetName;
    }

    /**
     * Legt den Wert der predefinedLocationSetName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPredefinedLocationSetName(MultilingualString value) {
        this.predefinedLocationSetName = value;
    }

    /**
     * Ruft den Wert der predefinedLocationSetVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPredefinedLocationSetVersion() {
        return predefinedLocationSetVersion;
    }

    /**
     * Legt den Wert der predefinedLocationSetVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPredefinedLocationSetVersion(BigInteger value) {
        this.predefinedLocationSetVersion = value;
    }

    /**
     * Gets the value of the predefinedLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocation }
     * 
     * 
     */
    public List<PredefinedLocation> getPredefinedLocation() {
        if (predefinedLocation == null) {
            predefinedLocation = new ArrayList<PredefinedLocation>();
        }
        return this.predefinedLocation;
    }

    /**
     * Ruft den Wert der predefinedLocationSetExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationSetExtension() {
        return predefinedLocationSetExtension;
    }

    /**
     * Legt den Wert der predefinedLocationSetExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationSetExtension(ExtensionType value) {
        this.predefinedLocationSetExtension = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public PredefinedLocationSet withPredefinedLocationSetName(MultilingualString value) {
        setPredefinedLocationSetName(value);
        return this;
    }

    public PredefinedLocationSet withPredefinedLocationSetVersion(BigInteger value) {
        setPredefinedLocationSetVersion(value);
        return this;
    }

    public PredefinedLocationSet withPredefinedLocation(PredefinedLocation... values) {
        if (values!= null) {
            for (PredefinedLocation value: values) {
                getPredefinedLocation().add(value);
            }
        }
        return this;
    }

    public PredefinedLocationSet withPredefinedLocation(Collection<PredefinedLocation> values) {
        if (values!= null) {
            getPredefinedLocation().addAll(values);
        }
        return this;
    }

    public PredefinedLocationSet withPredefinedLocationSetExtension(ExtensionType value) {
        setPredefinedLocationSetExtension(value);
        return this;
    }

    public PredefinedLocationSet withId(String value) {
        setId(value);
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
