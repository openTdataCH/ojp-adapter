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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für VehicleSpeed complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualVehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour"/&gt;
 *         &lt;element name="vehicleSpeedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSpeed", propOrder = {
    "individualVehicleSpeed",
    "vehicleSpeedExtension"
})
public class VehicleSpeed {

    protected float individualVehicleSpeed;
    protected ExtensionType vehicleSpeedExtension;

    /**
     * Ruft den Wert der individualVehicleSpeed-Eigenschaft ab.
     * 
     */
    public float getIndividualVehicleSpeed() {
        return individualVehicleSpeed;
    }

    /**
     * Legt den Wert der individualVehicleSpeed-Eigenschaft fest.
     * 
     */
    public void setIndividualVehicleSpeed(float value) {
        this.individualVehicleSpeed = value;
    }

    /**
     * Ruft den Wert der vehicleSpeedExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleSpeedExtension() {
        return vehicleSpeedExtension;
    }

    /**
     * Legt den Wert der vehicleSpeedExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleSpeedExtension(ExtensionType value) {
        this.vehicleSpeedExtension = value;
    }

    public VehicleSpeed withIndividualVehicleSpeed(float value) {
        setIndividualVehicleSpeed(value);
        return this;
    }

    public VehicleSpeed withVehicleSpeedExtension(ExtensionType value) {
        setVehicleSpeedExtension(value);
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
