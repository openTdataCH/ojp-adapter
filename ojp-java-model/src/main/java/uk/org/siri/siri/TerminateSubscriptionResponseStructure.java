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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Response to a request to terminate a subscription or subscriptions.
 *
 * <p>Java-Klasse für TerminateSubscriptionResponseStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TerminateSubscriptionResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseEndpointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminationStatusGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionResponseStructure", propOrder = {
    "terminationResponseStatus"
})
public class TerminateSubscriptionResponseStructure
    extends ResponseEndpointStructure {

    @XmlElement(name = "TerminationResponseStatus")
    protected List<TerminationResponseStatusStructure> terminationResponseStatus;

    /**
     * Gets the value of the terminationResponseStatus property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the terminationResponseStatus property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminationResponseStatus().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TerminationResponseStatusStructure }
     */
    public List<TerminationResponseStatusStructure> getTerminationResponseStatus() {
        if (terminationResponseStatus == null) {
            terminationResponseStatus = new ArrayList<TerminationResponseStatusStructure>();
        }
        return this.terminationResponseStatus;
    }

    public TerminateSubscriptionResponseStructure withTerminationResponseStatus(TerminationResponseStatusStructure... values) {
        if (values != null) {
            for (TerminationResponseStatusStructure value : values) {
                getTerminationResponseStatus().add(value);
            }
        }
        return this;
    }

    public TerminateSubscriptionResponseStructure withTerminationResponseStatus(Collection<TerminationResponseStatusStructure> values) {
        if (values != null) {
            getTerminationResponseStatus().addAll(values);
        }
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withResponderRef(ParticipantRefStructure value) {
        setResponderRef(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public TerminateSubscriptionResponseStructure withResponseTimestamp(ZonedDateTime value) {
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
