//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AbstractServiceDeliveryStructure;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.MessageRefStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.SubscriptionFilterRefStructure;
import uk.org.siri.siri.SubscriptionRefStructure;


/**
 * <p>Java-Klasse für OJPStopEventDeliveryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OJPStopEventDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OJPStopEventRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceResponseContextGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventResponseGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPStopEventDeliveryStructure", propOrder = {
    "rest"
})
public class OJPStopEventDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "OJPStopEventRequest", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DataFrameRef", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CalcTime", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ErrorCondition", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StopEventResponseContext", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StopEventResult", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Extensions", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "ErrorCondition" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 77 von file:/C:/Users/u210875/IdeaProjects/ojp-java-model/src/main/resources/xsd/ojp2/OJP/OJP_RequestSupport.xsd
     * Zeile 417 von file:/C:/Users/u210875/IdeaProjects/ojp-java-model/src/main/resources/xsd/ojp2/siri/xsd/siri/siri_requests.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStopEventRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseContextStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopEventResultStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link DataFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtensionsStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

    public OJPStopEventDeliveryStructure withRest(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getRest().add(value);
            }
        }
        return this;
    }

    public OJPStopEventDeliveryStructure withRest(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getRest().addAll(values);
        }
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withSubscriptionRef(SubscriptionRefStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public OJPStopEventDeliveryStructure withResponseTimestamp(ZonedDateTime value) {
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
