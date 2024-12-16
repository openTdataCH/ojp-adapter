//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Unique reference to reponse from producer. May be used to reference request in subsequent interactions. Used for WSDL.
 * 
 * <p>Java-Klasse für ProducerResponseEndpointStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProducerResponseEndpointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProducerResponseEndpointGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProducerResponseEndpointStructure", propOrder = {
    "producerRef",
    "address",
    "responseMessageIdentifier",
    "requestMessageRef"
})
public class ProducerResponseEndpointStructure
    extends ResponseStructure
{

    @XmlElement(name = "ProducerRef")
    protected ParticipantRefStructure producerRef;
    @XmlElement(name = "Address")
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(name = "ResponseMessageIdentifier")
    protected MessageQualifierStructure responseMessageIdentifier;
    @XmlElement(name = "RequestMessageRef")
    protected MessageRefStructure requestMessageRef;

    /**
     * Ruft den Wert der producerRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getProducerRef() {
        return producerRef;
    }

    /**
     * Legt den Wert der producerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setProducerRef(ParticipantRefStructure value) {
        this.producerRef = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der responseMessageIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getResponseMessageIdentifier() {
        return responseMessageIdentifier;
    }

    /**
     * Legt den Wert der responseMessageIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setResponseMessageIdentifier(MessageQualifierStructure value) {
        this.responseMessageIdentifier = value;
    }

    /**
     * Ruft den Wert der requestMessageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageRefStructure }
     *     
     */
    public MessageRefStructure getRequestMessageRef() {
        return requestMessageRef;
    }

    /**
     * Legt den Wert der requestMessageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRefStructure }
     *     
     */
    public void setRequestMessageRef(MessageRefStructure value) {
        this.requestMessageRef = value;
    }

    public ProducerResponseEndpointStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    public ProducerResponseEndpointStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    public ProducerResponseEndpointStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    public ProducerResponseEndpointStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public ProducerResponseEndpointStructure withResponseTimestamp(ZonedDateTime value) {
        setResponseTimestamp(value);
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
