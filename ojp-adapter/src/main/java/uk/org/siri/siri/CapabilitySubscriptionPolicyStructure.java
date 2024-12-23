//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Common Subscription capabilities.
 * 
 * <p>Java-Klasse für CapabilitySubscriptionPolicyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CapabilitySubscriptionPolicyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasChangeSensitivity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitySubscriptionPolicyStructure", propOrder = {
    "hasIncrementalUpdates",
    "hasChangeSensitivity"
})
public class CapabilitySubscriptionPolicyStructure {

    @XmlElement(name = "HasIncrementalUpdates", defaultValue = "true")
    protected Boolean hasIncrementalUpdates;
    @XmlElement(name = "HasChangeSensitivity", defaultValue = "true")
    protected Boolean hasChangeSensitivity;

    /**
     * Ruft den Wert der hasIncrementalUpdates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasIncrementalUpdates() {
        return hasIncrementalUpdates;
    }

    /**
     * Legt den Wert der hasIncrementalUpdates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasIncrementalUpdates(Boolean value) {
        this.hasIncrementalUpdates = value;
    }

    /**
     * Ruft den Wert der hasChangeSensitivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChangeSensitivity() {
        return hasChangeSensitivity;
    }

    /**
     * Legt den Wert der hasChangeSensitivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChangeSensitivity(Boolean value) {
        this.hasChangeSensitivity = value;
    }

    public CapabilitySubscriptionPolicyStructure withHasIncrementalUpdates(Boolean value) {
        setHasIncrementalUpdates(value);
        return this;
    }

    public CapabilitySubscriptionPolicyStructure withHasChangeSensitivity(Boolean value) {
        setHasChangeSensitivity(value);
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
