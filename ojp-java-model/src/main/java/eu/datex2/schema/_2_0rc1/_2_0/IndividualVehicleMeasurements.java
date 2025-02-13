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
import java.math.BigInteger;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für IndividualVehicleMeasurements complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="IndividualVehicleMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleSpeed" minOccurs="0"/&gt;
 *         &lt;element name="vehicleDetectionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleDetectionTime" minOccurs="0"/&gt;
 *         &lt;element name="vehicleHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleHeadway" minOccurs="0"/&gt;
 *         &lt;element name="individualVehicleMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualVehicleMeasurements", propOrder = {
    "vehicleSpeed",
    "vehicleDetectionTime",
    "vehicleHeadway",
    "individualVehicleMeasurementsExtension"
})
public class IndividualVehicleMeasurements
    extends TrafficValue {

    protected VehicleSpeed vehicleSpeed;
    protected VehicleDetectionTime vehicleDetectionTime;
    protected VehicleHeadway vehicleHeadway;
    protected ExtensionType individualVehicleMeasurementsExtension;

    /**
     * Ruft den Wert der vehicleSpeed-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleSpeed }
     */
    public VehicleSpeed getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * Legt den Wert der vehicleSpeed-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleSpeed }
     */
    public void setVehicleSpeed(VehicleSpeed value) {
        this.vehicleSpeed = value;
    }

    /**
     * Ruft den Wert der vehicleDetectionTime-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleDetectionTime }
     */
    public VehicleDetectionTime getVehicleDetectionTime() {
        return vehicleDetectionTime;
    }

    /**
     * Legt den Wert der vehicleDetectionTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleDetectionTime }
     */
    public void setVehicleDetectionTime(VehicleDetectionTime value) {
        this.vehicleDetectionTime = value;
    }

    /**
     * Ruft den Wert der vehicleHeadway-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleHeadway }
     */
    public VehicleHeadway getVehicleHeadway() {
        return vehicleHeadway;
    }

    /**
     * Legt den Wert der vehicleHeadway-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleHeadway }
     */
    public void setVehicleHeadway(VehicleHeadway value) {
        this.vehicleHeadway = value;
    }

    /**
     * Ruft den Wert der individualVehicleMeasurementsExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getIndividualVehicleMeasurementsExtension() {
        return individualVehicleMeasurementsExtension;
    }

    /**
     * Legt den Wert der individualVehicleMeasurementsExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setIndividualVehicleMeasurementsExtension(ExtensionType value) {
        this.individualVehicleMeasurementsExtension = value;
    }

    public IndividualVehicleMeasurements withVehicleSpeed(VehicleSpeed value) {
        setVehicleSpeed(value);
        return this;
    }

    public IndividualVehicleMeasurements withVehicleDetectionTime(VehicleDetectionTime value) {
        setVehicleDetectionTime(value);
        return this;
    }

    public IndividualVehicleMeasurements withVehicleHeadway(VehicleHeadway value) {
        setVehicleHeadway(value);
        return this;
    }

    public IndividualVehicleMeasurements withIndividualVehicleMeasurementsExtension(ExtensionType value) {
        setIndividualVehicleMeasurementsExtension(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        setForVehiclesWithCharacteristicsOf(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withTrafficValueExtension(ExtensionType value) {
        setTrafficValueExtension(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public IndividualVehicleMeasurements withBasicDataValueExtension(ExtensionType value) {
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
