//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Body of Terminate Subscription Request content. Used in WSDL.
 *
 * <p>Java-Klasse für TerminateSubscriptionRequestBodyStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TerminateSubscriptionRequestBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminateSubscriptionTopicGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionRequestBodyStructure", propOrder = {
    "subscriberRef",
    "all",
    "subscriptionRef"
})
public class TerminateSubscriptionRequestBodyStructure {

    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "All")
    protected String all;
    @XmlElement(name = "SubscriptionRef")
    protected List<SubscriptionQualifierStructure> subscriptionRef;

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
     * Ruft den Wert der all-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAll() {
        return all;
    }

    /**
     * Legt den Wert der all-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAll(String value) {
        this.all = value;
    }

    /**
     * Gets the value of the subscriptionRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the subscriptionRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SubscriptionQualifierStructure }
     */
    public List<SubscriptionQualifierStructure> getSubscriptionRef() {
        if (subscriptionRef == null) {
            subscriptionRef = new ArrayList<SubscriptionQualifierStructure>();
        }
        return this.subscriptionRef;
    }

    public TerminateSubscriptionRequestBodyStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    public TerminateSubscriptionRequestBodyStructure withAll(String value) {
        setAll(value);
        return this;
    }

    public TerminateSubscriptionRequestBodyStructure withSubscriptionRef(SubscriptionQualifierStructure... values) {
        if (values != null) {
            for (SubscriptionQualifierStructure value : values) {
                getSubscriptionRef().add(value);
            }
        }
        return this;
    }

    public TerminateSubscriptionRequestBodyStructure withSubscriptionRef(Collection<SubscriptionQualifierStructure> values) {
        if (values != null) {
            getSubscriptionRef().addAll(values);
        }
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
