//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für SiteMeasurements complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="measurementTimeDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="measuredValue" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredValue"&gt;
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="siteMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteMeasurements", propOrder = {
    "measurementSiteReference",
    "measurementTimeDefault",
    "measuredValue",
    "siteMeasurementsExtension"
})
public class SiteMeasurements {

    @XmlElement(required = true)
    protected String measurementSiteReference;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime measurementTimeDefault;
    @XmlElement(required = true)
    protected List<SiteMeasurements.MeasuredValue> measuredValue;
    protected ExtensionType siteMeasurementsExtension;

    /**
     * Ruft den Wert der measurementSiteReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteReference() {
        return measurementSiteReference;
    }

    /**
     * Legt den Wert der measurementSiteReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteReference(String value) {
        this.measurementSiteReference = value;
    }

    /**
     * Ruft den Wert der measurementTimeDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getMeasurementTimeDefault() {
        return measurementTimeDefault;
    }

    /**
     * Legt den Wert der measurementTimeDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementTimeDefault(ZonedDateTime value) {
        this.measurementTimeDefault = value;
    }

    /**
     * Gets the value of the measuredValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measuredValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteMeasurements.MeasuredValue }
     * 
     * 
     */
    public List<SiteMeasurements.MeasuredValue> getMeasuredValue() {
        if (measuredValue == null) {
            measuredValue = new ArrayList<SiteMeasurements.MeasuredValue>();
        }
        return this.measuredValue;
    }

    /**
     * Ruft den Wert der siteMeasurementsExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSiteMeasurementsExtension() {
        return siteMeasurementsExtension;
    }

    /**
     * Legt den Wert der siteMeasurementsExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSiteMeasurementsExtension(ExtensionType value) {
        this.siteMeasurementsExtension = value;
    }

    public SiteMeasurements withMeasurementSiteReference(String value) {
        setMeasurementSiteReference(value);
        return this;
    }

    public SiteMeasurements withMeasurementTimeDefault(ZonedDateTime value) {
        setMeasurementTimeDefault(value);
        return this;
    }

    public SiteMeasurements withMeasuredValue(SiteMeasurements.MeasuredValue... values) {
        if (values!= null) {
            for (SiteMeasurements.MeasuredValue value: values) {
                getMeasuredValue().add(value);
            }
        }
        return this;
    }

    public SiteMeasurements withMeasuredValue(Collection<SiteMeasurements.MeasuredValue> values) {
        if (values!= null) {
            getMeasuredValue().addAll(values);
        }
        return this;
    }

    public SiteMeasurements withSiteMeasurementsExtension(ExtensionType value) {
        setSiteMeasurementsExtension(value);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredValue"&gt;
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasuredValue
        extends eu.datex2.schema._2_0rc1._2_0.MeasuredValue
    {

        @XmlAttribute(name = "index", required = true)
        protected int index;

        /**
         * Ruft den Wert der index-Eigenschaft ab.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Legt den Wert der index-Eigenschaft fest.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

        public SiteMeasurements.MeasuredValue withIndex(int value) {
            setIndex(value);
            return this;
        }

        @Override
        public SiteMeasurements.MeasuredValue withMeasurementEquipmentTypeUsed(MultilingualString value) {
            setMeasurementEquipmentTypeUsed(value);
            return this;
        }

        @Override
        public SiteMeasurements.MeasuredValue withLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
            setLocationCharacteristicsOverride(value);
            return this;
        }

        @Override
        public SiteMeasurements.MeasuredValue withBasicDataValue(BasicDataValue value) {
            setBasicDataValue(value);
            return this;
        }

        @Override
        public SiteMeasurements.MeasuredValue withMeasuredValueExtension(ExtensionType value) {
            setMeasuredValueExtension(value);
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

}
