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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für TrafficFlow complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrafficFlow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axleFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}AxlesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="pcuFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}PassengerCarUnitsPerHour" minOccurs="0"/&gt;
 *         &lt;element name="percentageLongVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="vehicleFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="trafficFlowExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficFlow", propOrder = {
    "axleFlow",
    "pcuFlow",
    "percentageLongVehicles",
    "vehicleFlow",
    "trafficFlowExtension"
})
public class TrafficFlow
    extends TrafficValue
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger axleFlow;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pcuFlow;
    protected Float percentageLongVehicles;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger vehicleFlow;
    protected ExtensionType trafficFlowExtension;

    /**
     * Ruft den Wert der axleFlow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleFlow() {
        return axleFlow;
    }

    /**
     * Legt den Wert der axleFlow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleFlow(BigInteger value) {
        this.axleFlow = value;
    }

    /**
     * Ruft den Wert der pcuFlow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPcuFlow() {
        return pcuFlow;
    }

    /**
     * Legt den Wert der pcuFlow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPcuFlow(BigInteger value) {
        this.pcuFlow = value;
    }

    /**
     * Ruft den Wert der percentageLongVehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercentageLongVehicles() {
        return percentageLongVehicles;
    }

    /**
     * Legt den Wert der percentageLongVehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercentageLongVehicles(Float value) {
        this.percentageLongVehicles = value;
    }

    /**
     * Ruft den Wert der vehicleFlow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleFlow() {
        return vehicleFlow;
    }

    /**
     * Legt den Wert der vehicleFlow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleFlow(BigInteger value) {
        this.vehicleFlow = value;
    }

    /**
     * Ruft den Wert der trafficFlowExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficFlowExtension() {
        return trafficFlowExtension;
    }

    /**
     * Legt den Wert der trafficFlowExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficFlowExtension(ExtensionType value) {
        this.trafficFlowExtension = value;
    }

    public TrafficFlow withAxleFlow(BigInteger value) {
        setAxleFlow(value);
        return this;
    }

    public TrafficFlow withPcuFlow(BigInteger value) {
        setPcuFlow(value);
        return this;
    }

    public TrafficFlow withPercentageLongVehicles(Float value) {
        setPercentageLongVehicles(value);
        return this;
    }

    public TrafficFlow withVehicleFlow(BigInteger value) {
        setVehicleFlow(value);
        return this;
    }

    public TrafficFlow withTrafficFlowExtension(ExtensionType value) {
        setTrafficFlowExtension(value);
        return this;
    }

    @Override
    public TrafficFlow withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public TrafficFlow withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public TrafficFlow withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TrafficFlow withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TrafficFlow withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TrafficFlow withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TrafficFlow withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TrafficFlow withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TrafficFlow withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TrafficFlow withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TrafficFlow withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TrafficFlow withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TrafficFlow withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficFlow withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TrafficFlow withBasicDataValueExtension(ExtensionType value) {
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
