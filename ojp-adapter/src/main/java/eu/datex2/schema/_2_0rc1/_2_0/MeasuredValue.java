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
 * <p>Java-Klasse für MeasuredValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeasuredValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="locationCharacteristicsOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}LocationCharacteristicsOverride" minOccurs="0"/&gt;
 *         &lt;element name="basicDataValue" type="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"/&gt;
 *         &lt;element name="measuredValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredValue", propOrder = {
    "measurementEquipmentTypeUsed",
    "locationCharacteristicsOverride",
    "basicDataValue",
    "measuredValueExtension"
})
@XmlSeeAlso({
    eu.datex2.schema._2_0rc1._2_0.SiteMeasurements.MeasuredValue.class
})
public class MeasuredValue {

    protected MultilingualString measurementEquipmentTypeUsed;
    protected LocationCharacteristicsOverride locationCharacteristicsOverride;
    @XmlElement(required = true)
    protected BasicDataValue basicDataValue;
    protected ExtensionType measuredValueExtension;

    /**
     * Ruft den Wert der measurementEquipmentTypeUsed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Legt den Wert der measurementEquipmentTypeUsed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MultilingualString value) {
        this.measurementEquipmentTypeUsed = value;
    }

    /**
     * Ruft den Wert der locationCharacteristicsOverride-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public LocationCharacteristicsOverride getLocationCharacteristicsOverride() {
        return locationCharacteristicsOverride;
    }

    /**
     * Legt den Wert der locationCharacteristicsOverride-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public void setLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
        this.locationCharacteristicsOverride = value;
    }

    /**
     * Ruft den Wert der basicDataValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue }
     *     
     */
    public BasicDataValue getBasicDataValue() {
        return basicDataValue;
    }

    /**
     * Legt den Wert der basicDataValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue }
     *     
     */
    public void setBasicDataValue(BasicDataValue value) {
        this.basicDataValue = value;
    }

    /**
     * Ruft den Wert der measuredValueExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasuredValueExtension() {
        return measuredValueExtension;
    }

    /**
     * Legt den Wert der measuredValueExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasuredValueExtension(ExtensionType value) {
        this.measuredValueExtension = value;
    }

    public MeasuredValue withMeasurementEquipmentTypeUsed(MultilingualString value) {
        setMeasurementEquipmentTypeUsed(value);
        return this;
    }

    public MeasuredValue withLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
        setLocationCharacteristicsOverride(value);
        return this;
    }

    public MeasuredValue withBasicDataValue(BasicDataValue value) {
        setBasicDataValue(value);
        return this;
    }

    public MeasuredValue withMeasuredValueExtension(ExtensionType value) {
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
