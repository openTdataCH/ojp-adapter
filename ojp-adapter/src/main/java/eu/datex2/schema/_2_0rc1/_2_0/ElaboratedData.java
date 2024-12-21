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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für ElaboratedData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forecast" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://datex2.eu/schema/2_0RC1/2_0}Source" minOccurs="0"/&gt;
 *         &lt;element name="validity" type="{http://datex2.eu/schema/2_0RC1/2_0}Validity" minOccurs="0"/&gt;
 *         &lt;element name="basicDataValue" type="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"/&gt;
 *         &lt;element name="elaboratedDataExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedData", propOrder = {
    "forecast",
    "source",
    "validity",
    "basicDataValue",
    "elaboratedDataExtension"
})
public class ElaboratedData {

    protected Boolean forecast;
    protected Source source;
    protected Validity validity;
    @XmlElement(required = true)
    protected BasicDataValue basicDataValue;
    protected ExtensionType elaboratedDataExtension;

    /**
     * Ruft den Wert der forecast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecast() {
        return forecast;
    }

    /**
     * Legt den Wert der forecast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecast(Boolean value) {
        this.forecast = value;
    }

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der validity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Legt den Wert der validity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Ruft den Wert der basicDataValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue }
     *     
     */
    public BasicDataValue getBasicDataValue() {
        return basicDataValue;
    }

    /**
     * Legt den Wert der basicDataValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue }
     *     
     */
    public void setBasicDataValue(BasicDataValue value) {
        this.basicDataValue = value;
    }

    /**
     * Ruft den Wert der elaboratedDataExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataExtension() {
        return elaboratedDataExtension;
    }

    /**
     * Legt den Wert der elaboratedDataExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataExtension(ExtensionType value) {
        this.elaboratedDataExtension = value;
    }

    public ElaboratedData withForecast(Boolean value) {
        setForecast(value);
        return this;
    }

    public ElaboratedData withSource(Source value) {
        setSource(value);
        return this;
    }

    public ElaboratedData withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    public ElaboratedData withBasicDataValue(BasicDataValue value) {
        setBasicDataValue(value);
        return this;
    }

    public ElaboratedData withElaboratedDataExtension(ExtensionType value) {
        setElaboratedDataExtension(value);
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
