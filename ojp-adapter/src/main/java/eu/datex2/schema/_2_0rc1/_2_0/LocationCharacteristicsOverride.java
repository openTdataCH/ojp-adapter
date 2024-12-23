//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für LocationCharacteristicsOverride complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LocationCharacteristicsOverride"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementLanesOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" minOccurs="0"/&gt;
 *         &lt;element name="reversedFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="locationCharacteristicsOverrideExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCharacteristicsOverride", propOrder = {
    "measurementLanesOverride",
    "reversedFlow",
    "locationCharacteristicsOverrideExtension"
})
public class LocationCharacteristicsOverride {

    @XmlSchemaType(name = "string")
    protected LaneEnum measurementLanesOverride;
    protected Boolean reversedFlow;
    protected ExtensionType locationCharacteristicsOverrideExtension;

    /**
     * Ruft den Wert der measurementLanesOverride-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getMeasurementLanesOverride() {
        return measurementLanesOverride;
    }

    /**
     * Legt den Wert der measurementLanesOverride-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setMeasurementLanesOverride(LaneEnum value) {
        this.measurementLanesOverride = value;
    }

    /**
     * Ruft den Wert der reversedFlow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversedFlow() {
        return reversedFlow;
    }

    /**
     * Legt den Wert der reversedFlow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversedFlow(Boolean value) {
        this.reversedFlow = value;
    }

    /**
     * Ruft den Wert der locationCharacteristicsOverrideExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationCharacteristicsOverrideExtension() {
        return locationCharacteristicsOverrideExtension;
    }

    /**
     * Legt den Wert der locationCharacteristicsOverrideExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationCharacteristicsOverrideExtension(ExtensionType value) {
        this.locationCharacteristicsOverrideExtension = value;
    }

    public LocationCharacteristicsOverride withMeasurementLanesOverride(LaneEnum value) {
        setMeasurementLanesOverride(value);
        return this;
    }

    public LocationCharacteristicsOverride withReversedFlow(Boolean value) {
        setReversedFlow(value);
        return this;
    }

    public LocationCharacteristicsOverride withLocationCharacteristicsOverrideExtension(ExtensionType value) {
        setLocationCharacteristicsOverrideExtension(value);
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
