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
 * <p>Java-Klasse für TrafficConcentration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrafficConcentration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationVehiclesPerKilometre" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="trafficConcentrationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConcentration", propOrder = {
    "concentration",
    "occupancy",
    "trafficConcentrationExtension"
})
public class TrafficConcentration
    extends TrafficValue
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger concentration;
    protected Float occupancy;
    protected ExtensionType trafficConcentrationExtension;

    /**
     * Ruft den Wert der concentration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConcentration() {
        return concentration;
    }

    /**
     * Legt den Wert der concentration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConcentration(BigInteger value) {
        this.concentration = value;
    }

    /**
     * Ruft den Wert der occupancy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOccupancy() {
        return occupancy;
    }

    /**
     * Legt den Wert der occupancy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOccupancy(Float value) {
        this.occupancy = value;
    }

    /**
     * Ruft den Wert der trafficConcentrationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficConcentrationExtension() {
        return trafficConcentrationExtension;
    }

    /**
     * Legt den Wert der trafficConcentrationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficConcentrationExtension(ExtensionType value) {
        this.trafficConcentrationExtension = value;
    }

    public TrafficConcentration withConcentration(BigInteger value) {
        setConcentration(value);
        return this;
    }

    public TrafficConcentration withOccupancy(Float value) {
        setOccupancy(value);
        return this;
    }

    public TrafficConcentration withTrafficConcentrationExtension(ExtensionType value) {
        setTrafficConcentrationExtension(value);
        return this;
    }

    @Override
    public TrafficConcentration withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public TrafficConcentration withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public TrafficConcentration withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TrafficConcentration withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TrafficConcentration withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TrafficConcentration withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TrafficConcentration withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TrafficConcentration withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TrafficConcentration withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TrafficConcentration withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TrafficConcentration withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TrafficConcentration withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TrafficConcentration withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficConcentration withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TrafficConcentration withBasicDataValueExtension(ExtensionType value) {
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
