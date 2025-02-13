//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.time.Duration;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Type for Response Status.
 *
 * <p>Java-Klasse für StatusResponseStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StatusResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Status" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.siri.org.uk/siri}ServiceDeliveryErrorConditionStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SuccessInfoGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusResponseStructure", propOrder = {
    "requestMessageRef",
    "subscriberRef",
    "subscriptionFilterRef",
    "subscriptionRef",
    "status",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle"
})
public class StatusResponseStructure
    extends ResponseStructure {

    @XmlElement(name = "RequestMessageRef")
    protected MessageRefStructure requestMessageRef;
    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "SubscriptionFilterRef")
    protected SubscriptionFilterRefStructure subscriptionFilterRef;
    @XmlElement(name = "SubscriptionRef")
    protected SubscriptionRefStructure subscriptionRef;
    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected ServiceDeliveryErrorConditionStructure errorCondition;
    @XmlElement(name = "ValidUntil", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime validUntil;
    @XmlElement(name = "ShortestPossibleCycle", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration shortestPossibleCycle;

    /**
     * Ruft den Wert der requestMessageRef-Eigenschaft ab.
     *
     * @return possible object is {@link MessageRefStructure }
     */
    public MessageRefStructure getRequestMessageRef() {
        return requestMessageRef;
    }

    /**
     * Legt den Wert der requestMessageRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link MessageRefStructure }
     */
    public void setRequestMessageRef(MessageRefStructure value) {
        this.requestMessageRef = value;
    }

    /**
     * Ruft den Wert der subscriberRef-Eigenschaft ab.
     *
     * @return possible object is {@link ParticipantRefStructure }
     */
    public ParticipantRefStructure getSubscriberRef() {
        return subscriberRef;
    }

    /**
     * Legt den Wert der subscriberRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link ParticipantRefStructure }
     */
    public void setSubscriberRef(ParticipantRefStructure value) {
        this.subscriberRef = value;
    }

    /**
     * Ruft den Wert der subscriptionFilterRef-Eigenschaft ab.
     *
     * @return possible object is {@link SubscriptionFilterRefStructure }
     */
    public SubscriptionFilterRefStructure getSubscriptionFilterRef() {
        return subscriptionFilterRef;
    }

    /**
     * Legt den Wert der subscriptionFilterRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SubscriptionFilterRefStructure }
     */
    public void setSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        this.subscriptionFilterRef = value;
    }

    /**
     * Ruft den Wert der subscriptionRef-Eigenschaft ab.
     *
     * @return possible object is {@link SubscriptionRefStructure }
     */
    public SubscriptionRefStructure getSubscriptionRef() {
        return subscriptionRef;
    }

    /**
     * Legt den Wert der subscriptionRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SubscriptionRefStructure }
     */
    public void setSubscriptionRef(SubscriptionRefStructure value) {
        this.subscriptionRef = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der errorCondition-Eigenschaft ab.
     *
     * @return possible object is {@link ServiceDeliveryErrorConditionStructure }
     */
    public ServiceDeliveryErrorConditionStructure getErrorCondition() {
        return errorCondition;
    }

    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     *
     * @param value allowed object is {@link ServiceDeliveryErrorConditionStructure }
     */
    public void setErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        this.errorCondition = value;
    }

    /**
     * Ruft den Wert der validUntil-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getValidUntil() {
        return validUntil;
    }

    /**
     * Legt den Wert der validUntil-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setValidUntil(ZonedDateTime value) {
        this.validUntil = value;
    }

    /**
     * Ruft den Wert der shortestPossibleCycle-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Legt den Wert der shortestPossibleCycle-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    public StatusResponseStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    public StatusResponseStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    public StatusResponseStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    public StatusResponseStructure withSubscriptionRef(SubscriptionRefStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    public StatusResponseStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public StatusResponseStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    public StatusResponseStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    public StatusResponseStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public StatusResponseStructure withResponseTimestamp(ZonedDateTime value) {
        setResponseTimestamp(value);
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
