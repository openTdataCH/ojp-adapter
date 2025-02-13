//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für TravelTimeValue complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TravelTimeValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="travelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TravelTimeTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeType" type="{http://datex2.eu/schema/2_0RC1/2_0}TravelTimeTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="freeFlowSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="freeFlowTravelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="normallyExpectedTravelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelTimeValue", propOrder = {
    "travelTime",
    "travelTimeTrendType",
    "travelTimeType",
    "freeFlowSpeed",
    "freeFlowTravelTime",
    "normallyExpectedTravelTime",
    "vehicleType",
    "travelTimeValueExtension"
})
public class TravelTimeValue
    extends BasicDataValue {

    protected Float travelTime;
    @XmlSchemaType(name = "string")
    protected TravelTimeTrendTypeEnum travelTimeTrendType;
    @XmlSchemaType(name = "string")
    protected TravelTimeTypeEnum travelTimeType;
    protected Float freeFlowSpeed;
    protected Float freeFlowTravelTime;
    protected Float normallyExpectedTravelTime;
    @XmlSchemaType(name = "string")
    protected List<VehicleTypeEnum> vehicleType;
    protected ExtensionType travelTimeValueExtension;

    /**
     * Ruft den Wert der travelTime-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getTravelTime() {
        return travelTime;
    }

    /**
     * Legt den Wert der travelTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setTravelTime(Float value) {
        this.travelTime = value;
    }

    /**
     * Ruft den Wert der travelTimeTrendType-Eigenschaft ab.
     *
     * @return possible object is {@link TravelTimeTrendTypeEnum }
     */
    public TravelTimeTrendTypeEnum getTravelTimeTrendType() {
        return travelTimeTrendType;
    }

    /**
     * Legt den Wert der travelTimeTrendType-Eigenschaft fest.
     *
     * @param value allowed object is {@link TravelTimeTrendTypeEnum }
     */
    public void setTravelTimeTrendType(TravelTimeTrendTypeEnum value) {
        this.travelTimeTrendType = value;
    }

    /**
     * Ruft den Wert der travelTimeType-Eigenschaft ab.
     *
     * @return possible object is {@link TravelTimeTypeEnum }
     */
    public TravelTimeTypeEnum getTravelTimeType() {
        return travelTimeType;
    }

    /**
     * Legt den Wert der travelTimeType-Eigenschaft fest.
     *
     * @param value allowed object is {@link TravelTimeTypeEnum }
     */
    public void setTravelTimeType(TravelTimeTypeEnum value) {
        this.travelTimeType = value;
    }

    /**
     * Ruft den Wert der freeFlowSpeed-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getFreeFlowSpeed() {
        return freeFlowSpeed;
    }

    /**
     * Legt den Wert der freeFlowSpeed-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setFreeFlowSpeed(Float value) {
        this.freeFlowSpeed = value;
    }

    /**
     * Ruft den Wert der freeFlowTravelTime-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getFreeFlowTravelTime() {
        return freeFlowTravelTime;
    }

    /**
     * Legt den Wert der freeFlowTravelTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setFreeFlowTravelTime(Float value) {
        this.freeFlowTravelTime = value;
    }

    /**
     * Ruft den Wert der normallyExpectedTravelTime-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getNormallyExpectedTravelTime() {
        return normallyExpectedTravelTime;
    }

    /**
     * Legt den Wert der normallyExpectedTravelTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setNormallyExpectedTravelTime(Float value) {
        this.normallyExpectedTravelTime = value;
    }

    /**
     * Gets the value of the vehicleType property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the vehicleType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleTypeEnum }
     */
    public List<VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleTypeEnum>();
        }
        return this.vehicleType;
    }

    /**
     * Ruft den Wert der travelTimeValueExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTravelTimeValueExtension() {
        return travelTimeValueExtension;
    }

    /**
     * Legt den Wert der travelTimeValueExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTravelTimeValueExtension(ExtensionType value) {
        this.travelTimeValueExtension = value;
    }

    public TravelTimeValue withTravelTime(Float value) {
        setTravelTime(value);
        return this;
    }

    public TravelTimeValue withTravelTimeTrendType(TravelTimeTrendTypeEnum value) {
        setTravelTimeTrendType(value);
        return this;
    }

    public TravelTimeValue withTravelTimeType(TravelTimeTypeEnum value) {
        setTravelTimeType(value);
        return this;
    }

    public TravelTimeValue withFreeFlowSpeed(Float value) {
        setFreeFlowSpeed(value);
        return this;
    }

    public TravelTimeValue withFreeFlowTravelTime(Float value) {
        setFreeFlowTravelTime(value);
        return this;
    }

    public TravelTimeValue withNormallyExpectedTravelTime(Float value) {
        setNormallyExpectedTravelTime(value);
        return this;
    }

    public TravelTimeValue withVehicleType(VehicleTypeEnum... values) {
        if (values != null) {
            for (VehicleTypeEnum value : values) {
                getVehicleType().add(value);
            }
        }
        return this;
    }

    public TravelTimeValue withVehicleType(Collection<VehicleTypeEnum> values) {
        if (values != null) {
            getVehicleType().addAll(values);
        }
        return this;
    }

    public TravelTimeValue withTravelTimeValueExtension(ExtensionType value) {
        setTravelTimeValueExtension(value);
        return this;
    }

    @Override
    public TravelTimeValue withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TravelTimeValue withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TravelTimeValue withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TravelTimeValue withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TravelTimeValue withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TravelTimeValue withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TravelTimeValue withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TravelTimeValue withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TravelTimeValue withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TravelTimeValue withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TravelTimeValue withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TravelTimeValue withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TravelTimeValue withBasicDataValueExtension(ExtensionType value) {
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
