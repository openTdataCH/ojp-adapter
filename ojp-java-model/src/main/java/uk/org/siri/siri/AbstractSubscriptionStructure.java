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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Type for SIRI Service subscriptions.
 *
 * <p>Java-Klasse für AbstractSubscriptionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbstractSubscriptionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentityGroup"/&gt;
 *         &lt;element name="InitialTerminationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SubscriptionRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubscriptionStructure", propOrder = {
    "subscriberRef",
    "subscriptionIdentifier",
    "initialTerminationTime",
    "subscriptionRenewal"
})
public abstract class AbstractSubscriptionStructure {

    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "SubscriptionIdentifier", required = true)
    protected SubscriptionQualifierStructure subscriptionIdentifier;
    @XmlElement(name = "InitialTerminationTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime initialTerminationTime;
    @XmlElement(name = "SubscriptionRenewal")
    protected Boolean subscriptionRenewal;

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
     * Ruft den Wert der subscriptionIdentifier-Eigenschaft ab.
     *
     * @return possible object is {@link SubscriptionQualifierStructure }
     */
    public SubscriptionQualifierStructure getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    /**
     * Legt den Wert der subscriptionIdentifier-Eigenschaft fest.
     *
     * @param value allowed object is {@link SubscriptionQualifierStructure }
     */
    public void setSubscriptionIdentifier(SubscriptionQualifierStructure value) {
        this.subscriptionIdentifier = value;
    }

    /**
     * Ruft den Wert der initialTerminationTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getInitialTerminationTime() {
        return initialTerminationTime;
    }

    /**
     * Legt den Wert der initialTerminationTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setInitialTerminationTime(ZonedDateTime value) {
        this.initialTerminationTime = value;
    }

    /**
     * Ruft den Wert der subscriptionRenewal-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isSubscriptionRenewal() {
        return subscriptionRenewal;
    }

    /**
     * Legt den Wert der subscriptionRenewal-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setSubscriptionRenewal(Boolean value) {
        this.subscriptionRenewal = value;
    }

    public AbstractSubscriptionStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    public AbstractSubscriptionStructure withSubscriptionIdentifier(SubscriptionQualifierStructure value) {
        setSubscriptionIdentifier(value);
        return this;
    }

    public AbstractSubscriptionStructure withInitialTerminationTime(ZonedDateTime value) {
        setInitialTerminationTime(value);
        return this;
    }

    public AbstractSubscriptionStructure withSubscriptionRenewal(Boolean value) {
        setSubscriptionRenewal(value);
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
