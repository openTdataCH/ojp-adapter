//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für RoadSurfaceConditionInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadSurfaceConditionMeasurements" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadSurfaceConditionMeasurements"/&gt;
 *         &lt;element name="roadSurfaceConditionInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditionInformation", propOrder = {
    "roadSurfaceConditionMeasurements",
    "roadSurfaceConditionInformationExtension"
})
public class RoadSurfaceConditionInformation
    extends WeatherValue
{

    @XmlElement(required = true)
    protected RoadSurfaceConditionMeasurements roadSurfaceConditionMeasurements;
    protected ExtensionType roadSurfaceConditionInformationExtension;

    /**
     * Ruft den Wert der roadSurfaceConditionMeasurements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public RoadSurfaceConditionMeasurements getRoadSurfaceConditionMeasurements() {
        return roadSurfaceConditionMeasurements;
    }

    /**
     * Legt den Wert der roadSurfaceConditionMeasurements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public void setRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        this.roadSurfaceConditionMeasurements = value;
    }

    /**
     * Ruft den Wert der roadSurfaceConditionInformationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadSurfaceConditionInformationExtension() {
        return roadSurfaceConditionInformationExtension;
    }

    /**
     * Legt den Wert der roadSurfaceConditionInformationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionInformationExtension(ExtensionType value) {
        this.roadSurfaceConditionInformationExtension = value;
    }

    public RoadSurfaceConditionInformation withRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        setRoadSurfaceConditionMeasurements(value);
        return this;
    }

    public RoadSurfaceConditionInformation withRoadSurfaceConditionInformationExtension(ExtensionType value) {
        setRoadSurfaceConditionInformationExtension(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public RoadSurfaceConditionInformation withBasicDataValueExtension(ExtensionType value) {
        setBasicDataValueExtension(value);
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
