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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für MeasurementSpecificCharacteristics complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MeasurementSpecificCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/&gt;
 *         &lt;element name="specificLane" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" minOccurs="0"/&gt;
 *         &lt;element name="specificMeasurementValueType" type="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredOrDerivedDataTypeEnum"/&gt;
 *         &lt;element name="specificVehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="measurementSpecificCharacteristicsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSpecificCharacteristics", propOrder = {
    "accuracy",
    "period",
    "smoothingFactor",
    "specificLane",
    "specificMeasurementValueType",
    "specificVehicleCharacteristics",
    "measurementSpecificCharacteristicsExtension"
})
@XmlSeeAlso({
    eu.datex2.schema._2_0rc1._2_0.MeasurementSiteRecord.MeasurementSpecificCharacteristics.class
})
public class MeasurementSpecificCharacteristics {

    protected Float accuracy;
    protected Float period;
    protected Float smoothingFactor;
    @XmlSchemaType(name = "string")
    protected LaneEnum specificLane;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MeasuredOrDerivedDataTypeEnum specificMeasurementValueType;
    protected VehicleCharacteristics specificVehicleCharacteristics;
    protected ExtensionType measurementSpecificCharacteristicsExtension;

    /**
     * Ruft den Wert der accuracy-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Legt den Wert der accuracy-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

    /**
     * Ruft den Wert der smoothingFactor-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Legt den Wert der smoothingFactor-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    /**
     * Ruft den Wert der specificLane-Eigenschaft ab.
     *
     * @return possible object is {@link LaneEnum }
     */
    public LaneEnum getSpecificLane() {
        return specificLane;
    }

    /**
     * Legt den Wert der specificLane-Eigenschaft fest.
     *
     * @param value allowed object is {@link LaneEnum }
     */
    public void setSpecificLane(LaneEnum value) {
        this.specificLane = value;
    }

    /**
     * Ruft den Wert der specificMeasurementValueType-Eigenschaft ab.
     *
     * @return possible object is {@link MeasuredOrDerivedDataTypeEnum }
     */
    public MeasuredOrDerivedDataTypeEnum getSpecificMeasurementValueType() {
        return specificMeasurementValueType;
    }

    /**
     * Legt den Wert der specificMeasurementValueType-Eigenschaft fest.
     *
     * @param value allowed object is {@link MeasuredOrDerivedDataTypeEnum }
     */
    public void setSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
        this.specificMeasurementValueType = value;
    }

    /**
     * Ruft den Wert der specificVehicleCharacteristics-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleCharacteristics }
     */
    public VehicleCharacteristics getSpecificVehicleCharacteristics() {
        return specificVehicleCharacteristics;
    }

    /**
     * Legt den Wert der specificVehicleCharacteristics-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleCharacteristics }
     */
    public void setSpecificVehicleCharacteristics(VehicleCharacteristics value) {
        this.specificVehicleCharacteristics = value;
    }

    /**
     * Ruft den Wert der measurementSpecificCharacteristicsExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getMeasurementSpecificCharacteristicsExtension() {
        return measurementSpecificCharacteristicsExtension;
    }

    /**
     * Legt den Wert der measurementSpecificCharacteristicsExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
        this.measurementSpecificCharacteristicsExtension = value;
    }

    public MeasurementSpecificCharacteristics withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withSpecificLane(LaneEnum value) {
        setSpecificLane(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
        setSpecificMeasurementValueType(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withSpecificVehicleCharacteristics(VehicleCharacteristics value) {
        setSpecificVehicleCharacteristics(value);
        return this;
    }

    public MeasurementSpecificCharacteristics withMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
        setMeasurementSpecificCharacteristicsExtension(value);
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
