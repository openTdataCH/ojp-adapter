//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.time.Duration;
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
import uk.org.siri.siri.AbstractServiceDeliveryStructure;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.MessageRefStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.SubscriptionFilterRefStructure;
import uk.org.siri.siri.SubscriptionRefStructure;


/**
 * <p>Java-Klasse für OJPLineInformationDeliveryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OJPLineInformationDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OJPLineInformationRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}LineInformationResponseGroup"/&gt;
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
@XmlType(name = "OJPLineInformationDeliveryStructure", propOrder = {
    "ojpLineInformationRequest",
    "lineResult",
    "extensions"
})
public class OJPLineInformationDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "OJPLineInformationRequest")
    protected OJPLineInformationRequestStructure ojpLineInformationRequest;
    @XmlElement(name = "LineResult")
    protected List<LineResultStructure> lineResult;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der ojpLineInformationRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OJPLineInformationRequestStructure }
     *     
     */
    public OJPLineInformationRequestStructure getOJPLineInformationRequest() {
        return ojpLineInformationRequest;
    }

    /**
     * Legt den Wert der ojpLineInformationRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OJPLineInformationRequestStructure }
     *     
     */
    public void setOJPLineInformationRequest(OJPLineInformationRequestStructure value) {
        this.ojpLineInformationRequest = value;
    }

    /**
     * Gets the value of the lineResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lineResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineResultStructure }
     * 
     * 
     */
    public List<LineResultStructure> getLineResult() {
        if (lineResult == null) {
            lineResult = new ArrayList<LineResultStructure>();
        }
        return this.lineResult;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public OJPLineInformationDeliveryStructure withOJPLineInformationRequest(OJPLineInformationRequestStructure value) {
        setOJPLineInformationRequest(value);
        return this;
    }

    public OJPLineInformationDeliveryStructure withLineResult(LineResultStructure... values) {
        if (values!= null) {
            for (LineResultStructure value: values) {
                getLineResult().add(value);
            }
        }
        return this;
    }

    public OJPLineInformationDeliveryStructure withLineResult(Collection<LineResultStructure> values) {
        if (values!= null) {
            getLineResult().addAll(values);
        }
        return this;
    }

    public OJPLineInformationDeliveryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withSubscriptionRef(SubscriptionRefStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public OJPLineInformationDeliveryStructure withResponseTimestamp(ZonedDateTime value) {
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
