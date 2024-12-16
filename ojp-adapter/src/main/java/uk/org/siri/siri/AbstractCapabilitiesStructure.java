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
 * Type for Capabilities of StopMonitopring Service.
 * 
 * <p>Java-Klasse für AbstractCapabilitiesStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCapabilitiesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeneralInteraction" type="{http://www.siri.org.uk/siri}CapabilityGeneralInteractionStructure" minOccurs="0"/&gt;
 *         &lt;element name="TransportDescription" type="{http://www.siri.org.uk/siri}TransportDescriptionStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCapabilitiesStructure", propOrder = {
    "generalInteraction",
    "transportDescription"
})
public class AbstractCapabilitiesStructure {

    @XmlElement(name = "GeneralInteraction")
    protected CapabilityGeneralInteractionStructure generalInteraction;
    @XmlElement(name = "TransportDescription")
    protected TransportDescriptionStructure transportDescription;

    /**
     * Ruft den Wert der generalInteraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public CapabilityGeneralInteractionStructure getGeneralInteraction() {
        return generalInteraction;
    }

    /**
     * Legt den Wert der generalInteraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public void setGeneralInteraction(CapabilityGeneralInteractionStructure value) {
        this.generalInteraction = value;
    }

    /**
     * Ruft den Wert der transportDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public TransportDescriptionStructure getTransportDescription() {
        return transportDescription;
    }

    /**
     * Legt den Wert der transportDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public void setTransportDescription(TransportDescriptionStructure value) {
        this.transportDescription = value;
    }

    public AbstractCapabilitiesStructure withGeneralInteraction(CapabilityGeneralInteractionStructure value) {
        setGeneralInteraction(value);
        return this;
    }

    public AbstractCapabilitiesStructure withTransportDescription(TransportDescriptionStructure value) {
        setTransportDescription(value);
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
