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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Notification to terminate a subscription or subscriptions.
 *
 * <p>Java-Klasse für SubscriptionTerminatedNotificationStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SubscriptionTerminatedNotificationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ErrrorCondition" type="{http://www.siri.org.uk/siri}ErrorConditionStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionTerminatedNotificationStructure", propOrder = {
    "subscriptionIdentifierResourcePropertyGroup",
    "errrorCondition",
    "extensions"
})
public class SubscriptionTerminatedNotificationStructure
    extends ProducerResponseStructure {

    @XmlElements({
        @XmlElement(name = "SubscriberRef", required = true, type = ParticipantRefStructure.class),
        @XmlElement(name = "SubscriptionFilterRef", required = true, type = SubscriptionFilterRefStructure.class),
        @XmlElement(name = "SubscriptionRef", required = true, type = SubscriptionRefStructure.class)
    })
    protected List<Object> subscriptionIdentifierResourcePropertyGroup;
    @XmlElement(name = "ErrrorCondition")
    protected ErrorConditionStructure errrorCondition;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the subscriptionIdentifierResourcePropertyGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the subscriptionIdentifierResourcePropertyGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionIdentifierResourcePropertyGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ParticipantRefStructure } {@link SubscriptionFilterRefStructure } {@link SubscriptionRefStructure }
     */
    public List<Object> getSubscriptionIdentifierResourcePropertyGroup() {
        if (subscriptionIdentifierResourcePropertyGroup == null) {
            subscriptionIdentifierResourcePropertyGroup = new ArrayList<Object>();
        }
        return this.subscriptionIdentifierResourcePropertyGroup;
    }

    /**
     * Ruft den Wert der errrorCondition-Eigenschaft ab.
     *
     * @return possible object is {@link ErrorConditionStructure }
     */
    public ErrorConditionStructure getErrrorCondition() {
        return errrorCondition;
    }

    /**
     * Legt den Wert der errrorCondition-Eigenschaft fest.
     *
     * @param value allowed object is {@link ErrorConditionStructure }
     */
    public void setErrrorCondition(ErrorConditionStructure value) {
        this.errrorCondition = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public SubscriptionTerminatedNotificationStructure withSubscriptionIdentifierResourcePropertyGroup(Object... values) {
        if (values != null) {
            for (Object value : values) {
                getSubscriptionIdentifierResourcePropertyGroup().add(value);
            }
        }
        return this;
    }

    public SubscriptionTerminatedNotificationStructure withSubscriptionIdentifierResourcePropertyGroup(Collection<Object> values) {
        if (values != null) {
            getSubscriptionIdentifierResourcePropertyGroup().addAll(values);
        }
        return this;
    }

    public SubscriptionTerminatedNotificationStructure withErrrorCondition(ErrorConditionStructure value) {
        setErrrorCondition(value);
        return this;
    }

    public SubscriptionTerminatedNotificationStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public SubscriptionTerminatedNotificationStructure withResponseTimestamp(ZonedDateTime value) {
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
