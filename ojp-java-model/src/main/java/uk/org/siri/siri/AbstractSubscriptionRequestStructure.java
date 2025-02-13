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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for COmmon Subscription Request.
 *
 * <p>Java-Klasse für AbstractSubscriptionRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbstractSubscriptionRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriberEndpointGroup"/&gt;
 *         &lt;element name="SubscriptionContext" type="{http://www.siri.org.uk/siri}SubscriptionContextStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubscriptionRequestStructure", propOrder = {
    "consumerAddress",
    "subscriptionFilterIdentifier",
    "subscriptionContext"
})
@XmlSeeAlso({
    SubscriptionRequestStructure.class
})
public abstract class AbstractSubscriptionRequestStructure
    extends RequestStructure {

    @XmlElement(name = "ConsumerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String consumerAddress;
    @XmlElement(name = "SubscriptionFilterIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String subscriptionFilterIdentifier;
    @XmlElement(name = "SubscriptionContext")
    protected SubscriptionContextStructure subscriptionContext;

    /**
     * Ruft den Wert der consumerAddress-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getConsumerAddress() {
        return consumerAddress;
    }

    /**
     * Legt den Wert der consumerAddress-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setConsumerAddress(String value) {
        this.consumerAddress = value;
    }

    /**
     * Ruft den Wert der subscriptionFilterIdentifier-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getSubscriptionFilterIdentifier() {
        return subscriptionFilterIdentifier;
    }

    /**
     * Legt den Wert der subscriptionFilterIdentifier-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSubscriptionFilterIdentifier(String value) {
        this.subscriptionFilterIdentifier = value;
    }

    /**
     * Ruft den Wert der subscriptionContext-Eigenschaft ab.
     *
     * @return possible object is {@link SubscriptionContextStructure }
     */
    public SubscriptionContextStructure getSubscriptionContext() {
        return subscriptionContext;
    }

    /**
     * Legt den Wert der subscriptionContext-Eigenschaft fest.
     *
     * @param value allowed object is {@link SubscriptionContextStructure }
     */
    public void setSubscriptionContext(SubscriptionContextStructure value) {
        this.subscriptionContext = value;
    }

    public AbstractSubscriptionRequestStructure withConsumerAddress(String value) {
        setConsumerAddress(value);
        return this;
    }

    public AbstractSubscriptionRequestStructure withSubscriptionFilterIdentifier(String value) {
        setSubscriptionFilterIdentifier(value);
        return this;
    }

    public AbstractSubscriptionRequestStructure withSubscriptionContext(SubscriptionContextStructure value) {
        setSubscriptionContext(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public AbstractSubscriptionRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
