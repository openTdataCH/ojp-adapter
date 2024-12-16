//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.Duration;
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
 * Allowed values for the monitoring conditions (frequency of measurement, etc): an automatic monitoring of the status of a lift with pushed alert in case of incident is very different from a daily manual/visual check.
 * 
 * <p>Java-Klasse für MonitoringInformationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MonitoringInformationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoringInterval" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringType" type="{http://www.siri.org.uk/siri}MonitoringTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringPeriod" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringInformationStructure", propOrder = {
    "monitoringInterval",
    "monitoringType",
    "monitoringPeriod",
    "extensions"
})
public class MonitoringInformationStructure {

    @XmlElement(name = "MonitoringInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration monitoringInterval;
    @XmlElement(name = "MonitoringType")
    @XmlSchemaType(name = "NMTOKEN")
    protected MonitoringTypeEnumeration monitoringType;
    @XmlElement(name = "MonitoringPeriod")
    protected MonitoringValidityConditionStructure monitoringPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der monitoringInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * Legt den Wert der monitoringInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoringInterval(Duration value) {
        this.monitoringInterval = value;
    }

    /**
     * Ruft den Wert der monitoringType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringTypeEnumeration }
     *     
     */
    public MonitoringTypeEnumeration getMonitoringType() {
        return monitoringType;
    }

    /**
     * Legt den Wert der monitoringType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringTypeEnumeration }
     *     
     */
    public void setMonitoringType(MonitoringTypeEnumeration value) {
        this.monitoringType = value;
    }

    /**
     * Ruft den Wert der monitoringPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public MonitoringValidityConditionStructure getMonitoringPeriod() {
        return monitoringPeriod;
    }

    /**
     * Legt den Wert der monitoringPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public void setMonitoringPeriod(MonitoringValidityConditionStructure value) {
        this.monitoringPeriod = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public MonitoringInformationStructure withMonitoringInterval(Duration value) {
        setMonitoringInterval(value);
        return this;
    }

    public MonitoringInformationStructure withMonitoringType(MonitoringTypeEnumeration value) {
        setMonitoringType(value);
        return this;
    }

    public MonitoringInformationStructure withMonitoringPeriod(MonitoringValidityConditionStructure value) {
        setMonitoringPeriod(value);
        return this;
    }

    public MonitoringInformationStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
