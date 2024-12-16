//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.Duration;
import eu.datex2.schema._2_0rc1._2_0.DelaysTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * Type for easement info.
 * 
 * <p>Java-Klasse für DelaysStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DelaysStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelayBand" type="{http://www.siri.org.uk/siri}DelayBandEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="DelayType" type="{http://datex2.eu/schema/2_0RC1/2_0}DelaysTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="Delay" type="{http://www.siri.org.uk/siri}PositiveDurationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelaysStructure", propOrder = {
    "delayBand",
    "delayType",
    "delay"
})
public class DelaysStructure {

    @XmlElement(name = "DelayBand")
    @XmlSchemaType(name = "normalizedString")
    protected DelayBandEnumeration delayBand;
    @XmlElement(name = "DelayType")
    @XmlSchemaType(name = "string")
    protected DelaysTypeEnum delayType;
    @XmlElement(name = "Delay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration delay;

    /**
     * Ruft den Wert der delayBand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelayBandEnumeration }
     *     
     */
    public DelayBandEnumeration getDelayBand() {
        return delayBand;
    }

    /**
     * Legt den Wert der delayBand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayBandEnumeration }
     *     
     */
    public void setDelayBand(DelayBandEnumeration value) {
        this.delayBand = value;
    }

    /**
     * Ruft den Wert der delayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelayType() {
        return delayType;
    }

    /**
     * Legt den Wert der delayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelayType(DelaysTypeEnum value) {
        this.delayType = value;
    }

    /**
     * Ruft den Wert der delay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Legt den Wert der delay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

    public DelaysStructure withDelayBand(DelayBandEnumeration value) {
        setDelayBand(value);
        return this;
    }

    public DelaysStructure withDelayType(DelaysTypeEnum value) {
        setDelayType(value);
        return this;
    }

    public DelaysStructure withDelay(Duration value) {
        setDelay(value);
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
