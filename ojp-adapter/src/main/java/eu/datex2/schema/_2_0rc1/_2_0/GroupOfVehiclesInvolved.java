//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für GroupOfVehiclesInvolved complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfVehiclesInvolved"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="groupOfVehiclesInvolvedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfVehiclesInvolved", propOrder = {
    "numberOfVehicles",
    "vehicleStatus",
    "vehicleCharacteristics",
    "groupOfVehiclesInvolvedExtension"
})
public class GroupOfVehiclesInvolved {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVehicles;
    @XmlSchemaType(name = "string")
    protected VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    protected ExtensionType groupOfVehiclesInvolvedExtension;

    /**
     * Ruft den Wert der numberOfVehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehicles() {
        return numberOfVehicles;
    }

    /**
     * Legt den Wert der numberOfVehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehicles(BigInteger value) {
        this.numberOfVehicles = value;
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
     * Ruft den Wert der groupOfVehiclesInvolvedExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfVehiclesInvolvedExtension() {
        return groupOfVehiclesInvolvedExtension;
    }

    /**
     * Legt den Wert der groupOfVehiclesInvolvedExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfVehiclesInvolvedExtension(ExtensionType value) {
        this.groupOfVehiclesInvolvedExtension = value;
    }

    public GroupOfVehiclesInvolved withNumberOfVehicles(BigInteger value) {
        setNumberOfVehicles(value);
        return this;
    }

    public GroupOfVehiclesInvolved withVehicleStatus(VehicleStatusEnum value) {
        setVehicleStatus(value);
        return this;
    }

    public GroupOfVehiclesInvolved withVehicleCharacteristics(VehicleCharacteristics value) {
        setVehicleCharacteristics(value);
        return this;
    }

    public GroupOfVehiclesInvolved withGroupOfVehiclesInvolvedExtension(ExtensionType value) {
        setGroupOfVehiclesInvolvedExtension(value);
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
