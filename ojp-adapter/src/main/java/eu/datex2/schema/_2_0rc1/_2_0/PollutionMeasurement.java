//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für PollutionMeasurement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PollutionMeasurement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pollutantConcentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationMicrogramsPerCubicMetre"/&gt;
 *         &lt;element name="pollutantType" type="{http://datex2.eu/schema/2_0RC1/2_0}PollutantTypeEnum"/&gt;
 *         &lt;element name="pollutionMeasurementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionMeasurement", propOrder = {
    "pollutantConcentration",
    "pollutantType",
    "pollutionMeasurementExtension"
})
public class PollutionMeasurement {

    protected float pollutantConcentration;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PollutantTypeEnum pollutantType;
    protected ExtensionType pollutionMeasurementExtension;

    /**
     * Ruft den Wert der pollutantConcentration-Eigenschaft ab.
     * 
     */
    public float getPollutantConcentration() {
        return pollutantConcentration;
    }

    /**
     * Legt den Wert der pollutantConcentration-Eigenschaft fest.
     * 
     */
    public void setPollutantConcentration(float value) {
        this.pollutantConcentration = value;
    }

    /**
     * Ruft den Wert der pollutantType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public PollutantTypeEnum getPollutantType() {
        return pollutantType;
    }

    /**
     * Legt den Wert der pollutantType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public void setPollutantType(PollutantTypeEnum value) {
        this.pollutantType = value;
    }

    /**
     * Ruft den Wert der pollutionMeasurementExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionMeasurementExtension() {
        return pollutionMeasurementExtension;
    }

    /**
     * Legt den Wert der pollutionMeasurementExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionMeasurementExtension(ExtensionType value) {
        this.pollutionMeasurementExtension = value;
    }

    public PollutionMeasurement withPollutantConcentration(float value) {
        setPollutantConcentration(value);
        return this;
    }

    public PollutionMeasurement withPollutantType(PollutantTypeEnum value) {
        setPollutantType(value);
        return this;
    }

    public PollutionMeasurement withPollutionMeasurementExtension(ExtensionType value) {
        setPollutionMeasurementExtension(value);
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
