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
 * <p>Java-Klasse für Wind complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Wind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumWindSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="windDirectionBearing" type="{http://datex2.eu/schema/2_0RC1/2_0}AngleInDegrees" minOccurs="0"/&gt;
 *         &lt;element name="windDirectionCompass" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionCompassEnum" minOccurs="0"/&gt;
 *         &lt;element name="windMeasurementHeight" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="windSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="windExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wind", propOrder = {
    "maximumWindSpeed",
    "windDirectionBearing",
    "windDirectionCompass",
    "windMeasurementHeight",
    "windSpeed",
    "windExtension"
})
public class Wind {

    protected Float maximumWindSpeed;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger windDirectionBearing;
    @XmlSchemaType(name = "string")
    protected DirectionCompassEnum windDirectionCompass;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger windMeasurementHeight;
    protected Float windSpeed;
    protected ExtensionType windExtension;

    /**
     * Ruft den Wert der maximumWindSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumWindSpeed() {
        return maximumWindSpeed;
    }

    /**
     * Legt den Wert der maximumWindSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumWindSpeed(Float value) {
        this.maximumWindSpeed = value;
    }

    /**
     * Ruft den Wert der windDirectionBearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindDirectionBearing() {
        return windDirectionBearing;
    }

    /**
     * Legt den Wert der windDirectionBearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindDirectionBearing(BigInteger value) {
        this.windDirectionBearing = value;
    }

    /**
     * Ruft den Wert der windDirectionCompass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public DirectionCompassEnum getWindDirectionCompass() {
        return windDirectionCompass;
    }

    /**
     * Legt den Wert der windDirectionCompass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public void setWindDirectionCompass(DirectionCompassEnum value) {
        this.windDirectionCompass = value;
    }

    /**
     * Ruft den Wert der windMeasurementHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindMeasurementHeight() {
        return windMeasurementHeight;
    }

    /**
     * Legt den Wert der windMeasurementHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindMeasurementHeight(BigInteger value) {
        this.windMeasurementHeight = value;
    }

    /**
     * Ruft den Wert der windSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWindSpeed() {
        return windSpeed;
    }

    /**
     * Legt den Wert der windSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWindSpeed(Float value) {
        this.windSpeed = value;
    }

    /**
     * Ruft den Wert der windExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWindExtension() {
        return windExtension;
    }

    /**
     * Legt den Wert der windExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWindExtension(ExtensionType value) {
        this.windExtension = value;
    }

    public Wind withMaximumWindSpeed(Float value) {
        setMaximumWindSpeed(value);
        return this;
    }

    public Wind withWindDirectionBearing(BigInteger value) {
        setWindDirectionBearing(value);
        return this;
    }

    public Wind withWindDirectionCompass(DirectionCompassEnum value) {
        setWindDirectionCompass(value);
        return this;
    }

    public Wind withWindMeasurementHeight(BigInteger value) {
        setWindMeasurementHeight(value);
        return this;
    }

    public Wind withWindSpeed(Float value) {
        setWindSpeed(value);
        return this;
    }

    public Wind withWindExtension(ExtensionType value) {
        setWindExtension(value);
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
