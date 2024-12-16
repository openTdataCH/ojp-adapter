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
 * <p>Java-Klasse für Temperature complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Temperature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="dewPointTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="maximumTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="minimumTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="temperatureExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Temperature", propOrder = {
    "airTemperature",
    "dewPointTemperature",
    "maximumTemperature",
    "minimumTemperature",
    "temperatureExtension"
})
public class Temperature {

    protected Float airTemperature;
    protected Float dewPointTemperature;
    protected Float maximumTemperature;
    protected Float minimumTemperature;
    protected ExtensionType temperatureExtension;

    /**
     * Ruft den Wert der airTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAirTemperature() {
        return airTemperature;
    }

    /**
     * Legt den Wert der airTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAirTemperature(Float value) {
        this.airTemperature = value;
    }

    /**
     * Ruft den Wert der dewPointTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDewPointTemperature() {
        return dewPointTemperature;
    }

    /**
     * Legt den Wert der dewPointTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDewPointTemperature(Float value) {
        this.dewPointTemperature = value;
    }

    /**
     * Ruft den Wert der maximumTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Legt den Wert der maximumTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumTemperature(Float value) {
        this.maximumTemperature = value;
    }

    /**
     * Ruft den Wert der minimumTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Legt den Wert der minimumTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumTemperature(Float value) {
        this.minimumTemperature = value;
    }

    /**
     * Ruft den Wert der temperatureExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemperatureExtension() {
        return temperatureExtension;
    }

    /**
     * Legt den Wert der temperatureExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemperatureExtension(ExtensionType value) {
        this.temperatureExtension = value;
    }

    public Temperature withAirTemperature(Float value) {
        setAirTemperature(value);
        return this;
    }

    public Temperature withDewPointTemperature(Float value) {
        setDewPointTemperature(value);
        return this;
    }

    public Temperature withMaximumTemperature(Float value) {
        setMaximumTemperature(value);
        return this;
    }

    public Temperature withMinimumTemperature(Float value) {
        setMinimumTemperature(value);
        return this;
    }

    public Temperature withTemperatureExtension(ExtensionType value) {
        setTemperatureExtension(value);
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
