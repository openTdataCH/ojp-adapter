//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für RoadSurfaceConditionMeasurements complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deIcingApplicationRate" type="{http://datex2.eu/schema/2_0RC1/2_0}IntensityKilogrammesPerSquareMetre" minOccurs="0"/&gt;
 *         &lt;element name="deIcingConcentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationGramsPerCubicCentimetre" minOccurs="0"/&gt;
 *         &lt;element name="depthOfSnow" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="protectionTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="roadSurfaceTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="waterFilmThickness" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="roadSurfaceConditionMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditionMeasurements", propOrder = {
    "deIcingApplicationRate",
    "deIcingConcentration",
    "depthOfSnow",
    "protectionTemperature",
    "roadSurfaceTemperature",
    "waterFilmThickness",
    "roadSurfaceConditionMeasurementsExtension"
})
public class RoadSurfaceConditionMeasurements {

    protected Float deIcingApplicationRate;
    protected Float deIcingConcentration;
    protected Float depthOfSnow;
    protected Float protectionTemperature;
    protected Float roadSurfaceTemperature;
    protected Float waterFilmThickness;
    protected ExtensionType roadSurfaceConditionMeasurementsExtension;

    /**
     * Ruft den Wert der deIcingApplicationRate-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getDeIcingApplicationRate() {
        return deIcingApplicationRate;
    }

    /**
     * Legt den Wert der deIcingApplicationRate-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setDeIcingApplicationRate(Float value) {
        this.deIcingApplicationRate = value;
    }

    /**
     * Ruft den Wert der deIcingConcentration-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getDeIcingConcentration() {
        return deIcingConcentration;
    }

    /**
     * Legt den Wert der deIcingConcentration-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setDeIcingConcentration(Float value) {
        this.deIcingConcentration = value;
    }

    /**
     * Ruft den Wert der depthOfSnow-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getDepthOfSnow() {
        return depthOfSnow;
    }

    /**
     * Legt den Wert der depthOfSnow-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setDepthOfSnow(Float value) {
        this.depthOfSnow = value;
    }

    /**
     * Ruft den Wert der protectionTemperature-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getProtectionTemperature() {
        return protectionTemperature;
    }

    /**
     * Legt den Wert der protectionTemperature-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setProtectionTemperature(Float value) {
        this.protectionTemperature = value;
    }

    /**
     * Ruft den Wert der roadSurfaceTemperature-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getRoadSurfaceTemperature() {
        return roadSurfaceTemperature;
    }

    /**
     * Legt den Wert der roadSurfaceTemperature-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setRoadSurfaceTemperature(Float value) {
        this.roadSurfaceTemperature = value;
    }

    /**
     * Ruft den Wert der waterFilmThickness-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getWaterFilmThickness() {
        return waterFilmThickness;
    }

    /**
     * Legt den Wert der waterFilmThickness-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setWaterFilmThickness(Float value) {
        this.waterFilmThickness = value;
    }

    /**
     * Ruft den Wert der roadSurfaceConditionMeasurementsExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getRoadSurfaceConditionMeasurementsExtension() {
        return roadSurfaceConditionMeasurementsExtension;
    }

    /**
     * Legt den Wert der roadSurfaceConditionMeasurementsExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setRoadSurfaceConditionMeasurementsExtension(ExtensionType value) {
        this.roadSurfaceConditionMeasurementsExtension = value;
    }

    public RoadSurfaceConditionMeasurements withDeIcingApplicationRate(Float value) {
        setDeIcingApplicationRate(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withDeIcingConcentration(Float value) {
        setDeIcingConcentration(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withDepthOfSnow(Float value) {
        setDepthOfSnow(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withProtectionTemperature(Float value) {
        setProtectionTemperature(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withRoadSurfaceTemperature(Float value) {
        setRoadSurfaceTemperature(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withWaterFilmThickness(Float value) {
        setWaterFilmThickness(value);
        return this;
    }

    public RoadSurfaceConditionMeasurements withRoadSurfaceConditionMeasurementsExtension(ExtensionType value) {
        setRoadSurfaceConditionMeasurementsExtension(value);
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
