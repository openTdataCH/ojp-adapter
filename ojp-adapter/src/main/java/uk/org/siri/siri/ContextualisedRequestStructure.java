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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for General SIRI Request.
 * 
 * <p>Java-Klasse für ContextualisedRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContextualisedRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceRequestContext" type="{http://www.siri.org.uk/siri}ServiceRequestContextStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RequestTimestamp"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}AuthenticatedRequestGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestorEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextualisedRequestStructure", propOrder = {
    "serviceRequestContext",
    "requestTimestamp",
    "accountId",
    "accountKey",
    "address",
    "requestorRef",
    "messageIdentifier",
    "delegatorAddress",
    "delegatorRef"
})
@XmlSeeAlso({
    ServiceRequestStructure.class
})
public abstract class ContextualisedRequestStructure {

    @XmlElement(name = "ServiceRequestContext")
    protected ServiceRequestContextStructure serviceRequestContext;
    @XmlElement(name = "RequestTimestamp", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime requestTimestamp;
    @XmlElement(name = "AccountId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String accountId;
    @XmlElement(name = "AccountKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accountKey;
    @XmlElement(name = "Address")
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(name = "RequestorRef", required = true)
    protected ParticipantRefStructure requestorRef;
    @XmlElement(name = "MessageIdentifier")
    protected MessageQualifierStructure messageIdentifier;
    @XmlElement(name = "DelegatorAddress")
    @XmlSchemaType(name = "anyURI")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;

    /**
     * Ruft den Wert der serviceRequestContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestContextStructure }
     *     
     */
    public ServiceRequestContextStructure getServiceRequestContext() {
        return serviceRequestContext;
    }

    /**
     * Legt den Wert der serviceRequestContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestContextStructure }
     *     
     */
    public void setServiceRequestContext(ServiceRequestContextStructure value) {
        this.serviceRequestContext = value;
    }

    /**
     * Ruft den Wert der requestTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Legt den Wert der requestTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimestamp(ZonedDateTime value) {
        this.requestTimestamp = value;
    }

    /**
     * Ruft den Wert der accountId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Legt den Wert der accountId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Ruft den Wert der accountKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * Legt den Wert der accountKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountKey(String value) {
        this.accountKey = value;
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
     * Ruft den Wert der requestorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getRequestorRef() {
        return requestorRef;
    }

    /**
     * Legt den Wert der requestorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setRequestorRef(ParticipantRefStructure value) {
        this.requestorRef = value;
    }

    /**
     * Ruft den Wert der messageIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Legt den Wert der messageIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setMessageIdentifier(MessageQualifierStructure value) {
        this.messageIdentifier = value;
    }

    /**
     * Ruft den Wert der delegatorAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatorAddress() {
        return delegatorAddress;
    }

    /**
     * Legt den Wert der delegatorAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatorAddress(String value) {
        this.delegatorAddress = value;
    }

    /**
     * Ruft den Wert der delegatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getDelegatorRef() {
        return delegatorRef;
    }

    /**
     * Legt den Wert der delegatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setDelegatorRef(ParticipantRefStructure value) {
        this.delegatorRef = value;
    }

    public ContextualisedRequestStructure withServiceRequestContext(ServiceRequestContextStructure value) {
        setServiceRequestContext(value);
        return this;
    }

    public ContextualisedRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
        return this;
    }

    public ContextualisedRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    public ContextualisedRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    public ContextualisedRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    public ContextualisedRequestStructure withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    public ContextualisedRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    public ContextualisedRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    public ContextualisedRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
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
