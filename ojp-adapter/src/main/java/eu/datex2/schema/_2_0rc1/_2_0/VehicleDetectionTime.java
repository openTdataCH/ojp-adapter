//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für VehicleDetectionTime complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleDetectionTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivalTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="exitTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="passageTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="presenceTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="timeGap" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="timeHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="vehicleDetectionTimeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleDetectionTime", propOrder = {
    "arrivalTime",
    "exitTime",
    "passageTime",
    "presenceTime",
    "timeGap",
    "timeHeadway",
    "vehicleDetectionTimeExtension"
})
public class VehicleDetectionTime {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime arrivalTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime exitTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime passageTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime presenceTime;
    protected Float timeGap;
    protected Float timeHeadway;
    protected ExtensionType vehicleDetectionTimeExtension;

    /**
     * Ruft den Wert der arrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Legt den Wert der arrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(ZonedDateTime value) {
        this.arrivalTime = value;
    }

    /**
     * Ruft den Wert der exitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExitTime() {
        return exitTime;
    }

    /**
     * Legt den Wert der exitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitTime(ZonedDateTime value) {
        this.exitTime = value;
    }

    /**
     * Ruft den Wert der passageTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getPassageTime() {
        return passageTime;
    }

    /**
     * Legt den Wert der passageTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassageTime(ZonedDateTime value) {
        this.passageTime = value;
    }

    /**
     * Ruft den Wert der presenceTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getPresenceTime() {
        return presenceTime;
    }

    /**
     * Legt den Wert der presenceTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenceTime(ZonedDateTime value) {
        this.presenceTime = value;
    }

    /**
     * Ruft den Wert der timeGap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeGap() {
        return timeGap;
    }

    /**
     * Legt den Wert der timeGap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeGap(Float value) {
        this.timeGap = value;
    }

    /**
     * Ruft den Wert der timeHeadway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeHeadway() {
        return timeHeadway;
    }

    /**
     * Legt den Wert der timeHeadway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeHeadway(Float value) {
        this.timeHeadway = value;
    }

    /**
     * Ruft den Wert der vehicleDetectionTimeExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleDetectionTimeExtension() {
        return vehicleDetectionTimeExtension;
    }

    /**
     * Legt den Wert der vehicleDetectionTimeExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleDetectionTimeExtension(ExtensionType value) {
        this.vehicleDetectionTimeExtension = value;
    }

    public VehicleDetectionTime withArrivalTime(ZonedDateTime value) {
        setArrivalTime(value);
        return this;
    }

    public VehicleDetectionTime withExitTime(ZonedDateTime value) {
        setExitTime(value);
        return this;
    }

    public VehicleDetectionTime withPassageTime(ZonedDateTime value) {
        setPassageTime(value);
        return this;
    }

    public VehicleDetectionTime withPresenceTime(ZonedDateTime value) {
        setPresenceTime(value);
        return this;
    }

    public VehicleDetectionTime withTimeGap(Float value) {
        setTimeGap(value);
        return this;
    }

    public VehicleDetectionTime withTimeHeadway(Float value) {
        setTimeHeadway(value);
        return this;
    }

    public VehicleDetectionTime withVehicleDetectionTimeExtension(ExtensionType value) {
        setVehicleDetectionTimeExtension(value);
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
