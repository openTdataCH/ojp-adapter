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
 * <p>Java-Klasse für TrafficSpeed complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TrafficSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageVehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2_0RC1/2_0}SpeedPercentile" minOccurs="0"/&gt;
 *         &lt;element name="trafficSpeedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficSpeed", propOrder = {
    "averageVehicleSpeed",
    "speedPercentile",
    "trafficSpeedExtension"
})
public class TrafficSpeed
    extends TrafficValue {

    protected Float averageVehicleSpeed;
    protected SpeedPercentile speedPercentile;
    protected ExtensionType trafficSpeedExtension;

    /**
     * Ruft den Wert der averageVehicleSpeed-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getAverageVehicleSpeed() {
        return averageVehicleSpeed;
    }

    /**
     * Legt den Wert der averageVehicleSpeed-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setAverageVehicleSpeed(Float value) {
        this.averageVehicleSpeed = value;
    }

    /**
     * Ruft den Wert der speedPercentile-Eigenschaft ab.
     *
     * @return possible object is {@link SpeedPercentile }
     */
    public SpeedPercentile getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Legt den Wert der speedPercentile-Eigenschaft fest.
     *
     * @param value allowed object is {@link SpeedPercentile }
     */
    public void setSpeedPercentile(SpeedPercentile value) {
        this.speedPercentile = value;
    }

    /**
     * Ruft den Wert der trafficSpeedExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTrafficSpeedExtension() {
        return trafficSpeedExtension;
    }

    /**
     * Legt den Wert der trafficSpeedExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTrafficSpeedExtension(ExtensionType value) {
        this.trafficSpeedExtension = value;
    }

    public TrafficSpeed withAverageVehicleSpeed(Float value) {
        setAverageVehicleSpeed(value);
        return this;
    }

    public TrafficSpeed withSpeedPercentile(SpeedPercentile value) {
        setSpeedPercentile(value);
        return this;
    }

    public TrafficSpeed withTrafficSpeedExtension(ExtensionType value) {
        setTrafficSpeedExtension(value);
        return this;
    }

    @Override
    public TrafficSpeed withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public TrafficSpeed withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public TrafficSpeed withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TrafficSpeed withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TrafficSpeed withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TrafficSpeed withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TrafficSpeed withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TrafficSpeed withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TrafficSpeed withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TrafficSpeed withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TrafficSpeed withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TrafficSpeed withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TrafficSpeed withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficSpeed withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TrafficSpeed withBasicDataValueExtension(ExtensionType value) {
        setBasicDataValueExtension(value);
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
