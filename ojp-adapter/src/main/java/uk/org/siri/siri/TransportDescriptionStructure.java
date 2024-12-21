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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for implementation structure.
 * 
 * <p>Java-Klasse für TransportDescriptionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransportDescriptionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommunicationsTransportMethod" type="{http://www.siri.org.uk/siri}CommunicationsTransportMethodEnumeration"/&gt;
 *         &lt;element name="CompressionMethod" type="{http://www.siri.org.uk/siri}CompressionMethodEnumeration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDescriptionStructure", propOrder = {
    "communicationsTransportMethod",
    "compressionMethod"
})
public class TransportDescriptionStructure {

    @XmlElement(name = "CommunicationsTransportMethod", required = true, defaultValue = "httpPost")
    @XmlSchemaType(name = "NMTOKEN")
    protected CommunicationsTransportMethodEnumeration communicationsTransportMethod;
    @XmlElement(name = "CompressionMethod", required = true, defaultValue = "none")
    @XmlSchemaType(name = "NMTOKEN")
    protected CompressionMethodEnumeration compressionMethod;

    /**
     * Ruft den Wert der communicationsTransportMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public CommunicationsTransportMethodEnumeration getCommunicationsTransportMethod() {
        return communicationsTransportMethod;
    }

    /**
     * Legt den Wert der communicationsTransportMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public void setCommunicationsTransportMethod(CommunicationsTransportMethodEnumeration value) {
        this.communicationsTransportMethod = value;
    }

    /**
     * Ruft den Wert der compressionMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public CompressionMethodEnumeration getCompressionMethod() {
        return compressionMethod;
    }

    /**
     * Legt den Wert der compressionMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public void setCompressionMethod(CompressionMethodEnumeration value) {
        this.compressionMethod = value;
    }

    public TransportDescriptionStructure withCommunicationsTransportMethod(CommunicationsTransportMethodEnumeration value) {
        setCommunicationsTransportMethod(value);
        return this;
    }

    public TransportDescriptionStructure withCompressionMethod(CompressionMethodEnumeration value) {
        setCompressionMethod(value);
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
