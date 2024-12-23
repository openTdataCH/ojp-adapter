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
 * <p>Java-Klasse für VehicleHeadway complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleHeadway"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distanceGap" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="distanceHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="vehicleHeadwayExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleHeadway", propOrder = {
    "distanceGap",
    "distanceHeadway",
    "vehicleHeadwayExtension"
})
public class VehicleHeadway {

    protected Float distanceGap;
    protected Float distanceHeadway;
    protected ExtensionType vehicleHeadwayExtension;

    /**
     * Ruft den Wert der distanceGap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceGap() {
        return distanceGap;
    }

    /**
     * Legt den Wert der distanceGap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceGap(Float value) {
        this.distanceGap = value;
    }

    /**
     * Ruft den Wert der distanceHeadway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceHeadway() {
        return distanceHeadway;
    }

    /**
     * Legt den Wert der distanceHeadway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceHeadway(Float value) {
        this.distanceHeadway = value;
    }

    /**
     * Ruft den Wert der vehicleHeadwayExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleHeadwayExtension() {
        return vehicleHeadwayExtension;
    }

    /**
     * Legt den Wert der vehicleHeadwayExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleHeadwayExtension(ExtensionType value) {
        this.vehicleHeadwayExtension = value;
    }

    public VehicleHeadway withDistanceGap(Float value) {
        setDistanceGap(value);
        return this;
    }

    public VehicleHeadway withDistanceHeadway(Float value) {
        setDistanceHeadway(value);
        return this;
    }

    public VehicleHeadway withVehicleHeadwayExtension(ExtensionType value) {
        setVehicleHeadwayExtension(value);
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
