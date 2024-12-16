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
 * <p>Java-Klasse für Vehicle complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Vehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleColour" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCountryOfOrigin" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="vehicleIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleManufacturer" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleModel" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleRegistrationPlateIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="axleSpacingOnVehicle" type="{http://datex2.eu/schema/2_0RC1/2_0}AxleSpacing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specificAxleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}AxleWeight" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hazardousGoodsAssociatedWithVehicle" type="{http://datex2.eu/schema/2_0RC1/2_0}HazardousMaterials" minOccurs="0"/&gt;
 *         &lt;element name="vehicleExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "vehicleColour",
    "vehicleCountryOfOrigin",
    "vehicleIdentifier",
    "vehicleManufacturer",
    "vehicleModel",
    "vehicleRegistrationPlateIdentifier",
    "vehicleStatus",
    "vehicleCharacteristics",
    "axleSpacingOnVehicle",
    "specificAxleWeight",
    "hazardousGoodsAssociatedWithVehicle",
    "vehicleExtension"
})
public class Vehicle {

    protected MultilingualString vehicleColour;
    protected MultilingualString vehicleCountryOfOrigin;
    protected String vehicleIdentifier;
    protected String vehicleManufacturer;
    protected String vehicleModel;
    protected String vehicleRegistrationPlateIdentifier;
    @XmlSchemaType(name = "string")
    protected VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    protected List<AxleSpacing> axleSpacingOnVehicle;
    protected List<AxleWeight> specificAxleWeight;
    protected HazardousMaterials hazardousGoodsAssociatedWithVehicle;
    protected ExtensionType vehicleExtension;

    /**
     * Ruft den Wert der vehicleColour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVehicleColour() {
        return vehicleColour;
    }

    /**
     * Legt den Wert der vehicleColour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVehicleColour(MultilingualString value) {
        this.vehicleColour = value;
    }

    /**
     * Ruft den Wert der vehicleCountryOfOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVehicleCountryOfOrigin() {
        return vehicleCountryOfOrigin;
    }

    /**
     * Legt den Wert der vehicleCountryOfOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVehicleCountryOfOrigin(MultilingualString value) {
        this.vehicleCountryOfOrigin = value;
    }

    /**
     * Ruft den Wert der vehicleIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    /**
     * Legt den Wert der vehicleIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIdentifier(String value) {
        this.vehicleIdentifier = value;
    }

    /**
     * Ruft den Wert der vehicleManufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    /**
     * Legt den Wert der vehicleManufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleManufacturer(String value) {
        this.vehicleManufacturer = value;
    }

    /**
     * Ruft den Wert der vehicleModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Legt den Wert der vehicleModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    /**
     * Ruft den Wert der vehicleRegistrationPlateIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegistrationPlateIdentifier() {
        return vehicleRegistrationPlateIdentifier;
    }

    /**
     * Legt den Wert der vehicleRegistrationPlateIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegistrationPlateIdentifier(String value) {
        this.vehicleRegistrationPlateIdentifier = value;
    }

    /**
     * Ruft den Wert der vehicleStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public VehicleStatusEnum getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Legt den Wert der vehicleStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public void setVehicleStatus(VehicleStatusEnum value) {
        this.vehicleStatus = value;
    }

    /**
     * Ruft den Wert der vehicleCharacteristics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getVehicleCharacteristics() {
        return vehicleCharacteristics;
    }

    /**
     * Legt den Wert der vehicleCharacteristics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setVehicleCharacteristics(VehicleCharacteristics value) {
        this.vehicleCharacteristics = value;
    }

    /**
     * Gets the value of the axleSpacingOnVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the axleSpacingOnVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxleSpacingOnVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleSpacing }
     * 
     * 
     */
    public List<AxleSpacing> getAxleSpacingOnVehicle() {
        if (axleSpacingOnVehicle == null) {
            axleSpacingOnVehicle = new ArrayList<AxleSpacing>();
        }
        return this.axleSpacingOnVehicle;
    }

    /**
     * Gets the value of the specificAxleWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specificAxleWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificAxleWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleWeight }
     * 
     * 
     */
    public List<AxleWeight> getSpecificAxleWeight() {
        if (specificAxleWeight == null) {
            specificAxleWeight = new ArrayList<AxleWeight>();
        }
        return this.specificAxleWeight;
    }

    /**
     * Ruft den Wert der hazardousGoodsAssociatedWithVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HazardousMaterials }
     *     
     */
    public HazardousMaterials getHazardousGoodsAssociatedWithVehicle() {
        return hazardousGoodsAssociatedWithVehicle;
    }

    /**
     * Legt den Wert der hazardousGoodsAssociatedWithVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousMaterials }
     *     
     */
    public void setHazardousGoodsAssociatedWithVehicle(HazardousMaterials value) {
        this.hazardousGoodsAssociatedWithVehicle = value;
    }

    /**
     * Ruft den Wert der vehicleExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleExtension() {
        return vehicleExtension;
    }

    /**
     * Legt den Wert der vehicleExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleExtension(ExtensionType value) {
        this.vehicleExtension = value;
    }

    public Vehicle withVehicleColour(MultilingualString value) {
        setVehicleColour(value);
        return this;
    }

    public Vehicle withVehicleCountryOfOrigin(MultilingualString value) {
        setVehicleCountryOfOrigin(value);
        return this;
    }

    public Vehicle withVehicleIdentifier(String value) {
        setVehicleIdentifier(value);
        return this;
    }

    public Vehicle withVehicleManufacturer(String value) {
        setVehicleManufacturer(value);
        return this;
    }

    public Vehicle withVehicleModel(String value) {
        setVehicleModel(value);
        return this;
    }

    public Vehicle withVehicleRegistrationPlateIdentifier(String value) {
        setVehicleRegistrationPlateIdentifier(value);
        return this;
    }

    public Vehicle withVehicleStatus(VehicleStatusEnum value) {
        setVehicleStatus(value);
        return this;
    }

    public Vehicle withVehicleCharacteristics(VehicleCharacteristics value) {
        setVehicleCharacteristics(value);
        return this;
    }

    public Vehicle withAxleSpacingOnVehicle(AxleSpacing... values) {
        if (values!= null) {
            for (AxleSpacing value: values) {
                getAxleSpacingOnVehicle().add(value);
            }
        }
        return this;
    }

    public Vehicle withAxleSpacingOnVehicle(Collection<AxleSpacing> values) {
        if (values!= null) {
            getAxleSpacingOnVehicle().addAll(values);
        }
        return this;
    }

    public Vehicle withSpecificAxleWeight(AxleWeight... values) {
        if (values!= null) {
            for (AxleWeight value: values) {
                getSpecificAxleWeight().add(value);
            }
        }
        return this;
    }

    public Vehicle withSpecificAxleWeight(Collection<AxleWeight> values) {
        if (values!= null) {
            getSpecificAxleWeight().addAll(values);
        }
        return this;
    }

    public Vehicle withHazardousGoodsAssociatedWithVehicle(HazardousMaterials value) {
        setHazardousGoodsAssociatedWithVehicle(value);
        return this;
    }

    public Vehicle withVehicleExtension(ExtensionType value) {
        setVehicleExtension(value);
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
