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
 * <p>Java-Klasse für GrossWeightCharacteristic complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GrossWeightCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/&gt;
 *         &lt;element name="grossVehicleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes"/&gt;
 *         &lt;element name="grossWeightCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "grossVehicleWeight",
    "grossWeightCharacteristicExtension"
})
public class GrossWeightCharacteristic {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonOperatorEnum comparisonOperator;
    protected float grossVehicleWeight;
    protected ExtensionType grossWeightCharacteristicExtension;

    /**
     * Ruft den Wert der comparisonOperator-Eigenschaft ab.
     *
     * @return possible object is {@link ComparisonOperatorEnum }
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Legt den Wert der comparisonOperator-Eigenschaft fest.
     *
     * @param value allowed object is {@link ComparisonOperatorEnum }
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Ruft den Wert der grossVehicleWeight-Eigenschaft ab.
     */
    public float getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    /**
     * Legt den Wert der grossVehicleWeight-Eigenschaft fest.
     */
    public void setGrossVehicleWeight(float value) {
        this.grossVehicleWeight = value;
    }

    /**
     * Ruft den Wert der grossWeightCharacteristicExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getGrossWeightCharacteristicExtension() {
        return grossWeightCharacteristicExtension;
    }

    /**
     * Legt den Wert der grossWeightCharacteristicExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setGrossWeightCharacteristicExtension(ExtensionType value) {
        this.grossWeightCharacteristicExtension = value;
    }

    public GrossWeightCharacteristic withComparisonOperator(ComparisonOperatorEnum value) {
        setComparisonOperator(value);
        return this;
    }

    public GrossWeightCharacteristic withGrossVehicleWeight(float value) {
        setGrossVehicleWeight(value);
        return this;
    }

    public GrossWeightCharacteristic withGrossWeightCharacteristicExtension(ExtensionType value) {
        setGrossWeightCharacteristicExtension(value);
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
