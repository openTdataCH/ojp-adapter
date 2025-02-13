//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

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
 * <p>Java-Klasse für VehicleCharacteristics complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="VehicleCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fuelType" type="{http://datex2.eu/schema/2_0RC1/2_0}FuelTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="loadType" type="{http://datex2.eu/schema/2_0RC1/2_0}LoadTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleEquipment" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleEquipmentEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleUsage" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleUsageEnum" minOccurs="0"/&gt;
 *         &lt;element name="grossWeightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}GrossWeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="heightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}HeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="lengthCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}LengthCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="widthCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}WidthCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="heaviestAxleWeightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaviestAxleWeightCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="numberOfAxlesCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}NumberOfAxlesCharacteristic" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristicsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCharacteristics", propOrder = {
    "fuelType",
    "loadType",
    "vehicleEquipment",
    "vehicleType",
    "vehicleUsage",
    "grossWeightCharacteristic",
    "heightCharacteristic",
    "lengthCharacteristic",
    "widthCharacteristic",
    "heaviestAxleWeightCharacteristic",
    "numberOfAxlesCharacteristic",
    "vehicleCharacteristicsExtension"
})
public class VehicleCharacteristics {

    @XmlSchemaType(name = "string")
    protected FuelTypeEnum fuelType;
    @XmlSchemaType(name = "string")
    protected LoadTypeEnum loadType;
    @XmlSchemaType(name = "string")
    protected VehicleEquipmentEnum vehicleEquipment;
    @XmlSchemaType(name = "string")
    protected List<VehicleTypeEnum> vehicleType;
    @XmlSchemaType(name = "string")
    protected VehicleUsageEnum vehicleUsage;
    protected List<GrossWeightCharacteristic> grossWeightCharacteristic;
    protected List<HeightCharacteristic> heightCharacteristic;
    protected List<LengthCharacteristic> lengthCharacteristic;
    protected List<WidthCharacteristic> widthCharacteristic;
    protected List<HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristic;
    protected List<NumberOfAxlesCharacteristic> numberOfAxlesCharacteristic;
    protected ExtensionType vehicleCharacteristicsExtension;

    /**
     * Ruft den Wert der fuelType-Eigenschaft ab.
     *
     * @return possible object is {@link FuelTypeEnum }
     */
    public FuelTypeEnum getFuelType() {
        return fuelType;
    }

    /**
     * Legt den Wert der fuelType-Eigenschaft fest.
     *
     * @param value allowed object is {@link FuelTypeEnum }
     */
    public void setFuelType(FuelTypeEnum value) {
        this.fuelType = value;
    }

    /**
     * Ruft den Wert der loadType-Eigenschaft ab.
     *
     * @return possible object is {@link LoadTypeEnum }
     */
    public LoadTypeEnum getLoadType() {
        return loadType;
    }

    /**
     * Legt den Wert der loadType-Eigenschaft fest.
     *
     * @param value allowed object is {@link LoadTypeEnum }
     */
    public void setLoadType(LoadTypeEnum value) {
        this.loadType = value;
    }

    /**
     * Ruft den Wert der vehicleEquipment-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleEquipmentEnum }
     */
    public VehicleEquipmentEnum getVehicleEquipment() {
        return vehicleEquipment;
    }

    /**
     * Legt den Wert der vehicleEquipment-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleEquipmentEnum }
     */
    public void setVehicleEquipment(VehicleEquipmentEnum value) {
        this.vehicleEquipment = value;
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
     * Ruft den Wert der vehicleUsage-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleUsageEnum }
     */
    public VehicleUsageEnum getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * Legt den Wert der vehicleUsage-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleUsageEnum }
     */
    public void setVehicleUsage(VehicleUsageEnum value) {
        this.vehicleUsage = value;
    }

    /**
     * Gets the value of the grossWeightCharacteristic property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the grossWeightCharacteristic property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossWeightCharacteristic().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GrossWeightCharacteristic }
     */
    public List<GrossWeightCharacteristic> getGrossWeightCharacteristic() {
        if (grossWeightCharacteristic == null) {
            grossWeightCharacteristic = new ArrayList<GrossWeightCharacteristic>();
        }
        return this.grossWeightCharacteristic;
    }

    /**
     * Gets the value of the heightCharacteristic property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the heightCharacteristic property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeightCharacteristic().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HeightCharacteristic }
     */
    public List<HeightCharacteristic> getHeightCharacteristic() {
        if (heightCharacteristic == null) {
            heightCharacteristic = new ArrayList<HeightCharacteristic>();
        }
        return this.heightCharacteristic;
    }

    /**
     * Gets the value of the lengthCharacteristic property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the lengthCharacteristic property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthCharacteristic().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link LengthCharacteristic }
     */
    public List<LengthCharacteristic> getLengthCharacteristic() {
        if (lengthCharacteristic == null) {
            lengthCharacteristic = new ArrayList<LengthCharacteristic>();
        }
        return this.lengthCharacteristic;
    }

    /**
     * Gets the value of the widthCharacteristic property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the widthCharacteristic property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWidthCharacteristic().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link WidthCharacteristic }
     */
    public List<WidthCharacteristic> getWidthCharacteristic() {
        if (widthCharacteristic == null) {
            widthCharacteristic = new ArrayList<WidthCharacteristic>();
        }
        return this.widthCharacteristic;
    }

    /**
     * Gets the value of the heaviestAxleWeightCharacteristic property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the heaviestAxleWeightCharacteristic property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaviestAxleWeightCharacteristic().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HeaviestAxleWeightCharacteristic }
     */
    public List<HeaviestAxleWeightCharacteristic> getHeaviestAxleWeightCharacteristic() {
        if (heaviestAxleWeightCharacteristic == null) {
            heaviestAxleWeightCharacteristic = new ArrayList<HeaviestAxleWeightCharacteristic>();
        }
        return this.heaviestAxleWeightCharacteristic;
    }

    /**
     * Gets the value of the numberOfAxlesCharacteristic property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the numberOfAxlesCharacteristic property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfAxlesCharacteristic().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NumberOfAxlesCharacteristic }
     */
    public List<NumberOfAxlesCharacteristic> getNumberOfAxlesCharacteristic() {
        if (numberOfAxlesCharacteristic == null) {
            numberOfAxlesCharacteristic = new ArrayList<NumberOfAxlesCharacteristic>();
        }
        return this.numberOfAxlesCharacteristic;
    }

    /**
     * Ruft den Wert der vehicleCharacteristicsExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getVehicleCharacteristicsExtension() {
        return vehicleCharacteristicsExtension;
    }

    /**
     * Legt den Wert der vehicleCharacteristicsExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setVehicleCharacteristicsExtension(ExtensionType value) {
        this.vehicleCharacteristicsExtension = value;
    }

    public VehicleCharacteristics withFuelType(FuelTypeEnum value) {
        setFuelType(value);
        return this;
    }

    public VehicleCharacteristics withLoadType(LoadTypeEnum value) {
        setLoadType(value);
        return this;
    }

    public VehicleCharacteristics withVehicleEquipment(VehicleEquipmentEnum value) {
        setVehicleEquipment(value);
        return this;
    }

    public VehicleCharacteristics withVehicleType(VehicleTypeEnum... values) {
        if (values != null) {
            for (VehicleTypeEnum value : values) {
                getVehicleType().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withVehicleType(Collection<VehicleTypeEnum> values) {
        if (values != null) {
            getVehicleType().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withVehicleUsage(VehicleUsageEnum value) {
        setVehicleUsage(value);
        return this;
    }

    public VehicleCharacteristics withGrossWeightCharacteristic(GrossWeightCharacteristic... values) {
        if (values != null) {
            for (GrossWeightCharacteristic value : values) {
                getGrossWeightCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withGrossWeightCharacteristic(Collection<GrossWeightCharacteristic> values) {
        if (values != null) {
            getGrossWeightCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withHeightCharacteristic(HeightCharacteristic... values) {
        if (values != null) {
            for (HeightCharacteristic value : values) {
                getHeightCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withHeightCharacteristic(Collection<HeightCharacteristic> values) {
        if (values != null) {
            getHeightCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withLengthCharacteristic(LengthCharacteristic... values) {
        if (values != null) {
            for (LengthCharacteristic value : values) {
                getLengthCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withLengthCharacteristic(Collection<LengthCharacteristic> values) {
        if (values != null) {
            getLengthCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withWidthCharacteristic(WidthCharacteristic... values) {
        if (values != null) {
            for (WidthCharacteristic value : values) {
                getWidthCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withWidthCharacteristic(Collection<WidthCharacteristic> values) {
        if (values != null) {
            getWidthCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withHeaviestAxleWeightCharacteristic(HeaviestAxleWeightCharacteristic... values) {
        if (values != null) {
            for (HeaviestAxleWeightCharacteristic value : values) {
                getHeaviestAxleWeightCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withHeaviestAxleWeightCharacteristic(Collection<HeaviestAxleWeightCharacteristic> values) {
        if (values != null) {
            getHeaviestAxleWeightCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withNumberOfAxlesCharacteristic(NumberOfAxlesCharacteristic... values) {
        if (values != null) {
            for (NumberOfAxlesCharacteristic value : values) {
                getNumberOfAxlesCharacteristic().add(value);
            }
        }
        return this;
    }

    public VehicleCharacteristics withNumberOfAxlesCharacteristic(Collection<NumberOfAxlesCharacteristic> values) {
        if (values != null) {
            getNumberOfAxlesCharacteristic().addAll(values);
        }
        return this;
    }

    public VehicleCharacteristics withVehicleCharacteristicsExtension(ExtensionType value) {
        setVehicleCharacteristicsExtension(value);
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
