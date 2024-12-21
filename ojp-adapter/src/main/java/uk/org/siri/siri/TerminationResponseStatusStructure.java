//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import de.vdv.ojp.release2.model.OJPErrorStructure;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for Status of termination response.
 * 
 * <p>Java-Klasse für TerminationResponseStatusStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TerminationResponseStatusStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ResponseTimestamp" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Status" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCondition" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriberError"/&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/&gt;
 *                     &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationResponseStatusStructure", propOrder = {
    "responseTimestamp",
    "requestMessageRef",
    "subscriberRef",
    "subscriptionFilterRef",
    "subscriptionRef",
    "status",
    "errorCondition"
})
public class TerminationResponseStatusStructure {

    @XmlElement(name = "ResponseTimestamp", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime responseTimestamp;
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
    protected TerminationResponseStatusStructure.ErrorCondition errorCondition;

    /**
     * Ruft den Wert der responseTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getResponseTimestamp() {
        return responseTimestamp;
    }

    /**
     * Legt den Wert der responseTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTimestamp(ZonedDateTime value) {
        this.responseTimestamp = value;
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
     *     {@link TerminationResponseStatusStructure.ErrorCondition }
     *     
     */
    public TerminationResponseStatusStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationResponseStatusStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(TerminationResponseStatusStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    public TerminationResponseStatusStructure withResponseTimestamp(ZonedDateTime value) {
        setResponseTimestamp(value);
        return this;
    }

    public TerminationResponseStatusStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    public TerminationResponseStatusStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    public TerminationResponseStatusStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    public TerminationResponseStatusStructure withSubscriptionRef(SubscriptionRefStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    public TerminationResponseStatusStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public TerminationResponseStatusStructure withErrorCondition(TerminationResponseStatusStructure.ErrorCondition value) {
        setErrorCondition(value);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriberError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "capabilityNotSupportedError",
        "unknownSubscriberError",
        "unknownSubscriptionError",
        "otherError",
        "description"
    })
    public static class ErrorCondition {

        @XmlElement(name = "CapabilityNotSupportedError")
        protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
        @XmlElement(name = "UnknownSubscriberError")
        protected UnknownSubscriberErrorStructure unknownSubscriberError;
        @XmlElement(name = "UnknownSubscriptionError")
        protected UnknownSubscriptionErrorStructure unknownSubscriptionError;
        @XmlElementRef(name = "OtherError", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends OtherErrorStructure> otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

        /**
         * Ruft den Wert der capabilityNotSupportedError-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CapabilityNotSupportedErrorStructure }
         *     
         */
        public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
            return capabilityNotSupportedError;
        }

        /**
         * Legt den Wert der capabilityNotSupportedError-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CapabilityNotSupportedErrorStructure }
         *     
         */
        public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
            this.capabilityNotSupportedError = value;
        }

        /**
         * Ruft den Wert der unknownSubscriberError-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UnknownSubscriberErrorStructure }
         *     
         */
        public UnknownSubscriberErrorStructure getUnknownSubscriberError() {
            return unknownSubscriberError;
        }

        /**
         * Legt den Wert der unknownSubscriberError-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UnknownSubscriberErrorStructure }
         *     
         */
        public void setUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
            this.unknownSubscriberError = value;
        }

        /**
         * Ruft den Wert der unknownSubscriptionError-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UnknownSubscriptionErrorStructure }
         *     
         */
        public UnknownSubscriptionErrorStructure getUnknownSubscriptionError() {
            return unknownSubscriptionError;
        }

        /**
         * Legt den Wert der unknownSubscriptionError-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UnknownSubscriptionErrorStructure }
         *     
         */
        public void setUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
            this.unknownSubscriptionError = value;
        }

        /**
         * Ruft den Wert der otherError-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
         *     {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}
         *     
         */
        public JAXBElement<? extends OtherErrorStructure> getOtherError() {
            return otherError;
        }

        /**
         * Legt den Wert der otherError-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
         *     {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}
         *     
         */
        public void setOtherError(JAXBElement<? extends OtherErrorStructure> value) {
            this.otherError = value;
        }

        /**
         * Ruft den Wert der description-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ErrorDescriptionStructure }
         *     
         */
        public ErrorDescriptionStructure getDescription() {
            return description;
        }

        /**
         * Legt den Wert der description-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorDescriptionStructure }
         *     
         */
        public void setDescription(ErrorDescriptionStructure value) {
            this.description = value;
        }

        public TerminationResponseStatusStructure.ErrorCondition withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
            setCapabilityNotSupportedError(value);
            return this;
        }

        public TerminationResponseStatusStructure.ErrorCondition withUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
            setUnknownSubscriberError(value);
            return this;
        }

        public TerminationResponseStatusStructure.ErrorCondition withUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
            setUnknownSubscriptionError(value);
            return this;
        }

        public TerminationResponseStatusStructure.ErrorCondition withOtherError(JAXBElement<? extends OtherErrorStructure> value) {
            setOtherError(value);
            return this;
        }

        public TerminationResponseStatusStructure.ErrorCondition withDescription(ErrorDescriptionStructure value) {
            setDescription(value);
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

}
