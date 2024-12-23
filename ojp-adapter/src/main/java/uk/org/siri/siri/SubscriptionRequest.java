//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}SubscriptionRequestStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SubscriptionRequest")
public class SubscriptionRequest
    extends SubscriptionRequestStructure
{


    @Override
    public SubscriptionRequest withAbstractFunctionalServiceSubscriptionRequest(AbstractSubscriptionStructure... values) {
        if (values!= null) {
            for (AbstractSubscriptionStructure value: values) {
                getAbstractFunctionalServiceSubscriptionRequest().add(value);
            }
        }
        return this;
    }

    @Override
    public SubscriptionRequest withAbstractFunctionalServiceSubscriptionRequest(Collection<AbstractSubscriptionStructure> values) {
        if (values!= null) {
            getAbstractFunctionalServiceSubscriptionRequest().addAll(values);
        }
        return this;
    }

    @Override
    public SubscriptionRequest withConsumerAddress(String value) {
        setConsumerAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequest withSubscriptionFilterIdentifier(String value) {
        setSubscriptionFilterIdentifier(value);
        return this;
    }

    @Override
    public SubscriptionRequest withSubscriptionContext(SubscriptionContextStructure value) {
        setSubscriptionContext(value);
        return this;
    }

    @Override
    public SubscriptionRequest withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequest withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public SubscriptionRequest withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public SubscriptionRequest withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public SubscriptionRequest withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public SubscriptionRequest withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public SubscriptionRequest withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public SubscriptionRequest withRequestTimestamp(ZonedDateTime value) {
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
