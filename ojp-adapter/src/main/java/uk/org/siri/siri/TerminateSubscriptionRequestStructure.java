//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for request to terminate a subscription or subscriptions.
 * 
 * <p>Java-Klasse für TerminateSubscriptionRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TerminateSubscriptionRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AuthenticatedRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestorEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminateSubscriptionTopicGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionRequestStructure", propOrder = {
    "address",
    "requestorRef",
    "messageIdentifier",
    "delegatorAddress",
    "delegatorRef",
    "subscriberRef",
    "all",
    "subscriptionRef",
    "extensions"
})
public class TerminateSubscriptionRequestStructure
    extends AuthenticatedRequestStructure
{

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
    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "All")
    protected String all;
    @XmlElement(name = "SubscriptionRef")
    protected List<SubscriptionQualifierStructure> subscriptionRef;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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

    /**
     * Ruft den Wert der subscriberRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getSubscriberRef() {
        return subscriberRef;
    }

    /**
     * Legt den Wert der subscriberRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setSubscriberRef(ParticipantRefStructure value) {
        this.subscriberRef = value;
    }

    /**
     * Ruft den Wert der all-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAll() {
        return all;
    }

    /**
     * Legt den Wert der all-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAll(String value) {
        this.all = value;
    }

    /**
     * Gets the value of the subscriptionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionQualifierStructure }
     * 
     * 
     */
    public List<SubscriptionQualifierStructure> getSubscriptionRef() {
        if (subscriptionRef == null) {
            subscriptionRef = new ArrayList<SubscriptionQualifierStructure>();
        }
        return this.subscriptionRef;
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

    public TerminateSubscriptionRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    public TerminateSubscriptionRequestStructure withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    public TerminateSubscriptionRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    public TerminateSubscriptionRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    public TerminateSubscriptionRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    public TerminateSubscriptionRequestStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    public TerminateSubscriptionRequestStructure withAll(String value) {
        setAll(value);
        return this;
    }

    public TerminateSubscriptionRequestStructure withSubscriptionRef(SubscriptionQualifierStructure... values) {
        if (values!= null) {
            for (SubscriptionQualifierStructure value: values) {
                getSubscriptionRef().add(value);
            }
        }
        return this;
    }

    public TerminateSubscriptionRequestStructure withSubscriptionRef(Collection<SubscriptionQualifierStructure> values) {
        if (values!= null) {
            getSubscriptionRef().addAll(values);
        }
        return this;
    }

    public TerminateSubscriptionRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TerminateSubscriptionRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public TerminateSubscriptionRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public TerminateSubscriptionRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
