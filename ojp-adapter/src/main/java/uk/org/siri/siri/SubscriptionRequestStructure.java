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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for SIRI Subscription Request.
 * 
 * <p>Java-Klasse für SubscriptionRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceSubscriptionRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionRequestStructure", propOrder = {
    "abstractFunctionalServiceSubscriptionRequest"
})
@XmlSeeAlso({
    SubscriptionRequest.class
})
public class SubscriptionRequestStructure
    extends AbstractSubscriptionRequestStructure
{

    @XmlElement(name = "AbstractFunctionalServiceSubscriptionRequest", required = true)
    protected List<AbstractSubscriptionStructure> abstractFunctionalServiceSubscriptionRequest;

    /**
     * Gets the value of the abstractFunctionalServiceSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractSubscriptionStructure }
     * 
     * 
     */
    public List<AbstractSubscriptionStructure> getAbstractFunctionalServiceSubscriptionRequest() {
        if (abstractFunctionalServiceSubscriptionRequest == null) {
            abstractFunctionalServiceSubscriptionRequest = new ArrayList<AbstractSubscriptionStructure>();
        }
        return this.abstractFunctionalServiceSubscriptionRequest;
    }

    public SubscriptionRequestStructure withAbstractFunctionalServiceSubscriptionRequest(AbstractSubscriptionStructure... values) {
        if (values!= null) {
            for (AbstractSubscriptionStructure value: values) {
                getAbstractFunctionalServiceSubscriptionRequest().add(value);
            }
        }
        return this;
    }

    public SubscriptionRequestStructure withAbstractFunctionalServiceSubscriptionRequest(Collection<AbstractSubscriptionStructure> values) {
        if (values!= null) {
            getAbstractFunctionalServiceSubscriptionRequest().addAll(values);
        }
        return this;
    }

    @Override
    public SubscriptionRequestStructure withConsumerAddress(String value) {
        setConsumerAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withSubscriptionFilterIdentifier(String value) {
        setSubscriptionFilterIdentifier(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withSubscriptionContext(SubscriptionContextStructure value) {
        setSubscriptionContext(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public SubscriptionRequestStructure withRequestTimestamp(ZonedDateTime value) {
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
