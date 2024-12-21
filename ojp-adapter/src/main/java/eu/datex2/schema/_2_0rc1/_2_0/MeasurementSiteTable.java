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
 * <p>Java-Klasse für MeasurementSiteTable complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteTableIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteTableVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteRecord" type="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSiteRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element name="measurementSiteTableExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementSiteTable", propOrder = {
    "measurementSiteTableIdentification",
    "measurementSiteTableVersion",
    "measurementSiteRecord",
    "measurementSiteTableExtension"
})
public class MeasurementSiteTable {

    protected String measurementSiteTableIdentification;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measurementSiteTableVersion;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord> measurementSiteRecord;
    protected ExtensionType measurementSiteTableExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der measurementSiteTableIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteTableIdentification() {
        return measurementSiteTableIdentification;
    }

    /**
     * Legt den Wert der measurementSiteTableIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteTableIdentification(String value) {
        this.measurementSiteTableIdentification = value;
    }

    /**
     * Ruft den Wert der measurementSiteTableVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteTableVersion() {
        return measurementSiteTableVersion;
    }

    /**
     * Legt den Wert der measurementSiteTableVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteTableVersion(BigInteger value) {
        this.measurementSiteTableVersion = value;
    }

    /**
     * Gets the value of the measurementSiteRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSiteRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSiteRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord }
     * 
     * 
     */
    public List<MeasurementSiteRecord> getMeasurementSiteRecord() {
        if (measurementSiteRecord == null) {
            measurementSiteRecord = new ArrayList<MeasurementSiteRecord>();
        }
        return this.measurementSiteRecord;
    }

    /**
     * Ruft den Wert der measurementSiteTableExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteTableExtension() {
        return measurementSiteTableExtension;
    }

    /**
     * Legt den Wert der measurementSiteTableExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteTableExtension(ExtensionType value) {
        this.measurementSiteTableExtension = value;
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

    public MeasurementSiteTable withMeasurementSiteTableIdentification(String value) {
        setMeasurementSiteTableIdentification(value);
        return this;
    }

    public MeasurementSiteTable withMeasurementSiteTableVersion(BigInteger value) {
        setMeasurementSiteTableVersion(value);
        return this;
    }

    public MeasurementSiteTable withMeasurementSiteRecord(MeasurementSiteRecord... values) {
        if (values!= null) {
            for (MeasurementSiteRecord value: values) {
                getMeasurementSiteRecord().add(value);
            }
        }
        return this;
    }

    public MeasurementSiteTable withMeasurementSiteRecord(Collection<MeasurementSiteRecord> values) {
        if (values!= null) {
            getMeasurementSiteRecord().addAll(values);
        }
        return this;
    }

    public MeasurementSiteTable withMeasurementSiteTableExtension(ExtensionType value) {
        setMeasurementSiteTableExtension(value);
        return this;
    }

    public MeasurementSiteTable withId(String value) {
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
