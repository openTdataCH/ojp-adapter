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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für TrafficHeadway complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrafficHeadway"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageDistanceHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="averageTimeHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="trafficHeadwayExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficHeadway", propOrder = {
    "averageDistanceHeadway",
    "averageTimeHeadway",
    "trafficHeadwayExtension"
})
public class TrafficHeadway
    extends TrafficValue
{

    protected Float averageDistanceHeadway;
    protected Float averageTimeHeadway;
    protected ExtensionType trafficHeadwayExtension;

    /**
     * Ruft den Wert der averageDistanceHeadway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageDistanceHeadway() {
        return averageDistanceHeadway;
    }

    /**
     * Legt den Wert der averageDistanceHeadway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageDistanceHeadway(Float value) {
        this.averageDistanceHeadway = value;
    }

    /**
     * Ruft den Wert der averageTimeHeadway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageTimeHeadway() {
        return averageTimeHeadway;
    }

    /**
     * Legt den Wert der averageTimeHeadway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageTimeHeadway(Float value) {
        this.averageTimeHeadway = value;
    }

    /**
     * Ruft den Wert der trafficHeadwayExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficHeadwayExtension() {
        return trafficHeadwayExtension;
    }

    /**
     * Legt den Wert der trafficHeadwayExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficHeadwayExtension(ExtensionType value) {
        this.trafficHeadwayExtension = value;
    }

    public TrafficHeadway withAverageDistanceHeadway(Float value) {
        setAverageDistanceHeadway(value);
        return this;
    }

    public TrafficHeadway withAverageTimeHeadway(Float value) {
        setAverageTimeHeadway(value);
        return this;
    }

    public TrafficHeadway withTrafficHeadwayExtension(ExtensionType value) {
        setTrafficHeadwayExtension(value);
        return this;
    }

    @Override
    public TrafficHeadway withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public TrafficHeadway withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public TrafficHeadway withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TrafficHeadway withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TrafficHeadway withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TrafficHeadway withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TrafficHeadway withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TrafficHeadway withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TrafficHeadway withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TrafficHeadway withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TrafficHeadway withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TrafficHeadway withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TrafficHeadway withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficHeadway withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TrafficHeadway withBasicDataValueExtension(ExtensionType value) {
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
