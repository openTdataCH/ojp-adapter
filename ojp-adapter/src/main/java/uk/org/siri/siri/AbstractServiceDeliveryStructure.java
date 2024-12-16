//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.Duration;
import java.time.ZonedDateTime;
import de.vdv.ojp.release2.model.OJPAvailabilityDeliveryStructure;
import de.vdv.ojp.release2.model.OJPExchangePointsDeliveryStructure;
import de.vdv.ojp.release2.model.OJPFareDeliveryStructure;
import de.vdv.ojp.release2.model.OJPLineInformationDeliveryStructure;
import de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.release2.model.OJPMultiPointTripDeliveryStructure;
import de.vdv.ojp.release2.model.OJPStatusDeliveryStructure;
import de.vdv.ojp.release2.model.OJPStopEventDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripChangeDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripRefineDeliveryStructure;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for Common elementd for a SIRI service delivery of the Form xxxDelivery.
 * 
 * <p>Java-Klasse für AbstractServiceDeliveryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractServiceDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryStatusGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryDefaultGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServiceDeliveryStructure", propOrder = {
    "requestMessageRef",
    "subscriberRef",
    "subscriptionFilterRef",
    "subscriptionRef",
    "delegatorAddress",
    "delegatorRef",
    "status",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle",
    "defaultLanguage"
})
@XmlSeeAlso({
    OJPFareDeliveryStructure.class,
    OJPLocationInformationDeliveryStructure.class,
    OJPExchangePointsDeliveryStructure.class,
    OJPStopEventDeliveryStructure.class,
    OJPTripInfoDeliveryStructure.class,
    OJPTripDeliveryStructure.class,
    OJPMultiPointTripDeliveryStructure.class,
    OJPStatusDeliveryStructure.class,
    OJPTripRefineDeliveryStructure.class,
    OJPAvailabilityDeliveryStructure.class,
    OJPLineInformationDeliveryStructure.class,
    OJPTripChangeDeliveryStructure.class
})
public abstract class AbstractServiceDeliveryStructure
    extends ResponseStructure
{

    @XmlElement(name = "RequestMessageRef")
    protected MessageRefStructure requestMessageRef;
    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "SubscriptionFilterRef")
    protected SubscriptionFilterRefStructure subscriptionFilterRef;
    @XmlElement(name = "SubscriptionRef")
    protected SubscriptionRefStructure subscriptionRef;
    @XmlElement(name = "DelegatorAddress")
    @XmlSchemaType(name = "anyURI")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;
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
    @XmlElement(name = "DefaultLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String defaultLanguage;

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
     * Ruft den Wert der subscriptionFilterRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionFilterRefStructure }
     *     
     */
    public SubscriptionFilterRefStructure getSubscriptionFilterRef() {
        return subscriptionFilterRef;
    }

    /**
     * Legt den Wert der subscriptionFilterRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionFilterRefStructure }
     *     
     */
    public void setSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        this.subscriptionFilterRef = value;
    }

    /**
     * Ruft den Wert der subscriptionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRefStructure }
     *     
     */
    public SubscriptionRefStructure getSubscriptionRef() {
        return subscriptionRef;
    }

    /**
     * Legt den Wert der subscriptionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRefStructure }
     *     
     */
    public void setSubscriptionRef(SubscriptionRefStructure value) {
        this.subscriptionRef = value;
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
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der errorCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryErrorConditionStructure }
     *     
     */
    public ServiceDeliveryErrorConditionStructure getErrorCondition() {
        return errorCondition;
    }

    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryErrorConditionStructure }
     *     
     */
    public void setErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        this.errorCondition = value;
    }

    /**
     * Ruft den Wert der validUntil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getValidUntil() {
        return validUntil;
    }

    /**
     * Legt den Wert der validUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidUntil(ZonedDateTime value) {
        this.validUntil = value;
    }

    /**
     * Ruft den Wert der shortestPossibleCycle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Legt den Wert der shortestPossibleCycle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    /**
     * Ruft den Wert der defaultLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Legt den Wert der defaultLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    public AbstractServiceDeliveryStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withSubscriptionRef(SubscriptionRefStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    public AbstractServiceDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public AbstractServiceDeliveryStructure withResponseTimestamp(ZonedDateTime value) {
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
