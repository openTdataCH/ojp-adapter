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
 * <p>Java-Klasse für SpeedPercentile complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SpeedPercentile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehiclePercentage" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage"/&gt;
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour"/&gt;
 *         &lt;element name="speedPercentileExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedPercentile", propOrder = {
    "vehiclePercentage",
    "speedPercentile",
    "speedPercentileExtension"
})
public class SpeedPercentile {

    protected float vehiclePercentage;
    protected float speedPercentile;
    protected ExtensionType speedPercentileExtension;

    /**
     * Ruft den Wert der vehiclePercentage-Eigenschaft ab.
     */
    public float getVehiclePercentage() {
        return vehiclePercentage;
    }

    /**
     * Legt den Wert der vehiclePercentage-Eigenschaft fest.
     */
    public void setVehiclePercentage(float value) {
        this.vehiclePercentage = value;
    }

    /**
     * Ruft den Wert der speedPercentile-Eigenschaft ab.
     */
    public float getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Legt den Wert der speedPercentile-Eigenschaft fest.
     */
    public void setSpeedPercentile(float value) {
        this.speedPercentile = value;
    }

    /**
     * Ruft den Wert der speedPercentileExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getSpeedPercentileExtension() {
        return speedPercentileExtension;
    }

    /**
     * Legt den Wert der speedPercentileExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setSpeedPercentileExtension(ExtensionType value) {
        this.speedPercentileExtension = value;
    }

    public SpeedPercentile withVehiclePercentage(float value) {
        setVehiclePercentage(value);
        return this;
    }

    public SpeedPercentile withSpeedPercentile(float value) {
        setSpeedPercentile(value);
        return this;
    }

    public SpeedPercentile withSpeedPercentileExtension(ExtensionType value) {
        setSpeedPercentileExtension(value);
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
